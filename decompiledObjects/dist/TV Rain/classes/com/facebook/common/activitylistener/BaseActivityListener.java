package com.facebook.common.activitylistener;

import android.app.Activity;

public class BaseActivityListener
  implements ActivityListener
{
  public int getPriority()
  {
    return 1;
  }
  
  public void onActivityCreate(Activity paramActivity) {}
  
  public void onDestroy(Activity paramActivity) {}
  
  public void onPause(Activity paramActivity) {}
  
  public void onResume(Activity paramActivity) {}
  
  public void onStart(Activity paramActivity) {}
  
  public void onStop(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     com.facebook.common.activitylistener.BaseActivityListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */