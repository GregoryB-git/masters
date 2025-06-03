package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

class AsyncListDiffer$MainThreadExecutor
  implements Executor
{
  public final Handler mHandler = new Handler(Looper.getMainLooper());
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    mHandler.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.MainThreadExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */