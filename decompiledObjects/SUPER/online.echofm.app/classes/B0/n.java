package B0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g0.M;
import g0.a;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class n
  implements o
{
  public static final c d = h(false, -9223372036854775807L);
  public static final c e = h(true, -9223372036854775807L);
  public static final c f = new c(2, -9223372036854775807L, null);
  public static final c g = new c(3, -9223372036854775807L, null);
  public final ExecutorService a;
  public d b;
  public IOException c;
  
  public n(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ExoPlayer:Loader:");
    localStringBuilder.append(paramString);
    a = M.K0(localStringBuilder.toString());
  }
  
  public static c h(boolean paramBoolean, long paramLong)
  {
    return new c(paramBoolean, paramLong, null);
  }
  
  public void a()
  {
    k(Integer.MIN_VALUE);
  }
  
  public void f()
  {
    ((d)a.h(b)).a(false);
  }
  
  public void g()
  {
    c = null;
  }
  
  public boolean i()
  {
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void k(int paramInt)
  {
    Object localObject = c;
    if (localObject == null)
    {
      localObject = b;
      if (localObject != null)
      {
        int i = paramInt;
        if (paramInt == Integer.MIN_VALUE) {
          i = o;
        }
        ((d)localObject).e(i);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public void l()
  {
    m(null);
  }
  
  public void m(f paramf)
  {
    d locald = b;
    if (locald != null) {
      locald.a(true);
    }
    if (paramf != null) {
      a.execute(new g(paramf));
    }
    a.shutdown();
  }
  
  public long n(e parame, b paramb, int paramInt)
  {
    Looper localLooper = (Looper)a.h(Looper.myLooper());
    c = null;
    long l = SystemClock.elapsedRealtime();
    new d(localLooper, parame, paramb, paramInt, l).f(0L);
    return l;
  }
  
  public static abstract interface b
  {
    public abstract void o(n.e parame, long paramLong1, long paramLong2);
    
    public abstract n.c r(n.e parame, long paramLong1, long paramLong2, IOException paramIOException, int paramInt);
    
    public abstract void t(n.e parame, long paramLong1, long paramLong2, boolean paramBoolean);
  }
  
  public static final class c
  {
    public final int a;
    public final long b;
    
    public c(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
    
    public boolean c()
    {
      int i = a;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 0) {
        if (i == 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
  }
  
  public final class d
    extends Handler
    implements Runnable
  {
    public final int o;
    public final n.e p;
    public final long q;
    public n.b r;
    public IOException s;
    public int t;
    public Thread u;
    public boolean v;
    public volatile boolean w;
    
    public d(Looper paramLooper, n.e parame, n.b paramb, int paramInt, long paramLong)
    {
      super();
      p = parame;
      r = paramb;
      o = paramInt;
      q = paramLong;
    }
    
    public void a(boolean paramBoolean)
    {
      w = paramBoolean;
      s = null;
      if (hasMessages(1))
      {
        v = true;
        removeMessages(1);
        if (!paramBoolean) {
          sendEmptyMessage(2);
        }
      }
      else
      {
        try
        {
          v = true;
          p.c();
          Thread localThread = u;
          if (localThread != null) {
            localThread.interrupt();
          }
        }
        finally
        {
          break label124;
        }
      }
      if (paramBoolean)
      {
        c();
        long l = SystemClock.elapsedRealtime();
        ((n.b)a.e(r)).t(p, l, l - q, true);
        r = null;
      }
      return;
      label124:
      throw ((Throwable)localObject);
    }
    
    public final void b()
    {
      s = null;
      n.e(n.this).execute((Runnable)a.e(n.b(n.this)));
    }
    
    public final void c()
    {
      n.c(n.this, null);
    }
    
    public final long d()
    {
      return Math.min((t - 1) * 1000, 5000);
    }
    
    public void e(int paramInt)
    {
      IOException localIOException = s;
      if ((localIOException != null) && (t > paramInt)) {
        throw localIOException;
      }
    }
    
    public void f(long paramLong)
    {
      boolean bool;
      if (n.b(n.this) == null) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
      n.c(n.this, this);
      if (paramLong > 0L) {
        sendEmptyMessageDelayed(1, paramLong);
      } else {
        b();
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (w) {
        return;
      }
      int i = what;
      if (i == 1)
      {
        b();
        return;
      }
      if (i != 4)
      {
        c();
        long l1 = SystemClock.elapsedRealtime();
        long l2 = l1 - q;
        n.b localb = (n.b)a.e(r);
        if (v)
        {
          localb.t(p, l1, l2, false);
          return;
        }
        i = what;
        if (i != 2)
        {
          if (i == 3)
          {
            paramMessage = (IOException)obj;
            s = paramMessage;
            i = t + 1;
            t = i;
            paramMessage = localb.r(p, l1, l2, paramMessage, i);
            if (n.c.a(paramMessage) == 3)
            {
              n.d(n.this, s);
            }
            else if (n.c.a(paramMessage) != 2)
            {
              if (n.c.a(paramMessage) == 1) {
                t = 1;
              }
              if (n.c.b(paramMessage) != -9223372036854775807L) {
                l1 = n.c.b(paramMessage);
              } else {
                l1 = d();
              }
              f(l1);
            }
          }
        }
        else {
          try
          {
            localb.o(p, l1, l2);
          }
          catch (RuntimeException paramMessage)
          {
            g0.o.d("LoadTask", "Unexpected exception handling load completed", paramMessage);
            n.d(n.this, new n.h(paramMessage));
          }
        }
        return;
      }
      throw ((Error)obj);
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 55	B0/n$d:v	Z
      //   6: istore_1
      //   7: aload_0
      //   8: invokestatic 190	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   11: putfield 70	B0/n$d:u	Ljava/lang/Thread;
      //   14: aload_0
      //   15: monitorexit
      //   16: iload_1
      //   17: iconst_1
      //   18: ixor
      //   19: ifeq +77 -> 96
      //   22: new 192	java/lang/StringBuilder
      //   25: astore_2
      //   26: aload_2
      //   27: invokespecial 194	java/lang/StringBuilder:<init>	()V
      //   30: aload_2
      //   31: ldc -60
      //   33: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   36: pop
      //   37: aload_2
      //   38: aload_0
      //   39: getfield 36	B0/n$d:p	LB0/n$e;
      //   42: invokevirtual 206	java/lang/Object:getClass	()Ljava/lang/Class;
      //   45: invokevirtual 212	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   48: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   51: pop
      //   52: aload_2
      //   53: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   56: invokestatic 220	g0/F:a	(Ljava/lang/String;)V
      //   59: aload_0
      //   60: getfield 36	B0/n$d:p	LB0/n$e;
      //   63: invokeinterface 221 1 0
      //   68: invokestatic 222	g0/F:b	()V
      //   71: goto +25 -> 96
      //   74: astore_2
      //   75: goto +60 -> 135
      //   78: astore_2
      //   79: goto +82 -> 161
      //   82: astore_2
      //   83: goto +116 -> 199
      //   86: astore_2
      //   87: goto +139 -> 226
      //   90: astore_2
      //   91: invokestatic 222	g0/F:b	()V
      //   94: aload_2
      //   95: athrow
      //   96: aload_0
      //   97: monitorenter
      //   98: aload_0
      //   99: aconst_null
      //   100: putfield 70	B0/n$d:u	Ljava/lang/Thread;
      //   103: invokestatic 226	java/lang/Thread:interrupted	()Z
      //   106: pop
      //   107: aload_0
      //   108: monitorexit
      //   109: aload_0
      //   110: getfield 47	B0/n$d:w	Z
      //   113: ifne +130 -> 243
      //   116: aload_0
      //   117: iconst_2
      //   118: invokevirtual 62	android/os/Handler:sendEmptyMessage	(I)Z
      //   121: pop
      //   122: goto +121 -> 243
      //   125: astore_2
      //   126: aload_0
      //   127: monitorexit
      //   128: aload_2
      //   129: athrow
      //   130: astore_2
      //   131: aload_0
      //   132: monitorexit
      //   133: aload_2
      //   134: athrow
      //   135: aload_0
      //   136: getfield 47	B0/n$d:w	Z
      //   139: ifne +20 -> 159
      //   142: ldc -89
      //   144: ldc -28
      //   146: aload_2
      //   147: invokestatic 174	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   150: aload_0
      //   151: iconst_4
      //   152: aload_2
      //   153: invokevirtual 232	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   156: invokevirtual 235	android/os/Message:sendToTarget	()V
      //   159: aload_2
      //   160: athrow
      //   161: aload_0
      //   162: getfield 47	B0/n$d:w	Z
      //   165: ifne +78 -> 243
      //   168: ldc -89
      //   170: ldc -19
      //   172: aload_2
      //   173: invokestatic 174	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   176: new 176	B0/n$h
      //   179: dup
      //   180: aload_2
      //   181: invokespecial 179	B0/n$h:<init>	(Ljava/lang/Throwable;)V
      //   184: astore_2
      //   185: aload_0
      //   186: iconst_3
      //   187: aload_2
      //   188: invokevirtual 232	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   191: astore_2
      //   192: aload_2
      //   193: invokevirtual 235	android/os/Message:sendToTarget	()V
      //   196: goto +47 -> 243
      //   199: aload_0
      //   200: getfield 47	B0/n$d:w	Z
      //   203: ifne +40 -> 243
      //   206: ldc -89
      //   208: ldc -17
      //   210: aload_2
      //   211: invokestatic 174	g0/o:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   214: new 176	B0/n$h
      //   217: dup
      //   218: aload_2
      //   219: invokespecial 179	B0/n$h:<init>	(Ljava/lang/Throwable;)V
      //   222: astore_2
      //   223: goto -38 -> 185
      //   226: aload_0
      //   227: getfield 47	B0/n$d:w	Z
      //   230: ifne +13 -> 243
      //   233: aload_0
      //   234: iconst_3
      //   235: aload_2
      //   236: invokevirtual 232	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   239: astore_2
      //   240: goto -48 -> 192
      //   243: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	244	0	this	d
      //   6	13	1	bool	boolean
      //   25	28	2	localStringBuilder	StringBuilder
      //   74	1	2	localError	Error
      //   78	1	2	localOutOfMemoryError	OutOfMemoryError
      //   82	1	2	localException	Exception
      //   86	1	2	localIOException	IOException
      //   90	5	2	localObject1	Object
      //   125	4	2	localObject2	Object
      //   130	51	2	localThrowable	Throwable
      //   184	56	2	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   0	2	74	java/lang/Error
      //   22	59	74	java/lang/Error
      //   68	71	74	java/lang/Error
      //   91	96	74	java/lang/Error
      //   96	98	74	java/lang/Error
      //   109	122	74	java/lang/Error
      //   128	130	74	java/lang/Error
      //   133	135	74	java/lang/Error
      //   0	2	78	java/lang/OutOfMemoryError
      //   22	59	78	java/lang/OutOfMemoryError
      //   68	71	78	java/lang/OutOfMemoryError
      //   91	96	78	java/lang/OutOfMemoryError
      //   96	98	78	java/lang/OutOfMemoryError
      //   109	122	78	java/lang/OutOfMemoryError
      //   128	130	78	java/lang/OutOfMemoryError
      //   133	135	78	java/lang/OutOfMemoryError
      //   0	2	82	java/lang/Exception
      //   22	59	82	java/lang/Exception
      //   68	71	82	java/lang/Exception
      //   91	96	82	java/lang/Exception
      //   96	98	82	java/lang/Exception
      //   109	122	82	java/lang/Exception
      //   128	130	82	java/lang/Exception
      //   133	135	82	java/lang/Exception
      //   0	2	86	java/io/IOException
      //   22	59	86	java/io/IOException
      //   68	71	86	java/io/IOException
      //   91	96	86	java/io/IOException
      //   96	98	86	java/io/IOException
      //   109	122	86	java/io/IOException
      //   128	130	86	java/io/IOException
      //   133	135	86	java/io/IOException
      //   59	68	90	finally
      //   98	109	125	finally
      //   126	128	125	finally
      //   2	16	130	finally
      //   131	133	130	finally
    }
  }
  
  public static abstract interface e
  {
    public abstract void b();
    
    public abstract void c();
  }
  
  public static abstract interface f
  {
    public abstract void k();
  }
  
  public static final class g
    implements Runnable
  {
    public final n.f o;
    
    public g(n.f paramf)
    {
      o = paramf;
    }
    
    public void run()
    {
      o.k();
    }
  }
  
  public static final class h
    extends IOException
  {
    public h(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     B0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */