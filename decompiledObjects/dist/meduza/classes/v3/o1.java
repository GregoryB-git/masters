package v3;

import e0.e;
import java.util.Arrays;
import v5.e0;
import x6.b;

public final class o1
  extends i1
{
  public static final String e = e0.E(1);
  public static final String f = e0.E(2);
  public static final e o = new e(7);
  public final int c;
  public final float d;
  
  public o1(float paramFloat, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.o("maxStars must be a positive integer", bool2);
    if ((paramFloat >= 0.0F) && (paramFloat <= paramInt)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.o("starRating is out of range [0, maxStars]", bool2);
    c = paramInt;
    d = paramFloat;
  }
  
  public o1(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.o("maxStars must be a positive integer", bool);
    c = paramInt;
    d = -1.0F;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof o1;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (o1)paramObject;
    bool1 = bool2;
    if (c == c)
    {
      bool1 = bool2;
      if (d == d) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(c), Float.valueOf(d) });
  }
}

/* Location:
 * Qualified Name:     v3.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */