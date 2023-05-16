package com.example.jocasta.data.repository;

import com.example.jocasta.data.model.FilmSet;
import com.example.jocasta.data.model.PersonSet;
import com.example.jocasta.data.model.ResourceResponse;
import com.example.jocasta.data.model.ResourceSetResponse;
import com.example.jocasta.data.model.*;

/**
 * A resource repository interface meant to structure the application-side middleware service layer
 * which determines how client requests should be made and how request state should change as a
 * result.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/jocasta/data/repository/SwapiRepository;", "", "fetchAllSpecies", "Lcom/example/jocasta/data/model/ResourceSetResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFilm", "Lcom/example/jocasta/data/model/ResourceResponse;", "id", "fetchFilms", "fetchPeople", "fetchPerson", "fetchPlanet", "fetchPlanets", "fetchSpecies", "fetchStarship", "fetchStarships", "fetchVehicle", "fetchVehicles", "app_debug"})
public abstract interface SwapiRepository {
    
    /**
     * Fetch a [FilmSet] with respect to resource pagination as indicated by the query parameter.
     *
     * @param page the response page number indicating the paginated data subset that is required.
     *
     * @return a [FilmSet] containing appropriate data with respect to query parameter [page].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchFilms(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    /**
     * Fetch a [Film] with the numeric datastore identifier indicated by the path parameter.
     *
     * @param id the numeric datastore identifier.
     *
     * @return the [Film] whose identifier field matches argument [id].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchFilm(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
    
    /**
     * Fetch a [PersonSet] with respect to resource pagination as indicated by the query parameter.
     *
     * @param page the response page number indicating the paginated data subset that is required.
     *
     * @return a [PersonSet] containing appropriate data with respect to query parameter [page].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPeople(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPerson(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPlanets(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPlanet(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAllSpecies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchSpecies(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchStarships(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchStarship(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchVehicles(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchVehicle(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation);
}