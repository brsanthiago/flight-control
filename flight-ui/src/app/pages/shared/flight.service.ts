import { Injectable } from '@angular/core';

import { Http } from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class FlightService {
  private rootUrl: String = 'http://localhost:8181/api/flight/';

  constructor(private http: Http) {}

  public findAll() {
    return this.http.get(this.rootUrl.toString())
    .map(res => res.json());
  }

}
