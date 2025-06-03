package d9;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import e;
import g.q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import q0.g;
import x6.b;

public final class c0
  extends Task<d0>
{
  public final Object a = new Object();
  public d0 b = d0.g;
  public final TaskCompletionSource<d0> c;
  public final Task<d0> d;
  public final ArrayDeque e;
  
  public c0()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    c = localTaskCompletionSource;
    d = localTaskCompletionSource.getTask();
    e = new ArrayDeque();
  }
  
  public final void a(com.google.firebase.firestore.f paramf)
  {
    synchronized (a)
    {
      d0 locald0 = new d9/d0;
      Object localObject2 = b;
      locald0.<init>(a, b, c, d, paramf, 1);
      b = locald0;
      Iterator localIterator = e.iterator();
      if (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        Executor localExecutor = a;
        localObject2 = new g/q;
        ((q)localObject2).<init>(14, locala, locald0);
        localExecutor.execute((Runnable)localObject2);
      }
    }
  }
  
  public final Task<d0> addOnCanceledListener(Activity paramActivity, OnCanceledListener paramOnCanceledListener)
  {
    return d.addOnCanceledListener(paramActivity, paramOnCanceledListener);
  }
  
  public final Task<d0> addOnCanceledListener(OnCanceledListener paramOnCanceledListener)
  {
    return d.addOnCanceledListener(paramOnCanceledListener);
  }
  
  public final Task<d0> addOnCanceledListener(Executor paramExecutor, OnCanceledListener paramOnCanceledListener)
  {
    return d.addOnCanceledListener(paramExecutor, paramOnCanceledListener);
  }
  
  public final Task<d0> addOnCompleteListener(Activity paramActivity, OnCompleteListener<d0> paramOnCompleteListener)
  {
    return d.addOnCompleteListener(paramActivity, paramOnCompleteListener);
  }
  
  public final Task<d0> addOnCompleteListener(OnCompleteListener<d0> paramOnCompleteListener)
  {
    return d.addOnCompleteListener(paramOnCompleteListener);
  }
  
  public final Task<d0> addOnCompleteListener(Executor paramExecutor, OnCompleteListener<d0> paramOnCompleteListener)
  {
    return d.addOnCompleteListener(paramExecutor, paramOnCompleteListener);
  }
  
  public final Task<d0> addOnFailureListener(Activity paramActivity, OnFailureListener paramOnFailureListener)
  {
    return d.addOnFailureListener(paramActivity, paramOnFailureListener);
  }
  
  public final Task<d0> addOnFailureListener(OnFailureListener paramOnFailureListener)
  {
    return d.addOnFailureListener(paramOnFailureListener);
  }
  
  public final Task<d0> addOnFailureListener(Executor paramExecutor, OnFailureListener paramOnFailureListener)
  {
    return d.addOnFailureListener(paramExecutor, paramOnFailureListener);
  }
  
  public final Task<d0> addOnSuccessListener(Activity paramActivity, OnSuccessListener<? super d0> paramOnSuccessListener)
  {
    return d.addOnSuccessListener(paramActivity, paramOnSuccessListener);
  }
  
  public final Task<d0> addOnSuccessListener(OnSuccessListener<? super d0> paramOnSuccessListener)
  {
    return d.addOnSuccessListener(paramOnSuccessListener);
  }
  
  public final Task<d0> addOnSuccessListener(Executor paramExecutor, OnSuccessListener<? super d0> paramOnSuccessListener)
  {
    return d.addOnSuccessListener(paramExecutor, paramOnSuccessListener);
  }
  
  public final void b(d0 paramd0)
  {
    boolean bool = g.b(e, 3);
    ??? = f.l("Expected success, but was ");
    ((StringBuilder)???).append(f.q(e));
    b.Z(((StringBuilder)???).toString(), bool, new Object[0]);
    synchronized (a)
    {
      b = paramd0;
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        d0 locald0 = b;
        Executor localExecutor = a;
        q localq = new g/q;
        localq.<init>(14, locala, locald0);
        localExecutor.execute(localq);
      }
      e.clear();
      c.setResult(paramd0);
      return;
    }
  }
  
  public final void c(d0 paramd0)
  {
    synchronized (a)
    {
      b = paramd0;
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        Executor localExecutor = a;
        q localq = new g/q;
        localq.<init>(14, locala, paramd0);
        localExecutor.execute(localq);
      }
      return;
    }
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<d0, TContinuationResult> paramContinuation)
  {
    return d.continueWith(paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor paramExecutor, Continuation<d0, TContinuationResult> paramContinuation)
  {
    return d.continueWith(paramExecutor, paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<d0, Task<TContinuationResult>> paramContinuation)
  {
    return d.continueWithTask(paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor paramExecutor, Continuation<d0, Task<TContinuationResult>> paramContinuation)
  {
    return d.continueWithTask(paramExecutor, paramContinuation);
  }
  
  public final Exception getException()
  {
    return d.getException();
  }
  
  public final Object getResult()
  {
    return (d0)d.getResult();
  }
  
  public final Object getResult(Class paramClass)
  {
    return (d0)d.getResult(paramClass);
  }
  
  public final boolean isCanceled()
  {
    return d.isCanceled();
  }
  
  public final boolean isComplete()
  {
    return d.isComplete();
  }
  
  public final boolean isSuccessful()
  {
    return d.isSuccessful();
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<d0, TContinuationResult> paramSuccessContinuation)
  {
    return d.onSuccessTask(paramSuccessContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor paramExecutor, SuccessContinuation<d0, TContinuationResult> paramSuccessContinuation)
  {
    return d.onSuccessTask(paramExecutor, paramSuccessContinuation);
  }
  
  public static final class a
  {
    public Executor a = TaskExecutors.MAIN_THREAD;
    public e b;
    
    public a(e parame)
    {
      b = parame;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        return b.equals(b);
      }
      return false;
    }
    
    public final int hashCode()
    {
      return b.hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     d9.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */