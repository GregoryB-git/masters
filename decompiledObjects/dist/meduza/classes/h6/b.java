package h6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import g;
import java.util.concurrent.locks.ReentrantLock;
import m6.j;
import org.json.JSONException;

public final class b
{
  public static final ReentrantLock c = new ReentrantLock();
  public static b d;
  public final ReentrantLock a = new ReentrantLock();
  public final SharedPreferences b;
  
  public b(Context paramContext)
  {
    b = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static b a(Context paramContext)
  {
    j.i(paramContext);
    ReentrantLock localReentrantLock = c;
    localReentrantLock.lock();
    try
    {
      if (d == null)
      {
        b localb = new h6/b;
        localb.<init>(paramContext.getApplicationContext());
        d = localb;
      }
      paramContext = d;
      localReentrantLock.unlock();
      return paramContext;
    }
    finally
    {
      c.unlock();
    }
  }
  
  public static final String g(String paramString1, String paramString2)
  {
    return g.e(paramString1, ":", paramString2);
  }
  
  public final GoogleSignInAccount b()
  {
    Object localObject = e("defaultGoogleSignInAccount");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = e(g("googleSignInAccount", (String)localObject));
      if (localObject == null) {}
    }
    try
    {
      localObject = GoogleSignInAccount.E((String)localObject);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject = null;
    return (GoogleSignInAccount)localObject;
  }
  
  public final GoogleSignInOptions c()
  {
    Object localObject1 = e("defaultGoogleSignInAccount");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject3 = null;
    String str;
    if (bool)
    {
      localObject1 = localObject3;
    }
    else
    {
      str = e(g("googleSignInOptions", (String)localObject1));
      localObject1 = localObject3;
      if (str == null) {}
    }
    try
    {
      localObject1 = GoogleSignInOptions.E(str);
      return (GoogleSignInOptions)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  /* Error */
  public final void d(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 42	m6/j:i	(Ljava/lang/Object;)V
    //   4: aload_2
    //   5: invokestatic 42	m6/j:i	(Ljava/lang/Object;)V
    //   8: aload_0
    //   9: ldc 70
    //   11: aload_1
    //   12: getfield 102	com/google/android/gms/auth/api/signin/GoogleSignInAccount:q	Ljava/lang/String;
    //   15: invokevirtual 106	h6/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aload_1
    //   19: getfield 102	com/google/android/gms/auth/api/signin/GoogleSignInAccount:q	Ljava/lang/String;
    //   22: astore_3
    //   23: ldc 81
    //   25: aload_3
    //   26: invokestatic 83	h6/b:g	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   29: astore 4
    //   31: new 108	org/json/JSONObject
    //   34: dup
    //   35: invokespecial 109	org/json/JSONObject:<init>	()V
    //   38: astore 5
    //   40: aload_1
    //   41: getfield 111	com/google/android/gms/auth/api/signin/GoogleSignInAccount:b	Ljava/lang/String;
    //   44: astore 6
    //   46: aload 6
    //   48: ifnull +13 -> 61
    //   51: aload 5
    //   53: ldc 113
    //   55: aload 6
    //   57: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   60: pop
    //   61: aload_1
    //   62: getfield 119	com/google/android/gms/auth/api/signin/GoogleSignInAccount:c	Ljava/lang/String;
    //   65: astore 6
    //   67: aload 6
    //   69: ifnull +13 -> 82
    //   72: aload 5
    //   74: ldc 121
    //   76: aload 6
    //   78: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   81: pop
    //   82: aload_1
    //   83: getfield 123	com/google/android/gms/auth/api/signin/GoogleSignInAccount:d	Ljava/lang/String;
    //   86: astore 6
    //   88: aload 6
    //   90: ifnull +13 -> 103
    //   93: aload 5
    //   95: ldc 125
    //   97: aload 6
    //   99: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   102: pop
    //   103: aload_1
    //   104: getfield 127	com/google/android/gms/auth/api/signin/GoogleSignInAccount:e	Ljava/lang/String;
    //   107: astore 6
    //   109: aload 6
    //   111: ifnull +13 -> 124
    //   114: aload 5
    //   116: ldc -127
    //   118: aload 6
    //   120: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   123: pop
    //   124: aload_1
    //   125: getfield 132	com/google/android/gms/auth/api/signin/GoogleSignInAccount:s	Ljava/lang/String;
    //   128: astore 6
    //   130: aload 6
    //   132: ifnull +13 -> 145
    //   135: aload 5
    //   137: ldc -122
    //   139: aload 6
    //   141: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   144: pop
    //   145: aload_1
    //   146: getfield 137	com/google/android/gms/auth/api/signin/GoogleSignInAccount:t	Ljava/lang/String;
    //   149: astore 6
    //   151: aload 6
    //   153: ifnull +13 -> 166
    //   156: aload 5
    //   158: ldc -117
    //   160: aload 6
    //   162: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   165: pop
    //   166: aload_1
    //   167: getfield 142	com/google/android/gms/auth/api/signin/GoogleSignInAccount:f	Landroid/net/Uri;
    //   170: astore 6
    //   172: aload 6
    //   174: ifnull +16 -> 190
    //   177: aload 5
    //   179: ldc -112
    //   181: aload 6
    //   183: invokevirtual 150	android/net/Uri:toString	()Ljava/lang/String;
    //   186: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   189: pop
    //   190: aload_1
    //   191: getfield 153	com/google/android/gms/auth/api/signin/GoogleSignInAccount:o	Ljava/lang/String;
    //   194: astore 6
    //   196: aload 6
    //   198: ifnull +13 -> 211
    //   201: aload 5
    //   203: ldc -101
    //   205: aload 6
    //   207: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   210: pop
    //   211: aload 5
    //   213: ldc -99
    //   215: aload_1
    //   216: getfield 161	com/google/android/gms/auth/api/signin/GoogleSignInAccount:p	J
    //   219: invokevirtual 164	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   222: pop
    //   223: aload 5
    //   225: ldc -90
    //   227: aload_1
    //   228: getfield 102	com/google/android/gms/auth/api/signin/GoogleSignInAccount:q	Ljava/lang/String;
    //   231: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   234: pop
    //   235: new 168	org/json/JSONArray
    //   238: astore 6
    //   240: aload 6
    //   242: invokespecial 169	org/json/JSONArray:<init>	()V
    //   245: aload_1
    //   246: getfield 173	com/google/android/gms/auth/api/signin/GoogleSignInAccount:r	Ljava/util/List;
    //   249: astore_1
    //   250: aload_1
    //   251: aload_1
    //   252: invokeinterface 179 1 0
    //   257: anewarray 181	com/google/android/gms/common/api/Scope
    //   260: invokeinterface 185 2 0
    //   265: checkcast 187	[Lcom/google/android/gms/common/api/Scope;
    //   268: astore_1
    //   269: aload_1
    //   270: getstatic 192	g6/c:a	Lg6/c;
    //   273: invokestatic 198	java/util/Arrays:sort	([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   276: aload_1
    //   277: arraylength
    //   278: istore 7
    //   280: iconst_0
    //   281: istore 8
    //   283: iload 8
    //   285: iload 7
    //   287: if_icmpge +22 -> 309
    //   290: aload 6
    //   292: aload_1
    //   293: iload 8
    //   295: aaload
    //   296: getfield 199	com/google/android/gms/common/api/Scope:b	Ljava/lang/String;
    //   299: invokevirtual 202	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   302: pop
    //   303: iinc 8 1
    //   306: goto -23 -> 283
    //   309: aload 5
    //   311: ldc -52
    //   313: aload 6
    //   315: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   318: pop
    //   319: aload 5
    //   321: ldc -101
    //   323: invokevirtual 208	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   326: pop
    //   327: aload_0
    //   328: aload 4
    //   330: aload 5
    //   332: invokevirtual 209	org/json/JSONObject:toString	()Ljava/lang/String;
    //   335: invokevirtual 106	h6/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: ldc 92
    //   340: aload_3
    //   341: invokestatic 83	h6/b:g	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   344: astore_1
    //   345: new 108	org/json/JSONObject
    //   348: dup
    //   349: invokespecial 109	org/json/JSONObject:<init>	()V
    //   352: astore_3
    //   353: new 168	org/json/JSONArray
    //   356: astore 5
    //   358: aload 5
    //   360: invokespecial 169	org/json/JSONArray:<init>	()V
    //   363: aload_2
    //   364: getfield 212	com/google/android/gms/auth/api/signin/GoogleSignInOptions:b	Ljava/util/ArrayList;
    //   367: getstatic 216	com/google/android/gms/auth/api/signin/GoogleSignInOptions:z	Lg6/e;
    //   370: invokestatic 221	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   373: aload_2
    //   374: getfield 212	com/google/android/gms/auth/api/signin/GoogleSignInOptions:b	Ljava/util/ArrayList;
    //   377: invokevirtual 227	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   380: astore 4
    //   382: aload 4
    //   384: invokeinterface 233 1 0
    //   389: ifeq +25 -> 414
    //   392: aload 5
    //   394: aload 4
    //   396: invokeinterface 237 1 0
    //   401: checkcast 181	com/google/android/gms/common/api/Scope
    //   404: getfield 199	com/google/android/gms/common/api/Scope:b	Ljava/lang/String;
    //   407: invokevirtual 202	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   410: pop
    //   411: goto -29 -> 382
    //   414: aload_3
    //   415: ldc -17
    //   417: aload 5
    //   419: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   422: pop
    //   423: aload_2
    //   424: getfield 242	com/google/android/gms/auth/api/signin/GoogleSignInOptions:c	Landroid/accounts/Account;
    //   427: astore 5
    //   429: aload 5
    //   431: ifnull +15 -> 446
    //   434: aload_3
    //   435: ldc -12
    //   437: aload 5
    //   439: getfield 249	android/accounts/Account:name	Ljava/lang/String;
    //   442: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   445: pop
    //   446: aload_3
    //   447: ldc -5
    //   449: aload_2
    //   450: getfield 254	com/google/android/gms/auth/api/signin/GoogleSignInOptions:d	Z
    //   453: invokevirtual 257	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   456: pop
    //   457: aload_3
    //   458: ldc_w 259
    //   461: aload_2
    //   462: getfield 261	com/google/android/gms/auth/api/signin/GoogleSignInOptions:f	Z
    //   465: invokevirtual 257	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   468: pop
    //   469: aload_3
    //   470: ldc_w 263
    //   473: aload_2
    //   474: getfield 265	com/google/android/gms/auth/api/signin/GoogleSignInOptions:e	Z
    //   477: invokevirtual 257	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   480: pop
    //   481: aload_2
    //   482: getfield 266	com/google/android/gms/auth/api/signin/GoogleSignInOptions:o	Ljava/lang/String;
    //   485: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   488: ifne +15 -> 503
    //   491: aload_3
    //   492: ldc_w 268
    //   495: aload_2
    //   496: getfield 266	com/google/android/gms/auth/api/signin/GoogleSignInOptions:o	Ljava/lang/String;
    //   499: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   502: pop
    //   503: aload_2
    //   504: getfield 270	com/google/android/gms/auth/api/signin/GoogleSignInOptions:p	Ljava/lang/String;
    //   507: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   510: ifne +15 -> 525
    //   513: aload_3
    //   514: ldc_w 272
    //   517: aload_2
    //   518: getfield 270	com/google/android/gms/auth/api/signin/GoogleSignInOptions:p	Ljava/lang/String;
    //   521: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   524: pop
    //   525: aload_0
    //   526: aload_1
    //   527: aload_3
    //   528: invokevirtual 209	org/json/JSONObject:toString	()Ljava/lang/String;
    //   531: invokevirtual 106	h6/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: return
    //   535: astore_1
    //   536: new 274	java/lang/RuntimeException
    //   539: dup
    //   540: aload_1
    //   541: invokespecial 277	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   544: athrow
    //   545: astore_1
    //   546: new 274	java/lang/RuntimeException
    //   549: dup
    //   550: aload_1
    //   551: invokespecial 277	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   554: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	this	b
    //   0	555	1	paramGoogleSignInAccount	GoogleSignInAccount
    //   0	555	2	paramGoogleSignInOptions	GoogleSignInOptions
    //   22	506	3	localObject1	Object
    //   29	366	4	localObject2	Object
    //   38	400	5	localObject3	Object
    //   44	270	6	localObject4	Object
    //   278	10	7	i	int
    //   281	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   353	382	535	org/json/JSONException
    //   382	411	535	org/json/JSONException
    //   414	429	535	org/json/JSONException
    //   434	446	535	org/json/JSONException
    //   446	503	535	org/json/JSONException
    //   503	525	535	org/json/JSONException
    //   40	46	545	org/json/JSONException
    //   51	61	545	org/json/JSONException
    //   61	67	545	org/json/JSONException
    //   72	82	545	org/json/JSONException
    //   82	88	545	org/json/JSONException
    //   93	103	545	org/json/JSONException
    //   103	109	545	org/json/JSONException
    //   114	124	545	org/json/JSONException
    //   124	130	545	org/json/JSONException
    //   135	145	545	org/json/JSONException
    //   145	151	545	org/json/JSONException
    //   156	166	545	org/json/JSONException
    //   166	172	545	org/json/JSONException
    //   177	190	545	org/json/JSONException
    //   190	196	545	org/json/JSONException
    //   201	211	545	org/json/JSONException
    //   211	280	545	org/json/JSONException
    //   290	303	545	org/json/JSONException
    //   309	319	545	org/json/JSONException
  }
  
  public final String e(String paramString)
  {
    a.lock();
    try
    {
      paramString = b.getString(paramString, null);
      return paramString;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void f(String paramString1, String paramString2)
  {
    a.lock();
    try
    {
      b.edit().putString(paramString1, paramString2).apply();
      return;
    }
    finally
    {
      a.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     h6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */