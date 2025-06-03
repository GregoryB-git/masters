package o4;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import b5.g;
import d9.p;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import p2.m0;
import v5.e0;

public final class b
  implements j
{
  public final MediaCodec a;
  public final e b;
  public final d c;
  public final boolean d;
  public boolean e;
  public int f;
  
  public b(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread1, HandlerThread paramHandlerThread2, boolean paramBoolean)
  {
    a = paramMediaCodec;
    b = new e(paramHandlerThread1);
    c = new d(paramMediaCodec, paramHandlerThread2);
    d = paramBoolean;
    f = 0;
  }
  
  public static void o(b paramb, MediaFormat paramMediaFormat, Surface paramSurface, MediaCrypto paramMediaCrypto)
  {
    e locale = b;
    MediaCodec localMediaCodec = a;
    boolean bool;
    if (c == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    b.start();
    Handler localHandler = new Handler(b.getLooper());
    localMediaCodec.setCallback(locale, localHandler);
    c = localHandler;
    m0.i("configureCodec");
    a.configure(paramMediaFormat, paramSurface, paramMediaCrypto, 0);
    m0.B();
    paramMediaFormat = c;
    if (!f)
    {
      b.start();
      c = new c(paramMediaFormat, b.getLooper());
      f = true;
    }
    m0.i("startCodec");
    a.start();
    m0.B();
    f = 1;
  }
  
  public static String p(int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (paramInt == 1)
    {
      paramString = "Audio";
    }
    else if (paramInt == 2)
    {
      paramString = "Video";
    }
    else
    {
      localStringBuilder.append("Unknown(");
      localStringBuilder.append(paramInt);
      paramString = ")";
    }
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public final void a() {}
  
  public final MediaFormat b()
  {
    Object localObject1 = b;
    synchronized (a)
    {
      localObject1 = h;
      if (localObject1 != null) {
        return (MediaFormat)localObject1;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
  }
  
  public final void c(int paramInt, z3.c paramc, long paramLong)
  {
    c.c(paramInt, paramc, paramLong);
  }
  
  public final void d(Bundle paramBundle)
  {
    q();
    a.setParameters(paramBundle);
  }
  
  public final void e(int paramInt, long paramLong)
  {
    a.releaseOutputBuffer(paramInt, paramLong);
  }
  
  public final int f()
  {
    c.b();
    Object localObject1 = b;
    synchronized (a)
    {
      long l = k;
      int i = 0;
      int j;
      if ((l <= 0L) && (!l)) {
        j = 0;
      } else {
        j = 1;
      }
      int k = -1;
      Object localObject4;
      if (j != 0)
      {
        j = k;
      }
      else
      {
        localObject4 = m;
        if (localObject4 != null) {
          break label192;
        }
        localObject4 = j;
        if (localObject4 != null) {
          break label184;
        }
        localObject1 = d;
        int m = c;
        j = i;
        if (m == 0) {
          j = 1;
        }
        if (j != 0)
        {
          j = k;
        }
        else
        {
          if (m == 0) {
            break label174;
          }
          localObject4 = d;
          k = a;
          j = localObject4[k];
          a = (e & k + 1);
          c = (m - 1);
        }
      }
      return j;
      label174:
      localObject1 = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject1).<init>();
      throw ((Throwable)localObject1);
      label184:
      j = null;
      throw ((Throwable)localObject4);
      label192:
      m = null;
      throw ((Throwable)localObject4);
      throw ((Throwable)localObject1);
    }
  }
  
  public final void flush()
  {
    c.a();
    a.flush();
    e locale = b;
    synchronized (a)
    {
      k += 1L;
      Handler localHandler = c;
      int i = e0.a;
      b.d locald = new b/d;
      locald.<init>(locale, 9);
      localHandler.post(locald);
      a.start();
      return;
    }
  }
  
  public final void g(j.c paramc, Handler paramHandler)
  {
    q();
    a.setOnFrameRenderedListener(new a(this, paramc), paramHandler);
  }
  
  public final int h(MediaCodec.BufferInfo paramBufferInfo)
  {
    c.b();
    Object localObject1 = b;
    synchronized (a)
    {
      long l = k;
      int i = 0;
      int j;
      if ((l <= 0L) && (!l)) {
        j = 0;
      } else {
        j = 1;
      }
      int k = -1;
      Object localObject3;
      if (j != 0)
      {
        j = k;
      }
      else
      {
        localObject3 = m;
        if (localObject3 != null) {
          break label268;
        }
        localObject3 = j;
        if (localObject3 != null) {
          break label260;
        }
        i locali = e;
        int m = c;
        j = i;
        if (m == 0) {
          j = 1;
        }
        if (j != 0)
        {
          j = k;
        }
        else
        {
          if (m == 0) {
            break label250;
          }
          localObject3 = d;
          i = a;
          j = localObject3[i];
          a = (e & i + 1);
          c = (m - 1);
          if (j >= 0)
          {
            x6.b.K(h);
            localObject1 = (MediaCodec.BufferInfo)f.remove();
            paramBufferInfo.set(offset, size, presentationTimeUs, flags);
          }
          else if (j == -2)
          {
            h = ((MediaFormat)g.remove());
          }
        }
      }
      return j;
      label250:
      paramBufferInfo = new java/util/NoSuchElementException;
      paramBufferInfo.<init>();
      throw paramBufferInfo;
      label260:
      j = null;
      throw ((Throwable)localObject3);
      label268:
      m = null;
      throw ((Throwable)localObject3);
      throw paramBufferInfo;
    }
  }
  
  public final void i(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    d locald = c;
    locald.b();
    synchronized (d.g)
    {
      d.a locala;
      if (((ArrayDeque)???).isEmpty())
      {
        locala = new o4/d$a;
        locala.<init>();
      }
      for (;;)
      {
        break;
        locala = (d.a)((ArrayDeque)???).removeFirst();
      }
      a = paramInt1;
      b = 0;
      c = paramInt2;
      e = paramLong;
      f = paramInt3;
      ??? = c;
      paramInt1 = e0.a;
      ((Handler)???).obtainMessage(0, locala).sendToTarget();
      return;
    }
  }
  
  public final void j(int paramInt, boolean paramBoolean)
  {
    a.releaseOutputBuffer(paramInt, paramBoolean);
  }
  
  public final void k(int paramInt)
  {
    q();
    a.setVideoScalingMode(paramInt);
  }
  
  public final ByteBuffer l(int paramInt)
  {
    return a.getInputBuffer(paramInt);
  }
  
  public final void m(Surface paramSurface)
  {
    q();
    a.setOutputSurface(paramSurface);
  }
  
  public final ByteBuffer n(int paramInt)
  {
    return a.getOutputBuffer(paramInt);
  }
  
  public final void q()
  {
    if (d) {
      try
      {
        ??? = c;
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
  
  public final void release()
  {
    try
    {
      if (f == 1)
      {
        ??? = c;
        if (f)
        {
          ((d)???).a();
          b.quit();
        }
        f = false;
        e locale = b;
        synchronized (a)
        {
          l = true;
          b.quit();
          locale.a();
        }
      }
      f = 2;
      return;
    }
    finally
    {
      if (!e)
      {
        a.release();
        e = true;
      }
    }
  }
  
  public static final class a
    implements j.b
  {
    public final n7.q<HandlerThread> a;
    public final n7.q<HandlerThread> b;
    
    public a(int paramInt)
    {
      a = localp;
      b = localq;
    }
    
    /* Error */
    public final b b(j.a parama)
    {
      // Byte code:
      //   0: aload_1
      //   1: getfield 40	o4/j$a:a	Lo4/l;
      //   4: getfield 45	o4/l:a	Ljava/lang/String;
      //   7: astore_2
      //   8: aconst_null
      //   9: astore_3
      //   10: new 47	java/lang/StringBuilder
      //   13: astore 4
      //   15: aload 4
      //   17: invokespecial 48	java/lang/StringBuilder:<init>	()V
      //   20: aload 4
      //   22: ldc 50
      //   24: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   27: pop
      //   28: aload 4
      //   30: aload_2
      //   31: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   34: pop
      //   35: aload 4
      //   37: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   40: invokestatic 64	p2/m0:i	(Ljava/lang/String;)V
      //   43: aload_2
      //   44: invokestatic 70	android/media/MediaCodec:createByCodecName	(Ljava/lang/String;)Landroid/media/MediaCodec;
      //   47: astore_2
      //   48: new 8	o4/b
      //   51: astore 4
      //   53: aload 4
      //   55: aload_2
      //   56: aload_0
      //   57: getfield 26	o4/b$a:a	Ln7/q;
      //   60: invokeinterface 76 1 0
      //   65: checkcast 78	android/os/HandlerThread
      //   68: aload_0
      //   69: getfield 28	o4/b$a:b	Ln7/q;
      //   72: invokeinterface 76 1 0
      //   77: checkcast 78	android/os/HandlerThread
      //   80: iconst_0
      //   81: invokespecial 81	o4/b:<init>	(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;Z)V
      //   84: invokestatic 84	p2/m0:B	()V
      //   87: aload 4
      //   89: aload_1
      //   90: getfield 87	o4/j$a:b	Landroid/media/MediaFormat;
      //   93: aload_1
      //   94: getfield 91	o4/j$a:d	Landroid/view/Surface;
      //   97: aload_1
      //   98: getfield 95	o4/j$a:e	Landroid/media/MediaCrypto;
      //   101: invokestatic 99	o4/b:o	(Lo4/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;)V
      //   104: aload 4
      //   106: areturn
      //   107: astore_1
      //   108: aload 4
      //   110: astore_3
      //   111: goto +10 -> 121
      //   114: astore_1
      //   115: goto +6 -> 121
      //   118: astore_1
      //   119: aconst_null
      //   120: astore_2
      //   121: aload_3
      //   122: ifnonnull +14 -> 136
      //   125: aload_2
      //   126: ifnull +14 -> 140
      //   129: aload_2
      //   130: invokevirtual 102	android/media/MediaCodec:release	()V
      //   133: goto +7 -> 140
      //   136: aload_3
      //   137: invokevirtual 103	o4/b:release	()V
      //   140: aload_1
      //   141: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	142	0	this	a
      //   0	142	1	parama	j.a
      //   7	123	2	localObject1	Object
      //   9	128	3	localObject2	Object
      //   13	96	4	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   84	104	107	java/lang/Exception
      //   48	84	114	java/lang/Exception
      //   10	48	118	java/lang/Exception
    }
  }
}

/* Location:
 * Qualified Name:     o4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */