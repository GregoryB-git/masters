package h3;

import f;
import g;

public final class c
{
  public final String a;
  
  public c(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return;
    }
    throw new NullPointerException("name is null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    return g.f(f.l("Encoding{name=\""), a, "\"}");
  }
}

/* Location:
 * Qualified Name:     h3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */