package com.example.jocasta.data.model;

import com.example.jocasta.utility.DeserializeInt;
import com.example.jocasta.utility.DeserializeIntList;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * A [Resource] to represent an individual person or character within the cinematic universe.
 *
 * @property id a unique datastore person identifier
 * @property name the canonical name
 * @property birthYear the birth year using in-universe standard BBY or ABY
 * @property eyeColor the optional eye color, default to "Unknown"
 * @property gender the optional gender, default to "Unknown"
 * @property hairColor the optional hair color, default to "Unknown"
 * @property height the height in centimeters (cm)
 * @property mass the mass in kilograms (kg)
 * @property skinColor the skin color
 * @property homeWorld the home world planet identifier
 * @property films the list of film identifiers this person has appeared in
 * @property species the list of species identifiers this person is classified beneath
 * @property starships the list of starship identifiers this person has piloted
 * @property vehicles the list of vehicle identifiers this person has piloted
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\u00ad\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018\u00a8\u0006:"}, d2 = {"Lcom/example/jocasta/data/model/Person;", "Lcom/example/jocasta/data/model/Resource;", "id", "", "name", "", "birthYear", "eyeColor", "gender", "hairColor", "height", "mass", "skinColor", "homeWorld", "films", "", "species", "starships", "vehicles", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBirthYear", "()Ljava/lang/String;", "getEyeColor", "getFilms", "()Ljava/util/List;", "getGender", "getHairColor", "getHeight", "()I", "getHomeWorld", "getId", "getMass", "getName", "getSkinColor", "getSpecies", "getStarships", "getVehicles", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Person implements com.example.jocasta.data.model.Resource {
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    @com.google.gson.annotations.SerializedName(value = "url")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "birth_year")
    private final java.lang.String birthYear = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "eye_color")
    private final java.lang.String eyeColor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hair_color")
    private final java.lang.String hairColor = null;
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    private final int height = 0;
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    private final int mass = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skin_color")
    private final java.lang.String skinColor = null;
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    @com.google.gson.annotations.SerializedName(value = "homeworld")
    private final int homeWorld = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    private final java.util.List<java.lang.Integer> films = null;
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
     * A [Resource] to represent an individual person or character within the cinematic universe.
     *
     * @property id a unique datastore person identifier
     * @property name the canonical name
     * @property birthYear the birth year using in-universe standard BBY or ABY
     * @property eyeColor the optional eye color, default to "Unknown"
     * @property gender the optional gender, default to "Unknown"
     * @property hairColor the optional hair color, default to "Unknown"
     * @property height the height in centimeters (cm)
     * @property mass the mass in kilograms (kg)
     * @property skinColor the skin color
     * @property homeWorld the home world planet identifier
     * @property films the list of film identifiers this person has appeared in
     * @property species the list of species identifiers this person is classified beneath
     * @property starships the list of starship identifiers this person has piloted
     * @property vehicles the list of vehicle identifiers this person has piloted
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.jocasta.data.model.Person copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String birthYear, @org.jetbrains.annotations.NotNull()
    java.lang.String eyeColor, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.lang.String hairColor, int height, int mass, @org.jetbrains.annotations.NotNull()
    java.lang.String skinColor, int homeWorld, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> species, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> starships, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> vehicles) {
        return null;
    }
    
    /**
     * A [Resource] to represent an individual person or character within the cinematic universe.
     *
     * @property id a unique datastore person identifier
     * @property name the canonical name
     * @property birthYear the birth year using in-universe standard BBY or ABY
     * @property eyeColor the optional eye color, default to "Unknown"
     * @property gender the optional gender, default to "Unknown"
     * @property hairColor the optional hair color, default to "Unknown"
     * @property height the height in centimeters (cm)
     * @property mass the mass in kilograms (kg)
     * @property skinColor the skin color
     * @property homeWorld the home world planet identifier
     * @property films the list of film identifiers this person has appeared in
     * @property species the list of species identifiers this person is classified beneath
     * @property starships the list of starship identifiers this person has piloted
     * @property vehicles the list of vehicle identifiers this person has piloted
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A [Resource] to represent an individual person or character within the cinematic universe.
     *
     * @property id a unique datastore person identifier
     * @property name the canonical name
     * @property birthYear the birth year using in-universe standard BBY or ABY
     * @property eyeColor the optional eye color, default to "Unknown"
     * @property gender the optional gender, default to "Unknown"
     * @property hairColor the optional hair color, default to "Unknown"
     * @property height the height in centimeters (cm)
     * @property mass the mass in kilograms (kg)
     * @property skinColor the skin color
     * @property homeWorld the home world planet identifier
     * @property films the list of film identifiers this person has appeared in
     * @property species the list of species identifiers this person is classified beneath
     * @property starships the list of starship identifiers this person has piloted
     * @property vehicles the list of vehicle identifiers this person has piloted
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A [Resource] to represent an individual person or character within the cinematic universe.
     *
     * @property id a unique datastore person identifier
     * @property name the canonical name
     * @property birthYear the birth year using in-universe standard BBY or ABY
     * @property eyeColor the optional eye color, default to "Unknown"
     * @property gender the optional gender, default to "Unknown"
     * @property hairColor the optional hair color, default to "Unknown"
     * @property height the height in centimeters (cm)
     * @property mass the mass in kilograms (kg)
     * @property skinColor the skin color
     * @property homeWorld the home world planet identifier
     * @property films the list of film identifiers this person has appeared in
     * @property species the list of species identifiers this person is classified beneath
     * @property starships the list of starship identifiers this person has piloted
     * @property vehicles the list of vehicle identifiers this person has piloted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Person(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String birthYear, @org.jetbrains.annotations.NotNull()
    java.lang.String eyeColor, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.lang.String hairColor, int height, int mass, @org.jetbrains.annotations.NotNull()
    java.lang.String skinColor, int homeWorld, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEyeColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHairColor() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getMass() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSkinColor() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getHomeWorld() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getStarships() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getVehicles() {
        return null;
    }
}