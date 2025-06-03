package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c2.c;
import c2.f;
import c2.g;
import java.util.concurrent.ExecutionException;
import s3.e;
import s4.h;
import y4.a.a;
import y4.a.b;
import y4.a.c;
import y4.a.d;
import y4.b.a;

public abstract class J
{
  public static boolean A(Intent paramIntent)
  {
    if ((paramIntent != null) && (!r(paramIntent))) {
      return a();
    }
    return false;
  }
  
  public static boolean B(Intent paramIntent)
  {
    if ((paramIntent != null) && (!r(paramIntent))) {
      return C(paramIntent.getExtras());
    }
    return false;
  }
  
  public static boolean C(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return false;
    }
    return "1".equals(paramBundle.getString("google.c.a.e"));
  }
  
  public static boolean a()
  {
    for (;;)
    {
      try
      {
        e.o();
        localObject1 = e.o().m();
        localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
        if (((SharedPreferences)localObject2).contains("export_to_big_query")) {
          return ((SharedPreferences)localObject2).getBoolean("export_to_big_query", false);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Object localObject1;
        Object localObject2;
        Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
        return false;
      }
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager();
        if (localObject2 != null)
        {
          localObject2 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if (localObject2 != null)
          {
            localObject1 = metaData;
            if ((localObject1 != null) && (((BaseBundle)localObject1).containsKey("delivery_metrics_exported_to_big_query_enabled")))
            {
              boolean bool = metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
              return bool;
            }
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    return false;
  }
  
  public static y4.a b(a.b paramb, Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    Object localObject = paramIntent.getExtras();
    paramIntent = (Intent)localObject;
    if (localObject == null) {
      paramIntent = Bundle.EMPTY;
    }
    paramb = y4.a.p().m(p(paramIntent)).e(paramb).f(f(paramIntent)).i(m()).k(a.d.q).h(k(paramIntent));
    localObject = h(paramIntent);
    if (localObject != null) {
      paramb.g((String)localObject);
    }
    localObject = o(paramIntent);
    if (localObject != null) {
      paramb.l((String)localObject);
    }
    localObject = c(paramIntent);
    if (localObject != null) {
      paramb.c((String)localObject);
    }
    localObject = i(paramIntent);
    if (localObject != null) {
      paramb.b((String)localObject);
    }
    localObject = e(paramIntent);
    if (localObject != null) {
      paramb.d((String)localObject);
    }
    long l = n(paramIntent);
    if (l > 0L) {
      paramb.j(l);
    }
    return paramb.a();
  }
  
  public static String c(Bundle paramBundle)
  {
    return paramBundle.getString("collapse_key");
  }
  
  public static String d(Bundle paramBundle)
  {
    return paramBundle.getString("google.c.a.c_id");
  }
  
  public static String e(Bundle paramBundle)
  {
    return paramBundle.getString("google.c.a.c_l");
  }
  
  public static String f(Bundle paramBundle)
  {
    paramBundle = paramBundle.getString("google.to");
    if (!TextUtils.isEmpty(paramBundle)) {
      return paramBundle;
    }
    try
    {
      paramBundle = (String)V2.m.a(h.u(e.o()).a());
      return paramBundle;
    }
    catch (InterruptedException paramBundle) {}catch (ExecutionException paramBundle) {}
    throw new RuntimeException(paramBundle);
  }
  
  public static String g(Bundle paramBundle)
  {
    return paramBundle.getString("google.c.a.m_c");
  }
  
  public static String h(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramBundle.getString("message_id");
    }
    return str2;
  }
  
  public static String i(Bundle paramBundle)
  {
    return paramBundle.getString("google.c.a.m_l");
  }
  
  public static String j(Bundle paramBundle)
  {
    return paramBundle.getString("google.c.a.ts");
  }
  
  public static a.c k(Bundle paramBundle)
  {
    if ((paramBundle != null) && (L.t(paramBundle))) {
      paramBundle = a.c.s;
    } else {
      paramBundle = a.c.q;
    }
    return paramBundle;
  }
  
  public static String l(Bundle paramBundle)
  {
    if ((paramBundle != null) && (L.t(paramBundle))) {
      paramBundle = "display";
    } else {
      paramBundle = "data";
    }
    return paramBundle;
  }
  
  public static String m()
  {
    return e.o().m().getPackageName();
  }
  
  public static long n(Bundle paramBundle)
  {
    long l;
    if (paramBundle.containsKey("google.c.sender.id")) {
      try
      {
        l = Long.parseLong(paramBundle.getString("google.c.sender.id"));
        return l;
      }
      catch (NumberFormatException paramBundle)
      {
        Log.w("FirebaseMessaging", "error parsing project number", paramBundle);
      }
    }
    paramBundle = e.o();
    String str = paramBundle.r().f();
    if (str != null) {
      try
      {
        l = Long.parseLong(str);
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Log.w("FirebaseMessaging", "error parsing sender ID", localNumberFormatException);
      }
    }
    paramBundle = paramBundle.r().c();
    if (!paramBundle.startsWith("1:"))
    {
      try
      {
        l = Long.parseLong(paramBundle);
        return l;
      }
      catch (NumberFormatException paramBundle)
      {
        Log.w("FirebaseMessaging", "error parsing app ID", paramBundle);
      }
    }
    else
    {
      paramBundle = paramBundle.split(":");
      if (paramBundle.length < 2) {
        return 0L;
      }
      paramBundle = paramBundle[1];
      if (paramBundle.isEmpty()) {
        return 0L;
      }
      l = Long.parseLong(paramBundle);
      return l;
    }
    return 0L;
  }
  
  public static String o(Bundle paramBundle)
  {
    paramBundle = paramBundle.getString("from");
    if ((paramBundle == null) || (!paramBundle.startsWith("/topics/"))) {
      paramBundle = null;
    }
    return paramBundle;
  }
  
  public static int p(Bundle paramBundle)
  {
    paramBundle = paramBundle.get("google.ttl");
    if ((paramBundle instanceof Integer)) {
      return ((Integer)paramBundle).intValue();
    }
    if ((paramBundle instanceof String)) {
      try
      {
        int i = Integer.parseInt((String)paramBundle);
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid TTL: ");
        localStringBuilder.append(paramBundle);
        Log.w("FirebaseMessaging", localStringBuilder.toString());
      }
    }
    return 0;
  }
  
  public static String q(Bundle paramBundle)
  {
    if (paramBundle.containsKey("google.c.a.udt")) {
      return paramBundle.getString("google.c.a.udt");
    }
    return null;
  }
  
  public static boolean r(Intent paramIntent)
  {
    return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(paramIntent.getAction());
  }
  
  public static void s(Intent paramIntent)
  {
    x("_nd", paramIntent.getExtras());
  }
  
  public static void t(Intent paramIntent)
  {
    x("_nf", paramIntent.getExtras());
  }
  
  public static void u(Bundle paramBundle)
  {
    z(paramBundle);
    x("_no", paramBundle);
  }
  
  public static void v(Intent paramIntent)
  {
    if (B(paramIntent)) {
      x("_nr", paramIntent.getExtras());
    }
    if (A(paramIntent)) {
      w(a.b.q, paramIntent, FirebaseMessaging.w());
    }
  }
  
  public static void w(a.b paramb, Intent paramIntent, g paramg)
  {
    if (paramg == null)
    {
      Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
      return;
    }
    y4.a locala = b(paramb, paramIntent);
    if (locala == null) {
      return;
    }
    try
    {
      paramb = c2.b.b("proto");
      paramIntent = new com/google/firebase/messaging/I;
      paramIntent.<init>();
      paramg.a("FCM_CLIENT_EVENT_LOGGING", y4.b.class, paramb, paramIntent).b(c.d(y4.b.b().b(locala).a()));
    }
    catch (RuntimeException paramb)
    {
      Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", paramb);
    }
  }
  
  public static void x(String paramString, Bundle paramBundle)
  {
    try
    {
      e.o();
      Object localObject = paramBundle;
      if (paramBundle == null) {
        localObject = new Bundle();
      }
      paramBundle = new Bundle();
      String str1 = d((Bundle)localObject);
      if (str1 != null) {
        paramBundle.putString("_nmid", str1);
      }
      str1 = e((Bundle)localObject);
      if (str1 != null) {
        paramBundle.putString("_nmn", str1);
      }
      str1 = i((Bundle)localObject);
      if (!TextUtils.isEmpty(str1)) {
        paramBundle.putString("label", str1);
      }
      str1 = g((Bundle)localObject);
      if (!TextUtils.isEmpty(str1)) {
        paramBundle.putString("message_channel", str1);
      }
      str1 = o((Bundle)localObject);
      if (str1 != null) {
        paramBundle.putString("_nt", str1);
      }
      str1 = j((Bundle)localObject);
      if (str1 != null) {
        try
        {
          paramBundle.putInt("_nmt", Integer.parseInt(str1));
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", localNumberFormatException1);
        }
      }
      String str2 = q((Bundle)localObject);
      if (str2 != null) {
        try
        {
          paramBundle.putInt("_ndt", Integer.parseInt(str2));
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", localNumberFormatException2);
        }
      }
      localObject = l((Bundle)localObject);
      if (("_nr".equals(paramString)) || ("_nf".equals(paramString))) {
        paramBundle.putString("_nmc", (String)localObject);
      }
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Logging to scion event=");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" scionPayload=");
        ((StringBuilder)localObject).append(paramBundle);
        Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
      }
      localObject = (w3.a)e.o().k(w3.a.class);
      if (localObject != null) {
        ((w3.a)localObject).e("fcm", paramString, paramBundle);
      } else {
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
      }
      return;
    }
    catch (IllegalStateException paramString)
    {
      Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
    }
  }
  
  public static void y(boolean paramBoolean)
  {
    e.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", paramBoolean).apply();
  }
  
  public static void z(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    if ("1".equals(paramBundle.getString("google.c.a.tc")))
    {
      w3.a locala = (w3.a)e.o().k(w3.a.class);
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
      }
      if (locala != null)
      {
        String str = paramBundle.getString("google.c.a.c_id");
        locala.d("fcm", "_ln", str);
        paramBundle = new Bundle();
        paramBundle.putString("source", "Firebase");
        paramBundle.putString("medium", "notification");
        paramBundle.putString("campaign", str);
        locala.e("fcm", "_cmp", paramBundle);
      }
      else
      {
        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
      }
    }
    else if (Log.isLoggable("FirebaseMessaging", 3))
    {
      Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */