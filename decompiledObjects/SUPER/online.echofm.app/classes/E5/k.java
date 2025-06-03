package E5;

import java.nio.ByteBuffer;
import t5.b;

public class k
{
  public final c a;
  public final String b;
  public final l c;
  public final c.c d;
  
  public k(c paramc, String paramString)
  {
    this(paramc, paramString, q.b);
  }
  
  public k(c paramc, String paramString, l paraml)
  {
    this(paramc, paramString, paraml, null);
  }
  
  public k(c paramc, String paramString, l paraml, c.c paramc1)
  {
    a = paramc;
    b = paramString;
    c = paraml;
    d = paramc1;
  }
  
  public void c(String paramString, Object paramObject)
  {
    d(paramString, paramObject, null);
  }
  
  public void d(String paramString, Object paramObject, d paramd)
  {
    c localc = a;
    String str = b;
    paramObject = c.c(new j(paramString, paramObject));
    if (paramd == null) {
      paramString = null;
    } else {
      paramString = new b(paramd);
    }
    localc.f(str, (ByteBuffer)paramObject, paramString);
  }
  
  public void e(c paramc)
  {
    Object localObject = d;
    c localc1 = null;
    c localc2 = null;
    if (localObject != null)
    {
      localc1 = a;
      localObject = b;
      if (paramc == null) {
        paramc = localc2;
      } else {
        paramc = new a(paramc);
      }
      localc1.h((String)localObject, paramc, d);
    }
    else
    {
      localc2 = a;
      localObject = b;
      if (paramc == null) {
        paramc = localc1;
      } else {
        paramc = new a(paramc);
      }
      localc2.c((String)localObject, paramc);
    }
  }
  
  public final class a
    implements c.a
  {
    public final k.c a;
    
    public a(k.c paramc)
    {
      a = paramc;
    }
    
    public void a(ByteBuffer paramByteBuffer, c.b paramb)
    {
      j localj = k.a(k.this).e(paramByteBuffer);
      try
      {
        paramByteBuffer = a;
        localObject = new E5/k$a$a;
        ((a)localObject).<init>(this, paramb);
        paramByteBuffer.onMethodCall(localj, (k.d)localObject);
      }
      catch (RuntimeException paramByteBuffer)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("MethodChannel#");
        ((StringBuilder)localObject).append(k.b(k.this));
        b.c(((StringBuilder)localObject).toString(), "Failed to handle method call", paramByteBuffer);
        paramb.a(k.a(k.this).b("error", paramByteBuffer.getMessage(), null, b.d(paramByteBuffer)));
      }
    }
    
    public class a
      implements k.d
    {
      public a(c.b paramb) {}
      
      public void a(Object paramObject)
      {
        a.a(k.a(k.this).a(paramObject));
      }
      
      public void b(String paramString1, String paramString2, Object paramObject)
      {
        a.a(k.a(k.this).d(paramString1, paramString2, paramObject));
      }
      
      public void c()
      {
        a.a(null);
      }
    }
  }
  
  public final class b
    implements c.b
  {
    public final k.d a;
    
    public b(k.d paramd)
    {
      a = paramd;
    }
    
    public void a(ByteBuffer paramByteBuffer)
    {
      if (paramByteBuffer == null) {
        try
        {
          a.c();
        }
        catch (RuntimeException localRuntimeException)
        {
          break label70;
        }
      } else {
        try
        {
          a.a(k.a(k.this).f(paramByteBuffer));
        }
        catch (e paramByteBuffer)
        {
          a.b(o, paramByteBuffer.getMessage(), p);
        }
      }
      label70:
      paramByteBuffer = new StringBuilder();
      paramByteBuffer.append("MethodChannel#");
      paramByteBuffer.append(k.b(k.this));
      b.c(paramByteBuffer.toString(), "Failed to handle method call result", localRuntimeException);
    }
  }
  
  public static abstract interface c
  {
    public abstract void onMethodCall(j paramj, k.d paramd);
  }
  
  public static abstract interface d
  {
    public abstract void a(Object paramObject);
    
    public abstract void b(String paramString1, String paramString2, Object paramObject);
    
    public abstract void c();
  }
}

/* Location:
 * Qualified Name:     E5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */