import Requests.DeleteRequests;
import Requests.GetRequests;
import Requests.PostRequests;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class TestDemoRequests {
    public static Logger logger;
    @Test
    public void getToken() {
        logger.info("Getting token");
        GetRequests getRequest = new GetRequests();
        getRequest.generateToken();
    }

    @Test
    public void validateToken() {
        logger.info("Validating token");
        PostRequests postRequest = new PostRequests();
        postRequest.validateToken();
    }

    @Test
    void createSession() {
        logger.info("Creating session");
        PostRequests postRequest = new PostRequests();
        postRequest.createSession();
    }

    @Test
    public void createList() {
        logger.info("Creating list");
        PostRequests createListRequest = new PostRequests();
        createListRequest.createList();
    }

    @Test
    void rateMovie() {
        logger.info("Rating movie");
        PostRequests postRequest = new PostRequests();
        postRequest.rateMovie(75174, 9);
    }

    @Test
    public void deleteRating() {
        logger.info("Deleting rating");
        DeleteRequests deleteRequest = new DeleteRequests();
        deleteRequest.deleteRating(195623);
    }

    @Test
    public void addMovie() {
        logger.info("Adding movie to list");
        PostRequests postRequest = new PostRequests();
        postRequest.addMovieToList(799877, "8200420");
    }

    @Test
    public void confirmMovieInList() {
        logger.info("Confirming whether movie in list");
        GetRequests listDetailsRequest = new GetRequests();
        listDetailsRequest.assertMovieInList("8200420", "The Outfit");
    }
}
