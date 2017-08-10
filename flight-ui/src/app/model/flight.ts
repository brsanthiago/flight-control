import { City } from './city';
import { Aircraft } from './aircraft';

export class Flight {
  private number: String;
  private airline: String;
  private aircraft: Aircraft;
  private origin: City;
  private destiny: City;
  private match: Date;
  private arrival: Date;
  private pilot: String;
  private status: String;

  public get $number(): String {
    return this.number;
  }

  public set $number(value: String) {
    this.number = value;
  }

  public get $airline(): String {
    return this.airline;
  }

  public set $airline(value: String) {
    this.airline = value;
  }

  public get $aircraft(): Aircraft {
    return this.aircraft;
  }

  public set $aircraft(value: Aircraft) {
    this.aircraft = value;
  }

  public get $origin(): City {
    return this.origin;
  }

  public set $origin(value: City) {
    this.origin = value;
  }

  public get $destiny(): City {
    return this.destiny;
  }

  public set $destiny(value: City) {
    this.destiny = value;
  }

  public get $match(): Date {
    return this.match;
  }

  public set $match(value: Date) {
    this.match = value;
  }

  public get $arrival(): Date {
    return this.arrival;
  }

  public set $arrival(value: Date) {
    this.arrival = value;
  }

  public get $pilot(): String {
    return this.pilot;
  }

  public set $pilot(value: String) {
    this.pilot = value;
  }

  public get $status(): String {
    return this.status;
  }

  public set $status(value: String) {
    this.status = value;
  }

}
