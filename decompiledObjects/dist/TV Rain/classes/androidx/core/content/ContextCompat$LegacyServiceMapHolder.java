package androidx.core.content;

import android.accounts.AccountManager;
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
import android.content.ClipboardManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
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
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.util.HashMap;

final class ContextCompat$LegacyServiceMapHolder
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

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.LegacyServiceMapHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */