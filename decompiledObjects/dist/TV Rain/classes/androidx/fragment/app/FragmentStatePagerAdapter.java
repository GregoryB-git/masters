package androidx.fragment.app;

import a;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import z2;

@Deprecated
public abstract class FragmentStatePagerAdapter
  extends PagerAdapter
{
  public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
  @Deprecated
  public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
  private static final boolean DEBUG = false;
  private static final String TAG = "FragmentStatePagerAdapt";
  private final int mBehavior;
  private FragmentTransaction mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private boolean mExecutingFinishUpdate;
  private final FragmentManager mFragmentManager;
  private ArrayList<Fragment> mFragments = new ArrayList();
  private ArrayList<Fragment.SavedState> mSavedState = new ArrayList();
  
  @Deprecated
  public FragmentStatePagerAdapter(@NonNull FragmentManager paramFragmentManager)
  {
    this(paramFragmentManager, 0);
  }
  
  public FragmentStatePagerAdapter(@NonNull FragmentManager paramFragmentManager, int paramInt)
  {
    mFragmentManager = paramFragmentManager;
    mBehavior = paramInt;
  }
  
  public void destroyItem(@NonNull ViewGroup paramViewGroup, int paramInt, @NonNull Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (mCurTransaction == null) {
      mCurTransaction = mFragmentManager.beginTransaction();
    }
    while (mSavedState.size() <= paramInt) {
      mSavedState.add(null);
    }
    ArrayList localArrayList = mSavedState;
    if (((Fragment)paramObject).isAdded()) {
      paramViewGroup = mFragmentManager.saveFragmentInstanceState((Fragment)paramObject);
    } else {
      paramViewGroup = null;
    }
    localArrayList.set(paramInt, paramViewGroup);
    mFragments.set(paramInt, null);
    mCurTransaction.remove((Fragment)paramObject);
    if (((Fragment)paramObject).equals(mCurrentPrimaryItem)) {
      mCurrentPrimaryItem = null;
    }
  }
  
  public void finishUpdate(@NonNull ViewGroup paramViewGroup)
  {
    paramViewGroup = mCurTransaction;
    if (paramViewGroup != null)
    {
      if (!mExecutingFinishUpdate) {}
      try
      {
        mExecutingFinishUpdate = true;
        paramViewGroup.commitNowAllowingStateLoss();
        mExecutingFinishUpdate = false;
      }
      finally
      {
        mExecutingFinishUpdate = false;
      }
    }
  }
  
  @NonNull
  public abstract Fragment getItem(int paramInt);
  
  @NonNull
  public Object instantiateItem(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    if (mFragments.size() > paramInt)
    {
      localFragment = (Fragment)mFragments.get(paramInt);
      if (localFragment != null) {
        return localFragment;
      }
    }
    if (mCurTransaction == null) {
      mCurTransaction = mFragmentManager.beginTransaction();
    }
    Fragment localFragment = getItem(paramInt);
    if (mSavedState.size() > paramInt)
    {
      Fragment.SavedState localSavedState = (Fragment.SavedState)mSavedState.get(paramInt);
      if (localSavedState != null) {
        localFragment.setInitialSavedState(localSavedState);
      }
    }
    while (mFragments.size() <= paramInt) {
      mFragments.add(null);
    }
    localFragment.setMenuVisibility(false);
    if (mBehavior == 0) {
      localFragment.setUserVisibleHint(false);
    }
    mFragments.set(paramInt, localFragment);
    mCurTransaction.add(paramViewGroup.getId(), localFragment);
    if (mBehavior == 1) {
      mCurTransaction.setMaxLifecycle(localFragment, Lifecycle.State.STARTED);
    }
    return localFragment;
  }
  
  public boolean isViewFromObject(@NonNull View paramView, @NonNull Object paramObject)
  {
    boolean bool;
    if (((Fragment)paramObject).getView() == paramView) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void restoreState(@Nullable Parcelable paramParcelable, @Nullable ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      paramParcelable = (Bundle)paramParcelable;
      paramParcelable.setClassLoader(paramClassLoader);
      paramClassLoader = paramParcelable.getParcelableArray("states");
      mSavedState.clear();
      mFragments.clear();
      int i;
      if (paramClassLoader != null) {
        for (i = 0; i < paramClassLoader.length; i++) {
          mSavedState.add((Fragment.SavedState)paramClassLoader[i]);
        }
      }
      paramClassLoader = paramParcelable.keySet().iterator();
      while (paramClassLoader.hasNext())
      {
        String str = (String)paramClassLoader.next();
        if (str.startsWith("f"))
        {
          i = Integer.parseInt(str.substring(1));
          Fragment localFragment = mFragmentManager.getFragment(paramParcelable, str);
          if (localFragment != null)
          {
            while (mFragments.size() <= i) {
              mFragments.add(null);
            }
            localFragment.setMenuVisibility(false);
            mFragments.set(i, localFragment);
          }
          else
          {
            z2.A("Bad fragment at key ", str, "FragmentStatePagerAdapt");
          }
        }
      }
    }
  }
  
  @Nullable
  public Parcelable saveState()
  {
    Object localObject1;
    Object localObject2;
    if (mSavedState.size() > 0)
    {
      localObject1 = new Bundle();
      localObject2 = new Fragment.SavedState[mSavedState.size()];
      mSavedState.toArray((Object[])localObject2);
      ((Bundle)localObject1).putParcelableArray("states", (Parcelable[])localObject2);
    }
    else
    {
      localObject1 = null;
    }
    int i = 0;
    while (i < mFragments.size())
    {
      Fragment localFragment = (Fragment)mFragments.get(i);
      localObject2 = localObject1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        if (localFragment.isAdded())
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Bundle();
          }
          localObject1 = a.f("f", i);
          mFragmentManager.putFragment((Bundle)localObject2, (String)localObject1, localFragment);
        }
      }
      i++;
      localObject1 = localObject2;
    }
    return (Parcelable)localObject1;
  }
  
  public void setPrimaryItem(@NonNull ViewGroup paramViewGroup, int paramInt, @NonNull Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    paramViewGroup = mCurrentPrimaryItem;
    if (paramObject != paramViewGroup)
    {
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(false);
        if (mBehavior == 1)
        {
          if (mCurTransaction == null) {
            mCurTransaction = mFragmentManager.beginTransaction();
          }
          mCurTransaction.setMaxLifecycle(mCurrentPrimaryItem, Lifecycle.State.STARTED);
        }
        else
        {
          mCurrentPrimaryItem.setUserVisibleHint(false);
        }
      }
      ((Fragment)paramObject).setMenuVisibility(true);
      if (mBehavior == 1)
      {
        if (mCurTransaction == null) {
          mCurTransaction = mFragmentManager.beginTransaction();
        }
        mCurTransaction.setMaxLifecycle((Fragment)paramObject, Lifecycle.State.RESUMED);
      }
      else
      {
        ((Fragment)paramObject).setUserVisibleHint(true);
      }
      mCurrentPrimaryItem = ((Fragment)paramObject);
    }
  }
  
  public void startUpdate(@NonNull ViewGroup paramViewGroup)
  {
    if (paramViewGroup.getId() != -1) {
      return;
    }
    paramViewGroup = new StringBuilder();
    paramViewGroup.append("ViewPager with adapter ");
    paramViewGroup.append(this);
    paramViewGroup.append(" requires a view id");
    throw new IllegalStateException(paramViewGroup.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentStatePagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */