package m4;

import c4.v;
import java.util.Arrays;
import java.util.Collections;
import v3.i0;
import v3.i0.a;
import v5.m;
import v5.q;
import v5.t;
import v5.u;
import x6.b;

public final class l
  implements j
{
  public static final float[] l = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 1.0F };
  public final e0 a;
  public final u b;
  public final boolean[] c;
  public final a d;
  public final r e;
  public b f;
  public long g;
  public String h;
  public v i;
  public boolean j;
  public long k;
  
  public l(e0 parame0)
  {
    a = parame0;
    c = new boolean[4];
    d = new a();
    k = -9223372036854775807L;
    e = new r(178);
    b = new u();
  }
  
  public final void a(u paramu)
  {
    b.K(f);
    b.K(i);
    int m = b;
    int i1 = c;
    byte[] arrayOfByte = a;
    long l1 = g;
    int i2 = i1 - m;
    g = (l1 + i2);
    i.b(i2, paramu);
    for (;;)
    {
      int i3 = q.b(arrayOfByte, m, i1, c);
      if (i3 == i1)
      {
        if (!j) {
          d.a(arrayOfByte, m, i1);
        }
        f.a(arrayOfByte, m, i1);
        paramu = e;
        if (paramu != null) {
          paramu.a(arrayOfByte, m, i1);
        }
        return;
      }
      Object localObject1 = a;
      int i4 = i3 + 3;
      int i5 = localObject1[i4] & 0xFF;
      int i6 = i3 - m;
      int i7;
      if (!j)
      {
        if (i6 > 0) {
          d.a(arrayOfByte, m, i3);
        }
        if (i6 < 0) {
          i2 = -i6;
        } else {
          i2 = 0;
        }
        localObject1 = d;
        i7 = b;
        if (i7 != 0)
        {
          if (i7 != 1)
          {
            if (i7 != 2)
            {
              if (i7 != 3)
              {
                if (i7 == 4)
                {
                  if ((i5 != 179) && (i5 != 181)) {
                    break label404;
                  }
                  c -= i2;
                  a = false;
                  i2 = 1;
                  break label417;
                }
                throw new IllegalStateException();
              }
              if ((i5 & 0xF0) == 32)
              {
                d = c;
                i2 = 4;
                break label374;
              }
            }
            else if (i5 <= 31)
            {
              i2 = 3;
              break label374;
            }
          }
          else {
            if (i5 == 181) {
              break label371;
            }
          }
          m.f("H263Reader", "Unexpected start code value");
          a = false;
          c = 0;
          b = 0;
          break label404;
          label371:
          i2 = 2;
          label374:
          b = i2;
        }
        else if (i5 == 176)
        {
          b = 1;
          a = true;
        }
        label404:
        ((a)localObject1).a(a.f, 0, 3);
        i2 = 0;
        label417:
        if (i2 != 0)
        {
          v localv = i;
          Object localObject2 = d;
          i2 = d;
          localObject1 = h;
          localObject1.getClass();
          localObject2 = Arrays.copyOf(e, c);
          t localt = new t((byte[])localObject2, localObject2.length);
          localt.n(i2);
          localt.n(4);
          localt.l();
          localt.m(8);
          if (localt.f())
          {
            localt.m(4);
            localt.m(3);
          }
          i2 = localt.g(4);
          if (i2 == 15)
          {
            i7 = localt.g(8);
            i2 = localt.g(8);
            if (i2 != 0)
            {
              f1 = i7 / i2;
              break label612;
            }
          }
          else
          {
            localObject3 = l;
            if (i2 < 7)
            {
              f1 = localObject3[i2];
              break label612;
            }
          }
          m.f("H263Reader", "Invalid aspect ratio");
          float f1 = 1.0F;
          label612:
          if (localt.f())
          {
            localt.m(2);
            localt.m(1);
            if (localt.f())
            {
              localt.m(15);
              localt.l();
              localt.m(15);
              localt.l();
              localt.m(15);
              localt.l();
              localt.m(3);
              localt.m(11);
              localt.l();
              localt.m(15);
              localt.l();
            }
          }
          if (localt.g(2) != 0) {
            m.f("H263Reader", "Unhandled video object layer shape");
          }
          localt.l();
          i2 = localt.g(16);
          localt.l();
          if (localt.f()) {
            if (i2 == 0)
            {
              m.f("H263Reader", "Invalid vop_increment_time_resolution");
            }
            else
            {
              i7 = i2 - 1;
              i2 = 0;
              while (i7 > 0)
              {
                i2++;
                i7 >>= 1;
              }
              localt.m(i2);
            }
          }
          localt.l();
          i2 = localt.g(13);
          localt.l();
          i7 = localt.g(13);
          localt.l();
          localt.l();
          Object localObject3 = new i0.a();
          a = ((String)localObject1);
          k = "video/mp4v-es";
          p = i2;
          q = i7;
          t = f1;
          m = Collections.singletonList(localObject2);
          localv.d(new i0((i0.a)localObject3));
          j = true;
        }
      }
      f.a(arrayOfByte, m, i3);
      localObject1 = e;
      if (localObject1 != null)
      {
        if (i6 > 0)
        {
          ((r)localObject1).a(arrayOfByte, m, i3);
          i2 = 0;
        }
        else
        {
          i2 = -i6;
        }
        if (e.b(i2))
        {
          localObject1 = e;
          i2 = q.e(d, e);
          localObject1 = b;
          m = v5.e0.a;
          ((u)localObject1).E(e.d, i2);
          a.a(k, b);
        }
        if ((i5 == 178) && (a[(i3 + 2)] == 1)) {
          e.d(i5);
        }
      }
      i2 = i1 - i3;
      long l2 = g - i2;
      localObject1 = f;
      boolean bool = j;
      if ((e == 182) && (bool) && (b))
      {
        l1 = h;
        if (l1 != -9223372036854775807L)
        {
          i7 = (int)(l2 - g);
          n = d;
          a.c(l1, n, i7, i2, null);
        }
      }
      if (e != 179) {
        g = l2;
      }
      localObject1 = f;
      l1 = k;
      e = i5;
      d = false;
      if ((i5 != 182) && (i5 != 179)) {
        bool = false;
      } else {
        bool = true;
      }
      b = bool;
      if (i5 == 182) {
        bool = true;
      } else {
        bool = false;
      }
      c = bool;
      f = 0;
      h = l1;
      int n = i4;
    }
  }
  
  public final void b()
  {
    q.a(c);
    Object localObject = d;
    a = false;
    c = 0;
    b = 0;
    localObject = f;
    if (localObject != null)
    {
      b = false;
      c = false;
      d = false;
      e = -1;
    }
    localObject = e;
    if (localObject != null) {
      ((r)localObject).c();
    }
    g = 0L;
    k = -9223372036854775807L;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      k = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    h = e;
    paramd.b();
    Object localObject = paramj.r(d, 2);
    i = ((v)localObject);
    f = new b((v)localObject);
    localObject = a;
    if (localObject != null) {
      ((e0)localObject).b(paramj, paramd);
    }
  }
  
  public static final class a
  {
    public static final byte[] f = { 0, 0, 1 };
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e = new byte[''];
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!a) {
        return;
      }
      int i = paramInt2 - paramInt1;
      byte[] arrayOfByte = e;
      int j = arrayOfByte.length;
      paramInt2 = c;
      if (j < paramInt2 + i) {
        e = Arrays.copyOf(arrayOfByte, (paramInt2 + i) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, e, c, i);
      c += i;
    }
  }
  
  public static final class b
  {
    public final v a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    
    public b(v paramv)
    {
      a = paramv;
    }
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (c)
      {
        int i = f;
        int j = paramInt1 + 1 - i;
        if (j < paramInt2)
        {
          boolean bool;
          if ((paramArrayOfByte[j] & 0xC0) >> 6 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          d = bool;
          c = false;
        }
        else
        {
          f = (paramInt2 - paramInt1 + i);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     m4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */