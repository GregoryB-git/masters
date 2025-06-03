package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;

final class InstrumentManager$2
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      ErrorReportHandler.enable();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */