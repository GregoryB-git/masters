package d3;

import c3.a;
import c3.l.b;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import k3.m;
import p3.i;
import p3.i.b;
import p3.j;
import p3.j.b;
import p3.k;
import p3.k.b;
import p3.y.c;
import q3.b;
import q3.r;

public final class h
  extends d
{
  public h()
  {
    super(i.class, new m[] { new a(a.class) });
  }
  
  public static d.a.a l(int paramInt1, int paramInt2, l.b paramb)
  {
    return new d.a.a((j)j.Z().y(paramInt1).z((k)k.Y().y(paramInt2).n()).n(), paramb);
  }
  
  public static void o(boolean paramBoolean)
  {
    x.l(new h(), paramBoolean);
    n.c();
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesEaxKey";
  }
  
  public d.a f()
  {
    return new b(j.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int m()
  {
    return 0;
  }
  
  public i n(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return i.c0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void p(i parami)
  {
    r.c(parami.a0(), m());
    r.a(parami.Y().size());
    if ((parami.Z().X() != 12) && (parami.Z().X() != 16)) {
      throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(i parami)
    {
      return new b(parami.Y().Y(), parami.Z().X());
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
      l.b localb1 = l.b.o;
      localHashMap.put("AES128_EAX", h.k(16, 16, localb1));
      l.b localb2 = l.b.q;
      localHashMap.put("AES128_EAX_RAW", h.k(16, 16, localb2));
      localHashMap.put("AES256_EAX", h.k(32, 16, localb1));
      localHashMap.put("AES256_EAX_RAW", h.k(32, 16, localb2));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public i f(j paramj)
    {
      return (i)i.b0().y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(paramj.X()))).z(paramj.Y()).A(m()).n();
    }
    
    public j g(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return j.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(j paramj)
    {
      r.a(paramj.X());
      if ((paramj.Y().X() != 12) && (paramj.Y().X() != 16)) {
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
      }
    }
  }
}

/* Location:
 * Qualified Name:     d3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */