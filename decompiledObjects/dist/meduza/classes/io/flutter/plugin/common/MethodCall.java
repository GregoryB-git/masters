package io.flutter.plugin.common;

import java.util.Map;
import org.json.JSONObject;

public final class MethodCall
{
  public final Object arguments;
  public final String method;
  
  public MethodCall(String paramString, Object paramObject)
  {
    method = paramString;
    arguments = paramObject;
  }
  
  public <T> T argument(String paramString)
  {
    Object localObject = arguments;
    if (localObject == null) {
      return null;
    }
    if ((localObject instanceof Map)) {
      return (T)((Map)localObject).get(paramString);
    }
    if ((localObject instanceof JSONObject)) {
      return (T)((JSONObject)localObject).opt(paramString);
    }
    throw new ClassCastException();
  }
  
  public <T> T arguments()
  {
    return (T)arguments;
  }
  
  public boolean hasArgument(String paramString)
  {
    Object localObject = arguments;
    if (localObject == null) {
      return false;
    }
    if ((localObject instanceof Map)) {
      return ((Map)localObject).containsKey(paramString);
    }
    if ((localObject instanceof JSONObject)) {
      return ((JSONObject)localObject).has(paramString);
    }
    throw new ClassCastException();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MethodCall
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */