package B1;

import C1.f;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class b$a
  implements View.OnClickListener
{
  public C1.a o;
  public WeakReference p;
  public WeakReference q;
  public View.OnClickListener r;
  public boolean s;
  
  public b$a(C1.a parama, View paramView1, View paramView2)
  {
    o = parama;
    p = new WeakReference(paramView2);
    q = new WeakReference(paramView1);
    r = f.g(paramView2);
    s = true;
  }
  
  public final boolean a()
  {
    return s;
  }
  
  public void onClick(View paramView)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      Object localObject = r;
      if (localObject != null) {
        ((View.OnClickListener)localObject).onClick(paramView);
      }
      View localView = (View)q.get();
      paramView = (View)p.get();
      if ((localView != null) && (paramView != null))
      {
        localObject = b.a;
        b.d(o, localView, paramView);
      }
    }
    finally
    {
      break label84;
    }
    return;
    label84:
    T1.a.b(paramView, this);
  }
}

/* Location:
 * Qualified Name:     B1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */