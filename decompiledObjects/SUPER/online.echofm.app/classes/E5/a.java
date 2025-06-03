package E5;

import java.nio.ByteBuffer;
import t5.b;

public final class a
{
  public final c a;
  public final String b;
  public final i c;
  public final c.c d;
  
  public a(c paramc, String paramString, i parami)
  {
    this(paramc, paramString, parami, null);
  }
  
  public a(c paramc, String paramString, i parami, c.c paramc1)
  {
    a = paramc;
    b = paramString;
    c = parami;
    d = paramc1;
  }
  
  public void c(Object paramObject)
  {
    d(paramObject, null);
  }
  
  public void d(Object paramObject, e parame)
  {
    c localc = a;
    String str = b;
    ByteBuffer localByteBuffer = c.a(paramObject);
    paramObject = null;
    if (parame != null) {
      paramObject = new c(parame, null);
    }
    localc.f(str, localByteBuffer, (c.b)paramObject);
  }
  
  public void e(d paramd)
  {
    Object localObject = d;
    String str = null;
    c localc = null;
    if (localObject != null)
    {
      localObject = a;
      str = b;
      if (paramd == null) {
        paramd = localc;
      } else {
        paramd = new b(paramd, null);
      }
      ((c)localObject).h(str, paramd, d);
    }
    else
    {
      localc = a;
      localObject = b;
      if (paramd == null) {
        paramd = str;
      } else {
        paramd = new b(paramd, null);
      }
      localc.c((String)localObject, paramd);
    }
  }
  
  public final class b
    implements c.a
  {
    public final a.d a;
    
    public b(a.d paramd)
    {
      a = paramd;
    }
    
    public void a(ByteBuffer paramByteBuffer, c.b paramb)
    {
      try
      {
        a.d locald = a;
        paramByteBuffer = a.a(a.this).b(paramByteBuffer);
        a locala = new E5/a$b$a;
        locala.<init>(this, paramb);
        locald.a(paramByteBuffer, locala);
      }
      catch (RuntimeException localRuntimeException)
      {
        paramByteBuffer = new StringBuilder();
        paramByteBuffer.append("BasicMessageChannel#");
        paramByteBuffer.append(a.b(a.this));
        b.c(paramByteBuffer.toString(), "Failed to handle message", localRuntimeException);
        paramb.a(null);
      }
    }
    
    public class a
      implements a.e
    {
      public a(c.b paramb) {}
      
      public void a(Object paramObject)
      {
        a.a(a.a(a.this).a(paramObject));
      }
    }
  }
  
  public final class c
    implements c.b
  {
    public final a.e a;
    
    public c(a.e parame)
    {
      a = parame;
    }
    
    public void a(ByteBuffer paramByteBuffer)
    {
      try
      {
        a.a(a.a(a.this).b(paramByteBuffer));
      }
      catch (RuntimeException paramByteBuffer)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("BasicMessageChannel#");
        localStringBuilder.append(a.b(a.this));
        b.c(localStringBuilder.toString(), "Failed to handle message reply", paramByteBuffer);
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(Object paramObject, a.e parame);
  }
  
  public static abstract interface e
  {
    public abstract void a(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     E5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */