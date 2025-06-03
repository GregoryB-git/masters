package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ip
  implements ik
{
  private final jb a;
  private final boolean b;
  private final boolean c;
  private final ix d;
  private final ix e;
  private final ix f;
  private long g;
  private final boolean[] h;
  private String i;
  private gi j;
  private io k;
  private boolean l;
  private long m;
  private boolean n;
  private final vy o;
  
  public ip(jb paramjb, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramjb;
    b = paramBoolean1;
    c = paramBoolean2;
    h = new boolean[3];
    d = new ix(7, 128);
    e = new ix(8, 128);
    f = new ix(6, 128);
    o = new vy();
  }
  
  private final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((!l) || (k.a()))
    {
      d.a(paramArrayOfByte, paramInt1, paramInt2);
      e.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    f.a(paramArrayOfByte, paramInt1, paramInt2);
    k.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void a()
  {
    vu.a(h);
    d.a();
    e.a();
    f.a();
    k.b();
    g = 0L;
    n = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    m = paramLong;
    int i1 = n;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    n = (i1 | paramInt);
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    i = paramjn.c();
    gi localgi = paramfy.a(paramjn.b(), 2);
    j = localgi;
    k = new io(localgi, b, c);
    a.a(paramfy, paramjn);
  }
  
  public final void a(vy paramvy)
  {
    int i1 = paramvy.d();
    int i2 = paramvy.c();
    Object localObject1 = a;
    g += paramvy.b();
    j.a(paramvy, paramvy.b());
    paramvy = (vy)localObject1;
    for (;;)
    {
      int i3 = vu.a(paramvy, i1, i2, h);
      if (i3 == i2)
      {
        a(paramvy, i1, i2);
        return;
      }
      int i4 = vu.b(paramvy, i3);
      int i5 = i3 - i1;
      if (i5 > 0) {
        a(paramvy, i1, i3);
      }
      int i6 = i2 - i3;
      long l1 = g - i6;
      if (i5 < 0) {
        i5 = -i5;
      } else {
        i5 = 0;
      }
      long l2 = m;
      if ((l) && (!k.a())) {}
      for (;;)
      {
        break;
        d.b(i5);
        e.b(i5);
        if (!l)
        {
          if ((d.b()) && (e.b()))
          {
            localObject1 = new ArrayList();
            Object localObject2 = d;
            ((ArrayList)localObject1).add(Arrays.copyOf(a, b));
            localObject2 = e;
            ((ArrayList)localObject1).add(Arrays.copyOf(a, b));
            localObject2 = d;
            localObject2 = vu.a(a, 3, b);
            Object localObject3 = e;
            localObject3 = vu.b(a, 3, b);
            j.a(bw.a(i, "video/avc", vg.b(a, b, c), -1, -1, e, f, -1.0F, (List)localObject1, -1, g, null));
            l = true;
            k.a((vw)localObject2);
            k.a((vx)localObject3);
            d.a();
            e.a();
          }
        }
        else if (d.b())
        {
          localObject1 = d;
          localObject1 = vu.a(a, 3, b);
          k.a((vw)localObject1);
          d.a();
        }
        else if (e.b())
        {
          localObject1 = e;
          localObject1 = vu.b(a, 3, b);
          k.a((vx)localObject1);
          e.a();
        }
      }
      i1 = i4;
      if (f.b(i5))
      {
        localObject1 = f;
        i5 = vu.a(a, b);
        o.a(f.a, i5);
        o.c(4);
        a.a(l2, o);
      }
      if (k.a(l1, i6, l, n)) {
        n = false;
      }
      l2 = m;
      if ((l) && (!k.a())) {
        break label663;
      }
      localObject1 = d;
      i5 = i1;
      ((ix)localObject1).a(i5);
      e.a(i5);
      label663:
      f.a(i1);
      k.a(l1, i1, l2);
      i1 = i3 + 3;
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */