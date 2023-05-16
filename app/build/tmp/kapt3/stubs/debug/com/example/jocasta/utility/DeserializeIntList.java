package com.example.jocasta.utility;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/**
 * Deserialize a JSON string array as a [List]<[Int]> with null safety by resolving a null-value as
 * -1 and an invalid input array as an empty list.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/example/jocasta/utility/DeserializeIntList;", "Lcom/google/gson/JsonDeserializer;", "", "", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "app_debug"})
public final class DeserializeIntList implements com.google.gson.JsonDeserializer<java.util.List<? extends java.lang.Integer>> {
    
    public DeserializeIntList() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Integer> deserialize(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonElement json, @org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonDeserializationContext context) {
        return null;
    }
}