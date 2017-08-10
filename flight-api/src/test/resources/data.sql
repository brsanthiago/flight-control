INSERT INTO AIRCRAFT (id, code, name, model) VALUES (5,'PR005', 'EMBRAER RJ 190', 'E190')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (6,'PR006', 'EMBRAER RJ 195', 'E195')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (7,'PR007', 'EMBRAER RJ 170', 'E170')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (8,'PR008', 'EMBRAER RJ 175', 'E175')

INSERT INTO CITY (id, code, name, country) VALUES (3,'PRS002', 'PARIS', 'FRANCE')
INSERT INTO CITY (id, code, name, country) VALUES (4,'GRU002', 'GUARULHOS', 'BRAZIL')

INSERT INTO FLIGHT (id,number, pilot, aircraft_id, origin_id, destiny_id, airline, status, match, arrival) VALUES (3, 'AZ03', 'BRUNO', 7, 3, 3, 0, 0, '2015-12-17 08:00:00', '2015-12-17 16:00:00')
INSERT INTO FLIGHT (id,number, pilot, aircraft_id, origin_id, destiny_id, airline, status, match, arrival) VALUES (4, 'AZ04', 'Bruno Santiago', 8, 4, 4, 0, 5, '2015-12-17 14:00:00', '2015-12-17 22:00:00')

