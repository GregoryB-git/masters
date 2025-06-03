package m0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

public final class a$a
  extends ContentObserver
{
  public a$a(a parama)
  {
    super(new Handler());
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    a locala = a;
    if (b)
    {
      Cursor localCursor = c;
      if ((localCursor != null) && (!localCursor.isClosed())) {
        a = c.requery();
      }
    }
  }
}

/* Location:
 * Qualified Name:     m0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */