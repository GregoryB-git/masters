package j4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c$b
{
  public final String a;
  public Map b = null;
  
  public c$b(String paramString)
  {
    a = paramString;
  }
  
  public c a()
  {
    String str = a;
    Map localMap;
    if (b == null) {
      localMap = Collections.emptyMap();
    } else {
      localMap = Collections.unmodifiableMap(new HashMap(b));
    }
    return new c(str, localMap, null);
  }
  
  public b b(Annotation paramAnnotation)
  {
    if (b == null) {
      b = new HashMap();
    }
    b.put(paramAnnotation.annotationType(), paramAnnotation);
    return this;
  }
}

/* Location:
 * Qualified Name:     j4.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */