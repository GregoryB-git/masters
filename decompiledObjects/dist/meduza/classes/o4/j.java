package o4;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import v3.i0;
import z3.c;

public abstract interface j
{
  public abstract void a();
  
  public abstract MediaFormat b();
  
  public abstract void c(int paramInt, c paramc, long paramLong);
  
  public abstract void d(Bundle paramBundle);
  
  public abstract void e(int paramInt, long paramLong);
  
  public abstract int f();
  
  public abstract void flush();
  
  public abstract void g(c paramc, Handler paramHandler);
  
  public abstract int h(MediaCodec.BufferInfo paramBufferInfo);
  
  public abstract void i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public abstract void j(int paramInt, boolean paramBoolean);
  
  public abstract void k(int paramInt);
  
  public abstract ByteBuffer l(int paramInt);
  
  public abstract void m(Surface paramSurface);
  
  public abstract ByteBuffer n(int paramInt);
  
  public abstract void release();
  
  public static final class a
  {
    public final l a;
    public final MediaFormat b;
    public final i0 c;
    public final Surface d;
    public final MediaCrypto e;
    
    public a(l paraml, MediaFormat paramMediaFormat, i0 parami0, Surface paramSurface, MediaCrypto paramMediaCrypto)
    {
      a = paraml;
      b = paramMediaFormat;
      c = parami0;
      d = paramSurface;
      e = paramMediaCrypto;
    }
  }
  
  public static abstract interface b
  {
    public abstract j a(j.a parama);
  }
  
  public static abstract interface c {}
}

/* Location:
 * Qualified Name:     o4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */