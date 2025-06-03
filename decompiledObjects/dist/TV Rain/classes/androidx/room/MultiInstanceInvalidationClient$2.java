package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;

class MultiInstanceInvalidationClient$2
  implements ServiceConnection
{
  public MultiInstanceInvalidationClient$2(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this$0.mService = IMultiInstanceInvalidationService.Stub.asInterface(paramIBinder);
    paramComponentName = this$0;
    mExecutor.execute(mSetUpRunnable);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this$0;
    mExecutor.execute(mRemoveObserverRunnable);
    this$0.mService = null;
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */