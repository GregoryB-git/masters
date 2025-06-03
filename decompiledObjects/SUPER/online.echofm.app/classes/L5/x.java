package L5;

import Q3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class x
{
  public Map a = new HashMap();
  
  public x(b paramb)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("key", paramb.e());
    localHashMap.put("value", paramb.h());
    localHashMap.put("priority", paramb.f());
    int i = (int)paramb.d();
    if (i == 0) {}
    String[] arrayOfString;
    for (paramb = new ArrayList();; paramb = Arrays.asList(arrayOfString))
    {
      localHashMap.put("childKeys", paramb);
      break;
      arrayOfString = new String[i];
      paramb = paramb.c().iterator();
      for (i = 0; paramb.hasNext(); i++) {
        arrayOfString[i] = ((b)paramb.next()).e();
      }
    }
    a.put("snapshot", localHashMap);
  }
  
  public Map a()
  {
    return a;
  }
  
  public x b(Map paramMap)
  {
    Map localMap = a;
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.putAll(localMap);
    a.putAll(paramMap);
    return this;
  }
}

/* Location:
 * Qualified Name:     L5.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */