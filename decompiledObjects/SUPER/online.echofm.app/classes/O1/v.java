package O1;

import C1.e;
import G1.i;
import W5.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.f;
import x1.B;
import x1.F;
import x1.F.c;
import x1.K;

public final class v
{
  public static final v a = new v();
  public static final String b = v.class.getSimpleName();
  public static final List c = m.i(new String[] { "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled" });
  public static final Map d = new ConcurrentHashMap();
  public static final AtomicReference e = new AtomicReference(a.o);
  public static final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
  public static boolean g;
  public static JSONArray h;
  
  public static final void d(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "callback");
    f.add(paramb);
    h();
  }
  
  public static final r f(String paramString)
  {
    if (paramString != null) {
      paramString = (r)d.get(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public static final Map g()
  {
    Object localObject = B.l();
    String str = B.m();
    x localx = x.a;
    str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[] { str }, 1));
    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
    str = ((Context)localObject).getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
    if (!P.c0(str)) {
      if (str != null)
      {
        JSONObject localJSONObject;
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str);
        }
        catch (JSONException localJSONException)
        {
          P.i0("FacebookSDK", localJSONException);
          localJSONObject = null;
        }
        if (localJSONObject != null) {
          return a.l(localJSONObject);
        }
      }
      else
      {
        throw new IllegalStateException("Required value was null.".toString());
      }
    }
    return null;
  }
  
  public static final void h()
  {
    Context localContext = B.l();
    String str = B.m();
    if (P.c0(str))
    {
      e.set(a.r);
      a.n();
      return;
    }
    if (d.containsKey(str))
    {
      e.set(a.q);
      a.n();
      return;
    }
    Object localObject = e;
    a locala1 = a.o;
    a locala2 = a.p;
    if ((!f.a((AtomicReference)localObject, locala1, locala2)) && (!f.a((AtomicReference)localObject, a.r, locala2)))
    {
      a.n();
      return;
    }
    localObject = x.a;
    localObject = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[] { str }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    B.t().execute(new s(localContext, (String)localObject, str));
  }
  
  public static final void i(Context paramContext, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramContext, "$context");
    Intrinsics.checkNotNullParameter(paramString1, "$settingsKey");
    Intrinsics.checkNotNullParameter(paramString2, "$applicationId");
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
    JSONObject localJSONObject = null;
    String str = localSharedPreferences.getString(paramString1, null);
    paramContext = localJSONObject;
    if (!P.c0(str)) {
      if (str != null)
      {
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str);
        }
        catch (JSONException paramContext)
        {
          P.i0("FacebookSDK", paramContext);
          localObject = null;
        }
        paramContext = localJSONObject;
        if (localObject != null) {
          paramContext = a.j(paramString2, (JSONObject)localObject);
        }
      }
      else
      {
        throw new IllegalStateException("Required value was null.".toString());
      }
    }
    Object localObject = a;
    localJSONObject = ((v)localObject).e(paramString2);
    if (localJSONObject != null)
    {
      ((v)localObject).j(paramString2, localJSONObject);
      localSharedPreferences.edit().putString(paramString1, localJSONObject.toString()).apply();
    }
    if (paramContext != null)
    {
      paramContext = paramContext.j();
      if ((!g) && (paramContext != null) && (paramContext.length() > 0))
      {
        g = true;
        Log.w(b, paramContext);
      }
    }
    q.m(paramString2, true);
    i.d();
    paramString1 = e;
    if (d.containsKey(paramString2)) {
      paramContext = a.q;
    } else {
      paramContext = a.r;
    }
    paramString1.set(paramContext);
    ((v)localObject).n();
  }
  
  public static final void o(b paramb)
  {
    paramb.a();
  }
  
  public static final void p(b paramb, r paramr)
  {
    paramb.b(paramr);
  }
  
  public static final r q(String paramString, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString, "applicationId");
    if (!paramBoolean)
    {
      localObject1 = d;
      if (((Map)localObject1).containsKey(paramString)) {
        return (r)((Map)localObject1).get(paramString);
      }
    }
    Object localObject1 = a;
    Object localObject2 = ((v)localObject1).e(paramString);
    if (localObject2 == null) {
      return null;
    }
    localObject2 = ((v)localObject1).j(paramString, (JSONObject)localObject2);
    if (Intrinsics.a(paramString, B.m()))
    {
      e.set(a.q);
      ((v)localObject1).n();
    }
    return (r)localObject2;
  }
  
  public final JSONObject e(String paramString)
  {
    paramString = new Bundle();
    Object localObject = new ArrayList();
    ((List)localObject).addAll((Collection)c);
    paramString.putString("fields", TextUtils.join(",", (Iterable)localObject));
    localObject = F.n.x(null, "app", null);
    ((F)localObject).D(true);
    ((F)localObject).G(paramString);
    localObject = ((F)localObject).k().d();
    paramString = (String)localObject;
    if (localObject == null) {
      paramString = new JSONObject();
    }
    return paramString;
  }
  
  public final r j(String paramString, JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramString, "applicationId");
    Intrinsics.checkNotNullParameter(paramJSONObject, "settingsJSON");
    Object localObject1 = paramJSONObject.optJSONArray("android_sdk_error_categories");
    Object localObject2 = j.g;
    Object localObject3 = ((j.a)localObject2).a((JSONArray)localObject1);
    localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = ((j.a)localObject2).b();
    }
    int i = paramJSONObject.optInt("app_events_feature_bitmask", 0);
    boolean bool1;
    if ((i & 0x8) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((i & 0x10) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3;
    if ((i & 0x20) != 0) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    boolean bool4;
    if ((i & 0x100) != 0) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    boolean bool5;
    if ((i & 0x4000) != 0) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    localObject2 = paramJSONObject.optJSONArray("auto_event_mapping_android");
    h = (JSONArray)localObject2;
    if ((localObject2 != null) && (z.b()))
    {
      localObject3 = e.a;
      if (localObject2 == null) {
        localObject3 = null;
      } else {
        localObject3 = ((JSONArray)localObject2).toString();
      }
      e.c((String)localObject3);
    }
    boolean bool6 = paramJSONObject.optBoolean("supports_implicit_sdk_logging", false);
    String str1 = paramJSONObject.optString("gdpv4_nux_content", "");
    Intrinsics.checkNotNullExpressionValue(str1, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
    boolean bool7 = paramJSONObject.optBoolean("gdpv4_nux_enabled", false);
    i = paramJSONObject.optInt("app_events_session_timeout", G1.j.a());
    EnumSet localEnumSet = I.p.a(paramJSONObject.optLong("seamless_login"));
    Map localMap = k(paramJSONObject.optJSONObject("android_dialog_configs"));
    String str2 = paramJSONObject.optString("smart_login_bookmark_icon_url");
    Intrinsics.checkNotNullExpressionValue(str2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
    localObject3 = paramJSONObject.optString("smart_login_menu_icon_url");
    Intrinsics.checkNotNullExpressionValue(localObject3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
    String str3 = paramJSONObject.optString("sdk_update_message");
    Intrinsics.checkNotNullExpressionValue(str3, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
    paramJSONObject = new r(bool6, str1, bool7, i, localEnumSet, localMap, bool1, (j)localObject1, str2, (String)localObject3, bool2, bool3, (JSONArray)localObject2, str3, bool4, bool5, paramJSONObject.optString("aam_rules"), paramJSONObject.optString("suggested_events_setting"), paramJSONObject.optString("restrictive_data_filter_params"), m(paramJSONObject.optJSONObject("protected_mode_rules"), "standard_params"), m(paramJSONObject.optJSONObject("protected_mode_rules"), "maca_rules"), l(paramJSONObject));
    d.put(paramString, paramJSONObject);
    return paramJSONObject;
  }
  
  public final Map k(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
      if (localJSONArray != null)
      {
        int i = localJSONArray.length();
        if (i > 0)
        {
          int k;
          for (int j = 0;; j = k)
          {
            k = j + 1;
            Object localObject = r.b.e;
            paramJSONObject = localJSONArray.optJSONObject(j);
            Intrinsics.checkNotNullExpressionValue(paramJSONObject, "dialogConfigData.optJSONObject(i)");
            r.b localb = ((r.b.a)localObject).a(paramJSONObject);
            if (localb != null)
            {
              String str = localb.a();
              localObject = (Map)localHashMap.get(str);
              paramJSONObject = (JSONObject)localObject;
              if (localObject == null)
              {
                paramJSONObject = new HashMap();
                localHashMap.put(str, paramJSONObject);
              }
              paramJSONObject.put(localb.b(), localb);
            }
            if (k >= i) {
              break;
            }
          }
        }
      }
    }
    return localHashMap;
  }
  
  public final Map l(JSONObject paramJSONObject)
  {
    Object localObject = null;
    if (paramJSONObject == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    if (!paramJSONObject.isNull("auto_log_app_events_default")) {
      try
      {
        localHashMap.put("auto_log_app_events_default", Boolean.valueOf(paramJSONObject.getBoolean("auto_log_app_events_default")));
      }
      catch (JSONException localJSONException)
      {
        P.i0("FacebookSDK", localJSONException);
      }
    }
    if (!paramJSONObject.isNull("auto_log_app_events_enabled")) {
      try
      {
        localHashMap.put("auto_log_app_events_enabled", Boolean.valueOf(paramJSONObject.getBoolean("auto_log_app_events_enabled")));
      }
      catch (JSONException paramJSONObject)
      {
        P.i0("FacebookSDK", paramJSONObject);
      }
    }
    if (localHashMap.isEmpty()) {
      paramJSONObject = (JSONObject)localObject;
    } else {
      paramJSONObject = localHashMap;
    }
    return paramJSONObject;
  }
  
  public final JSONArray m(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject != null) {
      paramJSONObject = paramJSONObject.optJSONArray(paramString);
    } else {
      paramJSONObject = null;
    }
    return paramJSONObject;
  }
  
  /* Error */
  public final void n()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 99	O1/v:e	Ljava/util/concurrent/atomic/AtomicReference;
    //   5: invokevirtual 515	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   8: checkcast 6	O1/v$a
    //   11: astore_1
    //   12: getstatic 94	O1/v$a:o	LO1/v$a;
    //   15: aload_1
    //   16: if_acmpeq +136 -> 152
    //   19: getstatic 232	O1/v$a:p	LO1/v$a;
    //   22: aload_1
    //   23: if_acmpne +6 -> 29
    //   26: goto +126 -> 152
    //   29: invokestatic 151	x1/B:m	()Ljava/lang/String;
    //   32: astore_2
    //   33: getstatic 88	O1/v:d	Ljava/util/Map;
    //   36: aload_2
    //   37: invokeinterface 137 2 0
    //   42: checkcast 139	O1/r
    //   45: astore_3
    //   46: new 517	android/os/Handler
    //   49: astore_2
    //   50: aload_2
    //   51: invokestatic 523	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   54: invokespecial 526	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   57: getstatic 218	O1/v$a:r	LO1/v$a;
    //   60: aload_1
    //   61: if_acmpne +47 -> 108
    //   64: getstatic 104	O1/v:f	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   67: astore_3
    //   68: aload_3
    //   69: invokevirtual 527	java/util/concurrent/ConcurrentLinkedQueue:isEmpty	()Z
    //   72: ifne +33 -> 105
    //   75: aload_3
    //   76: invokevirtual 530	java/util/concurrent/ConcurrentLinkedQueue:poll	()Ljava/lang/Object;
    //   79: checkcast 9	O1/v$b
    //   82: astore_1
    //   83: new 532	O1/t
    //   86: astore_3
    //   87: aload_3
    //   88: aload_1
    //   89: invokespecial 534	O1/t:<init>	(LO1/v$b;)V
    //   92: aload_2
    //   93: aload_3
    //   94: invokevirtual 538	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   97: pop
    //   98: goto -34 -> 64
    //   101: astore_2
    //   102: goto +53 -> 155
    //   105: aload_0
    //   106: monitorexit
    //   107: return
    //   108: getstatic 104	O1/v:f	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   111: astore_1
    //   112: aload_1
    //   113: invokevirtual 527	java/util/concurrent/ConcurrentLinkedQueue:isEmpty	()Z
    //   116: ifne +33 -> 149
    //   119: aload_1
    //   120: invokevirtual 530	java/util/concurrent/ConcurrentLinkedQueue:poll	()Ljava/lang/Object;
    //   123: checkcast 9	O1/v$b
    //   126: astore_1
    //   127: new 540	O1/u
    //   130: astore 4
    //   132: aload 4
    //   134: aload_1
    //   135: aload_3
    //   136: invokespecial 542	O1/u:<init>	(LO1/v$b;LO1/r;)V
    //   139: aload_2
    //   140: aload 4
    //   142: invokevirtual 538	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   145: pop
    //   146: goto -38 -> 108
    //   149: aload_0
    //   150: monitorexit
    //   151: return
    //   152: aload_0
    //   153: monitorexit
    //   154: return
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_2
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	v
    //   11	124	1	localObject1	Object
    //   32	61	2	localObject2	Object
    //   101	57	2	localObject3	Object
    //   45	91	3	localObject4	Object
    //   130	11	4	localu	u
    // Exception table:
    //   from	to	target	type
    //   2	26	101	finally
    //   29	64	101	finally
    //   64	98	101	finally
    //   108	146	101	finally
  }
  
  public static enum a {}
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b(r paramr);
  }
}

/* Location:
 * Qualified Name:     O1.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */