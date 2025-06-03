package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class IntentCompat
{
  @SuppressLint({"ActionValue"})
  public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
  public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
  public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
  public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TIME = "android.intent.extra.TIME";
  
  @NonNull
  public static Intent createManageUnusedAppRestrictionsIntent(@NonNull Context paramContext, @NonNull String paramString)
  {
    if (PackageManagerCompat.areUnusedAppRestrictionsAvailable(paramContext.getPackageManager()))
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 31) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", paramString, null));
      }
      paramString = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", paramString, null));
      if (i >= 30) {
        return paramString;
      }
      return paramString.setPackage((String)Preconditions.checkNotNull(PackageManagerCompat.getPermissionRevocationVerifierApp(paramContext.getPackageManager())));
    }
    throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
  }
  
  @NonNull
  public static Intent makeMainSelectorActivity(@NonNull String paramString1, @NonNull String paramString2)
  {
    return Api15Impl.makeMainSelectorActivity(paramString1, paramString2);
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static Intent makeMainSelectorActivity(String paramString1, String paramString2)
    {
      return Intent.makeMainSelectorActivity(paramString1, paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */