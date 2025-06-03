package androidx.fragment.app;

import E.c;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class x
  extends y
{
  public static boolean C(Transition paramTransition)
  {
    boolean bool;
    if ((y.l(paramTransition.getTargetIds())) && (y.l(paramTransition.getTargetNames())) && (y.l(paramTransition.getTargetTypes()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void A(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      ((Transition)paramObject).getTargets().clear();
      ((Transition)paramObject).getTargets().addAll(paramArrayList2);
      q(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public Object B(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    TransitionSet localTransitionSet = new TransitionSet();
    localTransitionSet.addTransition((Transition)paramObject);
    return localTransitionSet;
  }
  
  public void a(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Transition)paramObject).addTarget(paramView);
    }
  }
  
  public void b(Object paramObject, ArrayList paramArrayList)
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
    if ((!C((Transition)paramObject)) && (y.l(((Transition)paramObject).getTargets())))
    {
      int k = paramArrayList.size();
      for (j = i; j < k; j++) {
        ((Transition)paramObject).addTarget((View)paramArrayList.get(j));
      }
    }
  }
  
  public void c(ViewGroup paramViewGroup, Object paramObject)
  {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public boolean e(Object paramObject)
  {
    return paramObject instanceof Transition;
  }
  
  public Object g(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).clone();
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public Object m(Object paramObject1, Object paramObject2, Object paramObject3)
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
      return paramObject2;
    }
    return paramObject1;
  }
  
  public Object n(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    if (paramObject1 != null) {
      localTransitionSet.addTransition((Transition)paramObject1);
    }
    if (paramObject2 != null) {
      localTransitionSet.addTransition((Transition)paramObject2);
    }
    if (paramObject3 != null) {
      localTransitionSet.addTransition((Transition)paramObject3);
    }
    return localTransitionSet;
  }
  
  public void p(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Transition)paramObject).removeTarget(paramView);
    }
  }
  
  public void q(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
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
        q(((TransitionSet)paramObject).getTransitionAt(j), paramArrayList1, paramArrayList2);
        j++;
      }
    }
    if (!C((Transition)paramObject))
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
        for (j = paramArrayList1.size() - 1; j >= 0; j--) {
          ((Transition)paramObject).removeTarget((View)paramArrayList1.get(j));
        }
      }
    }
  }
  
  public void r(Object paramObject, final View paramView, final ArrayList paramArrayList)
  {
    ((Transition)paramObject).addListener(new b(paramView, paramArrayList));
  }
  
  public void t(Object paramObject1, final Object paramObject2, final ArrayList paramArrayList1, final Object paramObject3, final ArrayList paramArrayList2, final Object paramObject4, final ArrayList paramArrayList3)
  {
    ((Transition)paramObject1).addListener(new c(paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void u(Object paramObject, final Rect paramRect)
  {
    if (paramObject != null) {
      ((Transition)paramObject).setEpicenterCallback(new e(paramRect));
    }
  }
  
  public void v(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      final Rect localRect = new Rect();
      k(paramView, localRect);
      ((Transition)paramObject).setEpicenterCallback(new a(localRect));
    }
  }
  
  public void w(Fragment paramFragment, Object paramObject, c paramc, final Runnable paramRunnable)
  {
    ((Transition)paramObject).addListener(new d(paramRunnable));
  }
  
  public void z(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    List localList = ((Transition)paramObject).getTargets();
    localList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      y.d(localList, (View)paramArrayList.get(j));
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public class a
    extends Transition.EpicenterCallback
  {
    public a(Rect paramRect) {}
    
    public Rect onGetEpicenter(Transition paramTransition)
    {
      return localRect;
    }
  }
  
  public class b
    implements Transition.TransitionListener
  {
    public b(View paramView, ArrayList paramArrayList) {}
    
    public void onTransitionCancel(Transition paramTransition) {}
    
    public void onTransitionEnd(Transition paramTransition)
    {
      paramTransition.removeListener(this);
      paramView.setVisibility(8);
      int i = paramArrayList.size();
      for (int j = 0; j < i; j++) {
        ((View)paramArrayList.get(j)).setVisibility(0);
      }
    }
    
    public void onTransitionPause(Transition paramTransition) {}
    
    public void onTransitionResume(Transition paramTransition) {}
    
    public void onTransitionStart(Transition paramTransition)
    {
      paramTransition.removeListener(this);
      paramTransition.addListener(this);
    }
  }
  
  public class c
    implements Transition.TransitionListener
  {
    public c(Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
    
    public void onTransitionCancel(Transition paramTransition) {}
    
    public void onTransitionEnd(Transition paramTransition)
    {
      paramTransition.removeListener(this);
    }
    
    public void onTransitionPause(Transition paramTransition) {}
    
    public void onTransitionResume(Transition paramTransition) {}
    
    public void onTransitionStart(Transition paramTransition)
    {
      paramTransition = paramObject2;
      if (paramTransition != null) {
        q(paramTransition, paramArrayList1, null);
      }
      paramTransition = paramObject3;
      if (paramTransition != null) {
        q(paramTransition, paramArrayList2, null);
      }
      paramTransition = paramObject4;
      if (paramTransition != null) {
        q(paramTransition, paramArrayList3, null);
      }
    }
  }
  
  public class d
    implements Transition.TransitionListener
  {
    public d(Runnable paramRunnable) {}
    
    public void onTransitionCancel(Transition paramTransition) {}
    
    public void onTransitionEnd(Transition paramTransition)
    {
      paramRunnable.run();
    }
    
    public void onTransitionPause(Transition paramTransition) {}
    
    public void onTransitionResume(Transition paramTransition) {}
    
    public void onTransitionStart(Transition paramTransition) {}
  }
  
  public class e
    extends Transition.EpicenterCallback
  {
    public e(Rect paramRect) {}
    
    public Rect onGetEpicenter(Transition paramTransition)
    {
      paramTransition = paramRect;
      if ((paramTransition != null) && (!paramTransition.isEmpty())) {
        return paramRect;
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */