package androidx.transition;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.Iterator;

class TransitionManager$MultiListener
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  public ViewGroup mSceneRoot;
  public Transition mTransition;
  
  public TransitionManager$MultiListener(Transition paramTransition, ViewGroup paramViewGroup)
  {
    mTransition = paramTransition;
    mSceneRoot = paramViewGroup;
  }
  
  private void removeListeners()
  {
    mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
    mSceneRoot.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    removeListeners();
    if (!TransitionManager.sPendingTransitions.remove(mSceneRoot)) {
      return true;
    }
    final ArrayMap localArrayMap = TransitionManager.getRunningTransitions();
    ArrayList localArrayList1 = (ArrayList)localArrayMap.get(mSceneRoot);
    ArrayList localArrayList2 = null;
    Object localObject;
    if (localArrayList1 == null)
    {
      localObject = new ArrayList();
      localArrayMap.put(mSceneRoot, localObject);
    }
    else
    {
      localObject = localArrayList1;
      if (localArrayList1.size() > 0)
      {
        localArrayList2 = new ArrayList(localArrayList1);
        localObject = localArrayList1;
      }
    }
    ((ArrayList)localObject).add(mTransition);
    mTransition.addListener(new TransitionListenerAdapter()
    {
      public void onTransitionEnd(@NonNull Transition paramAnonymousTransition)
      {
        ((ArrayList)localArrayMap.get(mSceneRoot)).remove(paramAnonymousTransition);
        paramAnonymousTransition.removeListener(this);
      }
    });
    mTransition.captureValues(mSceneRoot, false);
    if (localArrayList2 != null)
    {
      localObject = localArrayList2.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Transition)((Iterator)localObject).next()).resume(mSceneRoot);
      }
    }
    mTransition.playTransition(mSceneRoot);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    removeListeners();
    TransitionManager.sPendingTransitions.remove(mSceneRoot);
    paramView = (ArrayList)TransitionManager.getRunningTransitions().get(mSceneRoot);
    if ((paramView != null) && (paramView.size() > 0))
    {
      paramView = paramView.iterator();
      while (paramView.hasNext()) {
        ((Transition)paramView.next()).resume(mSceneRoot);
      }
    }
    mTransition.clearValues(true);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionManager.MultiListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */