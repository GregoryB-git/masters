package androidx.recyclerview.widget;

import android.util.Log;
import z2;

class MessageThreadUtil$1$1
  implements Runnable
{
  public MessageThreadUtil$1$1(MessageThreadUtil.1 param1) {}
  
  public void run()
  {
    for (MessageThreadUtil.SyncQueueItem localSyncQueueItem = this$1.mQueue.next(); localSyncQueueItem != null; localSyncQueueItem = this$1.mQueue.next())
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
            this$1.val$callback.removeTile(arg1, arg2);
          }
        }
        else
        {
          localObject = (TileList.Tile)data;
          this$1.val$callback.addTile(arg1, (TileList.Tile)localObject);
        }
      }
      else
      {
        this$1.val$callback.updateItemCount(arg1, arg2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */