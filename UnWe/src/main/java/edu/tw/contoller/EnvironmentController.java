package edu.tw.contoller;

import edu.tw.database.entity.Environment;
import edu.tw.services.EnvironmentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


public class EnvironmentController {
    EnvironmentService service;

    public List<Environment> getByMonth( int month) {
        return service.getByMonth(month);
    }

    public List<Environment> getByCounty( String county) {
        return service.getByCounty(county);
    }

    public List<Environment> getByMonthAndCounty( int month,  String county) {
        return service.getByMonthAndCounty(month, county);
    }

    public List<Environment> getAll() {
        return service.getAll();
    }

    public Response createEnvironment(Environment environment) {
        if (service.saveEnvironment(environment)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }
    public Response updateEnvironment(Environment environment) {
        if (service.updateEnvironment(environment)) {
            return Response.ok().build();
        }
        return Response.noContent().build();

    }

    public Response deleteEnvironment( int month, String county) {

        if (service.deleteEnvironment(month, county)) {
            return Response.ok().build();
        }
        return Response.noContent().build();

    }
}
