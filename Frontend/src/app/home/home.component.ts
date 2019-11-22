import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ActivatedRoute} from "@angular/router";
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {Inject} from '@angular/core';

//import { ServiceService } from '../Service/service.service';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

data:any={}
user : null ;
password : null;

public API = '//localhost:8080/ILS_HR';   //for test

constructor(private router:Router,
            private route:ActivatedRoute ,
            public dialog: MatDialog,
             private http: HttpClient) { }

    ngOnInit() {

        this.route.params.subscribe(prams=>{
                   this.data = prams
                   console.log(prams)
                 })
       }

      openemployee_add(){
       this.router.navigate(['employee-add',{first:this.data.first}]);
       console.log(this.data); }


    SubmitData(){
      if(this.user == null){
        alert("Please Check field To username");
      }
      else if(this.password == null){
        alert("Please Check field To password");
      }
    else{
     this.http.post(this.API + '/'+this.user +'/' + this.password ,{})
                .subscribe(
                               data => {
                                   console.log('PUT Request is successful', data);
                                   alert("บันทึกสำเร็จ");
                               },
                               error => {
                                   console.log('Error', error);
                               }
                              );
      }
      }

   }



