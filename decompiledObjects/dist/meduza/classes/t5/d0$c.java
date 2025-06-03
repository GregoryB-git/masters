package t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import v5.m;
import x6.b;

public final class d0$c<T extends d0.d>
  extends Handler
  implements Runnable
{
  public final int a;
  public final T b;
  public final long c;
  public d0.a<T> d;
  public IOException e;
  public int f;
  public Thread o;
  public boolean p;
  public volatile boolean q;
  
  public d0$c(Looper paramLooper, T paramT, d0.a<T> parama, int paramInt, long paramLong)
  {
    super(paramT);
    b = parama;
    d = paramInt;
    a = paramLong;
    Object localObject;
    c = localObject;
  }
  
  public final void a(boolean paramBoolean)
  {
    q = paramBoolean;
    e = null;
    if (hasMessages(0))
    {
      p = true;
      removeMessages(0);
      if (paramBoolean) {
        break label72;
      }
      sendEmptyMessage(1);
    }
    try
    {
      p = true;
      b.b();
      Object localObject1 = o;
      if (localObject1 != null) {
        ((Thread)localObject1).interrupt();
      }
      label72:
      if (paramBoolean)
      {
        r.b = null;
        long l = SystemClock.elapsedRealtime();
        localObject1 = d;
        localObject1.getClass();
        ((d0.a)localObject1).k(b, l, l - c, true);
        d = null;
      }
      return;
    }
    finally {}
  }
  
  public final void b(long paramLong)
  {
    boolean bool;
    if (r.b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    d0 locald0 = r;
    b = this;
    if (paramLong > 0L)
    {
      sendEmptyMessageDelayed(0, paramLong);
    }
    else
    {
      e = null;
      a.execute(this);
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (q) {
      return;
    }
    int i = what;
    Object localObject;
    if (i == 0)
    {
      e = null;
      localObject = r;
      paramMessage = a;
      localObject = b;
      localObject.getClass();
      paramMessage.execute((Runnable)localObject);
      return;
    }
    if (i != 3)
    {
      r.b = null;
      long l1 = SystemClock.elapsedRealtime();
      long l2 = l1 - c;
      localObject = d;
      localObject.getClass();
      if (p)
      {
        ((d0.a)localObject).k(b, l1, l2, false);
        return;
      }
      i = what;
      if (i != 1)
      {
        if (i == 2)
        {
          paramMessage = (IOException)obj;
          e = paramMessage;
          i = f + 1;
          f = i;
          paramMessage = ((d0.a)localObject).u(b, l1, l2, paramMessage, i);
          i = a;
          if (i == 3)
          {
            r.c = e;
          }
          else if (i != 2)
          {
            if (i == 1) {
              f = 1;
            }
            l1 = b;
            if (l1 == -9223372036854775807L) {
              l1 = Math.min((f - 1) * 1000, 5000);
            }
            b(l1);
          }
        }
      }
      else {
        try
        {
          ((d0.a)localObject).p(b, l1, l2);
        }
        catch (RuntimeException paramMessage)
        {
          m.d("LoadTask", "Unexpected exception handling load completed", paramMessage);
          r.c = new d0.g(paramMessage);
        }
      }
      return;
    }
    throw ((Error)obj);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	t5/d0$c:p	Z
    //   6: ifne +8 -> 14
    //   9: iconst_1
    //   10: istore_1
    //   11: goto +5 -> 16
    //   14: iconst_0
    //   15: istore_1
    //   16: aload_0
    //   17: invokestatic 183	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   20: putfield 72	t5/d0$c:o	Ljava/lang/Thread;
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ifeq +61 -> 87
    //   29: new 185	java/lang/StringBuilder
    //   32: astore_2
    //   33: aload_2
    //   34: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   37: aload_2
    //   38: ldc -67
    //   40: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: aload_0
    //   46: getfield 38	t5/d0$c:b	Lt5/d0$d;
    //   49: invokevirtual 92	java/lang/Object:getClass	()Ljava/lang/Class;
    //   52: invokevirtual 199	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   55: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 208	p2/m0:i	(Ljava/lang/String;)V
    //   66: aload_0
    //   67: getfield 38	t5/d0$c:b	Lt5/d0$d;
    //   70: invokeinterface 210 1 0
    //   75: invokestatic 213	p2/m0:B	()V
    //   78: goto +9 -> 87
    //   81: astore_2
    //   82: invokestatic 213	p2/m0:B	()V
    //   85: aload_2
    //   86: athrow
    //   87: aload_0
    //   88: monitorenter
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield 72	t5/d0$c:o	Ljava/lang/Thread;
    //   94: invokestatic 217	java/lang/Thread:interrupted	()Z
    //   97: pop
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_0
    //   101: getfield 50	t5/d0$c:q	Z
    //   104: ifne +134 -> 238
    //   107: aload_0
    //   108: iconst_1
    //   109: invokevirtual 65	android/os/Handler:sendEmptyMessage	(I)Z
    //   112: pop
    //   113: goto +125 -> 238
    //   116: astore_2
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_2
    //   120: athrow
    //   121: astore_2
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_2
    //   125: athrow
    //   126: astore_2
    //   127: aload_0
    //   128: getfield 50	t5/d0$c:q	Z
    //   131: ifne +20 -> 151
    //   134: ldc -96
    //   136: ldc -37
    //   138: aload_2
    //   139: invokestatic 167	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   142: aload_0
    //   143: iconst_3
    //   144: aload_2
    //   145: invokevirtual 223	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   148: invokevirtual 226	android/os/Message:sendToTarget	()V
    //   151: aload_2
    //   152: athrow
    //   153: astore_2
    //   154: aload_0
    //   155: getfield 50	t5/d0$c:q	Z
    //   158: ifne +80 -> 238
    //   161: ldc -96
    //   163: ldc -28
    //   165: aload_2
    //   166: invokestatic 167	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: new 169	t5/d0$g
    //   172: dup
    //   173: aload_2
    //   174: invokespecial 172	t5/d0$g:<init>	(Ljava/lang/Throwable;)V
    //   177: astore_2
    //   178: aload_0
    //   179: iconst_2
    //   180: aload_2
    //   181: invokevirtual 223	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   184: astore_2
    //   185: aload_2
    //   186: invokevirtual 226	android/os/Message:sendToTarget	()V
    //   189: goto +49 -> 238
    //   192: astore_2
    //   193: aload_0
    //   194: getfield 50	t5/d0$c:q	Z
    //   197: ifne +41 -> 238
    //   200: ldc -96
    //   202: ldc -26
    //   204: aload_2
    //   205: invokestatic 167	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   208: new 169	t5/d0$g
    //   211: dup
    //   212: aload_2
    //   213: invokespecial 172	t5/d0$g:<init>	(Ljava/lang/Throwable;)V
    //   216: astore_2
    //   217: goto -39 -> 178
    //   220: astore_2
    //   221: aload_0
    //   222: getfield 50	t5/d0$c:q	Z
    //   225: ifne +13 -> 238
    //   228: aload_0
    //   229: iconst_2
    //   230: aload_2
    //   231: invokevirtual 223	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   234: astore_2
    //   235: goto -50 -> 185
    //   238: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	c
    //   10	16	1	i	int
    //   32	28	2	localStringBuilder	StringBuilder
    //   81	5	2	localObject1	Object
    //   116	4	2	localObject2	Object
    //   121	4	2	localObject3	Object
    //   126	26	2	localError	Error
    //   153	21	2	localOutOfMemoryError	OutOfMemoryError
    //   177	9	2	localObject4	Object
    //   192	21	2	localException	Exception
    //   216	1	2	localg	d0.g
    //   220	11	2	localIOException	IOException
    //   234	1	2	localMessage	Message
    // Exception table:
    //   from	to	target	type
    //   66	75	81	finally
    //   89	100	116	finally
    //   117	119	116	finally
    //   2	9	121	finally
    //   16	25	121	finally
    //   122	124	121	finally
    //   0	2	126	java/lang/Error
    //   29	66	126	java/lang/Error
    //   75	78	126	java/lang/Error
    //   82	87	126	java/lang/Error
    //   87	89	126	java/lang/Error
    //   100	113	126	java/lang/Error
    //   119	121	126	java/lang/Error
    //   124	126	126	java/lang/Error
    //   0	2	153	java/lang/OutOfMemoryError
    //   29	66	153	java/lang/OutOfMemoryError
    //   75	78	153	java/lang/OutOfMemoryError
    //   82	87	153	java/lang/OutOfMemoryError
    //   87	89	153	java/lang/OutOfMemoryError
    //   100	113	153	java/lang/OutOfMemoryError
    //   119	121	153	java/lang/OutOfMemoryError
    //   124	126	153	java/lang/OutOfMemoryError
    //   0	2	192	java/lang/Exception
    //   29	66	192	java/lang/Exception
    //   75	78	192	java/lang/Exception
    //   82	87	192	java/lang/Exception
    //   87	89	192	java/lang/Exception
    //   100	113	192	java/lang/Exception
    //   119	121	192	java/lang/Exception
    //   124	126	192	java/lang/Exception
    //   0	2	220	java/io/IOException
    //   29	66	220	java/io/IOException
    //   75	78	220	java/io/IOException
    //   82	87	220	java/io/IOException
    //   87	89	220	java/io/IOException
    //   100	113	220	java/io/IOException
    //   119	121	220	java/io/IOException
    //   124	126	220	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     t5.d0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */