import { HttpClient } from '@angular/common/http';
import {Injectable} from "@angular/core";
import 'rxjs/Rx';
import {Observable} from "rxjs/Observable";

@Injectable()
export class TaskService {
  constructor(private http: HttpClient) {

  }

  getTasks(): Observable<any> {
    return this.http.get('/api/tasks').map((response: Response) => response)
    .catch((error:any) => {
      return Observable.throw(error);
    });
  }
}
