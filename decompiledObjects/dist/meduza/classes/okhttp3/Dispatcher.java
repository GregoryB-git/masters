package okhttp3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

public final class Dispatcher
{
  public int a = 64;
  public int b = 5;
  public ThreadPoolExecutor c;
  public final ArrayDeque d = new ArrayDeque();
  public final ArrayDeque e = new ArrayDeque();
  public final ArrayDeque f = new ArrayDeque();
  
  public final void a(RealCall.AsyncCall paramAsyncCall)
  {
    ArrayDeque localArrayDeque = e;
    try
    {
      if (localArrayDeque.remove(paramAsyncCall))
      {
        b();
        return;
      }
      paramAsyncCall = new java/lang/AssertionError;
      paramAsyncCall.<init>("Call wasn't in-flight!");
      throw paramAsyncCall;
    }
    finally {}
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: new 49	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 50	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 26	okhttp3/Dispatcher:d	Ljava/util/ArrayDeque;
    //   14: invokevirtual 54	java/util/ArrayDeque:iterator	()Ljava/util/Iterator;
    //   17: astore_2
    //   18: aload_2
    //   19: invokeinterface 60 1 0
    //   24: istore_3
    //   25: iconst_0
    //   26: istore 4
    //   28: iload_3
    //   29: ifeq +151 -> 180
    //   32: aload_2
    //   33: invokeinterface 64 1 0
    //   38: checkcast 66	okhttp3/RealCall$AsyncCall
    //   41: astore 5
    //   43: aload_0
    //   44: getfield 28	okhttp3/Dispatcher:e	Ljava/util/ArrayDeque;
    //   47: invokevirtual 70	java/util/ArrayDeque:size	()I
    //   50: aload_0
    //   51: getfield 19	okhttp3/Dispatcher:a	I
    //   54: if_icmplt +6 -> 60
    //   57: goto +123 -> 180
    //   60: aload_0
    //   61: getfield 28	okhttp3/Dispatcher:e	Ljava/util/ArrayDeque;
    //   64: invokevirtual 54	java/util/ArrayDeque:iterator	()Ljava/util/Iterator;
    //   67: astore 6
    //   69: aload 6
    //   71: invokeinterface 60 1 0
    //   76: ifeq +66 -> 142
    //   79: aload 6
    //   81: invokeinterface 64 1 0
    //   86: checkcast 66	okhttp3/RealCall$AsyncCall
    //   89: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   92: astore 7
    //   94: aload 7
    //   96: getfield 78	okhttp3/RealCall:f	Z
    //   99: ifeq +6 -> 105
    //   102: goto -33 -> 69
    //   105: aload 7
    //   107: getfield 81	okhttp3/RealCall:e	Lokhttp3/Request;
    //   110: getfield 86	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   113: getfield 91	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   116: aload 5
    //   118: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   121: getfield 81	okhttp3/RealCall:e	Lokhttp3/Request;
    //   124: getfield 86	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   127: getfield 91	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   130: invokevirtual 96	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   133: ifeq -64 -> 69
    //   136: iinc 4 1
    //   139: goto -70 -> 69
    //   142: iload 4
    //   144: aload_0
    //   145: getfield 21	okhttp3/Dispatcher:b	I
    //   148: if_icmplt +6 -> 154
    //   151: goto -133 -> 18
    //   154: aload_2
    //   155: invokeinterface 98 1 0
    //   160: aload_1
    //   161: aload 5
    //   163: invokevirtual 101	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   166: pop
    //   167: aload_0
    //   168: getfield 28	okhttp3/Dispatcher:e	Ljava/util/ArrayDeque;
    //   171: aload 5
    //   173: invokevirtual 102	java/util/ArrayDeque:add	(Ljava/lang/Object;)Z
    //   176: pop
    //   177: goto -159 -> 18
    //   180: aload_0
    //   181: monitorenter
    //   182: aload_0
    //   183: getfield 28	okhttp3/Dispatcher:e	Ljava/util/ArrayDeque;
    //   186: invokevirtual 70	java/util/ArrayDeque:size	()I
    //   189: pop
    //   190: aload_0
    //   191: getfield 30	okhttp3/Dispatcher:f	Ljava/util/ArrayDeque;
    //   194: invokevirtual 70	java/util/ArrayDeque:size	()I
    //   197: pop
    //   198: aload_0
    //   199: monitorexit
    //   200: aload_0
    //   201: monitorexit
    //   202: aload_1
    //   203: invokevirtual 103	java/util/ArrayList:size	()I
    //   206: istore 8
    //   208: iconst_0
    //   209: istore 4
    //   211: iload 4
    //   213: iload 8
    //   215: if_icmpge +191 -> 406
    //   218: aload_1
    //   219: iload 4
    //   221: invokevirtual 107	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   224: checkcast 66	okhttp3/RealCall$AsyncCall
    //   227: astore 6
    //   229: aload_0
    //   230: monitorenter
    //   231: aload_0
    //   232: getfield 109	okhttp3/Dispatcher:c	Ljava/util/concurrent/ThreadPoolExecutor;
    //   235: ifnonnull +47 -> 282
    //   238: new 111	java/util/concurrent/ThreadPoolExecutor
    //   241: astore_2
    //   242: getstatic 117	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   245: astore 5
    //   247: new 119	java/util/concurrent/SynchronousQueue
    //   250: astore 7
    //   252: aload 7
    //   254: invokespecial 120	java/util/concurrent/SynchronousQueue:<init>	()V
    //   257: aload_2
    //   258: iconst_0
    //   259: ldc 121
    //   261: ldc2_w 122
    //   264: aload 5
    //   266: aload 7
    //   268: ldc 125
    //   270: iconst_0
    //   271: invokestatic 131	okhttp3/internal/Util:v	(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    //   274: invokespecial 134	java/util/concurrent/ThreadPoolExecutor:<init>	(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    //   277: aload_0
    //   278: aload_2
    //   279: putfield 109	okhttp3/Dispatcher:c	Ljava/util/concurrent/ThreadPoolExecutor;
    //   282: aload_0
    //   283: getfield 109	okhttp3/Dispatcher:c	Ljava/util/concurrent/ThreadPoolExecutor;
    //   286: astore 5
    //   288: aload_0
    //   289: monitorexit
    //   290: aload 6
    //   292: invokevirtual 138	java/lang/Object:getClass	()Ljava/lang/Class;
    //   295: pop
    //   296: aload 5
    //   298: aload 6
    //   300: invokevirtual 142	java/util/concurrent/ThreadPoolExecutor:execute	(Ljava/lang/Runnable;)V
    //   303: goto +74 -> 377
    //   306: astore_1
    //   307: goto +76 -> 383
    //   310: astore 7
    //   312: new 144	java/io/InterruptedIOException
    //   315: astore 5
    //   317: aload 5
    //   319: ldc -110
    //   321: invokespecial 149	java/io/InterruptedIOException:<init>	(Ljava/lang/String;)V
    //   324: aload 5
    //   326: aload 7
    //   328: invokevirtual 155	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   331: pop
    //   332: aload 6
    //   334: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   337: getfield 158	okhttp3/RealCall:d	Lokhttp3/EventListener;
    //   340: invokevirtual 138	java/lang/Object:getClass	()Ljava/lang/Class;
    //   343: pop
    //   344: aload 6
    //   346: getfield 161	okhttp3/RealCall$AsyncCall:b	Lokhttp3/Callback;
    //   349: aload 6
    //   351: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   354: aload 5
    //   356: invokeinterface 166 3 0
    //   361: aload 6
    //   363: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   366: getfield 169	okhttp3/RealCall:a	Lokhttp3/OkHttpClient;
    //   369: getfield 174	okhttp3/OkHttpClient:a	Lokhttp3/Dispatcher;
    //   372: aload 6
    //   374: invokevirtual 176	okhttp3/Dispatcher:a	(Lokhttp3/RealCall$AsyncCall;)V
    //   377: iinc 4 1
    //   380: goto -169 -> 211
    //   383: aload 6
    //   385: getfield 73	okhttp3/RealCall$AsyncCall:c	Lokhttp3/RealCall;
    //   388: getfield 169	okhttp3/RealCall:a	Lokhttp3/OkHttpClient;
    //   391: getfield 174	okhttp3/OkHttpClient:a	Lokhttp3/Dispatcher;
    //   394: aload 6
    //   396: invokevirtual 176	okhttp3/Dispatcher:a	(Lokhttp3/RealCall$AsyncCall;)V
    //   399: aload_1
    //   400: athrow
    //   401: astore_1
    //   402: aload_0
    //   403: monitorexit
    //   404: aload_1
    //   405: athrow
    //   406: return
    //   407: astore_1
    //   408: aload_0
    //   409: monitorexit
    //   410: aload_1
    //   411: athrow
    //   412: astore_1
    //   413: aload_0
    //   414: monitorexit
    //   415: aload_1
    //   416: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	417	0	this	Dispatcher
    //   7	212	1	localArrayList	java.util.ArrayList
    //   306	94	1	localObject1	Object
    //   401	4	1	localObject2	Object
    //   407	4	1	localObject3	Object
    //   412	4	1	localObject4	Object
    //   17	262	2	localObject5	Object
    //   24	5	3	bool	boolean
    //   26	352	4	i	int
    //   41	314	5	localObject6	Object
    //   67	328	6	localObject7	Object
    //   92	175	7	localObject8	Object
    //   310	17	7	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    //   206	10	8	j	int
    // Exception table:
    //   from	to	target	type
    //   296	303	306	finally
    //   312	361	306	finally
    //   296	303	310	java/util/concurrent/RejectedExecutionException
    //   231	282	401	finally
    //   282	288	401	finally
    //   182	198	407	finally
    //   10	18	412	finally
    //   18	25	412	finally
    //   32	57	412	finally
    //   60	69	412	finally
    //   69	102	412	finally
    //   105	136	412	finally
    //   142	151	412	finally
    //   154	177	412	finally
    //   180	182	412	finally
    //   198	202	412	finally
    //   408	412	412	finally
    //   413	415	412	finally
  }
}

/* Location:
 * Qualified Name:     okhttp3.Dispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */