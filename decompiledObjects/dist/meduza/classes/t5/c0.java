package t5;

import java.io.IOException;
import x6.b;

public abstract interface c0
{
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
    
    public final boolean a(int paramInt)
    {
      boolean bool = false;
      if (paramInt == 1 ? a - b > 1 : c - d > 1) {
        bool = true;
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
      b.q(bool);
      a = paramInt;
      b = paramLong;
    }
  }
  
  public static final class c
  {
    public final IOException a;
    public final int b;
    
    public c(IOException paramIOException, int paramInt)
    {
      a = paramIOException;
      b = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     t5.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */