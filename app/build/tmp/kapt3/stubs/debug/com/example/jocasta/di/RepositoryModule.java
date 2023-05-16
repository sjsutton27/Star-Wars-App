package com.example.jocasta.di;

import com.example.jocasta.data.repository.SwapiRepository;
import com.example.jocasta.data.repository.SwapiRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/jocasta/di/RepositoryModule;", "", "()V", "bindSwapiRepository", "Lcom/example/jocasta/data/repository/SwapiRepository;", "repository", "Lcom/example/jocasta/data/repository/SwapiRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.jocasta.data.repository.SwapiRepository bindSwapiRepository(@org.jetbrains.annotations.NotNull()
    com.example.jocasta.data.repository.SwapiRepositoryImpl repository);
}