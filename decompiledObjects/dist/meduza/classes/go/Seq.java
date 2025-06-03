package go;

import a0.j;
import android.content.Context;
import f;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.logging.Logger;

public class Seq
{
  private static final int NULL_REFNUM = 41;
  private static final GoRefQueue goRefQueue;
  private static Logger log = Logger.getLogger("GoSeq");
  public static final Ref nullRef = new Ref(41, null);
  public static final RefTracker tracker = new RefTracker();
  
  static
  {
    goRefQueue = new GoRefQueue();
    System.loadLibrary("gojni");
    init();
    Universe.touch();
  }
  
  public static void decRef(int paramInt)
  {
    tracker.dec(paramInt);
  }
  
  public static native void destroyRef(int paramInt);
  
  public static Ref getRef(int paramInt)
  {
    return tracker.get(paramInt);
  }
  
  public static int incGoObjectRef(GoObject paramGoObject)
  {
    return paramGoObject.incRefnum();
  }
  
  public static native void incGoRef(int paramInt, GoObject paramGoObject);
  
  public static int incRef(Object paramObject)
  {
    return tracker.inc(paramObject);
  }
  
  public static void incRefnum(int paramInt)
  {
    tracker.incRefnum(paramInt);
  }
  
  private static native void init();
  
  public static void setContext(Context paramContext)
  {
    setContext(paramContext);
  }
  
  public static native void setContext(Object paramObject);
  
  public static void touch() {}
  
  public static void trackGoRef(int paramInt, GoObject paramGoObject)
  {
    if (paramInt <= 0)
    {
      goRefQueue.track(paramInt, paramGoObject);
      return;
    }
    throw new RuntimeException(f.h("trackGoRef called with Java refnum ", paramInt));
  }
  
  public static abstract interface GoObject
  {
    public abstract int incRefnum();
  }
  
  public static class GoRef
    extends PhantomReference<Seq.GoObject>
  {
    public final int refnum;
    
    public GoRef(int paramInt, Seq.GoObject paramGoObject, Seq.GoRefQueue paramGoRefQueue)
    {
      super(paramGoRefQueue);
      if (paramInt <= 0)
      {
        refnum = paramInt;
        return;
      }
      throw new RuntimeException(f.h("GoRef instantiated with a Java refnum ", paramInt));
    }
  }
  
  public static class GoRefQueue
    extends ReferenceQueue<Seq.GoObject>
  {
    private final Collection<Seq.GoRef> refs = Collections.synchronizedCollection(new HashSet());
    
    public GoRefQueue()
    {
      Thread localThread = new Thread(new Runnable()
      {
        public void run()
        {
          try
          {
            for (;;)
            {
              Seq.GoRef localGoRef = (Seq.GoRef)remove();
              Seq.GoRefQueue.access$200(Seq.GoRefQueue.this).remove(localGoRef);
              Seq.destroyRef(refnum);
              localGoRef.clear();
            }
          }
          catch (InterruptedException localInterruptedException) {}
        }
      });
      localThread.setDaemon(true);
      localThread.setName("GoRefQueue Finalizer Thread");
      localThread.start();
    }
    
    public void track(int paramInt, Seq.GoObject paramGoObject)
    {
      refs.add(new Seq.GoRef(paramInt, paramGoObject, this));
    }
  }
  
  public static abstract interface Proxy
    extends Seq.GoObject
  {}
  
  public static final class Ref
  {
    public final Object obj;
    private int refcnt;
    public final int refnum;
    
    public Ref(int paramInt, Object paramObject)
    {
      if (paramInt >= 0)
      {
        refnum = paramInt;
        refcnt = 0;
        obj = paramObject;
        return;
      }
      throw new RuntimeException(f.h("Ref instantiated with a Go refnum ", paramInt));
    }
    
    public void inc()
    {
      int i = refcnt;
      if (i != Integer.MAX_VALUE)
      {
        refcnt = (i + 1);
        return;
      }
      throw new RuntimeException(j.m(f.l("refnum "), refnum, " overflow"));
    }
  }
  
  public static final class RefMap
  {
    private int[] keys = new int[16];
    private int live = 0;
    private int next = 0;
    private Seq.Ref[] objs = new Seq.Ref[16];
    
    private void grow()
    {
      int i = roundPow2(live);
      int[] arrayOfInt1 = keys;
      if (i * 2 > arrayOfInt1.length)
      {
        arrayOfInt1 = new int[arrayOfInt1.length * 2];
        localObject = new Seq.Ref[objs.length * 2];
      }
      else
      {
        localObject = objs;
      }
      int j = 0;
      int k;
      for (i = j;; i = k)
      {
        int[] arrayOfInt2 = keys;
        if (j >= arrayOfInt2.length) {
          break;
        }
        Seq.Ref localRef = objs[j];
        k = i;
        if (localRef != null)
        {
          arrayOfInt1[i] = arrayOfInt2[j];
          localObject[i] = localRef;
          k = i + 1;
        }
        j++;
      }
      for (j = i; j < arrayOfInt1.length; j++)
      {
        arrayOfInt1[j] = 0;
        localObject[j] = null;
      }
      keys = arrayOfInt1;
      objs = ((Seq.Ref[])localObject);
      next = i;
      if (live == i) {
        return;
      }
      Object localObject = f.l("bad state: live=");
      ((StringBuilder)localObject).append(live);
      ((StringBuilder)localObject).append(", next=");
      ((StringBuilder)localObject).append(next);
      throw new RuntimeException(((StringBuilder)localObject).toString());
    }
    
    private static int roundPow2(int paramInt)
    {
      int i = 1;
      while (i < paramInt) {
        i *= 2;
      }
      return i;
    }
    
    public Seq.Ref get(int paramInt)
    {
      paramInt = Arrays.binarySearch(keys, 0, next, paramInt);
      if (paramInt >= 0) {
        return objs[paramInt];
      }
      return null;
    }
    
    public void put(int paramInt, Seq.Ref paramRef)
    {
      if (paramRef != null)
      {
        int i = Arrays.binarySearch(keys, 0, next, paramInt);
        Object localObject;
        if (i >= 0)
        {
          localObject = objs;
          if (localObject[i] == null)
          {
            localObject[i] = paramRef;
            live += 1;
          }
          if (localObject[i] == paramRef) {
            return;
          }
          throw new RuntimeException(j.h("replacing an existing ref (with key ", paramInt, ")"));
        }
        if (next >= keys.length)
        {
          grow();
          i = Arrays.binarySearch(keys, 0, next, paramInt);
        }
        i = i;
        int j = next;
        if (i < j)
        {
          localObject = keys;
          int k = i + 1;
          System.arraycopy(localObject, i, localObject, k, j - i);
          localObject = objs;
          System.arraycopy(localObject, i, localObject, k, next - i);
        }
        keys[i] = paramInt;
        objs[i] = paramRef;
        live += 1;
        next += 1;
        return;
      }
      throw new RuntimeException(j.h("put a null ref (with key ", paramInt, ")"));
    }
    
    public void remove(int paramInt)
    {
      paramInt = Arrays.binarySearch(keys, 0, next, paramInt);
      if (paramInt >= 0)
      {
        Seq.Ref[] arrayOfRef = objs;
        if (arrayOfRef[paramInt] != null)
        {
          arrayOfRef[paramInt] = null;
          live -= 1;
        }
      }
    }
  }
  
  public static final class RefTracker
  {
    private static final int REF_OFFSET = 42;
    private final Seq.RefMap javaObjs = new Seq.RefMap();
    private final IdentityHashMap<Object, Integer> javaRefs = new IdentityHashMap();
    private int next = 42;
    
    public void dec(int paramInt)
    {
      if (paramInt <= 0) {}
      try
      {
        localObject1 = Seq.access$000();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("dec request for Go object ");
        ((StringBuilder)localObject2).append(paramInt);
        ((Logger)localObject1).severe(((StringBuilder)localObject2).toString());
        return;
      }
      finally {}
      int i = nullRefrefnum;
      if (paramInt == i) {
        return;
      }
      Object localObject2 = javaObjs.get(paramInt);
      if (localObject2 != null)
      {
        Seq.Ref.access$110((Seq.Ref)localObject2);
        if (Seq.Ref.access$100((Seq.Ref)localObject2) <= 0)
        {
          javaObjs.remove(paramInt);
          javaRefs.remove(obj);
        }
        return;
      }
      localObject2 = new java/lang/RuntimeException;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("referenced Java object is not found: refnum=");
      ((StringBuilder)localObject1).append(paramInt);
      ((RuntimeException)localObject2).<init>(((StringBuilder)localObject1).toString());
      throw ((Throwable)localObject2);
    }
    
    public Seq.Ref get(int paramInt)
    {
      if ((paramInt < 0) || (paramInt == 41)) {}
      try
      {
        localObject1 = Seq.nullRef;
        return (Seq.Ref)localObject1;
      }
      finally {}
      Object localObject1 = javaObjs.get(paramInt);
      if (localObject1 != null) {
        return (Seq.Ref)localObject1;
      }
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("unknown java Ref: ");
      ((StringBuilder)localObject1).append(paramInt);
      localRuntimeException.<init>(((StringBuilder)localObject1).toString());
      throw localRuntimeException;
      localRuntimeException = new java/lang/RuntimeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("ref called with Go refnum ");
      ((StringBuilder)localObject1).append(paramInt);
      localRuntimeException.<init>(((StringBuilder)localObject1).toString());
      throw localRuntimeException;
    }
    
    public int inc(Object paramObject)
    {
      if (paramObject == null) {
        return 41;
      }
      try
      {
        if ((paramObject instanceof Seq.Proxy))
        {
          i = ((Seq.Proxy)paramObject).incRefnum();
          return i;
        }
        Object localObject1 = (Integer)javaRefs.get(paramObject);
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          i = next;
          if (i != Integer.MAX_VALUE)
          {
            next = (i + 1);
            localObject2 = Integer.valueOf(i);
            javaRefs.put(paramObject, localObject2);
          }
          else
          {
            localObject2 = new java/lang/RuntimeException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("createRef overflow for ");
            ((StringBuilder)localObject1).append(paramObject);
            ((RuntimeException)localObject2).<init>(((StringBuilder)localObject1).toString());
            throw ((Throwable)localObject2);
          }
        }
        int i = ((Integer)localObject2).intValue();
        localObject1 = javaObjs.get(i);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = new go/Seq$Ref;
          ((Seq.Ref)localObject2).<init>(i, paramObject);
          javaObjs.put(i, (Seq.Ref)localObject2);
        }
        ((Seq.Ref)localObject2).inc();
        return i;
      }
      finally {}
    }
    
    public void incRefnum(int paramInt)
    {
      try
      {
        Object localObject1 = javaObjs.get(paramInt);
        if (localObject1 != null)
        {
          ((Seq.Ref)localObject1).inc();
          return;
        }
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("referenced Java object is not found: refnum=");
        ((StringBuilder)localObject1).append(paramInt);
        localRuntimeException.<init>(((StringBuilder)localObject1).toString());
        throw localRuntimeException;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     go.Seq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */