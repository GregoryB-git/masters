package eb;

import m.e;
import n7.g;
import n7.g.a;
import x6.b;

public abstract class h
  extends e
{
  public static final c.b<Long> b = new c.b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");
  
  public h()
  {
    super(9);
  }
  
  public void v() {}
  
  public void w() {}
  
  public void x(s0 params0) {}
  
  public void y() {}
  
  public void z(a parama, s0 params0) {}
  
  public static abstract class a
  {
    public h a(h.b paramb, s0 params0)
    {
      throw new UnsupportedOperationException("Not implemented");
    }
  }
  
  public static final class b
  {
    public final c a;
    public final int b;
    public final boolean c;
    
    public b(c paramc, int paramInt, boolean paramBoolean)
    {
      b.y(paramc, "callOptions");
      a = paramc;
      b = paramInt;
      c = paramBoolean;
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "callOptions");
      locala.d(String.valueOf(b), "previousAttempts");
      locala.c("isTransparentRetry", c);
      return locala.toString();
    }
  }
}

/* Location:
 * Qualified Name:     eb.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */