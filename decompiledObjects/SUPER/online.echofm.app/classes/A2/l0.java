package A2;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public abstract class l0
{
  public static final Uri a;
  public static final Uri b;
  
  static
  {
    Uri localUri = Uri.parse("https://plus.google.com/");
    a = localUri;
    b = localUri.buildUpon().appendPath("circles").appendPath("find").build();
  }
  
  public static Intent a()
  {
    Intent localIntent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }
  
  public static Intent b(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    paramString1 = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
    if (!TextUtils.isEmpty(paramString2)) {
      paramString1.appendQueryParameter("pcampaignid", paramString2);
    }
    localIntent.setData(paramString1.build());
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
  
  public static Intent c(String paramString)
  {
    paramString = Uri.fromParts("package", "com.google.android.gms", null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(paramString);
    return localIntent;
  }
}

/* Location:
 * Qualified Name:     A2.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */