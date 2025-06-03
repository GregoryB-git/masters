package E5;

import java.nio.ByteBuffer;
import t5.b;

public final class a$b
  implements c.a
{
  public final a.d a;
  
  public a$b(a parama, a.d paramd)
  {
    a = paramd;
  }
  
  public void a(ByteBuffer paramByteBuffer, c.b paramb)
  {
    try
    {
      a.d locald = a;
      paramByteBuffer = a.a(b).b(paramByteBuffer);
      a locala = new E5/a$b$a;
      locala.<init>(this, paramb);
      locald.a(paramByteBuffer, locala);
    }
    catch (RuntimeException localRuntimeException)
    {
      paramByteBuffer = new StringBuilder();
      paramByteBuffer.append("BasicMessageChannel#");
      paramByteBuffer.append(a.b(b));
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
      a.a(a.a(b).a(paramObject));
    }
  }
}

/* Location:
 * Qualified Name:     E5.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */