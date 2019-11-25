import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ActivatedRoute} from "@angular/router";
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {Inject} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
//import { ServiceService } from '../Service/service.service';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-employee-master',
  templateUrl: './employee-master.component.html',
  styleUrls: ['./employee-master.component.css']
})
export class EmployeeMasterComponent implements OnInit {

data:any={}
user : null ;
password : null;
prefixnameSelect : '';

public API = '//localhost:8080/ILS_HR';   //for test

constructor(private router:Router,
            private route:ActivatedRoute ,
            public dialog: MatDialog,
             private http: HttpClient,
           ) { }

    ngOnInit() {
        this.route.params.subscribe(prams=>{
                   this.data = prams
                   console.log(prams)
                 });
    }

    openemployee_add(){
       this.router.navigate(['employee-add',{first:this.data.first}]);
       console.log(this.data);
    }

    openemployee_master(){
       this.router.navigate(['employee-master',{first:this.data.first}]);
       console.log(this.data);
    }

}
