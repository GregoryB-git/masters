package r1;

import ec.i;

public final class a$c
  implements Comparable<c>
{
  public final int a;
  public final int b;
  public final String c;
  public final String d;
  
  public a$c(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString1;
    d = paramString2;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (c)paramObject;
    i.e(paramObject, "other");
    int i = a - a;
    int j = i;
    if (i == 0) {
      j = b - b;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     r1.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */