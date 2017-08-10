import { Component, OnInit } from '@angular/core';

import { FlightService } from './../shared/flight.service';
import { Flight } from './../../model/flight';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.sass'],
})
export class FlightListComponent implements OnInit {
  public flights: Flight[] = [];
  constructor(private service: FlightService) {
    this.loadFlights();
  }

  ngOnInit() {
  }

  loadFlights() {
    this.service.findAll().subscribe(data => {
      this.flights = data;
    });
  }
}
