package t0;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import g0.F;
import g0.M;
import g0.a;
import j0.c;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class K
  implements m
{
  public final MediaCodec a;
  public ByteBuffer[] b;
  public ByteBuffer[] c;
  
  public K(MediaCodec paramMediaCodec)
  {
    a = paramMediaCodec;
    if (M.a < 21)
    {
      b = paramMediaCodec.getInputBuffers();
      c = paramMediaCodec.getOutputBuffers();
    }
  }
  
  public void a(int paramInt1, int paramInt2, c paramc, long paramLong, int paramInt3)
  {
    a.queueSecureInputBuffer(paramInt1, paramInt2, paramc.a(), paramLong, paramInt3);
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    a.queueInputBuffer(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
  }
  
  public void c(Bundle paramBundle)
  {
    a.setParameters(paramBundle);
  }
  
  public int d(MediaCodec.BufferInfo paramBufferInfo)
  {
    int i;
    do
    {
      i = a.dequeueOutputBuffer(paramBufferInfo, 0L);
      if ((i == -3) && (M.a < 21)) {
        c = a.getOutputBuffers();
      }
    } while (i == -3);
    return i;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public void f(int paramInt, boolean paramBoolean)
  {
    a.releaseOutputBuffer(paramInt, paramBoolean);
  }
  
  public void flush()
  {
    a.flush();
  }
  
  public void g(int paramInt)
  {
    a.setVideoScalingMode(paramInt);
  }
  
  public MediaFormat h()
  {
    return a.getOutputFormat();
  }
  
  public ByteBuffer i(int paramInt)
  {
    if (M.a >= 21) {
      return a.getInputBuffer(paramInt);
    }
    return ((ByteBuffer[])M.i(b))[paramInt];
  }
  
  public void j(Surface paramSurface)
  {
    a.setOutputSurface(paramSurface);
  }
  
  public ByteBuffer k(int paramInt)
  {
    if (M.a >= 21) {
      return a.getOutputBuffer(paramInt);
    }
    return ((ByteBuffer[])M.i(c))[paramInt];
  }
  
  public void m(int paramInt, long paramLong)
  {
    a.releaseOutputBuffer(paramInt, paramLong);
  }
  
  public int n()
  {
    return a.dequeueInputBuffer(0L);
  }
  
  public void o(m.d paramd, Handler paramHandler)
  {
    a.setOnFrameRenderedListener(new J(this, paramd), paramHandler);
  }
  
  public void release()
  {
    b = null;
    c = null;
    try
    {
      int i = M.a;
      if ((i >= 30) && (i < 33)) {
        a.stop();
      }
    }
    finally
    {
      break label48;
    }
    a.release();
    return;
    label48:
    a.release();
    throw ((Throwable)localObject);
  }
  
  public static class b
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
}

/* Location:
 * Qualified Name:     t0.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */