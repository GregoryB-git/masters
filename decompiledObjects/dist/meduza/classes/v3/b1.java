package v3;

import e0.d;
import java.util.Arrays;
import v5.e0;
import x6.b;

public final class b1
  extends i1
{
  public static final String d = e0.E(1);
  public static final d e = new d(7);
  public final float c;
  
  public b1()
  {
    c = -1.0F;
  }
  
  public b1(float paramFloat)
  {
    boolean bool;
    if ((paramFloat >= 0.0F) && (paramFloat <= 100.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    b.o("percent must be in the range of [0, 100]", bool);
    c = paramFloat;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b1;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (c == c) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Float.valueOf(c) });
  }
}

/* Location:
 * Qualified Name:     v3.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */