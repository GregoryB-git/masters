package u;

import aa.u;
import aa.v;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Build.VERSION;

public final class z
{
  public static RemoteInput a(z paramz)
  {
    paramz.getClass();
    paramz = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
    if (Build.VERSION.SDK_INT >= 29) {
      a.b(paramz, 0);
    }
    return paramz.build();
  }
  
  public static final class a
  {
    public static int a(Object paramObject)
    {
      return v.a((RemoteInput)paramObject);
    }
    
    public static RemoteInput.Builder b(RemoteInput.Builder paramBuilder, int paramInt)
    {
      return u.b(paramBuilder, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     u.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */