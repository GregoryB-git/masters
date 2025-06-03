package androidx.recyclerview.widget;

class MessageThreadUtil$MessageQueue
{
  private MessageThreadUtil.SyncQueueItem mRoot;
  
  public MessageThreadUtil.SyncQueueItem next()
  {
    try
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem = mRoot;
      if (localSyncQueueItem == null) {
        return null;
      }
      mRoot = next;
      return localSyncQueueItem;
    }
    finally {}
  }
  
  public void removeMessages(int paramInt)
  {
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = mRoot;
        if ((localObject1 == null) || (what != paramInt)) {
          break;
        }
        mRoot = next;
        ((MessageThreadUtil.SyncQueueItem)localObject1).recycle();
      }
      if (localObject1 != null)
      {
        MessageThreadUtil.SyncQueueItem localSyncQueueItem;
        for (Object localObject2 = next; localObject2 != null; localObject2 = localSyncQueueItem)
        {
          localSyncQueueItem = next;
          if (what == paramInt)
          {
            next = localSyncQueueItem;
            ((MessageThreadUtil.SyncQueueItem)localObject2).recycle();
          }
          else
          {
            localObject1 = localObject2;
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    try
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem1 = mRoot;
      MessageThreadUtil.SyncQueueItem localSyncQueueItem2 = localSyncQueueItem1;
      if (localSyncQueueItem1 == null)
      {
        mRoot = paramSyncQueueItem;
        return;
      }
      for (;;)
      {
        localSyncQueueItem1 = next;
        if (localSyncQueueItem1 == null) {
          break;
        }
        localSyncQueueItem2 = localSyncQueueItem1;
      }
      next = paramSyncQueueItem;
      return;
    }
    finally {}
  }
  
  public void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    try
    {
      next = mRoot;
      mRoot = paramSyncQueueItem;
      return;
    }
    finally
    {
      paramSyncQueueItem = finally;
      throw paramSyncQueueItem;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.MessageQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */