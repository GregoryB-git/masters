package d0;

import g0.M;
import g0.a;

public final class C
{
  public static final C d = new C(1.0F);
  public static final String e = M.w0(0);
  public static final String f = M.w0(1);
  public final float a;
  public final float b;
  public final int c;
  
  public C(float paramFloat)
  {
    this(paramFloat, 1.0F);
  }
  
  public C(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramFloat1 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    if (paramFloat2 > 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    a = paramFloat1;
    b = paramFloat2;
    c = Math.round(paramFloat1 * 1000.0F);
  }
  
  public long a(long paramLong)
  {
    return paramLong * c;
  }
  
  public C b(float paramFloat)
  {
    return new C(paramFloat, b);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (C.class == paramObject.getClass()))
    {
      paramObject = (C)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + Float.floatToRawIntBits(a)) * 31 + Float.floatToRawIntBits(b);
  }
  
  public String toString()
  {
    return M.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[] { Float.valueOf(a), Float.valueOf(b) });
  }
}

/* Location:
 * Qualified Name:     d0.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */