package com.example.jocasta.ui;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.jocasta.data.model.*;
import com.example.jocasta.data.repository.SwapiRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/jocasta/ui/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "swapiRepository", "Lcom/example/jocasta/data/repository/SwapiRepository;", "(Lcom/example/jocasta/data/repository/SwapiRepository;)V", "_filmSetState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/jocasta/ui/ResourceSetFetchState;", "_personSetState", "_planetSetState", "_speciesSetState", "_starshipSetState", "_vehicleSetState", "filmSetState", "Lkotlinx/coroutines/flow/StateFlow;", "getFilmSetState", "()Lkotlinx/coroutines/flow/StateFlow;", "personSetState", "getPersonSetState", "planetSetState", "getPlanetSetState", "speciesSetState", "getSpeciesSetState", "starshipSetState", "getStarshipSetState", "vehicleSetState", "getVehicleSetState", "fetchFilms", "", "fetchPeople", "fetchPlanets", "fetchSpecies", "fetchStarships", "fetchVehicles", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jocasta.data.repository.SwapiRepository swapiRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _filmSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> filmSetState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _personSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> personSetState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _planetSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> planetSetState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _speciesSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> speciesSetState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _starshipSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> starshipSetState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceSetFetchState> _vehicleSetState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> vehicleSetState = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.repository.SwapiRepository swapiRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getFilmSetState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getPersonSetState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getPlanetSetState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getSpeciesSetState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getStarshipSetState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceSetFetchState> getVehicleSetState() {
        return null;
    }
    
    private final void fetchFilms() {
    }
    
    private final void fetchPeople() {
    }
    
    private final void fetchPlanets() {
    }
    
    private final void fetchSpecies() {
    }
    
    private final void fetchStarships() {
    }
    
    private final void fetchVehicles() {
    }
}