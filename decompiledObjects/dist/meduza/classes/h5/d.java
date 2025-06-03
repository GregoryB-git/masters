package h5;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o7.l0;
import o7.t;

public final class d
  implements h
{
  public final b a = new b();
  public final k b = new k();
  public final ArrayDeque c = new ArrayDeque();
  public int d;
  public boolean e;
  
  public d()
  {
    for (int i = 0; i < 2; i++) {
      c.addFirst(new a());
    }
    d = 0;
  }
  
  public final void a(long paramLong) {}
  
  public final Object b()
  {
    x6.b.H(e ^ true);
    l locall;
    if ((d == 2) && (!c.isEmpty()))
    {
      locall = (l)c.removeFirst();
      if (b.m(4))
      {
        locall.l(4);
      }
      else
      {
        Object localObject1 = b;
        long l = e;
        Object localObject2 = a;
        localObject1 = c;
        localObject1.getClass();
        localObject1 = ((ByteBuffer)localObject1).array();
        localObject2.getClass();
        localObject2 = Parcel.obtain();
        ((Parcel)localObject2).unmarshall((byte[])localObject1, 0, localObject1.length);
        ((Parcel)localObject2).setDataPosition(0);
        localObject1 = ((Parcel)localObject2).readBundle(Bundle.class.getClassLoader());
        ((Parcel)localObject2).recycle();
        localObject2 = ((Bundle)localObject1).getParcelableArrayList("c");
        localObject2.getClass();
        localObject2 = new b(l, v5.b.a(a.R, (ArrayList)localObject2));
        locall.p(b.e, (g)localObject2, 0L);
      }
      b.o();
      d = 0;
    }
    else
    {
      locall = null;
    }
    return locall;
  }
  
  public final Object c()
  {
    x6.b.H(e ^ true);
    k localk;
    if (d != 0)
    {
      localk = null;
    }
    else
    {
      d = 1;
      localk = b;
    }
    return localk;
  }
  
  public final void d(k paramk)
  {
    boolean bool1 = e;
    boolean bool2 = true;
    x6.b.H(bool1 ^ true);
    if (d == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    x6.b.H(bool1);
    if (b == paramk) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    x6.b.q(bool1);
    d = 2;
  }
  
  public final void flush()
  {
    x6.b.H(e ^ true);
    b.o();
    d = 0;
  }
  
  public final void release()
  {
    e = true;
  }
  
  public final class a
    extends l
  {
    public a() {}
    
    public final void o()
    {
      d locald = d.this;
      boolean bool;
      if (c.size() < 2) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      x6.b.q(c.contains(this) ^ true);
      a = 0;
      c = null;
      c.addFirst(this);
    }
  }
  
  public static final class b
    implements g
  {
    public final long a;
    public final t<a> b;
    
    public b(long paramLong, l0 paraml0)
    {
      a = paramLong;
      b = paraml0;
    }
    
    public final int f(long paramLong)
    {
      int i;
      if (a > paramLong) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    
    public final long g(int paramInt)
    {
      boolean bool;
      if (paramInt == 0) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.q(bool);
      return a;
    }
    
    public final List<a> h(long paramLong)
    {
      Object localObject;
      if (paramLong >= a)
      {
        localObject = b;
      }
      else
      {
        localObject = t.b;
        localObject = l0.e;
      }
      return (List<a>)localObject;
    }
    
    public final int i()
    {
      return 1;
    }
  }
}

/* Location:
 * Qualified Name:     h5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */