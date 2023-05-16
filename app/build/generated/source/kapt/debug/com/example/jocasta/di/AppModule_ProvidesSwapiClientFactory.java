// Generated by Dagger (https://dagger.dev).
package com.example.jocasta.di;

import com.example.jocasta.data.SwapiClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvidesSwapiClientFactory implements Factory<SwapiClient> {
  @Override
  public SwapiClient get() {
    return providesSwapiClient();
  }

  public static AppModule_ProvidesSwapiClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SwapiClient providesSwapiClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesSwapiClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesSwapiClientFactory INSTANCE = new AppModule_ProvidesSwapiClientFactory();
  }
}