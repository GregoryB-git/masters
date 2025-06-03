package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;

class OfflineLicenseHelper$1
  implements DefaultDrmSessionEventListener
{
  public OfflineLicenseHelper$1(OfflineLicenseHelper paramOfflineLicenseHelper) {}
  
  public void onDrmKeysLoaded()
  {
    OfflineLicenseHelper.access$000(this$0).open();
  }
  
  public void onDrmKeysRemoved()
  {
    OfflineLicenseHelper.access$000(this$0).open();
  }
  
  public void onDrmKeysRestored()
  {
    OfflineLicenseHelper.access$000(this$0).open();
  }
  
  public void onDrmSessionManagerError(Exception paramException)
  {
    OfflineLicenseHelper.access$000(this$0).open();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.OfflineLicenseHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */