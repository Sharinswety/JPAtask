package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Model.CreateModel;
import com.example.demo.Model.Response;

@Service

public interface ServicePts {
	public Response newstudent(CreateModel datas);



}
