package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class I$b
  implements AdapterView.OnItemSelectedListener
{
  public I$b(I paramI) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      paramAdapterView = o.q;
      if (paramAdapterView != null) {
        paramAdapterView.setListSelectionHidden(false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}

/* Location:
 * Qualified Name:     l.I.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */