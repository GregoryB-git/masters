package io.flutter.embedding.engine.plugins;

import java.util.Set;

public abstract interface PluginRegistry
{
  public abstract void add(FlutterPlugin paramFlutterPlugin);
  
  public abstract void add(Set<FlutterPlugin> paramSet);
  
  public abstract FlutterPlugin get(Class<? extends FlutterPlugin> paramClass);
  
  public abstract boolean has(Class<? extends FlutterPlugin> paramClass);
  
  public abstract void remove(Class<? extends FlutterPlugin> paramClass);
  
  public abstract void remove(Set<Class<? extends FlutterPlugin>> paramSet);
  
  public abstract void removeAll();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.PluginRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */