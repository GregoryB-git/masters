package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
@VisibleForTesting
abstract class AppCompatDelegateImpl$AutoNightModeManager
{
  private BroadcastReceiver mReceiver;
  
  public AppCompatDelegateImpl$AutoNightModeManager(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void cleanup()
  {
    BroadcastReceiver localBroadcastReceiver = mReceiver;
    if (localBroadcastReceiver != null) {}
    try
    {
      this$0.mContext.unregisterReceiver(localBroadcastReceiver);
      mReceiver = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  @Nullable
  public abstract IntentFilter createIntentFilterForBroadcastReceiver();
  
  public abstract int getApplyableNightMode();
  
  public boolean isListening()
  {
    boolean bool;
    if (mReceiver != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract void onChange();
  
  public void setup()
  {
    cleanup();
    IntentFilter localIntentFilter = createIntentFilterForBroadcastReceiver();
    if ((localIntentFilter != null) && (localIntentFilter.countActions() != 0))
    {
      if (mReceiver == null) {
        mReceiver = new BroadcastReceiver()
        {
          public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
          {
            onChange();
          }
        };
      }
      this$0.mContext.registerReceiver(mReceiver, localIntentFilter);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */