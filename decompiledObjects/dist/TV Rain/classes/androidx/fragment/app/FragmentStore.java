package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import z2;

class FragmentStore
{
  private static final String TAG = "FragmentManager";
  private final HashMap<String, FragmentStateManager> mActive = new HashMap();
  private final ArrayList<Fragment> mAdded = new ArrayList();
  private FragmentManagerViewModel mNonConfig;
  
  public void addFragment(@NonNull Fragment paramFragment)
  {
    if (!mAdded.contains(paramFragment)) {
      synchronized (mAdded)
      {
        mAdded.add(paramFragment);
        mAdded = true;
        return;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Fragment already added: ");
    ((StringBuilder)???).append(paramFragment);
    throw new IllegalStateException(((StringBuilder)???).toString());
  }
  
  public void burpActive()
  {
    mActive.values().removeAll(Collections.singleton(null));
  }
  
  public boolean containsActiveFragment(@NonNull String paramString)
  {
    boolean bool;
    if (mActive.get(paramString) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void dispatchStateChange(int paramInt)
  {
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      if (localFragmentStateManager != null) {
        localFragmentStateManager.setFragmentManagerState(paramInt);
      }
    }
  }
  
  public void dump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
  {
    String str = z2.o(paramString, "    ");
    if (!mActive.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      Iterator localIterator = mActive.values().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (FragmentStateManager)localIterator.next();
        paramPrintWriter.print(paramString);
        if (localObject != null)
        {
          localObject = ((FragmentStateManager)localObject).getFragment();
          paramPrintWriter.println(localObject);
          ((Fragment)localObject).dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
        else
        {
          paramPrintWriter.println("null");
        }
      }
    }
    int i = mAdded.size();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (int j = 0; j < i; j++)
      {
        paramFileDescriptor = (Fragment)mAdded.get(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(paramFileDescriptor.toString());
      }
    }
  }
  
  @Nullable
  public Fragment findActiveFragment(@NonNull String paramString)
  {
    paramString = (FragmentStateManager)mActive.get(paramString);
    if (paramString != null) {
      return paramString.getFragment();
    }
    return null;
  }
  
  @Nullable
  public Fragment findFragmentById(@IdRes int paramInt)
  {
    for (int i = mAdded.size() - 1; i >= 0; i--)
    {
      localObject1 = (Fragment)mAdded.get(i);
      if ((localObject1 != null) && (mFragmentId == paramInt)) {
        return (Fragment)localObject1;
      }
    }
    Object localObject1 = mActive.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (FragmentStateManager)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        localObject2 = ((FragmentStateManager)localObject2).getFragment();
        if (mFragmentId == paramInt) {
          return (Fragment)localObject2;
        }
      }
    }
    return null;
  }
  
  @Nullable
  public Fragment findFragmentByTag(@Nullable String paramString)
  {
    Object localObject1;
    if (paramString != null) {
      for (int i = mAdded.size() - 1; i >= 0; i--)
      {
        localObject1 = (Fragment)mAdded.get(i);
        if ((localObject1 != null) && (paramString.equals(mTag))) {
          return (Fragment)localObject1;
        }
      }
    }
    if (paramString != null)
    {
      localObject1 = mActive.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (FragmentStateManager)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((FragmentStateManager)localObject2).getFragment();
          if (paramString.equals(mTag)) {
            return (Fragment)localObject2;
          }
        }
      }
    }
    return null;
  }
  
  @Nullable
  public Fragment findFragmentByWho(@NonNull String paramString)
  {
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (FragmentStateManager)localIterator.next();
      if (localObject != null)
      {
        localObject = ((FragmentStateManager)localObject).getFragment().findFragmentByWho(paramString);
        if (localObject != null) {
          return (Fragment)localObject;
        }
      }
    }
    return null;
  }
  
  public int findFragmentIndexInContainer(@NonNull Fragment paramFragment)
  {
    ViewGroup localViewGroup = mContainer;
    if (localViewGroup == null) {
      return -1;
    }
    int i = mAdded.indexOf(paramFragment);
    int k;
    for (int j = i - 1;; j--)
    {
      k = i;
      if (j < 0) {
        break;
      }
      paramFragment = (Fragment)mAdded.get(j);
      if (mContainer == localViewGroup)
      {
        paramFragment = mView;
        if (paramFragment != null) {
          return localViewGroup.indexOfChild(paramFragment) + 1;
        }
      }
    }
    for (;;)
    {
      k++;
      if (k >= mAdded.size()) {
        break;
      }
      paramFragment = (Fragment)mAdded.get(k);
      if (mContainer == localViewGroup)
      {
        paramFragment = mView;
        if (paramFragment != null) {
          return localViewGroup.indexOfChild(paramFragment);
        }
      }
    }
    return -1;
  }
  
  public int getActiveFragmentCount()
  {
    return mActive.size();
  }
  
  @NonNull
  public List<FragmentStateManager> getActiveFragmentStateManagers()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      if (localFragmentStateManager != null) {
        localArrayList.add(localFragmentStateManager);
      }
    }
    return localArrayList;
  }
  
  @NonNull
  public List<Fragment> getActiveFragments()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      if (localFragmentStateManager != null) {
        localArrayList.add(localFragmentStateManager.getFragment());
      } else {
        localArrayList.add(null);
      }
    }
    return localArrayList;
  }
  
  @Nullable
  public FragmentStateManager getFragmentStateManager(@NonNull String paramString)
  {
    return (FragmentStateManager)mActive.get(paramString);
  }
  
  @NonNull
  public List<Fragment> getFragments()
  {
    if (mAdded.isEmpty()) {
      return Collections.emptyList();
    }
    synchronized (mAdded)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(mAdded);
      return localArrayList2;
    }
  }
  
  public FragmentManagerViewModel getNonConfig()
  {
    return mNonConfig;
  }
  
  public void makeActive(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    Fragment localFragment = paramFragmentStateManager.getFragment();
    if (containsActiveFragment(mWho)) {
      return;
    }
    mActive.put(mWho, paramFragmentStateManager);
    if (mRetainInstanceChangedWhileDetached)
    {
      if (mRetainInstance) {
        mNonConfig.addRetainedFragment(localFragment);
      } else {
        mNonConfig.removeRetainedFragment(localFragment);
      }
      mRetainInstanceChangedWhileDetached = false;
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      paramFragmentStateManager = new StringBuilder();
      paramFragmentStateManager.append("Added fragment to active set ");
      paramFragmentStateManager.append(localFragment);
      Log.v("FragmentManager", paramFragmentStateManager.toString());
    }
  }
  
  public void makeInactive(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    paramFragmentStateManager = paramFragmentStateManager.getFragment();
    if (mRetainInstance) {
      mNonConfig.removeRetainedFragment(paramFragmentStateManager);
    }
    if ((FragmentStateManager)mActive.put(mWho, null) == null) {
      return;
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Removed fragment from active set ");
      localStringBuilder.append(paramFragmentStateManager);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public void moveToExpectedState()
  {
    Object localObject1 = mAdded.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Fragment)((Iterator)localObject1).next();
      localObject2 = (FragmentStateManager)mActive.get(mWho);
      if (localObject2 != null) {
        ((FragmentStateManager)localObject2).moveToExpectedState();
      }
    }
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (FragmentStateManager)localIterator.next();
      if (localObject2 != null)
      {
        ((FragmentStateManager)localObject2).moveToExpectedState();
        localObject1 = ((FragmentStateManager)localObject2).getFragment();
        int i;
        if ((mRemoving) && (!((Fragment)localObject1).isInBackStack())) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          makeInactive((FragmentStateManager)localObject2);
        }
      }
    }
  }
  
  public void removeFragment(@NonNull Fragment paramFragment)
  {
    synchronized (mAdded)
    {
      mAdded.remove(paramFragment);
      mAdded = false;
      return;
    }
  }
  
  public void resetActiveFragments()
  {
    mActive.clear();
  }
  
  public void restoreAddedFragments(@Nullable List<String> paramList)
  {
    mAdded.clear();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramList = findActiveFragment(str);
        if (paramList != null)
        {
          if (FragmentManager.isLoggingEnabled(2))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("restoreSaveState: added (");
            localStringBuilder.append(str);
            localStringBuilder.append("): ");
            localStringBuilder.append(paramList);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          addFragment(paramList);
        }
        else
        {
          throw new IllegalStateException(z2.p("No instantiated fragment for (", str, ")"));
        }
      }
    }
  }
  
  @NonNull
  public ArrayList<FragmentState> saveActiveFragments()
  {
    ArrayList localArrayList = new ArrayList(mActive.size());
    Iterator localIterator = mActive.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (FragmentStateManager)localIterator.next();
      if (localObject != null)
      {
        Fragment localFragment = ((FragmentStateManager)localObject).getFragment();
        localObject = ((FragmentStateManager)localObject).saveState();
        localArrayList.add(localObject);
        if (FragmentManager.isLoggingEnabled(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Saved state of ");
          localStringBuilder.append(localFragment);
          localStringBuilder.append(": ");
          localStringBuilder.append(mSavedFragmentState);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
    }
    return localArrayList;
  }
  
  @Nullable
  public ArrayList<String> saveAddedFragments()
  {
    synchronized (mAdded)
    {
      if (mAdded.isEmpty()) {
        return null;
      }
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(mAdded.size());
      Iterator localIterator = mAdded.iterator();
      while (localIterator.hasNext())
      {
        Fragment localFragment = (Fragment)localIterator.next();
        localArrayList2.add(mWho);
        if (FragmentManager.isLoggingEnabled(2))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("saveAllState: adding fragment (");
          localStringBuilder.append(mWho);
          localStringBuilder.append("): ");
          localStringBuilder.append(localFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
      return localArrayList2;
    }
  }
  
  public void setNonConfig(@NonNull FragmentManagerViewModel paramFragmentManagerViewModel)
  {
    mNonConfig = paramFragmentManagerViewModel;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */