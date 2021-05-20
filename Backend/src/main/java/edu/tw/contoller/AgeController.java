package edu.tw.contoller;

import edu.tw.database.entity.Age;
import edu.tw.services.AgeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class AgeController {
    AgeService service=new AgeService();

    public List<Age> getAll() {
        return service.getAll();
    }
    public List<Age> getByMonth(int month) {
        return service.getByMonth(month);
    }

    public List<Age> getByCounty( String county) {
        return service.getByCounty(county);
    }

    public List<Age> getByMonthAndCounty( int month,  String county) {
        return service.getByMonthAndCounty(month, county);
    }

    public Response createEducation(Age age) {
        if (service.saveAge(age)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response updateAge(Age age) {
        if (service.updateAge(age)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response deleteEducation( int month,  String county) {
        if (service.deleteAge(month, county)) {
            return Response.ok().build();
        }
        return Response.noContent().build();

    }
}
