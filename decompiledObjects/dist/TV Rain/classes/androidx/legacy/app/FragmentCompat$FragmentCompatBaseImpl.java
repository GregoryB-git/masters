package androidx.legacy.app;

import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

class FragmentCompat$FragmentCompatBaseImpl
  implements FragmentCompat.FragmentCompatImpl
{
  public void requestPermissions(final Fragment paramFragment, final String[] paramArrayOfString, final int paramInt)
  {
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        int[] arrayOfInt = new int[paramArrayOfString.length];
        Object localObject = paramFragment.getActivity();
        if (localObject != null)
        {
          PackageManager localPackageManager = ((Context)localObject).getPackageManager();
          localObject = ((Context)localObject).getPackageName();
          int i = paramArrayOfString.length;
          for (int j = 0; j < i; j++) {
            arrayOfInt[j] = localPackageManager.checkPermission(paramArrayOfString[j], (String)localObject);
          }
        }
        Arrays.fill(arrayOfInt, -1);
        ((FragmentCompat.OnRequestPermissionsResultCallback)paramFragment).onRequestPermissionsResult(paramInt, paramArrayOfString, arrayOfInt);
      }
    });
  }
  
  public void setUserVisibleHint(Fragment paramFragment, boolean paramBoolean) {}
  
  public boolean shouldShowRequestPermissionRationale(Fragment paramFragment, String paramString)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentCompat.FragmentCompatBaseImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */