package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AFc1bSDK
  implements Runnable
{
  final ExecutorService AFInAppEventParameterName;
  final Set<AFd1vSDK> AFInAppEventType = new CopyOnWriteArraySet();
  public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
  final NavigableSet<AFd1zSDK<?>> AFLogger = new ConcurrentSkipListSet();
  final List<AFd1zSDK<?>> afDebugLog = new ArrayList();
  final Set<AFd1zSDK<?>> afErrorLog = Collections.newSetFromMap(new ConcurrentHashMap());
  final NavigableSet<AFd1zSDK<?>> afInfoLog = new ConcurrentSkipListSet();
  private Timer afRDLog = new Timer(true);
  final Set<AFd1vSDK> valueOf = Collections.newSetFromMap(new ConcurrentHashMap());
  public final List<AFc1cSDK> values = new CopyOnWriteArrayList();
  
  public AFc1bSDK(ExecutorService paramExecutorService)
  {
    AFInAppEventParameterName = paramExecutorService;
  }
  
  public static boolean valueOf(AFd1zSDK<?> paramAFd1zSDK)
  {
    return (!(paramAFd1zSDK instanceof AFd1jSDK)) || (values != AFd1vSDK.AppsFlyer2dXConversionCallback);
  }
  
  private boolean values(AFd1zSDK<?> paramAFd1zSDK)
  {
    return AFInAppEventType.containsAll(AFInAppEventParameterName);
  }
  
  public final void AFInAppEventParameterName(NavigableSet<AFd1zSDK<?>> paramNavigableSet)
  {
    AFd1zSDK localAFd1zSDK = (AFd1zSDK)paramNavigableSet.pollFirst();
    AFInAppEventType.add(values);
    paramNavigableSet = values.iterator();
    while (paramNavigableSet.hasNext()) {
      ((AFc1cSDK)paramNavigableSet.next()).AFInAppEventParameterName(localAFd1zSDK);
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 79	com/appsflyer/internal/AFc1bSDK:AFLogger	Ljava/util/NavigableSet;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 79	com/appsflyer/internal/AFc1bSDK:AFLogger	Ljava/util/NavigableSet;
    //   11: invokeinterface 151 1 0
    //   16: checkcast 110	com/appsflyer/internal/AFd1zSDK
    //   19: astore_2
    //   20: aload_2
    //   21: ifnonnull +10 -> 31
    //   24: aload_1
    //   25: monitorexit
    //   26: return
    //   27: astore_2
    //   28: goto +222 -> 250
    //   31: aload_0
    //   32: getfield 88	com/appsflyer/internal/AFc1bSDK:afErrorLog	Ljava/util/Set;
    //   35: aload_2
    //   36: invokeinterface 122 2 0
    //   41: pop
    //   42: aload_1
    //   43: monitorexit
    //   44: aload_2
    //   45: invokevirtual 168	com/appsflyer/internal/AFd1zSDK:AFInAppEventType	()J
    //   48: lstore_3
    //   49: new 170	com/appsflyer/internal/AFd1uSDK
    //   52: dup
    //   53: invokestatic 176	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   56: invokespecial 179	com/appsflyer/internal/AFd1uSDK:<init>	(Ljava/lang/Thread;)V
    //   59: astore_1
    //   60: lload_3
    //   61: lconst_0
    //   62: lcmp
    //   63: ifle +12 -> 75
    //   66: aload_0
    //   67: getfield 53	com/appsflyer/internal/AFc1bSDK:afRDLog	Ljava/util/Timer;
    //   70: aload_1
    //   71: lload_3
    //   72: invokevirtual 183	java/util/Timer:schedule	(Ljava/util/TimerTask;J)V
    //   75: aload_0
    //   76: getfield 46	com/appsflyer/internal/AFc1bSDK:AFKeystoreWrapper	Ljava/util/concurrent/Executor;
    //   79: new 8	com/appsflyer/internal/AFc1bSDK$2
    //   82: dup
    //   83: aload_0
    //   84: aload_2
    //   85: invokespecial 186	com/appsflyer/internal/AFc1bSDK$2:<init>	(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)V
    //   88: invokeinterface 192 2 0
    //   93: aload_0
    //   94: getfield 79	com/appsflyer/internal/AFc1bSDK:AFLogger	Ljava/util/NavigableSet;
    //   97: invokeinterface 195 1 0
    //   102: ifne +14 -> 116
    //   105: aload_0
    //   106: getfield 90	com/appsflyer/internal/AFc1bSDK:AFInAppEventParameterName	Ljava/util/concurrent/ExecutorService;
    //   109: aload_0
    //   110: invokeinterface 128 2 0
    //   115: pop
    //   116: ldc -59
    //   118: aload_2
    //   119: invokestatic 202	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokevirtual 206	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokestatic 211	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   128: aload_2
    //   129: invokevirtual 214	com/appsflyer/internal/AFd1zSDK:afErrorLog	()Lcom/appsflyer/internal/AFd1ySDK;
    //   132: astore 5
    //   134: aload_1
    //   135: invokevirtual 219	java/util/TimerTask:cancel	()Z
    //   138: pop
    //   139: aload_0
    //   140: getfield 46	com/appsflyer/internal/AFc1bSDK:AFKeystoreWrapper	Ljava/util/concurrent/Executor;
    //   143: astore 6
    //   145: new 10	com/appsflyer/internal/AFc1bSDK$3
    //   148: astore 7
    //   150: aload 7
    //   152: aload_0
    //   153: aload_2
    //   154: aload 5
    //   156: invokespecial 222	com/appsflyer/internal/AFc1bSDK$3:<init>	(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V
    //   159: aload 6
    //   161: aload 7
    //   163: invokeinterface 192 2 0
    //   168: return
    //   169: astore 6
    //   171: aload_1
    //   172: invokevirtual 219	java/util/TimerTask:cancel	()Z
    //   175: pop
    //   176: getstatic 227	com/appsflyer/internal/AFd1ySDK:valueOf	Lcom/appsflyer/internal/AFd1ySDK;
    //   179: astore 6
    //   181: aload_0
    //   182: getfield 46	com/appsflyer/internal/AFc1bSDK:AFKeystoreWrapper	Ljava/util/concurrent/Executor;
    //   185: astore_1
    //   186: new 10	com/appsflyer/internal/AFc1bSDK$3
    //   189: dup
    //   190: aload_0
    //   191: aload_2
    //   192: aload 6
    //   194: invokespecial 222	com/appsflyer/internal/AFc1bSDK$3:<init>	(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V
    //   197: astore_2
    //   198: aload_1
    //   199: aload_2
    //   200: invokeinterface 192 2 0
    //   205: return
    //   206: astore_1
    //   207: ldc -27
    //   209: aload_2
    //   210: invokestatic 202	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   213: invokevirtual 206	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   216: invokestatic 211	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   219: getstatic 231	com/appsflyer/internal/AFd1ySDK:AFInAppEventType	Lcom/appsflyer/internal/AFd1ySDK;
    //   222: astore 6
    //   224: aload_2
    //   225: aload 6
    //   227: putfield 232	com/appsflyer/internal/AFd1zSDK:valueOf	Lcom/appsflyer/internal/AFd1ySDK;
    //   230: aload_0
    //   231: getfield 46	com/appsflyer/internal/AFc1bSDK:AFKeystoreWrapper	Ljava/util/concurrent/Executor;
    //   234: astore_1
    //   235: new 10	com/appsflyer/internal/AFc1bSDK$3
    //   238: dup
    //   239: aload_0
    //   240: aload_2
    //   241: aload 6
    //   243: invokespecial 222	com/appsflyer/internal/AFc1bSDK$3:<init>	(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFd1ySDK;)V
    //   246: astore_2
    //   247: goto -49 -> 198
    //   250: aload_1
    //   251: monitorexit
    //   252: aload_2
    //   253: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	AFc1bSDK
    //   4	195	1	localObject1	Object
    //   206	1	1	localInterruptedException	InterruptedException
    //   234	17	1	localExecutor1	Executor
    //   19	2	2	localAFd1zSDK	AFd1zSDK
    //   27	165	2	localObject2	Object
    //   197	56	2	local31	3
    //   48	24	3	l	long
    //   132	23	5	localAFd1ySDK1	AFd1ySDK
    //   143	17	6	localExecutor2	Executor
    //   169	1	6	localObject3	Object
    //   179	63	6	localAFd1ySDK2	AFd1ySDK
    //   148	14	7	local32	3
    // Exception table:
    //   from	to	target	type
    //   7	20	27	finally
    //   24	26	27	finally
    //   31	44	27	finally
    //   116	168	169	finally
    //   116	168	206	java/lang/InterruptedException
    //   116	168	206	java/io/InterruptedIOException
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1bSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */