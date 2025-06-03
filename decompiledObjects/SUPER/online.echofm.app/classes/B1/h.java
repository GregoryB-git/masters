package B1;

import C1.f;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class h
{
  public static final h a = new h();
  
  public static final a a(C1.a parama, View paramView1, View paramView2)
  {
    if (T1.a.d(h.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "mapping");
      Intrinsics.checkNotNullParameter(paramView1, "rootView");
      Intrinsics.checkNotNullParameter(paramView2, "hostView");
      parama = new a(parama, paramView1, paramView2);
      return parama;
    }
    finally
    {
      T1.a.b(parama, h.class);
    }
    return null;
  }
  
  public static final class a
    implements View.OnTouchListener
  {
    public final C1.a o;
    public final WeakReference p;
    public final WeakReference q;
    public final View.OnTouchListener r;
    public boolean s;
    
    public a(C1.a parama, View paramView1, View paramView2)
    {
      o = parama;
      p = new WeakReference(paramView2);
      q = new WeakReference(paramView1);
      r = f.h(paramView2);
      s = true;
    }
    
    public final boolean a()
    {
      return s;
    }
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      Intrinsics.checkNotNullParameter(paramMotionEvent, "motionEvent");
      View localView1 = (View)q.get();
      View localView2 = (View)p.get();
      boolean bool = true;
      if ((localView1 != null) && (localView2 != null) && (paramMotionEvent.getAction() == 1))
      {
        localObject = b.a;
        b.d(o, localView1, localView2);
      }
      Object localObject = r;
      if ((localObject == null) || (!((View.OnTouchListener)localObject).onTouch(paramView, paramMotionEvent))) {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     B1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */