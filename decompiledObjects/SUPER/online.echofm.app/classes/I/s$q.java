package I;

import android.support.v4.media.a;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.c;

public class s$q
{
  public static final ArrayList d = new ArrayList();
  public WeakHashMap a = null;
  public SparseArray b = null;
  public WeakReference c = null;
  
  public static q a(View paramView)
  {
    q localq1 = (q)paramView.getTag(c.O);
    q localq2 = localq1;
    if (localq1 == null)
    {
      localq2 = new q();
      paramView.setTag(c.O, localq2);
    }
    return localq2;
  }
  
  public boolean b(View paramView, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {
      g();
    }
    paramView = c(paramView, paramKeyEvent);
    if (paramKeyEvent.getAction() == 0)
    {
      int i = paramKeyEvent.getKeyCode();
      if ((paramView != null) && (!KeyEvent.isModifierKey(i))) {
        d().put(i, new WeakReference(paramView));
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
  
  public final View c(View paramView, KeyEvent paramKeyEvent)
  {
    Object localObject = a;
    if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
    {
      if ((paramView instanceof ViewGroup))
      {
        localObject = (ViewGroup)paramView;
        for (int i = ((ViewGroup)localObject).getChildCount() - 1; i >= 0; i--)
        {
          View localView = c(((ViewGroup)localObject).getChildAt(i), paramKeyEvent);
          if (localView != null) {
            return localView;
          }
        }
      }
      if (e(paramView, paramKeyEvent)) {
        return paramView;
      }
    }
    return null;
  }
  
  public final SparseArray d()
  {
    if (b == null) {
      b = new SparseArray();
    }
    return b;
  }
  
  public final boolean e(View paramView, KeyEvent paramKeyEvent)
  {
    paramView = (ArrayList)paramView.getTag(c.P);
    if (paramView != null)
    {
      int i = paramView.size() - 1;
      if (i >= 0)
      {
        a.a(paramView.get(i));
        throw null;
      }
    }
    return false;
  }
  
  public boolean f(KeyEvent paramKeyEvent)
  {
    Object localObject1 = c;
    if ((localObject1 != null) && (((Reference)localObject1).get() == paramKeyEvent)) {
      return false;
    }
    c = new WeakReference(paramKeyEvent);
    SparseArray localSparseArray = d();
    if (paramKeyEvent.getAction() == 1)
    {
      int i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
      if (i >= 0)
      {
        localObject1 = (WeakReference)localSparseArray.valueAt(i);
        localSparseArray.removeAt(i);
        break label80;
      }
    }
    localObject1 = null;
    label80:
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
    }
    if (localObject2 != null)
    {
      localObject1 = (View)((Reference)localObject2).get();
      if ((localObject1 != null) && (s.t((View)localObject1))) {
        e((View)localObject1, paramKeyEvent);
      }
      return true;
    }
    return false;
  }
  
  public final void g()
  {
    WeakHashMap localWeakHashMap = a;
    if (localWeakHashMap != null) {
      localWeakHashMap.clear();
    }
    ArrayList localArrayList = d;
    if (localArrayList.isEmpty()) {
      return;
    }
    try
    {
      if (a == null)
      {
        localWeakHashMap = new java/util/WeakHashMap;
        localWeakHashMap.<init>();
        a = localWeakHashMap;
      }
    }
    finally
    {
      break label159;
    }
    Object localObject2;
    for (int i = localArrayList.size() - 1; i >= 0; i--)
    {
      localObject2 = d;
      View localView = (View)((WeakReference)((ArrayList)localObject2).get(i)).get();
      if (localView == null)
      {
        ((ArrayList)localObject2).remove(i);
      }
      else
      {
        a.put(localView, Boolean.TRUE);
        for (localObject2 = localView.getParent(); (localObject2 instanceof View); localObject2 = ((ViewParent)localObject2).getParent()) {
          a.put((View)localObject2, Boolean.TRUE);
        }
      }
    }
    return;
    label159:
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     I.s.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */