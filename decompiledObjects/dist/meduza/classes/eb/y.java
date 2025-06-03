package eb;

import com.google.android.gms.tasks.Continuation;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import d2.h0;
import gb.t3;
import hb.o;
import i9.b0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import pc.p;
import pc.s;
import qc.x;
import vb.a;

public final class y
  implements Continuation, b0, t3, m6.i, d8.e
{
  public static final Object[] a;
  public static final h0 b;
  public static final h0 c;
  public static final int[] d;
  public static final int[] e;
  
  public static final Object b(qc.f paramf, p paramp, boolean paramBoolean, ub.e parame)
  {
    if ((parame instanceof qc.g))
    {
      localg = (qc.g)parame;
      i = f;
      if ((i & 0x80000000) != 0)
      {
        f = (i + Integer.MIN_VALUE);
        break label51;
      }
    }
    qc.g localg = new qc.g(parame);
    label51:
    Object localObject1 = e;
    a locala = a.a;
    int i = f;
    Object localObject2 = null;
    Object localObject3;
    boolean bool;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
        {
          paramBoolean = d;
          paramp = c;
          paramf = b;
          localObject3 = a;
          parame = paramf;
          bool = paramBoolean;
        }
      }
    }
    try
    {
      rb.f.b(localObject1);
      Object localObject5;
      label213:
      label305:
      do
      {
        parame = paramp;
        localObject5 = localObject3;
        paramp = paramf;
        localObject3 = parame;
        break label213;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        paramBoolean = d;
        paramp = c;
        paramf = b;
        localObject3 = a;
        parame = paramf;
        bool = paramBoolean;
        rb.f.b(localObject1);
        break label305;
        rb.f.b(localObject1);
        if ((paramf instanceof x)) {
          break label498;
        }
        parame = paramp;
        bool = paramBoolean;
        localObject3 = paramp.iterator();
        localObject5 = paramf;
        parame = paramp;
        bool = paramBoolean;
        a = ((qc.f)localObject5);
        parame = paramp;
        bool = paramBoolean;
        b = paramp;
        parame = paramp;
        bool = paramBoolean;
        c = ((pc.h)localObject3);
        parame = paramp;
        bool = paramBoolean;
        d = paramBoolean;
        parame = paramp;
        bool = paramBoolean;
        f = 1;
        parame = paramp;
        bool = paramBoolean;
        localObject1 = ((pc.h)localObject3).a(localg);
        if (localObject1 == locala) {
          return locala;
        }
        paramf = paramp;
        paramp = (p)localObject3;
        localObject3 = localObject5;
        parame = paramf;
        bool = paramBoolean;
        if (!((Boolean)localObject1).booleanValue()) {
          break;
        }
        parame = paramf;
        bool = paramBoolean;
        localObject5 = paramp.next();
        parame = paramf;
        bool = paramBoolean;
        a = ((qc.f)localObject3);
        parame = paramf;
        bool = paramBoolean;
        b = paramf;
        parame = paramf;
        bool = paramBoolean;
        c = paramp;
        parame = paramf;
        bool = paramBoolean;
        d = paramBoolean;
        parame = paramf;
        bool = paramBoolean;
        f = 2;
        parame = paramf;
        bool = paramBoolean;
        localObject5 = ((qc.f)localObject3).emit(localObject5, localg);
      } while (localObject5 != locala);
      return locala;
    }
    finally
    {
      break label438;
      if (paramBoolean) {
        paramf.cancel(null);
      }
      return rb.h.a;
      try
      {
        label438:
        throw localThrowable;
      }
      finally
      {
        if (bool)
        {
          paramf = (qc.f)localObject2;
          if ((localThrowable instanceof CancellationException)) {
            paramf = (CancellationException)localThrowable;
          }
          paramp = paramf;
          if (paramf == null)
          {
            paramp = new CancellationException("Channel was consumed, consumer had failed");
            paramp.initCause(localThrowable);
          }
          parame.cancel(paramp);
        }
      }
      label498:
      ((x)paramf).getClass();
    }
  }
  
  public static final Object c(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof nc.u)) {
      localObject = rb.f.a(a);
    }
    return localObject;
  }
  
  public static final Object[] e(Collection paramCollection)
  {
    ec.i.e(paramCollection, "collection");
    int i = paramCollection.size();
    if (i == 0) {}
    Iterator localIterator;
    do
    {
      paramCollection = a;
      break;
      localIterator = paramCollection.iterator();
    } while (!localIterator.hasNext());
    paramCollection = new Object[i];
    i = 0;
    for (;;)
    {
      int j = i + 1;
      paramCollection[i] = localIterator.next();
      Object localObject;
      if (j >= paramCollection.length)
      {
        if (localIterator.hasNext())
        {
          int k = j * 3 + 1 >>> 1;
          i = k;
          if (k <= j) {
            if (j < 2147483645) {
              i = 2147483645;
            } else {
              throw new OutOfMemoryError();
            }
          }
          localObject = Arrays.copyOf(paramCollection, i);
          break label155;
        }
      }
      else
      {
        localObject = paramCollection;
        if (localIterator.hasNext()) {
          break label155;
        }
        paramCollection = Arrays.copyOf(paramCollection, j);
        ec.i.d(paramCollection, "copyOf(...)");
      }
      return paramCollection;
      label155:
      i = j;
      paramCollection = (Collection)localObject;
    }
  }
  
  public static final Object[] f(Collection paramCollection, Object[] paramArrayOfObject)
  {
    ec.i.e(paramCollection, "collection");
    paramArrayOfObject.getClass();
    int i = paramCollection.size();
    int j = 0;
    Iterator localIterator;
    if (i == 0)
    {
      paramCollection = paramArrayOfObject;
      if (paramArrayOfObject.length > 0)
      {
        paramArrayOfObject[0] = null;
        paramCollection = paramArrayOfObject;
      }
    }
    else
    {
      localIterator = paramCollection.iterator();
      if (!localIterator.hasNext())
      {
        paramCollection = paramArrayOfObject;
        if (paramArrayOfObject.length > 0)
        {
          paramArrayOfObject[0] = null;
          paramCollection = paramArrayOfObject;
        }
      }
      else if (i <= paramArrayOfObject.length)
      {
        paramCollection = paramArrayOfObject;
      }
      else
      {
        paramCollection = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
        ec.i.c(paramCollection, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
      }
    }
    Object localObject;
    for (paramCollection = (Object[])paramCollection;; paramCollection = (Collection)localObject)
    {
      i = j + 1;
      paramCollection[j] = localIterator.next();
      if (i >= paramCollection.length)
      {
        if (localIterator.hasNext())
        {
          int k = i * 3 + 1 >>> 1;
          j = k;
          if (k <= i) {
            if (i < 2147483645) {
              j = 2147483645;
            } else {
              throw new OutOfMemoryError();
            }
          }
          localObject = Arrays.copyOf(paramCollection, j);
          break label230;
        }
      }
      else
      {
        localObject = paramCollection;
        if (localIterator.hasNext()) {
          break label230;
        }
        if (paramCollection == paramArrayOfObject)
        {
          paramArrayOfObject[i] = null;
          paramCollection = paramArrayOfObject;
        }
        else
        {
          paramCollection = Arrays.copyOf(paramCollection, i);
          ec.i.d(paramCollection, "copyOf(...)");
        }
      }
      return paramCollection;
      label230:
      j = i;
    }
  }
  
  public o a(int paramInt)
  {
    paramInt = Math.min(1048576, Math.max(4096, paramInt));
    return new o(new xc.f(), paramInt);
  }
  
  public Object g(d8.u paramu)
  {
    return AnalyticsConnectorRegistrar.lambda$getComponents$0(paramu);
  }
  
  public void run() {}
}

/* Location:
 * Qualified Name:     eb.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */