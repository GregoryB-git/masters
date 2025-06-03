package io.flutter.embedding.engine.dart;

import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler;
import io.flutter.plugin.common.BinaryMessenger.BinaryReply;
import io.flutter.plugin.common.BinaryMessenger.TaskQueue;
import io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions;
import io.flutter.util.TraceSection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

class DartMessenger
  implements BinaryMessenger, PlatformMessageHandler
{
  private static final String TAG = "DartMessenger";
  private Map<String, List<BufferedMessageInfo>> bufferedMessages = new HashMap();
  private WeakHashMap<BinaryMessenger.TaskQueue, DartMessengerTaskQueue> createdTaskQueues = new WeakHashMap();
  private final AtomicBoolean enableBufferingIncomingMessages = new AtomicBoolean(false);
  private final FlutterJNI flutterJNI;
  private final Object handlersLock = new Object();
  private final Map<String, HandlerInfo> messageHandlers = new HashMap();
  private int nextReplyId = 1;
  private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies = new HashMap();
  private final DartMessengerTaskQueue platformTaskQueue = new PlatformTaskQueue();
  private TaskQueueFactory taskQueueFactory;
  
  public DartMessenger(FlutterJNI paramFlutterJNI)
  {
    this(paramFlutterJNI, new DefaultTaskQueueFactory());
  }
  
  public DartMessenger(FlutterJNI paramFlutterJNI, TaskQueueFactory paramTaskQueueFactory)
  {
    flutterJNI = paramFlutterJNI;
    taskQueueFactory = paramTaskQueueFactory;
  }
  
  private void dispatchMessageToQueue(String paramString, HandlerInfo paramHandlerInfo, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    DartMessengerTaskQueue localDartMessengerTaskQueue;
    if (paramHandlerInfo != null) {
      localDartMessengerTaskQueue = taskQueue;
    } else {
      localDartMessengerTaskQueue = null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlatformChannel ScheduleHandler on ");
    localStringBuilder.append(paramString);
    TraceSection.beginAsyncSection(localStringBuilder.toString(), paramInt);
    paramHandlerInfo = new a(this, paramString, paramInt, paramHandlerInfo, paramByteBuffer, paramLong);
    paramString = localDartMessengerTaskQueue;
    if (localDartMessengerTaskQueue == null) {
      paramString = platformTaskQueue;
    }
    paramString.dispatch(paramHandlerInfo);
  }
  
  private static void handleError(Error paramError)
  {
    Thread localThread = Thread.currentThread();
    if (localThread.getUncaughtExceptionHandler() != null)
    {
      localThread.getUncaughtExceptionHandler().uncaughtException(localThread, paramError);
      return;
    }
    throw paramError;
  }
  
  private void invokeHandler(HandlerInfo paramHandlerInfo, ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramHandlerInfo != null) {
      try
      {
        Log.v("DartMessenger", "Deferring to registered handler to process message.");
        paramHandlerInfo = handler;
        Reply localReply = new io/flutter/embedding/engine/dart/DartMessenger$Reply;
        localReply.<init>(flutterJNI, paramInt);
        paramHandlerInfo.onMessage(paramByteBuffer, localReply);
      }
      catch (Error paramHandlerInfo)
      {
        handleError(paramHandlerInfo);
      }
      catch (Exception paramHandlerInfo)
      {
        Log.e("DartMessenger", "Uncaught exception in binary message listener", paramHandlerInfo);
        break label70;
      }
    } else {
      Log.v("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
    }
    label70:
    flutterJNI.invokePlatformMessageEmptyResponseCallback(paramInt);
  }
  
  public void disableBufferingIncomingMessages()
  {
    synchronized (handlersLock)
    {
      enableBufferingIncomingMessages.set(false);
      Object localObject2 = bufferedMessages;
      Object localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>();
      bufferedMessages = ((Map)localObject3);
      Iterator localIterator = ((Map)localObject2).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (Map.Entry)localIterator.next();
        ??? = ((List)((Map.Entry)localObject3).getValue()).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (BufferedMessageInfo)((Iterator)???).next();
          dispatchMessageToQueue((String)((Map.Entry)localObject3).getKey(), null, message, replyId, messageData);
        }
      }
      return;
    }
  }
  
  public void enableBufferingIncomingMessages()
  {
    enableBufferingIncomingMessages.set(true);
  }
  
  public int getPendingChannelResponseCount()
  {
    return pendingReplies.size();
  }
  
  public void handleMessageFromDart(String paramString, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Received message from Dart over channel '");
    ((StringBuilder)???).append(paramString);
    ((StringBuilder)???).append("'");
    Log.v("DartMessenger", ((StringBuilder)???).toString());
    synchronized (handlersLock)
    {
      HandlerInfo localHandlerInfo = (HandlerInfo)messageHandlers.get(paramString);
      int i;
      if ((enableBufferingIncomingMessages.get()) && (localHandlerInfo == null)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        if (!bufferedMessages.containsKey(paramString))
        {
          localObject2 = bufferedMessages;
          localObject3 = new java/util/LinkedList;
          ((LinkedList)localObject3).<init>();
          ((Map)localObject2).put(paramString, localObject3);
        }
        Object localObject2 = (List)bufferedMessages.get(paramString);
        Object localObject3 = new io/flutter/embedding/engine/dart/DartMessenger$BufferedMessageInfo;
        ((BufferedMessageInfo)localObject3).<init>(paramByteBuffer, paramInt, paramLong);
        ((List)localObject2).add(localObject3);
      }
      if (i == 0) {
        dispatchMessageToQueue(paramString, localHandlerInfo, paramByteBuffer, paramInt, paramLong);
      }
      return;
    }
  }
  
  public void handlePlatformMessageResponse(int paramInt, ByteBuffer paramByteBuffer)
  {
    Log.v("DartMessenger", "Received message reply from Dart.");
    BinaryMessenger.BinaryReply localBinaryReply = (BinaryMessenger.BinaryReply)pendingReplies.remove(Integer.valueOf(paramInt));
    if (localBinaryReply != null) {
      try
      {
        Log.v("DartMessenger", "Invoking registered callback for reply from Dart.");
        localBinaryReply.reply(paramByteBuffer);
        if ((paramByteBuffer != null) && (paramByteBuffer.isDirect())) {
          paramByteBuffer.limit(0);
        }
      }
      catch (Error paramByteBuffer)
      {
        handleError(paramByteBuffer);
      }
      catch (Exception paramByteBuffer)
      {
        Log.e("DartMessenger", "Uncaught exception in binary message reply handler", paramByteBuffer);
      }
    }
  }
  
  public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
  {
    paramTaskQueueOptions = taskQueueFactory.makeBackgroundTaskQueue(paramTaskQueueOptions);
    TaskQueueToken localTaskQueueToken = new TaskQueueToken(null);
    createdTaskQueues.put(localTaskQueueToken, paramTaskQueueOptions);
    return localTaskQueueToken;
  }
  
  public void send(String paramString, ByteBuffer paramByteBuffer)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message over channel '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    Log.v("DartMessenger", localStringBuilder.toString());
    send(paramString, paramByteBuffer, null);
  }
  
  /* Error */
  public void send(String paramString, ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    // Byte code:
    //   0: new 120	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 373
    //   14: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: aload 4
    //   20: aload_1
    //   21: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload 4
    //   27: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 215	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   33: astore 4
    //   35: new 120	java/lang/StringBuilder
    //   38: astore 5
    //   40: aload 5
    //   42: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   45: aload 5
    //   47: ldc_w 375
    //   50: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload 5
    //   56: aload_1
    //   57: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload 5
    //   63: ldc_w 302
    //   66: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: ldc 41
    //   72: aload 5
    //   74: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: invokestatic 177	io/flutter/Log:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: aload_0
    //   81: getfield 93	io/flutter/embedding/engine/dart/DartMessenger:nextReplyId	I
    //   84: istore 6
    //   86: aload_0
    //   87: iload 6
    //   89: iconst_1
    //   90: iadd
    //   91: putfield 93	io/flutter/embedding/engine/dart/DartMessenger:nextReplyId	I
    //   94: aload_3
    //   95: ifnull +19 -> 114
    //   98: aload_0
    //   99: getfield 91	io/flutter/embedding/engine/dart/DartMessenger:pendingReplies	Ljava/util/Map;
    //   102: iload 6
    //   104: invokestatic 335	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: aload_3
    //   108: invokeinterface 319 3 0
    //   113: pop
    //   114: aload_2
    //   115: ifnonnull +16 -> 131
    //   118: aload_0
    //   119: getfield 105	io/flutter/embedding/engine/dart/DartMessenger:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   122: aload_1
    //   123: iload 6
    //   125: invokevirtual 378	io/flutter/embedding/engine/FlutterJNI:dispatchEmptyPlatformMessage	(Ljava/lang/String;I)V
    //   128: goto +18 -> 146
    //   131: aload_0
    //   132: getfield 105	io/flutter/embedding/engine/dart/DartMessenger:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   135: aload_1
    //   136: aload_2
    //   137: aload_2
    //   138: invokevirtual 383	java/nio/Buffer:position	()I
    //   141: iload 6
    //   143: invokevirtual 387	io/flutter/embedding/engine/FlutterJNI:dispatchPlatformMessage	(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V
    //   146: aload 4
    //   148: ifnull +8 -> 156
    //   151: aload 4
    //   153: invokevirtual 230	io/flutter/util/TraceSection:close	()V
    //   156: return
    //   157: astore_1
    //   158: aload 4
    //   160: ifnull +17 -> 177
    //   163: aload 4
    //   165: invokevirtual 230	io/flutter/util/TraceSection:close	()V
    //   168: goto +9 -> 177
    //   171: astore_2
    //   172: aload_1
    //   173: aload_2
    //   174: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   177: aload_1
    //   178: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	DartMessenger
    //   0	179	1	paramString	String
    //   0	179	2	paramByteBuffer	ByteBuffer
    //   0	179	3	paramBinaryReply	BinaryMessenger.BinaryReply
    //   7	157	4	localObject	Object
    //   38	35	5	localStringBuilder	StringBuilder
    //   84	58	6	i	int
    // Exception table:
    //   from	to	target	type
    //   35	94	157	finally
    //   98	114	157	finally
    //   118	128	157	finally
    //   131	146	157	finally
    //   163	168	171	finally
  }
  
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler)
  {
    setMessageHandler(paramString, paramBinaryMessageHandler, null);
  }
  
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler arg2, BinaryMessenger.TaskQueue arg3)
  {
    if (??? == null)
    {
      ??? = new StringBuilder();
      ???.append("Removing handler for channel '");
      ???.append(paramString);
      ???.append("'");
      Log.v("DartMessenger", ???.toString());
      synchronized (handlersLock)
      {
        messageHandlers.remove(paramString);
        return;
      }
    }
    DartMessengerTaskQueue localDartMessengerTaskQueue = null;
    if (??? != null)
    {
      localDartMessengerTaskQueue = (DartMessengerTaskQueue)createdTaskQueues.get(???);
      if (localDartMessengerTaskQueue == null) {
        throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
      }
    }
    ??? = new StringBuilder();
    ???.append("Setting handler for channel '");
    ???.append(paramString);
    ???.append("'");
    Log.v("DartMessenger", ???.toString());
    synchronized (handlersLock)
    {
      Map localMap = messageHandlers;
      HandlerInfo localHandlerInfo = new io/flutter/embedding/engine/dart/DartMessenger$HandlerInfo;
      localHandlerInfo.<init>(???, localDartMessengerTaskQueue);
      localMap.put(paramString, localHandlerInfo);
      ??? = (List)bufferedMessages.remove(paramString);
      if (??? == null) {
        return;
      }
      ??? = ???.iterator();
      while (???.hasNext())
      {
        ??? = (BufferedMessageInfo)???.next();
        dispatchMessageToQueue(paramString, (HandlerInfo)messageHandlers.get(paramString), message, replyId, messageData);
      }
      return;
    }
  }
  
  public static class BufferedMessageInfo
  {
    public final ByteBuffer message;
    public long messageData;
    public int replyId;
    
    public BufferedMessageInfo(ByteBuffer paramByteBuffer, int paramInt, long paramLong)
    {
      message = paramByteBuffer;
      replyId = paramInt;
      messageData = paramLong;
    }
  }
  
  public static class ConcurrentTaskQueue
    implements DartMessenger.DartMessengerTaskQueue
  {
    private final ExecutorService executor;
    
    public ConcurrentTaskQueue(ExecutorService paramExecutorService)
    {
      executor = paramExecutorService;
    }
    
    public void dispatch(Runnable paramRunnable)
    {
      executor.execute(paramRunnable);
    }
  }
  
  public static abstract interface DartMessengerTaskQueue
  {
    public abstract void dispatch(Runnable paramRunnable);
  }
  
  public static class DefaultTaskQueueFactory
    implements DartMessenger.TaskQueueFactory
  {
    public ExecutorService executorService = FlutterInjector.instance().executorService();
    
    public DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
    {
      if (paramTaskQueueOptions.getIsSerial()) {
        return new DartMessenger.SerialTaskQueue(executorService);
      }
      return new DartMessenger.ConcurrentTaskQueue(executorService);
    }
  }
  
  public static class HandlerInfo
  {
    public final BinaryMessenger.BinaryMessageHandler handler;
    public final DartMessenger.DartMessengerTaskQueue taskQueue;
    
    public HandlerInfo(BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler, DartMessenger.DartMessengerTaskQueue paramDartMessengerTaskQueue)
    {
      handler = paramBinaryMessageHandler;
      taskQueue = paramDartMessengerTaskQueue;
    }
  }
  
  public static class Reply
    implements BinaryMessenger.BinaryReply
  {
    private final AtomicBoolean done = new AtomicBoolean(false);
    private final FlutterJNI flutterJNI;
    private final int replyId;
    
    public Reply(FlutterJNI paramFlutterJNI, int paramInt)
    {
      flutterJNI = paramFlutterJNI;
      replyId = paramInt;
    }
    
    public void reply(ByteBuffer paramByteBuffer)
    {
      if (!done.getAndSet(true))
      {
        if (paramByteBuffer == null) {
          flutterJNI.invokePlatformMessageEmptyResponseCallback(replyId);
        } else {
          flutterJNI.invokePlatformMessageResponseCallback(replyId, paramByteBuffer, paramByteBuffer.position());
        }
        return;
      }
      throw new IllegalStateException("Reply already submitted");
    }
  }
  
  public static class SerialTaskQueue
    implements DartMessenger.DartMessengerTaskQueue
  {
    private final ExecutorService executor;
    private final AtomicBoolean isRunning;
    private final ConcurrentLinkedQueue<Runnable> queue;
    
    public SerialTaskQueue(ExecutorService paramExecutorService)
    {
      executor = paramExecutorService;
      queue = new ConcurrentLinkedQueue();
      isRunning = new AtomicBoolean(false);
    }
    
    private void flush()
    {
      if (isRunning.compareAndSet(false, true)) {
        try
        {
          Runnable localRunnable = (Runnable)queue.poll();
          if (localRunnable != null) {
            localRunnable.run();
          }
        }
        finally
        {
          isRunning.set(false);
          if (!queue.isEmpty()) {
            executor.execute(new b(this));
          }
        }
      }
    }
    
    public void dispatch(Runnable paramRunnable)
    {
      queue.add(paramRunnable);
      executor.execute(new c(this));
    }
  }
  
  public static abstract interface TaskQueueFactory
  {
    public abstract DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions);
  }
  
  public static class TaskQueueToken
    implements BinaryMessenger.TaskQueue
  {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */