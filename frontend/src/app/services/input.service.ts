import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { empty, Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class InputService {
  private apiUrl: string = 'http://localhost:8080/rest/mars';

  constructor(private http: HttpClient) {}

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
