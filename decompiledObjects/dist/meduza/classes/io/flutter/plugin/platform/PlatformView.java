package io.flutter.plugin.platform;

import android.view.View;

public abstract interface PlatformView
{
  public abstract void dispose();
  
  public abstract View getView();
  
  public abstract void onFlutterViewAttached(View paramView);
  
  public abstract void onFlutterViewDetached();
  
  public abstract void onInputConnectionLocked();
  
  public abstract void onInputConnectionUnlocked();
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */