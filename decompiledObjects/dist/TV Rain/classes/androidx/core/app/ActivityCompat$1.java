package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

class ActivityCompat$1
  implements Runnable
{
  public ActivityCompat$1(String[] paramArrayOfString, Activity paramActivity, int paramInt) {}
  
  public void run()
  {
    int[] arrayOfInt = new int[val$permissionsArray.length];
    PackageManager localPackageManager = val$activity.getPackageManager();
    String str = val$activity.getPackageName();
    int i = val$permissionsArray.length;
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = localPackageManager.checkPermission(val$permissionsArray[j], str);
    }
    ((ActivityCompat.OnRequestPermissionsResultCallback)val$activity).onRequestPermissionsResult(val$requestCode, val$permissionsArray, arrayOfInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */