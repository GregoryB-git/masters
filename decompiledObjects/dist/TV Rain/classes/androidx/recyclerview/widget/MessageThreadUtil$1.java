package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import z2;

class MessageThreadUtil$1
  implements ThreadUtil.MainThreadCallback<T>
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
  
  public MessageThreadUtil$1(MessageThreadUtil paramMessageThreadUtil, ThreadUtil.MainThreadCallback paramMainThreadCallback) {}
  
  private void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    mQueue.sendMessage(paramSyncQueueItem);
    mMainThreadHandler.post(mMainThreadRunnable);
  }
  
  public void addTile(int paramInt, TileList.Tile<T> paramTile)
  {
    sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramInt, paramTile));
  }
  
  public void removeTile(int paramInt1, int paramInt2)
  {
    sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramInt1, paramInt2));
  }
  
  public void updateItemCount(int paramInt1, int paramInt2)
  {
    sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramInt1, paramInt2));
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */