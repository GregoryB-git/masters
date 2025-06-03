package com.google.firebase.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b8.c.a;
import b8.c0;
import b8.c1;
import b8.h0;
import b8.h1;
import b8.i1;
import b8.j1;
import b8.l1;
import b8.p1;
import b8.s;
import c8.i;
import c8.i0;
import c8.m0;
import c8.n;
import c8.n0;
import c8.r0;
import c8.t;
import c8.u0;
import c8.y;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.internal.firebase_auth_api.zzadu;
import com.google.android.gms.internal.firebase_auth_api.zzafc;
import com.google.android.gms.internal.firebase_auth_api.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l6.q0;
import m6.j;
import org.json.JSONObject;

public class FirebaseAuth
  implements c8.b
{
  public final Executor A;
  public String B;
  public final u7.f a;
  public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
  public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
  public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
  public final com.google.android.gms.internal.firebase-auth-api.zzabq e;
  public b8.r f;
  public final c8.f g;
  public final Object h = new Object();
  public String i;
  public final Object j = new Object();
  public String k;
  public m0 l;
  public final RecaptchaAction m = RecaptchaAction.custom("getOobCode");
  public final RecaptchaAction n = RecaptchaAction.custom("signInWithPassword");
  public final RecaptchaAction o = RecaptchaAction.custom("signUpPassword");
  public final RecaptchaAction p = RecaptchaAction.custom("sendVerificationCode");
  public final RecaptchaAction q = RecaptchaAction.custom("mfaSmsEnrollment");
  public final RecaptchaAction r = RecaptchaAction.custom("mfaSmsSignIn");
  public final n0 s;
  public final u0 t;
  public final y u;
  public final t9.b<a8.a> v;
  public final t9.b<q9.e> w;
  public r0 x;
  public final Executor y;
  public final Executor z;
  
  public FirebaseAuth() {}
  
  public FirebaseAuth(u7.f paramf, t9.b paramb1, t9.b arg3, Executor paramExecutor1, Executor paramExecutor2, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor3)
  {
    a = paramf;
    e = localzzabq;
    s = paramScheduledExecutorService;
    g = new c8.f();
    j.i(localu0);
    t = localu0;
    j.i(localy);
    u = localy;
    v = paramb1;
    w = ???;
    y = paramExecutor1;
    z = paramExecutor2;
    A = paramExecutor3;
    paramb1 = c.getString("com.google.firebase.auth.FIREBASE_USER", null);
    if (!TextUtils.isEmpty(paramb1)) {}
    try
    {
      paramf = new org/json/JSONObject;
      paramf.<init>(paramb1);
      if ((paramf.has("type")) && ("com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(paramf.optString("type")))) {
        paramf = paramScheduledExecutorService.a(paramf);
      }
    }
    catch (Exception paramf)
    {
      int i1;
      for (;;) {}
    }
    paramf = null;
    f = paramf;
    i1 = 1;
    if (paramf != null)
    {
      paramb1 = s;
      paramb1.getClass();
      paramf = c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[] { b.a }), null);
      if (paramf != null) {
        paramf = com.google.android.gms.internal.firebase_auth_api.zzagw.zzb(paramf);
      } else {
        paramf = null;
      }
      if (paramf != null) {
        n(this, f, paramf, false, false);
      }
    }
    ??? = t.a;
    ???.getClass();
    paramf = a;
    paramf.a();
    paramb1 = a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
    paramExecutor1 = paramb1.getString("firebaseAppName", "");
    paramf = a;
    paramf.a();
    if (b.equals(paramExecutor1))
    {
      if (paramb1.contains("verifyAssertionRequest"))
      {
        paramf = paramb1.getString("verifyAssertionRequest", "");
        paramExecutor1 = zzaic.CREATOR;
        if (paramf == null) {
          paramf = null;
        } else {
          paramf = Base64.decode(paramf, 10);
        }
        j.i(paramExecutor1);
        paramExecutor2 = Parcel.obtain();
        paramExecutor2.unmarshall(paramf, 0, paramf.length);
        paramExecutor2.setDataPosition(0);
        paramf = (n6.c)paramExecutor1.createFromParcel(paramExecutor2);
        paramExecutor2.recycle();
        paramExecutor2 = (zzaic)paramf;
        paramScheduledExecutorService = paramb1.getString("operation", "");
        paramExecutor1 = paramb1.getString("tenantId", null);
        paramf = paramb1.getString("firebaseUserUid", "");
        b = paramb1.getLong("timestamp", 0L);
        if (paramExecutor1 != null)
        {
          j.e(paramExecutor1);
          synchronized (j)
          {
            k = paramExecutor1;
            paramExecutor2.zzb(paramExecutor1);
          }
        }
        paramScheduledExecutorService.getClass();
        switch (paramScheduledExecutorService.hashCode())
        {
        }
        do
        {
          do
          {
            i1 = -1;
            break;
          } while (!paramScheduledExecutorService.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"));
          i1 = 2;
          break;
          if (paramScheduledExecutorService.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
            break;
          }
        } while ((goto 684) || (!paramScheduledExecutorService.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")));
        i1 = 0;
        switch (i1)
        {
        default: 
          break;
        case 2: 
          g(c1.H(paramExecutor2));
          break;
        case 1: 
          if (!f.a().equals(paramf)) {
            break;
          }
          i(f, c1.H(paramExecutor2));
          break;
        case 0: 
          if (!f.a().equals(paramf)) {
            break;
          }
          r(f, c1.H(paramExecutor2));
          break;
        }
      }
      else
      {
        if (!paramb1.contains("recaptchaToken")) {
          break label937;
        }
        paramf = paramb1.getString("recaptchaToken", "");
        paramExecutor1 = paramb1.getString("operation", "");
        b = paramb1.getLong("timestamp", 0L);
        paramExecutor1.getClass();
        if (!paramExecutor1.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
          a = null;
        } else {
          a = Tasks.forResult(paramf);
        }
      }
      c8.f0.d(paramb1);
      break label1008;
      label937:
      if (paramb1.contains("statusCode"))
      {
        paramf = new Status(paramb1.getInt("statusCode", 17062), paramb1.getString("statusMessage", ""), null, null);
        b = paramb1.getLong("timestamp", 0L);
        c8.f0.d(paramb1);
        Tasks.forException(zzadr.zza(paramf));
      }
    }
    label1008:
  }
  
  public static FirebaseAuth getInstance()
  {
    return (FirebaseAuth)u7.f.e().c(FirebaseAuth.class);
  }
  
  public static FirebaseAuth getInstance(u7.f paramf)
  {
    return (FirebaseAuth)paramf.c(FirebaseAuth.class);
  }
  
  public static void l(b8.d0 paramd0)
  {
    Object localObject1 = h;
    int i1 = 0;
    int i2 = 0;
    if (localObject1 != null) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if (i3 != 0)
    {
      FirebaseAuth localFirebaseAuth = a;
      j.i(localObject1);
      n localn = (n)localObject1;
      if (a != null) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      Object localObject2;
      if (i3 != 0)
      {
        localObject1 = e;
        j.e((String)localObject1);
        localObject2 = localObject1;
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
      else
      {
        localObject3 = i;
        j.i(localObject3);
        localObject1 = a;
        j.e((String)localObject1);
        localObject3 = d;
      }
      if ((g == null) || (!zzafc.zza((String)localObject1, c, f, d)))
      {
        i3 = i2;
        if (a != null) {
          i3 = 1;
        }
        if (i3 != 0) {
          localObject2 = q;
        } else {
          localObject2 = r;
        }
        u.a(localFirebaseAuth, (String)localObject3, f, localFirebaseAuth.t(), j, k, (RecaptchaAction)localObject2).addOnCompleteListener(new j1(localFirebaseAuth, paramd0, (String)localObject1));
      }
      return;
    }
    localObject1 = a;
    Object localObject3 = e;
    j.e((String)localObject3);
    int i3 = i1;
    if (g != null) {
      i3 = 1;
    }
    if ((i3 != 0) || (!zzafc.zza((String)localObject3, c, f, d))) {
      u.a((FirebaseAuth)localObject1, (String)localObject3, f, ((FirebaseAuth)localObject1).t(), j, k, p).addOnCompleteListener(new h1((FirebaseAuth)localObject1, paramd0, (String)localObject3));
    }
  }
  
  public static void m(FirebaseAuth paramFirebaseAuth, b8.r paramr)
  {
    if (paramr != null)
    {
      paramr = paramr.a();
      StringBuilder localStringBuilder = new StringBuilder("Notifying auth state listeners about user ( ");
      localStringBuilder.append(paramr);
      localStringBuilder.append(" ).");
      paramr = localStringBuilder.toString();
    }
    else
    {
      paramr = "Notifying auth state listeners about a sign-out event.";
    }
    Log.d("FirebaseAuth", paramr);
    A.execute(new g(paramFirebaseAuth));
  }
  
  /* Error */
  public static void n(FirebaseAuth paramFirebaseAuth, b8.r paramr, com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 154	m6/j:i	(Ljava/lang/Object;)V
    //   4: aload_2
    //   5: invokestatic 154	m6/j:i	(Ljava/lang/Object;)V
    //   8: aload_0
    //   9: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   12: astore 5
    //   14: iconst_1
    //   15: istore 6
    //   17: aload 5
    //   19: ifnull +26 -> 45
    //   22: aload_1
    //   23: invokevirtual 350	b8/r:a	()Ljava/lang/String;
    //   26: aload_0
    //   27: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   30: invokevirtual 350	b8/r:a	()Ljava/lang/String;
    //   33: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   36: ifeq +9 -> 45
    //   39: iconst_1
    //   40: istore 7
    //   42: goto +6 -> 48
    //   45: iconst_0
    //   46: istore 7
    //   48: iload 7
    //   50: ifne +9 -> 59
    //   53: iload 4
    //   55: ifeq +4 -> 59
    //   58: return
    //   59: aload_0
    //   60: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   63: astore 5
    //   65: aload 5
    //   67: ifnonnull +13 -> 80
    //   70: iconst_1
    //   71: istore 7
    //   73: iload 7
    //   75: istore 8
    //   77: goto +63 -> 140
    //   80: aload 5
    //   82: invokevirtual 507	b8/r:O	()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;
    //   85: invokevirtual 510	com/google/android/gms/internal/firebase_auth_api/zzagw:zzc	()Ljava/lang/String;
    //   88: aload_2
    //   89: invokevirtual 510	com/google/android/gms/internal/firebase_auth_api/zzagw:zzc	()Ljava/lang/String;
    //   92: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: istore 4
    //   97: iload 7
    //   99: ifeq +16 -> 115
    //   102: iload 4
    //   104: iconst_1
    //   105: ixor
    //   106: ifne +9 -> 115
    //   109: iconst_0
    //   110: istore 9
    //   112: goto +6 -> 118
    //   115: iconst_1
    //   116: istore 9
    //   118: iload 7
    //   120: ifne +13 -> 133
    //   123: iconst_1
    //   124: istore 7
    //   126: iload 9
    //   128: istore 8
    //   130: goto +10 -> 140
    //   133: iconst_0
    //   134: istore 7
    //   136: iload 9
    //   138: istore 8
    //   140: aload_0
    //   141: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   144: ifnull +83 -> 227
    //   147: aload_1
    //   148: invokevirtual 350	b8/r:a	()Ljava/lang/String;
    //   151: aload_0
    //   152: invokevirtual 511	com/google/firebase/auth/FirebaseAuth:a	()Ljava/lang/String;
    //   155: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   158: ifne +6 -> 164
    //   161: goto +66 -> 227
    //   164: aload_0
    //   165: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   168: aload_1
    //   169: invokevirtual 515	b8/r:F	()Ljava/util/List;
    //   172: invokevirtual 518	b8/r:J	(Ljava/util/List;)Lc8/i;
    //   175: pop
    //   176: aload_1
    //   177: invokevirtual 520	b8/r:H	()Z
    //   180: ifne +11 -> 191
    //   183: aload_0
    //   184: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   187: invokevirtual 524	b8/r:M	()Lc8/i;
    //   190: pop
    //   191: aload_1
    //   192: invokevirtual 528	b8/r:E	()Lc8/l;
    //   195: invokevirtual 533	c8/l:b	()Ljava/util/ArrayList;
    //   198: astore 10
    //   200: aload_1
    //   201: invokevirtual 536	b8/r:Q	()Ljava/util/List;
    //   204: astore 5
    //   206: aload_0
    //   207: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   210: aload 10
    //   212: invokevirtual 540	b8/r:P	(Ljava/util/List;)V
    //   215: aload_0
    //   216: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   219: aload 5
    //   221: invokevirtual 543	b8/r:N	(Ljava/util/List;)V
    //   224: goto +8 -> 232
    //   227: aload_0
    //   228: aload_1
    //   229: putfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   232: iload_3
    //   233: ifeq +932 -> 1165
    //   236: aload_0
    //   237: getfield 144	com/google/firebase/auth/FirebaseAuth:s	Lc8/n0;
    //   240: astore 10
    //   242: aload_0
    //   243: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   246: astore 11
    //   248: aload 10
    //   250: invokevirtual 216	java/lang/Object:getClass	()Ljava/lang/Class;
    //   253: pop
    //   254: aload 11
    //   256: invokestatic 154	m6/j:i	(Ljava/lang/Object;)V
    //   259: new 187	org/json/JSONObject
    //   262: dup
    //   263: invokespecial 544	org/json/JSONObject:<init>	()V
    //   266: astore 5
    //   268: ldc -36
    //   270: aload 11
    //   272: invokevirtual 216	java/lang/Object:getClass	()Ljava/lang/Class;
    //   275: invokevirtual 550	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   278: ifeq +852 -> 1130
    //   281: aload 11
    //   283: checkcast 220	c8/i
    //   286: astore 11
    //   288: aload 5
    //   290: ldc_w 552
    //   293: aload 11
    //   295: invokevirtual 555	c8/i:zze	()Ljava/lang/String;
    //   298: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   301: pop
    //   302: aload 11
    //   304: invokevirtual 562	c8/i:K	()Lu7/f;
    //   307: astore 12
    //   309: aload 12
    //   311: invokevirtual 74	u7/f:a	()V
    //   314: aload 5
    //   316: ldc_w 564
    //   319: aload 12
    //   321: getfield 257	u7/f:b	Ljava/lang/String;
    //   324: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   327: pop
    //   328: aload 5
    //   330: ldc -64
    //   332: ldc -58
    //   334: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   337: pop
    //   338: aload 11
    //   340: getfield 567	c8/i:e	Ljava/util/List;
    //   343: ifnull +424 -> 767
    //   346: new 569	org/json/JSONArray
    //   349: astore 12
    //   351: aload 12
    //   353: invokespecial 570	org/json/JSONArray:<init>	()V
    //   356: aload 11
    //   358: getfield 567	c8/i:e	Ljava/util/List;
    //   361: astore 13
    //   363: aload 13
    //   365: invokeinterface 575 1 0
    //   370: istore 14
    //   372: aload 13
    //   374: invokeinterface 575 1 0
    //   379: bipush 30
    //   381: if_icmple +43 -> 424
    //   384: aload 10
    //   386: getfield 578	c8/n0:d	Lp6/a;
    //   389: ldc_w 580
    //   392: iconst_2
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: bipush 30
    //   400: invokestatic 586	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: aload 13
    //   408: invokeinterface 575 1 0
    //   413: invokestatic 586	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   416: aastore
    //   417: invokevirtual 591	p6/a:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: bipush 30
    //   422: istore 14
    //   424: iconst_0
    //   425: istore 15
    //   427: iload 15
    //   429: istore 16
    //   431: iload 16
    //   433: istore 9
    //   435: iload 15
    //   437: iload 14
    //   439: if_icmpge +69 -> 508
    //   442: aload 13
    //   444: iload 15
    //   446: invokeinterface 595 2 0
    //   451: checkcast 225	c8/e
    //   454: astore 17
    //   456: aload 17
    //   458: getfield 596	c8/e:b	Ljava/lang/String;
    //   461: ldc_w 598
    //   464: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   467: ifeq +6 -> 473
    //   470: iconst_1
    //   471: istore 16
    //   473: iload 15
    //   475: iload 14
    //   477: iconst_1
    //   478: isub
    //   479: if_icmpne +12 -> 491
    //   482: iload 16
    //   484: istore 9
    //   486: iload 16
    //   488: ifeq +20 -> 508
    //   491: aload 12
    //   493: aload 17
    //   495: invokevirtual 600	c8/e:E	()Ljava/lang/String;
    //   498: invokevirtual 603	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   501: pop
    //   502: iinc 15 1
    //   505: goto -74 -> 431
    //   508: iload 9
    //   510: ifne +246 -> 756
    //   513: iload 14
    //   515: iconst_1
    //   516: isub
    //   517: istore 16
    //   519: iload 9
    //   521: istore 15
    //   523: iload 16
    //   525: aload 13
    //   527: invokeinterface 575 1 0
    //   532: if_icmpge +88 -> 620
    //   535: iload 9
    //   537: istore 15
    //   539: iload 16
    //   541: iflt +79 -> 620
    //   544: aload 13
    //   546: iload 16
    //   548: invokeinterface 595 2 0
    //   553: checkcast 225	c8/e
    //   556: astore 17
    //   558: aload 17
    //   560: getfield 596	c8/e:b	Ljava/lang/String;
    //   563: ldc_w 598
    //   566: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   569: ifeq +20 -> 589
    //   572: aload 12
    //   574: aload 17
    //   576: invokevirtual 600	c8/e:E	()Ljava/lang/String;
    //   579: invokevirtual 603	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   582: pop
    //   583: iconst_1
    //   584: istore 15
    //   586: goto +34 -> 620
    //   589: iload 16
    //   591: aload 13
    //   593: invokeinterface 575 1 0
    //   598: iconst_1
    //   599: isub
    //   600: if_icmpne +14 -> 614
    //   603: aload 12
    //   605: aload 17
    //   607: invokevirtual 600	c8/e:E	()Ljava/lang/String;
    //   610: invokevirtual 603	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   613: pop
    //   614: iinc 16 1
    //   617: goto -98 -> 519
    //   620: iload 15
    //   622: ifne +134 -> 756
    //   625: aload 10
    //   627: getfield 578	c8/n0:d	Lp6/a;
    //   630: ldc_w 605
    //   633: iconst_2
    //   634: anewarray 4	java/lang/Object
    //   637: dup
    //   638: iconst_0
    //   639: aload 13
    //   641: invokeinterface 575 1 0
    //   646: invokestatic 586	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   649: aastore
    //   650: dup
    //   651: iconst_1
    //   652: iload 14
    //   654: invokestatic 586	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   657: aastore
    //   658: invokevirtual 591	p6/a:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   661: aload 13
    //   663: invokeinterface 575 1 0
    //   668: iconst_5
    //   669: if_icmpge +87 -> 756
    //   672: new 469	java/lang/StringBuilder
    //   675: astore 17
    //   677: aload 17
    //   679: ldc_w 607
    //   682: invokespecial 472	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   685: aload 13
    //   687: invokeinterface 611 1 0
    //   692: astore 13
    //   694: aload 13
    //   696: invokeinterface 616 1 0
    //   701: ifeq +38 -> 739
    //   704: aload 17
    //   706: ldc_w 618
    //   709: iconst_1
    //   710: anewarray 4	java/lang/Object
    //   713: dup
    //   714: iconst_0
    //   715: aload 13
    //   717: invokeinterface 622 1 0
    //   722: checkcast 225	c8/e
    //   725: getfield 596	c8/e:b	Ljava/lang/String;
    //   728: aastore
    //   729: invokestatic 231	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   732: invokevirtual 476	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: pop
    //   736: goto -42 -> 694
    //   739: aload 10
    //   741: getfield 578	c8/n0:d	Lp6/a;
    //   744: aload 17
    //   746: invokevirtual 481	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   749: iconst_0
    //   750: anewarray 4	java/lang/Object
    //   753: invokevirtual 591	p6/a:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   756: aload 5
    //   758: ldc_w 624
    //   761: aload 12
    //   763: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   766: pop
    //   767: aload 5
    //   769: ldc_w 626
    //   772: aload 11
    //   774: invokevirtual 627	c8/i:H	()Z
    //   777: invokevirtual 630	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   780: pop
    //   781: aload 5
    //   783: ldc_w 632
    //   786: ldc_w 634
    //   789: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   792: pop
    //   793: aload 11
    //   795: getfield 637	c8/i:q	Lc8/k;
    //   798: astore 13
    //   800: aload 13
    //   802: ifnull +52 -> 854
    //   805: new 187	org/json/JSONObject
    //   808: astore 12
    //   810: aload 12
    //   812: invokespecial 544	org/json/JSONObject:<init>	()V
    //   815: aload 12
    //   817: ldc_w 639
    //   820: aload 13
    //   822: getfield 643	c8/k:a	J
    //   825: invokevirtual 646	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   828: pop
    //   829: aload 12
    //   831: ldc_w 648
    //   834: aload 13
    //   836: getfield 649	c8/k:b	J
    //   839: invokevirtual 646	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   842: pop
    //   843: aload 5
    //   845: ldc_w 651
    //   848: aload 12
    //   850: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   853: pop
    //   854: new 530	c8/l
    //   857: astore 12
    //   859: aload 12
    //   861: aload 11
    //   863: invokespecial 654	c8/l:<init>	(Lc8/i;)V
    //   866: aload 12
    //   868: invokevirtual 533	c8/l:b	()Ljava/util/ArrayList;
    //   871: astore 12
    //   873: aload 12
    //   875: invokeinterface 656 1 0
    //   880: ifne +66 -> 946
    //   883: new 569	org/json/JSONArray
    //   886: astore 13
    //   888: aload 13
    //   890: invokespecial 570	org/json/JSONArray:<init>	()V
    //   893: iconst_0
    //   894: istore 9
    //   896: iload 9
    //   898: aload 12
    //   900: invokeinterface 575 1 0
    //   905: if_icmpge +30 -> 935
    //   908: aload 13
    //   910: aload 12
    //   912: iload 9
    //   914: invokeinterface 595 2 0
    //   919: checkcast 658	b8/x
    //   922: invokevirtual 661	b8/x:F	()Lorg/json/JSONObject;
    //   925: invokevirtual 603	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   928: pop
    //   929: iinc 9 1
    //   932: goto -36 -> 896
    //   935: aload 5
    //   937: ldc_w 663
    //   940: aload 13
    //   942: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   945: pop
    //   946: aload 11
    //   948: getfield 665	c8/i:u	Ljava/util/List;
    //   951: astore 17
    //   953: aload 17
    //   955: ifnull +129 -> 1084
    //   958: aload 17
    //   960: invokeinterface 656 1 0
    //   965: ifne +119 -> 1084
    //   968: new 569	org/json/JSONArray
    //   971: astore 12
    //   973: aload 12
    //   975: invokespecial 570	org/json/JSONArray:<init>	()V
    //   978: iconst_0
    //   979: istore 9
    //   981: iload 9
    //   983: aload 17
    //   985: invokeinterface 575 1 0
    //   990: if_icmpge +83 -> 1073
    //   993: aload 17
    //   995: iload 9
    //   997: invokeinterface 595 2 0
    //   1002: checkcast 667	b8/t0
    //   1005: astore 13
    //   1007: new 187	org/json/JSONObject
    //   1010: astore 11
    //   1012: aload 11
    //   1014: invokespecial 544	org/json/JSONObject:<init>	()V
    //   1017: aload 11
    //   1019: ldc_w 669
    //   1022: aload 13
    //   1024: getfield 670	b8/t0:a	Ljava/lang/String;
    //   1027: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1030: pop
    //   1031: aload 11
    //   1033: ldc_w 672
    //   1036: aload 13
    //   1038: getfield 673	b8/t0:b	Ljava/lang/String;
    //   1041: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1044: pop
    //   1045: aload 11
    //   1047: ldc_w 675
    //   1050: aload 13
    //   1052: getfield 677	b8/t0:c	Ljava/lang/String;
    //   1055: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1058: pop
    //   1059: aload 12
    //   1061: aload 11
    //   1063: invokevirtual 603	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1066: pop
    //   1067: iinc 9 1
    //   1070: goto -89 -> 981
    //   1073: aload 5
    //   1075: ldc_w 679
    //   1078: aload 12
    //   1080: invokevirtual 559	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1083: pop
    //   1084: aload 5
    //   1086: invokevirtual 680	org/json/JSONObject:toString	()Ljava/lang/String;
    //   1089: astore 5
    //   1091: goto +42 -> 1133
    //   1094: astore_0
    //   1095: aload 10
    //   1097: getfield 578	c8/n0:d	Lp6/a;
    //   1100: astore_1
    //   1101: aload_1
    //   1102: getfield 681	p6/a:a	Ljava/lang/String;
    //   1105: aload_1
    //   1106: ldc_w 683
    //   1109: iconst_0
    //   1110: anewarray 4	java/lang/Object
    //   1113: invokevirtual 685	p6/a:d	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1116: aload_0
    //   1117: invokestatic 689	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1120: pop
    //   1121: new 691	com/google/android/gms/internal/firebase_auth_api/zzzp
    //   1124: dup
    //   1125: aload_0
    //   1126: invokespecial 694	com/google/android/gms/internal/firebase_auth_api/zzzp:<init>	(Ljava/lang/Throwable;)V
    //   1129: athrow
    //   1130: aconst_null
    //   1131: astore 5
    //   1133: aload 5
    //   1135: invokestatic 185	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1138: ifne +27 -> 1165
    //   1141: aload 10
    //   1143: getfield 171	c8/n0:c	Landroid/content/SharedPreferences;
    //   1146: invokeinterface 698 1 0
    //   1151: ldc -83
    //   1153: aload 5
    //   1155: invokeinterface 704 3 0
    //   1160: invokeinterface 707 1 0
    //   1165: iload 8
    //   1167: ifeq +31 -> 1198
    //   1170: aload_0
    //   1171: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   1174: astore 5
    //   1176: aload 5
    //   1178: ifnull +9 -> 1187
    //   1181: aload 5
    //   1183: aload_2
    //   1184: invokevirtual 711	b8/r:L	(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;)V
    //   1187: aload_0
    //   1188: aload_0
    //   1189: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   1192: invokestatic 713	com/google/firebase/auth/FirebaseAuth:q	(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V
    //   1195: goto +3 -> 1198
    //   1198: iload 7
    //   1200: ifeq +11 -> 1211
    //   1203: aload_0
    //   1204: aload_0
    //   1205: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   1208: invokestatic 715	com/google/firebase/auth/FirebaseAuth:m	(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V
    //   1211: iload_3
    //   1212: ifeq +58 -> 1270
    //   1215: aload_0
    //   1216: getfield 144	com/google/firebase/auth/FirebaseAuth:s	Lc8/n0;
    //   1219: astore 5
    //   1221: aload 5
    //   1223: invokevirtual 216	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1226: pop
    //   1227: aload 5
    //   1229: getfield 171	c8/n0:c	Landroid/content/SharedPreferences;
    //   1232: invokeinterface 698 1 0
    //   1237: ldc -38
    //   1239: iconst_1
    //   1240: anewarray 4	java/lang/Object
    //   1243: dup
    //   1244: iconst_0
    //   1245: aload_1
    //   1246: invokevirtual 350	b8/r:a	()Ljava/lang/String;
    //   1249: aastore
    //   1250: invokestatic 231	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1253: aload_2
    //   1254: invokevirtual 718	com/google/android/gms/internal/firebase_auth_api/zzagw:zzf	()Ljava/lang/String;
    //   1257: invokeinterface 704 3 0
    //   1262: invokeinterface 707 1 0
    //   1267: goto +3 -> 1270
    //   1270: aload_0
    //   1271: getfield 212	com/google/firebase/auth/FirebaseAuth:f	Lb8/r;
    //   1274: astore_1
    //   1275: aload_1
    //   1276: ifnull +142 -> 1418
    //   1279: aload_0
    //   1280: getfield 720	com/google/firebase/auth/FirebaseAuth:x	Lc8/r0;
    //   1283: ifnonnull +24 -> 1307
    //   1286: aload_0
    //   1287: getfield 140	com/google/firebase/auth/FirebaseAuth:a	Lu7/f;
    //   1290: astore_2
    //   1291: aload_2
    //   1292: invokestatic 154	m6/j:i	(Ljava/lang/Object;)V
    //   1295: aload_0
    //   1296: new 722	c8/r0
    //   1299: dup
    //   1300: aload_2
    //   1301: invokespecial 725	c8/r0:<init>	(Lu7/f;)V
    //   1304: putfield 720	com/google/firebase/auth/FirebaseAuth:x	Lc8/r0;
    //   1307: aload_0
    //   1308: getfield 720	com/google/firebase/auth/FirebaseAuth:x	Lc8/r0;
    //   1311: astore_0
    //   1312: aload_1
    //   1313: invokevirtual 507	b8/r:O	()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;
    //   1316: astore_1
    //   1317: aload_0
    //   1318: invokevirtual 216	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1321: pop
    //   1322: aload_1
    //   1323: ifnonnull +6 -> 1329
    //   1326: goto +92 -> 1418
    //   1329: aload_1
    //   1330: invokevirtual 728	com/google/android/gms/internal/firebase_auth_api/zzagw:zza	()J
    //   1333: lstore 18
    //   1335: lload 18
    //   1337: lstore 20
    //   1339: lload 18
    //   1341: lconst_0
    //   1342: lcmp
    //   1343: ifgt +8 -> 1351
    //   1346: ldc2_w 729
    //   1349: lstore 20
    //   1351: aload_1
    //   1352: invokevirtual 732	com/google/android/gms/internal/firebase_auth_api/zzagw:zzb	()J
    //   1355: lstore 18
    //   1357: aload_0
    //   1358: getfield 735	c8/r0:b	Lc8/r;
    //   1361: astore_1
    //   1362: aload_1
    //   1363: lload 20
    //   1365: ldc2_w 736
    //   1368: lmul
    //   1369: lload 18
    //   1371: ladd
    //   1372: putfield 740	c8/r:a	J
    //   1375: aload_1
    //   1376: ldc2_w 741
    //   1379: putfield 743	c8/r:b	J
    //   1382: aload_0
    //   1383: getfield 746	c8/r0:a	I
    //   1386: ifle +17 -> 1403
    //   1389: aload_0
    //   1390: getfield 748	c8/r0:c	Z
    //   1393: ifne +10 -> 1403
    //   1396: iload 6
    //   1398: istore 7
    //   1400: goto +6 -> 1406
    //   1403: iconst_0
    //   1404: istore 7
    //   1406: iload 7
    //   1408: ifeq +10 -> 1418
    //   1411: aload_0
    //   1412: getfield 735	c8/r0:b	Lc8/r;
    //   1415: invokevirtual 749	c8/r:a	()V
    //   1418: return
    //   1419: astore 13
    //   1421: goto -578 -> 843
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1424	0	paramFirebaseAuth	FirebaseAuth
    //   0	1424	1	paramr	b8.r
    //   0	1424	2	paramzzagw	com.google.android.gms.internal.firebase-auth-api.zzagw
    //   0	1424	3	paramBoolean1	boolean
    //   0	1424	4	paramBoolean2	boolean
    //   12	1216	5	localObject1	Object
    //   15	1382	6	i1	int
    //   40	1367	7	i2	int
    //   75	1091	8	i3	int
    //   110	958	9	i4	int
    //   198	944	10	localObject2	Object
    //   246	816	11	localObject3	Object
    //   307	772	12	localObject4	Object
    //   361	690	13	localObject5	Object
    //   1419	1	13	localJSONException	org.json.JSONException
    //   370	283	14	i5	int
    //   425	196	15	i6	int
    //   429	186	16	i7	int
    //   454	540	17	localObject6	Object
    //   1333	37	18	l1	long
    //   1337	27	20	l2	long
    // Exception table:
    //   from	to	target	type
    //   288	372	1094	java/lang/Exception
    //   372	420	1094	java/lang/Exception
    //   442	456	1094	java/lang/Exception
    //   456	470	1094	java/lang/Exception
    //   491	502	1094	java/lang/Exception
    //   523	535	1094	java/lang/Exception
    //   544	583	1094	java/lang/Exception
    //   589	614	1094	java/lang/Exception
    //   625	694	1094	java/lang/Exception
    //   694	736	1094	java/lang/Exception
    //   739	756	1094	java/lang/Exception
    //   756	767	1094	java/lang/Exception
    //   767	800	1094	java/lang/Exception
    //   805	815	1094	java/lang/Exception
    //   815	843	1094	java/lang/Exception
    //   843	854	1094	java/lang/Exception
    //   854	893	1094	java/lang/Exception
    //   896	929	1094	java/lang/Exception
    //   935	946	1094	java/lang/Exception
    //   946	953	1094	java/lang/Exception
    //   958	978	1094	java/lang/Exception
    //   981	1067	1094	java/lang/Exception
    //   1073	1084	1094	java/lang/Exception
    //   1084	1091	1094	java/lang/Exception
    //   815	843	1419	org/json/JSONException
  }
  
  public static void o(u7.h paramh, b8.d0 paramd0, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("Invoking verification failure callback for phone number/uid - ");
    localStringBuilder.append(paramString);
    Log.e("FirebaseAuth", localStringBuilder.toString());
    paramString = zzafc.zza(paramString, c, null);
    d.execute(new q0(paramString, paramh, 7));
  }
  
  public static void q(FirebaseAuth paramFirebaseAuth, b8.r paramr)
  {
    Object localObject;
    if (paramr != null)
    {
      String str = paramr.a();
      localObject = new StringBuilder("Notifying id token listeners about user ( ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" ).");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "Notifying id token listeners about a sign-out event.";
    }
    Log.d("FirebaseAuth", (String)localObject);
    if (paramr != null) {
      paramr = paramr.zzd();
    } else {
      paramr = null;
    }
    paramr = new y9.b(paramr);
    A.execute(new h(paramFirebaseAuth, paramr));
  }
  
  public final String a()
  {
    b8.r localr = f;
    if (localr == null) {
      return null;
    }
    return localr.a();
  }
  
  public final void b(c8.a parama)
  {
    j.i(parama);
    c.add(parama);
    try
    {
      if (x == null)
      {
        u7.f localf = a;
        j.i(localf);
        parama = new c8/r0;
        parama.<init>(localf);
        x = parama;
      }
      parama = x;
      parama.a(c.size());
      return;
    }
    finally {}
  }
  
  public final void c(e9.c paramc)
  {
    j.i(paramc);
    c.remove(paramc);
    try
    {
      if (x == null)
      {
        paramc = a;
        j.i(paramc);
        r0 localr0 = new c8/r0;
        localr0.<init>(paramc);
        x = localr0;
      }
      paramc = x;
      paramc.a(c.size());
      return;
    }
    finally {}
  }
  
  public final Task<s> d(boolean paramBoolean)
  {
    return j(f, paramBoolean);
  }
  
  public final Task<Void> e(String paramString, b8.c paramc)
  {
    j.e(paramString);
    b8.c localc = paramc;
    if (paramc == null) {
      localc = new b8.c(new c.a());
    }
    paramc = i;
    if (paramc != null) {
      p = paramc;
    }
    q = 1;
    return new l1(this, paramString, localc).a(this, k, m);
  }
  
  public final void f(String paramString)
  {
    j.e(paramString);
    if (paramString.startsWith("chrome-extension://"))
    {
      B = paramString;
      return;
    }
    String str;
    if (paramString.contains("://")) {
      str = paramString;
    } else {
      str = f.j("http://", paramString);
    }
    try
    {
      localObject = new java/net/URI;
      ((URI)localObject).<init>(str);
      str = ((URI)localObject).getHost();
      j.i(str);
      B = str;
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      Object localObject;
      if (Log.isLoggable("FirebaseAuth", 4))
      {
        localObject = localURISyntaxException.getMessage();
        StringBuilder localStringBuilder = new StringBuilder("Error parsing URL: '");
        localStringBuilder.append(paramString);
        localStringBuilder.append("', ");
        localStringBuilder.append((String)localObject);
        Log.i("FirebaseAuth", localStringBuilder.toString());
      }
      B = paramString;
    }
  }
  
  public final Task<b8.g> g(b8.f paramf)
  {
    paramf = paramf.F();
    if ((paramf instanceof b8.h))
    {
      Object localObject = (b8.h)paramf;
      boolean bool = TextUtils.isEmpty(c);
      int i1 = 1;
      if (!(bool ^ true))
      {
        paramf = a;
        localObject = b;
        j.i(localObject);
        return k(paramf, (String)localObject, k, null, false);
      }
      String str = c;
      j.e(str);
      paramf = b8.d.d;
      j.e(str);
      try
      {
        paramf = new b8/d;
        paramf.<init>(str);
      }
      catch (IllegalArgumentException paramf)
      {
        paramf = null;
      }
      if ((paramf == null) || (TextUtils.equals(k, c))) {
        i1 = 0;
      }
      if (i1 != 0) {
        return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
      }
      localObject = new a(this, false, null, (b8.h)localObject);
      paramf = m;
      return ((i0)localObject).a(this, k, paramf);
    }
    if ((paramf instanceof c0))
    {
      paramf = (c0)paramf;
      return e.zza(a, paramf, k, new d());
    }
    return e.zza(a, paramf, k, new d());
  }
  
  public final b8.f0 h(b8.f0 paramf0, String paramString)
  {
    Object localObject = g;
    String str = a;
    int i1;
    if ((str != null) && (b != null)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    localObject = paramf0;
    if (i1 != 0)
    {
      localObject = paramf0;
      if (paramString != null)
      {
        localObject = paramf0;
        if (paramString.equals(str)) {
          localObject = new i1(this, paramf0);
        }
      }
    }
    return (b8.f0)localObject;
  }
  
  public final Task<b8.g> i(b8.r paramr, b8.f paramf)
  {
    j.i(paramr);
    if ((paramf instanceof b8.h)) {
      return new d(this, paramr, (b8.h)paramf.F()).a(this, paramr.G(), o);
    }
    return e.zza(a, paramr, paramf.F(), null, new c());
  }
  
  public final Task<s> j(b8.r paramr, boolean paramBoolean)
  {
    if (paramr == null) {
      return Tasks.forException(zzadr.zza(new Status(17495, null, null, null)));
    }
    com.google.android.gms.internal.firebase-auth-api.zzagw localzzagw = paramr.O();
    if ((localzzagw.zzg()) && (!paramBoolean)) {
      return Tasks.forResult(c8.d0.a(localzzagw.zzc()));
    }
    return e.zza(a, paramr, localzzagw.zzd(), new p1(this));
  }
  
  public final Task<b8.g> k(String paramString1, String paramString2, String paramString3, b8.r paramr, boolean paramBoolean)
  {
    return new b(this, paramString1, paramBoolean, paramr, paramString2, paramString3).a(this, paramString3, n);
  }
  
  public final m0 p()
  {
    try
    {
      m0 localm0 = l;
      return localm0;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Task<b8.g> r(b8.r paramr, b8.f paramf)
  {
    j.i(paramr);
    paramf = paramf.F();
    if ((paramf instanceof b8.h))
    {
      Object localObject = (b8.h)paramf;
      if ("password".equals(((b8.h)localObject).E()))
      {
        paramf = a;
        localObject = b;
        j.e((String)localObject);
        return k(paramf, (String)localObject, paramr.G(), paramr, true);
      }
      String str = c;
      j.e(str);
      paramf = b8.d.d;
      j.e(str);
      try
      {
        paramf = new b8/d;
        paramf.<init>(str);
      }
      catch (IllegalArgumentException paramf)
      {
        paramf = null;
      }
      int i1;
      if ((paramf != null) && (!TextUtils.equals(k, c))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
      }
      paramf = new a(this, true, paramr, (b8.h)localObject);
      paramr = m;
      return paramf.a(this, k, paramr);
    }
    if ((paramf instanceof c0)) {
      return e.zzb(a, paramr, (c0)paramf, k, new c());
    }
    return e.zzc(a, paramr, paramf, paramr.G(), new c());
  }
  
  public final void s()
  {
    j.i(s);
    Object localObject = f;
    if (localObject != null)
    {
      n0 localn0 = s;
      localObject = String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[] { ((b8.r)localObject).a() });
      c.edit().remove((String)localObject).apply();
      f = null;
    }
    s.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
    q(this, null);
    m(this, null);
  }
  
  public final boolean t()
  {
    u7.f localf = a;
    localf.a();
    return zzadu.zza(a);
  }
  
  public static abstract interface a
  {
    public abstract void a(FirebaseAuth paramFirebaseAuth);
  }
  
  public static abstract interface b
  {
    public abstract void a(FirebaseAuth paramFirebaseAuth);
  }
  
  public final class c
    implements t, z0
  {
    public c() {}
    
    public final void a(com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw, b8.r paramr)
    {
      j.i(paramzzagw);
      j.i(paramr);
      paramr.L(paramzzagw);
      FirebaseAuth localFirebaseAuth = FirebaseAuth.this;
      localFirebaseAuth.getClass();
      FirebaseAuth.n(localFirebaseAuth, paramr, paramzzagw, true, true);
    }
    
    public final void zza(Status paramStatus)
    {
      int i = a;
      if ((i == 17011) || (i == 17021) || (i == 17005) || (i == 17091))
      {
        paramStatus = FirebaseAuth.this;
        paramStatus.s();
        paramStatus = x;
        if (paramStatus != null)
        {
          paramStatus = b;
          e.removeCallbacks(f);
        }
      }
    }
  }
  
  public final class d
    implements z0
  {
    public d() {}
    
    public final void a(com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw, b8.r paramr)
    {
      j.i(paramzzagw);
      j.i(paramr);
      paramr.L(paramzzagw);
      FirebaseAuth localFirebaseAuth = FirebaseAuth.this;
      localFirebaseAuth.getClass();
      FirebaseAuth.n(localFirebaseAuth, paramr, paramzzagw, true, false);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.FirebaseAuth
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */