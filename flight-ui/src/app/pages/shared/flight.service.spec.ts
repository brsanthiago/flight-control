import { TestBed, inject } from '@angular/core/testing';
import { HttpModule } from '@angular/http';

import { FlightService } from './flight.service';

describe('FlightService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
    { provide: 'localhost:8181/api/flight', useValue: 'http://example.com' },
    FlightService]
    });
  });

  it('should ...', inject([FlightService], (service: FlightService) => {
    expect(service).toBeTruthy();
  }));
});
