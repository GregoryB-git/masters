package K1;

import O1.P;
import T1.a;
import W5.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class b
{
  public static final b a = new b();
  public static final Map b = new LinkedHashMap();
  public static SharedPreferences c;
  public static final AtomicBoolean d = new AtomicBoolean(false);
  
  public static final void a(String paramString1, String paramString2)
  {
    if (a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "pathID");
      Intrinsics.checkNotNullParameter(paramString2, "predictedEvent");
      if (!d.get()) {
        a.c();
      }
    }
    finally
    {
      break label103;
    }
    Map localMap = b;
    localMap.put(paramString1, paramString2);
    paramString1 = c;
    if (paramString1 != null)
    {
      paramString1 = paramString1.edit();
      paramString2 = P.a;
      paramString1.putString("SUGGESTED_EVENTS_HISTORY", P.l0(C.m(localMap))).apply();
      return;
    }
    Intrinsics.n("shardPreferences");
    throw null;
    label103:
    a.b(paramString1, b.class);
  }
  
  /* Error */
  public static final String b(android.view.View paramView, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 39	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 109
    //   13: invokestatic 47	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ldc 111
    //   19: invokestatic 47	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: new 113	org/json/JSONObject
    //   25: astore_2
    //   26: aload_2
    //   27: invokespecial 114	org/json/JSONObject:<init>	()V
    //   30: aload_2
    //   31: ldc 111
    //   33: aload_1
    //   34: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   37: pop
    //   38: new 119	org/json/JSONArray
    //   41: astore_1
    //   42: aload_1
    //   43: invokespecial 120	org/json/JSONArray:<init>	()V
    //   46: aload_0
    //   47: ifnull +27 -> 74
    //   50: aload_1
    //   51: aload_0
    //   52: invokevirtual 124	java/lang/Object:getClass	()Ljava/lang/Class;
    //   55: invokevirtual 130	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   58: invokevirtual 133	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   61: pop
    //   62: aload_0
    //   63: invokestatic 139	C1/f:j	(Landroid/view/View;)Landroid/view/ViewGroup;
    //   66: astore_0
    //   67: goto -21 -> 46
    //   70: astore_0
    //   71: goto +25 -> 96
    //   74: aload_2
    //   75: ldc -115
    //   77: aload_1
    //   78: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   81: pop
    //   82: getstatic 74	O1/P:a	LO1/P;
    //   85: astore_0
    //   86: aload_2
    //   87: invokevirtual 144	org/json/JSONObject:toString	()Ljava/lang/String;
    //   90: invokestatic 148	O1/P:F0	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore_0
    //   94: aload_0
    //   95: areturn
    //   96: aload_0
    //   97: ldc 2
    //   99: invokestatic 104	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   102: aconst_null
    //   103: areturn
    //   104: astore_0
    //   105: goto -23 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramView	android.view.View
    //   0	108	1	paramString	String
    //   25	62	2	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   10	30	70	finally
    //   30	46	70	finally
    //   50	67	70	finally
    //   74	82	70	finally
    //   82	94	70	finally
    //   30	46	104	org/json/JSONException
    //   50	67	104	org/json/JSONException
    //   74	82	104	org/json/JSONException
  }
  
  public static final String d(String paramString)
  {
    boolean bool = a.d(b.class);
    String str = null;
    if (bool) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "pathID");
      Map localMap = b;
      if (localMap.containsKey(paramString)) {
        str = (String)localMap.get(paramString);
      }
    }
    finally
    {
      break label54;
    }
    return str;
    label54:
    a.b(paramString, b.class);
    return null;
  }
  
  public final void c()
  {
    Object localObject1 = "";
    if (a.d(this)) {
      return;
    }
    try
    {
      AtomicBoolean localAtomicBoolean = d;
      if (localAtomicBoolean.get()) {
        return;
      }
      Object localObject2 = B.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
      Intrinsics.checkNotNullExpressionValue(localObject2, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
      c = (SharedPreferences)localObject2;
      Map localMap = b;
      localObject2 = P.a;
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = ((SharedPreferences)localObject2).getString("SUGGESTED_EVENTS_HISTORY", "");
        if (localObject2 != null) {
          localObject1 = localObject2;
        }
        localMap.putAll(P.h0((String)localObject1));
        localAtomicBoolean.set(true);
        return;
      }
    }
    finally
    {
      break label108;
      Intrinsics.n("shardPreferences");
      throw null;
      label108:
      a.b(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     K1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */