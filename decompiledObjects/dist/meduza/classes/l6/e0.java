package l6;

import j6.d;
import java.util.Arrays;
import m6.h;
import m6.h.a;

public final class e0
{
  public final a a;
  public final d b;
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof e0)))
    {
      paramObject = (e0)paramObject;
      if ((h.a(a, a)) && (h.a(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(a, "key");
    locala.a(b, "feature");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     l6.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */