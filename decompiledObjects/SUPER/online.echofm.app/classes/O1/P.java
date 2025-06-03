package O1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.b;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.B;
import x1.F;
import x1.F.c;
import x1.a.c;
import x1.o;
import x1.r;

public final class P
{
  public static final P a = new P();
  public static int b;
  public static long c = -1L;
  public static long d = -1L;
  public static long e = -1L;
  public static String f = "";
  public static String g = "";
  public static String h = "NoCarrier";
  public static String i = "";
  public static Locale j;
  
  public static final Locale A()
  {
    Locale localLocale1 = N();
    Locale localLocale2 = localLocale1;
    if (localLocale1 == null)
    {
      localLocale2 = Locale.getDefault();
      Intrinsics.checkNotNullExpressionValue(localLocale2, "getDefault()");
    }
    return localLocale2;
  }
  
  public static final void B0(Runnable paramRunnable)
  {
    try
    {
      B.t().execute(paramRunnable);
      return;
    }
    catch (Exception paramRunnable)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static final JSONObject C()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 92	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: invokestatic 96	x1/B:l	()Landroid/content/Context;
    //   13: ldc 98
    //   15: iconst_0
    //   16: invokevirtual 104	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   19: ldc 106
    //   21: aconst_null
    //   22: invokeinterface 112 3 0
    //   27: astore_0
    //   28: aload_0
    //   29: ifnull +18 -> 47
    //   32: new 114	org/json/JSONObject
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 117	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   40: astore_0
    //   41: aload_0
    //   42: areturn
    //   43: astore_0
    //   44: goto +5 -> 49
    //   47: aconst_null
    //   48: areturn
    //   49: aload_0
    //   50: ldc 2
    //   52: invokestatic 120	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   55: aconst_null
    //   56: areturn
    //   57: astore_0
    //   58: goto -11 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   27	15	0	localObject	Object
    //   43	7	0	localThrowable	Throwable
    //   57	1	0	localJSONException	JSONException
    // Exception table:
    //   from	to	target	type
    //   10	28	43	finally
    //   32	41	43	finally
    //   32	41	57	org/json/JSONException
  }
  
  public static final void C0(JSONObject paramJSONObject, a parama, String paramString, boolean paramBoolean, Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "params");
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Object localObject = n.a;
    localObject = n.b.P;
    if (!n.g((n.b)localObject)) {
      paramJSONObject.put("anon_id", paramString);
    }
    paramJSONObject.put("application_tracking_enabled", paramBoolean ^ true);
    paramJSONObject.put("advertiser_id_collection_enabled", B.k());
    if (parama != null)
    {
      if (n.g((n.b)localObject)) {
        a.c(paramJSONObject, parama, paramString, paramContext);
      }
      if (parama.j() != null) {
        if (n.g((n.b)localObject)) {
          a.d(paramJSONObject, parama, paramContext);
        } else {
          paramJSONObject.put("attribution", parama.j());
        }
      }
      if (parama.h() != null)
      {
        paramJSONObject.put("advertiser_id", parama.h());
        paramJSONObject.put("advertiser_tracking_enabled", parama.k() ^ true);
      }
      if (!parama.k())
      {
        paramString = y1.L.f();
        if (paramString.length() != 0) {
          paramJSONObject.put("ud", paramString);
        }
      }
      if (parama.i() != null) {
        paramJSONObject.put("installer_package", parama.i());
      }
    }
  }
  
  public static final void D0(JSONObject paramJSONObject, Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "params");
    Intrinsics.checkNotNullParameter(paramContext, "appContext");
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put("a2");
    a.y0(paramContext);
    Object localObject1 = paramContext.getPackageName();
    k = 0;
    int m = 0;
    int n = 0;
    i1 = -1;
    int i2 = i1;
    try
    {
      localObject3 = paramContext.getPackageManager().getPackageInfo((String)localObject1, 0);
      if (localObject3 == null) {
        return;
      }
      i2 = i1;
      i1 = versionCode;
      i2 = i1;
      i = versionName;
      i2 = i1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject3;
      Object localObject2;
      StringBuilder localStringBuilder;
      String str;
      double d1;
      for (;;) {}
    }
    localJSONArray.put(localObject1);
    localJSONArray.put(i2);
    localJSONArray.put(i);
    localJSONArray.put(Build.VERSION.RELEASE);
    localJSONArray.put(Build.MODEL);
    try
    {
      localObject1 = getResourcesgetConfigurationlocale;
    }
    catch (Exception localException)
    {
      localObject2 = Locale.getDefault();
    }
    j = (Locale)localObject2;
    localStringBuilder = new StringBuilder();
    localObject2 = j;
    localObject3 = "";
    if (localObject2 == null) {}
    do
    {
      localObject2 = "";
      break;
      str = ((Locale)localObject2).getLanguage();
      localObject2 = str;
    } while (str == null);
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append('_');
    localObject2 = j;
    if (localObject2 == null)
    {
      localObject2 = localObject3;
    }
    else
    {
      localObject2 = ((Locale)localObject2).getCountry();
      if (localObject2 == null) {
        localObject2 = localObject3;
      }
    }
    localStringBuilder.append((String)localObject2);
    localJSONArray.put(localStringBuilder.toString());
    localJSONArray.put(f);
    localJSONArray.put(h);
    d1 = 0.0D;
    try
    {
      paramContext = paramContext.getSystemService("display");
      boolean bool = paramContext instanceof DisplayManager;
      localObject2 = null;
      if (bool) {
        paramContext = (DisplayManager)paramContext;
      }
    }
    catch (Exception paramContext)
    {
      i1 = 0;
      i2 = n;
      break label396;
    }
    paramContext = null;
    if (paramContext == null) {
      paramContext = (Context)localObject2;
    } else {
      paramContext = paramContext.getDisplay(0);
    }
    if (paramContext != null)
    {
      localObject2 = new android/util/DisplayMetrics;
      ((DisplayMetrics)localObject2).<init>();
      paramContext.getMetrics((DisplayMetrics)localObject2);
      k = widthPixels;
      i2 = m;
    }
    try
    {
      i1 = heightPixels;
      i2 = i1;
      float f1 = density;
      d1 = f1;
      i2 = i1;
      i1 = k;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        label396:
        i1 = k;
      }
    }
    i2 = 0;
    i1 = k;
    localJSONArray.put(i1);
    localJSONArray.put(i2);
    localJSONArray.put(new DecimalFormat("#.##").format(d1));
    localJSONArray.put(a.v0());
    localJSONArray.put(d);
    localJSONArray.put(e);
    localJSONArray.put(g);
    paramJSONObject.put("extinfo", localJSONArray.toString());
  }
  
  public static final String E(String paramString)
  {
    String str1 = B.u();
    if (paramString == null) {
      return str1;
    }
    if (Intrinsics.a(paramString, "gaming")) {}
    String str2;
    for (paramString = "fb.gg";; paramString = "instagram.com")
    {
      str2 = i.q(str1, "facebook.com", paramString, false, 4, null);
      break;
      str2 = str1;
      if (!Intrinsics.a(paramString, "instagram")) {
        break;
      }
    }
    return str2;
  }
  
  public static final String E0(byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "bytes");
    return a.S("SHA-1", paramArrayOfByte);
  }
  
  public static final String F0(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = a.R("SHA-256", paramString);
    }
    return paramString;
  }
  
  public static final void G(String paramString, a parama)
  {
    Intrinsics.checkNotNullParameter(paramString, "accessToken");
    Intrinsics.checkNotNullParameter(parama, "callback");
    JSONObject localJSONObject = G.a(paramString);
    if (localJSONObject != null)
    {
      parama.a(localJSONObject);
      return;
    }
    parama = new N(parama, paramString);
    paramString = a.F(paramString);
    paramString.C(parama);
    paramString.l();
  }
  
  public static final void G0(Parcel paramParcel, Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    if (paramMap == null)
    {
      paramParcel.writeInt(-1);
    }
    else
    {
      paramParcel.writeInt(paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Object localObject = (Map.Entry)paramMap.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        paramParcel.writeString(str);
        paramParcel.writeString((String)localObject);
      }
    }
  }
  
  public static final void H(a parama, String paramString, x1.K paramK)
  {
    Intrinsics.checkNotNullParameter(parama, "$callback");
    Intrinsics.checkNotNullParameter(paramString, "$accessToken");
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (paramK.b() != null)
    {
      parama.b(paramK.b().e());
    }
    else
    {
      Object localObject = G.a;
      localObject = paramK.d();
      if (localObject == null) {
        break label73;
      }
      G.b(paramString, (JSONObject)localObject);
      parama.a(paramK.d());
    }
    return;
    label73:
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public static final void H0(Parcel paramParcel, Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    if (paramMap == null)
    {
      paramParcel.writeInt(-1);
    }
    else
    {
      paramParcel.writeInt(paramMap.size());
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        paramMap = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        paramParcel.writeString(paramMap);
        paramParcel.writeString((String)localObject);
      }
    }
  }
  
  public static final String J(Context paramContext)
  {
    Q.j(paramContext, "context");
    return B.m();
  }
  
  public static final Method K(Class paramClass, String paramString, Class... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramClass, "clazz");
    Intrinsics.checkNotNullParameter(paramString, "methodName");
    Intrinsics.checkNotNullParameter(paramVarArgs, "parameterTypes");
    try
    {
      paramClass = paramClass.getMethod(paramString, (Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    }
    catch (NoSuchMethodException paramClass)
    {
      paramClass = null;
    }
    return paramClass;
  }
  
  public static final Method L(String paramString1, String paramString2, Class... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramString1, "className");
    Intrinsics.checkNotNullParameter(paramString2, "methodName");
    Intrinsics.checkNotNullParameter(paramVarArgs, "parameterTypes");
    try
    {
      paramString1 = Class.forName(paramString1);
      Intrinsics.checkNotNullExpressionValue(paramString1, "clazz");
      paramString1 = K(paramString1, paramString2, (Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    }
    catch (ClassNotFoundException paramString1)
    {
      paramString1 = null;
    }
    return paramString1;
  }
  
  public static final Locale N()
  {
    Locale localLocale2;
    try
    {
      Locale localLocale1 = lgetResourcesgetConfigurationlocale;
    }
    catch (Exception localException)
    {
      localLocale2 = null;
    }
    return localLocale2;
  }
  
  public static final Object O(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
    paramString1 = paramJSONObject.opt(paramString1);
    paramJSONObject = paramString1;
    if (paramString1 != null)
    {
      paramJSONObject = paramString1;
      if ((paramString1 instanceof String)) {
        paramJSONObject = new JSONTokener((String)paramString1).nextValue();
      }
    }
    paramString1 = paramJSONObject;
    if (paramJSONObject != null)
    {
      paramString1 = paramJSONObject;
      if (!(paramJSONObject instanceof JSONObject))
      {
        paramString1 = paramJSONObject;
        if (!(paramJSONObject instanceof JSONArray)) {
          if (paramString2 != null)
          {
            paramString1 = new JSONObject();
            paramString1.putOpt(paramString2, paramJSONObject);
          }
          else
          {
            throw new o("Got an unexpected non-JSON object.");
          }
        }
      }
    }
    return paramString1;
  }
  
  public static final Object T(Object paramObject, Method paramMethod, Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramMethod, "method");
    Intrinsics.checkNotNullParameter(paramVarArgs, "args");
    Object localObject = null;
    try
    {
      paramObject = paramMethod.invoke(paramObject, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      return paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject)
    {
      for (;;)
      {
        paramObject = localObject;
      }
    }
  }
  
  public static final boolean U()
  {
    try
    {
      Object localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("android.intent.action.VIEW");
      Object localObject2 = x.a;
      localObject2 = String.format("fb%s://applinks", Arrays.copyOf(new Object[] { B.m() }, 1));
      Intrinsics.checkNotNullExpressionValue(localObject2, "java.lang.String.format(format, *args)");
      ((Intent)localObject1).setData(Uri.parse((String)localObject2));
      localObject2 = B.l();
      PackageManager localPackageManager = ((Context)localObject2).getPackageManager();
      localObject2 = ((Context)localObject2).getPackageName();
      localObject1 = localPackageManager.queryIntentActivities((Intent)localObject1, 65536);
      Intrinsics.checkNotNullExpressionValue(localObject1, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        boolean bool = Intrinsics.a(localObject2, nextactivityInfo.packageName);
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static final boolean V(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    int k = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (k < 26) {
      return false;
    }
    paramContext = K.a(paramContext.getSystemService(J.a()));
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      bool2 = bool1;
      if (L.a(paramContext))
      {
        bool2 = bool1;
        if (M.a(paramContext)) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static final boolean W(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27)
    {
      bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.type.pc");
    }
    else
    {
      paramContext = Build.DEVICE;
      if (paramContext != null)
      {
        Intrinsics.checkNotNullExpressionValue(paramContext, "DEVICE");
        if (new Regex(".+_cheets|cheets_.+").b(paramContext)) {
          return true;
        }
      }
      bool = false;
    }
    return bool;
  }
  
  public static final boolean X(Uri paramUri)
  {
    boolean bool;
    if (paramUri != null)
    {
      paramUri = paramUri.getScheme();
      bool = true;
      if (i.l("content", paramUri, true)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean Y(x1.a parama)
  {
    boolean bool;
    if ((parama != null) && (Intrinsics.a(parama, x1.a.z.e()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public static final boolean Z()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 92	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic 690	O1/P:C	()Lorg/json/JSONObject;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +5 -> 20
    //   18: iconst_0
    //   19: ireturn
    //   20: aload_0
    //   21: ldc 106
    //   23: invokevirtual 694	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   26: astore_0
    //   27: aload_0
    //   28: invokevirtual 695	org/json/JSONArray:length	()I
    //   31: istore_1
    //   32: iload_1
    //   33: ifle +73 -> 106
    //   36: iconst_0
    //   37: istore_2
    //   38: iload_2
    //   39: iconst_1
    //   40: iadd
    //   41: istore_3
    //   42: aload_0
    //   43: iload_2
    //   44: invokevirtual 698	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   47: astore 4
    //   49: aload 4
    //   51: ldc_w 700
    //   54: invokestatic 68	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   57: aload 4
    //   59: invokevirtual 703	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   62: astore 4
    //   64: aload 4
    //   66: ldc_w 705
    //   69: invokestatic 68	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   72: aload 4
    //   74: ldc_w 707
    //   77: invokestatic 345	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   80: istore 5
    //   82: iload 5
    //   84: ifeq +5 -> 89
    //   87: iconst_1
    //   88: ireturn
    //   89: iload_3
    //   90: iload_1
    //   91: if_icmplt +6 -> 97
    //   94: goto +12 -> 106
    //   97: iload_3
    //   98: istore_2
    //   99: goto -61 -> 38
    //   102: astore_0
    //   103: goto +5 -> 108
    //   106: iconst_0
    //   107: ireturn
    //   108: aload_0
    //   109: ldc 2
    //   111: invokestatic 120	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   114: iconst_0
    //   115: ireturn
    //   116: astore_0
    //   117: goto -11 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   13	30	0	localObject	Object
    //   102	7	0	localThrowable	Throwable
    //   116	1	0	localException	Exception
    //   31	61	1	k	int
    //   37	62	2	m	int
    //   41	57	3	n	int
    //   47	26	4	str	String
    //   80	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	102	finally
    //   20	32	102	finally
    //   42	82	102	finally
    //   20	32	116	java/lang/Exception
    //   42	82	116	java/lang/Exception
  }
  
  public static final boolean a0(Uri paramUri)
  {
    boolean bool;
    if (paramUri != null)
    {
      paramUri = paramUri.getScheme();
      bool = true;
      if (i.l("file", paramUri, true)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean c0(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final boolean d0(Collection paramCollection)
  {
    boolean bool;
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final boolean e(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = Intrinsics.a(paramObject1, paramObject2);
    }
    return bool;
  }
  
  public static final boolean e0(Uri paramUri)
  {
    if (paramUri != null)
    {
      String str = paramUri.getScheme();
      boolean bool1 = true;
      bool2 = bool1;
      if (i.l("http", str, true)) {
        return bool2;
      }
      bool2 = bool1;
      if (i.l("https", paramUri.getScheme(), true)) {
        return bool2;
      }
      if (i.l("fbstaging", paramUri.getScheme(), true)) {
        return bool1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public static final JSONObject f(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "accessToken");
    JSONObject localJSONObject = G.a(paramString);
    if (localJSONObject != null) {
      return localJSONObject;
    }
    paramString = a.F(paramString).k();
    if (paramString.b() != null) {
      paramString = null;
    } else {
      paramString = paramString.d();
    }
    return paramString;
  }
  
  public static final Set f0(JSONArray paramJSONArray)
  {
    Intrinsics.checkNotNullParameter(paramJSONArray, "jsonArray");
    HashSet localHashSet = new HashSet();
    int k = paramJSONArray.length();
    if (k > 0)
    {
      int n;
      for (int m = 0;; m = n)
      {
        n = m + 1;
        String str = paramJSONArray.getString(m);
        Intrinsics.checkNotNullExpressionValue(str, "jsonArray.getString(i)");
        localHashSet.add(str);
        if (n >= k) {
          break;
        }
      }
    }
    return localHashSet;
  }
  
  public static final Uri g(String paramString1, String paramString2, Bundle paramBundle)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.authority(paramString1);
    localBuilder.path(paramString2);
    if (paramBundle != null)
    {
      paramString1 = paramBundle.keySet().iterator();
      while (paramString1.hasNext())
      {
        String str = (String)paramString1.next();
        paramString2 = paramBundle.get(str);
        if ((paramString2 instanceof String)) {
          localBuilder.appendQueryParameter(str, (String)paramString2);
        }
      }
    }
    paramString1 = localBuilder.build();
    Intrinsics.checkNotNullExpressionValue(paramString1, "builder.build()");
    return paramString1;
  }
  
  public static final List g0(JSONArray paramJSONArray)
  {
    Intrinsics.checkNotNullParameter(paramJSONArray, "jsonArray");
    ArrayList localArrayList = new ArrayList();
    int k = paramJSONArray.length();
    if (k > 0)
    {
      int n;
      for (int m = 0;; m = n)
      {
        n = m + 1;
        localArrayList.add(paramJSONArray.getString(m));
        if (n >= k) {
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public static final Map h0(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "str");
    if (paramString.length() == 0) {
      paramString = new HashMap();
    } else {
      try
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.keys();
        while (paramString.hasNext())
        {
          String str1 = (String)paramString.next();
          Intrinsics.checkNotNullExpressionValue(str1, "key");
          String str2 = localJSONObject.getString(str1);
          Intrinsics.checkNotNullExpressionValue(str2, "jsonObject.getString(key)");
          localHashMap.put(str1, str2);
        }
        paramString = localHashMap;
      }
      catch (JSONException paramString)
      {
        paramString = new HashMap();
      }
    }
    return paramString;
  }
  
  public static final void i(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    try
    {
      P localP = a;
      localP.h(paramContext, "facebook.com");
      localP.h(paramContext, ".facebook.com");
      localP.h(paramContext, "https://facebook.com");
      localP.h(paramContext, "https://.facebook.com");
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public static final void i0(String paramString, Exception paramException)
  {
    if ((B.D()) && (paramString != null) && (paramException != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramException.getClass().getSimpleName());
      localStringBuilder.append(": ");
      localStringBuilder.append(paramException.getMessage());
      Log.d(paramString, localStringBuilder.toString());
    }
  }
  
  public static final void j(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static final void j0(String paramString1, String paramString2)
  {
    if ((B.D()) && (paramString1 != null) && (paramString2 != null)) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static final String k(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (c0(paramString1)) {
      str = paramString2;
    }
    return str;
  }
  
  public static final void k0(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((B.D()) && (!c0(paramString1))) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static final String l0(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "map");
    boolean bool = paramMap.isEmpty();
    str = "";
    if (bool) {
      paramMap = str;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        localJSONObject.put((String)paramMap.getKey(), (String)paramMap.getValue());
      }
      paramMap = localJSONObject.toString();
    }
    catch (JSONException paramMap)
    {
      for (;;)
      {
        paramMap = str;
      }
    }
    Intrinsics.checkNotNullExpressionValue(paramMap, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
    return paramMap;
  }
  
  public static final List m(JSONArray paramJSONArray)
  {
    Intrinsics.checkNotNullParameter(paramJSONArray, "jsonArray");
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int k = paramJSONArray.length();
      Object localObject = localArrayList;
      if (k > 0)
      {
        int n;
        for (int m = 0;; m = n)
        {
          n = m + 1;
          localObject = paramJSONArray.getString(m);
          Intrinsics.checkNotNullExpressionValue(localObject, "jsonArray.getString(i)");
          localArrayList.add(localObject);
          if (n >= k)
          {
            localObject = localArrayList;
            break;
          }
        }
      }
      return (List)localObject;
    }
    catch (JSONException paramJSONArray)
    {
      localObject = new ArrayList();
    }
  }
  
  public static final String m0(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    return a.R("MD5", paramString);
  }
  
  public static final Map n(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = paramJSONObject.names();
    if (localJSONArray == null) {
      return localHashMap;
    }
    int k = localJSONArray.length();
    if (k > 0)
    {
      int n;
      for (int m = 0;; m = n)
      {
        n = m + 1;
        try
        {
          String str = localJSONArray.getString(m);
          Intrinsics.checkNotNullExpressionValue(str, "keys.getString(i)");
          Object localObject1 = paramJSONObject.get(str);
          Object localObject2 = localObject1;
          if ((localObject1 instanceof JSONObject)) {
            localObject2 = n((JSONObject)localObject1);
          }
          Intrinsics.checkNotNullExpressionValue(localObject2, "value");
          localHashMap.put(str, localObject2);
        }
        catch (JSONException localJSONException)
        {
          for (;;) {}
        }
        if (n >= k) {
          break;
        }
      }
    }
    return localHashMap;
  }
  
  public static final boolean n0(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    return V(paramContext);
  }
  
  public static final Map o(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = paramJSONObject.optString(str1);
      if (str2 != null)
      {
        Intrinsics.checkNotNullExpressionValue(str1, "key");
        localHashMap.put(str1, str2);
      }
    }
    return localHashMap;
  }
  
  public static final Bundle o0(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (!c0(paramString))
    {
      if (paramString != null)
      {
        paramString = ((Collection)i.V(paramString, new String[] { "&" }, false, 0, 6, null)).toArray(new String[0]);
        if (paramString != null)
        {
          paramString = (String[])paramString;
          int k = paramString.length;
          int m = 0;
          for (;;)
          {
            if (m >= k) {
              return localBundle;
            }
            Object localObject = paramString[m];
            int n = m + 1;
            localObject = ((Collection)i.V((CharSequence)localObject, new String[] { "=" }, false, 0, 6, null)).toArray(new String[0]);
            if (localObject == null) {
              break;
            }
            localObject = (String[])localObject;
            try
            {
              m = localObject.length;
              if (m == 2)
              {
                localBundle.putString(URLDecoder.decode(localObject[0], "UTF-8"), URLDecoder.decode(localObject[1], "UTF-8"));
                m = n;
              }
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException)
            {
              break label202;
              m = n;
              if (localUnsupportedEncodingException.length == 1)
              {
                localBundle.putString(URLDecoder.decode(localUnsupportedEncodingException[0], "UTF-8"), "");
                m = n;
                continue;
                label202:
                i0("FacebookSDK", localUnsupportedEncodingException);
                m = n;
              }
            }
          }
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    return localBundle;
  }
  
  public static final int p(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    Intrinsics.checkNotNullParameter(paramOutputStream, "outputStream");
    byte[] arrayOfByte = null;
    try
    {
      localObject = new java/io/BufferedInputStream;
      ((BufferedInputStream)localObject).<init>(paramInputStream);
      int k;
      try
      {
        arrayOfByte = new byte[' '];
        k = 0;
        for (;;)
        {
          int m = ((InputStream)localObject).read(arrayOfByte);
          if (m == -1) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, m);
          k += m;
        }
        ((BufferedInputStream)localObject).close();
      }
      finally
      {
        break label83;
      }
      if (paramInputStream != null) {
        paramInputStream.close();
      }
      return k;
    }
    finally
    {
      Object localObject = arrayOfByte;
      label83:
      if (localObject != null) {
        ((BufferedInputStream)localObject).close();
      }
      if (paramInputStream != null) {
        paramInputStream.close();
      }
    }
  }
  
  public static final boolean p0(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    if (paramObject == null)
    {
      paramBundle.remove(paramString);
    }
    else if ((paramObject instanceof Boolean))
    {
      paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
    }
    else if ((paramObject instanceof boolean[]))
    {
      paramBundle.putBooleanArray(paramString, (boolean[])paramObject);
    }
    else if ((paramObject instanceof Double))
    {
      paramBundle.putDouble(paramString, ((Number)paramObject).doubleValue());
    }
    else if ((paramObject instanceof double[]))
    {
      paramBundle.putDoubleArray(paramString, (double[])paramObject);
    }
    else if ((paramObject instanceof Integer))
    {
      paramBundle.putInt(paramString, ((Number)paramObject).intValue());
    }
    else if ((paramObject instanceof int[]))
    {
      paramBundle.putIntArray(paramString, (int[])paramObject);
    }
    else if ((paramObject instanceof Long))
    {
      paramBundle.putLong(paramString, ((Number)paramObject).longValue());
    }
    else if ((paramObject instanceof long[]))
    {
      paramBundle.putLongArray(paramString, (long[])paramObject);
    }
    else
    {
      if ((paramObject instanceof String)) {
        paramObject = (String)paramObject;
      }
      for (;;)
      {
        paramBundle.putString(paramString, (String)paramObject);
        break;
        if ((paramObject instanceof JSONArray))
        {
          paramObject = ((JSONArray)paramObject).toString();
        }
        else
        {
          if (!(paramObject instanceof JSONObject)) {
            break label242;
          }
          paramObject = ((JSONObject)paramObject).toString();
        }
      }
    }
    return true;
    label242:
    return false;
  }
  
  public static final void q(URLConnection paramURLConnection)
  {
    if ((paramURLConnection != null) && ((paramURLConnection instanceof HttpURLConnection))) {
      ((HttpURLConnection)paramURLConnection).disconnect();
    }
  }
  
  public static final void q0(Bundle paramBundle, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "b");
    if (!c0(paramString2)) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public static final Map r0(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    int k = paramParcel.readInt();
    if (k < 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    if (k > 0)
    {
      int m = 0;
      int n;
      do
      {
        n = m + 1;
        String str1 = paramParcel.readString();
        String str2 = paramParcel.readString();
        if ((str1 != null) && (str2 != null)) {
          localHashMap.put(str1, str2);
        }
        m = n;
      } while (n < k);
    }
    return localHashMap;
  }
  
  public static final String s(int paramInt)
  {
    String str = new BigInteger(paramInt * 5, new Random()).toString(32);
    Intrinsics.checkNotNullExpressionValue(str, "BigInteger(length * 5, r).toString(32)");
    return str;
  }
  
  /* Error */
  public static final String s0(InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 932	java/io/BufferedInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 935	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   9: new 1054	java/io/InputStreamReader
    //   12: astore_2
    //   13: aload_2
    //   14: aload_1
    //   15: invokespecial 1055	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   18: new 267	java/lang/StringBuilder
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 268	java/lang/StringBuilder:<init>	()V
    //   26: sipush 2048
    //   29: newarray <illegal type>
    //   31: astore_0
    //   32: aload_2
    //   33: aload_0
    //   34: invokevirtual 1060	java/io/Reader:read	([C)I
    //   37: istore 4
    //   39: iload 4
    //   41: iconst_m1
    //   42: if_icmpeq +19 -> 61
    //   45: aload_3
    //   46: aload_0
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 1063	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: goto -22 -> 32
    //   57: astore_0
    //   58: goto +36 -> 94
    //   61: aload_3
    //   62: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: astore_0
    //   66: aload_0
    //   67: ldc_w 1065
    //   70: invokestatic 68	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   73: aload_1
    //   74: invokestatic 1067	O1/P:j	(Ljava/io/Closeable;)V
    //   77: aload_2
    //   78: invokestatic 1067	O1/P:j	(Ljava/io/Closeable;)V
    //   81: aload_0
    //   82: areturn
    //   83: astore_0
    //   84: aconst_null
    //   85: astore_2
    //   86: goto +8 -> 94
    //   89: astore_0
    //   90: aconst_null
    //   91: astore_1
    //   92: aload_1
    //   93: astore_2
    //   94: aload_1
    //   95: invokestatic 1067	O1/P:j	(Ljava/io/Closeable;)V
    //   98: aload_2
    //   99: invokestatic 1067	O1/P:j	(Ljava/io/Closeable;)V
    //   102: aload_0
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	paramInputStream	InputStream
    //   3	92	1	localBufferedInputStream	BufferedInputStream
    //   12	87	2	localObject	Object
    //   21	41	3	localStringBuilder	StringBuilder
    //   37	12	4	k	int
    // Exception table:
    //   from	to	target	type
    //   18	32	57	finally
    //   32	39	57	finally
    //   45	54	57	finally
    //   61	73	57	finally
    //   9	18	83	finally
    //   0	9	89	finally
  }
  
  public static final String t(Context paramContext)
  {
    if (paramContext == null)
    {
      paramContext = "null";
    }
    else if (paramContext == paramContext.getApplicationContext())
    {
      paramContext = "unknown";
    }
    else
    {
      paramContext = paramContext.getClass().getSimpleName();
      Intrinsics.checkNotNullExpressionValue(paramContext, "{\n      context.javaClass.simpleName\n    }");
    }
    return paramContext;
  }
  
  public static final Map t0(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    int k = paramParcel.readInt();
    if (k < 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    if (k > 0)
    {
      int m = 0;
      int n;
      do
      {
        n = m + 1;
        localHashMap.put(paramParcel.readString(), paramParcel.readString());
        m = n;
      } while (n < k);
    }
    return localHashMap;
  }
  
  public static final String u(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    try
    {
      Object localObject = B.n();
      if (localObject != null) {
        return (String)localObject;
      }
      localObject = paramContext.getApplicationInfo();
      int k = labelRes;
      if (k == 0)
      {
        paramContext = nonLocalizedLabel.toString();
      }
      else
      {
        paramContext = paramContext.getString(k);
        Intrinsics.checkNotNullExpressionValue(paramContext, "context.getString(stringId)");
      }
    }
    catch (Exception paramContext)
    {
      paramContext = "";
    }
    return paramContext;
  }
  
  public static final String v()
  {
    Object localObject = B.l();
    if (localObject == null) {
      return null;
    }
    String str = ((Context)localObject).getPackageName();
    try
    {
      localObject = ((Context)localObject).getPackageManager().getPackageInfo(str, 0);
      if (localObject == null) {
        return null;
      }
      localObject = versionName;
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static final boolean w0(File paramFile, String paramString)
  {
    return Pattern.matches("cpu[0-9]+", paramString);
  }
  
  public static final Date x(Bundle paramBundle, String paramString, Date paramDate)
  {
    Intrinsics.checkNotNullParameter(paramDate, "dateBase");
    if (paramBundle == null) {
      return null;
    }
    paramBundle = paramBundle.get(paramString);
    long l;
    if ((paramBundle instanceof Long)) {
      l = ((Number)paramBundle).longValue();
    } else {
      if (!(paramBundle instanceof String)) {
        break label92;
      }
    }
    try
    {
      l = Long.parseLong((String)paramBundle);
      if (l == 0L) {
        paramBundle = new Date(Long.MAX_VALUE);
      } else {
        paramBundle = new Date(paramDate.getTime() + l * 1000L);
      }
      return paramBundle;
    }
    catch (NumberFormatException paramBundle)
    {
      label92:
      for (;;) {}
    }
    return null;
  }
  
  public static final long z(Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramUri, "contentUri");
    Uri localUri = null;
    try
    {
      paramUri = B.l().getContentResolver().query(paramUri, null, null, null, null);
      if (paramUri == null) {
        return 0L;
      }
      localUri = paramUri;
      int k = paramUri.getColumnIndex("_size");
      localUri = paramUri;
      paramUri.moveToFirst();
      localUri = paramUri;
      long l = paramUri.getLong(k);
      paramUri.close();
      return l;
    }
    finally
    {
      if (localUri != null) {
        localUri.close();
      }
    }
  }
  
  public final void A0()
  {
    try
    {
      if (r())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        d = localStatFs.getBlockCount() * localStatFs.getBlockSize();
      }
      d = l(d);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final String B()
  {
    Object localObject = x1.a.z.e();
    if ((localObject != null) && (((x1.a)localObject).h() != null)) {
      localObject = ((x1.a)localObject).h();
    } else {
      localObject = "facebook";
    }
    return (String)localObject;
  }
  
  public final String D()
  {
    return g;
  }
  
  public final F F(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", M(B()));
    localBundle.putString("access_token", paramString);
    paramString = F.n.y(null, null);
    paramString.G(localBundle);
    paramString.F(x1.L.o);
    return paramString;
  }
  
  public final Locale I()
  {
    return j;
  }
  
  public final String M(String paramString)
  {
    if (Intrinsics.a(paramString, "instagram")) {
      paramString = "id,name,profile_picture";
    } else {
      paramString = "id,name,first_name,middle_name,last_name";
    }
    return paramString;
  }
  
  public final String P()
  {
    return i;
  }
  
  public final String Q(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    paramMessageDigest.update(paramArrayOfByte);
    paramMessageDigest = paramMessageDigest.digest();
    paramArrayOfByte = new StringBuilder();
    Intrinsics.checkNotNullExpressionValue(paramMessageDigest, "digest");
    int k = paramMessageDigest.length;
    int m = 0;
    while (m < k)
    {
      int n = paramMessageDigest[m];
      m++;
      paramArrayOfByte.append(Integer.toHexString(n >> 4 & 0xF));
      paramArrayOfByte.append(Integer.toHexString(n & 0xF));
    }
    paramMessageDigest = paramArrayOfByte.toString();
    Intrinsics.checkNotNullExpressionValue(paramMessageDigest, "builder.toString()");
    return paramMessageDigest;
  }
  
  public final String R(String paramString1, String paramString2)
  {
    Charset localCharset = b.b;
    if (paramString2 != null)
    {
      paramString2 = paramString2.getBytes(localCharset);
      Intrinsics.checkNotNullExpressionValue(paramString2, "(this as java.lang.String).getBytes(charset)");
      return S(paramString1, paramString2);
    }
    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
  }
  
  public final String S(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      Intrinsics.checkNotNullExpressionValue(paramString, "hash");
      return Q(paramString, paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException paramString) {}
    return null;
  }
  
  public final boolean b0(Context paramContext)
  {
    boolean bool = true;
    Method localMethod = L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
    if (localMethod == null) {
      return false;
    }
    paramContext = T(null, localMethod, new Object[] { paramContext });
    if ((!(paramContext instanceof Integer)) || (!Intrinsics.a(paramContext, Integer.valueOf(0)))) {
      bool = false;
    }
    return bool;
  }
  
  public final void c(JSONObject paramJSONObject, a parama, String paramString, Context paramContext)
  {
    if ((Build.VERSION.SDK_INT < 31) || (!b0(paramContext)) || (!parama.k())) {
      paramJSONObject.put("anon_id", paramString);
    }
  }
  
  public final void d(JSONObject paramJSONObject, a parama, Context paramContext)
  {
    if ((Build.VERSION.SDK_INT < 31) || (!b0(paramContext)) || (!parama.k())) {
      paramJSONObject.put("attribution", parama.j());
    }
  }
  
  public final void h(Context paramContext, String paramString)
  {
    CookieSyncManager.createInstance(paramContext).sync();
    paramContext = CookieManager.getInstance();
    Object localObject1 = paramContext.getCookie(paramString);
    if (localObject1 == null) {
      return;
    }
    localObject1 = ((Collection)i.V((CharSequence)localObject1, new String[] { ";" }, false, 0, 6, null)).toArray(new String[0]);
    if (localObject1 != null)
    {
      localObject1 = (String[])localObject1;
      int k = localObject1.length;
      int m = 0;
      while (m < k)
      {
        Object localObject2 = localObject1[m];
        int n = m + 1;
        localObject2 = ((Collection)i.V((CharSequence)localObject2, new String[] { "=" }, false, 0, 6, null)).toArray(new String[0]);
        if (localObject2 != null)
        {
          localObject2 = (String[])localObject2;
          m = n;
          if (localObject2.length > 0)
          {
            localObject2 = localObject2[0];
            int i1 = ((CharSequence)localObject2).length() - 1;
            m = 0;
            int i2 = m;
            while (m <= i1)
            {
              int i3;
              if (i2 == 0) {
                i3 = m;
              } else {
                i3 = i1;
              }
              if (Intrinsics.d(((CharSequence)localObject2).charAt(i3), 32) <= 0) {
                i3 = 1;
              } else {
                i3 = 0;
              }
              if (i2 == 0)
              {
                if (i3 == 0) {
                  i2 = 1;
                } else {
                  m++;
                }
              }
              else
              {
                if (i3 == 0) {
                  break;
                }
                i1--;
              }
            }
            paramContext.setCookie(paramString, Intrinsics.i(((CharSequence)localObject2).subSequence(m, i1 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            m = n;
          }
        }
        else
        {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
      }
      paramContext.removeExpiredCookie();
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  public final long l(double paramDouble)
  {
    return Math.round(paramDouble / 1.073741824E9D);
  }
  
  public final boolean r()
  {
    return Intrinsics.a("mounted", Environment.getExternalStorageState());
  }
  
  public final void u0()
  {
    try
    {
      if (r())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        e = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
      }
      e = l(e);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final int v0()
  {
    int k = b;
    if (k > 0) {
      return k;
    }
    try
    {
      Object localObject = new java/io/File;
      ((File)localObject).<init>("/sys/devices/system/cpu/");
      O localO = new O1/O;
      localO.<init>();
      localObject = ((File)localObject).listFiles(localO);
      if (localObject != null) {
        b = localObject.length;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (b <= 0) {
      b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }
    return b;
  }
  
  public final long w()
  {
    return e;
  }
  
  public final void x0(Context paramContext)
  {
    if (Intrinsics.a(h, "NoCarrier")) {}
    try
    {
      paramContext = paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = ((TelephonyManager)paramContext).getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(paramContext, "telephonyManager.networkOperatorName");
        h = paramContext;
      }
      else
      {
        paramContext = new java/lang/NullPointerException;
        paramContext.<init>("null cannot be cast to non-null type android.telephony.TelephonyManager");
        throw paramContext;
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public final String y()
  {
    return h;
  }
  
  public final void y0(Context paramContext)
  {
    if ((c == -1L) || (System.currentTimeMillis() - c >= 1800000L))
    {
      c = System.currentTimeMillis();
      z0();
      x0(paramContext);
      A0();
      u0();
    }
  }
  
  public final void z0()
  {
    try
    {
      Object localObject1 = TimeZone.getDefault();
      Object localObject2 = new java/util/Date;
      ((Date)localObject2).<init>();
      localObject2 = ((TimeZone)localObject1).getDisplayName(((TimeZone)localObject1).inDaylightTime((Date)localObject2), 0);
      Intrinsics.checkNotNullExpressionValue(localObject2, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
      f = (String)localObject2;
      localObject1 = ((TimeZone)localObject1).getID();
      Intrinsics.checkNotNullExpressionValue(localObject1, "tz.id");
      g = (String)localObject1;
      return;
    }
    catch (AssertionError|Exception localAssertionError)
    {
      for (;;) {}
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(JSONObject paramJSONObject);
    
    public abstract void b(o paramo);
  }
}

/* Location:
 * Qualified Name:     O1.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */