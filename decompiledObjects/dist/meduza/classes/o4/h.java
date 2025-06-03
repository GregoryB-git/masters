package o4;

import android.media.MediaCodec;
import f;
import java.io.IOException;
import p2.m0;
import v3.i0;
import v5.e0;
import v5.m;
import v5.p;

public final class h
  implements j.b
{
  public final j a(j.a parama)
  {
    int i = e0.a;
    if ((i >= 23) && (i >= 31))
    {
      i = p.i(c.t);
      localObject1 = f.l("Creating an asynchronous MediaCodec adapter for track type ");
      ((StringBuilder)localObject1).append(e0.A(i));
      m.e("DMCodecAdapterFactory", ((StringBuilder)localObject1).toString());
      return new b.a(i).b(parama);
    }
    Object localObject2 = null;
    Object localObject1 = null;
    try
    {
      MediaCodec localMediaCodec = r.a.b(parama);
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      m0.i("configureCodec");
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      localMediaCodec.configure(b, d, e, 0);
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      m0.B();
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      m0.i("startCodec");
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      localMediaCodec.start();
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      m0.B();
      localObject1 = localMediaCodec;
      localObject2 = localMediaCodec;
      parama = new r(localMediaCodec);
      return parama;
    }
    catch (RuntimeException parama) {}catch (IOException parama)
    {
      localObject1 = localObject2;
    }
    if (localObject1 != null) {
      ((MediaCodec)localObject1).release();
    }
    throw parama;
  }
}

/* Location:
 * Qualified Name:     o4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */