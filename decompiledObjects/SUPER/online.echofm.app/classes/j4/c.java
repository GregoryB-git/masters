package j4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public final String a;
  public final Map b;
  
  public c(String paramString, Map paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public static b a(String paramString)
  {
    return new b(paramString);
  }
  
  public static c d(String paramString)
  {
    return new c(paramString, Collections.emptyMap());
  }
  
  public String b()
  {
    return a;
  }
  
  public Annotation c(Class paramClass)
  {
    return (Annotation)b.get(paramClass);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FieldDescriptor{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", properties=");
    localStringBuilder.append(b.values());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
  {
    public final String a;
    public Map b = null;
    
    public b(String paramString)
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
}

/* Location:
 * Qualified Name:     j4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */