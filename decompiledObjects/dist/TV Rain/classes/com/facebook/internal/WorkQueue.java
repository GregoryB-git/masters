package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;

public class WorkQueue
{
  public static final int DEFAULT_MAX_CONCURRENT = 8;
  private final Executor executor;
  private final int maxConcurrent;
  private WorkNode pendingJobs;
  private int runningCount = 0;
  private WorkNode runningJobs = null;
  private final Object workLock = new Object();
  
  public WorkQueue()
  {
    this(8);
  }
  
  public WorkQueue(int paramInt)
  {
    this(paramInt, FacebookSdk.getExecutor());
  }
  
  public WorkQueue(int paramInt, Executor paramExecutor)
  {
    maxConcurrent = paramInt;
    executor = paramExecutor;
  }
  
  private void execute(final WorkNode paramWorkNode)
  {
    executor.execute(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: invokestatic 32	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
        //   4: ifeq +4 -> 8
        //   7: return
        //   8: aload_0
        //   9: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
        //   12: invokevirtual 38	com/facebook/internal/WorkQueue$WorkNode:getCallback	()Ljava/lang/Runnable;
        //   15: invokeinterface 40 1 0
        //   20: aload_0
        //   21: getfield 19	com/facebook/internal/WorkQueue$1:this$0	Lcom/facebook/internal/WorkQueue;
        //   24: aload_0
        //   25: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
        //   28: invokestatic 43	com/facebook/internal/WorkQueue:access$000	(Lcom/facebook/internal/WorkQueue;Lcom/facebook/internal/WorkQueue$WorkNode;)V
        //   31: return
        //   32: astore_1
        //   33: aload_0
        //   34: getfield 19	com/facebook/internal/WorkQueue$1:this$0	Lcom/facebook/internal/WorkQueue;
        //   37: aload_0
        //   38: getfield 21	com/facebook/internal/WorkQueue$1:val$node	Lcom/facebook/internal/WorkQueue$WorkNode;
        //   41: invokestatic 43	com/facebook/internal/WorkQueue:access$000	(Lcom/facebook/internal/WorkQueue;Lcom/facebook/internal/WorkQueue$WorkNode;)V
        //   44: aload_1
        //   45: athrow
        //   46: astore_1
        //   47: aload_1
        //   48: aload_0
        //   49: invokestatic 47	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   52: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	53	0	this	1
        //   32	13	1	localObject	Object
        //   46	2	1	localThrowable	Throwable
        // Exception table:
        //   from	to	target	type
        //   8	20	32	finally
        //   20	31	46	finally
        //   33	46	46	finally
      }
    });
  }
  
  private void finishItemAndStartNew(WorkNode paramWorkNode)
  {
    Object localObject = workLock;
    if (paramWorkNode != null) {}
    try
    {
      runningJobs = paramWorkNode.removeFromList(runningJobs);
      runningCount -= 1;
      if (runningCount < maxConcurrent)
      {
        WorkNode localWorkNode = pendingJobs;
        paramWorkNode = localWorkNode;
        if (localWorkNode != null)
        {
          pendingJobs = localWorkNode.removeFromList(localWorkNode);
          runningJobs = localWorkNode.addToList(runningJobs, false);
          runningCount += 1;
          localWorkNode.setIsRunning(true);
          paramWorkNode = localWorkNode;
        }
      }
      else
      {
        paramWorkNode = null;
      }
      if (paramWorkNode != null) {
        execute(paramWorkNode);
      }
      return;
    }
    finally {}
  }
  
  private void startItem()
  {
    finishItemAndStartNew(null);
  }
  
  public WorkItem addActiveWorkItem(Runnable paramRunnable)
  {
    return addActiveWorkItem(paramRunnable, true);
  }
  
  public WorkItem addActiveWorkItem(Runnable arg1, boolean paramBoolean)
  {
    WorkNode localWorkNode = new WorkNode(???);
    synchronized (workLock)
    {
      pendingJobs = localWorkNode.addToList(pendingJobs, paramBoolean);
      startItem();
      return localWorkNode;
    }
  }
  
  public void validate()
  {
    synchronized (workLock)
    {
      Object localObject2 = runningJobs;
      if (localObject2 != null)
      {
        WorkNode localWorkNode;
        do
        {
          ((WorkNode)localObject2).verify(true);
          localWorkNode = ((WorkNode)localObject2).getNext();
          localObject2 = localWorkNode;
        } while (localWorkNode != runningJobs);
      }
      return;
    }
  }
  
  public static abstract interface WorkItem
  {
    public abstract boolean cancel();
    
    public abstract boolean isRunning();
    
    public abstract void moveToFront();
  }
  
  public class WorkNode
    implements WorkQueue.WorkItem
  {
    private final Runnable callback;
    private boolean isRunning;
    private WorkNode next;
    private WorkNode prev;
    
    public WorkNode(Runnable paramRunnable)
    {
      callback = paramRunnable;
    }
    
    public WorkNode addToList(WorkNode paramWorkNode, boolean paramBoolean)
    {
      if (paramWorkNode == null)
      {
        prev = this;
        next = this;
        paramWorkNode = this;
      }
      else
      {
        next = paramWorkNode;
        WorkNode localWorkNode = prev;
        prev = localWorkNode;
        next = this;
        prev = this;
      }
      if (paramBoolean) {
        paramWorkNode = this;
      }
      return paramWorkNode;
    }
    
    public boolean cancel()
    {
      synchronized (WorkQueue.access$100(WorkQueue.this))
      {
        if (!isRunning())
        {
          WorkQueue localWorkQueue = WorkQueue.this;
          WorkQueue.access$202(localWorkQueue, removeFromList(WorkQueue.access$200(localWorkQueue)));
          return true;
        }
        return false;
      }
    }
    
    public Runnable getCallback()
    {
      return callback;
    }
    
    public WorkNode getNext()
    {
      return next;
    }
    
    public boolean isRunning()
    {
      return isRunning;
    }
    
    public void moveToFront()
    {
      synchronized (WorkQueue.access$100(WorkQueue.this))
      {
        if (!isRunning())
        {
          WorkQueue localWorkQueue = WorkQueue.this;
          WorkQueue.access$202(localWorkQueue, removeFromList(WorkQueue.access$200(localWorkQueue)));
          localWorkQueue = WorkQueue.this;
          WorkQueue.access$202(localWorkQueue, addToList(WorkQueue.access$200(localWorkQueue), true));
        }
        return;
      }
    }
    
    public WorkNode removeFromList(WorkNode paramWorkNode)
    {
      WorkNode localWorkNode = paramWorkNode;
      if (paramWorkNode == this)
      {
        paramWorkNode = next;
        localWorkNode = paramWorkNode;
        if (paramWorkNode == this) {
          localWorkNode = null;
        }
      }
      paramWorkNode = next;
      prev = prev;
      prev.next = paramWorkNode;
      prev = null;
      next = null;
      return localWorkNode;
    }
    
    public void setIsRunning(boolean paramBoolean)
    {
      isRunning = paramBoolean;
    }
    
    public void verify(boolean paramBoolean) {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WorkQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */