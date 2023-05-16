package com.example.jocasta.data;

import com.example.jocasta.data.model.FilmSet;
import com.example.jocasta.data.model.PersonSet;
import com.example.jocasta.data.model.StarshipSet;
import com.example.jocasta.data.model.VehicleSet;
import com.example.jocasta.data.model.*;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * A request service client meant to handle interaction between SWAPI.dev and this application by
 * relaying endpoints as functions that can be called programmatically as needed.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/jocasta/data/SwapiClient;", "", "fetchAllSpecies", "Lretrofit2/Response;", "Lcom/example/jocasta/data/model/SpeciesSet;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFilm", "Lcom/example/jocasta/data/model/Film;", "id", "fetchFilms", "Lcom/example/jocasta/data/model/FilmSet;", "fetchPeople", "Lcom/example/jocasta/data/model/PersonSet;", "fetchPerson", "Lcom/example/jocasta/data/model/Person;", "fetchPlanet", "Lcom/example/jocasta/data/model/Planet;", "fetchPlanets", "Lcom/example/jocasta/data/model/PlanetSet;", "fetchSpecies", "Lcom/example/jocasta/data/model/Species;", "fetchStarship", "Lcom/example/jocasta/data/model/Starship;", "fetchStarships", "Lcom/example/jocasta/data/model/StarshipSet;", "fetchVehicle", "Lcom/example/jocasta/data/model/Vehicle;", "fetchVehicles", "Lcom/example/jocasta/data/model/VehicleSet;", "app_debug"})
public abstract interface SwapiClient {
    
    /**
     * Fetch a [FilmSet] with respect to resource pagination as indicated by the query parameter.
     *
     * @param page the response page number indicating the paginated data subset that is required.
     *
     * @return a [FilmSet] containing appropriate data with respect to query parameter [page].
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "films/")
    public abstract java.lang.Object fetchFilms(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.FilmSet>> continuation);
    
    /**
     * Fetch a [Film] with the numeric datastore identifier indicated by the path parameter.
     *
     * @param id the numeric datastore identifier.
     *
     * @return the [Film] whose identifier field matches argument [id].
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "films/{id}/")
    public abstract java.lang.Object fetchFilm(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Film>> continuation);
    
    /**
     * Fetch a [PersonSet] with respect to resource pagination as indicated by the query parameter.
     *
     * @param page the response page number indicating the paginated data subset that is required.
     *
     * @return a [PersonSet] containing appropriate data with respect to query parameter [page].
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "people/")
    public abstract java.lang.Object fetchPeople(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.PersonSet>> continuation);
    
    /**
     * Fetch a [Person] with the numeric datastore identifier indicated by the path parameter.
     *
     * @param id the numeric datastore identifier.
     *
     * @return the [Person] whose identifier field matches argument [id].
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "people/{id}/")
    public abstract java.lang.Object fetchPerson(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Person>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planets/")
    public abstract java.lang.Object fetchPlanets(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.PlanetSet>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planets/{id}/")
    public abstract java.lang.Object fetchPlanet(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Planet>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "species/")
    public abstract java.lang.Object fetchAllSpecies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.SpeciesSet>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "species/{id}/")
    public abstract java.lang.Object fetchSpecies(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Species>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "starships/")
    public abstract java.lang.Object fetchStarships(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.StarshipSet>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "starships/{id}/")
    public abstract java.lang.Object fetchStarship(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Starship>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "vehicles/")
    public abstract java.lang.Object fetchVehicles(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.VehicleSet>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "vehicles/{id}/")
    public abstract java.lang.Object fetchVehicle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jocasta.data.model.Vehicle>> continuation);
}