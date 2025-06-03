package d3;

import c3.a;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import h3.b.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import p3.l;
import p3.m.b;
import p3.y.c;
import q3.c;
import q3.r;

public final class p
  extends d
{
  public p()
  {
    super(l.class, new k3.m[] { new a(a.class) });
  }
  
  public static d.a.a l(int paramInt, c3.l.b paramb)
  {
    return new d.a.a((p3.m)p3.m.X().y(paramInt).n(), paramb);
  }
  
  public static void o(boolean paramBoolean)
  {
    x.l(new p(), paramBoolean);
    s.c();
  }
  
  public b.b a()
  {
    return b.b.p;
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesGcmKey";
  }
  
  public d.a f()
  {
    return new b(p3.m.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int m()
  {
    return 0;
  }
  
  public l n(h paramh)
  {
    return l.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void p(l paraml)
  {
    r.c(paraml.Y(), m());
    r.a(paraml.X().size());
  }
  
  public class a
    extends k3.m
  {
    public a()
    {
      super();
    }
    
    public a c(l paraml)
    {
      return new c(paraml.X().Y());
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
      c3.l.b localb1 = c3.l.b.o;
      localHashMap.put("AES128_GCM", p.k(16, localb1));
      c3.l.b localb2 = c3.l.b.q;
      localHashMap.put("AES128_GCM_RAW", p.k(16, localb2));
      localHashMap.put("AES256_GCM", p.k(32, localb1));
      localHashMap.put("AES256_GCM_RAW", p.k(32, localb2));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public l f(p3.m paramm)
    {
      return (l)l.Z().y(h.i(q3.p.c(paramm.W()))).z(m()).n();
    }
    
    public p3.m g(h paramh)
    {
      return p3.m.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(p3.m paramm)
    {
      r.a(paramm.W());
    }
  }
}

/* Location:
 * Qualified Name:     d3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */