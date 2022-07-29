import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';

export type Coords = {
  x: string;
  y: string;
  direction: string;
};

@Injectable({
  providedIn: 'root',
})
export class InputService {
  private apiUrl: string = 'http://localhost:8080/rest/mars';

  constructor(private http: HttpClient) {}
  coords: Coords = {
    x: '0',
    y: '0',
    direction: 'N',
  };

  getAll(inputData: string): Observable<string> {
    return this.http.post(
      `${this.apiUrl}/${inputData}`,
      {},
      {
        headers: new HttpHeaders().set('Content-Type', 'application/json'),
        responseType: 'text',
      }
    );
  }
}
