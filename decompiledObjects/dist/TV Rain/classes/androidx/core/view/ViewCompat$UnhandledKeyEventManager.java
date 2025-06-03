package androidx.core.view;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R.id;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

class ViewCompat$UnhandledKeyEventManager
{
  private static final ArrayList<WeakReference<View>> sViewsWithListeners = new ArrayList();
  private SparseArray<WeakReference<View>> mCapturedKeys = null;
  private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent = null;
  @Nullable
  private WeakHashMap<View, Boolean> mViewsContainingListeners = null;
  
  public static UnhandledKeyEventManager at(View paramView)
  {
    int i = R.id.tag_unhandled_key_event_manager;
    UnhandledKeyEventManager localUnhandledKeyEventManager1 = (UnhandledKeyEventManager)paramView.getTag(i);
    UnhandledKeyEventManager localUnhandledKeyEventManager2 = localUnhandledKeyEventManager1;
    if (localUnhandledKeyEventManager1 == null)
    {
      localUnhandledKeyEventManager2 = new UnhandledKeyEventManager();
      paramView.setTag(i, localUnhandledKeyEventManager2);
    }
    return localUnhandledKeyEventManager2;
  }
  
  @Nullable
  private View dispatchInOrder(View paramView, KeyEvent paramKeyEvent)
  {
    Object localObject = mViewsContainingListeners;
    if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
    {
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
        {
          localObject = dispatchInOrder(localViewGroup.getChildAt(i), paramKeyEvent);
          if (localObject != null) {
            return (View)localObject;
          }
        }
      }
      if (onUnhandledKeyEvent(paramView, paramKeyEvent)) {
        return paramView;
      }
    }
    return null;
  }
  
  private SparseArray<WeakReference<View>> getCapturedKeys()
  {
    if (mCapturedKeys == null) {
      mCapturedKeys = new SparseArray();
    }
    return mCapturedKeys;
  }
  
  private boolean onUnhandledKeyEvent(@NonNull View paramView, @NonNull KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = (ArrayList)paramView.getTag(R.id.tag_unhandled_key_listeners);
    if (localArrayList != null) {
      for (int i = localArrayList.size() - 1; i >= 0; i--) {
        if (((ViewCompat.OnUnhandledKeyEventListenerCompat)localArrayList.get(i)).onUnhandledKeyEvent(paramView, paramKeyEvent)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void recalcViewsWithUnhandled()
  {
    Object localObject1 = mViewsContainingListeners;
    if (localObject1 != null) {
      ((WeakHashMap)localObject1).clear();
    }
    ArrayList localArrayList = sViewsWithListeners;
    if (localArrayList.isEmpty()) {
      return;
    }
    try
    {
      if (mViewsContainingListeners == null)
      {
        localObject1 = new java/util/WeakHashMap;
        ((WeakHashMap)localObject1).<init>();
        mViewsContainingListeners = ((WeakHashMap)localObject1);
      }
      for (int i = localArrayList.size() - 1; i >= 0; i--)
      {
        localObject1 = sViewsWithListeners;
        View localView = (View)((WeakReference)((ArrayList)localObject1).get(i)).get();
        if (localView == null)
        {
          ((ArrayList)localObject1).remove(i);
        }
        else
        {
          mViewsContainingListeners.put(localView, Boolean.TRUE);
          for (localObject1 = localView.getParent(); (localObject1 instanceof View); localObject1 = ((ViewParent)localObject1).getParent()) {
            mViewsContainingListeners.put((View)localObject1, Boolean.TRUE);
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public static void registerListeningView(View paramView)
  {
    synchronized (sViewsWithListeners)
    {
      Object localObject = ???.iterator();
      while (((Iterator)localObject).hasNext()) {
        if (((WeakReference)((Iterator)localObject).next()).get() == paramView) {
          return;
        }
      }
      localObject = sViewsWithListeners;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramView);
      ((ArrayList)localObject).add(localWeakReference);
      return;
    }
  }
  
  public static void unregisterListeningView(View paramView)
  {
    ArrayList localArrayList1 = sViewsWithListeners;
    int i = 0;
    try
    {
      for (;;)
      {
        ArrayList localArrayList2 = sViewsWithListeners;
        if (i >= localArrayList2.size()) {
          break;
        }
        if (((WeakReference)localArrayList2.get(i)).get() == paramView)
        {
          localArrayList2.remove(i);
          return;
        }
        i++;
      }
      return;
    }
    finally {}
  }
  
  public boolean dispatch(View paramView, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {
      recalcViewsWithUnhandled();
    }
    paramView = dispatchInOrder(paramView, paramKeyEvent);
    if (paramKeyEvent.getAction() == 0)
    {
      int i = paramKeyEvent.getKeyCode();
      if ((paramView != null) && (!KeyEvent.isModifierKey(i))) {
        getCapturedKeys().put(i, new WeakReference(paramView));
      }
    }
    boolean bool;
    if (paramView != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean preDispatch(KeyEvent paramKeyEvent)
  {
    Object localObject1 = mLastDispatchedPreViewKeyEvent;
    if ((localObject1 != null) && (((Reference)localObject1).get() == paramKeyEvent)) {
      return false;
    }
    mLastDispatchedPreViewKeyEvent = new WeakReference(paramKeyEvent);
    Object localObject2 = null;
    SparseArray localSparseArray = getCapturedKeys();
    localObject1 = localObject2;
    if (paramKeyEvent.getAction() == 1)
    {
      int i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
      localObject1 = localObject2;
      if (i >= 0)
      {
        localObject1 = (WeakReference)localSparseArray.valueAt(i);
        localSparseArray.removeAt(i);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
    }
    if (localObject2 != null)
    {
      localObject1 = (View)((Reference)localObject2).get();
      if ((localObject1 != null) && (ViewCompat.isAttachedToWindow((View)localObject1))) {
        onUnhandledKeyEvent((View)localObject1, paramKeyEvent);
      }
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.UnhandledKeyEventManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */