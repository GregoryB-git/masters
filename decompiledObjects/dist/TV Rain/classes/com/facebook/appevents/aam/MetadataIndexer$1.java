package com.facebook.appevents.aam;

import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class MetadataIndexer$1
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!AttributionIdentifiers.isTrackingLimited(FacebookSdk.getApplicationContext()))
      {
        MetadataIndexer.access$000();
        MetadataIndexer.access$102(Boolean.TRUE);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataIndexer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */