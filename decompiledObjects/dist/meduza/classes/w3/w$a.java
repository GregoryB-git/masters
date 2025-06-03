package w3;

import java.util.AbstractCollection;
import java.util.List;
import o7.l0;
import o7.m0;
import o7.t;
import o7.u.a;
import v3.f1;
import v3.r1;
import v3.r1.b;
import v5.e0;
import x6.b;
import z4.s;
import z4.t.b;

public final class w$a
{
  public final r1.b a;
  public t<t.b> b;
  public m0 c;
  public t.b d;
  public t.b e;
  public t.b f;
  
  public w$a(r1.b paramb)
  {
    a = paramb;
    paramb = t.b;
    b = l0.e;
    c = m0.o;
  }
  
  public static t.b b(f1 paramf1, t<t.b> paramt, t.b paramb, r1.b paramb1)
  {
    r1 localr1 = paramf1.J();
    int i = paramf1.p();
    Object localObject;
    if (localr1.p()) {
      localObject = null;
    } else {
      localObject = localr1.l(i);
    }
    if ((!paramf1.g()) && (!localr1.p())) {
      i = localr1.f(i, paramb1, false).b(e0.I(paramf1.P()) - e);
    } else {
      i = -1;
    }
    for (int j = 0; j < paramt.size(); j++)
    {
      paramb1 = (t.b)paramt.get(j);
      if (c(paramb1, localObject, paramf1.g(), paramf1.E(), paramf1.r(), i)) {
        return paramb1;
      }
    }
    if ((paramt.isEmpty()) && (paramb != null) && (c(paramb, localObject, paramf1.g(), paramf1.E(), paramf1.r(), i))) {
      return paramb;
    }
    return null;
  }
  
  public static boolean c(t.b paramb, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
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
  
  public final void a(u.a<t.b, r1> parama, t.b paramb, r1 paramr1)
  {
    if (paramb == null) {
      return;
    }
    if (paramr1.b(a) == -1)
    {
      paramr1 = (r1)c.get(paramb);
      if (paramr1 == null) {}
    }
    else
    {
      parama.b(paramb, paramr1);
    }
  }
  
  public final void d(r1 paramr1)
  {
    u.a locala = new u.a(4);
    if (b.isEmpty())
    {
      a(locala, e, paramr1);
      if (!b.Q(f, e)) {
        a(locala, f, paramr1);
      }
      if ((b.Q(d, e)) || (b.Q(d, f))) {
        break label146;
      }
    }
    else
    {
      for (int i = 0; i < b.size(); i++) {
        a(locala, (t.b)b.get(i), paramr1);
      }
      if (b.contains(d)) {
        break label146;
      }
    }
    a(locala, d, paramr1);
    label146:
    c = locala.a();
  }
}

/* Location:
 * Qualified Name:     w3.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */