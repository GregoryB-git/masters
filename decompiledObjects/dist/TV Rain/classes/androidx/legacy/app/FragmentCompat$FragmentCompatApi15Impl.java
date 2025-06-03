package androidx.legacy.app;

import android.app.Fragment;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class FragmentCompat$FragmentCompatApi15Impl
  extends FragmentCompat.FragmentCompatBaseImpl
{
  public void setUserVisibleHint(Fragment paramFragment, boolean paramBoolean)
  {
    paramFragment.setUserVisibleHint(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentCompat.FragmentCompatApi15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */