package E5;

import java.nio.ByteBuffer;
import t5.b;

public final class k$b
  implements c.b
{
  public final k.d a;
  
  public k$b(k paramk, k.d paramd)
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
        a.a(k.a(b).f(paramByteBuffer));
      }
      catch (e paramByteBuffer)
      {
        a.b(o, paramByteBuffer.getMessage(), p);
      }
    }
    label70:
    paramByteBuffer = new StringBuilder();
    paramByteBuffer.append("MethodChannel#");
    paramByteBuffer.append(k.b(b));
    b.c(paramByteBuffer.toString(), "Failed to handle method call result", localRuntimeException);
  }
}

/* Location:
 * Qualified Name:     E5.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */