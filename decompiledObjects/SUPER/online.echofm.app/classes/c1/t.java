package c1;

import d0.q;
import g0.g;

public abstract interface t
{
  public abstract k a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void b();
  
  public abstract void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, b paramb, g paramg);
  
  public abstract int d();
  
  public static abstract interface a
  {
    public static final a a = new a();
    
    public abstract boolean a(q paramq);
    
    public abstract t b(q paramq);
    
    public abstract int c(q paramq);
    
    public class a
      implements t.a
    {
      public boolean a(q paramq)
      {
        return false;
      }
      
      public t b(q paramq)
      {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
      }
      
      public int c(q paramq)
      {
        return 1;
      }
    }
  }
  
  public static class b
  {
    public static final b c = new b(-9223372036854775807L, false);
    public final long a;
    public final boolean b;
    
    public b(long paramLong, boolean paramBoolean)
    {
      a = paramLong;
      b = paramBoolean;
    }
    
    public static b b()
    {
      return c;
    }
    
    public static b c(long paramLong)
    {
      return new b(paramLong, true);
    }
  }
}

/* Location:
 * Qualified Name:     c1.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */