package l;

import android.database.DataSetObserver;

public final class n0$d
  extends DataSetObserver
{
  public n0$d(n0 paramn0) {}
  
  public final void onChanged()
  {
    if (a.a()) {
      a.show();
    }
  }
  
  public final void onInvalidated()
  {
    a.dismiss();
  }
}

/* Location:
 * Qualified Name:     l.n0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */