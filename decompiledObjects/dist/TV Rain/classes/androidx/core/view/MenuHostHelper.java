package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import f3;
import g3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper
{
  private final CopyOnWriteArrayList<MenuProvider> mMenuProviders = new CopyOnWriteArrayList();
  private final Runnable mOnInvalidateMenuCallback;
  private final Map<MenuProvider, LifecycleContainer> mProviderToLifecycleContainers = new HashMap();
  
  public MenuHostHelper(@NonNull Runnable paramRunnable)
  {
    mOnInvalidateMenuCallback = paramRunnable;
  }
  
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuProviders.add(paramMenuProvider);
    mOnInvalidateMenuCallback.run();
  }
  
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner)
  {
    addMenuProvider(paramMenuProvider);
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    Object localObject = (LifecycleContainer)mProviderToLifecycleContainers.remove(paramMenuProvider);
    if (localObject != null) {
      ((LifecycleContainer)localObject).clearObservers();
    }
    localObject = new f3(this, paramMenuProvider);
    mProviderToLifecycleContainers.put(paramMenuProvider, new LifecycleContainer(paramLifecycleOwner, (LifecycleEventObserver)localObject));
  }
  
  @SuppressLint({"LambdaLast"})
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.State paramState)
  {
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    LifecycleContainer localLifecycleContainer = (LifecycleContainer)mProviderToLifecycleContainers.remove(paramMenuProvider);
    if (localLifecycleContainer != null) {
      localLifecycleContainer.clearObservers();
    }
    paramState = new g3(this, paramState, paramMenuProvider);
    mProviderToLifecycleContainers.put(paramMenuProvider, new LifecycleContainer(paramLifecycleOwner, paramState));
  }
  
  public void onCreateMenu(@NonNull Menu paramMenu, @NonNull MenuInflater paramMenuInflater)
  {
    Iterator localIterator = mMenuProviders.iterator();
    while (localIterator.hasNext()) {
      ((MenuProvider)localIterator.next()).onCreateMenu(paramMenu, paramMenuInflater);
    }
  }
  
  public void onMenuClosed(@NonNull Menu paramMenu)
  {
    Iterator localIterator = mMenuProviders.iterator();
    while (localIterator.hasNext()) {
      ((MenuProvider)localIterator.next()).onMenuClosed(paramMenu);
    }
  }
  
  public boolean onMenuItemSelected(@NonNull MenuItem paramMenuItem)
  {
    Iterator localIterator = mMenuProviders.iterator();
    while (localIterator.hasNext()) {
      if (((MenuProvider)localIterator.next()).onMenuItemSelected(paramMenuItem)) {
        return true;
      }
    }
    return false;
  }
  
  public void onPrepareMenu(@NonNull Menu paramMenu)
  {
    Iterator localIterator = mMenuProviders.iterator();
    while (localIterator.hasNext()) {
      ((MenuProvider)localIterator.next()).onPrepareMenu(paramMenu);
    }
  }
  
  public void removeMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuProviders.remove(paramMenuProvider);
    paramMenuProvider = (LifecycleContainer)mProviderToLifecycleContainers.remove(paramMenuProvider);
    if (paramMenuProvider != null) {
      paramMenuProvider.clearObservers();
    }
    mOnInvalidateMenuCallback.run();
  }
  
  public static class LifecycleContainer
  {
    public final Lifecycle mLifecycle;
    private LifecycleEventObserver mObserver;
    
    public LifecycleContainer(@NonNull Lifecycle paramLifecycle, @NonNull LifecycleEventObserver paramLifecycleEventObserver)
    {
      mLifecycle = paramLifecycle;
      mObserver = paramLifecycleEventObserver;
      paramLifecycle.addObserver(paramLifecycleEventObserver);
    }
    
    public void clearObservers()
    {
      mLifecycle.removeObserver(mObserver);
      mObserver = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuHostHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */