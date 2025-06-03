package d3;

import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import k3.d;
import k3.d.a;
import k3.m;
import p3.g;
import p3.y.c;
import q3.a;
import q3.l;
import q3.r;

public class f
  extends d
{
  public f()
  {
    super(p3.f.class, new m[] { new a(l.class) });
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.AesCtrKey";
  }
  
  public d.a f()
  {
    return new b(g.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int l()
  {
    return 0;
  }
  
  public p3.f m(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return p3.f.d0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void n(p3.f paramf)
  {
    r.c(paramf.b0(), l());
    r.a(paramf.Z().size());
    o(paramf.a0());
  }
  
  public final void o(p3.h paramh)
  {
    if ((paramh.X() >= 12) && (paramh.X() <= 16)) {
      return;
    }
    throw new GeneralSecurityException("invalid IV size");
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public l c(p3.f paramf)
    {
      return new a(paramf.Z().Y(), paramf.a0().X());
    }
  }
  
  public class b
    extends d.a
  {
    public b(Class paramClass)
    {
      super();
    }
    
    public p3.f f(g paramg)
    {
      return (p3.f)p3.f.c0().z(paramg.Z()).y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(paramg.Y()))).A(l()).n();
    }
    
    public g g(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return g.b0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(g paramg)
    {
      r.a(paramg.Y());
      f.k(f.this, paramg.Z());
    }
  }
}

/* Location:
 * Qualified Name:     d3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */