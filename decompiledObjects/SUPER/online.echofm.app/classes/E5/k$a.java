package E5;

import java.nio.ByteBuffer;
import t5.b;

public final class k$a
  implements c.a
{
  public final k.c a;
  
  public k$a(k paramk, k.c paramc)
  {
    a = paramc;
  }
  
  public void a(ByteBuffer paramByteBuffer, c.b paramb)
  {
    j localj = k.a(b).e(paramByteBuffer);
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
      ((StringBuilder)localObject).append(k.b(b));
      b.c(((StringBuilder)localObject).toString(), "Failed to handle method call", paramByteBuffer);
      paramb.a(k.a(b).b("error", paramByteBuffer.getMessage(), null, b.d(paramByteBuffer)));
    }
  }
  
  public class a
    implements k.d
  {
    public a(c.b paramb) {}
    
    public void a(Object paramObject)
    {
      a.a(k.a(b).a(paramObject));
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      a.a(k.a(b).d(paramString1, paramString2, paramObject));
    }
    
    public void c()
    {
      a.a(null);
    }
  }
}

/* Location:
 * Qualified Name:     E5.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */