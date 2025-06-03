package androidx.legacy.app;

import android.app.Fragment;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class FragmentCompat$FragmentCompatApi23Impl
  extends FragmentCompat.FragmentCompatApi15Impl
{
  public void requestPermissions(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    paramFragment.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public boolean shouldShowRequestPermissionRationale(Fragment paramFragment, String paramString)
  {
    return paramFragment.shouldShowRequestPermissionRationale(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentCompat.FragmentCompatApi23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */