package com.example.jocasta.ui;

import android.util.Log;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.jocasta.data.model.Film;
import com.example.jocasta.data.model.Resource;
import com.example.jocasta.data.model.ResourceResponse;
import com.example.jocasta.data.repository.SwapiRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/jocasta/ui/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "swapiRepository", "Lcom/example/jocasta/data/repository/SwapiRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/jocasta/data/repository/SwapiRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_resourceState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/jocasta/ui/ResourceFetchState;", "id", "", "resourceState", "Lkotlinx/coroutines/flow/StateFlow;", "getResourceState", "()Lkotlinx/coroutines/flow/StateFlow;", "type", "", "fetchFilm", "", "fetchPerson", "fetchPlanet", "fetchResource", "fetchSpecies", "fetchStarship", "fetchVehicle", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jocasta.data.repository.SwapiRepository swapiRepository = null;
    private final java.lang.String type = null;
    private final int id = 0;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.jocasta.ui.ResourceFetchState> _resourceState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceFetchState> resourceState = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.repository.SwapiRepository swapiRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.jocasta.ui.ResourceFetchState> getResourceState() {
        return null;
    }
    
    private final void fetchResource(java.lang.String type, int id) {
    }
    
    private final void fetchFilm(int id) {
    }
    
    private final void fetchPerson(int id) {
    }
    
    private final void fetchPlanet(int id) {
    }
    
    private final void fetchSpecies(int id) {
    }
    
    private final void fetchStarship(int id) {
    }
    
    private final void fetchVehicle(int id) {
    }
}