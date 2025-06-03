package d3;

import c3.a;
import c3.l.b;
import c3.t;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import h3.b.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import k3.m;
import l3.k;
import p3.d.b;
import p3.g;
import p3.g.b;
import p3.h.b;
import p3.u;
import p3.v;
import p3.w;
import p3.w.b;
import p3.x.b;
import p3.y.c;
import q3.l;
import q3.r;

public final class e
  extends k3.d
{
  public e()
  {
    super(p3.d.class, new m[] { new a(a.class) });
  }
  
  public static d.a.a l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, u paramu, l.b paramb)
  {
    return new d.a.a(m(paramInt1, paramInt2, paramInt3, paramInt4, paramu), paramb);
  }
  
  public static p3.e m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, u paramu)
  {
    g localg = (g)g.a0().z((p3.h)p3.h.Y().y(paramInt2).n()).y(paramInt1).n();
    paramu = (w)w.a0().z((p3.x)p3.x.a0().y(paramu).z(paramInt4).n()).y(paramInt3).n();
    return (p3.e)p3.e.Z().y(localg).z(paramu).n();
  }
  
  public static void p(boolean paramBoolean)
  {
    c3.x.l(new e(), paramBoolean);
  }
  
  public b.b a()
  {
    return b.b.p;
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
  }
  
  public d.a f()
  {
    return new b(p3.e.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int n()
  {
    return 0;
  }
  
  public p3.d o(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return p3.d.c0(paramh, p.b());
  }
  
  public void q(p3.d paramd)
  {
    r.c(paramd.a0(), n());
    new f().n(paramd.Y());
    new k().q(paramd.Z());
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(p3.d paramd)
    {
      return new q3.h((l)new f().e(paramd.Y(), l.class), (t)new k().e(paramd.Z(), t.class), paramd.Z().a0().Z());
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
      u localu = u.s;
      l.b localb1 = l.b.o;
      localHashMap.put("AES128_CTR_HMAC_SHA256", e.k(16, 16, 32, 16, localu, localb1));
      l.b localb2 = l.b.q;
      localHashMap.put("AES128_CTR_HMAC_SHA256_RAW", e.k(16, 16, 32, 16, localu, localb2));
      localHashMap.put("AES256_CTR_HMAC_SHA256", e.k(32, 16, 32, 32, localu, localb1));
      localHashMap.put("AES256_CTR_HMAC_SHA256_RAW", e.k(32, 16, 32, 32, localu, localb2));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public p3.d f(p3.e parame)
    {
      p3.f localf = (p3.f)new f().f().a(parame.X());
      parame = (v)new k().f().a(parame.Y());
      return (p3.d)p3.d.b0().y(localf).z(parame).A(n()).n();
    }
    
    public p3.e g(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return p3.e.a0(paramh, p.b());
    }
    
    public void h(p3.e parame)
    {
      new f().f().e(parame.X());
      new k().f().e(parame.Y());
      r.a(parame.X().Y());
    }
  }
}

/* Location:
 * Qualified Name:     d3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */