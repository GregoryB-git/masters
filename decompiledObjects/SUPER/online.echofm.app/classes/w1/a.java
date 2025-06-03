package w1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public final class a
{
  public void a(Context paramContext, a parama, b paramb)
  {
    if (paramContext == null)
    {
      Log.d("permissions_handler", "Context cannot be null.");
      paramb.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
      return;
    }
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
      localIntent.addCategory("android.intent.category.DEFAULT");
      paramb = new java/lang/StringBuilder;
      paramb.<init>();
      paramb.append("package:");
      paramb.append(paramContext.getPackageName());
      localIntent.setData(Uri.parse(paramb.toString()));
      localIntent.addFlags(268435456);
      localIntent.addFlags(1073741824);
      localIntent.addFlags(8388608);
      paramContext.startActivity(localIntent);
      parama.a(true);
    }
    catch (Exception paramContext)
    {
      parama.a(false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */