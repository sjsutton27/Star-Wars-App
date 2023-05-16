package com.example.jocasta.data.model;

import com.example.jocasta.utility.DeserializeInt;
import com.example.jocasta.utility.DeserializeIntList;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * A [ResourceSet] to represent a list of [Person] resources.
 *
 * @property count the count of total resources of this type
 * @property next the numeric representation of the next paginated set of resources
 * @property previous the numeric representation of the previous paginated set of resources
 * @property people the resource data set, e.g., List<Person>
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/example/jocasta/data/model/PersonSet;", "Lcom/example/jocasta/data/model/ResourceSet;", "count", "", "next", "previous", "people", "", "Lcom/example/jocasta/data/model/Person;", "(IIILjava/util/List;)V", "getCount", "()I", "setCount", "(I)V", "getNext", "setNext", "getPeople", "()Ljava/util/List;", "setPeople", "(Ljava/util/List;)V", "getPrevious", "setPrevious", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class PersonSet implements com.example.jocasta.data.model.ResourceSet {
    private int count;
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    private int next;
    @com.google.gson.annotations.JsonAdapter(value = com.example.jocasta.utility.DeserializeInt.class)
    private int previous;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.jocasta.data.model.Person> people;
    
    /**
     * A [ResourceSet] to represent a list of [Person] resources.
     *
     * @property count the count of total resources of this type
     * @property next the numeric representation of the next paginated set of resources
     * @property previous the numeric representation of the previous paginated set of resources
     * @property people the resource data set, e.g., List<Person>
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.jocasta.data.model.PersonSet copy(int count, int next, int previous, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jocasta.data.model.Person> people) {
        return null;
    }
    
    /**
     * A [ResourceSet] to represent a list of [Person] resources.
     *
     * @property count the count of total resources of this type
     * @property next the numeric representation of the next paginated set of resources
     * @property previous the numeric representation of the previous paginated set of resources
     * @property people the resource data set, e.g., List<Person>
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A [ResourceSet] to represent a list of [Person] resources.
     *
     * @property count the count of total resources of this type
     * @property next the numeric representation of the next paginated set of resources
     * @property previous the numeric representation of the previous paginated set of resources
     * @property people the resource data set, e.g., List<Person>
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A [ResourceSet] to represent a list of [Person] resources.
     *
     * @property count the count of total resources of this type
     * @property next the numeric representation of the next paginated set of resources
     * @property previous the numeric representation of the previous paginated set of resources
     * @property people the resource data set, e.g., List<Person>
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PersonSet(int count, int next, int previous, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jocasta.data.model.Person> people) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getNext() {
        return 0;
    }
    
    public final void setNext(int p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPrevious() {
        return 0;
    }
    
    public final void setPrevious(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jocasta.data.model.Person> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jocasta.data.model.Person> getPeople() {
        return null;
    }
    
    public final void setPeople(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jocasta.data.model.Person> p0) {
    }
}