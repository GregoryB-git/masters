package go;

import java.util.IdentityHashMap;
import java.util.logging.Logger;

final class Seq$RefTracker
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

/* Location:
 * Qualified Name:     go.Seq.RefTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */