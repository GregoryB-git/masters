package com.yandex.metrica;

import java.util.Map;

public class g
{
  private String a;
  private String b;
  private Map<String, String> c;
  
  public Map<String, String> a()
  {
    return c;
  }
  
  public void a(String paramString)
  {
    b = paramString;
  }
  
  public void a(Map<String, String> paramMap)
  {
    c = paramMap;
  }
  
  public String b()
  {
    return b;
  }
  
  public void b(String paramString)
  {
    a = paramString;
  }
  
  public String c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (g.class == paramObject.getClass()))
    {
      paramObject = (g)paramObject;
      Object localObject = a;
      if (localObject != null ? !((String)localObject).equals(a) : a != null) {
        return false;
      }
      localObject = b;
      if (localObject != null ? !((String)localObject).equals(b) : b != null) {
        return false;
      }
      localObject = c;
      paramObject = c;
      if (localObject != null) {
        bool = ((Map)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = b;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = c;
    if (localObject != null) {
      i = ((Map)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */