package com.example.jocasta.ui;

import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.navigation.NavHostController;
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi;
import com.example.jocasta.data.model.*;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a.\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0007\u001a\u001e\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0007\u001a\u0018\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H\u0007\u00a8\u0006&"}, d2 = {"DetailRoute", "", "navController", "Landroidx/navigation/NavHostController;", "viewModel", "Lcom/example/jocasta/ui/DetailViewModel;", "DetailScreen", "resource", "Lcom/example/jocasta/data/model/Resource;", "FilmDetailScreen", "film", "Lcom/example/jocasta/data/model/Film;", "Header", "title", "", "ItemRow", "type", "idList", "", "", "PersonDetailScreen", "person", "Lcom/example/jocasta/data/model/Person;", "PlanetDetailScreen", "planet", "Lcom/example/jocasta/data/model/Planet;", "SpeciesDetailScreen", "species", "Lcom/example/jocasta/data/model/Species;", "StarshipDetailScreen", "starship", "Lcom/example/jocasta/data/model/Starship;", "TopInfo", "url", "dataList", "VehicleDetailScreen", "vehicle", "Lcom/example/jocasta/data/model/Vehicle;", "app_debug"})
public final class DetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void DetailRoute(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.ui.DetailViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Resource resource) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FilmDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Film film) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PersonDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Person person) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PlanetDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Planet planet) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SpeciesDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Species species) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StarshipDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Starship starship) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VehicleDetailScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.model.Vehicle vehicle) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Header(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    public static final void TopInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dataList) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ItemRow(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
    }
}