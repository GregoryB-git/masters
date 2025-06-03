package j7;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e
  extends ResultReceiver
{
  public e(Handler paramHandler, TaskCompletionSource paramTaskCompletionSource)
  {
    super(paramHandler);
  }
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    a.trySetResult(null);
  }
}

/* Location:
 * Qualified Name:     j7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */