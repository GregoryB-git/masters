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
import p3.r.b;
import p3.s;
import p3.y.c;
import q3.g;

public class z
  extends d
{
  public z()
  {
    super(p3.r.class, new m[] { new a(a.class) });
  }
  
  public static void m(boolean paramBoolean)
  {
    x.l(new z(), paramBoolean);
    C.c();
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
  }
  
  public d.a f()
  {
    return new b(s.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int k()
  {
    return 0;
  }
  
  public p3.r l(h paramh)
  {
    return p3.r.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void n(p3.r paramr)
  {
    q3.r.c(paramr.Y(), k());
    if (paramr.X().size() == 32) {
      return;
    }
    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(p3.r paramr)
    {
      return new g(paramr.X().Y());
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
      localHashMap.put("CHACHA20_POLY1305", new d.a.a(s.V(), l.b.o));
      localHashMap.put("CHACHA20_POLY1305_RAW", new d.a.a(s.V(), l.b.q));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public p3.r f(s params)
    {
      return (p3.r)p3.r.Z().z(k()).y(h.i(q3.p.c(32))).n();
    }
    
    public s g(h paramh)
    {
      return s.W(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(s params) {}
  }
}

/* Location:
 * Qualified Name:     d3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */