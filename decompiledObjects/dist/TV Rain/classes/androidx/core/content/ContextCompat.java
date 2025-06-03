package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.ObjectsCompat;
import c;
import d;
import f0;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;
import z2;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ContextCompat
{
  private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
  public static final int RECEIVER_EXPORTED = 2;
  public static final int RECEIVER_NOT_EXPORTED = 4;
  public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
  private static final String TAG = "ContextCompat";
  private static final Object sLock = new Object();
  private static final Object sSync = new Object();
  private static TypedValue sTempValue;
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static int checkSelfPermission(@NonNull Context paramContext, @NonNull String paramString)
  {
    ObjectsCompat.requireNonNull(paramString, "permission must be non-null");
    if ((!BuildCompat.isAtLeastT()) && (TextUtils.equals("android.permission.POST_NOTIFICATIONS", paramString)))
    {
      int i;
      if (NotificationManagerCompat.from(paramContext).areNotificationsEnabled()) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }
  
  @Nullable
  public static Context createDeviceProtectedStorageContext(@NonNull Context paramContext)
  {
    return Api24Impl.createDeviceProtectedStorageContext(paramContext);
  }
  
  private static File createFilesDir(File paramFile)
  {
    synchronized (sSync)
    {
      if (!paramFile.exists())
      {
        if (paramFile.mkdirs()) {
          return paramFile;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unable to create files subdir ");
        localStringBuilder.append(paramFile.getPath());
        Log.w("ContextCompat", localStringBuilder.toString());
      }
      return paramFile;
    }
  }
  
  @Nullable
  public static String getAttributionTag(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getAttributionTag(paramContext);
    }
    return null;
  }
  
  @NonNull
  public static File getCodeCacheDir(@NonNull Context paramContext)
  {
    return Api21Impl.getCodeCacheDir(paramContext);
  }
  
  @ColorInt
  public static int getColor(@NonNull Context paramContext, @ColorRes int paramInt)
  {
    return Api23Impl.getColor(paramContext, paramInt);
  }
  
  @Nullable
  public static ColorStateList getColorStateList(@NonNull Context paramContext, @ColorRes int paramInt)
  {
    return ResourcesCompat.getColorStateList(paramContext.getResources(), paramInt, paramContext.getTheme());
  }
  
  @Nullable
  public static File getDataDir(@NonNull Context paramContext)
  {
    return Api24Impl.getDataDir(paramContext);
  }
  
  @Nullable
  public static Drawable getDrawable(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    return Api21Impl.getDrawable(paramContext, paramInt);
  }
  
  @NonNull
  public static File[] getExternalCacheDirs(@NonNull Context paramContext)
  {
    return Api19Impl.getExternalCacheDirs(paramContext);
  }
  
  @NonNull
  public static File[] getExternalFilesDirs(@NonNull Context paramContext, @Nullable String paramString)
  {
    return Api19Impl.getExternalFilesDirs(paramContext, paramString);
  }
  
  @NonNull
  public static Executor getMainExecutor(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getMainExecutor(paramContext);
    }
    return ExecutorCompat.create(new Handler(paramContext.getMainLooper()));
  }
  
  @Nullable
  public static File getNoBackupFilesDir(@NonNull Context paramContext)
  {
    return Api21Impl.getNoBackupFilesDir(paramContext);
  }
  
  @NonNull
  public static File[] getObbDirs(@NonNull Context paramContext)
  {
    return Api19Impl.getObbDirs(paramContext);
  }
  
  @Nullable
  public static <T> T getSystemService(@NonNull Context paramContext, @NonNull Class<T> paramClass)
  {
    return (T)Api23Impl.getSystemService(paramContext, paramClass);
  }
  
  @Nullable
  public static String getSystemServiceName(@NonNull Context paramContext, @NonNull Class<?> paramClass)
  {
    return Api23Impl.getSystemServiceName(paramContext, paramClass);
  }
  
  public static boolean isDeviceProtectedStorage(@NonNull Context paramContext)
  {
    return Api24Impl.isDeviceProtectedStorage(paramContext);
  }
  
  public static String obtainAndCheckReceiverPermission(Context paramContext)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramContext.getPackageName());
    ((StringBuilder)localObject).append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
    localObject = ((StringBuilder)localObject).toString();
    if (PermissionChecker.checkSelfPermission(paramContext, (String)localObject) == 0) {
      return (String)localObject;
    }
    throw new RuntimeException(z2.p("Permission ", (String)localObject, " is required by your application to receive broadcasts, please add it to your manifest"));
  }
  
  @Nullable
  public static Intent registerReceiver(@NonNull Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, @NonNull IntentFilter paramIntentFilter, int paramInt)
  {
    return registerReceiver(paramContext, paramBroadcastReceiver, paramIntentFilter, null, null, paramInt);
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static Intent registerReceiver(@NonNull Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, @NonNull IntentFilter paramIntentFilter, @Nullable String paramString, @Nullable Handler paramHandler, int paramInt)
  {
    int i = paramInt & 0x1;
    if ((i != 0) && ((paramInt & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }
    int j = paramInt;
    if (i != 0) {
      j = paramInt | 0x2;
    }
    paramInt = j & 0x2;
    if ((paramInt == 0) && ((j & 0x4) == 0)) {
      throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
    }
    if ((paramInt != 0) && ((j & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }
    if (BuildCompat.isAtLeastT()) {
      return Api33Impl.registerReceiver(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.registerReceiver(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (((j & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, obtainAndCheckReceiverPermission(paramContext), paramHandler);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler);
  }
  
  public static boolean startActivities(@NonNull Context paramContext, @NonNull Intent[] paramArrayOfIntent)
  {
    return startActivities(paramContext, paramArrayOfIntent, null);
  }
  
  public static boolean startActivities(@NonNull Context paramContext, @NonNull Intent[] paramArrayOfIntent, @Nullable Bundle paramBundle)
  {
    Api16Impl.startActivities(paramContext, paramArrayOfIntent, paramBundle);
    return true;
  }
  
  public static void startActivity(@NonNull Context paramContext, @NonNull Intent paramIntent, @Nullable Bundle paramBundle)
  {
    Api16Impl.startActivity(paramContext, paramIntent, paramBundle);
  }
  
  public static void startForegroundService(@NonNull Context paramContext, @NonNull Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.startForegroundService(paramContext, paramIntent);
    } else {
      paramContext.startService(paramIntent);
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static void startActivities(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
    {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    }
    
    @DoNotInline
    public static void startActivity(Context paramContext, Intent paramIntent, Bundle paramBundle)
    {
      paramContext.startActivity(paramIntent, paramBundle);
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static File[] getExternalCacheDirs(Context paramContext)
    {
      return paramContext.getExternalCacheDirs();
    }
    
    @DoNotInline
    public static File[] getExternalFilesDirs(Context paramContext, String paramString)
    {
      return paramContext.getExternalFilesDirs(paramString);
    }
    
    @DoNotInline
    public static File[] getObbDirs(Context paramContext)
    {
      return paramContext.getObbDirs();
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static File getCodeCacheDir(Context paramContext)
    {
      return paramContext.getCodeCacheDir();
    }
    
    @DoNotInline
    public static Drawable getDrawable(Context paramContext, int paramInt)
    {
      return paramContext.getDrawable(paramInt);
    }
    
    @DoNotInline
    public static File getNoBackupFilesDir(Context paramContext)
    {
      return paramContext.getNoBackupFilesDir();
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static int getColor(Context paramContext, int paramInt)
    {
      return paramContext.getColor(paramInt);
    }
    
    @DoNotInline
    public static <T> T getSystemService(Context paramContext, Class<T> paramClass)
    {
      return (T)paramContext.getSystemService(paramClass);
    }
    
    @DoNotInline
    public static String getSystemServiceName(Context paramContext, Class<?> paramClass)
    {
      return paramContext.getSystemServiceName(paramClass);
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static Context createDeviceProtectedStorageContext(Context paramContext)
    {
      return paramContext.createDeviceProtectedStorageContext();
    }
    
    @DoNotInline
    public static File getDataDir(Context paramContext)
    {
      return paramContext.getDataDir();
    }
    
    @DoNotInline
    public static boolean isDeviceProtectedStorage(Context paramContext)
    {
      return paramContext.isDeviceProtectedStorage();
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static Intent registerReceiver(Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      if (((paramInt & 0x4) != 0) && (paramString == null)) {
        return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, ContextCompat.obtainAndCheckReceiverPermission(paramContext), paramHandler);
      }
      return f0.j(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
    }
    
    @DoNotInline
    public static ComponentName startForegroundService(Context paramContext, Intent paramIntent)
    {
      return f0.i(paramContext, paramIntent);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static Executor getMainExecutor(Context paramContext)
    {
      return c.q(paramContext);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static String getAttributionTag(Context paramContext)
    {
      return d.n(paramContext);
    }
  }
  
  @RequiresApi(33)
  public static class Api33Impl
  {
    @DoNotInline
    public static Intent registerReceiver(Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      return f0.j(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
    }
  }
  
  public static final class LegacyServiceMapHolder
  {
    public static final HashMap<Class<?>, String> SERVICES;
    
    static
    {
      HashMap localHashMap = new HashMap();
      SERVICES = localHashMap;
      localHashMap.put(SubscriptionManager.class, "telephony_subscription_service");
      localHashMap.put(UsageStatsManager.class, "usagestats");
      localHashMap.put(AppWidgetManager.class, "appwidget");
      localHashMap.put(BatteryManager.class, "batterymanager");
      localHashMap.put(CameraManager.class, "camera");
      localHashMap.put(JobScheduler.class, "jobscheduler");
      localHashMap.put(LauncherApps.class, "launcherapps");
      localHashMap.put(MediaProjectionManager.class, "media_projection");
      localHashMap.put(MediaSessionManager.class, "media_session");
      localHashMap.put(RestrictionsManager.class, "restrictions");
      localHashMap.put(TelecomManager.class, "telecom");
      localHashMap.put(TvInputManager.class, "tv_input");
      localHashMap.put(AppOpsManager.class, "appops");
      localHashMap.put(CaptioningManager.class, "captioning");
      localHashMap.put(ConsumerIrManager.class, "consumer_ir");
      localHashMap.put(PrintManager.class, "print");
      localHashMap.put(BluetoothManager.class, "bluetooth");
      localHashMap.put(DisplayManager.class, "display");
      localHashMap.put(UserManager.class, "user");
      localHashMap.put(InputManager.class, "input");
      localHashMap.put(MediaRouter.class, "media_router");
      localHashMap.put(NsdManager.class, "servicediscovery");
      localHashMap.put(AccessibilityManager.class, "accessibility");
      localHashMap.put(AccountManager.class, "account");
      localHashMap.put(ActivityManager.class, "activity");
      localHashMap.put(AlarmManager.class, "alarm");
      localHashMap.put(AudioManager.class, "audio");
      localHashMap.put(ClipboardManager.class, "clipboard");
      localHashMap.put(ConnectivityManager.class, "connectivity");
      localHashMap.put(DevicePolicyManager.class, "device_policy");
      localHashMap.put(DownloadManager.class, "download");
      localHashMap.put(DropBoxManager.class, "dropbox");
      localHashMap.put(InputMethodManager.class, "input_method");
      localHashMap.put(KeyguardManager.class, "keyguard");
      localHashMap.put(LayoutInflater.class, "layout_inflater");
      localHashMap.put(LocationManager.class, "location");
      localHashMap.put(NfcManager.class, "nfc");
      localHashMap.put(NotificationManager.class, "notification");
      localHashMap.put(PowerManager.class, "power");
      localHashMap.put(SearchManager.class, "search");
      localHashMap.put(SensorManager.class, "sensor");
      localHashMap.put(StorageManager.class, "storage");
      localHashMap.put(TelephonyManager.class, "phone");
      localHashMap.put(TextServicesManager.class, "textservices");
      localHashMap.put(UiModeManager.class, "uimode");
      localHashMap.put(UsbManager.class, "usb");
      localHashMap.put(Vibrator.class, "vibrator");
      localHashMap.put(WallpaperManager.class, "wallpaper");
      localHashMap.put(WifiP2pManager.class, "wifip2p");
      localHashMap.put(WifiManager.class, "wifi");
      localHashMap.put(WindowManager.class, "window");
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface RegisterReceiverFlags {}
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */