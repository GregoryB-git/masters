package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import f0.b;
import f0.c;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class m
  extends e0.a
{
  public final RecyclerView d;
  public final a e;
  
  public m(RecyclerView paramRecyclerView)
  {
    d = paramRecyclerView;
    paramRecyclerView = e;
    if (paramRecyclerView == null) {
      paramRecyclerView = new a(this);
    }
    e = paramRecyclerView;
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.c(paramView, paramAccessibilityEvent);
    if ((paramView instanceof RecyclerView))
    {
      RecyclerView localRecyclerView = d;
      boolean bool = y;
      int i = 0;
      if ((bool) && (!F))
      {
        int j;
        if (c.b.size() > 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {}
      }
      else
      {
        i = 1;
      }
      if (i == 0)
      {
        paramView = (RecyclerView)paramView;
        if (paramView.getLayoutManager() != null) {
          paramView.getLayoutManager().C(paramAccessibilityEvent);
        }
      }
    }
  }
  
  public final void d(View paramView, b paramb)
  {
    a.onInitializeAccessibilityNodeInfo(paramView, a);
    paramView = d;
    if ((y) && (!F))
    {
      if (c.b.size() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        i = 0;
        break label65;
      }
    }
    int i = 1;
    label65:
    if ((i == 0) && (d.getLayoutManager() != null))
    {
      RecyclerView.j localj = d.getLayoutManager();
      paramView = b;
      RecyclerView.p localp = a;
      RecyclerView.s locals = i0;
      if ((paramView.canScrollVertically(-1)) || (b.canScrollHorizontally(-1)))
      {
        a.addAction(8192);
        a.setScrollable(true);
      }
      if ((b.canScrollVertically(1)) || (b.canScrollHorizontally(1)))
      {
        a.addAction(4096);
        a.setScrollable(true);
      }
      paramView = AccessibilityNodeInfo.CollectionInfo.obtain(localj.y(localp, locals), localj.q(localp, locals), false, 0);
      a.setCollectionInfo(paramView);
    }
  }
  
  public final boolean g(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = super.g(paramView, paramInt, paramBundle);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramView = d;
    if ((y) && (!F))
    {
      if (c.b.size() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        i = 0;
        break label77;
      }
    }
    int i = 1;
    label77:
    if ((i == 0) && (d.getLayoutManager() != null))
    {
      RecyclerView.j localj = d.getLayoutManager();
      paramView = b;
      paramBundle = a;
      int j;
      if (paramInt != 4096)
      {
        if (paramInt != 8192)
        {
          i = 0;
          paramInt = i;
          break label279;
        }
        if (paramView.canScrollVertically(-1)) {
          paramInt = -(g - localj.v() - localj.s());
        } else {
          paramInt = 0;
        }
        j = paramInt;
        if (b.canScrollHorizontally(-1))
        {
          i = -(f - localj.t() - localj.u());
          break label279;
        }
      }
      else
      {
        if (paramView.canScrollVertically(1)) {
          paramInt = g - localj.v() - localj.s();
        } else {
          paramInt = 0;
        }
        j = paramInt;
        if (b.canScrollHorizontally(1))
        {
          i = f - localj.t() - localj.u();
          break label279;
        }
      }
      i = 0;
      paramInt = j;
      label279:
      if ((paramInt == 0) && (i == 0)) {
        bool2 = false;
      } else {
        b.x(i, paramInt, true);
      }
      return bool2;
    }
    return false;
  }
  
  public static final class a
    extends e0.a
  {
    public final m d;
    public WeakHashMap e = new WeakHashMap();
    
    public a(m paramm)
    {
      d = paramm;
    }
    
    public final boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        return locala.a(paramView, paramAccessibilityEvent);
      }
      return super.a(paramView, paramAccessibilityEvent);
    }
    
    public final c b(View paramView)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        return locala.b(paramView);
      }
      return super.b(paramView);
    }
    
    public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        locala.c(paramView, paramAccessibilityEvent);
      } else {
        super.c(paramView, paramAccessibilityEvent);
      }
    }
    
    public final void d(View paramView, b paramb)
    {
      Object localObject = d.d;
      boolean bool = y;
      int i = 0;
      if ((bool) && (!F))
      {
        int j;
        if (c.b.size() > 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {}
      }
      else
      {
        i = 1;
      }
      if ((i == 0) && (d.d.getLayoutManager() != null))
      {
        d.d.getLayoutManager().getClass();
        RecyclerView.p(paramView);
        localObject = (e0.a)e.get(paramView);
        if (localObject != null)
        {
          ((e0.a)localObject).d(paramView, paramb);
          return;
        }
      }
      a.onInitializeAccessibilityNodeInfo(paramView, a);
    }
    
    public final void e(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        locala.e(paramView, paramAccessibilityEvent);
      } else {
        super.e(paramView, paramAccessibilityEvent);
      }
    }
    
    public final boolean f(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      e0.a locala = (e0.a)e.get(paramViewGroup);
      if (locala != null) {
        return locala.f(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return super.f(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public final boolean g(View paramView, int paramInt, Bundle paramBundle)
    {
      Object localObject = d.d;
      if ((y) && (!F))
      {
        if (c.b.size() > 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          i = 0;
          break label65;
        }
      }
      int i = 1;
      label65:
      if ((i == 0) && (d.d.getLayoutManager() != null))
      {
        localObject = (e0.a)e.get(paramView);
        if (localObject != null)
        {
          if (((e0.a)localObject).g(paramView, paramInt, paramBundle)) {
            return true;
          }
        }
        else if (super.g(paramView, paramInt, paramBundle)) {
          return true;
        }
        paramView = d.d.getLayoutManager().b.a;
        return false;
      }
      return super.g(paramView, paramInt, paramBundle);
    }
    
    public final void h(View paramView, int paramInt)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        locala.h(paramView, paramInt);
      } else {
        super.h(paramView, paramInt);
      }
    }
    
    public final void i(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      e0.a locala = (e0.a)e.get(paramView);
      if (locala != null) {
        locala.i(paramView, paramAccessibilityEvent);
      } else {
        super.i(paramView, paramAccessibilityEvent);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */