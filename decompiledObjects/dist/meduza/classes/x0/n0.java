package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class n0
{
  public static void f(View paramView, Rect paramRect)
  {
    if (!paramView.isAttachedToWindow()) {
      return;
    }
    RectF localRectF = new RectF();
    localRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    paramView.getMatrix().mapRect(localRectF);
    localRectF.offset(paramView.getLeft(), paramView.getTop());
    for (Object localObject = paramView.getParent(); (localObject instanceof View); localObject = ((View)localObject).getParent())
    {
      localObject = (View)localObject;
      localRectF.offset(-((View)localObject).getScrollX(), -((View)localObject).getScrollY());
      ((View)localObject).getMatrix().mapRect(localRectF);
      localRectF.offset(((View)localObject).getLeft(), ((View)localObject).getTop());
    }
    localObject = new int[2];
    paramView.getRootView().getLocationOnScreen((int[])localObject);
    localRectF.offset(localObject[0], localObject[1]);
    paramRect.set(Math.round(left), Math.round(top), Math.round(right), Math.round(bottom));
  }
  
  public static boolean g(List paramList)
  {
    boolean bool;
    if ((paramList != null) && (!paramList.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract void a(View paramView, Object paramObject);
  
  public abstract void b(Object paramObject, ArrayList<View> paramArrayList);
  
  public abstract void c(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract boolean d(Object paramObject);
  
  public abstract Transition e(Object paramObject);
  
  public void h()
  {
    if (y.L(4)) {
      Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
    }
  }
  
  public abstract Transition i(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract TransitionSet j(Object paramObject1, Object paramObject2);
  
  public abstract void k(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void l(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2);
  
  public abstract void m(View paramView, Object paramObject);
  
  public abstract void n(Object paramObject, Rect paramRect);
  
  public void o(Object paramObject, f paramf)
  {
    paramf.run();
  }
  
  public abstract void p(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void q(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract TransitionSet r(Object paramObject);
}

/* Location:
 * Qualified Name:     x0.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */