package t0;

import android.media.MediaCodec;
import g0.F;
import g0.a;
import java.io.IOException;

public class K$b
  implements m.b
{
  public m a(m.a parama)
  {
    Object localObject1 = null;
    Object localObject2;
    try
    {
      localObject2 = b(parama);
      try
      {
        F.a("configureCodec");
        ((MediaCodec)localObject2).configure(b, d, e, f);
        F.b();
        F.a("startCodec");
        ((MediaCodec)localObject2).start();
        F.b();
        parama = new K((MediaCodec)localObject2, null);
        return parama;
      }
      catch (RuntimeException parama) {}catch (IOException parama)
      {
        for (;;) {}
      }
      if (localObject2 == null) {
        break label85;
      }
    }
    catch (RuntimeException parama)
    {
      localObject2 = localObject1;
    }
    catch (IOException parama)
    {
      localObject2 = localObject1;
    }
    ((MediaCodec)localObject2).release();
    label85:
    throw parama;
  }
  
  public MediaCodec b(m.a parama)
  {
    a.e(a);
    parama = a.a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("createCodec:");
    localStringBuilder.append(parama);
    F.a(localStringBuilder.toString());
    parama = MediaCodec.createByCodecName(parama);
    F.b();
    return parama;
  }
}

/* Location:
 * Qualified Name:     t0.K.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */