package androidx.recyclerview.widget;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import z2;

class MessageThreadUtil$2$1
  implements Runnable
{
  public MessageThreadUtil$2$1(MessageThreadUtil.2 param2) {}
  
  public void run()
  {
    for (;;)
    {
      Object localObject = this$1.mQueue.next();
      if (localObject == null)
      {
        this$1.mBackgroundRunning.set(false);
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
              this$1.val$callback.recycleTile((TileList.Tile)localObject);
            }
          }
          else {
            this$1.val$callback.loadTile(arg1, arg2);
          }
        }
        else
        {
          this$1.mQueue.removeMessages(2);
          this$1.mQueue.removeMessages(3);
          this$1.val$callback.updateRange(arg1, arg2, arg3, arg4, arg5);
        }
      }
      else
      {
        this$1.mQueue.removeMessages(1);
        this$1.val$callback.refresh(arg1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */