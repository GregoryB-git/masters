package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import k3.m;
import p3.n;
import p3.n.b;
import p3.o;
import p3.o.b;
import p3.y.c;
import q3.r;

public final class u
  extends d
{
  public u()
  {
    super(n.class, new m[] { new a(c3.a.class) });
  }
  
  public static boolean l()
  {
    try
    {
      Cipher.getInstance("AES/GCM-SIV/NoPadding");
      return true;
    }
    catch (NoSuchAlgorithmException|NoSuchPaddingException localNoSuchAlgorithmException) {}
    return false;
  }
  
  private static d.a.a m(int paramInt, l.b paramb)
  {
    return new d.a.a((o)o.X().y(paramInt).n(), paramb);
  }
  
  public static void p(boolean paramBoolean)
  {
    if (l())
    {
      c3.x.l(new u(), paramBoolean);
      x.c();
    }
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
  }
  
  public d.a f()
  {
    return new b(o.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int n()
  {
    return 0;
  }
  
  public n o(h paramh)
  {
    return n.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void q(n paramn)
  {
    r.c(paramn.Y(), n());
    r.a(paramn.X().size());
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public c3.a c(n paramn)
    {
      return new f3.a(paramn.X().Y());
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
      localHashMap.put("AES128_GCM_SIV", u.k(16, localb1));
      l.b localb2 = l.b.q;
      localHashMap.put("AES128_GCM_SIV_RAW", u.k(16, localb2));
      localHashMap.put("AES256_GCM_SIV", u.k(32, localb1));
      localHashMap.put("AES256_GCM_SIV_RAW", u.k(32, localb2));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public n f(o paramo)
    {
      return (n)n.Z().y(h.i(q3.p.c(paramo.W()))).z(n()).n();
    }
    
    public o g(h paramh)
    {
      return o.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(o paramo)
    {
      r.a(paramo.W());
    }
  }
}

/* Location:
 * Qualified Name:     d3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */