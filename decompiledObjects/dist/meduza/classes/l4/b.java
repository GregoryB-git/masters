package l4;

import c4.i;
import c4.l;
import c4.m;
import c4.n;
import c4.o;
import c4.o.a;
import c4.t;
import java.util.Arrays;
import v5.u;

public final class b
  extends h
{
  public o n;
  public a o;
  
  public final long b(u paramu)
  {
    byte[] arrayOfByte = a;
    if (arrayOfByte[0] == -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return -1L;
    }
    int i = (arrayOfByte[2] & 0xFF) >> 4;
    if ((i == 6) || (i == 7))
    {
      paramu.H(4);
      paramu.B();
    }
    i = l.b(i, paramu);
    paramu.G(0);
    return i;
  }
  
  public final boolean c(u paramu, long paramLong, h.a parama)
  {
    byte[] arrayOfByte = a;
    o localo = n;
    if (localo == null)
    {
      localo = new o(arrayOfByte, 17);
      n = localo;
      a = localo.c(Arrays.copyOfRange(arrayOfByte, 9, c), null);
      return true;
    }
    int i = arrayOfByte[0];
    if ((i & 0x7F) == 3)
    {
      paramu = m.a(paramu);
      parama = new o(a, b, c, d, e, g, h, j, paramu, l);
      n = parama;
      o = new a(parama, paramu);
      return true;
    }
    if (i == -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramu = o;
      if (paramu != null)
      {
        c = paramLong;
        b = paramu;
      }
      a.getClass();
      return false;
    }
    return true;
  }
  
  public final void d(boolean paramBoolean)
  {
    super.d(paramBoolean);
    if (paramBoolean)
    {
      n = null;
      o = null;
    }
  }
  
  public static final class a
    implements f
  {
    public o a;
    public o.a b;
    public long c;
    public long d;
    
    public a(o paramo, o.a parama)
    {
      a = paramo;
      b = parama;
      c = -1L;
      d = -1L;
    }
    
    public final t a()
    {
      boolean bool;
      if (c != -1L) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      return new n(a, c);
    }
    
    public final long b(i parami)
    {
      long l = d;
      if (l >= 0L)
      {
        l = -(l + 2L);
        d = -1L;
        return l;
      }
      return -1L;
    }
    
    public final void c(long paramLong)
    {
      long[] arrayOfLong = b.a;
      d = arrayOfLong[v5.e0.f(arrayOfLong, paramLong, true)];
    }
  }
}

/* Location:
 * Qualified Name:     l4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */