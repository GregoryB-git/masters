package d0;

import g0.a;

public class r
{
  public final h a;
  public final int b;
  public final int c;
  public final float d;
  public final long e;
  
  public r(h paramh, int paramInt1, int paramInt2, float paramFloat, long paramLong)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("width must be positive, but is: ");
    localStringBuilder.append(paramInt1);
    a.b(bool2, localStringBuilder.toString());
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("height must be positive, but is: ");
    localStringBuilder.append(paramInt2);
    a.b(bool2, localStringBuilder.toString());
    a = paramh;
    b = paramInt1;
    c = paramInt2;
    d = paramFloat;
    e = paramLong;
  }
  
  public static final class b
  {
    public h a;
    public int b;
    public int c;
    public float d;
    public long e;
    
    public b(h paramh, int paramInt1, int paramInt2)
    {
      a = paramh;
      b = paramInt1;
      c = paramInt2;
      d = 1.0F;
    }
    
    public r a()
    {
      return new r(a, b, c, d, e, null);
    }
    
    public b b(float paramFloat)
    {
      d = paramFloat;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */