package com.example.jocasta.data.repository;

import android.util.Log;
import com.example.jocasta.data.SwapiClient;
import com.example.jocasta.data.model.ResourceResponse;
import com.example.jocasta.data.model.ResourceSetResponse;
import com.example.jocasta.data.model.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/jocasta/data/repository/SwapiRepositoryImpl;", "Lcom/example/jocasta/data/repository/SwapiRepository;", "client", "Lcom/example/jocasta/data/SwapiClient;", "(Lcom/example/jocasta/data/SwapiClient;)V", "fetchAllSpecies", "Lcom/example/jocasta/data/model/ResourceSetResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFilm", "Lcom/example/jocasta/data/model/ResourceResponse;", "id", "fetchFilms", "fetchPeople", "fetchPerson", "fetchPlanet", "fetchPlanets", "fetchSpecies", "fetchStarship", "fetchStarships", "fetchVehicle", "fetchVehicles", "app_debug"})
public final class SwapiRepositoryImpl implements com.example.jocasta.data.repository.SwapiRepository {
    private final com.example.jocasta.data.SwapiClient client = null;
    
    @javax.inject.Inject()
    public SwapiRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.SwapiClient client) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchFilms(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchFilm(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPeople(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPerson(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchStarships(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchStarship(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchVehicles(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchVehicle(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPlanets(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPlanet(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAllSpecies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceSetResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchSpecies(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jocasta.data.model.ResourceResponse> continuation) {
        return null;
    }
}