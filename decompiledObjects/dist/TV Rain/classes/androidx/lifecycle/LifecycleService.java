package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LifecycleService
  extends Service
  implements LifecycleOwner
{
  private final ServiceLifecycleDispatcher mDispatcher = new ServiceLifecycleDispatcher(this);
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mDispatcher.getLifecycle();
  }
  
  @CallSuper
  @Nullable
  public IBinder onBind(@NonNull Intent paramIntent)
  {
    mDispatcher.onServicePreSuperOnBind();
    return null;
  }
  
  @CallSuper
  public void onCreate()
  {
    mDispatcher.onServicePreSuperOnCreate();
    super.onCreate();
  }
  
  @CallSuper
  public void onDestroy()
  {
    mDispatcher.onServicePreSuperOnDestroy();
    super.onDestroy();
  }
  
  @CallSuper
  public void onStart(@NonNull Intent paramIntent, int paramInt)
  {
    mDispatcher.onServicePreSuperOnStart();
    super.onStart(paramIntent, paramInt);
  }
  
  @CallSuper
  public int onStartCommand(@NonNull Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */