package io.flutter.plugin.common;

import android.content.Intent;

public abstract interface PluginRegistry
{
  public static abstract interface ActivityResultListener
  {
    public abstract boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
  }
  
  public static abstract interface NewIntentListener
  {
    public abstract boolean onNewIntent(Intent paramIntent);
  }
  
  public static abstract interface RequestPermissionsResultListener
  {
    public abstract boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  }
  
  public static abstract interface UserLeaveHintListener
  {
    public abstract void onUserLeaveHint();
  }
  
  public static abstract interface WindowFocusChangedListener
  {
    public abstract void onWindowFocusChanged(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.PluginRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */