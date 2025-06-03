package i3;

import c3.e;
import c3.l.b;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import k3.m;
import p3.p.b;
import p3.q;
import p3.q.b;
import p3.y.c;
import q3.r;

public final class a
  extends k3.d
{
  public a()
  {
    super(p3.p.class, new m[] { new a(e.class) });
  }
  
  public static void m(boolean paramBoolean)
  {
    x.l(new a(), paramBoolean);
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesSivKey";
  }
  
  public d.a f()
  {
    return new b(q.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int k()
  {
    return 0;
  }
  
  public p3.p l(h paramh)
  {
    return p3.p.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void n(p3.p paramp)
  {
    r.c(paramp.Y(), k());
    if (paramp.X().size() == 64) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("invalid key size: ");
    localStringBuilder.append(paramp.X().size());
    localStringBuilder.append(". Valid keys must have ");
    localStringBuilder.append(64);
    localStringBuilder.append(" bytes.");
    throw new InvalidKeyException(localStringBuilder.toString());
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public e c(p3.p paramp)
    {
      return new q3.d(paramp.X().Y());
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
      localHashMap.put("AES256_SIV", new d.a.a((q)q.X().y(64).n(), l.b.o));
      localHashMap.put("AES256_SIV_RAW", new d.a.a((q)q.X().y(64).n(), l.b.q));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public p3.p f(q paramq)
    {
      return (p3.p)p3.p.Z().y(h.i(q3.p.c(paramq.W()))).z(k()).n();
    }
    
    public q g(h paramh)
    {
      return q.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(q paramq)
    {
      if (paramq.W() == 64) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("invalid key size: ");
      localStringBuilder.append(paramq.W());
      localStringBuilder.append(". Valid keys must have ");
      localStringBuilder.append(64);
      localStringBuilder.append(" bytes.");
      throw new InvalidAlgorithmParameterException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     i3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */