package com.example.jocasta.data.model;

import java.lang.System;

/**
 * A sealed class container consisting of all [ResourceSet] call response statuses.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/jocasta/data/model/ResourceSetResponse;", "", "()V", "Failure", "Fetching", "Success", "Lcom/example/jocasta/data/model/ResourceSetResponse$Failure;", "Lcom/example/jocasta/data/model/ResourceSetResponse$Fetching;", "Lcom/example/jocasta/data/model/ResourceSetResponse$Success;", "app_debug"})
public abstract class ResourceSetResponse {
    
    private ResourceSetResponse() {
        super();
    }
    
    /**
     * A [ResourceSetResponse] indicating an in-progress call awaiting response.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jocasta/data/model/ResourceSetResponse$Fetching;", "Lcom/example/jocasta/data/model/ResourceSetResponse;", "()V", "app_debug"})
    public static final class Fetching extends com.example.jocasta.data.model.ResourceSetResponse {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jocasta.data.model.ResourceSetResponse.Fetching INSTANCE = null;
        
        private Fetching() {
            super();
        }
    }
    
    /**
     * A [ResourceResponse] indicating a successful call and response.
     *
     * @property resourceSet a resulting [ResourceSet].
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/jocasta/data/model/ResourceSetResponse$Success;", "Lcom/example/jocasta/data/model/ResourceSetResponse;", "resourceSet", "Lcom/example/jocasta/data/model/ResourceSet;", "(Lcom/example/jocasta/data/model/ResourceSet;)V", "getResourceSet", "()Lcom/example/jocasta/data/model/ResourceSet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends com.example.jocasta.data.model.ResourceSetResponse {
        @org.jetbrains.annotations.NotNull()
        private final com.example.jocasta.data.model.ResourceSet resourceSet = null;
        
        /**
         * A [ResourceResponse] indicating a successful call and response.
         *
         * @property resourceSet a resulting [ResourceSet].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.jocasta.data.model.ResourceSetResponse.Success copy(@org.jetbrains.annotations.NotNull()
        com.example.jocasta.data.model.ResourceSet resourceSet) {
            return null;
        }
        
        /**
         * A [ResourceResponse] indicating a successful call and response.
         *
         * @property resourceSet a resulting [ResourceSet].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A [ResourceResponse] indicating a successful call and response.
         *
         * @property resourceSet a resulting [ResourceSet].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A [ResourceResponse] indicating a successful call and response.
         *
         * @property resourceSet a resulting [ResourceSet].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.example.jocasta.data.model.ResourceSet resourceSet) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.jocasta.data.model.ResourceSet component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.jocasta.data.model.ResourceSet getResourceSet() {
            return null;
        }
    }
    
    /**
     * A [ResourceSetResponse] indicating an unsuccessful call and response.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jocasta/data/model/ResourceSetResponse$Failure;", "Lcom/example/jocasta/data/model/ResourceSetResponse;", "()V", "app_debug"})
    public static final class Failure extends com.example.jocasta.data.model.ResourceSetResponse {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jocasta.data.model.ResourceSetResponse.Failure INSTANCE = null;
        
        private Failure() {
            super();
        }
    }
}