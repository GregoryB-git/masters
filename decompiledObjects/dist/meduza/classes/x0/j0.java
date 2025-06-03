package x0;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e0.d0;
import e0.d0.d;
import java.util.ArrayList;
import java.util.List;

public final class j0
  extends n0
{
  public static boolean s(Transition paramTransition)
  {
    boolean bool;
    if ((n0.g(paramTransition.getTargetIds())) && (n0.g(paramTransition.getTargetNames())) && (n0.g(paramTransition.getTargetTypes()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void t(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (Transition)paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool)
    {
      paramObject = (TransitionSet)paramObject;
      i = ((TransitionSet)paramObject).getTransitionCount();
      while (j < i)
      {
        t(((TransitionSet)paramObject).getTransitionAt(j), paramArrayList1, paramArrayList2);
        j++;
      }
    }
    if (!s((Transition)paramObject))
    {
      List localList = ((Transition)paramObject).getTargets();
      if ((localList != null) && (localList.size() == paramArrayList1.size()) && (localList.containsAll(paramArrayList1)))
      {
        if (paramArrayList2 == null) {
          j = 0;
        } else {
          j = paramArrayList2.size();
        }
        while (i < j)
        {
          ((Transition)paramObject).addTarget((View)paramArrayList2.get(i));
          i++;
        }
        j = paramArrayList1.size();
        for (;;)
        {
          j--;
          if (j < 0) {
            break;
          }
          ((Transition)paramObject).removeTarget((View)paramArrayList1.get(j));
        }
      }
    }
  }
  
  public final void a(View paramView, Object paramObject)
  {
    ((Transition)paramObject).addTarget(paramView);
  }
  
  public final void b(Object paramObject, ArrayList<View> paramArrayList)
  {
    paramObject = (Transition)paramObject;
    if (paramObject == null) {
      return;
    }
    boolean bool = paramObject instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool)
    {
      paramObject = (TransitionSet)paramObject;
      i = ((TransitionSet)paramObject).getTransitionCount();
      while (j < i)
      {
        b(((TransitionSet)paramObject).getTransitionAt(j), paramArrayList);
        j++;
      }
    }
    if ((!s((Transition)paramObject)) && (n0.g(((Transition)paramObject).getTargets())))
    {
      int k = paramArrayList.size();
      for (j = i; j < k; j++) {
        ((Transition)paramObject).addTarget((View)paramArrayList.get(j));
      }
    }
  }
  
  public final void c(ViewGroup paramViewGroup, Object paramObject)
  {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public final boolean d(Object paramObject)
  {
    return paramObject instanceof Transition;
  }
  
  public final Transition e(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).clone();
    } else {
      paramObject = null;
    }
    return (Transition)paramObject;
  }
  
  public final void h()
  {
    if (y.L(4)) {
      Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
    }
  }
  
  public final Transition i(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    paramObject1 = (Transition)paramObject1;
    paramObject2 = (Transition)paramObject2;
    paramObject3 = (Transition)paramObject3;
    if ((paramObject1 != null) && (paramObject2 != null)) {
      paramObject1 = new TransitionSet().addTransition((Transition)paramObject1).addTransition((Transition)paramObject2).setOrdering(1);
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      }
    }
    if (paramObject3 != null)
    {
      paramObject2 = new TransitionSet();
      if (paramObject1 != null) {
        ((TransitionSet)paramObject2).addTransition((Transition)paramObject1);
      }
      ((TransitionSet)paramObject2).addTransition((Transition)paramObject3);
      return (Transition)paramObject2;
    }
    return (Transition)paramObject1;
  }
  
  public final TransitionSet j(Object paramObject1, Object paramObject2)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    if (paramObject1 != null) {
      localTransitionSet.addTransition((Transition)paramObject1);
    }
    localTransitionSet.addTransition((Transition)paramObject2);
    return localTransitionSet;
  }
  
  public final void k(Object paramObject, View paramView, final ArrayList<View> paramArrayList)
  {
    ((Transition)paramObject).addListener(new a(paramView, paramArrayList));
  }
  
  public final void l(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2)
  {
    ((Transition)paramObject1).addListener(new k0(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2));
  }
  
  public final void m(View paramView, Object paramObject)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      Rect localRect = new Rect();
      n0.f(paramView, localRect);
      ((Transition)paramObject).setEpicenterCallback(new i0(localRect));
    }
  }
  
  public final void n(Object paramObject, Rect paramRect)
  {
    ((Transition)paramObject).setEpicenterCallback(new b(paramRect));
  }
  
  public final void o(Object paramObject, f paramf)
  {
    ((Transition)paramObject).addListener(new l0(paramf));
  }
  
  public final void p(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    List localList = ((Transition)paramObject).getTargets();
    localList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject1 = (View)paramArrayList.get(j);
      int k = localList.size();
      for (int m = 0; m < k; m++) {
        if (localList.get(m) == localObject1)
        {
          m = 1;
          break label93;
        }
      }
      m = 0;
      label93:
      if (m == 0)
      {
        Object localObject2 = d0.a;
        if (d0.d.k((View)localObject1) != null) {
          localList.add(localObject1);
        }
        for (m = k; m < localList.size(); m++)
        {
          localObject1 = (View)localList.get(m);
          if ((localObject1 instanceof ViewGroup))
          {
            localObject1 = (ViewGroup)localObject1;
            int n = ((ViewGroup)localObject1).getChildCount();
            for (int i1 = 0; i1 < n; i1++)
            {
              localObject2 = ((ViewGroup)localObject1).getChildAt(i1);
              for (int i2 = 0; i2 < k; i2++) {
                if (localList.get(i2) == localObject2)
                {
                  i2 = 1;
                  break label234;
                }
              }
              i2 = 0;
              label234:
              if ((i2 == 0) && (d0.d.k((View)localObject2) != null)) {
                localList.add(localObject2);
              }
            }
          }
        }
      }
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public final void q(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      ((Transition)paramObject).getTargets().clear();
      ((Transition)paramObject).getTargets().addAll(paramArrayList2);
      t(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public final TransitionSet r(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    TransitionSet localTransitionSet = new TransitionSet();
    localTransitionSet.addTransition((Transition)paramObject);
    return localTransitionSet;
  }
  
  public final class a
    implements Transition.TransitionListener
  {
    public a(ArrayList paramArrayList) {}
    
    public final void onTransitionCancel(Transition paramTransition) {}
    
    public final void onTransitionEnd(Transition paramTransition)
    {
      paramTransition.removeListener(this);
      setVisibility(8);
      int i = paramArrayList.size();
      for (int j = 0; j < i; j++) {
        ((View)paramArrayList.get(j)).setVisibility(0);
      }
    }
    
    public final void onTransitionPause(Transition paramTransition) {}
    
    public final void onTransitionResume(Transition paramTransition) {}
    
    public final void onTransitionStart(Transition paramTransition)
    {
      paramTransition.removeListener(this);
      paramTransition.addListener(this);
    }
  }
  
  public final class b
    extends Transition.EpicenterCallback
  {
    public b() {}
    
    public final Rect onGetEpicenter(Transition paramTransition)
    {
      paramTransition = j0.this;
      if ((paramTransition != null) && (!paramTransition.isEmpty())) {
        return j0.this;
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     x0.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */