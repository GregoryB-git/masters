package m0;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

public final class a$b
  extends DataSetObserver
{
  public a$b(a parama) {}
  
  public final void onChanged()
  {
    a locala = a;
    a = true;
    locala.notifyDataSetChanged();
  }
  
  public final void onInvalidated()
  {
    a locala = a;
    a = false;
    locala.notifyDataSetInvalidated();
  }
}

/* Location:
 * Qualified Name:     m0.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */