package i0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u
{
  public final Map a = new HashMap();
  public Map b;
  
  public void a(Map paramMap)
  {
    try
    {
      b = null;
      a.clear();
      a.putAll(paramMap);
      return;
    }
    finally
    {
      paramMap = finally;
      throw paramMap;
    }
  }
  
  public Map b()
  {
    try
    {
      if (b == null)
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>(a);
        b = Collections.unmodifiableMap(localHashMap);
      }
    }
    finally
    {
      break label45;
    }
    Map localMap = b;
    return localMap;
    label45:
    throw localMap;
  }
}

/* Location:
 * Qualified Name:     i0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */