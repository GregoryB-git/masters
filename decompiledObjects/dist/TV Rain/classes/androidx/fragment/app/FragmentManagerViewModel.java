package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class FragmentManagerViewModel
  extends ViewModel
{
  private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory()
  {
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> paramAnonymousClass)
    {
      return new FragmentManagerViewModel(true);
    }
  };
  private static final String TAG = "FragmentManager";
  private final HashMap<String, FragmentManagerViewModel> mChildNonConfigs = new HashMap();
  private boolean mHasBeenCleared = false;
  private boolean mHasSavedSnapshot = false;
  private boolean mIsStateSaved = false;
  private final HashMap<String, Fragment> mRetainedFragments = new HashMap();
  private final boolean mStateAutomaticallySaved;
  private final HashMap<String, ViewModelStore> mViewModelStores = new HashMap();
  
  public FragmentManagerViewModel(boolean paramBoolean)
  {
    mStateAutomaticallySaved = paramBoolean;
  }
  
  @NonNull
  public static FragmentManagerViewModel getInstance(ViewModelStore paramViewModelStore)
  {
    return (FragmentManagerViewModel)new ViewModelProvider(paramViewModelStore, FACTORY).get(FragmentManagerViewModel.class);
  }
  
  public void addRetainedFragment(@NonNull Fragment paramFragment)
  {
    if (mIsStateSaved)
    {
      if (FragmentManager.isLoggingEnabled(2)) {
        Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
      }
      return;
    }
    if (mRetainedFragments.containsKey(mWho)) {
      return;
    }
    mRetainedFragments.put(mWho, paramFragment);
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Added ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public void clearNonConfigState(@NonNull Fragment paramFragment)
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Clearing non-config state for ");
      ((StringBuilder)localObject).append(paramFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = (FragmentManagerViewModel)mChildNonConfigs.get(mWho);
    if (localObject != null)
    {
      ((FragmentManagerViewModel)localObject).onCleared();
      mChildNonConfigs.remove(mWho);
    }
    localObject = (ViewModelStore)mViewModelStores.get(mWho);
    if (localObject != null)
    {
      ((ViewModelStore)localObject).clear();
      mViewModelStores.remove(mWho);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (FragmentManagerViewModel.class == paramObject.getClass()))
    {
      paramObject = (FragmentManagerViewModel)paramObject;
      if ((!mRetainedFragments.equals(mRetainedFragments)) || (!mChildNonConfigs.equals(mChildNonConfigs)) || (!mViewModelStores.equals(mViewModelStores))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  @Nullable
  public Fragment findRetainedFragmentByWho(String paramString)
  {
    return (Fragment)mRetainedFragments.get(paramString);
  }
  
  @NonNull
  public FragmentManagerViewModel getChildNonConfig(@NonNull Fragment paramFragment)
  {
    FragmentManagerViewModel localFragmentManagerViewModel1 = (FragmentManagerViewModel)mChildNonConfigs.get(mWho);
    FragmentManagerViewModel localFragmentManagerViewModel2 = localFragmentManagerViewModel1;
    if (localFragmentManagerViewModel1 == null)
    {
      localFragmentManagerViewModel2 = new FragmentManagerViewModel(mStateAutomaticallySaved);
      mChildNonConfigs.put(mWho, localFragmentManagerViewModel2);
    }
    return localFragmentManagerViewModel2;
  }
  
  @NonNull
  public Collection<Fragment> getRetainedFragments()
  {
    return new ArrayList(mRetainedFragments.values());
  }
  
  @Deprecated
  @Nullable
  public FragmentManagerNonConfig getSnapshot()
  {
    if ((mRetainedFragments.isEmpty()) && (mChildNonConfigs.isEmpty()) && (mViewModelStores.isEmpty())) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = mChildNonConfigs.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      FragmentManagerNonConfig localFragmentManagerNonConfig = ((FragmentManagerViewModel)localEntry.getValue()).getSnapshot();
      if (localFragmentManagerNonConfig != null) {
        localHashMap.put(localEntry.getKey(), localFragmentManagerNonConfig);
      }
    }
    mHasSavedSnapshot = true;
    if ((mRetainedFragments.isEmpty()) && (localHashMap.isEmpty()) && (mViewModelStores.isEmpty())) {
      return null;
    }
    return new FragmentManagerNonConfig(new ArrayList(mRetainedFragments.values()), localHashMap, new HashMap(mViewModelStores));
  }
  
  @NonNull
  public ViewModelStore getViewModelStore(@NonNull Fragment paramFragment)
  {
    ViewModelStore localViewModelStore1 = (ViewModelStore)mViewModelStores.get(mWho);
    ViewModelStore localViewModelStore2 = localViewModelStore1;
    if (localViewModelStore1 == null)
    {
      localViewModelStore2 = new ViewModelStore();
      mViewModelStores.put(mWho, localViewModelStore2);
    }
    return localViewModelStore2;
  }
  
  public int hashCode()
  {
    int i = mRetainedFragments.hashCode();
    int j = mChildNonConfigs.hashCode();
    return mViewModelStores.hashCode() + (j + i * 31) * 31;
  }
  
  public boolean isCleared()
  {
    return mHasBeenCleared;
  }
  
  public void onCleared()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onCleared called for ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    mHasBeenCleared = true;
  }
  
  public void removeRetainedFragment(@NonNull Fragment paramFragment)
  {
    if (mIsStateSaved)
    {
      if (FragmentManager.isLoggingEnabled(2)) {
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
      }
      return;
    }
    int i;
    if (mRetainedFragments.remove(mWho) != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (FragmentManager.isLoggingEnabled(2)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Removed ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  @Deprecated
  public void restoreFromSnapshot(@Nullable FragmentManagerNonConfig paramFragmentManagerNonConfig)
  {
    mRetainedFragments.clear();
    mChildNonConfigs.clear();
    mViewModelStores.clear();
    if (paramFragmentManagerNonConfig != null)
    {
      Object localObject = paramFragmentManagerNonConfig.getFragments();
      Iterator localIterator;
      if (localObject != null)
      {
        localIterator = ((Collection)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (Fragment)localIterator.next();
          if (localObject != null) {
            mRetainedFragments.put(mWho, localObject);
          }
        }
      }
      localObject = paramFragmentManagerNonConfig.getChildNonConfigs();
      if (localObject != null)
      {
        localIterator = ((Map)localObject).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          FragmentManagerViewModel localFragmentManagerViewModel = new FragmentManagerViewModel(mStateAutomaticallySaved);
          localFragmentManagerViewModel.restoreFromSnapshot((FragmentManagerNonConfig)((Map.Entry)localObject).getValue());
          mChildNonConfigs.put(((Map.Entry)localObject).getKey(), localFragmentManagerViewModel);
        }
      }
      paramFragmentManagerNonConfig = paramFragmentManagerNonConfig.getViewModelStores();
      if (paramFragmentManagerNonConfig != null) {
        mViewModelStores.putAll(paramFragmentManagerNonConfig);
      }
    }
    mHasSavedSnapshot = false;
  }
  
  public void setIsStateSaved(boolean paramBoolean)
  {
    mIsStateSaved = paramBoolean;
  }
  
  public boolean shouldDestroy(@NonNull Fragment paramFragment)
  {
    if (!mRetainedFragments.containsKey(mWho)) {
      return true;
    }
    if (mStateAutomaticallySaved) {
      return mHasBeenCleared;
    }
    return mHasSavedSnapshot ^ true;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("FragmentManagerViewModel{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("} Fragments (");
    Iterator localIterator = mRetainedFragments.values().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") Child Non Config (");
    localIterator = mChildNonConfigs.keySet().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") ViewModelStores (");
    localIterator = mViewModelStores.keySet().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManagerViewModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */