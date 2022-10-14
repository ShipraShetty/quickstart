package com.example.demo;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.entity.Fee;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.services.FeeService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api/v1/fees")
public class FeeResource {
    private FeeService service;
    
	public FeeResource() {
		super();
		// TODO Auto-generated constructor stub
		this.service=new FeeService();
	}

	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public List<Fee> findAll() {
		return this.service.findAll();
	}
	@GET
	@Path(value="/{key}")
	@Produces(value=MediaType.APPLICATION_JSON)
	public Fee findById(@PathParam("key") int key) {
		return this.service.findById(key).orElseThrow(()-> new WebApplicationException(Response.ok(new ElementNotFoundException("ERR-603","ElementNotFound")).build()));
	}
	
	@POST
	@Produces(value= MediaType.APPLICATION_JSON)
	@Consumes(value= MediaType.APPLICATION_JSON)
	public Response addFee(Fee entity) {
		try {
			this.service.add(entity);
			return Response.status(201).entity(entity).build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.status(200).entity("record already exists").build();
		}
		
	}
	
	@DELETE
	@Path(value="/{key}")
	public Response  deleteById(@PathParam("key") int key) {
		int rowDeleted=this.service.removeById(key);
		if(rowDeleted==1) {
			return Response.status(200).entity("1 row deleted").build();
		}else {
			throw new WebApplicationException(Response.ok(new ElementNotFoundException("ERR-603","ElementNotFound")).build());
		}
		
	}
	@PUT
	@Produces(value= MediaType.APPLICATION_JSON)
	@Consumes(value= MediaType.APPLICATION_JSON)
	@Path(value="/{id}/{amount}")
	public Response updateAmount(@PathParam("branch")int id,@PathParam("amount")double amount) {
		int rowUpdated=this.service.updateById(id,amount);
		if(rowUpdated>=1) {
			return Response.status(200).entity("No of rows updated "+rowUpdated).build();
		}else {
			throw new WebApplicationException(Response.ok(new ElementNotFoundException("ERR-603","ElementNotFound")).build());
		}
	}
	
}
