package l4;

import c4.i;
import c4.j;
import c4.t;
import c4.t.b;
import c4.v;
import v3.i0;
import v5.u;

public abstract class h
{
  public final d a = new d();
  public v b;
  public j c;
  public f d;
  public long e;
  public long f;
  public long g;
  public int h;
  public int i;
  public a j = new a();
  public long k;
  public boolean l;
  public boolean m;
  
  public void a(long paramLong)
  {
    g = paramLong;
  }
  
  public abstract long b(u paramu);
  
  public abstract boolean c(u paramu, long paramLong, a parama);
  
  public void d(boolean paramBoolean)
  {
    int n;
    if (paramBoolean)
    {
      j = new a();
      f = 0L;
      n = 0;
    }
    else
    {
      n = 1;
    }
    h = n;
    e = -1L;
    g = 0L;
  }
  
  public static final class a
  {
    public i0 a;
    public b.a b;
  }
  
  public static final class b
    implements f
  {
    public final t a()
    {
      return new t.b(-9223372036854775807L);
    }
    
    public final long b(i parami)
    {
      return -1L;
    }
    
    public final void c(long paramLong) {}
  }
}

/* Location:
 * Qualified Name:     l4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */