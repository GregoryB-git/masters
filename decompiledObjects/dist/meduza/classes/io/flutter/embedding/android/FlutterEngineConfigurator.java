package io.flutter.embedding.android;

import io.flutter.embedding.engine.FlutterEngine;

public abstract interface FlutterEngineConfigurator
{
  public abstract void cleanUpFlutterEngine(FlutterEngine paramFlutterEngine);
  
  public abstract void configureFlutterEngine(FlutterEngine paramFlutterEngine);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterEngineConfigurator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */