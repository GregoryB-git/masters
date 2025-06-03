package E5;

import java.nio.ByteBuffer;
import t5.b;

public final class a$c
  implements c.b
{
  public final a.e a;
  
  public a$c(a parama, a.e parame)
  {
    a = parame;
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    try
    {
      a.a(a.a(b).b(paramByteBuffer));
    }
    catch (RuntimeException paramByteBuffer)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("BasicMessageChannel#");
      localStringBuilder.append(a.b(b));
      b.c(localStringBuilder.toString(), "Failed to handle message reply", paramByteBuffer);
    }
  }
}

/* Location:
 * Qualified Name:     E5.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */