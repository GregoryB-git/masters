package v3;

import v5.e0;
import x6.b;

public final class e1
  implements g
{
  public static final e1 d = new e1(1.0F);
  public final float a;
  public final float b;
  public final int c;
  
  static
  {
    e0.E(0);
    e0.E(1);
  }
  
  public e1(float paramFloat)
  {
    this(paramFloat, 1.0F);
  }
  
  public e1(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramFloat1 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramFloat2 > 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    a = paramFloat1;
    b = paramFloat2;
    c = Math.round(paramFloat1 * 1000.0F);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e1.class == paramObject.getClass()))
    {
      paramObject = (e1)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Float.floatToRawIntBits(a);
    return Float.floatToRawIntBits(b) + (i + 527) * 31;
  }
  
  public final String toString()
  {
    return e0.m("PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[] { Float.valueOf(a), Float.valueOf(b) });
  }
}

/* Location:
 * Qualified Name:     v3.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */