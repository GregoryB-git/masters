package H1;

import G1.k;
import G1.k.a;
import O1.P;
import O1.n;
import O1.n.b;
import V5.l;
import W5.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONObject;
import x1.F;
import x1.F.c;
import x1.K;

public final class f
{
  public static final f a = new f();
  public static final Map b = new ConcurrentHashMap();
  public static final List c = m.i(new String[] { "other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout" });
  public static final List d = m.i(new String[] { "none", "address", "health" });
  
  public static final void f()
  {
    if (T1.a.d(f.class)) {
      return;
    }
    try
    {
      Object localObject = P.a;
      localObject = new H1/c;
      ((c)localObject).<init>();
      P.B0((Runnable)localObject);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, f.class);
    }
  }
  
  public static final void g()
  {
    if (T1.a.d(f.class)) {
      return;
    }
    try
    {
      try
      {
        localObject1 = x1.B.l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
        Object localObject2 = ((SharedPreferences)localObject1).getString("models", null);
        if ((localObject2 != null) && (((CharSequence)localObject2).length() != 0)) {
          localObject2 = new JSONObject((String)localObject2);
        }
      }
      finally
      {
        break label170;
      }
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      long l = ((SharedPreferences)localObject1).getLong("model_request_timestamp", 0L);
      n localn = n.a;
      if ((!n.g(n.b.A)) || (localJSONObject.length() == 0) || (!a.n(l)))
      {
        localJSONObject = a.k();
        if (localJSONObject == null) {
          return;
        }
        ((SharedPreferences)localObject1).edit().putString("models", localJSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
      }
      Object localObject1 = a;
      ((f)localObject1).e(localJSONObject);
      ((f)localObject1).h();
    }
    catch (Exception localException)
    {
      JSONObject localJSONObject;
      label170:
      for (;;) {}
    }
    T1.a.b(localJSONObject, f.class);
  }
  
  public static final void i()
  {
    if (T1.a.d(f.class)) {
      return;
    }
    try
    {
      K1.e.b();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, f.class);
    }
  }
  
  public static final void j()
  {
    if (T1.a.d(f.class)) {
      return;
    }
    try
    {
      F1.a.a();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, f.class);
    }
  }
  
  public static final File l(a parama)
  {
    if (T1.a.d(f.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "task");
      parama = (b)b.get(parama.h());
      if (parama == null) {
        return null;
      }
      parama = parama.d();
      return parama;
    }
    finally
    {
      T1.a.b(parama, f.class);
    }
    return null;
  }
  
  public static final String[] q(a parama, float[][] paramArrayOfFloat, String[] paramArrayOfString)
  {
    boolean bool = T1.a.d(f.class);
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "task");
      Intrinsics.checkNotNullParameter(paramArrayOfFloat, "denses");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "texts");
      Object localObject2 = (b)b.get(parama.h());
      b localb;
      if (localObject2 == null) {
        localb = null;
      } else {
        localb = ((b)localObject2).c();
      }
      if (localb == null) {
        return null;
      }
      localObject2 = ((b)localObject2).f();
      int i = paramArrayOfString.length;
      int j = paramArrayOfFloat[0].length;
      a locala = new H1/a;
      locala.<init>(new int[] { i, j });
      int k;
      if (i > 0)
      {
        int m;
        for (k = 0;; k = m)
        {
          m = k + 1;
          System.arraycopy(paramArrayOfFloat[k], 0, locala.a(), k * j, j);
          if (m >= i) {
            break;
          }
        }
      }
      label281:
      return null;
    }
    finally
    {
      break label281;
      paramArrayOfString = localb.b(locala, paramArrayOfString, parama.e());
      paramArrayOfFloat = (float[][])localObject1;
      if (paramArrayOfString != null)
      {
        paramArrayOfFloat = (float[][])localObject1;
        if (localObject2 != null) {
          if (paramArrayOfString.a().length == 0)
          {
            paramArrayOfFloat = (float[][])localObject1;
          }
          else if (localObject2.length == 0)
          {
            paramArrayOfFloat = (float[][])localObject1;
          }
          else
          {
            k = c.a[parama.ordinal()];
            if (k != 1)
            {
              if (k == 2)
              {
                paramArrayOfFloat = a.r(paramArrayOfString, (float[])localObject2);
              }
              else
              {
                parama = new V5/l;
                parama.<init>();
                throw parama;
              }
            }
            else {
              paramArrayOfFloat = a.s(paramArrayOfString, (float[])localObject2);
            }
          }
        }
      }
      return paramArrayOfFloat;
      T1.a.b(parama, f.class);
    }
  }
  
  /* Error */
  public final void e(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 77	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: invokevirtual 278	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   12: astore_2
    //   13: aload_2
    //   14: invokeinterface 284 1 0
    //   19: ifeq +53 -> 72
    //   22: aload_2
    //   23: invokeinterface 288 1 0
    //   28: checkcast 35	java/lang/String
    //   31: astore_3
    //   32: getstatic 291	H1/f$b:i	LH1/f$b$a;
    //   35: aload_1
    //   36: aload_3
    //   37: invokevirtual 295	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   40: invokevirtual 298	H1/f$b$a:c	(Lorg/json/JSONObject;)LH1/f$b;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnonnull +6 -> 51
    //   48: goto -35 -> 13
    //   51: getstatic 33	H1/f:b	Ljava/util/Map;
    //   54: aload_3
    //   55: invokevirtual 300	H1/f$b:g	()Ljava/lang/String;
    //   58: aload_3
    //   59: invokeinterface 304 3 0
    //   64: pop
    //   65: goto -52 -> 13
    //   68: astore_1
    //   69: goto +4 -> 73
    //   72: return
    //   73: aload_1
    //   74: aload_0
    //   75: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   78: return
    //   79: astore_1
    //   80: goto -8 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	f
    //   0	83	1	paramJSONObject	JSONObject
    //   12	11	2	localIterator	Iterator
    //   31	28	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	68	finally
    //   13	44	68	finally
    //   51	65	68	finally
    //   13	44	79	org/json/JSONException
    //   51	65	79	org/json/JSONException
  }
  
  public final void h()
  {
    if (T1.a.d(this)) {
      return;
    }
    ArrayList localArrayList;
    int i;
    Object localObject4;
    Object localObject2;
    for (;;)
    {
      Object localObject3;
      int j;
      try
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Iterator localIterator = b.entrySet().iterator();
        String str = null;
        i = 0;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject3 = (Map.Entry)localIterator.next();
        localObject4 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = (b)((Map.Entry)localObject3).getValue();
        j = i;
        if (Intrinsics.a(localObject4, a.p.h()))
        {
          str = ((b)localObject3).b();
          j = Math.max(i, ((b)localObject3).h());
          Object localObject5 = n.a;
          if ((n.g(n.b.y)) && (m()))
          {
            localObject5 = new H1/d;
            ((d)localObject5).<init>();
            localArrayList.add(((b)localObject3).j((Runnable)localObject5));
          }
        }
      }
      finally
      {
        break label301;
      }
      i = j;
      if (Intrinsics.a(localObject4, a.o.h()))
      {
        localObject4 = ((b)localObject3).b();
        j = Math.max(j, ((b)localObject3).h());
        localObject2 = n.a;
        localObject2 = localObject4;
        i = j;
        if (n.g(n.b.z))
        {
          localObject2 = new H1/e;
          ((e)localObject2).<init>();
          localArrayList.add(((b)localObject3).j((Runnable)localObject2));
          localObject2 = localObject4;
          i = j;
        }
      }
    }
    if ((localObject2 != null) && (i > 0) && (!localArrayList.isEmpty()))
    {
      localObject4 = new H1/f$b;
      ((b)localObject4).<init>("MTML", (String)localObject2, null, i, null);
      b.i.f((b)localObject4, localArrayList);
    }
    return;
    label301:
    T1.a.b((Throwable)localObject2, this);
  }
  
  public final JSONObject k()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("fields", TextUtils.join(",", new String[] { "use_case", "version_id", "asset_uri", "rules_uri", "thresholds" }));
      Object localObject = F.n.x(null, "app/model_asset", null);
      ((F)localObject).G(localBundle);
      localObject = ((F)localObject).k().c();
      if (localObject == null) {
        return null;
      }
      localObject = p((JSONObject)localObject);
      return (JSONObject)localObject;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return null;
  }
  
  public final boolean m()
  {
    boolean bool1 = T1.a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Object localObject = P.N();
      if (localObject != null)
      {
        localObject = ((Locale)localObject).getLanguage();
        Intrinsics.checkNotNullExpressionValue(localObject, "locale.language");
        bool1 = i.v((CharSequence)localObject, "en", false, 2, null);
        if (!bool1) {
          break label57;
        }
      }
    }
    finally
    {
      break label59;
    }
    bool2 = true;
    label57:
    return bool2;
    label59:
    T1.a.b(localThrowable, this);
    return false;
  }
  
  public final boolean n(long paramLong)
  {
    boolean bool1 = T1.a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (paramLong != 0L) {}
    try
    {
      long l = System.currentTimeMillis();
      if (l - paramLong < 259200000L) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return false;
  }
  
  /* Error */
  public final float[] o(org.json.JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 77	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_1
    //   10: ifnonnull +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: aload_1
    //   16: invokevirtual 459	org/json/JSONArray:length	()I
    //   19: newarray <illegal type>
    //   21: astore_2
    //   22: aload_1
    //   23: invokevirtual 459	org/json/JSONArray:length	()I
    //   26: istore_3
    //   27: iload_3
    //   28: ifle +60 -> 88
    //   31: iconst_0
    //   32: istore 4
    //   34: iload 4
    //   36: iconst_1
    //   37: iadd
    //   38: istore 5
    //   40: aload_1
    //   41: iload 4
    //   43: invokevirtual 462	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   46: astore 6
    //   48: aload 6
    //   50: ldc_w 464
    //   53: invokestatic 446	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   56: aload_2
    //   57: iload 4
    //   59: aload 6
    //   61: invokestatic 470	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   64: fastore
    //   65: goto +7 -> 72
    //   68: astore_1
    //   69: goto +21 -> 90
    //   72: iload 5
    //   74: iload_3
    //   75: if_icmplt +6 -> 81
    //   78: goto +10 -> 88
    //   81: iload 5
    //   83: istore 4
    //   85: goto -51 -> 34
    //   88: aload_2
    //   89: areturn
    //   90: aload_1
    //   91: aload_0
    //   92: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   95: aconst_null
    //   96: areturn
    //   97: astore 6
    //   99: goto -27 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	f
    //   0	102	1	paramJSONArray	org.json.JSONArray
    //   21	68	2	arrayOfFloat	float[]
    //   26	50	3	i	int
    //   32	52	4	j	int
    //   38	44	5	k	int
    //   46	14	6	str	String
    //   97	1	6	localJSONException	org.json.JSONException
    // Exception table:
    //   from	to	target	type
    //   15	27	68	finally
    //   40	65	68	finally
    //   40	65	97	org/json/JSONException
  }
  
  /* Error */
  public final JSONObject p(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 77	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 129	org/json/JSONObject
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial 133	org/json/JSONObject:<init>	()V
    //   17: aload_1
    //   18: ldc_w 472
    //   21: invokevirtual 476	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual 459	org/json/JSONArray:length	()I
    //   29: istore 4
    //   31: aload_2
    //   32: astore_1
    //   33: iload 4
    //   35: ifle +168 -> 203
    //   38: iconst_0
    //   39: istore 5
    //   41: iload 5
    //   43: iconst_1
    //   44: iadd
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: invokevirtual 479	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   53: astore_1
    //   54: new 129	org/json/JSONObject
    //   57: astore 7
    //   59: aload 7
    //   61: invokespecial 133	org/json/JSONObject:<init>	()V
    //   64: aload 7
    //   66: ldc_w 388
    //   69: aload_1
    //   70: ldc_w 388
    //   73: invokevirtual 482	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   76: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   79: pop
    //   80: aload 7
    //   82: ldc_w 386
    //   85: aload_1
    //   86: ldc_w 386
    //   89: invokevirtual 482	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   92: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   95: pop
    //   96: aload 7
    //   98: ldc_w 394
    //   101: aload_1
    //   102: ldc_w 394
    //   105: invokevirtual 476	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   108: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   111: pop
    //   112: aload 7
    //   114: ldc_w 390
    //   117: aload_1
    //   118: ldc_w 390
    //   121: invokevirtual 482	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   127: pop
    //   128: aload_1
    //   129: ldc_w 392
    //   132: invokevirtual 489	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   135: ifeq +26 -> 161
    //   138: aload 7
    //   140: ldc_w 392
    //   143: aload_1
    //   144: ldc_w 392
    //   147: invokevirtual 482	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   150: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   153: pop
    //   154: goto +7 -> 161
    //   157: astore_1
    //   158: goto +47 -> 205
    //   161: aload_2
    //   162: aload_1
    //   163: ldc_w 386
    //   166: invokevirtual 482	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   169: aload 7
    //   171: invokevirtual 485	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   174: pop
    //   175: iload 6
    //   177: iload 4
    //   179: if_icmplt +8 -> 187
    //   182: aload_2
    //   183: astore_1
    //   184: goto +19 -> 203
    //   187: iload 6
    //   189: istore 5
    //   191: goto -150 -> 41
    //   194: astore_1
    //   195: new 129	org/json/JSONObject
    //   198: dup
    //   199: invokespecial 133	org/json/JSONObject:<init>	()V
    //   202: astore_1
    //   203: aload_1
    //   204: areturn
    //   205: aload_1
    //   206: aload_0
    //   207: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   210: aconst_null
    //   211: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	f
    //   0	212	1	paramJSONObject	JSONObject
    //   12	171	2	localJSONObject1	JSONObject
    //   24	24	3	localJSONArray	org.json.JSONArray
    //   29	151	4	i	int
    //   39	151	5	j	int
    //   45	143	6	k	int
    //   57	113	7	localJSONObject2	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	17	157	finally
    //   17	31	157	finally
    //   47	154	157	finally
    //   161	175	157	finally
    //   195	203	157	finally
    //   17	31	194	org/json/JSONException
    //   47	154	194	org/json/JSONException
    //   161	175	194	org/json/JSONException
  }
  
  public final String[] r(a parama, float[] paramArrayOfFloat)
  {
    if (T1.a.d(this)) {
      return null;
    }
    ArrayList localArrayList;
    for (;;)
    {
      int i;
      int n;
      try
      {
        i = parama.b(0);
        int j = parama.b(1);
        float[] arrayOfFloat = parama.a();
        if (j != paramArrayOfFloat.length) {
          return null;
        }
        parama = l6.d.g(0, i);
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>(m.l(parama, 10));
        Iterator localIterator = parama.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        int k = ((W5.B)localIterator).b();
        parama = "none";
        int m = paramArrayOfFloat.length;
        n = 0;
        i = n;
        if (n >= m) {
          break label155;
        }
        float f = paramArrayOfFloat[n];
        if (arrayOfFloat[(k * j + i)] >= f) {
          parama = d.get(i);
        }
      }
      finally
      {
        break label204;
      }
      n++;
      i++;
      continue;
      label155:
      localArrayList.add((String)parama);
    }
    parama = localArrayList.toArray(new String[0]);
    if (parama != null) {
      return (String[])parama;
    }
    parama = new java/lang/NullPointerException;
    parama.<init>("null cannot be cast to non-null type kotlin.Array<T>");
    throw parama;
    label204:
    T1.a.b(parama, this);
    return null;
  }
  
  public final String[] s(a parama, float[] paramArrayOfFloat)
  {
    if (T1.a.d(this)) {
      return null;
    }
    ArrayList localArrayList;
    for (;;)
    {
      int i;
      int n;
      try
      {
        i = parama.b(0);
        int j = parama.b(1);
        float[] arrayOfFloat = parama.a();
        if (j != paramArrayOfFloat.length) {
          return null;
        }
        parama = l6.d.g(0, i);
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>(m.l(parama, 10));
        Iterator localIterator = parama.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        int k = ((W5.B)localIterator).b();
        parama = "other";
        int m = paramArrayOfFloat.length;
        n = 0;
        i = n;
        if (n >= m) {
          break label155;
        }
        float f = paramArrayOfFloat[n];
        if (arrayOfFloat[(k * j + i)] >= f) {
          parama = c.get(i);
        }
      }
      finally
      {
        break label204;
      }
      n++;
      i++;
      continue;
      label155:
      localArrayList.add((String)parama);
    }
    parama = localArrayList.toArray(new String[0]);
    if (parama != null) {
      return (String[])parama;
    }
    parama = new java/lang/NullPointerException;
    parama.<init>("null cannot be cast to non-null type kotlin.Array<T>");
    throw parama;
    label204:
    T1.a.b(parama, this);
    return null;
  }
  
  public static enum a
  {
    public final String e()
    {
      int i = a.a[ordinal()];
      String str;
      if (i != 1)
      {
        if (i == 2) {
          str = "app_event_pred";
        } else {
          throw new l();
        }
      }
      else {
        str = "integrity_detect";
      }
      return str;
    }
    
    public final String h()
    {
      int i = a.a[ordinal()];
      String str;
      if (i != 1)
      {
        if (i == 2) {
          str = "MTML_APP_EVENT_PRED";
        } else {
          throw new l();
        }
      }
      else {
        str = "MTML_INTEGRITY_DETECT";
      }
      return str;
    }
  }
  
  public static final class b
  {
    public static final a i = new a(null);
    public String a;
    public String b;
    public String c;
    public int d;
    public float[] e;
    public File f;
    public b g;
    public Runnable h;
    
    public b(String paramString1, String paramString2, String paramString3, int paramInt, float[] paramArrayOfFloat)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
      d = paramInt;
      e = paramArrayOfFloat;
    }
    
    public final String b()
    {
      return b;
    }
    
    public final b c()
    {
      return g;
    }
    
    public final File d()
    {
      return f;
    }
    
    public final String e()
    {
      return c;
    }
    
    public final float[] f()
    {
      return e;
    }
    
    public final String g()
    {
      return a;
    }
    
    public final int h()
    {
      return d;
    }
    
    public final void i(b paramb)
    {
      g = paramb;
    }
    
    public final b j(Runnable paramRunnable)
    {
      h = paramRunnable;
      return this;
    }
    
    public final void k(File paramFile)
    {
      f = paramFile;
    }
    
    public static final class a
    {
      public static final void g(List paramList, File paramFile)
      {
        Intrinsics.checkNotNullParameter(paramList, "$slaves");
        Intrinsics.checkNotNullParameter(paramFile, "file");
        paramFile = b.m.a(paramFile);
        if (paramFile != null)
        {
          Iterator localIterator = paramList.iterator();
          while (localIterator.hasNext())
          {
            paramList = (f.b)localIterator.next();
            Object localObject = new StringBuilder();
            ((StringBuilder)localObject).append(paramList.g());
            ((StringBuilder)localObject).append('_');
            ((StringBuilder)localObject).append(paramList.h());
            ((StringBuilder)localObject).append("_rule");
            localObject = ((StringBuilder)localObject).toString();
            f.b.i.e(paramList.e(), (String)localObject, new h(paramList, paramFile));
          }
        }
      }
      
      public static final void h(f.b paramb, b paramb1, File paramFile)
      {
        Intrinsics.checkNotNullParameter(paramb, "$slave");
        Intrinsics.checkNotNullParameter(paramFile, "file");
        paramb.i(paramb1);
        paramb.k(paramFile);
        paramb = f.b.a(paramb);
        if (paramb != null) {
          paramb.run();
        }
      }
      
      public final f.b c(JSONObject paramJSONObject)
      {
        Object localObject = null;
        if (paramJSONObject == null) {
          paramJSONObject = (JSONObject)localObject;
        }
        try
        {
          String str1 = paramJSONObject.getString("use_case");
          String str2 = paramJSONObject.getString("asset_uri");
          String str3 = paramJSONObject.optString("rules_uri", null);
          int i = paramJSONObject.getInt("version_id");
          float[] arrayOfFloat = f.d(f.a, paramJSONObject.getJSONArray("thresholds"));
          paramJSONObject = new H1/f$b;
          Intrinsics.checkNotNullExpressionValue(str1, "useCase");
          Intrinsics.checkNotNullExpressionValue(str2, "assetUri");
          paramJSONObject.<init>(str1, str2, str3, i, arrayOfFloat);
          return paramJSONObject;
        }
        catch (Exception paramJSONObject)
        {
          for (;;)
          {
            paramJSONObject = (JSONObject)localObject;
          }
        }
      }
      
      public final void d(String paramString, int paramInt)
      {
        Object localObject1 = j.a();
        if (localObject1 == null) {
          return;
        }
        localObject1 = ((File)localObject1).listFiles();
        if ((localObject1 != null) && (localObject1.length != 0))
        {
          Object localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append('_');
          ((StringBuilder)localObject2).append(paramInt);
          localObject2 = ((StringBuilder)localObject2).toString();
          int i = localObject1.length;
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject3 = localObject1[paramInt];
            int j = paramInt + 1;
            String str = ((File)localObject3).getName();
            Intrinsics.checkNotNullExpressionValue(str, "name");
            paramInt = j;
            if (i.s(str, paramString, false, 2, null))
            {
              paramInt = j;
              if (!i.s(str, (String)localObject2, false, 2, null))
              {
                ((File)localObject3).delete();
                paramInt = j;
              }
            }
          }
        }
      }
      
      public final void e(String paramString1, String paramString2, k.a parama)
      {
        paramString2 = new File(j.a(), paramString2);
        if ((paramString1 != null) && (!paramString2.exists()))
        {
          new k(paramString1, paramString2, parama).execute(new String[0]);
          return;
        }
        parama.a(paramString2);
      }
      
      public final void f(f.b paramb, List paramList)
      {
        Intrinsics.checkNotNullParameter(paramb, "master");
        Intrinsics.checkNotNullParameter(paramList, "slaves");
        d(paramb.g(), paramb.h());
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramb.g());
        ((StringBuilder)localObject).append('_');
        ((StringBuilder)localObject).append(paramb.h());
        localObject = ((StringBuilder)localObject).toString();
        e(paramb.b(), (String)localObject, new g(paramList));
      }
    }
  }
}

/* Location:
 * Qualified Name:     H1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */