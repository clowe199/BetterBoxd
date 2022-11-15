import info.movito.themoviedbapi.TmdbAccount;
import info.movito.themoviedbapi.TmdbApi;

public class TMDBController {
    private TmdbApi apiKey;
    private TmdbAccount userAccount;

    public void TMDBController(String key){
        apiKey = new TmdbApi(key);
    }

    public static void main(String args[]){
        TMDBController myController = new TMDBController();
    }
}
