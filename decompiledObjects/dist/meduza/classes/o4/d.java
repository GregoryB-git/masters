package o4;

import android.media.MediaCodec;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import b5.g;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import v5.e0;

public final class d
{
  public static final ArrayDeque<a> g = new ArrayDeque();
  public static final Object h = new Object();
  public final MediaCodec a;
  public final HandlerThread b;
  public c c;
  public final AtomicReference<RuntimeException> d;
  public final g e;
  public boolean f;
  
  public d(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread)
  {
    a = paramMediaCodec;
    b = paramHandlerThread;
    e = localg;
    d = new AtomicReference();
  }
  
  public final void a()
  {
    if (f) {
      try
      {
        ??? = c;
        ???.getClass();
        ((Handler)???).removeCallbacksAndMessages(null);
        synchronized (e)
        {
          a = false;
          ??? = c;
          ???.getClass();
          ((Handler)???).obtainMessage(2).sendToTarget();
          synchronized (e)
          {
            while (!a) {
              ???.wait();
            }
          }
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        throw new IllegalStateException(localInterruptedException);
      }
    }
  }
  
  public final void b()
  {
    RuntimeException localRuntimeException = (RuntimeException)d.getAndSet(null);
    if (localRuntimeException == null) {
      return;
    }
    throw localRuntimeException;
  }
  
  public final void c(int paramInt, z3.c paramc, long paramLong)
  {
    b();
    synchronized (g)
    {
      a locala;
      if (((ArrayDeque)???).isEmpty())
      {
        locala = new o4/d$a;
        locala.<init>();
      }
      for (;;)
      {
        break;
        locala = (a)((ArrayDeque)???).removeFirst();
      }
      a = paramInt;
      b = 0;
      c = 0;
      e = paramLong;
      f = 0;
      MediaCodec.CryptoInfo localCryptoInfo = d;
      numSubSamples = f;
      Object localObject2 = d;
      ??? = numBytesOfClearData;
      if (localObject2 != null) {
        if ((??? != null) && (???.length >= localObject2.length)) {
          System.arraycopy(localObject2, 0, ???, 0, localObject2.length);
        } else {
          ??? = Arrays.copyOf((int[])localObject2, localObject2.length);
        }
      }
      numBytesOfClearData = ((int[])???);
      localObject2 = e;
      ??? = numBytesOfEncryptedData;
      if (localObject2 != null) {
        if ((??? != null) && (???.length >= localObject2.length)) {
          System.arraycopy(localObject2, 0, ???, 0, localObject2.length);
        } else {
          ??? = Arrays.copyOf((int[])localObject2, localObject2.length);
        }
      }
      numBytesOfEncryptedData = ((int[])???);
      localObject2 = b;
      ??? = key;
      if (localObject2 != null) {
        if ((??? != null) && (???.length >= localObject2.length)) {
          System.arraycopy(localObject2, 0, ???, 0, localObject2.length);
        } else {
          ??? = Arrays.copyOf((byte[])localObject2, localObject2.length);
        }
      }
      ???.getClass();
      key = ((byte[])???);
      localObject2 = a;
      ??? = iv;
      if (localObject2 != null) {
        if ((??? != null) && (???.length >= localObject2.length)) {
          System.arraycopy(localObject2, 0, ???, 0, localObject2.length);
        } else {
          ??? = Arrays.copyOf((byte[])localObject2, localObject2.length);
        }
      }
      ???.getClass();
      iv = ((byte[])???);
      mode = c;
      if (e0.a >= 24) {
        localCryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(g, h));
      }
      c.obtainMessage(1, locala).sendToTarget();
      return;
    }
  }
  
  public static final class a
  {
    public int a;
    public int b;
    public int c;
    public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
    public long e;
    public int f;
  }
}

/* Location:
 * Qualified Name:     o4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */