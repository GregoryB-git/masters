package g9;

import j9.e;
import j9.l;
import q0.g;

public final class e0
{
  public final int a;
  public final l b;
  
  public e0(int paramInt, l paraml)
  {
    a = paramInt;
    b = paraml;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof e0)))
    {
      paramObject = (e0)paramObject;
      if ((a == a) && (b.equals(b))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int hashCode()
  {
    int i = g.c(a);
    return b.hashCode() + (i + 899) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if (a == 1) {
      str = "";
    } else {
      str = "-";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(b.h());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g9.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */