package androidx.appcompat.app;

import android.content.IntentFilter;
import androidx.annotation.NonNull;

class AppCompatDelegateImpl$AutoTimeNightModeManager
  extends AppCompatDelegateImpl.AutoNightModeManager
{
  private final TwilightManager mTwilightManager;
  
  public AppCompatDelegateImpl$AutoTimeNightModeManager(@NonNull AppCompatDelegateImpl paramAppCompatDelegateImpl, TwilightManager paramTwilightManager)
  {
    super(paramAppCompatDelegateImpl);
    mTwilightManager = paramTwilightManager;
  }
  
  public IntentFilter createIntentFilterForBroadcastReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.TIME_SET");
    localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
    localIntentFilter.addAction("android.intent.action.TIME_TICK");
    return localIntentFilter;
  }
  
  public int getApplyableNightMode()
  {
    int i;
    if (mTwilightManager.isNight()) {
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
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.AutoTimeNightModeManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */