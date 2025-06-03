package d3;

import c3.a;
import c3.s;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import k3.d;
import k3.d.a;
import k3.m;
import p3.G;
import p3.G.b;
import p3.H;
import p3.y.c;

public class F
  extends d
{
  public F()
  {
    super(G.class, new m[] { new a(a.class) });
  }
  
  public static void m(boolean paramBoolean)
  {
    x.l(new F(), paramBoolean);
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
  }
  
  public d.a f()
  {
    return new b(H.class);
  }
  
  public y.c g()
  {
    return y.c.t;
  }
  
  public int k()
  {
    return 0;
  }
  
  public G l(h paramh)
  {
    return G.a0(paramh, p.b());
  }
  
  public void n(G paramG)
  {
    q3.r.c(paramG.Y(), k());
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(G paramG)
    {
      Object localObject = paramG.X().X();
      localObject = s.a((String)localObject).a((String)localObject);
      return new E(paramG.X().W(), (a)localObject);
    }
  }
  
  public class b
    extends d.a
  {
    public b(Class paramClass)
    {
      super();
    }
    
    public G f(H paramH)
    {
      return (G)G.Z().y(paramH).z(k()).n();
    }
    
    public H g(h paramh)
    {
      return H.Z(paramh, p.b());
    }
    
    public void h(H paramH)
    {
      if ((!paramH.X().isEmpty()) && (paramH.Y())) {
        return;
      }
      throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
    }
  }
}

/* Location:
 * Qualified Name:     d3.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */