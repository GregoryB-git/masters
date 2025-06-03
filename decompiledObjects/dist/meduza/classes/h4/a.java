package h4;

import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import c4.v;
import java.util.List;
import k4.g;
import org.xmlpull.v1.XmlPullParserException;
import p4.a.b;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.m;
import v5.u;

public final class a
  implements h
{
  public final u a = new u(6);
  public j b;
  public int c;
  public int d;
  public int e;
  public long f = -1L;
  public v4.b g;
  public i h;
  public c i;
  public g j;
  
  public final void a()
  {
    c(new a.b[0]);
    j localj = b;
    localj.getClass();
    localj.m();
    b.t(new t.b(-9223372036854775807L));
    c = 6;
  }
  
  public final void b(j paramj)
  {
    b = paramj;
  }
  
  public final void c(a.b... paramVarArgs)
  {
    Object localObject = b;
    localObject.getClass();
    v localv = ((j)localObject).r(1024, 4);
    localObject = new i0.a();
    j = "image/jpeg";
    i = new p4.a(paramVarArgs);
    localv.d(new i0((i0.a)localObject));
  }
  
  public final int d(i parami, s params)
  {
    int k = c;
    int m = 4;
    if (k != 0)
    {
      if (k != 1)
      {
        long l1;
        long l2;
        if (k != 2)
        {
          if (k != 4)
          {
            if (k != 5)
            {
              if (k == 6) {
                return -1;
              }
              throw new IllegalStateException();
            }
            if ((i == null) || (parami != h))
            {
              h = parami;
              i = new c(parami, f);
            }
            parami = j;
            parami.getClass();
            m = parami.d(i, params);
            if (m == 1) {
              a += f;
            }
            return m;
          }
          l1 = parami.getPosition();
          l2 = f;
          if (l1 != l2)
          {
            a = l2;
            return 1;
          }
          if (parami.c(a.a, 0, 1, true))
          {
            parami.i();
            if (j == null) {
              j = new g();
            }
            parami = new c(parami, f);
            i = parami;
            if (j.i(parami))
            {
              params = j;
              l1 = f;
              parami = b;
              parami.getClass();
              r = new d(l1, parami);
              parami = g;
              parami.getClass();
              c(new a.b[] { parami });
              c = 5;
              break label301;
            }
          }
          a();
          label301:
          return 0;
        }
        if (d == 65505)
        {
          params = new u(e);
          parami.readFully(a, 0, e);
          if ((g == null) && ("http://ns.adobe.com/xap/1.0/".equals(params.p())))
          {
            params = params.p();
            if (params != null)
            {
              long l3 = parami.getLength();
              Object localObject = null;
              if (l3 == -1L)
              {
                params = (s)localObject;
              }
              else
              {
                try
                {
                  parami = e.a(params);
                }
                catch (XmlPullParserException|a1|NumberFormatException parami)
                {
                  m.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                  parami = null;
                }
                if (parami == null)
                {
                  params = (s)localObject;
                }
                else if (b.size() < 2)
                {
                  params = (s)localObject;
                }
                else
                {
                  k = b.size() - 1;
                  long l4 = -1L;
                  l1 = l4;
                  l2 = l1;
                  long l5 = l2;
                  m = 0;
                  long l6 = l2;
                  long l7 = l1;
                  l1 = l3;
                  while (k >= 0)
                  {
                    params = (b.a)b.get(k);
                    int n = m | "video/mp4".equals(a);
                    if (k == 0)
                    {
                      l2 = l1 - c;
                      l1 = 0L;
                    }
                    else
                    {
                      l3 = b;
                      l2 = l1;
                      l1 -= l3;
                    }
                    m = n;
                    long l8 = l6;
                    l3 = l5;
                    if (n != 0)
                    {
                      m = n;
                      l8 = l6;
                      l3 = l5;
                      if (l1 != l2)
                      {
                        l3 = l2 - l1;
                        m = 0;
                        l8 = l1;
                      }
                    }
                    if (k == 0)
                    {
                      l4 = l1;
                      l7 = l2;
                    }
                    k--;
                    l6 = l8;
                    l5 = l3;
                  }
                  params = (s)localObject;
                  if (l6 != -1L)
                  {
                    params = (s)localObject;
                    if (l5 != -1L)
                    {
                      params = (s)localObject;
                      if (l4 != -1L) {
                        if (l7 == -1L) {
                          params = (s)localObject;
                        } else {
                          params = new v4.b(l4, l7, a, l6, l5);
                        }
                      }
                    }
                  }
                }
              }
              g = params;
              if (params != null) {
                f = d;
              }
            }
          }
        }
        else
        {
          parami.j(e);
        }
        c = 0;
        return 0;
      }
      a.D(2);
      parami.readFully(a.a, 0, 2);
      e = (a.A() - 2);
      c = 2;
      return 0;
    }
    a.D(2);
    parami.readFully(a.a, 0, 2);
    k = a.A();
    d = k;
    if (k == 65498)
    {
      if (f == -1L)
      {
        a();
        break label870;
      }
    }
    else
    {
      if (((k >= 65488) && (k <= 65497)) || (k == 65281)) {
        break label870;
      }
      m = 1;
    }
    c = m;
    label870:
    return 0;
  }
  
  public final int e(c4.e parame)
  {
    a.D(2);
    parame.c(a.a, 0, 2, false);
    return a.A();
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L)
    {
      c = 0;
      j = null;
    }
    else if (c == 5)
    {
      g localg = j;
      localg.getClass();
      localg.f(paramLong1, paramLong2);
    }
  }
  
  public final boolean i(i parami)
  {
    parami = (c4.e)parami;
    int k = e(parami);
    boolean bool1 = false;
    if (k != 65496) {
      return false;
    }
    k = e(parami);
    d = k;
    if (k == 65504)
    {
      a.D(2);
      parami.c(a.a, 0, 2, false);
      parami.k(a.A() - 2, false);
      d = e(parami);
    }
    if (d != 65505) {
      return false;
    }
    parami.k(2, false);
    a.D(6);
    parami.c(a.a, 0, 6, false);
    boolean bool2 = bool1;
    if (a.w() == 1165519206L)
    {
      bool2 = bool1;
      if (a.A() == 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final void release()
  {
    g localg = j;
    if (localg != null) {
      localg.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     h4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */