package edu.tw.contoller;

import edu.tw.database.entity.Education;
import edu.tw.services.EducationService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class EducationController {
    EducationService service=new EducationService();


    public List<Education> getByMonth( int month) {
        return service.getByMonth(month);
    }

    public List<Education> getByCounty( String county) {
        return service.getByCounty(county);
    }

    public List<Education> getByMonthAndCounty( int month, String county) {
        return service.getByMonthAndCounty(month, county);
    }

    public List<Education> getAll() {
        return service.getAll();
    }

    public Response createEducation(Education education) {
        if (service.saveEducation(education)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response updateEducation(Education education) {
        if (service.updateEducation(education)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response deleteEducation( int month, String county) {

        if (service.deleteEducation(month, county)) {
            return Response.ok().build();
        }
        return Response.noContent().build();

    }

}
