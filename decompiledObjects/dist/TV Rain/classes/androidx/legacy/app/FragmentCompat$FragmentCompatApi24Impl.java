package androidx.legacy.app;

import android.app.Fragment;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class FragmentCompat$FragmentCompatApi24Impl
  extends FragmentCompat.FragmentCompatApi23Impl
{
  public void setUserVisibleHint(Fragment paramFragment, boolean paramBoolean)
  {
    paramFragment.setUserVisibleHint(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentCompat.FragmentCompatApi24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */