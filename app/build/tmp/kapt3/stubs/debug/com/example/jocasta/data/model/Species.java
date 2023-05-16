package com.example.jocasta.data.model;

import com.example.jocasta.utility.DeserializeInt;
import com.example.jocasta.utility.DeserializeIntList;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\u00ad\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016\u00a8\u0006="}, d2 = {"Lcom/example/jocasta/data/model/Species;", "Lcom/example/jocasta/data/model/Resource;", "id", "", "averageHeight", "", "averageLifespan", "classification", "created", "designation", "edited", "eyeColors", "films", "", "hairColors", "homeWorld", "language", "name", "people", "skinColors", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAverageHeight", "()Ljava/lang/String;", "getAverageLifespan", "getClassification", "getCreated", "getDesignation", "getEdited", "getEyeColors", "getFilms", "()Ljava/util/List;", "getHairColors", "getHomeWorld", "getId", "()I", "getLanguage", "getName", "getPeople", "getSkinColors", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Species implements com.example.jocasta.data.model.Resource {
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    @com.google.gson.annotations.SerializedName(value = "url")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "average_height")
    private final java.lang.String averageHeight = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "average_lifespan")
    private final java.lang.String averageLifespan = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "classification")
    private final java.lang.String classification = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created")
    private final java.lang.String created = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "designation")
    private final java.lang.String designation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "edited")
    private final java.lang.String edited = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "eye_colors")
    private final java.lang.String eyeColors = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    @com.google.gson.annotations.SerializedName(value = "films")
    private final java.util.List<java.lang.Integer> films = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hair_colors")
    private final java.lang.String hairColors = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homeworld")
    private final java.lang.String homeWorld = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "language")
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    @com.google.gson.annotations.SerializedName(value = "people")
    private final java.util.List<java.lang.Integer> people = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skin_colors")
    private final java.lang.String skinColors = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jocasta.data.model.Species copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String averageHeight, @org.jetbrains.annotations.NotNull()
    java.lang.String averageLifespan, @org.jetbrains.annotations.NotNull()
    java.lang.String classification, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, @org.jetbrains.annotations.NotNull()
    java.lang.String eyeColors, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
    java.lang.String hairColors, @org.jetbrains.annotations.Nullable()
    java.lang.String homeWorld, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> people, @org.jetbrains.annotations.NotNull()
    java.lang.String skinColors) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Species(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String averageHeight, @org.jetbrains.annotations.NotNull()
    java.lang.String averageLifespan, @org.jetbrains.annotations.NotNull()
    java.lang.String classification, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, @org.jetbrains.annotations.NotNull()
    java.lang.String eyeColors, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
    java.lang.String hairColors, @org.jetbrains.annotations.Nullable()
    java.lang.String homeWorld, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> people, @org.jetbrains.annotations.NotNull()
    java.lang.String skinColors) {
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
    public final java.lang.String getAverageHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverageLifespan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClassification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDesignation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEdited() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEyeColors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHairColors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomeWorld() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSkinColors() {
        return null;
    }
}