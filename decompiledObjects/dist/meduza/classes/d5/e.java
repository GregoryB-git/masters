package d5;

import v5.e0;

public final class e
{
  public final String a;
  public final String b;
  public final String c;
  
  public e(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(b, b)) || (!e0.a(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    String str = b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    if (str != null) {
      j = str.hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     d5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */