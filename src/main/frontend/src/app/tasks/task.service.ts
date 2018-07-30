import { HttpClient } from '@angular/common/http';
import {EventEmitter, Injectable} from "@angular/core";
import { throwError } from 'rxjs';
import 'rxjs/Rx';
import {Observable} from "rxjs/Observable";
import {Task} from './task.model';

@Injectable()
export class TaskService {

  onTaskAdded = new EventEmitter<Task>();
  constructor(private http: HttpClient) {

  }

  getTasks(): Observable<any> {
    return this.http.get('/api/tasks').map((response: Response) => response);
  }

  saveTask(task: Task, checked: boolean) {
    task.completed = checked;
    return this.http.post('/api/tasks/save', task).map((res: Response) => res);
  }

  addTask(task: Task) {
    return this.http.post('/api/tasks/save', task).map((res: Response) => res)
    .catch(this.handleError);
  }

  handleError(error: Response) {
    if (error.status == 500) {
      // this.router.navigate(['/login']);
    } else {
      return throwError(error);
    }
  }
}
