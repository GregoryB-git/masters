package com.facebook.appevents.aam;

import android.view.View;
import android.widget.EditText;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class MetadataViewObserver$1
  implements Runnable
{
  public MetadataViewObserver$1(MetadataViewObserver paramMetadataViewObserver, View paramView) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      View localView = val$view;
      if (!(localView instanceof EditText)) {
        return;
      }
      MetadataViewObserver.access$000(this$0, localView);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataViewObserver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */