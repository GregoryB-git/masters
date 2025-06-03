package androidx.appcompat.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import g.n;

public final class a
  implements AdapterView.OnItemClickListener
{
  public a(AlertController.b paramb, AlertController paramAlertController) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    b.n.onClick(a.b, paramInt);
    if (!b.p) {
      a.b.dismiss();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */