package O1;

import T1.a;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

public final class F$a
  extends Handler
{
  public F$a(F paramF) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramMessage, "message");
      a.d(paramMessage);
      return;
    }
    finally
    {
      a.b(paramMessage, this);
    }
  }
}

/* Location:
 * Qualified Name:     O1.F.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */