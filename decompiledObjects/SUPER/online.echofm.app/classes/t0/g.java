package t0;

import android.media.MediaCodec;
import android.media.MediaCodec.CryptoInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import g0.M;
import g0.a;
import j0.c;
import j0.d;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class g
  implements n
{
  public static final ArrayDeque g = new ArrayDeque();
  public static final Object h = new Object();
  public final MediaCodec a;
  public final HandlerThread b;
  public Handler c;
  public final AtomicReference d;
  public final g0.f e;
  public boolean f;
  
  public g(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread)
  {
    this(paramMediaCodec, paramHandlerThread, new g0.f());
  }
  
  public g(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread, g0.f paramf)
  {
    a = paramMediaCodec;
    b = paramHandlerThread;
    e = paramf;
    d = new AtomicReference();
  }
  
  public static void g(c paramc, MediaCodec.CryptoInfo paramCryptoInfo)
  {
    numSubSamples = f;
    numBytesOfClearData = i(d, numBytesOfClearData);
    numBytesOfEncryptedData = i(e, numBytesOfEncryptedData);
    key = ((byte[])a.e(h(b, key)));
    iv = ((byte[])a.e(h(a, iv)));
    mode = c;
    if (M.a >= 24)
    {
      e.a();
      j0.f.a(paramCryptoInfo, d.a(g, h));
    }
  }
  
  public static byte[] h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null) {
      return paramArrayOfByte2;
    }
    if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length >= paramArrayOfByte1.length))
    {
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, paramArrayOfByte1.length);
      return paramArrayOfByte2;
    }
    return Arrays.copyOf(paramArrayOfByte1, paramArrayOfByte1.length);
  }
  
  public static int[] i(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramArrayOfInt1 == null) {
      return paramArrayOfInt2;
    }
    if ((paramArrayOfInt2 != null) && (paramArrayOfInt2.length >= paramArrayOfInt1.length))
    {
      System.arraycopy(paramArrayOfInt1, 0, paramArrayOfInt2, 0, paramArrayOfInt1.length);
      return paramArrayOfInt2;
    }
    return Arrays.copyOf(paramArrayOfInt1, paramArrayOfInt1.length);
  }
  
  public static b o()
  {
    b localb2;
    synchronized (g)
    {
      if (???.isEmpty())
      {
        b localb1 = new t0/g$b;
        localb1.<init>();
        return localb1;
      }
    }
  }
  
  public static void p(b paramb)
  {
    synchronized (g)
    {
      ???.add(paramb);
      return;
    }
  }
  
  public void a(int paramInt1, int paramInt2, c paramc, long paramLong, int paramInt3)
  {
    d();
    b localb = o();
    localb.a(paramInt1, paramInt2, 0, paramLong, paramInt3);
    g(paramc, d);
    ((Handler)M.i(c)).obtainMessage(2, localb).sendToTarget();
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    d();
    b localb = o();
    localb.a(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
    ((Handler)M.i(c)).obtainMessage(1, localb).sendToTarget();
  }
  
  public void c(Bundle paramBundle)
  {
    d();
    ((Handler)M.i(c)).obtainMessage(4, paramBundle).sendToTarget();
  }
  
  public void d()
  {
    RuntimeException localRuntimeException = (RuntimeException)d.getAndSet(null);
    if (localRuntimeException == null) {
      return;
    }
    throw localRuntimeException;
  }
  
  public final void f()
  {
    e.c();
    ((Handler)a.e(c)).obtainMessage(3).sendToTarget();
    e.a();
  }
  
  public void flush()
  {
    if (f) {
      try
      {
        n();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        throw new IllegalStateException(localInterruptedException);
      }
    }
  }
  
  public final void j(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i != 2)
      {
        Object localObject = null;
        if (i != 3)
        {
          if (i != 4)
          {
            f.a(d, null, new IllegalStateException(String.valueOf(what)));
            paramMessage = (Message)localObject;
          }
          else
          {
            m((Bundle)obj);
            paramMessage = (Message)localObject;
          }
        }
        else
        {
          e.e();
          paramMessage = (Message)localObject;
        }
      }
      else
      {
        paramMessage = (b)obj;
        l(a, b, d, e, f);
      }
    }
    else
    {
      paramMessage = (b)obj;
      k(a, b, c, e, f);
    }
    if (paramMessage != null) {
      p(paramMessage);
    }
  }
  
  public final void k(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    try
    {
      a.queueInputBuffer(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
    }
    catch (RuntimeException localRuntimeException)
    {
      f.a(d, null, localRuntimeException);
    }
  }
  
  public final void l(int paramInt1, int paramInt2, MediaCodec.CryptoInfo paramCryptoInfo, long paramLong, int paramInt3)
  {
    try
    {
      synchronized (h)
      {
        a.queueSecureInputBuffer(paramInt1, paramInt2, paramCryptoInfo, paramLong, paramInt3);
      }
      return;
    }
    catch (RuntimeException paramCryptoInfo)
    {
      f.a(d, null, paramCryptoInfo);
    }
  }
  
  public final void m(Bundle paramBundle)
  {
    try
    {
      a.setParameters(paramBundle);
    }
    catch (RuntimeException paramBundle)
    {
      f.a(d, null, paramBundle);
    }
  }
  
  public final void n()
  {
    ((Handler)a.e(c)).removeCallbacksAndMessages(null);
    f();
  }
  
  public void shutdown()
  {
    if (f)
    {
      flush();
      b.quit();
    }
    f = false;
  }
  
  public void start()
  {
    if (!f)
    {
      b.start();
      c = new a(b.getLooper());
      f = true;
    }
  }
  
  public class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      g.e(g.this, paramMessage);
    }
  }
  
  public static class b
  {
    public int a;
    public int b;
    public int c;
    public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
    public long e;
    public int f;
    
    public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      e = paramLong;
      f = paramInt4;
    }
  }
}

/* Location:
 * Qualified Name:     t0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */