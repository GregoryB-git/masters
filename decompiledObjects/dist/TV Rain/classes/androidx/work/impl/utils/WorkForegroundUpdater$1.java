package androidx.work.impl.utils;

import android.content.Context;
import android.content.Intent;
import androidx.work.ForegroundInfo;
import androidx.work.WorkInfo.State;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

class WorkForegroundUpdater$1
  implements Runnable
{
  public WorkForegroundUpdater$1(WorkForegroundUpdater paramWorkForegroundUpdater, SettableFuture paramSettableFuture, UUID paramUUID, ForegroundInfo paramForegroundInfo, Context paramContext) {}
  
  public void run()
  {
    try
    {
      if (!val$future.isCancelled())
      {
        String str = val$id.toString();
        Object localObject = this$0.mWorkSpecDao.getState(str);
        if ((localObject != null) && (!((WorkInfo.State)localObject).isFinished()))
        {
          this$0.mForegroundProcessor.startForeground(str, val$foregroundInfo);
          localObject = SystemForegroundDispatcher.createNotifyIntent(val$context, str, val$foregroundInfo);
          val$context.startService((Intent)localObject);
        }
        else
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
          throw ((Throwable)localObject);
        }
      }
    }
    finally
    {
      val$future.setException(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkForegroundUpdater.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */