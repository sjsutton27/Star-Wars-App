package com.example.jocasta.data.model;

import com.example.jocasta.utility.DeserializeInt;
import com.example.jocasta.utility.DeserializeIntList;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * A [Resource] to represent a film within the cinematic universe.
 *
 * @property id the unique datastore film identifier
 * @property title the film title, which is more accurately the subtitle (e.g., A New Hope)
 * @property openingCrawl the opening paragraph displayed at film start
 * @property director the name(s) of the film director(s)
 * @property producer the name(s) of the film producer(s)
 * @property releaseDate the film release date in ISO 8601 format
 * @property people the list of [Person] identifiers that appear in this film
 * @property planets the list of planet identifiers that appear in this film
 * @property species the list of species identifiers that appear in this film
 * @property starships the list of starship identifiers that appear in this film
 * @property vehicles the list of vehicle identifiers that appear in this film
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u0095\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017\u00a8\u00061"}, d2 = {"Lcom/example/jocasta/data/model/Film;", "Lcom/example/jocasta/data/model/Resource;", "id", "", "title", "", "openingCrawl", "director", "producer", "releaseDate", "people", "", "planets", "species", "starships", "vehicles", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDirector", "()Ljava/lang/String;", "getId", "()I", "getOpeningCrawl", "getPeople", "()Ljava/util/List;", "getPlanets", "getProducer", "getReleaseDate", "getSpecies", "getStarships", "getTitle", "getVehicles", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Film implements com.example.jocasta.data.model.Resource {
    @com.google.gson.annotations.SerializedName(value = "episode_id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "opening_crawl")
    private final java.lang.String openingCrawl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String director = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String producer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    @com.google.gson.annotations.SerializedName(value = "characters")
    private final java.util.List<java.lang.Integer> people = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    private final java.util.List<java.lang.Integer> planets = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    private final java.util.List<java.lang.Integer> species = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    private final java.util.List<java.lang.Integer> starships = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    private final java.util.List<java.lang.Integer> vehicles = null;
    
    /**
     * A [Resource] to represent a film within the cinematic universe.
     *
     * @property id the unique datastore film identifier
     * @property title the film title, which is more accurately the subtitle (e.g., A New Hope)
     * @property openingCrawl the opening paragraph displayed at film start
     * @property director the name(s) of the film director(s)
     * @property producer the name(s) of the film producer(s)
     * @property releaseDate the film release date in ISO 8601 format
     * @property people the list of [Person] identifiers that appear in this film
     * @property planets the list of planet identifiers that appear in this film
     * @property species the list of species identifiers that appear in this film
     * @property starships the list of starship identifiers that appear in this film
     * @property vehicles the list of vehicle identifiers that appear in this film
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.jocasta.data.model.Film copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String openingCrawl, @org.jetbrains.annotations.NotNull()
    java.lang.String director, @org.jetbrains.annotations.NotNull()
    java.lang.String producer, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> people, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> planets, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> species, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> starships, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> vehicles) {
        return null;
    }
    
    /**
     * A [Resource] to represent a film within the cinematic universe.
     *
     * @property id the unique datastore film identifier
     * @property title the film title, which is more accurately the subtitle (e.g., A New Hope)
     * @property openingCrawl the opening paragraph displayed at film start
     * @property director the name(s) of the film director(s)
     * @property producer the name(s) of the film producer(s)
     * @property releaseDate the film release date in ISO 8601 format
     * @property people the list of [Person] identifiers that appear in this film
     * @property planets the list of planet identifiers that appear in this film
     * @property species the list of species identifiers that appear in this film
     * @property starships the list of starship identifiers that appear in this film
     * @property vehicles the list of vehicle identifiers that appear in this film
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A [Resource] to represent a film within the cinematic universe.
     *
     * @property id the unique datastore film identifier
     * @property title the film title, which is more accurately the subtitle (e.g., A New Hope)
     * @property openingCrawl the opening paragraph displayed at film start
     * @property director the name(s) of the film director(s)
     * @property producer the name(s) of the film producer(s)
     * @property releaseDate the film release date in ISO 8601 format
     * @property people the list of [Person] identifiers that appear in this film
     * @property planets the list of planet identifiers that appear in this film
     * @property species the list of species identifiers that appear in this film
     * @property starships the list of starship identifiers that appear in this film
     * @property vehicles the list of vehicle identifiers that appear in this film
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A [Resource] to represent a film within the cinematic universe.
     *
     * @property id the unique datastore film identifier
     * @property title the film title, which is more accurately the subtitle (e.g., A New Hope)
     * @property openingCrawl the opening paragraph displayed at film start
     * @property director the name(s) of the film director(s)
     * @property producer the name(s) of the film producer(s)
     * @property releaseDate the film release date in ISO 8601 format
     * @property people the list of [Person] identifiers that appear in this film
     * @property planets the list of planet identifiers that appear in this film
     * @property species the list of species identifiers that appear in this film
     * @property starships the list of starship identifiers that appear in this film
     * @property vehicles the list of vehicle identifiers that appear in this film
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Film(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String openingCrawl, @org.jetbrains.annotations.NotNull()
    java.lang.String director, @org.jetbrains.annotations.NotNull()
    java.lang.String producer, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> people, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> planets, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> species, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> starships, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> vehicles) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpeningCrawl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDirector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProducer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPlanets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getStarships() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getVehicles() {
        return null;
    }
}