package B0;

import g0.a;
import java.io.IOException;
import x0.r;
import x0.u;

public abstract interface m
{
  public abstract void a(long paramLong);
  
  public abstract b b(a parama, c paramc);
  
  public abstract long c(c paramc);
  
  public abstract int d(int paramInt);
  
  public static final class a
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
    }
    
    public boolean a(int paramInt)
    {
      boolean bool = false;
      if (paramInt == 1)
      {
        if (a - b <= 1) {}
      }
      else {
        while (c - d > 1)
        {
          bool = true;
          break;
        }
      }
      return bool;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final long b;
    
    public b(int paramInt, long paramLong)
    {
      boolean bool;
      if (paramLong >= 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      a = paramInt;
      b = paramLong;
    }
  }
  
  public static final class c
  {
    public final r a;
    public final u b;
    public final IOException c;
    public final int d;
    
    public c(r paramr, u paramu, IOException paramIOException, int paramInt)
    {
      a = paramr;
      b = paramu;
      c = paramIOException;
      d = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     B0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */