package com.facebook.internal;

class WorkQueue$WorkNode
  implements WorkQueue.WorkItem
{
  private final Runnable callback;
  private boolean isRunning;
  private WorkNode next;
  private WorkNode prev;
  
  public WorkQueue$WorkNode(WorkQueue paramWorkQueue, Runnable paramRunnable)
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
    synchronized (WorkQueue.access$100(this$0))
    {
      if (!isRunning())
      {
        WorkQueue localWorkQueue = this$0;
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
    synchronized (WorkQueue.access$100(this$0))
    {
      if (!isRunning())
      {
        WorkQueue localWorkQueue = this$0;
        WorkQueue.access$202(localWorkQueue, removeFromList(WorkQueue.access$200(localWorkQueue)));
        localWorkQueue = this$0;
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

/* Location:
 * Qualified Name:     com.facebook.internal.WorkQueue.WorkNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */