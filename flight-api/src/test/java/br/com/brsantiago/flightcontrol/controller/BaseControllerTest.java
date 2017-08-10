package br.com.brsantiago.flightcontrol.controller;

import br.com.brsantiago.flightcontrol.FlightApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import java.nio.charset.Charset;

/**
 * Created by bruno on 09/08/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public abstract class BaseControllerTest {

    protected MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), APPLICATION_JSON.getSubtype(), Charset.forName("UTF8"));
    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    public String toJson(Object object) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
