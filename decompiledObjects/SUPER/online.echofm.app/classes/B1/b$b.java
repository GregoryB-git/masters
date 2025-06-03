package B1;

import C1.a;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class b$b
  implements AdapterView.OnItemClickListener
{
  public a o;
  public WeakReference p;
  public WeakReference q;
  public AdapterView.OnItemClickListener r;
  public boolean s;
  
  public b$b(a parama, View paramView, AdapterView paramAdapterView)
  {
    o = parama;
    p = new WeakReference(paramAdapterView);
    q = new WeakReference(paramView);
    r = paramAdapterView.getOnItemClickListener();
    s = true;
  }
  
  public final boolean a()
  {
    return s;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    Object localObject = r;
    if (localObject != null) {
      ((AdapterView.OnItemClickListener)localObject).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    paramView = (View)q.get();
    paramAdapterView = (AdapterView)p.get();
    if ((paramView != null) && (paramAdapterView != null))
    {
      localObject = b.a;
      b.d(o, paramView, paramAdapterView);
    }
  }
}

/* Location:
 * Qualified Name:     B1.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */