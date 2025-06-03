package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import w.h.c;
import w.h.e;
import x.a;
import x2.e;
import x2.f;
import x2.i;

public abstract class d
{
  public static final AtomicInteger a = new AtomicInteger((int)SystemClock.elapsedRealtime());
  
  public static PendingIntent a(Context paramContext, L paramL, String paramString, PackageManager paramPackageManager)
  {
    paramString = f(paramString, paramL, paramPackageManager);
    if (paramString == null) {
      return null;
    }
    paramString.addFlags(67108864);
    paramString.putExtras(paramL.y());
    if (q(paramL)) {
      paramString.putExtra("gcm.n.analytics_data", paramL.x());
    }
    return PendingIntent.getActivity(paramContext, g(), paramString, l(1073741824));
  }
  
  public static PendingIntent b(Context paramContext1, Context paramContext2, L paramL)
  {
    if (!q(paramL)) {
      return null;
    }
    return c(paramContext1, paramContext2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(paramL.x()));
  }
  
  public static PendingIntent c(Context paramContext1, Context paramContext2, Intent paramIntent)
  {
    return PendingIntent.getBroadcast(paramContext1, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(paramContext2.getPackageName()).putExtra("wrapped_intent", paramIntent), l(1073741824));
  }
  
  public static a d(Context paramContext1, Context paramContext2, L paramL, String paramString, Bundle paramBundle)
  {
    String str1 = paramContext2.getPackageName();
    Object localObject = paramContext2.getResources();
    PackageManager localPackageManager = paramContext2.getPackageManager();
    paramString = new h.e(paramContext2, paramString);
    String str2 = paramL.n((Resources)localObject, str1, "gcm.n.title");
    if (!TextUtils.isEmpty(str2)) {
      paramString.l(str2);
    }
    str2 = paramL.n((Resources)localObject, str1, "gcm.n.body");
    if (!TextUtils.isEmpty(str2))
    {
      paramString.k(str2);
      paramString.y(new h.c().h(str2));
    }
    paramString.w(m(localPackageManager, (Resources)localObject, str1, paramL.p("gcm.n.icon"), paramBundle));
    localObject = n(str1, paramL, (Resources)localObject);
    if (localObject != null) {
      paramString.x((Uri)localObject);
    }
    paramString.j(a(paramContext1, paramL, str1, localPackageManager));
    paramContext1 = b(paramContext1, paramContext2, paramL);
    if (paramContext1 != null) {
      paramString.n(paramContext1);
    }
    paramContext1 = h(paramContext2, paramL.p("gcm.n.color"), paramBundle);
    if (paramContext1 != null) {
      paramString.i(paramContext1.intValue());
    }
    paramString.g(paramL.a("gcm.n.sticky") ^ true);
    paramString.r(paramL.a("gcm.n.local_only"));
    paramContext1 = paramL.p("gcm.n.ticker");
    if (paramContext1 != null) {
      paramString.A(paramContext1);
    }
    paramContext1 = paramL.m();
    if (paramContext1 != null) {
      paramString.u(paramContext1.intValue());
    }
    paramContext1 = paramL.r();
    if (paramContext1 != null) {
      paramString.C(paramContext1.intValue());
    }
    paramContext1 = paramL.l();
    if (paramContext1 != null) {
      paramString.s(paramContext1.intValue());
    }
    paramContext1 = paramL.j("gcm.n.event_time");
    if (paramContext1 != null)
    {
      paramString.v(true);
      paramString.D(paramContext1.longValue());
    }
    paramContext1 = paramL.q();
    if (paramContext1 != null) {
      paramString.B(paramContext1);
    }
    paramContext1 = paramL.e();
    if (paramContext1 != null) {
      paramString.q(paramContext1[0], paramContext1[1], paramContext1[2]);
    }
    paramString.m(i(paramL));
    return new a(paramString, o(paramL), 0);
  }
  
  public static a e(Context paramContext, L paramL)
  {
    Bundle localBundle = j(paramContext.getPackageManager(), paramContext.getPackageName());
    return d(paramContext, paramContext, paramL, k(paramContext, paramL.k(), localBundle), localBundle);
  }
  
  public static Intent f(String paramString, L paramL, PackageManager paramPackageManager)
  {
    String str = paramL.p("gcm.n.click_action");
    if (!TextUtils.isEmpty(str))
    {
      paramL = new Intent(str);
      paramL.setPackage(paramString);
      paramL.setFlags(268435456);
      return paramL;
    }
    paramL = paramL.f();
    if (paramL != null)
    {
      paramPackageManager = new Intent("android.intent.action.VIEW");
      paramPackageManager.setPackage(paramString);
      paramPackageManager.setData(paramL);
      return paramPackageManager;
    }
    paramString = paramPackageManager.getLaunchIntentForPackage(paramString);
    if (paramString == null) {
      Log.w("FirebaseMessaging", "No activity found to launch app");
    }
    return paramString;
  }
  
  public static int g()
  {
    return a.incrementAndGet();
  }
  
  public static Integer h(Context paramContext, String paramString, Bundle paramBundle)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        i = Color.parseColor(paramString);
        return Integer.valueOf(i);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Color is invalid: ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(". Notification will use default color.");
        Log.w("FirebaseMessaging", localStringBuilder.toString());
      }
    }
    int i = paramBundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
    if (i != 0) {
      try
      {
        i = a.c(paramContext, i);
        return Integer.valueOf(i);
      }
      catch (Resources.NotFoundException paramContext)
      {
        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
      }
    }
    return null;
  }
  
  public static int i(L paramL)
  {
    boolean bool1 = paramL.a("gcm.n.default_sound");
    boolean bool2 = bool1;
    int j;
    if (paramL.a("gcm.n.default_vibrate_timings")) {
      j = bool1 | true;
    }
    bool1 = j;
    int i;
    if (paramL.a("gcm.n.default_light_settings")) {
      i = j | 0x4;
    }
    return i;
  }
  
  public static Bundle j(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      paramPackageManager = paramPackageManager.getApplicationInfo(paramString, 128);
      if (paramPackageManager != null)
      {
        paramPackageManager = metaData;
        if (paramPackageManager != null) {
          return paramPackageManager;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramPackageManager)
    {
      paramString = new StringBuilder();
      paramString.append("Couldn't get own application info: ");
      paramString.append(paramPackageManager);
      Log.w("FirebaseMessaging", paramString.toString());
    }
    return Bundle.EMPTY;
  }
  
  public static String k(Context paramContext, String paramString, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return null;
    }
    try
    {
      int i = getPackageManagergetApplicationInfogetPackageName0targetSdkVersion;
      if (i < 26) {
        return null;
      }
      NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService(NotificationManager.class);
      if (!TextUtils.isEmpty(paramString))
      {
        if (e.a(localNotificationManager, paramString) != null) {
          return paramString;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Notification Channel requested (");
        localStringBuilder.append(paramString);
        localStringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
        Log.w("FirebaseMessaging", localStringBuilder.toString());
      }
      paramString = paramBundle.getString("com.google.firebase.messaging.default_notification_channel_id");
      if (!TextUtils.isEmpty(paramString)) {
        if (e.a(localNotificationManager, paramString) != null) {
          return paramString;
        }
      }
      for (paramString = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";; paramString = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.")
      {
        Log.w("FirebaseMessaging", paramString);
        break;
      }
      if (e.a(localNotificationManager, "fcm_fallback_notification_channel") == null)
      {
        i = paramContext.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", paramContext.getPackageName());
        if (i == 0)
        {
          Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
          paramContext = "Misc";
        }
        else
        {
          paramContext = paramContext.getString(i);
        }
        f.a(localNotificationManager, i.a("fcm_fallback_notification_channel", paramContext, 3));
      }
      return "fcm_fallback_notification_channel";
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static int l(int paramInt)
  {
    return paramInt | 0x4000000;
  }
  
  public static int m(PackageManager paramPackageManager, Resources paramResources, String paramString1, String paramString2, Bundle paramBundle)
  {
    int i;
    if (!TextUtils.isEmpty(paramString2))
    {
      i = paramResources.getIdentifier(paramString2, "drawable", paramString1);
      if ((i != 0) && (p(paramResources, i))) {
        return i;
      }
      i = paramResources.getIdentifier(paramString2, "mipmap", paramString1);
      if ((i != 0) && (p(paramResources, i))) {
        return i;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Icon resource ");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(" not found. Notification will use default icon.");
      Log.w("FirebaseMessaging", localStringBuilder.toString());
    }
    int j = paramBundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
    if (j != 0)
    {
      i = j;
      if (p(paramResources, j)) {}
    }
    else
    {
      try
      {
        i = getApplicationInfo0icon;
      }
      catch (PackageManager.NameNotFoundException paramString1)
      {
        paramPackageManager = new StringBuilder();
        paramPackageManager.append("Couldn't get own application info: ");
        paramPackageManager.append(paramString1);
        Log.w("FirebaseMessaging", paramPackageManager.toString());
        i = j;
      }
    }
    if (i != 0)
    {
      j = i;
      if (p(paramResources, i)) {}
    }
    else
    {
      j = 17301651;
    }
    return j;
  }
  
  public static Uri n(String paramString, L paramL, Resources paramResources)
  {
    paramL = paramL.o();
    if (TextUtils.isEmpty(paramL)) {
      return null;
    }
    if ((!"default".equals(paramL)) && (paramResources.getIdentifier(paramL, "raw", paramString) != 0))
    {
      paramResources = new StringBuilder();
      paramResources.append("android.resource://");
      paramResources.append(paramString);
      paramResources.append("/raw/");
      paramResources.append(paramL);
      return Uri.parse(paramResources.toString());
    }
    return RingtoneManager.getDefaultUri(2);
  }
  
  public static String o(L paramL)
  {
    paramL = paramL.p("gcm.n.tag");
    if (!TextUtils.isEmpty(paramL)) {
      return paramL;
    }
    paramL = new StringBuilder();
    paramL.append("FCM-Notification:");
    paramL.append(SystemClock.uptimeMillis());
    return paramL.toString();
  }
  
  public static boolean p(Resources paramResources, int paramInt)
  {
    if (Build.VERSION.SDK_INT != 26) {
      return true;
    }
    try
    {
      if (c.a(paramResources.getDrawable(paramInt, null)))
      {
        paramResources = new java/lang/StringBuilder;
        paramResources.<init>();
        paramResources.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
        paramResources.append(paramInt);
        Log.e("FirebaseMessaging", paramResources.toString());
        return false;
      }
      return true;
    }
    catch (Resources.NotFoundException paramResources)
    {
      paramResources = new StringBuilder();
      paramResources.append("Couldn't find resource ");
      paramResources.append(paramInt);
      paramResources.append(", treating it as an invalid icon");
      Log.e("FirebaseMessaging", paramResources.toString());
    }
    return false;
  }
  
  public static boolean q(L paramL)
  {
    return paramL.a("google.c.a.e");
  }
  
  public static class a
  {
    public final h.e a;
    public final String b;
    public final int c;
    
    public a(h.e parame, String paramString, int paramInt)
    {
      a = parame;
      b = paramString;
      c = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */