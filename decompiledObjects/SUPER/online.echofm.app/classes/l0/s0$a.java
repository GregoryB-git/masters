package l0;

import W2.k;
import X2.B;
import X2.v;
import X2.w;
import X2.w.a;
import d0.D;
import d0.I;
import d0.I.b;
import g0.M;
import g0.a;
import java.util.AbstractCollection;
import java.util.List;
import x0.x.b;

public final class s0$a
{
  public final I.b a;
  public v b;
  public w c;
  public x.b d;
  public x.b e;
  public x.b f;
  
  public s0$a(I.b paramb)
  {
    a = paramb;
    b = v.Y();
    c = w.j();
  }
  
  public static x.b c(D paramD, v paramv, x.b paramb, I.b paramb1)
  {
    I localI = paramD.L();
    int i = paramD.C();
    Object localObject;
    if (localI.q()) {
      localObject = null;
    } else {
      localObject = localI.m(i);
    }
    if ((!paramD.o()) && (!localI.q())) {
      i = localI.f(i, paramb1).d(M.J0(paramD.P()) - paramb1.n());
    } else {
      i = -1;
    }
    for (int j = 0; j < paramv.size(); j++)
    {
      paramb1 = (x.b)paramv.get(j);
      if (i(paramb1, localObject, paramD.o(), paramD.D(), paramD.H(), i)) {
        return paramb1;
      }
    }
    if ((paramv.isEmpty()) && (paramb != null) && (i(paramb, localObject, paramD.o(), paramD.D(), paramD.H(), i))) {
      return paramb;
    }
    return null;
  }
  
  public static boolean i(x.b paramb, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = a.equals(paramObject);
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if ((!paramBoolean) || (b != paramInt1) || (c != paramInt2))
    {
      bool1 = bool2;
      if (!paramBoolean)
      {
        bool1 = bool2;
        if (b == -1)
        {
          bool1 = bool2;
          if (e != paramInt3) {}
        }
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public final void b(w.a parama, x.b paramb, I paramI)
  {
    if (paramb == null) {
      return;
    }
    if (paramI.b(a) != -1) {}
    do
    {
      parama.f(paramb, paramI);
      break;
      paramI = (I)c.get(paramb);
    } while (paramI != null);
  }
  
  public x.b d()
  {
    return d;
  }
  
  public x.b e()
  {
    x.b localb;
    if (b.isEmpty()) {
      localb = null;
    } else {
      localb = (x.b)B.d(b);
    }
    return localb;
  }
  
  public I f(x.b paramb)
  {
    return (I)c.get(paramb);
  }
  
  public x.b g()
  {
    return e;
  }
  
  public x.b h()
  {
    return f;
  }
  
  public void j(D paramD)
  {
    d = c(paramD, b, e, a);
  }
  
  public void k(List paramList, x.b paramb, D paramD)
  {
    b = v.U(paramList);
    if (!paramList.isEmpty())
    {
      e = ((x.b)paramList.get(0));
      f = ((x.b)a.e(paramb));
    }
    if (d == null) {
      d = c(paramD, b, e, a);
    }
    m(paramD.L());
  }
  
  public void l(D paramD)
  {
    d = c(paramD, b, e, a);
    m(paramD.L());
  }
  
  public final void m(I paramI)
  {
    w.a locala = w.a();
    if (b.isEmpty())
    {
      b(locala, e, paramI);
      if (!k.a(f, e)) {
        b(locala, f, paramI);
      }
      if ((k.a(d, e)) || (k.a(d, f))) {}
    }
    else
    {
      do
      {
        b(locala, d, paramI);
        break;
        for (int i = 0; i < b.size(); i++) {
          b(locala, (x.b)b.get(i), paramI);
        }
      } while (!b.contains(d));
    }
    c = locala.c();
  }
}

/* Location:
 * Qualified Name:     l0.s0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */