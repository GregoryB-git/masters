package ic;

import ec.i;

public final class c
  extends a
{
  static
  {
    new c('\001', '\000');
  }
  
  public c(char paramChar1, char paramChar2)
  {
    super(paramChar1, paramChar2);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = true;
    if (bool1)
    {
      if (i.f(a, b) > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        c localc = (c)paramObject;
        if (i.f(a, b) > 0) {
          i = 1;
        } else {
          i = 0;
        }
        bool1 = bool2;
        if (i != 0) {
          return bool1;
        }
      }
      int i = a;
      paramObject = (c)paramObject;
      if ((i == a) && (b == b)) {
        return bool2;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public final int hashCode()
  {
    int i;
    if (i.f(a, b) > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      i = -1;
    } else {
      i = a * '\037' + b;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("..");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ic.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */