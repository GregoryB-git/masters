package t0;

import W2.s;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d0.q;
import d0.z;
import g0.F;
import g0.M;
import java.nio.ByteBuffer;

public final class b
  implements m
{
  public final MediaCodec a;
  public final i b;
  public final n c;
  public boolean d;
  public int e;
  
  public b(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread, n paramn)
  {
    a = paramMediaCodec;
    b = new i(paramHandlerThread);
    c = paramn;
    e = 0;
  }
  
  public static String t(int paramInt)
  {
    return v(paramInt, "ExoPlayer:MediaCodecAsyncAdapter:");
  }
  
  public static String u(int paramInt)
  {
    return v(paramInt, "ExoPlayer:MediaCodecQueueingThread:");
  }
  
  public static String v(int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (paramInt == 1) {
      paramString = "Audio";
    }
    for (;;)
    {
      localStringBuilder.append(paramString);
      break;
      if (paramInt == 2)
      {
        paramString = "Video";
      }
      else
      {
        localStringBuilder.append("Unknown(");
        localStringBuilder.append(paramInt);
        paramString = ")";
      }
    }
    return localStringBuilder.toString();
  }
  
  public void a(int paramInt1, int paramInt2, j0.c paramc, long paramLong, int paramInt3)
  {
    c.a(paramInt1, paramInt2, paramc, paramLong, paramInt3);
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    c.b(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
  }
  
  public void c(Bundle paramBundle)
  {
    c.c(paramBundle);
  }
  
  public int d(MediaCodec.BufferInfo paramBufferInfo)
  {
    c.d();
    return b.d(paramBufferInfo);
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
    c.flush();
    a.flush();
    b.e();
    a.start();
  }
  
  public void g(int paramInt)
  {
    a.setVideoScalingMode(paramInt);
  }
  
  public MediaFormat h()
  {
    return b.g();
  }
  
  public ByteBuffer i(int paramInt)
  {
    return a.getInputBuffer(paramInt);
  }
  
  public void j(Surface paramSurface)
  {
    a.setOutputSurface(paramSurface);
  }
  
  public ByteBuffer k(int paramInt)
  {
    return a.getOutputBuffer(paramInt);
  }
  
  public boolean l(m.c paramc)
  {
    b.p(paramc);
    return true;
  }
  
  public void m(int paramInt, long paramLong)
  {
    a.releaseOutputBuffer(paramInt, paramLong);
  }
  
  public int n()
  {
    c.d();
    return b.c();
  }
  
  public void o(m.d paramd, Handler paramHandler)
  {
    a.setOnFrameRenderedListener(new a(this, paramd), paramHandler);
  }
  
  public void release()
  {
    try
    {
      if (e == 1)
      {
        c.shutdown();
        b.q();
      }
    }
    finally
    {
      break label103;
    }
    e = 2;
    int i;
    if (!d)
    {
      try
      {
        i = M.a;
        if ((i >= 30) && (i < 33)) {
          a.stop();
        }
      }
      finally
      {
        break label88;
      }
      a.release();
      d = true;
      break label102;
      label88:
      a.release();
      d = true;
      throw ((Throwable)localObject2);
    }
    label102:
    return;
    label103:
    if (!d)
    {
      try
      {
        i = M.a;
        if ((i >= 30) && (i < 33)) {
          a.stop();
        }
      }
      finally
      {
        break label155;
      }
      a.release();
      d = true;
      break label169;
      label155:
      a.release();
      d = true;
      throw ((Throwable)localObject3);
    }
    label169:
    throw ((Throwable)localObject3);
  }
  
  public final void w(MediaFormat paramMediaFormat, Surface paramSurface, MediaCrypto paramMediaCrypto, int paramInt)
  {
    b.h(a);
    F.a("configureCodec");
    a.configure(paramMediaFormat, paramSurface, paramMediaCrypto, paramInt);
    F.b();
    c.start();
    F.a("startCodec");
    a.start();
    F.b();
    e = 1;
  }
  
  public static final class b
    implements m.b
  {
    public final s a;
    public final s b;
    public boolean c;
    
    public b(int paramInt)
    {
      this(new c(paramInt), new d(paramInt));
    }
    
    public b(s params1, s params2)
    {
      a = params1;
      b = params2;
      c = true;
    }
    
    public static boolean h(q paramq)
    {
      int i = M.a;
      boolean bool = false;
      if (i < 34) {
        return false;
      }
      if ((i >= 35) || (z.s(n))) {
        bool = true;
      }
      return bool;
    }
    
    public b d(m.a parama)
    {
      Object localObject1 = a.a;
      Object localObject2 = null;
      Object localObject3;
      try
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("createCodec:");
        ((StringBuilder)localObject3).append((String)localObject1);
        F.a(((StringBuilder)localObject3).toString());
        localObject1 = MediaCodec.createByCodecName((String)localObject1);
        int i;
        try
        {
          i = f;
          if ((c) && (h(c)))
          {
            localObject3 = new t0/L;
            ((L)localObject3).<init>((MediaCodec)localObject1);
            i |= 0x4;
          }
        }
        catch (Exception parama)
        {
          localObject3 = localObject1;
          break label185;
        }
        localObject3 = new g((MediaCodec)localObject1, (HandlerThread)b.get());
        b localb = new t0/b;
        localb.<init>((MediaCodec)localObject1, (HandlerThread)a.get(), (n)localObject3, null);
        try
        {
          F.b();
          b.q(localb, b, d, e, i);
          return localb;
        }
        catch (Exception parama)
        {
          localObject2 = localb;
          localObject3 = localObject1;
        }
        if (localObject2 != null) {
          break label202;
        }
      }
      catch (Exception parama)
      {
        localObject3 = null;
      }
      label185:
      if (localObject3 != null)
      {
        ((MediaCodec)localObject3).release();
        break label206;
        label202:
        ((b)localObject2).release();
      }
      label206:
      throw parama;
    }
    
    public void e(boolean paramBoolean)
    {
      c = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     t0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */