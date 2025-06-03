package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class FragmentLifecycleCallbacksDispatcher
{
  @NonNull
  private final FragmentManager mFragmentManager;
  @NonNull
  private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> mLifecycleCallbacks = new CopyOnWriteArrayList();
  
  public FragmentLifecycleCallbacksDispatcher(@NonNull FragmentManager paramFragmentManager)
  {
    mFragmentManager = paramFragmentManager;
  }
  
  public void dispatchOnFragmentActivityCreated(@NonNull Fragment paramFragment, @Nullable Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(paramFragment, paramBundle, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentActivityCreated(mFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void dispatchOnFragmentAttached(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = mFragmentManager.getHost().getContext();
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentAttached(mFragmentManager, paramFragment, localContext);
      }
    }
  }
  
  public void dispatchOnFragmentCreated(@NonNull Fragment paramFragment, @Nullable Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(paramFragment, paramBundle, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentCreated(mFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void dispatchOnFragmentDestroyed(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentDestroyed(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentDetached(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(paramFragment, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentDetached(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentPaused(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(paramFragment, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentPaused(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentPreAttached(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = mFragmentManager.getHost().getContext();
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentPreAttached(mFragmentManager, paramFragment, localContext);
      }
    }
  }
  
  public void dispatchOnFragmentPreCreated(@NonNull Fragment paramFragment, @Nullable Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(paramFragment, paramBundle, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentPreCreated(mFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void dispatchOnFragmentResumed(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentResumed(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentSaveInstanceState(@NonNull Fragment paramFragment, @NonNull Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(paramFragment, paramBundle, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentSaveInstanceState(mFragmentManager, paramFragment, paramBundle);
      }
    }
  }
  
  public void dispatchOnFragmentStarted(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(paramFragment, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentStarted(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentStopped(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentStopped(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void dispatchOnFragmentViewCreated(@NonNull Fragment paramFragment, @NonNull View paramView, @Nullable Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(paramFragment, paramView, paramBundle, true);
    }
    localObject = mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentViewCreated(mFragmentManager, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  public void dispatchOnFragmentViewDestroyed(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = mFragmentManager.getParent();
    if (localObject != null) {
      ((Fragment)localObject).getParentFragmentManager().getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(paramFragment, true);
    }
    Iterator localIterator = mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (mRecursive)) {
        mCallback.onFragmentViewDestroyed(mFragmentManager, paramFragment);
      }
    }
  }
  
  public void registerFragmentLifecycleCallbacks(@NonNull FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(paramFragmentLifecycleCallbacks, paramBoolean));
  }
  
  public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = mLifecycleCallbacks;
    int i = 0;
    try
    {
      int j = mLifecycleCallbacks.size();
      while (i < j)
      {
        if (mLifecycleCallbacks.get(i)).mCallback == paramFragmentLifecycleCallbacks)
        {
          mLifecycleCallbacks.remove(i);
          break;
        }
        i++;
      }
      return;
    }
    finally {}
  }
  
  public static final class FragmentLifecycleCallbacksHolder
  {
    @NonNull
    public final FragmentManager.FragmentLifecycleCallbacks mCallback;
    public final boolean mRecursive;
    
    public FragmentLifecycleCallbacksHolder(@NonNull FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
    {
      mCallback = paramFragmentLifecycleCallbacks;
      mRecursive = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */