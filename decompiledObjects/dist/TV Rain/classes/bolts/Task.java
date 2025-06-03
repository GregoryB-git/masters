package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task<TResult>
{
  public static final ExecutorService BACKGROUND_EXECUTOR = ;
  private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
  private static Task<?> TASK_CANCELLED = new Task(true);
  private static Task<Boolean> TASK_FALSE;
  private static Task<?> TASK_NULL;
  private static Task<Boolean> TASK_TRUE;
  public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
  private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
  private boolean cancelled;
  private boolean complete;
  private List<Continuation<TResult, Void>> continuations = new ArrayList();
  private Exception error;
  private boolean errorHasBeenObserved;
  private final Object lock = new Object();
  private TResult result;
  private UnobservedErrorNotifier unobservedErrorNotifier;
  
  static
  {
    TASK_NULL = new Task(null);
    TASK_TRUE = new Task(Boolean.TRUE);
    TASK_FALSE = new Task(Boolean.FALSE);
  }
  
  public Task() {}
  
  private Task(TResult paramTResult)
  {
    trySetResult(paramTResult);
  }
  
  private Task(boolean paramBoolean)
  {
    if (paramBoolean) {
      trySetCancelled();
    } else {
      trySetResult(null);
    }
  }
  
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable)
  {
    return call(paramCallable, IMMEDIATE_EXECUTOR, null);
  }
  
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable, CancellationToken paramCancellationToken)
  {
    return call(paramCallable, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable, Executor paramExecutor)
  {
    return call(paramCallable, paramExecutor, null);
  }
  
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable, Executor paramExecutor, CancellationToken paramCancellationToken)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    try
    {
      Runnable local4 = new bolts/Task$4;
      local4.<init>(paramCancellationToken, localTaskCompletionSource, paramCallable);
      paramExecutor.execute(local4);
    }
    catch (Exception paramCallable)
    {
      localTaskCompletionSource.setError(new ExecutorException(paramCallable));
    }
    return localTaskCompletionSource.getTask();
  }
  
  public static <TResult> Task<TResult> callInBackground(Callable<TResult> paramCallable)
  {
    return call(paramCallable, BACKGROUND_EXECUTOR, null);
  }
  
  public static <TResult> Task<TResult> callInBackground(Callable<TResult> paramCallable, CancellationToken paramCancellationToken)
  {
    return call(paramCallable, BACKGROUND_EXECUTOR, paramCancellationToken);
  }
  
  public static <TResult> Task<TResult> cancelled()
  {
    return TASK_CANCELLED;
  }
  
  private static <TContinuationResult, TResult> void completeAfterTask(TaskCompletionSource<TContinuationResult> paramTaskCompletionSource, Continuation<TResult, Task<TContinuationResult>> paramContinuation, Task<TResult> paramTask, Executor paramExecutor, CancellationToken paramCancellationToken)
  {
    try
    {
      Runnable local15 = new bolts/Task$15;
      local15.<init>(paramCancellationToken, paramTaskCompletionSource, paramContinuation, paramTask);
      paramExecutor.execute(local15);
    }
    catch (Exception paramContinuation)
    {
      paramTaskCompletionSource.setError(new ExecutorException(paramContinuation));
    }
  }
  
  private static <TContinuationResult, TResult> void completeImmediately(TaskCompletionSource<TContinuationResult> paramTaskCompletionSource, Continuation<TResult, TContinuationResult> paramContinuation, Task<TResult> paramTask, Executor paramExecutor, CancellationToken paramCancellationToken)
  {
    try
    {
      Runnable local14 = new bolts/Task$14;
      local14.<init>(paramCancellationToken, paramTaskCompletionSource, paramContinuation, paramTask);
      paramExecutor.execute(local14);
    }
    catch (Exception paramContinuation)
    {
      paramTaskCompletionSource.setError(new ExecutorException(paramContinuation));
    }
  }
  
  public static <TResult> Task<TResult>.TaskCompletionSource create()
  {
    return new TaskCompletionSource(new Task());
  }
  
  public static Task<Void> delay(long paramLong)
  {
    return delay(paramLong, BoltsExecutors.scheduled(), null);
  }
  
  public static Task<Void> delay(long paramLong, CancellationToken paramCancellationToken)
  {
    return delay(paramLong, BoltsExecutors.scheduled(), paramCancellationToken);
  }
  
  public static Task<Void> delay(long paramLong, ScheduledExecutorService paramScheduledExecutorService, CancellationToken paramCancellationToken)
  {
    if ((paramCancellationToken != null) && (paramCancellationToken.isCancellationRequested())) {
      return cancelled();
    }
    if (paramLong <= 0L) {
      return forResult(null);
    }
    final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramScheduledExecutorService = paramScheduledExecutorService.schedule(new Runnable()
    {
      public void run()
      {
        val$tcs.trySetResult(null);
      }
    }, paramLong, TimeUnit.MILLISECONDS);
    if (paramCancellationToken != null) {
      paramCancellationToken.register(new Runnable()
      {
        public void run()
        {
          val$scheduled.cancel(true);
          localTaskCompletionSource.trySetCancelled();
        }
      });
    }
    return localTaskCompletionSource.getTask();
  }
  
  public static <TResult> Task<TResult> forError(Exception paramException)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    localTaskCompletionSource.setError(paramException);
    return localTaskCompletionSource.getTask();
  }
  
  public static <TResult> Task<TResult> forResult(TResult paramTResult)
  {
    if (paramTResult == null) {
      return TASK_NULL;
    }
    if ((paramTResult instanceof Boolean))
    {
      if (((Boolean)paramTResult).booleanValue()) {
        paramTResult = TASK_TRUE;
      } else {
        paramTResult = TASK_FALSE;
      }
      return paramTResult;
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    localTaskCompletionSource.setResult(paramTResult);
    return localTaskCompletionSource.getTask();
  }
  
  public static UnobservedExceptionHandler getUnobservedExceptionHandler()
  {
    return unobservedExceptionHandler;
  }
  
  private void runContinuations()
  {
    synchronized (lock)
    {
      Object localObject2 = continuations.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Continuation localContinuation = (Continuation)((Iterator)localObject2).next();
        try
        {
          localContinuation.then(this);
        }
        catch (Exception localException)
        {
          localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>(localException);
          throw ((Throwable)localObject2);
        }
        catch (RuntimeException localRuntimeException)
        {
          throw localRuntimeException;
        }
      }
      continuations = null;
      return;
    }
  }
  
  public static void setUnobservedExceptionHandler(UnobservedExceptionHandler paramUnobservedExceptionHandler)
  {
    unobservedExceptionHandler = paramUnobservedExceptionHandler;
  }
  
  public static Task<Void> whenAll(Collection<? extends Task<?>> paramCollection)
  {
    if (paramCollection.size() == 0) {
      return forResult(null);
    }
    final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    final ArrayList localArrayList = new ArrayList();
    Object localObject = new Object();
    final AtomicInteger localAtomicInteger = new AtomicInteger(paramCollection.size());
    final AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((Task)paramCollection.next()).continueWith(new Continuation()
      {
        public Void then(Task<Object> paramAnonymousTask)
        {
          if (paramAnonymousTask.isFaulted()) {
            synchronized (val$errorLock)
            {
              localArrayList.add(paramAnonymousTask.getError());
            }
          }
          if (paramAnonymousTask.isCancelled()) {
            localAtomicBoolean.set(true);
          }
          if (localAtomicInteger.decrementAndGet() == 0) {
            if (localArrayList.size() != 0)
            {
              if (localArrayList.size() == 1)
              {
                localTaskCompletionSource.setError((Exception)localArrayList.get(0));
              }
              else
              {
                paramAnonymousTask = new AggregateException(String.format("There were %d exceptions.", new Object[] { Integer.valueOf(localArrayList.size()) }), localArrayList);
                localTaskCompletionSource.setError(paramAnonymousTask);
              }
            }
            else if (localAtomicBoolean.get()) {
              localTaskCompletionSource.setCancelled();
            } else {
              localTaskCompletionSource.setResult(null);
            }
          }
          return null;
        }
      });
    }
    return localTaskCompletionSource.getTask();
  }
  
  public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> paramCollection)
  {
    whenAll(paramCollection).onSuccess(new Continuation()
    {
      public List<TResult> then(Task<Void> paramAnonymousTask)
        throws Exception
      {
        if (val$tasks.size() == 0) {
          return Collections.emptyList();
        }
        ArrayList localArrayList = new ArrayList();
        paramAnonymousTask = val$tasks.iterator();
        while (paramAnonymousTask.hasNext()) {
          localArrayList.add(((Task)paramAnonymousTask.next()).getResult());
        }
        return localArrayList;
      }
    });
  }
  
  public static Task<Task<?>> whenAny(Collection<? extends Task<?>> paramCollection)
  {
    if (paramCollection.size() == 0) {
      return forResult(null);
    }
    final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((Task)paramCollection.next()).continueWith(new Continuation()
      {
        public Void then(Task<Object> paramAnonymousTask)
        {
          if (val$isAnyTaskComplete.compareAndSet(false, true)) {
            localTaskCompletionSource.setResult(paramAnonymousTask);
          } else {
            paramAnonymousTask.getError();
          }
          return null;
        }
      });
    }
    return localTaskCompletionSource.getTask();
  }
  
  public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> paramCollection)
  {
    if (paramCollection.size() == 0) {
      return forResult(null);
    }
    final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((Task)paramCollection.next()).continueWith(new Continuation()
      {
        public Void then(Task<TResult> paramAnonymousTask)
        {
          if (val$isAnyTaskComplete.compareAndSet(false, true)) {
            localTaskCompletionSource.setResult(paramAnonymousTask);
          } else {
            paramAnonymousTask.getError();
          }
          return null;
        }
      });
    }
    return localTaskCompletionSource.getTask();
  }
  
  public <TOut> Task<TOut> cast()
  {
    return this;
  }
  
  public Task<Void> continueWhile(Callable<Boolean> paramCallable, Continuation<Void, Task<Void>> paramContinuation)
  {
    return continueWhile(paramCallable, paramContinuation, IMMEDIATE_EXECUTOR, null);
  }
  
  public Task<Void> continueWhile(Callable<Boolean> paramCallable, Continuation<Void, Task<Void>> paramContinuation, CancellationToken paramCancellationToken)
  {
    return continueWhile(paramCallable, paramContinuation, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public Task<Void> continueWhile(Callable<Boolean> paramCallable, Continuation<Void, Task<Void>> paramContinuation, Executor paramExecutor)
  {
    return continueWhile(paramCallable, paramContinuation, paramExecutor, null);
  }
  
  public Task<Void> continueWhile(final Callable<Boolean> paramCallable, final Continuation<Void, Task<Void>> paramContinuation, final Executor paramExecutor, final CancellationToken paramCancellationToken)
  {
    final Capture localCapture = new Capture();
    localCapture.set(new Continuation()
    {
      public Task<Void> then(Task<Void> paramAnonymousTask)
        throws Exception
      {
        paramAnonymousTask = paramCancellationToken;
        if ((paramAnonymousTask != null) && (paramAnonymousTask.isCancellationRequested())) {
          return Task.cancelled();
        }
        if (((Boolean)paramCallable.call()).booleanValue()) {
          return Task.forResult(null).onSuccessTask(paramContinuation, paramExecutor).onSuccessTask((Continuation)localCapture.get(), paramExecutor);
        }
        return Task.forResult(null);
      }
    });
    return makeVoid().continueWithTask((Continuation)localCapture.get(), paramExecutor);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation)
  {
    return continueWith(paramContinuation, IMMEDIATE_EXECUTOR, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation, CancellationToken paramCancellationToken)
  {
    return continueWith(paramContinuation, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation, Executor paramExecutor)
  {
    return continueWith(paramContinuation, paramExecutor, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation, Executor paramExecutor, CancellationToken paramCancellationToken)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    synchronized (lock)
    {
      boolean bool = isCompleted();
      if (!bool)
      {
        List localList = continuations;
        Continuation local10 = new bolts/Task$10;
        local10.<init>(this, localTaskCompletionSource, paramContinuation, paramExecutor, paramCancellationToken);
        localList.add(local10);
      }
      if (bool) {
        completeImmediately(localTaskCompletionSource, paramContinuation, this, paramExecutor, paramCancellationToken);
      }
      return localTaskCompletionSource.getTask();
    }
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    return continueWithTask(paramContinuation, IMMEDIATE_EXECUTOR, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation, CancellationToken paramCancellationToken)
  {
    return continueWithTask(paramContinuation, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation, Executor paramExecutor)
  {
    return continueWithTask(paramContinuation, paramExecutor, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation, Executor paramExecutor, CancellationToken paramCancellationToken)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    synchronized (lock)
    {
      boolean bool = isCompleted();
      if (!bool)
      {
        List localList = continuations;
        Continuation local11 = new bolts/Task$11;
        local11.<init>(this, localTaskCompletionSource, paramContinuation, paramExecutor, paramCancellationToken);
        localList.add(local11);
      }
      if (bool) {
        completeAfterTask(localTaskCompletionSource, paramContinuation, this, paramExecutor, paramCancellationToken);
      }
      return localTaskCompletionSource.getTask();
    }
  }
  
  public Exception getError()
  {
    synchronized (lock)
    {
      if (error != null)
      {
        errorHasBeenObserved = true;
        localObject2 = unobservedErrorNotifier;
        if (localObject2 != null)
        {
          ((UnobservedErrorNotifier)localObject2).setObserved();
          unobservedErrorNotifier = null;
        }
      }
      Object localObject2 = error;
      return (Exception)localObject2;
    }
  }
  
  public TResult getResult()
  {
    synchronized (lock)
    {
      Object localObject2 = result;
      return (TResult)localObject2;
    }
  }
  
  public boolean isCancelled()
  {
    synchronized (lock)
    {
      boolean bool = cancelled;
      return bool;
    }
  }
  
  public boolean isCompleted()
  {
    synchronized (lock)
    {
      boolean bool = complete;
      return bool;
    }
  }
  
  public boolean isFaulted()
  {
    synchronized (lock)
    {
      boolean bool;
      if (getError() != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public Task<Void> makeVoid()
  {
    continueWithTask(new Continuation()
    {
      public Task<Void> then(Task<TResult> paramAnonymousTask)
        throws Exception
      {
        if (paramAnonymousTask.isCancelled()) {
          return Task.cancelled();
        }
        if (paramAnonymousTask.isFaulted()) {
          return Task.forError(paramAnonymousTask.getError());
        }
        return Task.forResult(null);
      }
    });
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> paramContinuation)
  {
    return onSuccess(paramContinuation, IMMEDIATE_EXECUTOR, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> paramContinuation, CancellationToken paramCancellationToken)
  {
    return onSuccess(paramContinuation, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> paramContinuation, Executor paramExecutor)
  {
    return onSuccess(paramContinuation, paramExecutor, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> paramContinuation, Executor paramExecutor, final CancellationToken paramCancellationToken)
  {
    continueWithTask(new Continuation()
    {
      public Task<TContinuationResult> then(Task<TResult> paramAnonymousTask)
      {
        CancellationToken localCancellationToken = paramCancellationToken;
        if ((localCancellationToken != null) && (localCancellationToken.isCancellationRequested())) {
          return Task.cancelled();
        }
        if (paramAnonymousTask.isFaulted()) {
          return Task.forError(paramAnonymousTask.getError());
        }
        if (paramAnonymousTask.isCancelled()) {
          return Task.cancelled();
        }
        return paramAnonymousTask.continueWith(paramContinuation);
      }
    }, paramExecutor);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    return onSuccessTask(paramContinuation, IMMEDIATE_EXECUTOR);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation, CancellationToken paramCancellationToken)
  {
    return onSuccessTask(paramContinuation, IMMEDIATE_EXECUTOR, paramCancellationToken);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation, Executor paramExecutor)
  {
    return onSuccessTask(paramContinuation, paramExecutor, null);
  }
  
  public <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> paramContinuation, Executor paramExecutor, final CancellationToken paramCancellationToken)
  {
    continueWithTask(new Continuation()
    {
      public Task<TContinuationResult> then(Task<TResult> paramAnonymousTask)
      {
        CancellationToken localCancellationToken = paramCancellationToken;
        if ((localCancellationToken != null) && (localCancellationToken.isCancellationRequested())) {
          return Task.cancelled();
        }
        if (paramAnonymousTask.isFaulted()) {
          return Task.forError(paramAnonymousTask.getError());
        }
        if (paramAnonymousTask.isCancelled()) {
          return Task.cancelled();
        }
        return paramAnonymousTask.continueWithTask(paramContinuation);
      }
    }, paramExecutor);
  }
  
  public boolean trySetCancelled()
  {
    synchronized (lock)
    {
      if (complete) {
        return false;
      }
      complete = true;
      cancelled = true;
      lock.notifyAll();
      runContinuations();
      return true;
    }
  }
  
  public boolean trySetError(Exception paramException)
  {
    synchronized (lock)
    {
      if (complete) {
        return false;
      }
      complete = true;
      error = paramException;
      errorHasBeenObserved = false;
      lock.notifyAll();
      runContinuations();
      if ((!errorHasBeenObserved) && (getUnobservedExceptionHandler() != null))
      {
        paramException = new bolts/UnobservedErrorNotifier;
        paramException.<init>(this);
        unobservedErrorNotifier = paramException;
      }
      return true;
    }
  }
  
  public boolean trySetResult(TResult paramTResult)
  {
    synchronized (lock)
    {
      if (complete) {
        return false;
      }
      complete = true;
      result = paramTResult;
      lock.notifyAll();
      runContinuations();
      return true;
    }
  }
  
  public void waitForCompletion()
    throws InterruptedException
  {
    synchronized (lock)
    {
      if (!isCompleted()) {
        lock.wait();
      }
      return;
    }
  }
  
  public boolean waitForCompletion(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException
  {
    synchronized (lock)
    {
      if (!isCompleted()) {
        lock.wait(paramTimeUnit.toMillis(paramLong));
      }
      boolean bool = isCompleted();
      return bool;
    }
  }
  
  public class TaskCompletionSource
    extends TaskCompletionSource<TResult>
  {
    public TaskCompletionSource() {}
  }
  
  public static abstract interface UnobservedExceptionHandler
  {
    public abstract void unobservedException(Task<?> paramTask, UnobservedTaskException paramUnobservedTaskException);
  }
}

/* Location:
 * Qualified Name:     bolts.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */