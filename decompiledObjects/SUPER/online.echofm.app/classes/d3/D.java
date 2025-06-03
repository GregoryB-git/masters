package d3;

import c3.a;
import c3.s;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import k3.d;
import k3.d.a;
import k3.m;
import p3.E;
import p3.E.b;
import p3.F;
import p3.y.c;

public class D
  extends d
{
  public D()
  {
    super(E.class, new m[] { new a(a.class) });
  }
  
  public static void m(boolean paramBoolean)
  {
    x.l(new D(), paramBoolean);
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
  }
  
  public d.a f()
  {
    return new b(F.class);
  }
  
  public y.c g()
  {
    return y.c.t;
  }
  
  public int k()
  {
    return 0;
  }
  
  public E l(h paramh)
  {
    return E.a0(paramh, p.b());
  }
  
  public void n(E paramE)
  {
    q3.r.c(paramE.Y(), k());
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public a c(E paramE)
    {
      paramE = paramE.X().W();
      return s.a(paramE).a(paramE);
    }
  }
  
  public class b
    extends d.a
  {
    public b(Class paramClass)
    {
      super();
    }
    
    public E f(F paramF)
    {
      return (E)E.Z().y(paramF).z(k()).n();
    }
    
    public F g(h paramh)
    {
      return F.X(paramh, p.b());
    }
    
    public void h(F paramF) {}
  }
}

/* Location:
 * Qualified Name:     d3.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */