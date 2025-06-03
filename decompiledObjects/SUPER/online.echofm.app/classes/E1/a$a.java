package E1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a$a
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
    Intrinsics.checkNotNullParameter(paramIBinder, "service");
    paramComponentName = a.a;
    paramComponentName = i.a;
    a.d(i.a(B.l(), paramIBinder));
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
  }
}

/* Location:
 * Qualified Name:     E1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */