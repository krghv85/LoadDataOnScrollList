package com.tradexl.loadmoredata.network;


import com.tradexl.loadmoredata.MovieModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
/**
 * Created by sab99r
 */
public interface MoviesApi {
    @GET("movies.php")
    Call<List<MovieModel>> getMovies(@Query("index") int index);
}
