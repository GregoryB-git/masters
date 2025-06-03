package w5;

import E5.c.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public class c$g
  implements c.b
{
  public final FlutterJNI a;
  public final int b;
  public final AtomicBoolean c = new AtomicBoolean(false);
  
  public c$g(FlutterJNI paramFlutterJNI, int paramInt)
  {
    a = paramFlutterJNI;
    b = paramInt;
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    if (!c.getAndSet(true))
    {
      if (paramByteBuffer == null) {
        a.invokePlatformMessageEmptyResponseCallback(b);
      } else {
        a.invokePlatformMessageResponseCallback(b, paramByteBuffer, paramByteBuffer.position());
      }
      return;
    }
    throw new IllegalStateException("Reply already submitted");
  }
}

/* Location:
 * Qualified Name:     w5.c.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */