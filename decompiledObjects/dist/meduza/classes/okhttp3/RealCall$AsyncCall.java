package okhttp3;

import o9.e.a;
import okhttp3.internal.NamedRunnable;

final class RealCall$AsyncCall
  extends NamedRunnable
{
  public final Callback b;
  
  public RealCall$AsyncCall(RealCall paramRealCall, e.a parama)
  {
    super("OkHttp %s", new Object[] { ai });
    b = parama;
  }
  
  /* Error */
  public final void k()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   4: getfield 78	okhttp3/RealCall:c	Lxc/c;
    //   7: invokevirtual 83	xc/c:h	()V
    //   10: iconst_0
    //   11: istore_1
    //   12: aload_0
    //   13: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   16: invokevirtual 86	okhttp3/RealCall:b	()Lokhttp3/Response;
    //   19: astore_2
    //   20: iconst_1
    //   21: istore_1
    //   22: aload_0
    //   23: getfield 72	okhttp3/RealCall$AsyncCall:b	Lokhttp3/Callback;
    //   26: aload_0
    //   27: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   30: aload_2
    //   31: invokeinterface 91 3 0
    //   36: aload_0
    //   37: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   40: getfield 94	okhttp3/RealCall:a	Lokhttp3/OkHttpClient;
    //   43: astore_2
    //   44: goto +206 -> 250
    //   47: astore_2
    //   48: iconst_1
    //   49: istore_1
    //   50: goto +8 -> 58
    //   53: astore_2
    //   54: goto +72 -> 126
    //   57: astore_2
    //   58: aload_0
    //   59: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   62: invokevirtual 96	okhttp3/RealCall:a	()V
    //   65: iload_1
    //   66: ifne +55 -> 121
    //   69: new 75	java/io/IOException
    //   72: astore_3
    //   73: new 98	java/lang/StringBuilder
    //   76: astore 4
    //   78: aload 4
    //   80: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   83: aload 4
    //   85: ldc 101
    //   87: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload 4
    //   93: aload_2
    //   94: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_3
    //   99: aload 4
    //   101: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokespecial 115	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   107: aload_0
    //   108: getfield 72	okhttp3/RealCall$AsyncCall:b	Lokhttp3/Callback;
    //   111: aload_0
    //   112: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   115: aload_3
    //   116: invokeinterface 118 3 0
    //   121: aload_2
    //   122: athrow
    //   123: astore_2
    //   124: iconst_0
    //   125: istore_1
    //   126: aload_0
    //   127: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   130: getfield 78	okhttp3/RealCall:c	Lxc/c;
    //   133: invokevirtual 121	xc/c:i	()Z
    //   136: ifne +6 -> 142
    //   139: goto +25 -> 164
    //   142: new 123	java/io/InterruptedIOException
    //   145: astore 4
    //   147: aload 4
    //   149: ldc 125
    //   151: invokespecial 126	java/io/InterruptedIOException:<init>	(Ljava/lang/String;)V
    //   154: aload 4
    //   156: aload_2
    //   157: invokevirtual 132	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   160: pop
    //   161: aload 4
    //   163: astore_2
    //   164: iload_1
    //   165: ifeq +52 -> 217
    //   168: getstatic 137	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   171: astore_3
    //   172: new 98	java/lang/StringBuilder
    //   175: astore 4
    //   177: aload 4
    //   179: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   182: aload 4
    //   184: ldc -117
    //   186: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload 4
    //   192: aload_0
    //   193: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   196: invokevirtual 141	okhttp3/RealCall:c	()Ljava/lang/String;
    //   199: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload_3
    //   204: iconst_4
    //   205: aload 4
    //   207: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: aload_2
    //   211: invokevirtual 145	okhttp3/internal/platform/Platform:l	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   214: goto +28 -> 242
    //   217: aload_0
    //   218: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   221: getfield 149	okhttp3/RealCall:d	Lokhttp3/EventListener;
    //   224: invokevirtual 36	java/lang/Object:getClass	()Ljava/lang/Class;
    //   227: pop
    //   228: aload_0
    //   229: getfield 72	okhttp3/RealCall$AsyncCall:b	Lokhttp3/Callback;
    //   232: aload_0
    //   233: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   236: aload_2
    //   237: invokeinterface 118 3 0
    //   242: aload_0
    //   243: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   246: getfield 94	okhttp3/RealCall:a	Lokhttp3/OkHttpClient;
    //   249: astore_2
    //   250: aload_2
    //   251: getfield 154	okhttp3/OkHttpClient:a	Lokhttp3/Dispatcher;
    //   254: aload_0
    //   255: invokevirtual 159	okhttp3/Dispatcher:a	(Lokhttp3/RealCall$AsyncCall;)V
    //   258: return
    //   259: astore_2
    //   260: aload_0
    //   261: getfield 20	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   264: getfield 94	okhttp3/RealCall:a	Lokhttp3/OkHttpClient;
    //   267: getfield 154	okhttp3/OkHttpClient:a	Lokhttp3/Dispatcher;
    //   270: aload_0
    //   271: invokevirtual 159	okhttp3/Dispatcher:a	(Lokhttp3/RealCall$AsyncCall;)V
    //   274: aload_2
    //   275: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	this	AsyncCall
    //   11	154	1	i	int
    //   19	25	2	localObject1	Object
    //   47	1	2	localObject2	Object
    //   53	1	2	localIOException1	java.io.IOException
    //   57	65	2	localObject3	Object
    //   123	34	2	localIOException2	java.io.IOException
    //   163	88	2	localObject4	Object
    //   259	16	2	localObject5	Object
    //   72	132	3	localObject6	Object
    //   76	130	4	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   22	36	47	finally
    //   22	36	53	java/io/IOException
    //   12	20	57	finally
    //   12	20	123	java/io/IOException
    //   58	65	259	finally
    //   69	121	259	finally
    //   121	123	259	finally
    //   126	139	259	finally
    //   142	161	259	finally
    //   168	214	259	finally
    //   217	242	259	finally
  }
}

/* Location:
 * Qualified Name:     okhttp3.RealCall.AsyncCall
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */