package w;

import android.os.Bundle;
import android.os.IBinder;

public abstract class d$a
{
  public static IBinder a(Bundle paramBundle, String paramString)
  {
    return paramBundle.getBinder(paramString);
  }
  
  public static void b(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    paramBundle.putBinder(paramString, paramIBinder);
  }
}

/* Location:
 * Qualified Name:     w.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */