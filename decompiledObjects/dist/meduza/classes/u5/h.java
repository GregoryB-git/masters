package u5;

import android.net.Uri;
import b.z;
import f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import q3.j;
import t5.n;

public final class h
{
  public final c a;
  public final a b;
  public final n c;
  public final String d;
  public final byte[] e;
  public final a f;
  public long g;
  public long h;
  public long i;
  public volatile boolean j;
  
  public h(c paramc, n paramn, j paramj)
  {
    a = paramc;
    b = a;
    c = paramn;
    e = new byte[131072];
    f = paramj;
    paramc = h;
    if (paramc == null) {
      paramc = a.toString();
    }
    d = paramc;
    g = f;
  }
  
  public final void a()
  {
    if (!j)
    {
      Object localObject1 = b;
      Object localObject4 = d;
      Object localObject5 = c;
      i = ((a)localObject1).d(f, g, (String)localObject4);
      localObject1 = c;
      long l1 = g;
      long l2 = -1L;
      long l3;
      if (l1 != -1L)
      {
        h = (f + l1);
      }
      else
      {
        l3 = f.d(b.c(d));
        l1 = l3;
        if (l3 == -1L) {
          l1 = -1L;
        }
        h = l1;
      }
      localObject1 = f;
      l1 = l2;
      if (localObject1 != null)
      {
        if (h != -1L) {
          l1 = c.f;
        }
        l1 = i;
        ((j)localObject1).b(l1);
        l1 = l2;
      }
      for (;;)
      {
        l2 = h;
        if ((l2 != -1L) && (g >= l2)) {
          return;
        }
        if (j) {
          break;
        }
        l2 = h;
        if (l2 == -1L) {
          l2 = Long.MAX_VALUE;
        } else {
          l2 -= g;
        }
        localObject5 = b;
        localObject1 = d;
        l2 = ((a)localObject5).j(g, l2, (String)localObject1);
        long l4;
        if (l2 > 0L)
        {
          l3 = g;
          l4 = l2;
        }
        else
        {
          l1 = -l2;
          if (l1 == Long.MAX_VALUE) {
            l1 = -1L;
          }
          l3 = g;
          l2 = h;
          int k = 1;
          if ((l3 + l1 != l2) && (l1 != -1L)) {
            m = 0;
          } else {
            m = 1;
          }
          Object localObject6;
          int n;
          byte[] arrayOfByte;
          if (l1 != -1L)
          {
            localObject6 = c;
            localObject6.getClass();
            localObject5 = a;
            l2 = b;
            n = c;
            arrayOfByte = d;
            localObject4 = e;
            localObject1 = h;
            i1 = i;
            localObject6 = j;
            if (localObject5 != null)
            {
              localObject1 = new n((Uri)localObject5, l2, n, arrayOfByte, (Map)localObject4, l3, l1, (String)localObject1, i1, localObject6);
              try
              {
                l1 = a.a((n)localObject1);
              }
              catch (IOException localIOException1)
              {
                z.d(a);
                break label496;
              }
            }
            else
            {
              throw new IllegalStateException("The uri must be set.");
            }
          }
          label496:
          l1 = -1L;
          k = 0;
          int i1 = m;
          if (k == 0)
          {
            if (!j)
            {
              localObject6 = c;
              localObject6.getClass();
              Object localObject2 = a;
              l1 = b;
              m = c;
              arrayOfByte = d;
              localObject4 = e;
              localObject5 = h;
              k = i;
              localObject6 = j;
              if (localObject2 != null)
              {
                localObject2 = new n((Uri)localObject2, l1, m, arrayOfByte, (Map)localObject4, l3, -1L, (String)localObject5, k, localObject6);
                try
                {
                  l2 = a.a((n)localObject2);
                }
                catch (IOException localIOException2)
                {
                  z.d(a);
                  throw localIOException2;
                }
              }
              else
              {
                throw new IllegalStateException("The uri must be set.");
              }
            }
            else
            {
              throw new InterruptedIOException();
            }
          }
          else {
            l2 = l1;
          }
          l1 = l3;
          if ((i1 != 0) && (l2 != -1L))
          {
            l2 += l1;
            try
            {
              if (h != l2)
              {
                h = l2;
                a locala = f;
                if (locala != null)
                {
                  if (l2 != -1L) {
                    l2 = c.f;
                  }
                  l2 = i;
                  ((j)locala).b(l2);
                }
              }
            }
            catch (IOException localIOException3)
            {
              break label970;
            }
          }
          k = 0;
          int m = 0;
          Object localObject3;
          while (m != -1) {
            if (!j)
            {
              localObject3 = a;
              localObject5 = e;
              n = ((c)localObject3).read((byte[])localObject5, 0, localObject5.length);
              m = n;
              if (n != -1)
              {
                l2 = n;
                l2 = i + l2;
                i = l2;
                localObject3 = f;
                if (localObject3 != null)
                {
                  if (h != -1L) {
                    l3 = c.f;
                  }
                  ((j)localObject3).b(l2);
                }
                k += n;
                m = n;
              }
            }
            else
            {
              localObject3 = new java/io/InterruptedIOException;
              ((InterruptedIOException)localObject3).<init>();
              throw ((Throwable)localObject3);
            }
          }
          if (i1 != 0)
          {
            l2 = k + l1;
            if (h != l2)
            {
              h = l2;
              localObject3 = f;
              if (localObject3 != null)
              {
                if (l2 != -1L) {
                  l2 = c.f;
                }
                l2 = i;
                ((j)localObject3).b(l2);
                break label979;
                label970:
                z.d(a);
                throw ((Throwable)localObject3);
              }
            }
          }
          label979:
          l3 = -1L;
          a.close();
          l4 = k;
          l2 = l1;
          l1 = l3;
          l3 = l2;
        }
        g = (l3 + l4);
      }
      throw new InterruptedIOException();
    }
    throw new InterruptedIOException();
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     u5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */