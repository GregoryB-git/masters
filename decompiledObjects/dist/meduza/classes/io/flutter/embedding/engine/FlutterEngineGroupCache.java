package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

public class FlutterEngineGroupCache
{
  private static volatile FlutterEngineGroupCache instance;
  private final Map<String, FlutterEngineGroup> cachedEngineGroups = new HashMap();
  
  public static FlutterEngineGroupCache getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null)
        {
          FlutterEngineGroupCache localFlutterEngineGroupCache = new io/flutter/embedding/engine/FlutterEngineGroupCache;
          localFlutterEngineGroupCache.<init>();
          instance = localFlutterEngineGroupCache;
        }
      }
      finally {}
    }
    return instance;
  }
  
  public void clear()
  {
    cachedEngineGroups.clear();
  }
  
  public boolean contains(String paramString)
  {
    return cachedEngineGroups.containsKey(paramString);
  }
  
  public FlutterEngineGroup get(String paramString)
  {
    return (FlutterEngineGroup)cachedEngineGroups.get(paramString);
  }
  
  public void put(String paramString, FlutterEngineGroup paramFlutterEngineGroup)
  {
    if (paramFlutterEngineGroup != null) {
      cachedEngineGroups.put(paramString, paramFlutterEngineGroup);
    } else {
      cachedEngineGroups.remove(paramString);
    }
  }
  
  public void remove(String paramString)
  {
    put(paramString, null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineGroupCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */