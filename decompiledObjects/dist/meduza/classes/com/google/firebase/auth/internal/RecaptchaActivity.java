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
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import c8.b0;
import c8.b1;
import c8.c1;
import c8.f0;
import c8.h0;
import c8.p;
import c8.u0;
import c8.v0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zza;
import com.google.android.gms.internal.firebase_auth_api.zzadq;
import com.google.android.gms.internal.firebase_auth_api.zzadv;
import com.google.android.gms.internal.firebase_auth_api.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import t9.b;
import u7.f;
import x0.m;

public class RecaptchaActivity
  extends m
  implements com.google.android.gms.internal.firebase-auth-api.zzads
{
  public static long b;
  public static final u0 c = u0.c;
  public boolean a = false;
  
  /* Error */
  public final Uri.Builder h(Uri.Builder paramBuilder, Intent paramIntent, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 29
    //   3: invokevirtual 35	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6: astore 5
    //   8: invokestatic 41	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   11: invokevirtual 45	java/util/UUID:toString	()Ljava/lang/String;
    //   14: astore 6
    //   16: aload_2
    //   17: ldc 47
    //   19: invokevirtual 35	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore 7
    //   24: aload_2
    //   25: ldc 49
    //   27: invokevirtual 35	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   30: astore 8
    //   32: aload 8
    //   34: invokestatic 55	u7/f:f	(Ljava/lang/String;)Lu7/f;
    //   37: astore 9
    //   39: aload 9
    //   41: invokestatic 61	com/google/firebase/auth/FirebaseAuth:getInstance	(Lu7/f;)Lcom/google/firebase/auth/FirebaseAuth;
    //   44: astore_2
    //   45: getstatic 66	c8/b1:a	Lc8/b1;
    //   48: astore 10
    //   50: aload_0
    //   51: invokevirtual 72	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   54: astore 11
    //   56: aload 10
    //   58: monitorenter
    //   59: aload_3
    //   60: invokestatic 78	m6/j:e	(Ljava/lang/String;)V
    //   63: aload 6
    //   65: invokestatic 78	m6/j:e	(Ljava/lang/String;)V
    //   68: aload 11
    //   70: aload_3
    //   71: invokestatic 81	c8/b1:a	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    //   74: astore 11
    //   76: aload 11
    //   78: invokestatic 84	c8/b1:b	(Landroid/content/SharedPreferences;)V
    //   81: aload 11
    //   83: invokeinterface 90 1 0
    //   88: astore 11
    //   90: aload 11
    //   92: ldc 92
    //   94: iconst_1
    //   95: anewarray 94	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload 6
    //   102: aastore
    //   103: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   106: ldc 102
    //   108: invokeinterface 108 3 0
    //   113: pop
    //   114: aload 11
    //   116: ldc 110
    //   118: iconst_1
    //   119: anewarray 94	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload 6
    //   126: aastore
    //   127: invokestatic 100	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   130: aload 8
    //   132: invokeinterface 108 3 0
    //   137: pop
    //   138: aload 11
    //   140: invokeinterface 113 1 0
    //   145: aload 10
    //   147: monitorexit
    //   148: aload_0
    //   149: invokevirtual 72	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   152: aload 9
    //   154: invokevirtual 116	u7/f:g	()Ljava/lang/String;
    //   157: invokestatic 121	c8/c1:a	(Landroid/content/Context;Ljava/lang/String;)Lc8/c1;
    //   160: invokevirtual 123	c8/c1:b	()Ljava/lang/String;
    //   163: astore 10
    //   165: aload 10
    //   167: invokestatic 129	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   170: ifeq +22 -> 192
    //   173: ldc -125
    //   175: ldc -123
    //   177: invokestatic 138	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   180: pop
    //   181: aload_0
    //   182: ldc -116
    //   184: invokestatic 145	c8/p:a	(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;
    //   187: invokevirtual 149	com/google/firebase/auth/internal/RecaptchaActivity:i	(Lcom/google/android/gms/common/api/Status;)V
    //   190: aconst_null
    //   191: areturn
    //   192: aload_2
    //   193: getfield 152	com/google/firebase/auth/FirebaseAuth:h	Ljava/lang/Object;
    //   196: astore 9
    //   198: aload 9
    //   200: monitorenter
    //   201: aload_2
    //   202: getfield 155	com/google/firebase/auth/FirebaseAuth:i	Ljava/lang/String;
    //   205: astore 11
    //   207: aload 9
    //   209: monitorexit
    //   210: aload 11
    //   212: invokestatic 129	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   215: ifne +29 -> 244
    //   218: aload_2
    //   219: getfield 152	com/google/firebase/auth/FirebaseAuth:h	Ljava/lang/Object;
    //   222: astore 9
    //   224: aload 9
    //   226: monitorenter
    //   227: aload_2
    //   228: getfield 155	com/google/firebase/auth/FirebaseAuth:i	Ljava/lang/String;
    //   231: astore_2
    //   232: aload 9
    //   234: monitorexit
    //   235: goto +13 -> 248
    //   238: astore_1
    //   239: aload 9
    //   241: monitorexit
    //   242: aload_1
    //   243: athrow
    //   244: invokestatic 160	com/google/android/gms/internal/firebase_auth_api/zzaee:zza	()Ljava/lang/String;
    //   247: astore_2
    //   248: aload_1
    //   249: ldc -94
    //   251: aload 5
    //   253: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   256: ldc -86
    //   258: ldc -84
    //   260: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   263: ldc -82
    //   265: aload_3
    //   266: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   269: ldc -80
    //   271: aload_2
    //   272: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   275: ldc -78
    //   277: aload 6
    //   279: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   282: astore_3
    //   283: new 180	java/lang/StringBuilder
    //   286: dup
    //   287: ldc -74
    //   289: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   292: astore_2
    //   293: aload_2
    //   294: aload 7
    //   296: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload_3
    //   301: ldc -66
    //   303: aload_2
    //   304: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   307: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   310: ldc -63
    //   312: ldc -61
    //   314: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   317: ldc -59
    //   319: aload 8
    //   321: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   324: ldc -57
    //   326: aload 4
    //   328: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   331: ldc -55
    //   333: aload 10
    //   335: invokevirtual 168	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   338: pop
    //   339: aload_1
    //   340: areturn
    //   341: astore_1
    //   342: aload 9
    //   344: monitorexit
    //   345: aload_1
    //   346: athrow
    //   347: astore_1
    //   348: aload 10
    //   350: monitorexit
    //   351: aload_1
    //   352: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	this	RecaptchaActivity
    //   0	353	1	paramBuilder	Uri.Builder
    //   0	353	2	paramIntent	Intent
    //   0	353	3	paramString1	String
    //   0	353	4	paramString2	String
    //   6	246	5	str1	String
    //   14	264	6	str2	String
    //   22	273	7	str3	String
    //   30	290	8	str4	String
    //   48	301	10	localObject2	Object
    //   54	157	11	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   227	235	238	finally
    //   239	242	238	finally
    //   201	210	341	finally
    //   342	345	341	finally
    //   59	145	347	finally
  }
  
  public final void i(Status paramStatus)
  {
    b = 0L;
    a = false;
    Intent localIntent = new Intent();
    Object localObject = v0.a;
    localObject = Parcel.obtain();
    paramStatus.writeToParcel((Parcel)localObject, 0);
    paramStatus = ((Parcel)localObject).marshall();
    ((Parcel)localObject).recycle();
    localIntent.putExtra("com.google.firebase.auth.internal.STATUS", paramStatus);
    localIntent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    f1.a.a(this).b(localIntent);
    c.a(this);
    finish();
  }
  
  public final void j()
  {
    b = 0L;
    a = false;
    Intent localIntent = new Intent();
    localIntent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
    localIntent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    f1.a.a(this).b(localIntent);
    c.a(this);
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getIntent().getAction();
    if ((!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(str)) && (!"android.intent.action.VIEW".equals(str)))
    {
      paramBundle = new StringBuilder("Could not do operation - unknown action: ");
      paramBundle.append(str);
      Log.e("RecaptchaActivity", paramBundle.toString());
      j();
      return;
    }
    long l = System.currentTimeMillis();
    if (l - b < 30000L)
    {
      Log.e("RecaptchaActivity", "Could not start operation - already in progress");
      return;
    }
    b = l;
    if (paramBundle != null) {
      a = paramBundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if ("android.intent.action.VIEW".equals(getIntent().getAction()))
    {
      localObject1 = getIntent();
      if (((Intent)localObject1).hasExtra("firebaseError"))
      {
        i(v0.a(((Intent)localObject1).getStringExtra("firebaseError")));
        return;
      }
      if ((((Intent)localObject1).hasExtra("link")) && (((Intent)localObject1).hasExtra("eventId")))
      {
        localObject2 = ((Intent)localObject1).getStringExtra("link");
        localObject3 = b1.a;
        localObject4 = getApplicationContext();
        String str1 = getPackageName();
        Object localObject5 = ((Intent)localObject1).getStringExtra("eventId");
        try
        {
          m6.j.e(str1);
          m6.j.e((String)localObject5);
          Object localObject7 = b1.a((Context)localObject4, str1);
          str1 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[] { localObject5 });
          localObject4 = null;
          String str3 = ((SharedPreferences)localObject7).getString(str1, null);
          String str4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[] { localObject5 });
          localObject5 = ((SharedPreferences)localObject7).getString(str4, null);
          localObject7 = ((SharedPreferences)localObject7).edit();
          ((SharedPreferences.Editor)localObject7).remove(str1);
          ((SharedPreferences.Editor)localObject7).remove(str4);
          ((SharedPreferences.Editor)localObject7).apply();
          boolean bool = TextUtils.isEmpty(str3);
          if (!bool) {
            localObject4 = localObject5;
          }
          if (TextUtils.isEmpty((CharSequence)localObject4))
          {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            i(p.a("Failed to find registration for this reCAPTCHA event"));
          }
          localObject5 = localObject2;
          if (((Intent)localObject1).getBooleanExtra("encryptionEnabled", true)) {
            localObject5 = c1.a(getApplicationContext(), f.f((String)localObject4).g()).c((String)localObject2);
          }
          localObject5 = Uri.parse((String)localObject5).getQueryParameter("recaptchaToken");
          b = 0L;
          a = false;
          localObject4 = new Intent();
          ((Intent)localObject4).putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", (String)localObject5);
          ((Intent)localObject4).putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
          ((Intent)localObject4).setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
          if (!f1.a.a(this).b((Intent)localObject4))
          {
            localObject2 = getApplicationContext();
            localObject4 = f0.c;
            localObject4 = ((Context)localObject2).getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            ((SharedPreferences.Editor)localObject4).putString("recaptchaToken", (String)localObject5);
            ((SharedPreferences.Editor)localObject4).putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            ((SharedPreferences.Editor)localObject4).putLong("timestamp", System.currentTimeMillis());
            ((SharedPreferences.Editor)localObject4).commit();
          }
          else
          {
            c.a(this);
          }
          finish();
          return;
        }
        finally {}
      }
      j();
      return;
    }
    if (!a)
    {
      localObject3 = getIntent();
      String str2 = getPackageName();
      try
      {
        localObject4 = a0.o(v6.a.a(this, str2)).toLowerCase(Locale.US);
        localObject2 = f.f(((Intent)localObject3).getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
        localObject1 = FirebaseAuth.getInstance((f)localObject2);
        if (!zzafm.zza((f)localObject2))
        {
          new zzadq(str2, (String)localObject4, (Intent)localObject3, (f)localObject2, this).executeOnExecutor(y, new Void[0]);
        }
        else
        {
          ((f)localObject2).a();
          zza(h(Uri.parse(zzafm.zza(c.a)).buildUpon(), getIntent(), str2, (String)localObject4).build(), str2, v);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject2 = String.valueOf(localNameNotFoundException);
        StringBuilder localStringBuilder = new StringBuilder("Could not get package signature: ");
        localStringBuilder.append(str2);
        localStringBuilder.append(" ");
        localStringBuilder.append((String)localObject2);
        Log.e("RecaptchaActivity", localStringBuilder.toString());
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
    paramBundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", a);
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
      com.google.android.gms.internal.firebase_auth_api.zzads.zza.c("Error generating connection", new Object[0]);
    }
    return null;
  }
  
  public final void zza(Uri paramUri, String paramString, b<a8.a> paramb)
  {
    paramb = (a8.a)paramb.get();
    if (paramb != null) {
      paramUri = paramb.a().continueWith(new b0(paramUri, 1));
    } else {
      paramUri = Tasks.forResult(paramUri);
    }
    paramUri.addOnCompleteListener(new h0(this, paramString));
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
 * Qualified Name:     com.google.firebase.auth.internal.RecaptchaActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */