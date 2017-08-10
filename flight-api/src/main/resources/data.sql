INSERT INTO AIRCRAFT (id, code, name, model) VALUES (1,'PR001', 'EMBRAER RJ 190', 'E190')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (2,'PR002', 'EMBRAER RJ 195', 'E195')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (3,'PR003', 'EMBRAER RJ 170', 'E170')
INSERT INTO AIRCRAFT (id, code, name, model) VALUES (4,'PR004', 'EMBRAER RJ 175', 'E175')

INSERT INTO CITY (id, code, name, country) VALUES (1,'PRS001', 'PARIS', 'FRANCE')
INSERT INTO CITY (id, code, name, country) VALUES (2,'GRU001', 'GUARULHOS', 'BRAZIL')

INSERT INTO FLIGHT (id,number, pilot, aircraft_id, origin_id, destiny_id, airline, status, match, arrival) VALUES (1, 'AZ01', 'BRUNO', 1, 1, 2, 0, 0, '2015-12-17 08:00:00', '2015-12-17 16:00:00')
INSERT INTO FLIGHT (id,number, pilot, aircraft_id, origin_id, destiny_id, airline, status, match, arrival) VALUES (2, 'AZ02', 'Bruno Santiago', 2, 2, 1, 0, 5, '2015-12-17 14:00:00', '2015-12-17 22:00:00')

