package androidx.fragment.app;

import E.c;
import I.q;
import I.s;
import I.v;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class y
{
  public static void d(List paramList, View paramView)
  {
    int i = paramList.size();
    if (h(paramList, paramView, i)) {
      return;
    }
    paramList.add(paramView);
    for (int j = i; j < paramList.size(); j++)
    {
      paramView = (View)paramList.get(j);
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int k = paramView.getChildCount();
        for (int m = 0; m < k; m++)
        {
          View localView = paramView.getChildAt(m);
          if (!h(paramList, localView, i)) {
            paramList.add(localView);
          }
        }
      }
    }
  }
  
  public static boolean h(List paramList, View paramView, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramList.get(i) == paramView) {
        return true;
      }
    }
    return false;
  }
  
  public static String i(Map paramMap, String paramString)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      if (paramString.equals(paramMap.getValue())) {
        return (String)paramMap.getKey();
      }
    }
    return null;
  }
  
  public static boolean l(List paramList)
  {
    boolean bool;
    if ((paramList != null) && (!paramList.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract void A(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2);
  
  public abstract Object B(Object paramObject);
  
  public abstract void a(Object paramObject, View paramView);
  
  public abstract void b(Object paramObject, ArrayList paramArrayList);
  
  public abstract void c(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract boolean e(Object paramObject);
  
  public void f(ArrayList paramArrayList, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      Object localObject = paramView;
      if ((paramView instanceof ViewGroup))
      {
        localObject = (ViewGroup)paramView;
        if (!v.a((ViewGroup)localObject))
        {
          int i = ((ViewGroup)localObject).getChildCount();
          for (int j = 0; j < i; j++) {
            f(paramArrayList, ((ViewGroup)localObject).getChildAt(j));
          }
        }
      }
      paramArrayList.add(localObject);
    }
  }
  
  public abstract Object g(Object paramObject);
  
  public void j(Map paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = s.q(paramView);
      if (str != null) {
        paramMap.put(str, paramView);
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (int j = 0; j < i; j++) {
          j(paramMap, paramView.getChildAt(j));
        }
      }
    }
  }
  
  public void k(View paramView, Rect paramRect)
  {
    if (!s.t(paramView)) {
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
  
  public abstract Object m(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract Object n(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public ArrayList o(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)paramArrayList.get(j);
      localArrayList.add(s.q(localView));
      s.I(localView, null);
    }
    return localArrayList;
  }
  
  public abstract void p(Object paramObject, View paramView);
  
  public abstract void q(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2);
  
  public abstract void r(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public void s(ViewGroup paramViewGroup, final ArrayList paramArrayList, final Map paramMap)
  {
    q.a(paramViewGroup, new c(paramArrayList, paramMap));
  }
  
  public abstract void t(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3);
  
  public abstract void u(Object paramObject, Rect paramRect);
  
  public abstract void v(Object paramObject, View paramView);
  
  public abstract void w(Fragment paramFragment, Object paramObject, c paramc, Runnable paramRunnable);
  
  public void x(View paramView, final ArrayList paramArrayList, final Map paramMap)
  {
    q.a(paramView, new b(paramArrayList, paramMap));
  }
  
  public void y(View paramView, final ArrayList paramArrayList1, final ArrayList paramArrayList2, final ArrayList paramArrayList3, Map paramMap)
  {
    final int i = paramArrayList2.size();
    final ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (View)paramArrayList1.get(j);
      String str = s.q((View)localObject);
      localArrayList.add(str);
      if (str != null)
      {
        s.I((View)localObject, null);
        localObject = (String)paramMap.get(str);
        for (int k = 0; k < i; k++) {
          if (((String)localObject).equals(paramArrayList3.get(k)))
          {
            s.I((View)paramArrayList2.get(k), str);
            break;
          }
        }
      }
    }
    q.a(paramView, new a(i, paramArrayList2, paramArrayList3, paramArrayList1, localArrayList));
  }
  
  public abstract void z(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public class a
    implements Runnable
  {
    public a(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
    
    public void run()
    {
      for (int i = 0; i < i; i++)
      {
        s.I((View)paramArrayList2.get(i), (String)paramArrayList3.get(i));
        s.I((View)paramArrayList1.get(i), (String)localArrayList.get(i));
      }
    }
  }
  
  public class b
    implements Runnable
  {
    public b(ArrayList paramArrayList, Map paramMap) {}
    
    public void run()
    {
      int i = paramArrayList.size();
      for (int j = 0; j < i; j++)
      {
        View localView = (View)paramArrayList.get(j);
        String str = s.q(localView);
        if (str != null) {
          s.I(localView, y.i(paramMap, str));
        }
      }
    }
  }
  
  public class c
    implements Runnable
  {
    public c(ArrayList paramArrayList, Map paramMap) {}
    
    public void run()
    {
      int i = paramArrayList.size();
      for (int j = 0; j < i; j++)
      {
        View localView = (View)paramArrayList.get(j);
        String str = s.q(localView);
        s.I(localView, (String)paramMap.get(str));
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */