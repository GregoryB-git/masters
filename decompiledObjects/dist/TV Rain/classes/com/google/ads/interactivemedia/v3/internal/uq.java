package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;

@SuppressLint({"HandlerLeak"})
final class uq<T extends ut>
  extends Handler
  implements Runnable
{
  public final int a;
  private final T b;
  private final long c;
  private uo<T> d;
  private IOException e;
  private int f;
  private volatile Thread g;
  private volatile boolean h;
  private volatile boolean i;
  
  public uq(Looper paramLooper, T paramT, uo<T> paramuo, int paramInt, long paramLong)
  {
    super(paramT);
    b = paramuo;
    d = paramInt;
    a = paramLong;
    Object localObject;
    c = localObject;
  }
  
  private final void a()
  {
    e = null;
    um.b(j).execute(um.a(j));
  }
  
  private final void b()
  {
    um.a(j, null);
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    IOException localIOException = e;
    if ((localIOException != null) && (f > paramInt)) {
      throw localIOException;
    }
  }
  
  public final void a(long paramLong)
  {
    boolean bool;
    if (um.a(j) == null) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    um.a(j, this);
    if (paramLong > 0L)
    {
      sendEmptyMessageDelayed(0, paramLong);
      return;
    }
    a();
  }
  
  public final void a(boolean paramBoolean)
  {
    i = paramBoolean;
    e = null;
    if (hasMessages(0))
    {
      removeMessages(0);
      if (!paramBoolean) {
        sendEmptyMessage(1);
      }
    }
    else
    {
      h = true;
      b.a();
      if (g != null) {
        g.interrupt();
      }
    }
    if (paramBoolean)
    {
      b();
      long l = SystemClock.elapsedRealtime();
      d.a(b, l, l - c, true);
      d = null;
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (i) {
      return;
    }
    int k = what;
    if (k == 0)
    {
      a();
      return;
    }
    if (k != 4)
    {
      b();
      long l1 = SystemClock.elapsedRealtime();
      long l2 = l1 - c;
      if (h)
      {
        d.a(b, l1, l2, false);
        return;
      }
      k = what;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k == 3)
          {
            paramMessage = (IOException)obj;
            e = paramMessage;
            k = f + 1;
            f = k;
            paramMessage = d.a(b, l1, l2, paramMessage, k);
            if (ur.a(paramMessage) == 3)
            {
              um.a(j, e);
              return;
            }
            if (ur.a(paramMessage) != 2)
            {
              if (ur.a(paramMessage) == 1) {
                f = 1;
              }
              if (ur.b(paramMessage) != -9223372036854775807L) {
                l1 = ur.b(paramMessage);
              } else {
                l1 = Math.min((f - 1) * 1000, 5000);
              }
              a(l1);
            }
          }
          return;
        }
        try
        {
          d.a(b, l1, l2);
          return;
        }
        catch (RuntimeException paramMessage)
        {
          vr.b("LoadTask", "Unexpected exception handling load completed", paramMessage);
          um.a(j, new uu(paramMessage));
          return;
        }
      }
      d.a(b, l1, l2, false);
      return;
    }
    throw ((Error)obj);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 190	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   4: putfield 105	com/google/ads/interactivemedia/v3/internal/uq:g	Ljava/lang/Thread;
    //   7: aload_0
    //   8: getfield 100	com/google/ads/interactivemedia/v3/internal/uq:h	Z
    //   11: ifne +66 -> 77
    //   14: aload_0
    //   15: getfield 39	com/google/ads/interactivemedia/v3/internal/uq:b	Lcom/google/ads/interactivemedia/v3/internal/ut;
    //   18: invokevirtual 196	java/lang/Object:getClass	()Ljava/lang/Class;
    //   21: invokevirtual 202	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 208	java/lang/String:length	()I
    //   29: ifeq +13 -> 42
    //   32: ldc -46
    //   34: aload_1
    //   35: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_1
    //   39: goto +13 -> 52
    //   42: new 204	java/lang/String
    //   45: dup
    //   46: ldc -46
    //   48: invokespecial 217	java/lang/String:<init>	(Ljava/lang/String;)V
    //   51: astore_1
    //   52: aload_1
    //   53: invokestatic 219	com/google/ads/interactivemedia/v3/internal/rp:b	(Ljava/lang/String;)V
    //   56: aload_0
    //   57: getfield 39	com/google/ads/interactivemedia/v3/internal/uq:b	Lcom/google/ads/interactivemedia/v3/internal/ut;
    //   60: invokeinterface 220 1 0
    //   65: invokestatic 222	com/google/ads/interactivemedia/v3/internal/rp:e	()V
    //   68: goto +9 -> 77
    //   71: astore_1
    //   72: invokestatic 222	com/google/ads/interactivemedia/v3/internal/rp:e	()V
    //   75: aload_1
    //   76: athrow
    //   77: aload_0
    //   78: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   81: ifne +9 -> 90
    //   84: aload_0
    //   85: iconst_2
    //   86: invokevirtual 98	android/os/Handler:sendEmptyMessage	(I)Z
    //   89: pop
    //   90: return
    //   91: astore_1
    //   92: ldc -91
    //   94: ldc -32
    //   96: aload_1
    //   97: invokestatic 172	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: aload_0
    //   101: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   104: ifne +12 -> 116
    //   107: aload_0
    //   108: iconst_4
    //   109: aload_1
    //   110: invokevirtual 228	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   113: invokevirtual 231	android/os/Message:sendToTarget	()V
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: ldc -91
    //   121: ldc -23
    //   123: aload_1
    //   124: invokestatic 172	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   127: aload_0
    //   128: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   131: ifne +19 -> 150
    //   134: aload_0
    //   135: iconst_3
    //   136: new 174	com/google/ads/interactivemedia/v3/internal/uu
    //   139: dup
    //   140: aload_1
    //   141: invokespecial 177	com/google/ads/interactivemedia/v3/internal/uu:<init>	(Ljava/lang/Throwable;)V
    //   144: invokevirtual 228	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   147: invokevirtual 231	android/os/Message:sendToTarget	()V
    //   150: return
    //   151: astore_1
    //   152: ldc -91
    //   154: ldc -21
    //   156: aload_1
    //   157: invokestatic 172	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   160: aload_0
    //   161: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   164: ifne +19 -> 183
    //   167: aload_0
    //   168: iconst_3
    //   169: new 174	com/google/ads/interactivemedia/v3/internal/uu
    //   172: dup
    //   173: aload_1
    //   174: invokespecial 177	com/google/ads/interactivemedia/v3/internal/uu:<init>	(Ljava/lang/Throwable;)V
    //   177: invokevirtual 228	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   180: invokevirtual 231	android/os/Message:sendToTarget	()V
    //   183: return
    //   184: astore_1
    //   185: aload_0
    //   186: getfield 100	com/google/ads/interactivemedia/v3/internal/uq:h	Z
    //   189: invokestatic 80	com/google/ads/interactivemedia/v3/internal/rp:c	(Z)V
    //   192: aload_0
    //   193: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   196: ifne +9 -> 205
    //   199: aload_0
    //   200: iconst_2
    //   201: invokevirtual 98	android/os/Handler:sendEmptyMessage	(I)Z
    //   204: pop
    //   205: return
    //   206: astore_1
    //   207: aload_0
    //   208: getfield 88	com/google/ads/interactivemedia/v3/internal/uq:i	Z
    //   211: ifne +12 -> 223
    //   214: aload_0
    //   215: iconst_3
    //   216: aload_1
    //   217: invokevirtual 228	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   220: invokevirtual 231	android/os/Message:sendToTarget	()V
    //   223: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	this	uq
    //   24	29	1	str	String
    //   71	5	1	localObject	Object
    //   91	26	1	localError	Error
    //   118	23	1	localOutOfMemoryError	OutOfMemoryError
    //   151	23	1	localException	Exception
    //   184	1	1	localInterruptedException	InterruptedException
    //   206	11	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   56	65	71	finally
    //   0	39	91	java/lang/Error
    //   42	52	91	java/lang/Error
    //   52	56	91	java/lang/Error
    //   65	68	91	java/lang/Error
    //   72	77	91	java/lang/Error
    //   77	90	91	java/lang/Error
    //   0	39	118	java/lang/OutOfMemoryError
    //   42	52	118	java/lang/OutOfMemoryError
    //   52	56	118	java/lang/OutOfMemoryError
    //   65	68	118	java/lang/OutOfMemoryError
    //   72	77	118	java/lang/OutOfMemoryError
    //   77	90	118	java/lang/OutOfMemoryError
    //   0	39	151	java/lang/Exception
    //   42	52	151	java/lang/Exception
    //   52	56	151	java/lang/Exception
    //   65	68	151	java/lang/Exception
    //   72	77	151	java/lang/Exception
    //   77	90	151	java/lang/Exception
    //   0	39	184	java/lang/InterruptedException
    //   42	52	184	java/lang/InterruptedException
    //   52	56	184	java/lang/InterruptedException
    //   65	68	184	java/lang/InterruptedException
    //   72	77	184	java/lang/InterruptedException
    //   77	90	184	java/lang/InterruptedException
    //   0	39	206	java/io/IOException
    //   42	52	206	java/io/IOException
    //   52	56	206	java/io/IOException
    //   65	68	206	java/io/IOException
    //   72	77	206	java/io/IOException
    //   77	90	206	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */