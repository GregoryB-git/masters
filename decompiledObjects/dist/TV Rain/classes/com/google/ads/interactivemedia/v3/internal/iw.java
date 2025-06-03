package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

public final class iw
  implements jj
{
  private final ik a;
  private final vz b;
  private int c;
  private int d;
  private wi e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private boolean k;
  private long l;
  
  public iw(ik paramik)
  {
    a = paramik;
    b = new vz(new byte[10]);
    c = 0;
  }
  
  private final void a(int paramInt)
  {
    c = paramInt;
    d = 0;
  }
  
  private final boolean a(vy paramvy, byte[] paramArrayOfByte, int paramInt)
  {
    int m = Math.min(paramvy.b(), paramInt - d);
    if (m <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramvy.d(m);
    } else {
      paramvy.a(paramArrayOfByte, d, m);
    }
    m = d + m;
    d = m;
    return m == paramInt;
  }
  
  public final void a()
  {
    c = 0;
    d = 0;
    h = false;
    a.a();
  }
  
  public final void a(vy paramvy, int paramInt)
    throws ce
  {
    int m = 2;
    int n = -1;
    int i1;
    Object localObject;
    if ((paramInt & 0x1) != 0)
    {
      i1 = c;
      if ((i1 != 0) && (i1 != 1)) {
        if (i1 != 2)
        {
          if (i1 == 3)
          {
            i1 = j;
            if (i1 != -1)
            {
              localObject = new StringBuilder(59);
              ((StringBuilder)localObject).append("Unexpected start indicator: expected ");
              ((StringBuilder)localObject).append(i1);
              ((StringBuilder)localObject).append(" more bytes");
              Log.w("PesReader", ((StringBuilder)localObject).toString());
            }
            a.b();
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else {
          Log.w("PesReader", "Unexpected start indicator reading extended header");
        }
      }
      localObject = paramvy;
      i1 = paramInt;
      paramvy = this;
      paramInt = n;
    }
    else
    {
      localObject = paramvy;
      paramvy = this;
      i1 = paramInt;
      paramInt = n;
    }
    while (((vy)localObject).b() > 0)
    {
      n = c;
      if (n != 0)
      {
        int i2 = 0;
        if (n != 1)
        {
          if (n != m)
          {
            if (n == 3)
            {
              int i3 = ((vy)localObject).b();
              n = j;
              if (n != paramInt) {
                i2 = i3 - n;
              }
              n = i3;
              if (i2 > 0)
              {
                n = i3 - i2;
                ((vy)localObject).b(((vy)localObject).d() + n);
              }
              a.a((vy)localObject);
              i2 = j;
              if (i2 != paramInt)
              {
                n = i2 - n;
                j = n;
                if (n == 0)
                {
                  a.b();
                  paramvy.a(1);
                }
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            n = Math.min(10, i);
            if ((paramvy.a((vy)localObject, b.a, n)) && (paramvy.a((vy)localObject, null, i)))
            {
              b.a(0);
              l = -9223372036854775807L;
              if (f)
              {
                b.b(4);
                long l1 = b.c(3);
                b.b(1);
                long l2 = b.c(15) << 15;
                b.b(1);
                long l3 = b.c(15);
                b.b(1);
                if ((!h) && (g))
                {
                  b.b(4);
                  long l4 = b.c(3);
                  b.b(1);
                  long l5 = b.c(15) << 15;
                  b.b(1);
                  long l6 = b.c(15);
                  b.b(1);
                  e.b(l4 << 30 | l5 | l6);
                  h = true;
                }
                l = e.b(l2 | l1 << 30 | l3);
              }
              if (k) {
                paramInt = 4;
              } else {
                paramInt = 0;
              }
              i1 |= paramInt;
              a.a(l, i1);
              paramvy.a(3);
              m = 2;
              paramInt = -1;
              continue;
            }
          }
        }
        else if (paramvy.a((vy)localObject, b.a, 9))
        {
          b.a(0);
          paramInt = b.c(24);
          if (paramInt != 1)
          {
            StringBuilder localStringBuilder = new StringBuilder(41);
            localStringBuilder.append("Unexpected start code prefix: ");
            localStringBuilder.append(paramInt);
            Log.w("PesReader", localStringBuilder.toString());
            j = -1;
            paramInt = 0;
          }
          else
          {
            b.b(8);
            paramInt = b.c(16);
            b.b(5);
            k = b.d();
            b.b(2);
            f = b.d();
            g = b.d();
            b.b(6);
            m = b.c(8);
            i = m;
            if (paramInt == 0) {
              j = -1;
            } else {
              j = (paramInt + 6 - 9 - m);
            }
            paramInt = 1;
          }
          m = 2;
          n = -1;
          if (paramInt != 0) {
            paramInt = 2;
          } else {
            paramInt = 0;
          }
          paramvy.a(paramInt);
          paramInt = n;
        }
        else
        {
          paramInt = -1;
          m = 2;
        }
      }
      else
      {
        ((vy)localObject).d(((vy)localObject).b());
      }
    }
  }
  
  public final void a(wi paramwi, fy paramfy, jn paramjn)
  {
    e = paramwi;
    a.a(paramfy, paramjn);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.iw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */