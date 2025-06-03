package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

public class FlutterEngineCache
{
  private static FlutterEngineCache instance;
  private final Map<String, FlutterEngine> cachedEngines = new HashMap();
  
  public static FlutterEngineCache getInstance()
  {
    if (instance == null) {
      instance = new FlutterEngineCache();
    }
    return instance;
  }
  
  public void clear()
  {
    cachedEngines.clear();
  }
  
  public boolean contains(String paramString)
  {
    return cachedEngines.containsKey(paramString);
  }
  
  public FlutterEngine get(String paramString)
  {
    return (FlutterEngine)cachedEngines.get(paramString);
  }
  
  public void put(String paramString, FlutterEngine paramFlutterEngine)
  {
    if (paramFlutterEngine != null) {
      cachedEngines.put(paramString, paramFlutterEngine);
    } else {
      cachedEngines.remove(paramString);
    }
  }
  
  public void remove(String paramString)
  {
    put(paramString, null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */