import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private readonly usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl + `users`);
  }

  public save(user: User | undefined) {
    return this.http.post<User>(this.usersUrl + `adduser`, user);
  }
}
