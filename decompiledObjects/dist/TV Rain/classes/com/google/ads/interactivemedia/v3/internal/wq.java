package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

final class wq
  extends HandlerThread
  implements Handler.Callback
{
  private vj a;
  private Handler b;
  private Error c;
  private RuntimeException d;
  private wr e;
  
  public wq()
  {
    super("dummySurface");
  }
  
  public final wr a(int paramInt)
  {
    start();
    Object localObject1 = new Handler(getLooper(), this);
    b = ((Handler)localObject1);
    a = new vj((Handler)localObject1);
    try
    {
      localObject1 = b;
      int i = 0;
      ((Handler)localObject1).obtainMessage(1, paramInt, 0).sendToTarget();
      paramInt = i;
      while ((e == null) && (d == null))
      {
        localObject1 = c;
        if (localObject1 != null) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          paramInt = 1;
        }
      }
      if (paramInt != 0) {
        Thread.currentThread().interrupt();
      }
      Object localObject2 = d;
      if (localObject2 == null)
      {
        localObject2 = c;
        if (localObject2 == null) {
          return (wr)rp.a(e);
        }
        throw ((Throwable)localObject2);
      }
      throw ((Throwable)localObject2);
    }
    finally {}
  }
  
  public final void a()
  {
    rp.a(b);
    b.sendEmptyMessage(2);
  }
  
  /* Error */
  public final boolean handleMessage(Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 98	android/os/Message:what	I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq +57 -> 64
    //   10: iload_2
    //   11: iconst_2
    //   12: if_icmpeq +5 -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 50	com/google/ads/interactivemedia/v3/internal/wq:a	Lcom/google/ads/interactivemedia/v3/internal/vj;
    //   21: invokestatic 82	com/google/ads/interactivemedia/v3/internal/rp:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: pop
    //   25: aload_0
    //   26: getfield 50	com/google/ads/interactivemedia/v3/internal/wq:a	Lcom/google/ads/interactivemedia/v3/internal/vj;
    //   29: invokevirtual 100	com/google/ads/interactivemedia/v3/internal/vj:a	()V
    //   32: aload_0
    //   33: invokevirtual 104	android/os/HandlerThread:quit	()Z
    //   36: pop
    //   37: goto +17 -> 54
    //   40: astore_1
    //   41: ldc 106
    //   43: ldc 108
    //   45: aload_1
    //   46: invokestatic 113	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: aload_0
    //   50: invokevirtual 104	android/os/HandlerThread:quit	()Z
    //   53: pop
    //   54: iconst_1
    //   55: ireturn
    //   56: astore_1
    //   57: aload_0
    //   58: invokevirtual 104	android/os/HandlerThread:quit	()Z
    //   61: pop
    //   62: aload_1
    //   63: athrow
    //   64: aload_1
    //   65: getfield 116	android/os/Message:arg1	I
    //   68: istore_2
    //   69: aload_0
    //   70: getfield 50	com/google/ads/interactivemedia/v3/internal/wq:a	Lcom/google/ads/interactivemedia/v3/internal/vj;
    //   73: invokestatic 82	com/google/ads/interactivemedia/v3/internal/rp:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: getfield 50	com/google/ads/interactivemedia/v3/internal/wq:a	Lcom/google/ads/interactivemedia/v3/internal/vj;
    //   81: iload_2
    //   82: invokevirtual 119	com/google/ads/interactivemedia/v3/internal/vj:a	(I)V
    //   85: new 84	com/google/ads/interactivemedia/v3/internal/wr
    //   88: astore_3
    //   89: aload_0
    //   90: getfield 50	com/google/ads/interactivemedia/v3/internal/wq:a	Lcom/google/ads/interactivemedia/v3/internal/vj;
    //   93: invokevirtual 122	com/google/ads/interactivemedia/v3/internal/vj:b	()Landroid/graphics/SurfaceTexture;
    //   96: astore_1
    //   97: iload_2
    //   98: ifeq +9 -> 107
    //   101: iconst_1
    //   102: istore 4
    //   104: goto +6 -> 110
    //   107: iconst_0
    //   108: istore 4
    //   110: aload_3
    //   111: aload_0
    //   112: aload_1
    //   113: iload 4
    //   115: iconst_0
    //   116: invokespecial 125	com/google/ads/interactivemedia/v3/internal/wr:<init>	(Lcom/google/ads/interactivemedia/v3/internal/wq;Landroid/graphics/SurfaceTexture;ZB)V
    //   119: aload_0
    //   120: aload_3
    //   121: putfield 61	com/google/ads/interactivemedia/v3/internal/wq:e	Lcom/google/ads/interactivemedia/v3/internal/wr;
    //   124: aload_0
    //   125: monitorenter
    //   126: aload_0
    //   127: invokevirtual 128	java/lang/Object:notify	()V
    //   130: aload_0
    //   131: monitorexit
    //   132: goto +64 -> 196
    //   135: astore_1
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_1
    //   139: athrow
    //   140: astore_1
    //   141: goto +62 -> 203
    //   144: astore_1
    //   145: ldc 106
    //   147: ldc -126
    //   149: aload_1
    //   150: invokestatic 113	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   153: aload_0
    //   154: aload_1
    //   155: putfield 65	com/google/ads/interactivemedia/v3/internal/wq:c	Ljava/lang/Error;
    //   158: aload_0
    //   159: monitorenter
    //   160: aload_0
    //   161: invokevirtual 128	java/lang/Object:notify	()V
    //   164: aload_0
    //   165: monitorexit
    //   166: goto +30 -> 196
    //   169: astore_1
    //   170: aload_0
    //   171: monitorexit
    //   172: aload_1
    //   173: athrow
    //   174: astore_1
    //   175: ldc 106
    //   177: ldc -126
    //   179: aload_1
    //   180: invokestatic 113	com/google/ads/interactivemedia/v3/internal/vr:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   183: aload_0
    //   184: aload_1
    //   185: putfield 63	com/google/ads/interactivemedia/v3/internal/wq:d	Ljava/lang/RuntimeException;
    //   188: aload_0
    //   189: monitorenter
    //   190: aload_0
    //   191: invokevirtual 128	java/lang/Object:notify	()V
    //   194: aload_0
    //   195: monitorexit
    //   196: iconst_1
    //   197: ireturn
    //   198: astore_1
    //   199: aload_0
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: aload_0
    //   204: monitorenter
    //   205: aload_0
    //   206: invokevirtual 128	java/lang/Object:notify	()V
    //   209: aload_0
    //   210: monitorexit
    //   211: aload_1
    //   212: athrow
    //   213: astore_1
    //   214: aload_0
    //   215: monitorexit
    //   216: aload_1
    //   217: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	wq
    //   0	218	1	paramMessage	Message
    //   4	94	2	i	int
    //   88	33	3	localwr	wr
    //   102	12	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   17	32	40	finally
    //   41	49	56	finally
    //   126	132	135	finally
    //   136	138	135	finally
    //   64	97	140	finally
    //   110	124	140	finally
    //   145	158	140	finally
    //   175	188	140	finally
    //   64	97	144	java/lang/Error
    //   110	124	144	java/lang/Error
    //   160	166	169	finally
    //   170	172	169	finally
    //   64	97	174	java/lang/RuntimeException
    //   110	124	174	java/lang/RuntimeException
    //   190	196	198	finally
    //   199	201	198	finally
    //   205	211	213	finally
    //   214	216	213	finally
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */