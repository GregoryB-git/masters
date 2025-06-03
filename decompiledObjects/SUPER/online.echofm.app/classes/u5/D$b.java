package u5;

import android.database.ContentObserver;
import android.os.Handler;
import t5.b;

public class D$b
  extends ContentObserver
{
  public D$b(D paramD, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    if (D.f(a) == null) {
      return;
    }
    b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
    a.B();
  }
}

/* Location:
 * Qualified Name:     u5.D.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */