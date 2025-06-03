package aa;

import android.app.Notification;
import android.app.NotificationChannel;
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
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes.Builder;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import f;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import u.p;
import u.q;
import u.q.a;
import v.a;

public final class e
{
  public static final AtomicInteger a = new AtomicInteger((int)SystemClock.elapsedRealtime());
  
  public static a a(Context paramContext, s params)
  {
    Object localObject1 = paramContext.getPackageManager();
    Object localObject2 = paramContext.getPackageName();
    Bundle localBundle;
    try
    {
      localObject2 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, 128);
      if (localObject2 != null)
      {
        localObject1 = metaData;
        if (localObject1 != null) {
          break label71;
        }
      }
      localObject2 = params.j("gcm.n.android_channel_id");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Couldn't get own application info: ");
      ((StringBuilder)localObject2).append(localNameNotFoundException1);
      Log.w("FirebaseMessaging", ((StringBuilder)localObject2).toString());
      localBundle = Bundle.EMPTY;
    }
    label71:
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i >= 26) {}
    try
    {
      i = getPackageManagergetApplicationInfogetPackageName0targetSdkVersion;
      if (i >= 26)
      {
        localObject4 = (NotificationManager)paramContext.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          if (((NotificationManager)localObject4).getNotificationChannel((String)localObject2) == null)
          {
            localObject5 = new StringBuilder();
            ((StringBuilder)localObject5).append("Notification Channel requested (");
            ((StringBuilder)localObject5).append((String)localObject2);
            ((StringBuilder)localObject5).append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w("FirebaseMessaging", ((StringBuilder)localObject5).toString());
          }
        }
        else
        {
          localObject2 = localBundle.getString("com.google.firebase.messaging.default_notification_channel_id");
          if (!TextUtils.isEmpty((CharSequence)localObject2))
          {
            if (((NotificationManager)localObject4).getNotificationChannel((String)localObject2) != null) {
              break label322;
            }
            localObject2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
          }
          else
          {
            localObject2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
          }
          Log.w("FirebaseMessaging", (String)localObject2);
          localObject5 = "fcm_fallback_notification_channel";
          localObject2 = localObject5;
          if (((NotificationManager)localObject4).getNotificationChannel("fcm_fallback_notification_channel") == null)
          {
            i = paramContext.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", paramContext.getPackageName());
            if (i == 0)
            {
              Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
              localObject2 = "Misc";
            }
            else
            {
              localObject2 = paramContext.getString(i);
            }
            ((NotificationManager)localObject4).createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", (CharSequence)localObject2, 3));
            localObject2 = localObject5;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      Object localObject4;
      Object localObject5;
      label322:
      String str;
      Resources localResources;
      Object localObject7;
      int k;
      Object localObject6;
      Object localObject3;
      long l;
      int i1;
      int m;
      int n;
      for (;;) {}
    }
    localObject2 = null;
    str = paramContext.getPackageName();
    localResources = paramContext.getResources();
    localObject7 = paramContext.getPackageManager();
    localObject4 = new q(paramContext, (String)localObject2);
    localObject2 = params.i(localResources, str, "gcm.n.title");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      e = q.b((CharSequence)localObject2);
    }
    localObject5 = params.i(localResources, str, "gcm.n.body");
    if (!TextUtils.isEmpty((CharSequence)localObject5))
    {
      ((q)localObject4).c((CharSequence)localObject5);
      localObject2 = new p();
      b = q.b((CharSequence)localObject5);
      ((q)localObject4).g((u.s)localObject2);
    }
    localObject2 = params.j("gcm.n.icon");
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      i = localResources.getIdentifier((String)localObject2, "drawable", str);
      if ((i == 0) || (!b(localResources, i)))
      {
        i = localResources.getIdentifier((String)localObject2, "mipmap", str);
        if ((i == 0) || (!b(localResources, i)))
        {
          localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).append("Icon resource ");
          ((StringBuilder)localObject5).append((String)localObject2);
          ((StringBuilder)localObject5).append(" not found. Notification will use default icon.");
          Log.w("FirebaseMessaging", ((StringBuilder)localObject5).toString());
        }
      }
    }
    else
    {
      k = localBundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
      if ((k == 0) || (!b(localResources, k))) {
        try
        {
          i = getApplicationInfo0icon;
          k = i;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException3)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Couldn't get own application info: ");
          ((StringBuilder)localObject2).append(localNameNotFoundException3);
          Log.w("FirebaseMessaging", ((StringBuilder)localObject2).toString());
        }
      }
      if (k != 0)
      {
        i = k;
        if (b(localResources, k)) {}
      }
      else
      {
        i = 17301651;
      }
    }
    B.icon = i;
    localObject6 = params.j("gcm.n.sound2");
    localObject2 = localObject6;
    if (TextUtils.isEmpty((CharSequence)localObject6)) {
      localObject2 = params.j("gcm.n.sound");
    }
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject2 = null;
    }
    else if ((!"default".equals(localObject2)) && (localResources.getIdentifier((String)localObject2, "raw", str) != 0))
    {
      localObject6 = new StringBuilder();
      ((StringBuilder)localObject6).append("android.resource://");
      ((StringBuilder)localObject6).append(str);
      ((StringBuilder)localObject6).append("/raw/");
      ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = Uri.parse(((StringBuilder)localObject6).toString());
    }
    else
    {
      localObject2 = RingtoneManager.getDefaultUri(2);
    }
    if (localObject2 != null)
    {
      localObject6 = B;
      sound = ((Uri)localObject2);
      audioStreamType = -1;
      localObject2 = q.a.e(q.a.c(q.a.b(), 4), 5);
      B.audioAttributes = q.a.a((AudioAttributes.Builder)localObject2);
    }
    localObject2 = params.j("gcm.n.click_action");
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject2 = new Intent((String)localObject2);
      ((Intent)localObject2).setPackage(str);
      ((Intent)localObject2).setFlags(268435456);
    }
    else
    {
      localObject6 = params.e();
      if (localObject6 != null)
      {
        localObject2 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject2).setPackage(str);
        ((Intent)localObject2).setData((Uri)localObject6);
      }
      else
      {
        localObject6 = ((PackageManager)localObject7).getLaunchIntentForPackage(str);
        localObject2 = localObject6;
        if (localObject6 == null)
        {
          Log.w("FirebaseMessaging", "No activity found to launch app");
          localObject2 = localObject6;
        }
      }
    }
    if (localObject2 == null)
    {
      localObject2 = null;
    }
    else
    {
      ((Intent)localObject2).addFlags(67108864);
      localObject7 = new Bundle(a);
      localObject6 = a.keySet().iterator();
      while (((Iterator)localObject6).hasNext())
      {
        str = (String)((Iterator)localObject6).next();
        if ((!str.startsWith("google.c.")) && (!str.startsWith("gcm.n.")) && (!str.startsWith("gcm.notification."))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0) {
          ((Bundle)localObject7).remove(str);
        }
      }
      ((Intent)localObject2).putExtras((Bundle)localObject7);
      if (params.a("google.c.a.e")) {
        ((Intent)localObject2).putExtra("gcm.n.analytics_data", params.m());
      }
      localObject2 = PendingIntent.getActivity(paramContext, a.incrementAndGet(), (Intent)localObject2, 1140850688);
    }
    g = ((PendingIntent)localObject2);
    if (!params.a("google.c.a.e"))
    {
      localObject2 = null;
    }
    else
    {
      localObject2 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(params.m());
      localObject2 = PendingIntent.getBroadcast(paramContext, a.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(paramContext.getPackageName()).putExtra("wrapped_intent", (Parcelable)localObject2), 1140850688);
    }
    if (localObject2 != null) {
      B.deleteIntent = ((PendingIntent)localObject2);
    }
    localObject6 = params.j("gcm.n.color");
    if (!TextUtils.isEmpty((CharSequence)localObject6))
    {
      try
      {
        localObject2 = Integer.valueOf(Color.parseColor((String)localObject6));
        paramContext = (Context)localObject2;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Color is invalid: ");
        ((StringBuilder)localObject3).append((String)localObject6);
        ((StringBuilder)localObject3).append(". Notification will use default color.");
        Log.w("FirebaseMessaging", ((StringBuilder)localObject3).toString());
      }
    }
    else
    {
      i = localBundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
      if (i != 0) {
        try
        {
          paramContext = Integer.valueOf(a.getColor(paramContext, i));
        }
        catch (Resources.NotFoundException paramContext)
        {
          Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
        }
      } else {
        paramContext = null;
      }
    }
    if (paramContext != null) {
      w = paramContext.intValue();
    }
    ((q)localObject4).d(16, params.a("gcm.n.sticky") ^ true);
    s = params.a("gcm.n.local_only");
    paramContext = params.j("gcm.n.ticker");
    if (paramContext != null) {
      B.tickerText = q.b(paramContext);
    }
    localObject3 = params.b("gcm.n.notification_priority");
    if (localObject3 != null)
    {
      if (((Integer)localObject3).intValue() >= -2)
      {
        paramContext = (Context)localObject3;
        if (((Integer)localObject3).intValue() <= 2) {}
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append("notificationPriority is invalid ");
        paramContext.append(localObject3);
        paramContext.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", paramContext.toString());
      }
    }
    else {
      paramContext = null;
    }
    if (paramContext != null) {
      j = paramContext.intValue();
    }
    localObject3 = params.b("gcm.n.visibility");
    if (localObject3 != null)
    {
      if (((Integer)localObject3).intValue() >= -1)
      {
        paramContext = (Context)localObject3;
        if (((Integer)localObject3).intValue() <= 1) {}
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append("visibility is invalid: ");
        paramContext.append(localObject3);
        paramContext.append(". Skipping setting visibility.");
        Log.w("NotificationParams", paramContext.toString());
      }
    }
    else {
      paramContext = null;
    }
    if (paramContext != null) {
      x = paramContext.intValue();
    }
    localObject3 = params.b("gcm.n.notification_count");
    if (localObject3 != null)
    {
      paramContext = (Context)localObject3;
      if (((Integer)localObject3).intValue() < 0)
      {
        paramContext = new StringBuilder();
        paramContext.append("notificationCount is invalid: ");
        paramContext.append(localObject3);
        paramContext.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", paramContext.toString());
      }
    }
    else
    {
      paramContext = null;
    }
    if (paramContext != null) {
      i = paramContext.intValue();
    }
    paramContext = params.h();
    if (paramContext != null)
    {
      k = true;
      l = paramContext.longValue();
      B.when = l;
    }
    paramContext = params.k();
    if (paramContext != null) {
      B.vibrate = paramContext;
    }
    paramContext = params.d();
    if (paramContext != null)
    {
      i = paramContext[0];
      i1 = paramContext[1];
      k = paramContext[2];
      paramContext = B;
      ledARGB = i;
      ledOnMS = i1;
      ledOffMS = k;
      i = j;
      if (i1 != 0)
      {
        i = j;
        if (k != 0) {
          i = 1;
        }
      }
      flags = (flags & 0xFFFFFFFE | i);
    }
    m = params.a("gcm.n.default_sound");
    i = m;
    if (params.a("gcm.n.default_vibrate_timings")) {
      i = m | 0x2;
    }
    m = i;
    if (params.a("gcm.n.default_light_settings")) {
      n = i | 0x4;
    }
    paramContext = B;
    defaults = n;
    if ((n & 0x4) != 0) {
      flags |= 0x1;
    }
    paramContext = params.j("gcm.n.tag");
    if (TextUtils.isEmpty(paramContext))
    {
      paramContext = f.l("FCM-Notification:");
      paramContext.append(SystemClock.uptimeMillis());
      paramContext = paramContext.toString();
    }
    return new a((q)localObject4, paramContext);
  }
  
  public static boolean b(Resources paramResources, int paramInt)
  {
    if (Build.VERSION.SDK_INT != 26) {
      return true;
    }
    try
    {
      if ((paramResources.getDrawable(paramInt, null) instanceof AdaptiveIconDrawable))
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
  
  public static final class a
  {
    public final q a;
    public final String b;
    
    public a(q paramq, String paramString)
    {
      a = paramq;
      b = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     aa.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */