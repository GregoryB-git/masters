package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.util.Collections;

public final class iq
  implements ik
{
  private final jb a;
  private String b;
  private gi c;
  private it d;
  private boolean e;
  private final boolean[] f;
  private final ix g;
  private final ix h;
  private final ix i;
  private final ix j;
  private final ix k;
  private long l;
  private long m;
  private final vy n;
  
  public iq(jb paramjb)
  {
    a = paramjb;
    f = new boolean[3];
    g = new ix(32, 128);
    h = new ix(33, 128);
    i = new ix(34, 128);
    j = new ix(39, 128);
    k = new ix(40, 128);
    n = new vy();
  }
  
  private final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (e)
    {
      d.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    else
    {
      g.a(paramArrayOfByte, paramInt1, paramInt2);
      h.a(paramArrayOfByte, paramInt1, paramInt2);
      i.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    j.a(paramArrayOfByte, paramInt1, paramInt2);
    k.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void a()
  {
    vu.a(f);
    g.a();
    h.a();
    i.a();
    j.a();
    k.a();
    d.a();
    l = 0L;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    m = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    b = paramjn.c();
    gi localgi = paramfy.a(paramjn.b(), 2);
    c = localgi;
    d = new it(localgi);
    a.a(paramfy, paramjn);
  }
  
  public final void a(vy paramvy)
  {
    if (paramvy.b() > 0)
    {
      int i1 = paramvy.d();
      int i2 = paramvy.c();
      byte[] arrayOfByte = a;
      l += paramvy.b();
      c.a(paramvy, paramvy.b());
      while (i1 < i2)
      {
        int i3 = vu.a(arrayOfByte, i1, i2, f);
        if (i3 == i2)
        {
          a(arrayOfByte, i1, i2);
          return;
        }
        int i4 = vu.c(arrayOfByte, i3);
        int i5 = i3 - i1;
        if (i5 > 0) {
          a(arrayOfByte, i1, i3);
        }
        int i6 = i2 - i3;
        long l1 = l - i6;
        int i7;
        if (i5 < 0) {
          i7 = -i5;
        } else {
          i7 = 0;
        }
        long l2 = m;
        Object localObject2;
        if (e)
        {
          d.a(l1, i6);
        }
        else
        {
          g.b(i7);
          h.b(i7);
          i.b(i7);
          if ((g.b()) && (h.b()) && (i.b()))
          {
            gi localgi = c;
            String str = b;
            Object localObject1 = g;
            ix localix1 = h;
            ix localix2 = i;
            i1 = b;
            localObject2 = new byte[b + i1 + b];
            System.arraycopy(a, 0, localObject2, 0, i1);
            System.arraycopy(a, 0, localObject2, b, b);
            System.arraycopy(a, 0, localObject2, b + b, b);
            localObject1 = new wb(a, 0, b);
            ((wb)localObject1).a(44);
            int i8 = ((wb)localObject1).c(3);
            ((wb)localObject1).a();
            ((wb)localObject1).a(88);
            ((wb)localObject1).a(8);
            int i9 = 0;
            i1 = i9;
            while (i9 < i8)
            {
              i5 = i1;
              if (((wb)localObject1).b()) {
                i5 = i1 + 89;
              }
              i1 = i5;
              if (((wb)localObject1).b()) {
                i1 = i5 + 8;
              }
              i9++;
            }
            ((wb)localObject1).a(i1);
            if (i8 > 0) {
              ((wb)localObject1).a((8 - i8) * 2);
            }
            ((wb)localObject1).d();
            int i10 = ((wb)localObject1).d();
            if (i10 == 3) {
              ((wb)localObject1).a();
            }
            int i11 = ((wb)localObject1).d();
            int i12 = ((wb)localObject1).d();
            i9 = i11;
            i5 = i12;
            int i14;
            if (((wb)localObject1).b())
            {
              i9 = ((wb)localObject1).d();
              int i13 = ((wb)localObject1).d();
              i14 = ((wb)localObject1).d();
              i15 = ((wb)localObject1).d();
              if ((i10 != 1) && (i10 != 2)) {
                i1 = 1;
              } else {
                i1 = 2;
              }
              if (i10 == 1) {
                i5 = 2;
              } else {
                i5 = 1;
              }
              i9 = i11 - (i9 + i13) * i1;
              i5 = i12 - (i14 + i15) * i5;
            }
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            int i15 = ((wb)localObject1).d();
            if (((wb)localObject1).b()) {
              i1 = 0;
            }
            for (i1 = i8; i1 <= i8; i1++)
            {
              ((wb)localObject1).d();
              ((wb)localObject1).d();
              ((wb)localObject1).d();
            }
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            ((wb)localObject1).d();
            if ((((wb)localObject1).b()) && (((wb)localObject1).b())) {
              for (i1 = 0; i1 < 4; i1++)
              {
                i8 = 0;
                while (i8 < 6)
                {
                  if (!((wb)localObject1).b()) {
                    ((wb)localObject1).d();
                  }
                  for (;;)
                  {
                    break;
                    i11 = Math.min(64, 1 << (i1 << 1) + 4);
                    if (i1 > 1) {
                      ((wb)localObject1).e();
                    }
                    for (i12 = 0; i12 < i11; i12++) {
                      ((wb)localObject1).e();
                    }
                  }
                  if (i1 == 3) {
                    i12 = 3;
                  } else {
                    i12 = 1;
                  }
                  i8 += i12;
                }
              }
            }
            ((wb)localObject1).a(2);
            if (((wb)localObject1).b())
            {
              ((wb)localObject1).a(8);
              ((wb)localObject1).d();
              ((wb)localObject1).d();
              ((wb)localObject1).a();
            }
            i1 = ((wb)localObject1).d();
            i8 = 0;
            boolean bool = false;
            i12 = 0;
            while (i8 < i1)
            {
              if (i8 != 0) {
                bool = ((wb)localObject1).b();
              }
              if (bool)
              {
                ((wb)localObject1).a();
                ((wb)localObject1).d();
                for (i11 = 0; i11 <= i12; i11++) {
                  if (((wb)localObject1).b()) {
                    ((wb)localObject1).a();
                  }
                }
              }
              else
              {
                i14 = ((wb)localObject1).d();
                i11 = ((wb)localObject1).d();
                for (i12 = 0; i12 < i14; i12++)
                {
                  ((wb)localObject1).d();
                  ((wb)localObject1).a();
                }
                for (i12 = 0; i12 < i11; i12++)
                {
                  ((wb)localObject1).d();
                  ((wb)localObject1).a();
                }
                i12 = i14 + i11;
              }
              i8++;
            }
            if (((wb)localObject1).b()) {
              for (i1 = 0; i1 < ((wb)localObject1).d(); i1++) {
                ((wb)localObject1).a(i15 + 4 + 1);
              }
            }
            ((wb)localObject1).a(2);
            float f1 = 1.0F;
            float f2 = f1;
            if (((wb)localObject1).b())
            {
              f2 = f1;
              if (((wb)localObject1).b())
              {
                i1 = ((wb)localObject1).c(8);
                if (i1 == 255)
                {
                  i1 = ((wb)localObject1).c(16);
                  i8 = ((wb)localObject1).c(16);
                  f2 = f1;
                  if (i1 != 0)
                  {
                    f2 = f1;
                    if (i8 != 0) {
                      f2 = i1 / i8;
                    }
                  }
                }
                else
                {
                  localObject1 = vu.b;
                  if (i1 < localObject1.length)
                  {
                    f2 = localObject1[i1];
                  }
                  else
                  {
                    localObject1 = new StringBuilder(46);
                    ((StringBuilder)localObject1).append("Unexpected aspect_ratio_idc value: ");
                    ((StringBuilder)localObject1).append(i1);
                    Log.w("H265Reader", ((StringBuilder)localObject1).toString());
                    f2 = f1;
                  }
                }
              }
            }
            localgi.a(bw.a(str, "video/hevc", null, -1, -1, i9, i5, -1.0F, Collections.singletonList(localObject2), -1, f2, null));
            e = true;
          }
        }
        i1 = i4;
        if (j.b(i7))
        {
          localObject2 = j;
          i5 = vu.a(a, b);
          n.a(j.a, i5);
          n.d(5);
          a.a(l2, n);
        }
        if (k.b(i7))
        {
          localObject2 = k;
          i5 = vu.a(a, b);
          n.a(k.a, i5);
          n.d(5);
          a.a(l2, n);
        }
        l2 = m;
        if (e)
        {
          d.a(l1, i6, i1, l2);
        }
        else
        {
          localObject2 = g;
          i5 = i1;
          ((ix)localObject2).a(i5);
          h.a(i5);
          i.a(i5);
        }
        j.a(i1);
        k.a(i1);
        i1 = i3 + 3;
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.iq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */