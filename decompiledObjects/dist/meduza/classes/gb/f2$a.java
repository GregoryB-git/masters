package gb;

import f;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public final class f2$a
  extends WeakReference<f2>
{
  public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
  public static final RuntimeException g;
  public final ReferenceQueue<f2> a;
  public final ConcurrentMap<a, a> b;
  public final String c;
  public final SoftReference d;
  public final AtomicBoolean e = new AtomicBoolean();
  
  static
  {
    RuntimeException localRuntimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
    localRuntimeException.setStackTrace(new StackTraceElement[0]);
    g = localRuntimeException;
  }
  
  public f2$a(f2 paramf2, r1 paramr1, ReferenceQueue paramReferenceQueue, ConcurrentHashMap paramConcurrentHashMap)
  {
    super(paramf2, paramReferenceQueue);
    if (f) {
      paramf2 = new RuntimeException("ManagedChannel allocation site");
    } else {
      paramf2 = g;
    }
    d = new SoftReference(paramf2);
    c = paramr1.toString();
    a = paramReferenceQueue;
    b = paramConcurrentHashMap;
    paramConcurrentHashMap.put(this, this);
    a(paramReferenceQueue);
  }
  
  public static void a(ReferenceQueue paramReferenceQueue)
  {
    for (;;)
    {
      a locala = (a)paramReferenceQueue.poll();
      if (locala == null) {
        break;
      }
      RuntimeException localRuntimeException = (RuntimeException)d.get();
      locala.clear();
      b.remove(locala);
      d.clear();
      if (!e.get())
      {
        Level localLevel = Level.SEVERE;
        Logger localLogger = f2.f;
        if (localLogger.isLoggable(localLevel))
        {
          Object localObject = f.l("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
          ((StringBuilder)localObject).append(System.getProperty("line.separator"));
          ((StringBuilder)localObject).append("    Make sure to call shutdown()/shutdownNow()");
          localObject = new LogRecord(localLevel, ((StringBuilder)localObject).toString());
          ((LogRecord)localObject).setLoggerName(localLogger.getName());
          ((LogRecord)localObject).setParameters(new Object[] { c });
          ((LogRecord)localObject).setThrown(localRuntimeException);
          localLogger.log((LogRecord)localObject);
        }
      }
    }
  }
  
  public final void clear()
  {
    super.clear();
    b.remove(this);
    d.clear();
    a(a);
  }
}

/* Location:
 * Qualified Name:     gb.f2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */