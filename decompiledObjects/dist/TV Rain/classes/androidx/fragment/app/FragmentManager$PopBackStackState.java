package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

class FragmentManager$PopBackStackState
  implements FragmentManager.OpGenerator
{
  public final int mFlags;
  public final int mId;
  public final String mName;
  
  public FragmentManager$PopBackStackState(@Nullable FragmentManager paramFragmentManager, String paramString, int paramInt1, int paramInt2)
  {
    mName = paramString;
    mId = paramInt1;
    mFlags = paramInt2;
  }
  
  public boolean generateOps(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1)
  {
    Fragment localFragment = this$0.mPrimaryNav;
    if ((localFragment != null) && (mId < 0) && (mName == null) && (localFragment.getChildFragmentManager().popBackStackImmediate())) {
      return false;
    }
    return this$0.popBackStackState(paramArrayList, paramArrayList1, mName, mId, mFlags);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.PopBackStackState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */