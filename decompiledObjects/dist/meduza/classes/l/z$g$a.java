package l;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public final class z$g$a
  implements AdapterView.OnItemClickListener
{
  public z$g$a(z.g paramg) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a.O.setSelection(paramInt);
    if (a.O.getOnItemClickListener() != null)
    {
      paramAdapterView = a;
      O.performItemClick(paramView, paramInt, L.getItemId(paramInt));
    }
    a.dismiss();
  }
}

/* Location:
 * Qualified Name:     l.z.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */