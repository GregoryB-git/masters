package w5;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import t5.a;

public class c
  implements E5.c, f
{
  public final FlutterJNI a;
  public final Map b = new HashMap();
  public Map c = new HashMap();
  public final Object d = new Object();
  public final AtomicBoolean e = new AtomicBoolean(false);
  public final Map f = new HashMap();
  public int g = 1;
  public final d h = new g();
  public WeakHashMap i = new WeakHashMap();
  public i j;
  
  public c(FlutterJNI paramFlutterJNI)
  {
    this(paramFlutterJNI, new e());
  }
  
  public c(FlutterJNI paramFlutterJNI, i parami)
  {
    a = paramFlutterJNI;
    j = parami;
  }
  
  public static void k(Error paramError)
  {
    Thread localThread = Thread.currentThread();
    if (localThread.getUncaughtExceptionHandler() != null)
    {
      localThread.getUncaughtExceptionHandler().uncaughtException(localThread, paramError);
      return;
    }
    throw paramError;
  }
  
  public E5.c.c a(E5.c.d paramd)
  {
    paramd = j.a(paramd);
    j localj = new j(null);
    i.put(localj, paramd);
    return localj;
  }
  
  public void c(String paramString, E5.c.a parama)
  {
    h(paramString, parama, null);
  }
  
  public void d(String paramString, ByteBuffer paramByteBuffer)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message over channel '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    t5.b.f("DartMessenger", localStringBuilder.toString());
    f(paramString, paramByteBuffer, null);
  }
  
  public void e(int paramInt, ByteBuffer paramByteBuffer)
  {
    t5.b.f("DartMessenger", "Received message reply from Dart.");
    E5.c.b localb = (E5.c.b)f.remove(Integer.valueOf(paramInt));
    if (localb != null)
    {
      try
      {
        t5.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
        localb.a(paramByteBuffer);
        if ((paramByteBuffer == null) || (!paramByteBuffer.isDirect())) {
          return;
        }
        paramByteBuffer.limit(0);
      }
      catch (Error paramByteBuffer) {}catch (Exception paramByteBuffer)
      {
        break label77;
      }
      k(paramByteBuffer);
      return;
      label77:
      t5.b.c("DartMessenger", "Uncaught exception in binary message reply handler", paramByteBuffer);
    }
  }
  
  /* Error */
  public void f(String paramString, ByteBuffer paramByteBuffer, E5.c.b paramb)
  {
    // Byte code:
    //   0: new 137	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: aload 4
    //   11: ldc -51
    //   13: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: pop
    //   17: aload 4
    //   19: aload_1
    //   20: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload 4
    //   26: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 210	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   32: astore 4
    //   34: new 137	java/lang/StringBuilder
    //   37: astore 5
    //   39: aload 5
    //   41: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   44: aload 5
    //   46: ldc -44
    //   48: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload 5
    //   54: aload_1
    //   55: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload 5
    //   61: ldc -110
    //   63: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: ldc -108
    //   69: aload 5
    //   71: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 157	t5/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: getfield 76	w5/c:g	I
    //   81: istore 6
    //   83: aload_0
    //   84: iload 6
    //   86: iconst_1
    //   87: iadd
    //   88: putfield 76	w5/c:g	I
    //   91: aload_3
    //   92: ifnull +26 -> 118
    //   95: aload_0
    //   96: getfield 74	w5/c:f	Ljava/util/Map;
    //   99: iload 6
    //   101: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   104: aload_3
    //   105: invokeinterface 213 3 0
    //   110: pop
    //   111: goto +7 -> 118
    //   114: astore_1
    //   115: goto +46 -> 161
    //   118: aload_2
    //   119: ifnonnull +16 -> 135
    //   122: aload_0
    //   123: getfield 88	w5/c:a	Lio/flutter/embedding/engine/FlutterJNI;
    //   126: aload_1
    //   127: iload 6
    //   129: invokevirtual 219	io/flutter/embedding/engine/FlutterJNI:dispatchEmptyPlatformMessage	(Ljava/lang/String;I)V
    //   132: goto +18 -> 150
    //   135: aload_0
    //   136: getfield 88	w5/c:a	Lio/flutter/embedding/engine/FlutterJNI;
    //   139: aload_1
    //   140: aload_2
    //   141: aload_2
    //   142: invokevirtual 225	java/nio/Buffer:position	()I
    //   145: iload 6
    //   147: invokevirtual 229	io/flutter/embedding/engine/FlutterJNI:dispatchPlatformMessage	(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V
    //   150: aload 4
    //   152: ifnull +8 -> 160
    //   155: aload 4
    //   157: invokevirtual 232	T5/f:close	()V
    //   160: return
    //   161: aload 4
    //   163: ifnull +17 -> 180
    //   166: aload 4
    //   168: invokevirtual 232	T5/f:close	()V
    //   171: goto +9 -> 180
    //   174: astore_2
    //   175: aload_1
    //   176: aload_2
    //   177: invokevirtual 238	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	c
    //   0	182	1	paramString	String
    //   0	182	2	paramByteBuffer	ByteBuffer
    //   0	182	3	paramb	E5.c.b
    //   7	160	4	localObject	Object
    //   37	33	5	localStringBuilder	StringBuilder
    //   81	65	6	k	int
    // Exception table:
    //   from	to	target	type
    //   34	91	114	finally
    //   95	111	114	finally
    //   122	132	114	finally
    //   135	150	114	finally
    //   166	171	174	finally
  }
  
  public void g(String paramString, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Received message from Dart over channel '");
    ((StringBuilder)???).append(paramString);
    ((StringBuilder)???).append("'");
    t5.b.f("DartMessenger", ((StringBuilder)???).toString());
    f localf;
    int k;
    synchronized (d)
    {
      localf = (f)b.get(paramString);
      if ((e.get()) && (localf == null)) {
        k = 1;
      } else {
        k = 0;
      }
      if (k == 0) {
        break label181;
      }
      if (!c.containsKey(paramString))
      {
        localObject2 = c;
        localObject3 = new java/util/LinkedList;
        ((LinkedList)localObject3).<init>();
        ((Map)localObject2).put(paramString, localObject3);
      }
    }
    Object localObject2 = (List)c.get(paramString);
    Object localObject3 = new w5/c$b;
    ((b)localObject3).<init>(paramByteBuffer, paramInt, paramLong);
    ((List)localObject2).add(localObject3);
    label181:
    if (k == 0) {
      j(paramString, localf, paramByteBuffer, paramInt, paramLong);
    }
  }
  
  public void h(String paramString, E5.c.a arg2, E5.c.c paramc)
  {
    if (??? == null)
    {
      ??? = new StringBuilder();
      ???.append("Removing handler for channel '");
      ???.append(paramString);
      ???.append("'");
      t5.b.f("DartMessenger", ???.toString());
      synchronized (d)
      {
        b.remove(paramString);
        return;
      }
    }
    if (paramc != null)
    {
      paramc = (d)i.get(paramc);
      if (paramc == null) {
        throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
      }
    }
    else
    {
      paramc = null;
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Setting handler for channel '");
    ((StringBuilder)???).append(paramString);
    ((StringBuilder)???).append("'");
    t5.b.f("DartMessenger", ((StringBuilder)???).toString());
    synchronized (d)
    {
      Map localMap = b;
      f localf = new w5/c$f;
      localf.<init>(???, paramc);
      localMap.put(paramString, localf);
      ??? = (List)c.remove(paramString);
      if (??? == null) {
        return;
      }
    }
  }
  
  public final void j(String paramString, f paramf, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    if (paramf != null) {}
    for (d locald = b;; locald = null) {
      break;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlatformChannel ScheduleHandler on ");
    localStringBuilder.append(paramString);
    T5.f.b(localStringBuilder.toString(), paramInt);
    paramf = new b(this, paramString, paramInt, paramf, paramByteBuffer, paramLong);
    paramString = locald;
    if (locald == null) {
      paramString = h;
    }
    paramString.a(paramf);
  }
  
  public final void l(f paramf, ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramf != null)
    {
      try
      {
        t5.b.f("DartMessenger", "Deferring to registered handler to process message.");
        E5.c.a locala = a;
        paramf = new w5/c$g;
        paramf.<init>(a, paramInt);
        locala.a(paramByteBuffer, paramf);
      }
      catch (Error paramf) {}catch (Exception paramf)
      {
        break label58;
      }
      k(paramf);
      return;
      label58:
      t5.b.c("DartMessenger", "Uncaught exception in binary message listener", paramf);
    }
    else
    {
      for (;;)
      {
        a.invokePlatformMessageEmptyResponseCallback(paramInt);
        break;
        t5.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
      }
    }
  }
  
  public static class b
  {
    public final ByteBuffer a;
    public int b;
    public long c;
    
    public b(ByteBuffer paramByteBuffer, int paramInt, long paramLong)
    {
      a = paramByteBuffer;
      b = paramInt;
      c = paramLong;
    }
  }
  
  public static class c
    implements c.d
  {
    public final ExecutorService a;
    
    public c(ExecutorService paramExecutorService)
    {
      a = paramExecutorService;
    }
    
    public void a(Runnable paramRunnable)
    {
      a.execute(paramRunnable);
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(Runnable paramRunnable);
  }
  
  public static class e
    implements c.i
  {
    public ExecutorService a = a.e().b();
    
    public c.d a(E5.c.d paramd)
    {
      if (paramd.a()) {
        return new c.h(a);
      }
      return new c.c(a);
    }
  }
  
  public static class f
  {
    public final E5.c.a a;
    public final c.d b;
    
    public f(E5.c.a parama, c.d paramd)
    {
      a = parama;
      b = paramd;
    }
  }
  
  public static class g
    implements E5.c.b
  {
    public final FlutterJNI a;
    public final int b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    
    public g(FlutterJNI paramFlutterJNI, int paramInt)
    {
      a = paramFlutterJNI;
      b = paramInt;
    }
    
    public void a(ByteBuffer paramByteBuffer)
    {
      if (!c.getAndSet(true))
      {
        if (paramByteBuffer == null) {
          a.invokePlatformMessageEmptyResponseCallback(b);
        } else {
          a.invokePlatformMessageResponseCallback(b, paramByteBuffer, paramByteBuffer.position());
        }
        return;
      }
      throw new IllegalStateException("Reply already submitted");
    }
  }
  
  public static class h
    implements c.d
  {
    public final ExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final AtomicBoolean c;
    
    public h(ExecutorService paramExecutorService)
    {
      a = paramExecutorService;
      b = new ConcurrentLinkedQueue();
      c = new AtomicBoolean(false);
    }
    
    public void a(Runnable paramRunnable)
    {
      b.add(paramRunnable);
      a.execute(new d(this));
    }
    
    public final void d()
    {
      if (c.compareAndSet(false, true))
      {
        try
        {
          Runnable localRunnable = (Runnable)b.poll();
          if (localRunnable != null) {
            localRunnable.run();
          }
        }
        finally
        {
          break label78;
        }
        c.set(false);
        if (!b.isEmpty())
        {
          a.execute(new e(this));
          return;
          label78:
          c.set(false);
          if (!b.isEmpty()) {
            a.execute(new e(this));
          }
          throw ((Throwable)localObject);
        }
      }
    }
  }
  
  public static abstract interface i
  {
    public abstract c.d a(E5.c.d paramd);
  }
  
  public static class j
    implements E5.c.c
  {}
}

/* Location:
 * Qualified Name:     w5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */