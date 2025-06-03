package i9;

import android.database.sqlite.SQLiteTransactionListener;

public final class y0$a
  implements SQLiteTransactionListener
{
  public y0$a(y0 paramy0) {}
  
  public final void onBegin()
  {
    a.g.f();
  }
  
  public final void onCommit()
  {
    a.g.d();
  }
  
  public final void onRollback() {}
}

/* Location:
 * Qualified Name:     i9.y0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */