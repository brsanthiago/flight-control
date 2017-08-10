package br.com.brsantiago.flightcontrol.controller;

import br.com.brsantiago.flightcontrol.fixture.FlightFixture;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by bruno on 09/08/17.
 */
public class FligthControllerTest extends BaseControllerTest {

    @Test
    public void shouldReturnStatusOkWhenExistFlights() throws Exception {
        mockMvc.perform(get("/api/flight")
                .contentType(contentType))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnNotFoundWhenInvalidUrlApi() throws Exception {
        mockMvc.perform(get("/api/flights")
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldReturnSucceful() throws Exception {
        mockMvc.perform(post("/api/flight/save")
                .contentType(contentType)
                .content(toJson(FlightFixture.getFlight())))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void shouldReturnServerErrorWhenBodyIsNull() throws Exception {
        mockMvc.perform(post("/api/flight/save")
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldReturnServerErrorWhenBodyIsEmpty() throws Exception {
        mockMvc.perform(post("/api/flight/save")
                .contentType(contentType)
                .content(""))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldReturnServerErrorWhenIsInvalidPostUrl() throws Exception {
        mockMvc.perform(post("/api/flight/saves")
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }
}
