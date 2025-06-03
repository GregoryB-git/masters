package t0;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import g0.M;
import g0.a;
import java.util.ArrayDeque;
import t.c;

public final class i
  extends MediaCodec.Callback
{
  public final Object a = new Object();
  public final HandlerThread b;
  public Handler c;
  public final c d;
  public final c e;
  public final ArrayDeque f;
  public final ArrayDeque g;
  public MediaFormat h;
  public MediaFormat i;
  public MediaCodec.CodecException j;
  public MediaCodec.CryptoException k;
  public long l;
  public boolean m;
  public IllegalStateException n;
  public m.c o;
  
  public i(HandlerThread paramHandlerThread)
  {
    b = paramHandlerThread;
    d = new c();
    e = new c();
    f = new ArrayDeque();
    g = new ArrayDeque();
  }
  
  public final void b(MediaFormat paramMediaFormat)
  {
    e.a(-2);
    g.add(paramMediaFormat);
  }
  
  public int c()
  {
    int i1;
    synchronized (a)
    {
      j();
      boolean bool = i();
      i1 = -1;
      if (bool) {
        return -1;
      }
    }
  }
  
  public int d(MediaCodec.BufferInfo paramBufferInfo)
  {
    int i1;
    MediaCodec.BufferInfo localBufferInfo;
    synchronized (a)
    {
      j();
      if (i()) {
        return -1;
      }
    }
  }
  
  public void e()
  {
    synchronized (a)
    {
      l += 1L;
      Handler localHandler = (Handler)M.i(c);
      h localh = new t0/h;
      localh.<init>(this);
      localHandler.post(localh);
      return;
    }
  }
  
  public final void f()
  {
    if (!g.isEmpty()) {
      i = ((MediaFormat)g.getLast());
    }
    d.b();
    e.b();
    f.clear();
    g.clear();
  }
  
  public MediaFormat g()
  {
    Object localObject1 = a;
    IllegalStateException localIllegalStateException;
    label34:
    try
    {
      MediaFormat localMediaFormat = h;
      if (localMediaFormat != null) {
        return localMediaFormat;
      }
    }
    finally
    {
      break label34;
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public void h(MediaCodec paramMediaCodec)
  {
    boolean bool;
    if (c == null) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    b.start();
    Handler localHandler = new Handler(b.getLooper());
    paramMediaCodec.setCallback(this, localHandler);
    c = localHandler;
  }
  
  public final boolean i()
  {
    boolean bool;
    if ((l <= 0L) && (!m)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void j()
  {
    k();
    m();
    l();
  }
  
  public final void k()
  {
    IllegalStateException localIllegalStateException = n;
    if (localIllegalStateException == null) {
      return;
    }
    n = null;
    throw localIllegalStateException;
  }
  
  public final void l()
  {
    MediaCodec.CryptoException localCryptoException = k;
    if (localCryptoException == null) {
      return;
    }
    k = null;
    throw localCryptoException;
  }
  
  public final void m()
  {
    MediaCodec.CodecException localCodecException = j;
    if (localCodecException == null) {
      return;
    }
    j = null;
    throw localCodecException;
  }
  
  public final void n()
  {
    long l1;
    IllegalStateException localIllegalStateException;
    synchronized (a)
    {
      if (m) {
        return;
      }
    }
  }
  
  public final void o(IllegalStateException paramIllegalStateException)
  {
    synchronized (a)
    {
      n = paramIllegalStateException;
      return;
    }
  }
  
  public void onCryptoError(MediaCodec arg1, MediaCodec.CryptoException paramCryptoException)
  {
    synchronized (a)
    {
      k = paramCryptoException;
      return;
    }
  }
  
  public void onError(MediaCodec arg1, MediaCodec.CodecException paramCodecException)
  {
    synchronized (a)
    {
      j = paramCodecException;
      return;
    }
  }
  
  public void onInputBufferAvailable(MediaCodec arg1, int paramInt)
  {
    synchronized (a)
    {
      d.a(paramInt);
      m.c localc = o;
      if (localc != null) {
        localc.b();
      }
    }
    return;
    throw ((Throwable)localObject);
  }
  
  public void onOutputBufferAvailable(MediaCodec arg1, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    synchronized (a)
    {
      MediaFormat localMediaFormat = i;
      if (localMediaFormat != null)
      {
        b(localMediaFormat);
        i = null;
      }
    }
    e.a(paramInt);
    f.add(paramBufferInfo);
    paramBufferInfo = o;
    if (paramBufferInfo != null) {
      paramBufferInfo.a();
    }
  }
  
  public void onOutputFormatChanged(MediaCodec arg1, MediaFormat paramMediaFormat)
  {
    synchronized (a)
    {
      b(paramMediaFormat);
      i = null;
      return;
    }
  }
  
  public void p(m.c paramc)
  {
    synchronized (a)
    {
      o = paramc;
      return;
    }
  }
  
  public void q()
  {
    synchronized (a)
    {
      m = true;
      b.quit();
      f();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     t0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */