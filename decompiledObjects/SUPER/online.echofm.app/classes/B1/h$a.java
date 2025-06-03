package B1;

import C1.a;
import C1.f;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class h$a
  implements View.OnTouchListener
{
  public final a o;
  public final WeakReference p;
  public final WeakReference q;
  public final View.OnTouchListener r;
  public boolean s;
  
  public h$a(a parama, View paramView1, View paramView2)
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

/* Location:
 * Qualified Name:     B1.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */