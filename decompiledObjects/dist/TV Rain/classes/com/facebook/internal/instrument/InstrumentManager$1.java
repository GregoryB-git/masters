package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;

final class InstrumentManager$1
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      CrashHandler.enable();
      if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield))
      {
        ExceptionAnalyzer.enable();
        CrashShieldHandler.enable();
      }
      if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
        ThreadCheckHandler.enable();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */