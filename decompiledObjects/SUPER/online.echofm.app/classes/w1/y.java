package w1;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

public final class y
{
  public static boolean e(Context paramContext)
  {
    boolean bool = false;
    try
    {
      int i = Settings.Secure.getInt(paramContext.getContentResolver(), "location_mode");
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public void a(int paramInt, Context paramContext, a parama, b paramb)
  {
    if (paramContext == null)
    {
      Log.d("permissions_handler", "Context cannot be null.");
      paramb.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
      return;
    }
    if ((paramInt != 3) && (paramInt != 4) && (paramInt != 5))
    {
      if (paramInt == 21)
      {
        parama.a(c(paramContext));
        return;
      }
      if (paramInt == 8)
      {
        paramb = paramContext.getPackageManager();
        if (!paramb.hasSystemFeature("android.hardware.telephony"))
        {
          parama.a(2);
          return;
        }
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if ((paramContext != null) && (paramContext.getPhoneType() != 0))
        {
          if (b(paramb).isEmpty())
          {
            parama.a(2);
            return;
          }
          if (paramContext.getSimState() != 5)
          {
            parama.a(0);
            return;
          }
          parama.a(1);
          return;
        }
        parama.a(2);
        return;
      }
      if (paramInt == 16)
      {
        parama.a(1);
        return;
      }
      parama.a(2);
      return;
    }
    parama.a(d(paramContext));
  }
  
  public final List b(PackageManager paramPackageManager)
  {
    Intent localIntent = new Intent("android.intent.action.CALL");
    localIntent.setData(Uri.parse("tel:123123"));
    if (Build.VERSION.SDK_INT >= 33) {
      return x.a(paramPackageManager, localIntent, w.a(0L));
    }
    return paramPackageManager.queryIntentActivities(localIntent, 0);
  }
  
  public final boolean c(Context paramContext)
  {
    return ((BluetoothManager)paramContext.getSystemService("bluetooth")).getAdapter().isEnabled();
  }
  
  public final boolean d(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramContext = (LocationManager)paramContext.getSystemService(LocationManager.class);
      if (paramContext == null) {
        return false;
      }
      return v.a(paramContext);
    }
    return e(paramContext);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}

/* Location:
 * Qualified Name:     w1.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */