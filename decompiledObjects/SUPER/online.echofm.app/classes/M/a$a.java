package M;

import android.database.ContentObserver;
import android.os.Handler;

public class a$a
  extends ContentObserver
{
  public a$a(a parama)
  {
    super(new Handler());
  }
  
  public boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public void onChange(boolean paramBoolean)
  {
    a.i();
  }
}

/* Location:
 * Qualified Name:     M.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */