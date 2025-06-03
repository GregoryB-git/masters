package d3;

import c3.a;
import c3.l.b;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import k3.m;
import p3.K.b;
import p3.L;
import p3.y.c;
import q3.r;
import q3.s;

public class H
  extends d
{
  public H()
  {
    super(p3.K.class, new m[] { new a(a.class) });
  }
  
  public static void m(boolean paramBoolean)
  {
    x.l(new H(), paramBoolean);
    K.c();
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
  }
  
  public d.a f()
  {
    return new b(L.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int k()
  {
    return 0;
  }
  
  public p3.K l(h paramh)
  {
    return p3.K.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void n(p3.K paramK)
  {
    r.c(paramK.Y(), k());
    if (paramK.X().size() == 32) {
      return;
    }
    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(p3.K paramK)
    {
      return new s(paramK.X().Y());
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
      localHashMap.put("XCHACHA20_POLY1305", new d.a.a(L.V(), l.b.o));
      localHashMap.put("XCHACHA20_POLY1305_RAW", new d.a.a(L.V(), l.b.q));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public p3.K f(L paramL)
    {
      return (p3.K)p3.K.Z().z(k()).y(h.i(q3.p.c(32))).n();
    }
    
    public L g(h paramh)
    {
      return L.W(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(L paramL) {}
  }
}

/* Location:
 * Qualified Name:     d3.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */