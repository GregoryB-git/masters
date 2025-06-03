package okhttp3.internal.ws;

import ec.i;
import xc.f;
import xc.f.a;

public final class WebSocketProtocol
{
  private WebSocketProtocol()
  {
    throw new AssertionError("No instances.");
  }
  
  public static void a(f.a parama, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    long l;
    do
    {
      Object localObject = e;
      int k = f;
      int m = o;
      int n;
      for (;;)
      {
        n = 1;
        if (k >= m) {
          break;
        }
        j %= i;
        localObject[k] = ((byte)(byte)(localObject[k] ^ paramArrayOfByte[j]));
        k++;
        j++;
      }
      l = d;
      localObject = a;
      i.b(localObject);
      if (l != b) {
        k = n;
      } else {
        k = 0;
      }
      if (k == 0) {
        break;
      }
      l = d;
      if (l == -1L) {
        l = 0L;
      } else {
        l += o - f;
      }
    } while (parama.f(l) != -1);
    return;
    throw new IllegalStateException("no more bytes".toString());
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.ws.WebSocketProtocol
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */