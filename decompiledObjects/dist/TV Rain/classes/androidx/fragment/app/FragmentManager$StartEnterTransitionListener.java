package androidx.fragment.app;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

class FragmentManager$StartEnterTransitionListener
  implements Fragment.OnStartEnterTransitionListener
{
  public final boolean mIsBack;
  private int mNumPostponed;
  public final BackStackRecord mRecord;
  
  public FragmentManager$StartEnterTransitionListener(@NonNull BackStackRecord paramBackStackRecord, boolean paramBoolean)
  {
    mIsBack = paramBoolean;
    mRecord = paramBackStackRecord;
  }
  
  public void cancelTransaction()
  {
    BackStackRecord localBackStackRecord = mRecord;
    mManager.completeExecute(localBackStackRecord, mIsBack, false, false);
  }
  
  public void completeTransaction()
  {
    int i;
    if (mNumPostponed > 0) {
      i = 1;
    } else {
      i = 0;
    }
    Iterator localIterator = mRecord.mManager.getFragments().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Fragment)localIterator.next();
      ((Fragment)localObject).setOnStartEnterTransitionListener(null);
      if ((i != 0) && (((Fragment)localObject).isPostponed())) {
        ((Fragment)localObject).startPostponedEnterTransition();
      }
    }
    Object localObject = mRecord;
    mManager.completeExecute((BackStackRecord)localObject, mIsBack, i ^ 0x1, true);
  }
  
  public boolean isReady()
  {
    boolean bool;
    if (mNumPostponed == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStartEnterTransition()
  {
    int i = mNumPostponed - 1;
    mNumPostponed = i;
    if (i != 0) {
      return;
    }
    mRecord.mManager.scheduleCommit();
  }
  
  public void startListening()
  {
    mNumPostponed += 1;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.StartEnterTransitionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */