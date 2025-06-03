package androidx.legacy.app;

import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Arrays;

class FragmentCompat$FragmentCompatBaseImpl$1
  implements Runnable
{
  public FragmentCompat$FragmentCompatBaseImpl$1(FragmentCompat.FragmentCompatBaseImpl paramFragmentCompatBaseImpl, String[] paramArrayOfString, Fragment paramFragment, int paramInt) {}
  
  public void run()
  {
    int[] arrayOfInt = new int[val$permissions.length];
    Object localObject = val$fragment.getActivity();
    if (localObject != null)
    {
      PackageManager localPackageManager = ((Context)localObject).getPackageManager();
      localObject = ((Context)localObject).getPackageName();
      int i = val$permissions.length;
      for (int j = 0; j < i; j++) {
        arrayOfInt[j] = localPackageManager.checkPermission(val$permissions[j], (String)localObject);
      }
    }
    Arrays.fill(arrayOfInt, -1);
    ((FragmentCompat.OnRequestPermissionsResultCallback)val$fragment).onRequestPermissionsResult(val$requestCode, val$permissions, arrayOfInt);
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentCompat.FragmentCompatBaseImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */