package t0;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d0.q;
import j0.c;
import java.nio.ByteBuffer;

public abstract interface m
{
  public abstract void a(int paramInt1, int paramInt2, c paramc, long paramLong, int paramInt3);
  
  public abstract void b(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4);
  
  public abstract void c(Bundle paramBundle);
  
  public abstract int d(MediaCodec.BufferInfo paramBufferInfo);
  
  public abstract boolean e();
  
  public abstract void f(int paramInt, boolean paramBoolean);
  
  public abstract void flush();
  
  public abstract void g(int paramInt);
  
  public abstract MediaFormat h();
  
  public abstract ByteBuffer i(int paramInt);
  
  public abstract void j(Surface paramSurface);
  
  public abstract ByteBuffer k(int paramInt);
  
  public abstract boolean l(c paramc);
  
  public abstract void m(int paramInt, long paramLong);
  
  public abstract int n();
  
  public abstract void o(d paramd, Handler paramHandler);
  
  public abstract void release();
  
  public static final class a
  {
    public final p a;
    public final MediaFormat b;
    public final q c;
    public final Surface d;
    public final MediaCrypto e;
    public final int f;
    
    public a(p paramp, MediaFormat paramMediaFormat, q paramq, Surface paramSurface, MediaCrypto paramMediaCrypto, int paramInt)
    {
      a = paramp;
      b = paramMediaFormat;
      c = paramq;
      d = paramSurface;
      e = paramMediaCrypto;
      f = paramInt;
    }
    
    public static a a(p paramp, MediaFormat paramMediaFormat, q paramq, MediaCrypto paramMediaCrypto)
    {
      return new a(paramp, paramMediaFormat, paramq, null, paramMediaCrypto, 0);
    }
    
    public static a b(p paramp, MediaFormat paramMediaFormat, q paramq, Surface paramSurface, MediaCrypto paramMediaCrypto)
    {
      return new a(paramp, paramMediaFormat, paramq, paramSurface, paramMediaCrypto, 0);
    }
  }
  
  public static abstract interface b
  {
    public abstract m a(m.a parama);
  }
  
  public static abstract interface c
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public static abstract interface d
  {
    public abstract void a(m paramm, long paramLong1, long paramLong2);
  }
}

/* Location:
 * Qualified Name:     t0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */