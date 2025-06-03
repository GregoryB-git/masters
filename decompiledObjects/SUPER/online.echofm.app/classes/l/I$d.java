package l;

import android.database.DataSetObserver;

public class I$d
  extends DataSetObserver
{
  public I$d(I paramI) {}
  
  public void onChanged()
  {
    if (a.i()) {
      a.a();
    }
  }
  
  public void onInvalidated()
  {
    a.dismiss();
  }
}

/* Location:
 * Qualified Name:     l.I.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */