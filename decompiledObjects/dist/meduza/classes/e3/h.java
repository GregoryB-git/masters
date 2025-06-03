package e3;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

public final class h
{
  public static void a(int paramInt, Context paramContext, a parama, b paramb)
  {
    if (paramContext == null)
    {
      Log.d("permissions_handler", "Context cannot be null.");
      paramb.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
      return;
    }
    int i = 1;
    int j = 0;
    if ((paramInt != 3) && (paramInt != 4) && (paramInt != 5))
    {
      if (paramInt == 21)
      {
        parama.a(((BluetoothManager)paramContext.getSystemService("bluetooth")).getAdapter().isEnabled());
        return;
      }
      if (paramInt == 8)
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (!localPackageManager.hasSystemFeature("android.hardware.telephony"))
        {
          parama.a(2);
          return;
        }
        paramb = (TelephonyManager)paramContext.getSystemService("phone");
        if ((paramb != null) && (paramb.getPhoneType() != 0))
        {
          paramContext = new Intent("android.intent.action.CALL");
          paramContext.setData(Uri.parse("tel:123123"));
          if (Build.VERSION.SDK_INT >= 33) {
            paramContext = localPackageManager.queryIntentActivities(paramContext, PackageManager.ResolveInfoFlags.of(0L));
          } else {
            paramContext = localPackageManager.queryIntentActivities(paramContext, 0);
          }
          if (paramContext.isEmpty())
          {
            parama.a(2);
            return;
          }
          if (paramb.getSimState() != 5)
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
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramContext = (LocationManager)paramContext.getSystemService(LocationManager.class);
      if (paramContext == null) {
        paramInt = j;
      } else {
        paramInt = android.support.v4.media.session.b.p(paramContext);
      }
    }
    else
    {
      try
      {
        paramInt = Settings.Secure.getInt(paramContext.getContentResolver(), "location_mode");
        if (paramInt != 0) {
          paramInt = i;
        }
      }
      catch (Settings.SettingNotFoundException paramContext)
      {
        paramContext.printStackTrace();
        paramInt = 0;
      }
    }
    parama.a(paramInt);
  }
}

/* Location:
 * Qualified Name:     e3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */