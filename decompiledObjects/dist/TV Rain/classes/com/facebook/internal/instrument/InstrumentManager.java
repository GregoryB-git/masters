package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class InstrumentManager
{
  public static void start()
  {
    if (!FacebookSdk.getAutoLogAppEventsEnabled()) {
      return;
    }
    FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
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
    });
    FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          ErrorReportHandler.enable();
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */