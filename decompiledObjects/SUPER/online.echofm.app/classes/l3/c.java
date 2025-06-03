package l3;

import c3.l.b;
import c3.t;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import k3.l;
import p3.a.b;
import p3.b.b;
import p3.y.c;
import q3.o;
import q3.r;

public final class c
  extends d
{
  public static final l d = l.b(new b(), a.class, g.class);
  
  public c()
  {
    super(p3.a.class, new k3.m[] { new a(t.class) });
  }
  
  public static void o(boolean paramBoolean)
  {
    x.l(new c(), paramBoolean);
    f.c();
    k3.h.c().d(d);
  }
  
  public static void q(p3.c paramc)
  {
    if (paramc.X() >= 10)
    {
      if (paramc.X() <= 16) {
        return;
      }
      throw new GeneralSecurityException("tag size too long");
    }
    throw new GeneralSecurityException("tag size too short");
  }
  
  public static void r(int paramInt)
  {
    if (paramInt == 32) {
      return;
    }
    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesCmacKey";
  }
  
  public d.a f()
  {
    return new b(p3.b.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int m()
  {
    return 0;
  }
  
  public p3.a n(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return p3.a.c0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void p(p3.a parama)
  {
    r.c(parama.a0(), m());
    r(parama.Y().size());
    q(parama.Z());
  }
  
  public class a
    extends k3.m
  {
    public a()
    {
      super();
    }
    
    public t c(p3.a parama)
    {
      return new o(new q3.m(parama.Y().Y()), parama.Z().X());
    }
  }
  
  public class b
    extends d.a
  {
    public b(Class paramClass)
    {
      super();
    }
    
    public Map c()
    {
      HashMap localHashMap = new HashMap();
      p3.b localb = (p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n();
      l.b localb1 = l.b.o;
      localHashMap.put("AES_CMAC", new d.a.a(localb, localb1));
      localHashMap.put("AES256_CMAC", new d.a.a((p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), localb1));
      localHashMap.put("AES256_CMAC_RAW", new d.a.a((p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), l.b.q));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public p3.a f(p3.b paramb)
    {
      return (p3.a)p3.a.b0().A(0).y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(paramb.X()))).z(paramb.Y()).n();
    }
    
    public p3.b g(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return p3.b.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(p3.b paramb)
    {
      c.k(paramb.Y());
      c.l(paramb.X());
    }
  }
}

/* Location:
 * Qualified Name:     l3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */