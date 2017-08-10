import { Flight } from './../../model/flight';
import { Injectable, Pipe, PipeTransform } from '@angular/core';
import * as _ from 'lodash';

@Pipe({
  name: 'searchfilter'
})

@Injectable()
export class SearchFilterPipe implements PipeTransform {
  transform(items: Flight[], filter: any): any {
    if (filter && filter.label && Array.isArray(items)) {
        const filtereds = _.filter(items, ['number']);
        if (!_.isEmpty(filtereds)) {
            return filtereds;
        };

        return items;

    } else {
      return items;
    }
  }
}
