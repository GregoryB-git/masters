package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import z2;

class MessageThreadUtil$2
  implements ThreadUtil.BackgroundCallback<T>
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
  
  public MessageThreadUtil$2(MessageThreadUtil paramMessageThreadUtil, ThreadUtil.BackgroundCallback paramBackgroundCallback) {}
  
  private void maybeExecuteBackgroundRunnable()
  {
    if (mBackgroundRunning.compareAndSet(false, true)) {
      mExecutor.execute(mBackgroundRunnable);
    }
  }
  
  private void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    mQueue.sendMessage(paramSyncQueueItem);
    maybeExecuteBackgroundRunnable();
  }
  
  private void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    mQueue.sendMessageAtFrontOfQueue(paramSyncQueueItem);
    maybeExecuteBackgroundRunnable();
  }
  
  public void loadTile(int paramInt1, int paramInt2)
  {
    sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramInt1, paramInt2));
  }
  
  public void recycleTile(TileList.Tile<T> paramTile)
  {
    sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, paramTile));
  }
  
  public void refresh(int paramInt)
  {
    sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramInt, null));
  }
  
  public void updateRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, null));
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */