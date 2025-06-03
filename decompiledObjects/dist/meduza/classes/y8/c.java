package y8;

import f;
import java.util.Collections;
import java.util.Map;

public final class c
{
  public final String a;
  public final Map<Class<?>, Object> b;
  
  public c(String paramString, Map<Class<?>, Object> paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public static c a(String paramString)
  {
    return new c(paramString, Collections.emptyMap());
  }
  
  public final boolean equals(Object paramObject)
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
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FieldDescriptor{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", properties=");
    localStringBuilder.append(b.values());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     y8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */