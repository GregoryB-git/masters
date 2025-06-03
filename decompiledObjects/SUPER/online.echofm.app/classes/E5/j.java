package E5;

import java.util.Map;
import org.json.JSONObject;

public final class j
{
  public final String a;
  public final Object b;
  
  public j(String paramString, Object paramObject)
  {
    a = paramString;
    b = paramObject;
  }
  
  public Object a(String paramString)
  {
    Object localObject = b;
    if (localObject == null) {
      return null;
    }
    if ((localObject instanceof Map)) {
      return ((Map)localObject).get(paramString);
    }
    if ((localObject instanceof JSONObject)) {
      return ((JSONObject)localObject).opt(paramString);
    }
    throw new ClassCastException();
  }
  
  public Object b()
  {
    return b;
  }
  
  public boolean c(String paramString)
  {
    Object localObject = b;
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
 * Qualified Name:     E5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */