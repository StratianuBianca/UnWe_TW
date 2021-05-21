package edu.tw.contoller;

import edu.tw.services.PageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class PageController {
    PageService pageService = new PageService();

    public Response criteria(String criteria1,
                             String criteria2,
                             String criteria3,
                             String criteria4,
                             String criteria5) {
        pageService.criteriaService(criteria1, criteria2, criteria3, criteria4, criteria5);
        return Response.ok().build();
    }

    public Response csv(String criteria1,
                        String criteria2,
                        String criteria3,
                        String criteria4,
                        String criteria5) {

        pageService.downloadCsv(criteria1, criteria2, criteria3, criteria4, criteria5);
        return Response.ok().build();
    }

    public Response pdf(String criteria1,
                        String criteria2,
                        String criteria3,
                        String criteria4,
                        String criteria5) {
        pageService.downloadPdf(criteria1, criteria2, criteria3, criteria4, criteria5);
        return Response.ok().build();
    }

    public Response svg(String criteria1,
                        String criteria2,
                        String criteria3,
                        String criteria4,
                        String criteria5) {
        pageService.downloadSvg(criteria1, criteria2, criteria3, criteria4, criteria5);
        return Response.ok().build();
    }
}
