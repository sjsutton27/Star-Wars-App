package com.example.jocasta;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = JocastaApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface JocastaApplication_GeneratedInjector {
  void injectJocastaApplication(JocastaApplication jocastaApplication);
}
