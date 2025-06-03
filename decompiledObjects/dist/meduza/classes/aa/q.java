package aa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ba.a.a;
import ba.a.b;
import ba.a.c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import h3.e;
import h3.g;
import h3.i;
import java.util.concurrent.ExecutionException;
import k3.u;
import u7.f;
import u9.d;
import w3.v;

public final class q
{
  public static boolean a()
  {
    for (;;)
    {
      try
      {
        f.e();
        localObject1 = f.e();
        ((f)localObject1).a();
        localObject1 = a;
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
          localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if (localObject1 != null)
          {
            localObject2 = metaData;
            if ((localObject2 != null) && (((BaseBundle)localObject2).containsKey("delivery_metrics_exported_to_big_query_enabled")))
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
  
  public static void b(Intent paramIntent)
  {
    if (d(paramIntent)) {
      c(paramIntent.getExtras(), "_nr");
    }
    int i = 0;
    boolean bool;
    if ((paramIntent != null) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(paramIntent.getAction()))) {
      bool = a();
    } else {
      bool = false;
    }
    if (bool)
    {
      a.a locala = a.a.b;
      i locali = (i)FirebaseMessaging.n.get();
      if (locali == null)
      {
        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
      }
      else
      {
        Object localObject2;
        int k;
        Object localObject5;
        if (paramIntent == null)
        {
          localObject1 = null;
        }
        else
        {
          localObject1 = paramIntent.getExtras();
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = Bundle.EMPTY;
          }
          localObject1 = ((BaseBundle)localObject2).get("google.ttl");
          if ((localObject1 instanceof Integer)) {
            j = ((Integer)localObject1).intValue();
          } else {
            if (!(localObject1 instanceof String)) {
              break label206;
            }
          }
          try
          {
            j = Integer.parseInt((String)localObject1);
            k = j;
          }
          catch (NumberFormatException localNumberFormatException3)
          {
            localObject5 = new StringBuilder();
            ((StringBuilder)localObject5).append("Invalid TTL: ");
            ((StringBuilder)localObject5).append(localObject1);
            Log.w("FirebaseMessaging", ((StringBuilder)localObject5).toString());
          }
          label206:
          k = 0;
          localObject5 = ((BaseBundle)localObject2).getString("google.to");
          if (!TextUtils.isEmpty((CharSequence)localObject5)) {}
        }
        try
        {
          localObject1 = f.e();
          localObject5 = u9.c.m;
          localObject5 = (String)Tasks.await(((u9.c)((f)localObject1).c(d.class)).getId());
        }
        catch (InterruptedException paramIntent)
        {
          String str1;
          a.c localc;
          a.b localb;
          Object localObject6;
          String str2;
          String str3;
          String str4;
          long l;
          Object localObject3;
          String str5;
          Object localObject7;
          break label938;
        }
        catch (ExecutionException paramIntent) {}
        Object localObject1 = f.e();
        ((f)localObject1).a();
        str1 = a.getPackageName();
        localc = a.c.b;
        if (s.l((Bundle)localObject2)) {
          localb = a.b.c;
        } else {
          localb = a.b.b;
        }
        localObject6 = ((BaseBundle)localObject2).getString("google.delivered_priority");
        localObject1 = localObject6;
        if (localObject6 == null)
        {
          if (!"1".equals(((BaseBundle)localObject2).getString("google.priority_reduced"))) {
            localObject1 = ((BaseBundle)localObject2).getString("google.priority");
          }
        }
        else
        {
          if ("high".equals(localObject1))
          {
            j = 1;
            break label389;
          }
          if (!"normal".equals(localObject1)) {
            break label386;
          }
        }
        int j = 2;
        break label389;
        label386:
        j = 0;
        label389:
        if (j == 2) {
          i = 5;
        } else if (j == 1) {
          i = 10;
        }
        localObject6 = ((BaseBundle)localObject2).getString("google.message_id");
        localObject1 = localObject6;
        if (localObject6 == null) {
          localObject1 = ((BaseBundle)localObject2).getString("message_id");
        }
        if (localObject1 != null) {
          localObject6 = localObject1;
        } else {
          localObject6 = "";
        }
        localObject1 = ((BaseBundle)localObject2).getString("from");
        if ((localObject1 == null) || (!((String)localObject1).startsWith("/topics/"))) {
          localObject1 = null;
        }
        if (localObject1 == null) {
          localObject1 = "";
        }
        str2 = ((BaseBundle)localObject2).getString("collapse_key");
        if (str2 == null) {
          str2 = "";
        }
        str3 = ((BaseBundle)localObject2).getString("google.c.a.m_l");
        if (str3 == null) {
          str3 = "";
        }
        str4 = ((BaseBundle)localObject2).getString("google.c.a.c_l");
        if (str4 == null) {
          str4 = "";
        }
        if (((BaseBundle)localObject2).containsKey("google.c.sender.id"))
        {
          try
          {
            l = Long.parseLong(((BaseBundle)localObject2).getString("google.c.sender.id"));
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            Log.w("FirebaseMessaging", "error parsing project number", localNumberFormatException1);
          }
        }
        else
        {
          localObject3 = f.e();
          ((f)localObject3).a();
          str5 = c.e;
          if (str5 != null)
          {
            try
            {
              l = Long.parseLong(str5);
            }
            catch (NumberFormatException localNumberFormatException4)
            {
              Log.w("FirebaseMessaging", "error parsing sender ID", localNumberFormatException4);
            }
          }
          else
          {
            ((f)localObject3).a();
            localObject3 = c.b;
            if (((String)localObject3).startsWith("1:"))
            {
              localObject3 = ((String)localObject3).split(":");
              if (localObject3.length >= 2)
              {
                localObject7 = localObject3[1];
                localObject3 = localObject7;
                if (((String)localObject7).isEmpty()) {}
              }
            }
            else
            {
              try
              {
                l = Long.parseLong((String)localObject3);
              }
              catch (NumberFormatException localNumberFormatException2)
              {
                Log.w("FirebaseMessaging", "error parsing app ID", localNumberFormatException2);
              }
            }
            l = 0L;
          }
        }
        if (l <= 0L) {
          l = 0L;
        }
        localObject1 = new ba.a(l, (String)localObject6, (String)localObject5, localb, localc, str1, str2, i, k, (String)localObject1, locala, str3, str4);
        if (localObject1 != null)
        {
          try
          {
            j = paramIntent.getIntExtra("google.product_id", 111881503);
            paramIntent = new h3/b;
            paramIntent.<init>(Integer.valueOf(j));
            Object localObject4 = new h3/c;
            ((h3.c)localObject4).<init>("proto");
            localObject5 = new r3/j;
            ((r3.j)localObject5).<init>(20);
            localObject5 = locali.a("FCM_CLIENT_EVENT_LOGGING", (h3.c)localObject4, (g)localObject5);
            localObject4 = new ba/b;
            ((ba.b)localObject4).<init>((ba.a)localObject1);
            localObject1 = new h3/a;
            ((h3.a)localObject1).<init>(localObject4, e.a, paramIntent);
            localObject5.getClass();
            paramIntent = new w3/v;
            paramIntent.<init>(1);
            ((u)localObject5).a((h3.a)localObject1, paramIntent);
          }
          catch (RuntimeException paramIntent)
          {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", paramIntent);
          }
          label938:
          throw new RuntimeException(paramIntent);
        }
      }
    }
  }
  
  public static void c(Bundle paramBundle, String paramString)
  {
    try
    {
      f.e();
      Bundle localBundle1 = paramBundle;
      if (paramBundle == null) {
        localBundle1 = new Bundle();
      }
      Bundle localBundle2 = new Bundle();
      paramBundle = localBundle1.getString("google.c.a.c_id");
      if (paramBundle != null) {
        localBundle2.putString("_nmid", paramBundle);
      }
      paramBundle = localBundle1.getString("google.c.a.c_l");
      if (paramBundle != null) {
        localBundle2.putString("_nmn", paramBundle);
      }
      paramBundle = localBundle1.getString("google.c.a.m_l");
      if (!TextUtils.isEmpty(paramBundle)) {
        localBundle2.putString("label", paramBundle);
      }
      paramBundle = localBundle1.getString("google.c.a.m_c");
      if (!TextUtils.isEmpty(paramBundle)) {
        localBundle2.putString("message_channel", paramBundle);
      }
      paramBundle = localBundle1.getString("from");
      Object localObject = null;
      if ((paramBundle == null) || (!paramBundle.startsWith("/topics/"))) {
        paramBundle = null;
      }
      if (paramBundle != null) {
        localBundle2.putString("_nt", paramBundle);
      }
      paramBundle = localBundle1.getString("google.c.a.ts");
      if (paramBundle != null) {
        try
        {
          localBundle2.putInt("_nmt", Integer.parseInt(paramBundle));
        }
        catch (NumberFormatException paramBundle)
        {
          Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", paramBundle);
        }
      }
      paramBundle = (Bundle)localObject;
      if (localBundle1.containsKey("google.c.a.udt")) {
        paramBundle = localBundle1.getString("google.c.a.udt");
      }
      if (paramBundle != null) {
        try
        {
          localBundle2.putInt("_ndt", Integer.parseInt(paramBundle));
        }
        catch (NumberFormatException paramBundle)
        {
          Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", paramBundle);
        }
      }
      if (s.l(localBundle1)) {
        paramBundle = "display";
      } else {
        paramBundle = "data";
      }
      if (("_nr".equals(paramString)) || ("_nf".equals(paramString))) {
        localBundle2.putString("_nmc", paramBundle);
      }
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        paramBundle = new StringBuilder();
        paramBundle.append("Logging to scion event=");
        paramBundle.append(paramString);
        paramBundle.append(" scionPayload=");
        paramBundle.append(localBundle2);
        Log.d("FirebaseMessaging", paramBundle.toString());
      }
      paramBundle = (w7.a)f.e().c(w7.a.class);
      if (paramBundle != null) {
        paramBundle.b("fcm", paramString, localBundle2);
      } else {
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
      }
      return;
    }
    catch (IllegalStateException paramBundle)
    {
      Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
    }
  }
  
  public static boolean d(Intent paramIntent)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramIntent != null) {
      if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(paramIntent.getAction()))
      {
        bool2 = bool1;
      }
      else
      {
        paramIntent = paramIntent.getExtras();
        if (paramIntent == null) {
          bool2 = bool1;
        } else {
          bool2 = "1".equals(paramIntent.getString("google.c.a.e"));
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     aa.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */