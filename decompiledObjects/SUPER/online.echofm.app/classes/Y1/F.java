package Y1;

import O1.P;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.a;
import x1.a.c;
import x1.h;

public abstract class F
  extends A
{
  public static final a s = new a(null);
  public String r;
  
  public F(u paramu)
  {
    super(paramu);
  }
  
  public F(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public Bundle p(Bundle paramBundle, u.e parame)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "parameters");
    Intrinsics.checkNotNullParameter(parame, "request");
    paramBundle.putString("redirect_uri", g());
    if (parame.r()) {}
    for (Object localObject = "app_id";; localObject = "client_id")
    {
      paramBundle.putString((String)localObject, parame.a());
      break;
    }
    paramBundle.putString("e2e", u.A.a());
    if (parame.r()) {}
    for (localObject = "token,signed_request,graph_domain,granted_scopes";; localObject = "id_token,token,signed_request,graph_domain")
    {
      paramBundle.putString("response_type", (String)localObject);
      break;
      if (parame.n().contains("openid")) {
        paramBundle.putString("nonce", parame.m());
      }
    }
    paramBundle.putString("code_challenge", parame.d());
    localObject = parame.e();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Enum)localObject).name();
    }
    paramBundle.putString("code_challenge_method", (String)localObject);
    paramBundle.putString("return_scopes", "true");
    paramBundle.putString("auth_type", parame.c());
    paramBundle.putString("login_behavior", parame.j().name());
    paramBundle.putString("sdk", Intrinsics.i("android-", x1.B.B()));
    if (r() != null) {
      paramBundle.putString("sso", r());
    }
    boolean bool = x1.B.q;
    String str = "0";
    if (bool) {
      localObject = "1";
    } else {
      localObject = "0";
    }
    paramBundle.putString("cct_prefetching", (String)localObject);
    if (parame.q()) {
      paramBundle.putString("fx_app", parame.k().toString());
    }
    if (parame.v()) {
      paramBundle.putString("skip_dedupe", "true");
    }
    if (parame.l() != null)
    {
      paramBundle.putString("messenger_page_id", parame.l());
      localObject = str;
      if (parame.o()) {
        localObject = "1";
      }
      paramBundle.putString("reset_messenger_state", (String)localObject);
    }
    return paramBundle;
  }
  
  public Bundle q(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Bundle localBundle = new Bundle();
    Object localObject = P.a;
    if (!P.d0(parame.n()))
    {
      localObject = TextUtils.join(",", parame.n());
      localBundle.putString("scope", (String)localObject);
      a("scope", localObject);
    }
    e locale = parame.g();
    localObject = locale;
    if (locale == null) {
      localObject = e.p;
    }
    localBundle.putString("default_audience", ((e)localObject).e());
    localBundle.putString("state", c(parame.b()));
    parame = a.z.e();
    if (parame == null) {
      parame = null;
    } else {
      parame = parame.l();
    }
    localObject = "0";
    if ((parame != null) && (Intrinsics.a(parame, u())))
    {
      localBundle.putString("access_token", parame);
      a("access_token", "1");
    }
    else
    {
      parame = d().i();
      if (parame != null) {
        P.i(parame);
      }
      a("access_token", "0");
    }
    localBundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
    parame = (u.e)localObject;
    if (x1.B.p()) {
      parame = "1";
    }
    localBundle.putString("ies", parame);
    return localBundle;
  }
  
  public String r()
  {
    return null;
  }
  
  public abstract h t();
  
  public final String u()
  {
    androidx.fragment.app.e locale = d().i();
    Object localObject = locale;
    if (locale == null) {
      localObject = x1.B.l();
    }
    return ((Context)localObject).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
  }
  
  /* Error */
  public void v(u.e parame, Bundle paramBundle, x1.o paramo)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 42
    //   3: invokestatic 29	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokevirtual 255	Y1/A:d	()LY1/u;
    //   10: astore 4
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield 309	Y1/F:r	Ljava/lang/String;
    //   17: aload_2
    //   18: ifnull +140 -> 158
    //   21: aload_2
    //   22: ldc 67
    //   24: invokevirtual 313	android/os/BaseBundle:containsKey	(Ljava/lang/String;)Z
    //   27: ifeq +13 -> 40
    //   30: aload_0
    //   31: aload_2
    //   32: ldc 67
    //   34: invokevirtual 315	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   37: putfield 309	Y1/F:r	Ljava/lang/String;
    //   40: getstatic 318	Y1/A:q	LY1/A$a;
    //   43: astore 5
    //   45: aload 5
    //   47: aload_1
    //   48: invokevirtual 84	Y1/u$e:n	()Ljava/util/Set;
    //   51: aload_2
    //   52: aload_0
    //   53: invokevirtual 320	Y1/F:t	()Lx1/h;
    //   56: aload_1
    //   57: invokevirtual 63	Y1/u$e:a	()Ljava/lang/String;
    //   60: invokevirtual 325	Y1/A$a:b	(Ljava/util/Collection;Landroid/os/Bundle;Lx1/h;Ljava/lang/String;)Lx1/a;
    //   63: astore_3
    //   64: aload 5
    //   66: aload_2
    //   67: aload_1
    //   68: invokevirtual 97	Y1/u$e:m	()Ljava/lang/String;
    //   71: invokevirtual 328	Y1/A$a:d	(Landroid/os/Bundle;Ljava/lang/String;)Lx1/i;
    //   74: astore_1
    //   75: getstatic 334	Y1/u$f:w	LY1/u$f$c;
    //   78: aload 4
    //   80: invokevirtual 337	Y1/u:o	()LY1/u$e;
    //   83: aload_3
    //   84: aload_1
    //   85: invokevirtual 342	Y1/u$f$c:b	(LY1/u$e;Lx1/a;Lx1/i;)LY1/u$f;
    //   88: astore_2
    //   89: aload 4
    //   91: invokevirtual 258	Y1/u:i	()Landroidx/fragment/app/e;
    //   94: astore 5
    //   96: aload_2
    //   97: astore_1
    //   98: aload 5
    //   100: ifnull +150 -> 250
    //   103: aload 4
    //   105: invokevirtual 258	Y1/u:i	()Landroidx/fragment/app/e;
    //   108: invokestatic 348	android/webkit/CookieSyncManager:createInstance	(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
    //   111: invokevirtual 351	android/webkit/CookieSyncManager:sync	()V
    //   114: aload_2
    //   115: astore_1
    //   116: aload_3
    //   117: ifnull +133 -> 250
    //   120: aload_0
    //   121: aload_3
    //   122: invokevirtual 244	x1/a:l	()Ljava/lang/String;
    //   125: invokevirtual 354	Y1/F:w	(Ljava/lang/String;)V
    //   128: aload_2
    //   129: astore_1
    //   130: goto +120 -> 250
    //   133: astore_1
    //   134: getstatic 334	Y1/u$f:w	LY1/u$f$c;
    //   137: aload 4
    //   139: invokevirtual 337	Y1/u:o	()LY1/u$e;
    //   142: aconst_null
    //   143: aload_1
    //   144: invokevirtual 359	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   147: aconst_null
    //   148: bipush 8
    //   150: aconst_null
    //   151: invokestatic 362	Y1/u$f$c:d	(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;
    //   154: astore_1
    //   155: goto +95 -> 250
    //   158: aload_3
    //   159: instanceof 364
    //   162: ifeq +21 -> 183
    //   165: getstatic 334	Y1/u$f:w	LY1/u$f$c;
    //   168: aload 4
    //   170: invokevirtual 337	Y1/u:o	()LY1/u$e;
    //   173: ldc_w 366
    //   176: invokevirtual 369	Y1/u$f$c:a	(LY1/u$e;Ljava/lang/String;)LY1/u$f;
    //   179: astore_1
    //   180: goto +70 -> 250
    //   183: aload_0
    //   184: aconst_null
    //   185: putfield 309	Y1/F:r	Ljava/lang/String;
    //   188: aload_3
    //   189: ifnonnull +8 -> 197
    //   192: aconst_null
    //   193: astore_1
    //   194: goto +8 -> 202
    //   197: aload_3
    //   198: invokevirtual 359	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   201: astore_1
    //   202: aload_3
    //   203: instanceof 371
    //   206: ifeq +27 -> 233
    //   209: aload_3
    //   210: checkcast 371	x1/D
    //   213: invokevirtual 374	x1/D:c	()Lx1/r;
    //   216: astore_1
    //   217: aload_1
    //   218: invokevirtual 379	x1/r:b	()I
    //   221: invokestatic 382	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   224: astore_2
    //   225: aload_1
    //   226: invokevirtual 383	x1/r:toString	()Ljava/lang/String;
    //   229: astore_1
    //   230: goto +5 -> 235
    //   233: aconst_null
    //   234: astore_2
    //   235: getstatic 334	Y1/u$f:w	LY1/u$f$c;
    //   238: aload 4
    //   240: invokevirtual 337	Y1/u:o	()LY1/u$e;
    //   243: aconst_null
    //   244: aload_1
    //   245: aload_2
    //   246: invokevirtual 386	Y1/u$f$c:c	(LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LY1/u$f;
    //   249: astore_1
    //   250: getstatic 195	O1/P:a	LO1/P;
    //   253: astore_2
    //   254: aload_0
    //   255: getfield 309	Y1/F:r	Ljava/lang/String;
    //   258: invokestatic 389	O1/P:c0	(Ljava/lang/String;)Z
    //   261: ifne +11 -> 272
    //   264: aload_0
    //   265: aload_0
    //   266: getfield 309	Y1/F:r	Ljava/lang/String;
    //   269: invokevirtual 392	Y1/A:h	(Ljava/lang/String;)V
    //   272: aload 4
    //   274: aload_1
    //   275: invokevirtual 395	Y1/u:g	(LY1/u$f;)V
    //   278: return
    //   279: astore_1
    //   280: goto -166 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	283	0	this	F
    //   0	283	1	parame	u.e
    //   0	283	2	paramBundle	Bundle
    //   0	283	3	paramo	x1.o
    //   10	263	4	localu	u
    //   43	56	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   40	96	133	x1/o
    //   120	128	133	x1/o
    //   103	114	279	java/lang/Exception
  }
  
  public final void w(String paramString)
  {
    androidx.fragment.app.e locale = d().i();
    Object localObject = locale;
    if (locale == null) {
      localObject = x1.B.l();
    }
    ((Context)localObject).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", paramString).apply();
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     Y1.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */