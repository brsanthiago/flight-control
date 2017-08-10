import {Route} from '@angular/router';
import { FlightListComponent } from './../flight-list/flight-list.component';


export const MODULE_ROUTES = [
  {path: '', component:  FlightListComponent, pathMatch: 'full'}
];

export const MODULE_COMPONENTS = [FlightListComponent];

