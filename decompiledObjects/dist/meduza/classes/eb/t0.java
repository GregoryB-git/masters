package eb;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import lb.a;
import ma.s0;
import n7.g;
import n7.g.a;
import x6.b;

public final class t0<ReqT, RespT>
{
  public final c a;
  public final String b;
  public final String c;
  public final b<ReqT> d;
  public final b<RespT> e;
  public final Object f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  
  public t0(c paramc, String paramString, b paramb1, b paramb2, boolean paramBoolean)
  {
    new AtomicReferenceArray(2);
    b.y(paramc, "type");
    a = paramc;
    b.y(paramString, "fullMethodName");
    b = paramString;
    int j = paramString.lastIndexOf('/');
    if (j == -1) {
      paramc = null;
    } else {
      paramc = paramString.substring(0, j);
    }
    c = paramc;
    b.y(paramb1, "requestMarshaller");
    d = paramb1;
    b.y(paramb2, "responseMarshaller");
    e = paramb2;
    f = null;
    g = false;
    h = false;
    i = paramBoolean;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    b.y(paramString1, "fullServiceName");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("/");
    b.y(paramString2, "methodName");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public static <ReqT, RespT> a<ReqT, RespT> b()
  {
    a locala = new a();
    a = null;
    b = null;
    return locala;
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(b, "fullMethodName");
    locala.a(a, "type");
    locala.c("idempotent", g);
    locala.c("safe", h);
    locala.c("sampledToLocalTracing", i);
    locala.a(d, "requestMarshaller");
    locala.a(e, "responseMarshaller");
    locala.a(f, "schemaDescriptor");
    d = true;
    return locala.toString();
  }
  
  public static final class a<ReqT, RespT>
  {
    public t0.b<ReqT> a;
    public t0.b<RespT> b;
    public t0.c c;
    public String d;
    public boolean e;
    
    public final t0<ReqT, RespT> a()
    {
      return new t0(c, d, a, b, e);
    }
  }
  
  public static abstract interface b<T>
  {
    public abstract s0 a(InputStream paramInputStream);
    
    public abstract a b(Object paramObject);
  }
  
  public static enum c
  {
    static
    {
      c localc1 = new c("UNARY", 0);
      a = localc1;
      c localc2 = new c("CLIENT_STREAMING", 1);
      c localc3 = new c("SERVER_STREAMING", 2);
      b = localc3;
      c localc4 = new c("BIDI_STREAMING", 3);
      c = localc4;
      d = new c[] { localc1, localc2, localc3, localc4, new c("UNKNOWN", 4) };
    }
    
    public c() {}
  }
}

/* Location:
 * Qualified Name:     eb.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */