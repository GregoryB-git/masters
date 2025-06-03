package androidx.loader.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ModernAsyncTask$InternalHandler
  extends Handler
{
  public ModernAsyncTask$InternalHandler()
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = (ModernAsyncTask.AsyncTaskResult)obj;
    int i = what;
    if (i != 1)
    {
      if (i == 2) {
        mTask.onProgressUpdate(mData);
      }
    }
    else {
      mTask.finish(mData[0]);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.InternalHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */