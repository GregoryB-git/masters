package c3;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k3.i;
import k3.o;
import k3.s;
import p3.C;
import p3.C.c;
import p3.D;
import p3.I;
import p3.t;
import p3.t.b;
import p3.y;

public final class n
{
  public final C a;
  public final List b;
  public final n3.a c;
  
  public n(C paramC, List paramList)
  {
    a = paramC;
    b = paramList;
    c = n3.a.b;
  }
  
  public static void a(t paramt)
  {
    if ((paramt != null) && (paramt.X().size() != 0)) {
      return;
    }
    throw new GeneralSecurityException("empty keyset");
  }
  
  public static void b(C paramC)
  {
    if ((paramC != null) && (paramC.a0() > 0)) {
      return;
    }
    throw new GeneralSecurityException("empty keyset");
  }
  
  public static C c(t paramt, a parama, byte[] paramArrayOfByte)
  {
    try
    {
      paramt = C.f0(parama.b(paramt.X().Y(), paramArrayOfByte), com.google.crypto.tink.shaded.protobuf.p.b());
      b(paramt);
      return paramt;
    }
    catch (A paramt)
    {
      throw new GeneralSecurityException("invalid keyset, corrupted key material");
    }
  }
  
  public static t d(C paramC, a parama, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = parama.a(paramC.f(), paramArrayOfByte);
    try
    {
      boolean bool = C.f0(parama.b(arrayOfByte, paramArrayOfByte), com.google.crypto.tink.shaded.protobuf.p.b()).equals(paramC);
      if (bool) {
        return (t)t.Y().y(h.i(arrayOfByte)).z(z.b(paramC)).n();
      }
      paramC = new java/security/GeneralSecurityException;
      paramC.<init>("cannot encrypt keyset");
      throw paramC;
    }
    catch (A paramC)
    {
      throw new GeneralSecurityException("invalid keyset, corrupted key material");
    }
  }
  
  public static final n e(C paramC)
  {
    b(paramC);
    return new n(paramC, f(paramC));
  }
  
  public static List f(C paramC)
  {
    ArrayList localArrayList = new ArrayList(paramC.a0());
    Iterator localIterator = paramC.b0().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (C.c)localIterator.next();
      int i = ((C.c)localObject1).a0();
      Object localObject2 = q((C.c)localObject1);
      try
      {
        g localg = i.a().d((o)localObject2, f.a());
        localObject2 = new c3/n$b;
        localObject1 = m(((C.c)localObject1).c0());
        if (i == paramC.c0()) {}
        for (boolean bool = true;; bool = false) {
          break;
        }
        ((b)localObject2).<init>(localg, (k)localObject1, i, bool, null);
        localArrayList.add(localObject2);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localArrayList.add(null);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static Object j(C.c paramc, Class paramClass)
  {
    try
    {
      paramc = x.g(paramc.Z(), paramClass);
      return paramc;
    }
    catch (GeneralSecurityException paramc)
    {
      if ((!paramc.getMessage().contains("No key manager found for key type ")) && (!paramc.getMessage().contains(" not supported by key manager of type "))) {
        throw paramc;
      }
    }
    return null;
  }
  
  public static k m(p3.z paramz)
  {
    int i = a.a[paramz.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return k.d;
        }
        throw new GeneralSecurityException("Unknown key status");
      }
      return k.c;
    }
    return k.b;
  }
  
  public static final n n(p paramp, a parama)
  {
    return o(paramp, parama, new byte[0]);
  }
  
  public static final n o(p paramp, a parama, byte[] paramArrayOfByte)
  {
    paramp = paramp.a();
    a(paramp);
    return e(c(paramp, parama, paramArrayOfByte));
  }
  
  public static o q(C.c paramc)
  {
    int i = paramc.a0();
    Integer localInteger;
    if (paramc.b0() == I.s) {
      localInteger = null;
    } else {
      localInteger = Integer.valueOf(i);
    }
    try
    {
      paramc = o.b(paramc.Z().a0(), paramc.Z().b0(), paramc.Z().Z(), paramc.b0(), localInteger);
      return paramc;
    }
    catch (GeneralSecurityException paramc)
    {
      throw new s("Creating a protokey serialization failed", paramc);
    }
  }
  
  public final Object g(g paramg, Class paramClass)
  {
    try
    {
      paramg = x.c(paramg, paramClass);
      return paramg;
    }
    catch (GeneralSecurityException paramg) {}
    return null;
  }
  
  public C h()
  {
    return a;
  }
  
  public D i()
  {
    return z.b(a);
  }
  
  public Object k(Class paramClass)
  {
    Object localObject = x.d(paramClass);
    if (localObject != null) {
      return l(paramClass, (Class)localObject);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No wrapper found for ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new GeneralSecurityException(((StringBuilder)localObject).toString());
  }
  
  public final Object l(Class paramClass1, Class paramClass2)
  {
    z.d(a);
    v.b localb = v.j(paramClass2);
    localb.e(c);
    for (int i = 0; i < p(); i++)
    {
      C.c localc = a.Z(i);
      if (localc.c0().equals(p3.z.q))
      {
        Object localObject1 = j(localc, paramClass2);
        Object localObject2;
        if (b.get(i) != null) {
          localObject2 = g(((b)b.get(i)).a(), paramClass2);
        } else {
          localObject2 = null;
        }
        if (localc.a0() == a.c0()) {
          localb.b(localObject2, localObject1, localc);
        } else {
          localb.a(localObject2, localObject1, localc);
        }
      }
    }
    return x.o(localb.d(), paramClass1);
  }
  
  public int p()
  {
    return a.a0();
  }
  
  public void r(q paramq, a parama)
  {
    s(paramq, parama, new byte[0]);
  }
  
  public void s(q paramq, a parama, byte[] paramArrayOfByte)
  {
    paramq.a(d(a, parama, paramArrayOfByte));
  }
  
  public String toString()
  {
    return i().toString();
  }
  
  public static final class b
  {
    public final g a;
    public final k b;
    public final int c;
    public final boolean d;
    
    public b(g paramg, k paramk, int paramInt, boolean paramBoolean)
    {
      a = paramg;
      b = paramk;
      c = paramInt;
      d = paramBoolean;
    }
    
    public g a()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     c3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */