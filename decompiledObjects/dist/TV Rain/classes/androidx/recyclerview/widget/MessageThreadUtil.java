package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import z2;

class MessageThreadUtil<T>
  implements ThreadUtil<T>
{
  public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(final ThreadUtil.BackgroundCallback<T> paramBackgroundCallback)
  {
    new ThreadUtil.BackgroundCallback()
    {
      public static final int LOAD_TILE = 3;
      public static final int RECYCLE_TILE = 4;
      public static final int REFRESH = 1;
      public static final int UPDATE_RANGE = 2;
      private Runnable mBackgroundRunnable = new Runnable()
      {
        public void run()
        {
          for (;;)
          {
            Object localObject = mQueue.next();
            if (localObject == null)
            {
              mBackgroundRunning.set(false);
              return;
            }
            int i = what;
            if (i != 1)
            {
              if (i != 2)
              {
                if (i != 3)
                {
                  if (i != 4)
                  {
                    StringBuilder localStringBuilder = z2.t("Unsupported message, what=");
                    localStringBuilder.append(what);
                    Log.e("ThreadUtil", localStringBuilder.toString());
                  }
                  else
                  {
                    localObject = (TileList.Tile)data;
                    val$callback.recycleTile((TileList.Tile)localObject);
                  }
                }
                else {
                  val$callback.loadTile(arg1, arg2);
                }
              }
              else
              {
                mQueue.removeMessages(2);
                mQueue.removeMessages(3);
                val$callback.updateRange(arg1, arg2, arg3, arg4, arg5);
              }
            }
            else
            {
              mQueue.removeMessages(1);
              val$callback.refresh(arg1);
            }
          }
        }
      };
      public AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
      private final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      public final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
      
      private void maybeExecuteBackgroundRunnable()
      {
        if (mBackgroundRunning.compareAndSet(false, true)) {
          mExecutor.execute(mBackgroundRunnable);
        }
      }
      
      private void sendMessage(MessageThreadUtil.SyncQueueItem paramAnonymousSyncQueueItem)
      {
        mQueue.sendMessage(paramAnonymousSyncQueueItem);
        maybeExecuteBackgroundRunnable();
      }
      
      private void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem paramAnonymousSyncQueueItem)
      {
        mQueue.sendMessageAtFrontOfQueue(paramAnonymousSyncQueueItem);
        maybeExecuteBackgroundRunnable();
      }
      
      public void loadTile(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramAnonymousInt1, paramAnonymousInt2));
      }
      
      public void recycleTile(TileList.Tile<T> paramAnonymousTile)
      {
        sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, paramAnonymousTile));
      }
      
      public void refresh(int paramAnonymousInt)
      {
        sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramAnonymousInt, null));
      }
      
      public void updateRange(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5)
      {
        sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, null));
      }
    };
  }
  
  public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(final ThreadUtil.MainThreadCallback<T> paramMainThreadCallback)
  {
    new ThreadUtil.MainThreadCallback()
    {
      public static final int ADD_TILE = 2;
      public static final int REMOVE_TILE = 3;
      public static final int UPDATE_ITEM_COUNT = 1;
      private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
      private Runnable mMainThreadRunnable = new Runnable()
      {
        public void run()
        {
          for (MessageThreadUtil.SyncQueueItem localSyncQueueItem = mQueue.next(); localSyncQueueItem != null; localSyncQueueItem = mQueue.next())
          {
            int i = what;
            if (i != 1)
            {
              Object localObject;
              if (i != 2)
              {
                if (i != 3)
                {
                  localObject = z2.t("Unsupported message, what=");
                  ((StringBuilder)localObject).append(what);
                  Log.e("ThreadUtil", ((StringBuilder)localObject).toString());
                }
                else
                {
                  val$callback.removeTile(arg1, arg2);
                }
              }
              else
              {
                localObject = (TileList.Tile)data;
                val$callback.addTile(arg1, (TileList.Tile)localObject);
              }
            }
            else
            {
              val$callback.updateItemCount(arg1, arg2);
            }
          }
        }
      };
      public final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
      
      private void sendMessage(MessageThreadUtil.SyncQueueItem paramAnonymousSyncQueueItem)
      {
        mQueue.sendMessage(paramAnonymousSyncQueueItem);
        mMainThreadHandler.post(mMainThreadRunnable);
      }
      
      public void addTile(int paramAnonymousInt, TileList.Tile<T> paramAnonymousTile)
      {
        sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramAnonymousInt, paramAnonymousTile));
      }
      
      public void removeTile(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramAnonymousInt1, paramAnonymousInt2));
      }
      
      public void updateItemCount(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramAnonymousInt1, paramAnonymousInt2));
      }
    };
  }
  
  public static class MessageQueue
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
  
  public static class SyncQueueItem
  {
    private static SyncQueueItem sPool;
    private static final Object sPoolLock = new Object();
    public int arg1;
    public int arg2;
    public int arg3;
    public int arg4;
    public int arg5;
    public Object data;
    public SyncQueueItem next;
    public int what;
    
    public static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, int paramInt3)
    {
      return obtainMessage(paramInt1, paramInt2, paramInt3, 0, 0, 0, null);
    }
    
    public static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject)
    {
      synchronized (sPoolLock)
      {
        SyncQueueItem localSyncQueueItem = sPool;
        if (localSyncQueueItem == null)
        {
          localSyncQueueItem = new androidx/recyclerview/widget/MessageThreadUtil$SyncQueueItem;
          localSyncQueueItem.<init>();
        }
        else
        {
          sPool = next;
          next = null;
        }
        what = paramInt1;
        arg1 = paramInt2;
        arg2 = paramInt3;
        arg3 = paramInt4;
        arg4 = paramInt5;
        arg5 = paramInt6;
        data = paramObject;
        return localSyncQueueItem;
      }
    }
    
    public static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, Object paramObject)
    {
      return obtainMessage(paramInt1, paramInt2, 0, 0, 0, 0, paramObject);
    }
    
    public void recycle()
    {
      next = null;
      arg5 = 0;
      arg4 = 0;
      arg3 = 0;
      arg2 = 0;
      arg1 = 0;
      what = 0;
      data = null;
      synchronized (sPoolLock)
      {
        SyncQueueItem localSyncQueueItem = sPool;
        if (localSyncQueueItem != null) {
          next = localSyncQueueItem;
        }
        sPool = this;
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */