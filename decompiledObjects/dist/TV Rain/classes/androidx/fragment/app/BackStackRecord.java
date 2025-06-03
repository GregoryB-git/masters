package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.util.ArrayList;
import z2;

final class BackStackRecord
  extends FragmentTransaction
  implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator
{
  private static final String TAG = "FragmentManager";
  public boolean mCommitted;
  public int mIndex = -1;
  public final FragmentManager mManager;
  
  public BackStackRecord(@NonNull FragmentManager paramFragmentManager)
  {
    super(localFragmentFactory, localClassLoader);
    mManager = paramFragmentManager;
  }
  
  private static boolean isFragmentPostponed(FragmentTransaction.Op paramOp)
  {
    paramOp = mFragment;
    boolean bool;
    if ((paramOp != null) && (mAdded) && (mView != null) && (!mDetached) && (!mHidden) && (paramOp.isPostponed())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void bumpBackStackNesting(int paramInt)
  {
    if (!mAddToBackStack) {
      return;
    }
    Object localObject1;
    if (FragmentManager.isLoggingEnabled(2))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Bump nesting in ");
      ((StringBuilder)localObject1).append(this);
      ((StringBuilder)localObject1).append(" by ");
      ((StringBuilder)localObject1).append(paramInt);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    int i = mOps.size();
    for (int j = 0; j < i; j++)
    {
      localObject1 = (FragmentTransaction.Op)mOps.get(j);
      Object localObject2 = mFragment;
      if (localObject2 != null)
      {
        mBackStackNesting += paramInt;
        if (FragmentManager.isLoggingEnabled(2))
        {
          localObject2 = z2.t("Bump nesting of ");
          ((StringBuilder)localObject2).append(mFragment);
          ((StringBuilder)localObject2).append(" to ");
          ((StringBuilder)localObject2).append(mFragment.mBackStackNesting);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
      }
    }
  }
  
  public int commit()
  {
    return commitInternal(false);
  }
  
  public int commitAllowingStateLoss()
  {
    return commitInternal(true);
  }
  
  public int commitInternal(boolean paramBoolean)
  {
    if (!mCommitted)
    {
      if (FragmentManager.isLoggingEnabled(2))
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Commit: ");
        ((StringBuilder)localObject).append(this);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        localObject = new PrintWriter(new LogWriter("FragmentManager"));
        dump("  ", (PrintWriter)localObject);
        ((PrintWriter)localObject).close();
      }
      mCommitted = true;
      if (mAddToBackStack) {
        mIndex = mManager.allocBackStackIndex();
      } else {
        mIndex = -1;
      }
      mManager.enqueueAction(this, paramBoolean);
      return mIndex;
    }
    throw new IllegalStateException("commit already called");
  }
  
  public void commitNow()
  {
    disallowAddToBackStack();
    mManager.execSingleAction(this, false);
  }
  
  public void commitNowAllowingStateLoss()
  {
    disallowAddToBackStack();
    mManager.execSingleAction(this, true);
  }
  
  @NonNull
  public FragmentTransaction detach(@NonNull Fragment paramFragment)
  {
    Object localObject = mFragmentManager;
    if ((localObject != null) && (localObject != mManager))
    {
      localObject = z2.t("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
      ((StringBuilder)localObject).append(paramFragment.toString());
      ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return super.detach(paramFragment);
  }
  
  public void doAddOp(int paramInt1, Fragment paramFragment, @Nullable String paramString, int paramInt2)
  {
    super.doAddOp(paramInt1, paramFragment, paramString, paramInt2);
    mFragmentManager = mManager;
  }
  
  public void dump(String paramString, PrintWriter paramPrintWriter)
  {
    dump(paramString, paramPrintWriter, true);
  }
  
  public void dump(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(mName);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(mIndex);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(mCommitted);
      if (mTransition != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(mTransition));
      }
      if ((mEnterAnim != 0) || (mExitAnim != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(mEnterAnim));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(mExitAnim));
      }
      if ((mPopEnterAnim != 0) || (mPopExitAnim != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(mPopEnterAnim));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(mPopExitAnim));
      }
      if ((mBreadCrumbTitleRes != 0) || (mBreadCrumbTitleText != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(mBreadCrumbTitleRes));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(mBreadCrumbTitleText);
      }
      if ((mBreadCrumbShortTitleRes != 0) || (mBreadCrumbShortTitleText != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(mBreadCrumbShortTitleText);
      }
    }
    if (!mOps.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = mOps.size();
      for (int j = 0; j < i; j++)
      {
        FragmentTransaction.Op localOp = (FragmentTransaction.Op)mOps.get(j);
        Object localObject;
        switch (mCmd)
        {
        default: 
          localObject = z2.t("cmd=");
          ((StringBuilder)localObject).append(mCmd);
          localObject = ((StringBuilder)localObject).toString();
          break;
        case 10: 
          localObject = "OP_SET_MAX_LIFECYCLE";
          break;
        case 9: 
          localObject = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject = "ATTACH";
          break;
        case 6: 
          localObject = "DETACH";
          break;
        case 5: 
          localObject = "SHOW";
          break;
        case 4: 
          localObject = "HIDE";
          break;
        case 3: 
          localObject = "REMOVE";
          break;
        case 2: 
          localObject = "REPLACE";
          break;
        case 1: 
          localObject = "ADD";
          break;
        case 0: 
          localObject = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.print((String)localObject);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(mFragment);
        if (paramBoolean)
        {
          if ((mEnterAnim != 0) || (mExitAnim != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(mEnterAnim));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(mExitAnim));
          }
          if ((mPopEnterAnim != 0) || (mPopExitAnim != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(mPopEnterAnim));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(mPopExitAnim));
          }
        }
      }
    }
  }
  
  public void executeOps()
  {
    int i = mOps.size();
    Object localObject1;
    for (int j = 0; j < i; j++)
    {
      localObject1 = (FragmentTransaction.Op)mOps.get(j);
      Object localObject2 = mFragment;
      if (localObject2 != null)
      {
        ((Fragment)localObject2).setPopDirection(false);
        ((Fragment)localObject2).setNextTransition(mTransition);
        ((Fragment)localObject2).setSharedElementNames(mSharedElementSourceNames, mSharedElementTargetNames);
      }
      switch (mCmd)
      {
      case 2: 
      default: 
        localObject2 = z2.t("Unknown cmd: ");
        ((StringBuilder)localObject2).append(mCmd);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 10: 
        mManager.setMaxLifecycle((Fragment)localObject2, mCurrentMaxState);
        break;
      case 9: 
        mManager.setPrimaryNavigationFragment(null);
        break;
      case 8: 
        mManager.setPrimaryNavigationFragment((Fragment)localObject2);
        break;
      case 7: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, false);
        mManager.attachFragment((Fragment)localObject2);
        break;
      case 6: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.detachFragment((Fragment)localObject2);
        break;
      case 5: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, false);
        mManager.showFragment((Fragment)localObject2);
        break;
      case 4: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.hideFragment((Fragment)localObject2);
        break;
      case 3: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.removeFragment((Fragment)localObject2);
        break;
      case 1: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, false);
        mManager.addFragment((Fragment)localObject2);
      }
      if ((!mReorderingAllowed) && (mCmd != 1) && (localObject2 != null) && (!FragmentManager.USE_STATE_MANAGER)) {
        mManager.moveFragmentToExpectedState((Fragment)localObject2);
      }
    }
    if ((!mReorderingAllowed) && (!FragmentManager.USE_STATE_MANAGER))
    {
      localObject1 = mManager;
      ((FragmentManager)localObject1).moveToState(mCurState, true);
    }
  }
  
  public void executePopOps(boolean paramBoolean)
  {
    Object localObject1;
    for (int i = mOps.size() - 1; i >= 0; i--)
    {
      localObject1 = (FragmentTransaction.Op)mOps.get(i);
      Object localObject2 = mFragment;
      if (localObject2 != null)
      {
        ((Fragment)localObject2).setPopDirection(true);
        ((Fragment)localObject2).setNextTransition(FragmentManager.reverseTransit(mTransition));
        ((Fragment)localObject2).setSharedElementNames(mSharedElementTargetNames, mSharedElementSourceNames);
      }
      switch (mCmd)
      {
      case 2: 
      default: 
        localObject2 = z2.t("Unknown cmd: ");
        ((StringBuilder)localObject2).append(mCmd);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 10: 
        mManager.setMaxLifecycle((Fragment)localObject2, mOldMaxState);
        break;
      case 9: 
        mManager.setPrimaryNavigationFragment((Fragment)localObject2);
        break;
      case 8: 
        mManager.setPrimaryNavigationFragment(null);
        break;
      case 7: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, true);
        mManager.detachFragment((Fragment)localObject2);
        break;
      case 6: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.attachFragment((Fragment)localObject2);
        break;
      case 5: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, true);
        mManager.hideFragment((Fragment)localObject2);
        break;
      case 4: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.showFragment((Fragment)localObject2);
        break;
      case 3: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.addFragment((Fragment)localObject2);
        break;
      case 1: 
        ((Fragment)localObject2).setAnimations(mEnterAnim, mExitAnim, mPopEnterAnim, mPopExitAnim);
        mManager.setExitAnimationOrder((Fragment)localObject2, true);
        mManager.removeFragment((Fragment)localObject2);
      }
      if ((!mReorderingAllowed) && (mCmd != 3) && (localObject2 != null) && (!FragmentManager.USE_STATE_MANAGER)) {
        mManager.moveFragmentToExpectedState((Fragment)localObject2);
      }
    }
    if ((!mReorderingAllowed) && (paramBoolean) && (!FragmentManager.USE_STATE_MANAGER))
    {
      localObject1 = mManager;
      ((FragmentManager)localObject1).moveToState(mCurState, true);
    }
  }
  
  public Fragment expandOps(ArrayList<Fragment> paramArrayList, Fragment paramFragment)
  {
    int i = 0;
    for (Fragment localFragment1 = paramFragment; i < mOps.size(); localFragment1 = paramFragment)
    {
      FragmentTransaction.Op localOp = (FragmentTransaction.Op)mOps.get(i);
      int j = mCmd;
      if (j != 1)
      {
        Fragment localFragment2;
        if (j != 2)
        {
          if ((j != 3) && (j != 6))
          {
            if (j != 7)
            {
              if (j != 8)
              {
                paramFragment = localFragment1;
                j = i;
                break label442;
              }
              mOps.add(i, new FragmentTransaction.Op(9, localFragment1));
              j = i + 1;
              paramFragment = mFragment;
              break label442;
            }
          }
          else
          {
            paramArrayList.remove(mFragment);
            localFragment2 = mFragment;
            paramFragment = localFragment1;
            j = i;
            if (localFragment2 != localFragment1) {
              break label442;
            }
            mOps.add(i, new FragmentTransaction.Op(9, localFragment2));
            j = i + 1;
            paramFragment = null;
            break label442;
          }
        }
        else
        {
          localFragment2 = mFragment;
          int k = mContainerId;
          int m = paramArrayList.size() - 1;
          int n = 0;
          j = i;
          paramFragment = localFragment1;
          while (m >= 0)
          {
            Fragment localFragment3 = (Fragment)paramArrayList.get(m);
            localFragment1 = paramFragment;
            int i1 = j;
            i = n;
            if (mContainerId == k) {
              if (localFragment3 == localFragment2)
              {
                i = 1;
                localFragment1 = paramFragment;
                i1 = j;
              }
              else
              {
                localFragment1 = paramFragment;
                i = j;
                if (localFragment3 == paramFragment)
                {
                  mOps.add(j, new FragmentTransaction.Op(9, localFragment3));
                  i = j + 1;
                  localFragment1 = null;
                }
                paramFragment = new FragmentTransaction.Op(3, localFragment3);
                mEnterAnim = mEnterAnim;
                mPopEnterAnim = mPopEnterAnim;
                mExitAnim = mExitAnim;
                mPopExitAnim = mPopExitAnim;
                mOps.add(i, paramFragment);
                paramArrayList.remove(localFragment3);
                i1 = i + 1;
                i = n;
              }
            }
            m--;
            paramFragment = localFragment1;
            j = i1;
            n = i;
          }
          if (n != 0)
          {
            mOps.remove(j);
            j--;
            break label442;
          }
          mCmd = 1;
          paramArrayList.add(localFragment2);
          break label442;
        }
      }
      paramArrayList.add(mFragment);
      j = i;
      paramFragment = localFragment1;
      label442:
      i = j + 1;
    }
    return localFragment1;
  }
  
  public boolean generateOps(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Run: ");
      localStringBuilder.append(this);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.FALSE);
    if (mAddToBackStack) {
      mManager.addBackStackState(this);
    }
    return true;
  }
  
  @Nullable
  public CharSequence getBreadCrumbShortTitle()
  {
    if (mBreadCrumbShortTitleRes != 0) {
      return mManager.getHost().getContext().getText(mBreadCrumbShortTitleRes);
    }
    return mBreadCrumbShortTitleText;
  }
  
  public int getBreadCrumbShortTitleRes()
  {
    return mBreadCrumbShortTitleRes;
  }
  
  @Nullable
  public CharSequence getBreadCrumbTitle()
  {
    if (mBreadCrumbTitleRes != 0) {
      return mManager.getHost().getContext().getText(mBreadCrumbTitleRes);
    }
    return mBreadCrumbTitleText;
  }
  
  public int getBreadCrumbTitleRes()
  {
    return mBreadCrumbTitleRes;
  }
  
  public int getId()
  {
    return mIndex;
  }
  
  @Nullable
  public String getName()
  {
    return mName;
  }
  
  @NonNull
  public FragmentTransaction hide(@NonNull Fragment paramFragment)
  {
    Object localObject = mFragmentManager;
    if ((localObject != null) && (localObject != mManager))
    {
      localObject = z2.t("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
      ((StringBuilder)localObject).append(paramFragment.toString());
      ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return super.hide(paramFragment);
  }
  
  public boolean interactsWith(int paramInt)
  {
    int i = mOps.size();
    for (int j = 0; j < i; j++)
    {
      Fragment localFragment = mOps.get(j)).mFragment;
      int k;
      if (localFragment != null) {
        k = mContainerId;
      } else {
        k = 0;
      }
      if ((k != 0) && (k == paramInt)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean interactsWith(ArrayList<BackStackRecord> paramArrayList, int paramInt1, int paramInt2)
  {
    if (paramInt2 == paramInt1) {
      return false;
    }
    int i = mOps.size();
    int j = -1;
    int k = 0;
    while (k < i)
    {
      Object localObject = mOps.get(k)).mFragment;
      int m;
      if (localObject != null) {
        m = mContainerId;
      } else {
        m = 0;
      }
      int n = j;
      if (m != 0)
      {
        n = j;
        if (m != j)
        {
          for (j = paramInt1; j < paramInt2; j++)
          {
            localObject = (BackStackRecord)paramArrayList.get(j);
            int i1 = mOps.size();
            for (n = 0; n < i1; n++)
            {
              Fragment localFragment = mOps.get(n)).mFragment;
              int i2;
              if (localFragment != null) {
                i2 = mContainerId;
              } else {
                i2 = 0;
              }
              if (i2 == m) {
                return true;
              }
            }
          }
          n = m;
        }
      }
      k++;
      j = n;
    }
    return false;
  }
  
  public boolean isEmpty()
  {
    return mOps.isEmpty();
  }
  
  public boolean isPostponed()
  {
    for (int i = 0; i < mOps.size(); i++) {
      if (isFragmentPostponed((FragmentTransaction.Op)mOps.get(i))) {
        return true;
      }
    }
    return false;
  }
  
  @NonNull
  public FragmentTransaction remove(@NonNull Fragment paramFragment)
  {
    Object localObject = mFragmentManager;
    if ((localObject != null) && (localObject != mManager))
    {
      localObject = z2.t("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
      ((StringBuilder)localObject).append(paramFragment.toString());
      ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return super.remove(paramFragment);
  }
  
  public void runOnCommitRunnables()
  {
    if (mCommitRunnables != null)
    {
      for (int i = 0; i < mCommitRunnables.size(); i++) {
        ((Runnable)mCommitRunnables.get(i)).run();
      }
      mCommitRunnables = null;
    }
  }
  
  @NonNull
  public FragmentTransaction setMaxLifecycle(@NonNull Fragment paramFragment, @NonNull Lifecycle.State paramState)
  {
    if (mFragmentManager == mManager)
    {
      if ((paramState == Lifecycle.State.INITIALIZED) && (mState > -1))
      {
        paramFragment = new StringBuilder();
        paramFragment.append("Cannot set maximum Lifecycle to ");
        paramFragment.append(paramState);
        paramFragment.append(" after the Fragment has been created");
        throw new IllegalArgumentException(paramFragment.toString());
      }
      if (paramState != Lifecycle.State.DESTROYED) {
        return super.setMaxLifecycle(paramFragment, paramState);
      }
      paramFragment = new StringBuilder();
      paramFragment.append("Cannot set maximum Lifecycle to ");
      paramFragment.append(paramState);
      paramFragment.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
      throw new IllegalArgumentException(paramFragment.toString());
    }
    paramFragment = z2.t("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
    paramFragment.append(mManager);
    throw new IllegalArgumentException(paramFragment.toString());
  }
  
  public void setOnStartPostponedListener(Fragment.OnStartEnterTransitionListener paramOnStartEnterTransitionListener)
  {
    for (int i = 0; i < mOps.size(); i++)
    {
      FragmentTransaction.Op localOp = (FragmentTransaction.Op)mOps.get(i);
      if (isFragmentPostponed(localOp)) {
        mFragment.setOnStartEnterTransitionListener(paramOnStartEnterTransitionListener);
      }
    }
  }
  
  @NonNull
  public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      Object localObject = mFragmentManager;
      if ((localObject != null) && (localObject != mManager))
      {
        localObject = z2.t("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        ((StringBuilder)localObject).append(paramFragment.toString());
        ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    return super.setPrimaryNavigationFragment(paramFragment);
  }
  
  @NonNull
  public FragmentTransaction show(@NonNull Fragment paramFragment)
  {
    Object localObject = mFragmentManager;
    if ((localObject != null) && (localObject != mManager))
    {
      localObject = z2.t("Cannot show Fragment attached to a different FragmentManager. Fragment ");
      ((StringBuilder)localObject).append(paramFragment.toString());
      ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return super.show(paramFragment);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(mIndex);
    }
    if (mName != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(mName);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public Fragment trackAddedFragmentsInPop(ArrayList<Fragment> paramArrayList, Fragment paramFragment)
  {
    for (int i = mOps.size() - 1; i >= 0; i--)
    {
      FragmentTransaction.Op localOp = (FragmentTransaction.Op)mOps.get(i);
      int j = mCmd;
      if (j != 1)
      {
        if (j != 3) {}
        switch (j)
        {
        default: 
          break;
        case 10: 
          mCurrentMaxState = mOldMaxState;
          break;
        case 9: 
          paramFragment = mFragment;
          break;
        case 8: 
          paramFragment = null;
          break;
        case 6: 
          paramArrayList.add(mFragment);
          break;
        }
      }
      else
      {
        paramArrayList.remove(mFragment);
      }
    }
    return paramFragment;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.BackStackRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */