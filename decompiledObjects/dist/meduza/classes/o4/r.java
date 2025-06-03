package o4;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p2.m0;
import v5.e0;
import z3.c;

public final class r
  implements j
{
  public final MediaCodec a;
  public ByteBuffer[] b;
  public ByteBuffer[] c;
  
  public r(MediaCodec paramMediaCodec)
  {
    a = paramMediaCodec;
    if (e0.a < 21)
    {
      b = paramMediaCodec.getInputBuffers();
      c = paramMediaCodec.getOutputBuffers();
    }
  }
  
  public final void a() {}
  
  public final MediaFormat b()
  {
    return a.getOutputFormat();
  }
  
  public final void c(int paramInt, c paramc, long paramLong)
  {
    a.queueSecureInputBuffer(paramInt, 0, i, paramLong, 0);
  }
  
  public final void d(Bundle paramBundle)
  {
    a.setParameters(paramBundle);
  }
  
  public final void e(int paramInt, long paramLong)
  {
    a.releaseOutputBuffer(paramInt, paramLong);
  }
  
  public final int f()
  {
    return a.dequeueInputBuffer(0L);
  }
  
  public final void flush()
  {
    a.flush();
  }
  
  public final void g(j.c paramc, Handler paramHandler)
  {
    a.setOnFrameRenderedListener(new q(this, paramc), paramHandler);
  }
  
  public final int h(MediaCodec.BufferInfo paramBufferInfo)
  {
    int i;
    do
    {
      i = a.dequeueOutputBuffer(paramBufferInfo, 0L);
      if ((i == -3) && (e0.a < 21)) {
        c = a.getOutputBuffers();
      }
    } while (i == -3);
    return i;
  }
  
  public final void i(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    a.queueInputBuffer(paramInt1, 0, paramInt2, paramLong, paramInt3);
  }
  
  public final void j(int paramInt, boolean paramBoolean)
  {
    a.releaseOutputBuffer(paramInt, paramBoolean);
  }
  
  public final void k(int paramInt)
  {
    a.setVideoScalingMode(paramInt);
  }
  
  public final ByteBuffer l(int paramInt)
  {
    if (e0.a >= 21) {
      return a.getInputBuffer(paramInt);
    }
    return b[paramInt];
  }
  
  public final void m(Surface paramSurface)
  {
    a.setOutputSurface(paramSurface);
  }
  
  public final ByteBuffer n(int paramInt)
  {
    if (e0.a >= 21) {
      return a.getOutputBuffer(paramInt);
    }
    return c[paramInt];
  }
  
  public final void release()
  {
    b = null;
    c = null;
    a.release();
  }
  
  public static final class a
    implements j.b
  {
    public static MediaCodec b(j.a parama)
    {
      a.getClass();
      String str = a.a;
      parama = new StringBuilder();
      parama.append("createCodec:");
      parama.append(str);
      m0.i(parama.toString());
      parama = MediaCodec.createByCodecName(str);
      m0.B();
      return parama;
    }
  }
}

/* Location:
 * Qualified Name:     o4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */