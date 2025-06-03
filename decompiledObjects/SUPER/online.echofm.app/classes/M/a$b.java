package M;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

public class a$b
  extends DataSetObserver
{
  public a$b(a parama) {}
  
  public void onChanged()
  {
    a locala = a;
    o = true;
    locala.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    a locala = a;
    o = false;
    locala.notifyDataSetInvalidated();
  }
}

/* Location:
 * Qualified Name:     M.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */