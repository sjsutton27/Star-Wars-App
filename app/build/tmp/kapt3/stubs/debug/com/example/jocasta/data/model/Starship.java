package com.example.jocasta.data.model;

import com.example.jocasta.utility.DeserializeInt;
import com.example.jocasta.utility.DeserializeIntList;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\u00c9\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u00d6\u0003J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019\u00a8\u0006F"}, d2 = {"Lcom/example/jocasta/data/model/Starship;", "Lcom/example/jocasta/data/model/Resource;", "id", "", "cargoCapacity", "", "consumables", "costInCredits", "created", "crew", "edited", "films", "", "hyperdriveRating", "length", "mGLT", "manufacturer", "maxAtmospheringSpeed", "model", "name", "passengers", "pilots", "starshipClass", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCargoCapacity", "()Ljava/lang/String;", "getConsumables", "getCostInCredits", "getCreated", "getCrew", "getEdited", "getFilms", "()Ljava/util/List;", "getHyperdriveRating", "getId", "()I", "getLength", "getMGLT", "getManufacturer", "getMaxAtmospheringSpeed", "getModel", "getName", "getPassengers", "getPilots", "getStarshipClass", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Starship implements com.example.jocasta.data.model.Resource {
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    @com.google.gson.annotations.SerializedName(value = "url")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cargo_capacity")
    private final java.lang.String cargoCapacity = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "consumables")
    private final java.lang.String consumables = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cost_in_credits")
    private final java.lang.String costInCredits = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created")
    private final java.lang.String created = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "crew")
    private final java.lang.String crew = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "edited")
    private final java.lang.String edited = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    @com.google.gson.annotations.SerializedName(value = "films")
    private final java.util.List<java.lang.Integer> films = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hyperdrive_rating")
    private final java.lang.String hyperdriveRating = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "length")
    private final java.lang.String length = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "MGLT")
    private final java.lang.String mGLT = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "manufacturer")
    private final java.lang.String manufacturer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "max_atmosphering_speed")
    private final java.lang.String maxAtmospheringSpeed = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "model")
    private final java.lang.String model = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "passengers")
    private final java.lang.String passengers = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeIntList.class)
    @com.google.gson.annotations.SerializedName(value = "pilots")
    private final java.util.List<java.lang.Integer> pilots = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "starship_class")
    private final java.lang.String starshipClass = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jocasta.data.model.Starship copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String cargoCapacity, @org.jetbrains.annotations.NotNull()
    java.lang.String consumables, @org.jetbrains.annotations.NotNull()
    java.lang.String costInCredits, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String crew, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
    java.lang.String hyperdriveRating, @org.jetbrains.annotations.NotNull()
    java.lang.String length, @org.jetbrains.annotations.NotNull()
    java.lang.String mGLT, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String maxAtmospheringSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String model, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String passengers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> pilots, @org.jetbrains.annotations.NotNull()
    java.lang.String starshipClass) {
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
    
    public Starship(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String cargoCapacity, @org.jetbrains.annotations.NotNull()
    java.lang.String consumables, @org.jetbrains.annotations.NotNull()
    java.lang.String costInCredits, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String crew, @org.jetbrains.annotations.NotNull()
    java.lang.String edited, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> films, @org.jetbrains.annotations.NotNull()
    java.lang.String hyperdriveRating, @org.jetbrains.annotations.NotNull()
    java.lang.String length, @org.jetbrains.annotations.NotNull()
    java.lang.String mGLT, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String maxAtmospheringSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String model, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String passengers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> pilots, @org.jetbrains.annotations.NotNull()
    java.lang.String starshipClass) {
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
    public final java.lang.String getCargoCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConsumables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCostInCredits() {
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
    public final java.lang.String getCrew() {
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
    public final java.util.List<java.lang.Integer> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHyperdriveRating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLength() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMGLT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManufacturer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaxAtmospheringSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassengers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPilots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStarshipClass() {
        return null;
    }
}