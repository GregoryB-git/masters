package c4;

import java.util.Arrays;
import t5.h;
import v3.i0;
import v5.u;

public abstract interface v
{
  public abstract void a(int paramInt, u paramu);
  
  public abstract void b(int paramInt, u paramu);
  
  public abstract void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, a parama);
  
  public abstract void d(i0 parami0);
  
  public abstract int e(h paramh, int paramInt, boolean paramBoolean);
  
  public static final class a
  {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;
    
    public a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramArrayOfByte;
      c = paramInt2;
      d = paramInt3;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a != a) || (c != c) || (d != d) || (!Arrays.equals(b, b))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a;
      return ((Arrays.hashCode(b) + i * 31) * 31 + c) * 31 + d;
    }
  }
}

/* Location:
 * Qualified Name:     c4.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */