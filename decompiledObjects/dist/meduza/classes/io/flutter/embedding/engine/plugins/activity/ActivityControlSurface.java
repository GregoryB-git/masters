package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b1.k;
import io.flutter.embedding.android.ExclusiveAppComponent;

public abstract interface ActivityControlSurface
{
  public abstract void attachToActivity(ExclusiveAppComponent<Activity> paramExclusiveAppComponent, k paramk);
  
  public abstract void detachFromActivity();
  
  public abstract void detachFromActivityForConfigChanges();
  
  public abstract boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract void onNewIntent(Intent paramIntent);
  
  public abstract boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  
  public abstract void onRestoreInstanceState(Bundle paramBundle);
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  public abstract void onUserLeaveHint();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */