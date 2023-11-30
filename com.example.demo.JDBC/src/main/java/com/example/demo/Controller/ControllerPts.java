package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.DaoPts;
import com.example.demo.Model.CreateModel;
import com.example.demo.Model.Response;
@CrossOrigin("*")
@RestController
@RequestMapping("/page")


public class ControllerPts {
		@Autowired
		private DaoPts dao;
		@PostMapping("/create")
		public ResponseEntity<Response>newstudent(@RequestBody CreateModel datas){
			return ResponseEntity.ok(dao.newstudent(datas));
		}
	}



