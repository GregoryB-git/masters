package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b.a0;
import c8.b0;
import c8.b1;
import c8.c1;
import c8.d1;
import c8.f0;
import c8.p;
import c8.u0;
import c8.v0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzads;
import com.google.android.gms.internal.firebase_auth_api.zza;
import com.google.android.gms.internal.firebase_auth_api.zzadq;
import com.google.android.gms.internal.firebase_auth_api.zzadv;
import com.google.android.gms.internal.firebase_auth_api.zzafm;
import com.google.android.gms.internal.firebase_auth_api.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import l6.t;
import org.json.JSONException;
import org.json.JSONObject;
import t9.b;
import u7.f;
import x0.m;

public class GenericIdpActivity
  extends m
  implements zzads
{
  public static long b;
  public static final u0 c = u0.c;
  public boolean a = false;
  
  public final Uri.Builder h(Uri.Builder paramBuilder, Intent paramIntent, String paramString1, String paramString2)
  {
    String str1 = paramIntent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
    String str2 = paramIntent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
    String str3 = paramIntent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
    Object localObject1 = paramIntent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
    Object localObject2 = paramIntent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
    if ((localObject2 != null) && (!((ArrayList)localObject2).isEmpty())) {
      localObject2 = TextUtils.join(",", (Iterable)localObject2);
    } else {
      localObject2 = null;
    }
    Bundle localBundle = paramIntent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
    Object localObject3;
    Object localObject4;
    if (localBundle == null)
    {
      localObject3 = null;
    }
    else
    {
      localObject3 = new JSONObject();
      try
      {
        localObject4 = localBundle.keySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (String)((Iterator)localObject4).next();
          localObject6 = localBundle.getString((String)localObject5);
          if (!TextUtils.isEmpty((CharSequence)localObject6)) {
            ((JSONObject)localObject3).put((String)localObject5, localObject6);
          }
        }
        localObject4 = UUID.randomUUID().toString();
      }
      catch (JSONException localJSONException)
      {
        Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        localObject3 = ((JSONObject)localObject3).toString();
      }
    }
    String str4 = zzadv.zza(this, UUID.randomUUID().toString());
    Object localObject5 = paramIntent.getAction();
    paramIntent = paramIntent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
    Object localObject6 = b1.a;
    Object localObject7 = getApplicationContext();
    try
    {
      m6.j.e(paramString1);
      m6.j.e((String)localObject4);
      m6.j.e(str4);
      m6.j.e((String)localObject1);
      localObject7 = b1.a((Context)localObject7, paramString1);
      b1.b((SharedPreferences)localObject7);
      localObject7 = ((SharedPreferences)localObject7).edit();
      ((SharedPreferences.Editor)localObject7).putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[] { localObject4 }), str4);
      ((SharedPreferences.Editor)localObject7).putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[] { localObject4 }), (String)localObject5);
      ((SharedPreferences.Editor)localObject7).putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[] { localObject4 }), str2);
      ((SharedPreferences.Editor)localObject7).putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[] { localObject4 }), (String)localObject1);
      ((SharedPreferences.Editor)localObject7).putString("com.google.firebase.auth.api.gms.config.tenant.id", str3);
      ((SharedPreferences.Editor)localObject7).apply();
      localObject1 = f.f((String)localObject1);
      localObject6 = c1.a(getApplicationContext(), ((f)localObject1).g()).b();
      if (TextUtils.isEmpty((CharSequence)localObject6))
      {
        Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
        i(p.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
        return null;
      }
      if (str4 == null) {
        return null;
      }
      localObject1 = paramBuilder.appendQueryParameter("eid", "p");
      localObject5 = new StringBuilder("X");
      ((StringBuilder)localObject5).append(paramIntent);
      ((Uri.Builder)localObject1).appendQueryParameter("v", ((StringBuilder)localObject5).toString()).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", str1).appendQueryParameter("providerId", str2).appendQueryParameter("sessionId", str4).appendQueryParameter("eventId", (String)localObject4).appendQueryParameter("apn", paramString1).appendQueryParameter("sha1Cert", paramString2).appendQueryParameter("publicKey", (String)localObject6);
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        paramBuilder.appendQueryParameter("scopes", (String)localObject2);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        paramBuilder.appendQueryParameter("customParameters", (String)localObject3);
      }
      if (!TextUtils.isEmpty(str3)) {
        paramBuilder.appendQueryParameter("tid", str3);
      }
      return paramBuilder;
    }
    finally {}
  }
  
  public final void i(Status paramStatus)
  {
    b = 0L;
    a = false;
    Intent localIntent = new Intent();
    Object localObject = v0.a;
    Parcel localParcel = Parcel.obtain();
    paramStatus.writeToParcel(localParcel, 0);
    localObject = localParcel.marshall();
    localParcel.recycle();
    localIntent.putExtra("com.google.firebase.auth.internal.STATUS", (byte[])localObject);
    localIntent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    if (!f1.a.a(this).b(localIntent)) {
      f0.a(getApplicationContext(), paramStatus);
    } else {
      c.a(this);
    }
    finish();
  }
  
  public final void j()
  {
    b = 0L;
    a = false;
    Intent localIntent = new Intent();
    localIntent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
    localIntent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    if (!f1.a.a(this).b(localIntent)) {
      f0.a(this, p.a("WEB_CONTEXT_CANCELED"));
    } else {
      c.a(this);
    }
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getIntent().getAction();
    if ((!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str)) && (!"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str)) && (!"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str)) && (!"android.intent.action.VIEW".equals(str)))
    {
      paramBundle = new StringBuilder("Could not do operation - unknown action: ");
      paramBundle.append(str);
      Log.e("GenericIdpActivity", paramBundle.toString());
      j();
      return;
    }
    long l = System.currentTimeMillis();
    if (l - b < 30000L)
    {
      Log.e("GenericIdpActivity", "Could not start operation - already in progress");
      return;
    }
    b = l;
    if (paramBundle != null) {
      a = paramBundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
    }
  }
  
  public final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
  }
  
  public final void onResume()
  {
    super.onResume();
    String str1;
    Object localObject2;
    if ("android.intent.action.VIEW".equals(getIntent().getAction()))
    {
      ??? = getIntent();
      if (((Intent)???).hasExtra("firebaseError"))
      {
        i(v0.a(((Intent)???).getStringExtra("firebaseError")));
        return;
      }
      if ((((Intent)???).hasExtra("link")) && (((Intent)???).hasExtra("eventId")))
      {
        str1 = ((Intent)???).getStringExtra("link");
        localObject2 = ((Intent)???).getStringExtra("eventId");
        Object localObject3 = getPackageName();
        boolean bool = ((Intent)???).getBooleanExtra("encryptionEnabled", true);
        synchronized (b1.a)
        {
          m6.j.e((String)localObject3);
          m6.j.e((String)localObject2);
          Object localObject5 = b1.a(this, (String)localObject3);
          Object localObject6 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[] { localObject2 });
          localObject3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[] { localObject2 });
          Object localObject7 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[] { localObject2 });
          String str3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[] { localObject2 });
          localObject2 = null;
          String str4 = ((SharedPreferences)localObject5).getString((String)localObject6, null);
          Object localObject8 = ((SharedPreferences)localObject5).getString((String)localObject3, null);
          String str5 = ((SharedPreferences)localObject5).getString((String)localObject7, null);
          String str6 = ((SharedPreferences)localObject5).getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
          String str7 = ((SharedPreferences)localObject5).getString(str3, null);
          localObject5 = ((SharedPreferences)localObject5).edit();
          ((SharedPreferences.Editor)localObject5).remove((String)localObject6);
          ((SharedPreferences.Editor)localObject5).remove((String)localObject3);
          ((SharedPreferences.Editor)localObject5).remove((String)localObject7);
          ((SharedPreferences.Editor)localObject5).remove(str3);
          ((SharedPreferences.Editor)localObject5).apply();
          if ((str4 != null) && (localObject8 != null) && (str5 != null)) {
            localObject3 = new d1(str4, (String)localObject8, str5, str6, str7);
          } else {
            localObject3 = null;
          }
          if (localObject3 == null) {
            j();
          }
          ??? = str1;
          if (bool) {
            ??? = c1.a(getApplicationContext(), f.f(e).g()).c(str1);
          }
          localObject7 = new zzaic((d1)localObject3, (String)???);
          ??? = d;
          str1 = b;
          ((zzaic)localObject7).zzb((String)???);
          if ((!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str1)) && (!"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str1)) && (!"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str1)))
          {
            localObject3 = new StringBuilder("unsupported operation: ");
            ((StringBuilder)localObject3).append(str1);
            Log.e("GenericIdpActivity", ((StringBuilder)localObject3).toString());
            j();
            return;
          }
          b = 0L;
          a = false;
          localObject3 = new Intent();
          localObject8 = Parcel.obtain();
          ((Parcelable)localObject7).writeToParcel((Parcel)localObject8, 0);
          localObject6 = ((Parcel)localObject8).marshall();
          ((Parcel)localObject8).recycle();
          ((Intent)localObject3).putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", (byte[])localObject6);
          ((Intent)localObject3).putExtra("com.google.firebase.auth.internal.OPERATION", str1);
          ((Intent)localObject3).setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
          if (!f1.a.a(this).b((Intent)localObject3))
          {
            localObject3 = getApplicationContext();
            localObject6 = f0.c;
            localObject6 = ((Context)localObject3).getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            localObject3 = Parcel.obtain();
            ((Parcelable)localObject7).writeToParcel((Parcel)localObject3, 0);
            localObject7 = ((Parcel)localObject3).marshall();
            ((Parcel)localObject3).recycle();
            if (localObject7 == null) {
              localObject3 = localObject2;
            } else {
              localObject3 = Base64.encodeToString((byte[])localObject7, 10);
            }
            ((SharedPreferences.Editor)localObject6).putString("verifyAssertionRequest", (String)localObject3);
            ((SharedPreferences.Editor)localObject6).putString("operation", str1);
            ((SharedPreferences.Editor)localObject6).putString("tenantId", (String)???);
            ((SharedPreferences.Editor)localObject6).putLong("timestamp", System.currentTimeMillis());
            ((SharedPreferences.Editor)localObject6).commit();
          }
          else
          {
            c.a(this);
          }
          finish();
          return;
        }
      }
      j();
      return;
    }
    if (!a)
    {
      String str2 = getPackageName();
      try
      {
        str1 = a0.o(v6.a.a(this, str2)).toLowerCase(Locale.US);
        localObject2 = f.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
        ??? = FirebaseAuth.getInstance((f)localObject2);
        if (!zzafm.zza((f)localObject2))
        {
          new zzadq(str2, str1, getIntent(), (f)localObject2, this).executeOnExecutor(y, new Void[0]);
        }
        else
        {
          ((f)localObject2).a();
          zza(h(Uri.parse(zzafm.zza(c.a)).buildUpon(), getIntent(), str2, str1).build(), str2, v);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject2 = String.valueOf(localNameNotFoundException);
        StringBuilder localStringBuilder = new StringBuilder("Could not get package signature: ");
        localStringBuilder.append(str2);
        localStringBuilder.append(" ");
        localStringBuilder.append((String)localObject2);
        Log.e("GenericIdpActivity", localStringBuilder.toString());
        zzadv.zzb(this, str2);
      }
      a = true;
      return;
    }
    j();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", a);
  }
  
  public final Context zza()
  {
    return getApplicationContext();
  }
  
  public final Uri.Builder zza(Intent paramIntent, String paramString1, String paramString2)
  {
    return h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), paramIntent, paramString1, paramString2);
  }
  
  public final String zza(String paramString)
  {
    return zzafm.zzb(paramString);
  }
  
  public final HttpURLConnection zza(URL paramURL)
  {
    try
    {
      paramURL = (HttpURLConnection)zza.zza().zza(paramURL, "client-firebase-auth-api");
      return paramURL;
    }
    catch (IOException paramURL)
    {
      Log.e("GenericIdpActivity", "Error generating URL connection");
    }
    return null;
  }
  
  public final void zza(Uri paramUri, String paramString, b<a8.a> paramb)
  {
    paramb = (a8.a)paramb.get();
    if (paramb != null) {
      paramUri = paramb.a().continueWith(new b0(paramUri, 0));
    } else {
      paramUri = Tasks.forResult(paramUri);
    }
    paramUri.addOnCompleteListener(new t(this, paramString));
  }
  
  public final void zza(String paramString, Status paramStatus)
  {
    if (paramStatus == null)
    {
      j();
      return;
    }
    i(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.internal.GenericIdpActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */