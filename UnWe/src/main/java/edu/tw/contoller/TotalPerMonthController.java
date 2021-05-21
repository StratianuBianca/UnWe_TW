package edu.tw.contoller;

import edu.tw.database.entity.TotalPerMonth;
import edu.tw.services.TotalPerMonthService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


public class TotalPerMonthController {
    TotalPerMonthService service=new TotalPerMonthService();


    public List<TotalPerMonth> getByMonth( int month) {
        return service.getByMonth(month);
    }

    public List<TotalPerMonth> getByCounty( String county) {
        return service.getByCounty(county);
    }

    public List<TotalPerMonth> getByMonthAndCounty( int month,  String county) {
        return service.getByMonthAndCounty(month, county);
    }

    public List<TotalPerMonth> getAll() {
        return service.getAll();
    }

    public Response createTotalPerMonth(TotalPerMonth totalPerMonth) {
        if (service.saveTotalPerMonth(totalPerMonth)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response updateTotalPerMonth(TotalPerMonth totalPerMonth) {
        if (service.updateTotalPerMonth(totalPerMonth)) {
            return Response.ok().build();
        }
        return Response.noContent().build();
    }

    public Response deleteTotalPerMonth( int month,  String county) {

        if (service.deleteTotalPerMonth(month, county)) {
            return Response.ok().build();
        }
        return Response.noContent().build();

    }
}
