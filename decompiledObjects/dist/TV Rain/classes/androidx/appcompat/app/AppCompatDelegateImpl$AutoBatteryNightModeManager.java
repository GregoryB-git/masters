package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.annotation.NonNull;

class AppCompatDelegateImpl$AutoBatteryNightModeManager
  extends AppCompatDelegateImpl.AutoNightModeManager
{
  private final PowerManager mPowerManager;
  
  public AppCompatDelegateImpl$AutoBatteryNightModeManager(@NonNull AppCompatDelegateImpl paramAppCompatDelegateImpl, Context paramContext)
  {
    super(paramAppCompatDelegateImpl);
    mPowerManager = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
  }
  
  public IntentFilter createIntentFilterForBroadcastReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return localIntentFilter;
  }
  
  public int getApplyableNightMode()
  {
    int i;
    if (AppCompatDelegateImpl.Api21Impl.isPowerSaveMode(mPowerManager)) {
      i = 2;
    } else {
      i = 1;
    }
    return i;
  }
  
  public void onChange()
  {
    this$0.applyDayNight();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoBatteryNightModeManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */