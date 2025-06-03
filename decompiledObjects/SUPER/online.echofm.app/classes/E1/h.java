package E1;

import T1.a;
import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static final b s = new b(null);
  public static final AtomicBoolean t = new AtomicBoolean(false);
  public static h u;
  public static final AtomicBoolean v = new AtomicBoolean(false);
  public static final Map w = new ConcurrentHashMap();
  public static final Map x = new ConcurrentHashMap();
  public final Context a;
  public final Object b;
  public final Class c;
  public final Class d;
  public final Class e;
  public final Class f;
  public final Class g;
  public final Class h;
  public final Class i;
  public final Method j;
  public final Method k;
  public final Method l;
  public final Method m;
  public final Method n;
  public final Method o;
  public final Method p;
  public final l q;
  public final Set r;
  
  public h(Context paramContext, Object paramObject, Class paramClass1, Class paramClass2, Class paramClass3, Class paramClass4, Class paramClass5, Class paramClass6, Class paramClass7, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4, Method paramMethod5, Method paramMethod6, Method paramMethod7, l paraml)
  {
    a = paramContext;
    b = paramObject;
    c = paramClass1;
    d = paramClass2;
    e = paramClass3;
    f = paramClass4;
    g = paramClass5;
    h = paramClass6;
    i = paramClass7;
    j = paramMethod1;
    k = paramMethod2;
    l = paramMethod3;
    m = paramMethod4;
    n = paramMethod5;
    o = paramMethod6;
    p = paramMethod7;
    q = paraml;
    r = new CopyOnWriteArraySet();
  }
  
  public static final void q(h paramh, Runnable paramRunnable)
  {
    if (a.d(h.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramh, "this$0");
      Intrinsics.checkNotNullParameter(paramRunnable, "$queryPurchaseHistoryRunnable");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(r);
      paramh.s("inapp", localArrayList, paramRunnable);
      return;
    }
    finally
    {
      a.b(paramh, h.class);
    }
  }
  
  public final void o(String paramString, Runnable paramRunnable)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "skuType");
      Intrinsics.checkNotNullParameter(paramRunnable, "querySkuRunnable");
      localObject1 = m.a;
      localObject1 = m.e(c, j, b, new Object[] { "inapp" });
      localObject1 = m.e(d, k, localObject1, new Object[0]);
      if ((localObject1 instanceof List)) {
        localObject1 = (List)localObject1;
      }
    }
    finally
    {
      break label249;
    }
    Object localObject1 = null;
    if (localObject1 == null) {
      return;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        localObject1 = m.a;
        localObject1 = m.e(e, l, localObject2, new Object[0]);
        if ((localObject1 instanceof String)) {
          localObject1 = (String)localObject1;
        } else {
          localObject1 = null;
        }
        if (localObject1 != null)
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>((String)localObject1);
          if (((JSONObject)localObject2).has("productId"))
          {
            String str = ((JSONObject)localObject2).getString("productId");
            localArrayList.add(str);
            localObject1 = w;
            Intrinsics.checkNotNullExpressionValue(str, "skuID");
            ((Map)localObject1).put(str, localObject2);
          }
        }
      }
      s(paramString, localArrayList, paramRunnable);
      return;
    }
    catch (JSONException paramString)
    {
      label249:
      for (;;) {}
    }
    a.b(paramString, this);
  }
  
  public final void p(String paramString, Runnable paramRunnable)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "skuType");
      Intrinsics.checkNotNullParameter(paramRunnable, "queryPurchaseHistoryRunnable");
      g localg = new E1/g;
      localg.<init>(this, paramRunnable);
      r(paramString, localg);
      return;
    }
    finally
    {
      a.b(paramString, this);
    }
  }
  
  public final void r(String paramString, Runnable paramRunnable)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      ClassLoader localClassLoader = i.getClassLoader();
      Object localObject = i;
      c localc = new E1/h$c;
      localc.<init>(this, paramRunnable);
      localObject = Proxy.newProxyInstance(localClassLoader, new Class[] { localObject }, localc);
      paramRunnable = m.a;
      m.e(c, p, b, new Object[] { paramString, localObject });
      return;
    }
    finally
    {
      a.b(paramString, this);
    }
  }
  
  public final void s(String paramString, List paramList, Runnable paramRunnable)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      ClassLoader localClassLoader = h.getClassLoader();
      Class localClass = h;
      e locale = new E1/h$e;
      locale.<init>(this, paramRunnable);
      paramRunnable = Proxy.newProxyInstance(localClassLoader, new Class[] { localClass }, locale);
      paramString = q.d(paramString, paramList);
      paramList = m.a;
      m.e(c, o, b, new Object[] { paramString, paramRunnable });
      return;
    }
    finally
    {
      a.b(paramString, this);
    }
  }
  
  public final void t()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Object localObject = m.a("com.android.billingclient.api.BillingClientStateListener");
      if (localObject == null) {
        return;
      }
      Method localMethod = m.d(c, "startConnection", new Class[] { localObject });
      if (localMethod == null) {
        return;
      }
      ClassLoader localClassLoader = ((Class)localObject).getClassLoader();
      a locala = new E1/h$a;
      locala.<init>();
      localObject = Proxy.newProxyInstance(localClassLoader, new Class[] { localObject }, locala);
      m.e(c, localMethod, b, new Object[] { localObject });
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
  
  public static final class a
    implements InvocationHandler
  {
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (a.d(this)) {
        return null;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramObject, "proxy");
        Intrinsics.checkNotNullParameter(paramMethod, "m");
        if (Intrinsics.a(paramMethod.getName(), "onBillingSetupFinished")) {
          h.s.f().set(true);
        }
      }
      finally
      {
        break label85;
      }
      paramObject = paramMethod.getName();
      Intrinsics.checkNotNullExpressionValue(paramObject, "m.name");
      if (i.k((String)paramObject, "onBillingServiceDisconnected", false, 2, null)) {
        h.s.f().set(false);
      }
      return null;
      label85:
      a.b((Throwable)paramObject, this);
      return null;
    }
  }
  
  public static final class b
  {
    public final Object a(Context paramContext, Class paramClass)
    {
      Class localClass1 = m.a("com.android.billingclient.api.BillingClient$Builder");
      Class localClass2 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (localClass1 != null) {
        if (localClass2 == null)
        {
          localObject2 = localObject1;
        }
        else
        {
          Method localMethod1 = m.d(paramClass, "newBuilder", new Class[] { Context.class });
          Method localMethod2 = m.d(localClass1, "enablePendingPurchases", new Class[0]);
          Method localMethod3 = m.d(localClass1, "setListener", new Class[] { localClass2 });
          Method localMethod4 = m.d(localClass1, "build", new Class[0]);
          localObject2 = localObject1;
          if (localMethod1 != null)
          {
            localObject2 = localObject1;
            if (localMethod2 != null)
            {
              localObject2 = localObject1;
              if (localMethod3 != null) {
                if (localMethod4 == null)
                {
                  localObject2 = localObject1;
                }
                else
                {
                  paramClass = m.e(paramClass, localMethod1, null, new Object[] { paramContext });
                  if (paramClass == null) {
                    return null;
                  }
                  localObject2 = localClass2.getClassLoader();
                  paramContext = new h.d();
                  paramContext = m.e(localClass1, localMethod3, paramClass, new Object[] { Proxy.newProxyInstance((ClassLoader)localObject2, new Class[] { localClass2 }, paramContext) });
                  if (paramContext == null) {
                    return null;
                  }
                  paramContext = m.e(localClass1, localMethod2, paramContext, new Object[0]);
                  if (paramContext == null) {
                    localObject2 = localObject1;
                  } else {
                    localObject2 = m.e(localClass1, localMethod4, paramContext, new Object[0]);
                  }
                }
              }
            }
          }
        }
      }
      return localObject2;
    }
    
    public final void b(Context paramContext)
    {
      l locall = l.g.b();
      if (locall == null) {
        return;
      }
      Class localClass1 = m.a("com.android.billingclient.api.BillingClient");
      Class localClass2 = m.a("com.android.billingclient.api.Purchase");
      Class localClass3 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
      Class localClass4 = m.a("com.android.billingclient.api.SkuDetails");
      Class localClass5 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
      Class localClass6 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
      Class localClass7 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
      if ((localClass1 == null) || (localClass3 == null) || (localClass2 == null) || (localClass4 == null) || (localClass6 == null) || (localClass5 == null) || (localClass7 != null))
      {
        Method localMethod1 = m.d(localClass1, "queryPurchases", new Class[] { String.class });
        Method localMethod2 = m.d(localClass3, "getPurchasesList", new Class[0]);
        Method localMethod3 = m.d(localClass2, "getOriginalJson", new Class[0]);
        Method localMethod4 = m.d(localClass4, "getOriginalJson", new Class[0]);
        Method localMethod5 = m.d(localClass5, "getOriginalJson", new Class[0]);
        Method localMethod6 = m.d(localClass1, "querySkuDetailsAsync", new Class[] { locall.e(), localClass6 });
        Method localMethod7 = m.d(localClass1, "queryPurchaseHistoryAsync", new Class[] { String.class, localClass7 });
        if ((localMethod1 == null) || (localMethod2 == null) || (localMethod3 == null) || (localMethod4 == null) || (localMethod5 == null) || (localMethod6 == null) || (localMethod7 != null))
        {
          Object localObject = a(paramContext, localClass1);
          if (localObject == null) {
            return;
          }
          h.m(new h(paramContext, localObject, localClass1, localClass3, localClass2, localClass4, localClass5, localClass6, localClass7, localMethod1, localMethod2, localMethod3, localMethod4, localMethod5, localMethod6, localMethod7, locall, null));
          paramContext = h.g();
          if (paramContext != null)
          {
            h.n(paramContext);
            return;
          }
          throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
        }
      }
    }
    
    public final h c(Context paramContext)
    {
      label49:
      try
      {
        Intrinsics.checkNotNullParameter(paramContext, "context");
        if (h.f().get())
        {
          paramContext = h.g();
          return paramContext;
        }
      }
      finally
      {
        break label49;
        b(paramContext);
        h.f().set(true);
        paramContext = h.g();
        return paramContext;
      }
    }
    
    public final Map d()
    {
      return h.h();
    }
    
    public final Map e()
    {
      return h.k();
    }
    
    public final AtomicBoolean f()
    {
      return h.l();
    }
  }
  
  public final class c
    implements InvocationHandler
  {
    public Runnable a;
    
    public c(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    /* Error */
    public final void a(List paramList)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
      //   4: ifeq +4 -> 8
      //   7: return
      //   8: aload_1
      //   9: invokeinterface 48 1 0
      //   14: astore_2
      //   15: aload_2
      //   16: invokeinterface 54 1 0
      //   21: ifeq +150 -> 171
      //   24: aload_2
      //   25: invokeinterface 58 1 0
      //   30: astore_3
      //   31: getstatic 63	E1/m:a	LE1/m;
      //   34: astore_1
      //   35: aload_0
      //   36: getfield 27	E1/h$c:b	LE1/h;
      //   39: invokestatic 67	E1/h:i	(LE1/h;)Ljava/lang/Class;
      //   42: aload_0
      //   43: getfield 27	E1/h$c:b	LE1/h;
      //   46: invokestatic 70	E1/h:c	(LE1/h;)Ljava/lang/reflect/Method;
      //   49: aload_3
      //   50: iconst_0
      //   51: anewarray 4	java/lang/Object
      //   54: invokestatic 74	E1/m:e	(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   57: astore_1
      //   58: aload_1
      //   59: instanceof 76
      //   62: ifeq +15 -> 77
      //   65: aload_1
      //   66: checkcast 76	java/lang/String
      //   69: astore_1
      //   70: goto +9 -> 79
      //   73: astore_1
      //   74: goto +107 -> 181
      //   77: aconst_null
      //   78: astore_1
      //   79: aload_1
      //   80: ifnonnull +6 -> 86
      //   83: goto -68 -> 15
      //   86: new 78	org/json/JSONObject
      //   89: astore_3
      //   90: aload_3
      //   91: aload_1
      //   92: invokespecial 81	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   95: aload_3
      //   96: ldc 83
      //   98: aload_0
      //   99: getfield 27	E1/h$c:b	LE1/h;
      //   102: invokestatic 86	E1/h:b	(LE1/h;)Landroid/content/Context;
      //   105: invokevirtual 92	android/content/Context:getPackageName	()Ljava/lang/String;
      //   108: invokevirtual 96	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   111: pop
      //   112: aload_3
      //   113: ldc 98
      //   115: invokevirtual 102	org/json/JSONObject:has	(Ljava/lang/String;)Z
      //   118: ifeq -103 -> 15
      //   121: aload_3
      //   122: ldc 98
      //   124: invokevirtual 106	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
      //   127: astore 4
      //   129: aload_0
      //   130: getfield 27	E1/h$c:b	LE1/h;
      //   133: invokestatic 109	E1/h:e	(LE1/h;)Ljava/util/Set;
      //   136: aload 4
      //   138: invokeinterface 114 2 0
      //   143: pop
      //   144: getstatic 118	E1/h:s	LE1/h$b;
      //   147: invokevirtual 123	E1/h$b:d	()Ljava/util/Map;
      //   150: astore_1
      //   151: aload 4
      //   153: ldc 125
      //   155: invokestatic 128	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   158: aload_1
      //   159: aload 4
      //   161: aload_3
      //   162: invokeinterface 133 3 0
      //   167: pop
      //   168: goto -153 -> 15
      //   171: aload_0
      //   172: getfield 32	E1/h$c:a	Ljava/lang/Runnable;
      //   175: invokeinterface 138 1 0
      //   180: return
      //   181: aload_1
      //   182: aload_0
      //   183: invokestatic 141	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
      //   186: return
      //   187: astore_1
      //   188: goto -173 -> 15
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	191	0	this	c
      //   0	191	1	paramList	List
      //   14	11	2	localIterator	Iterator
      //   30	132	3	localObject	Object
      //   127	33	4	str	String
      // Exception table:
      //   from	to	target	type
      //   8	15	73	finally
      //   15	31	73	finally
      //   31	70	73	finally
      //   86	168	73	finally
      //   171	180	73	finally
      //   31	70	187	java/lang/Exception
      //   86	168	187	java/lang/Exception
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (a.d(this)) {
        return null;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramObject, "proxy");
        Intrinsics.checkNotNullParameter(paramMethod, "method");
        if (Intrinsics.a(paramMethod.getName(), "onPurchaseHistoryResponse"))
        {
          if (paramArrayOfObject == null) {
            paramObject = null;
          } else {
            paramObject = paramArrayOfObject[1];
          }
          if ((paramObject != null) && ((paramObject instanceof List))) {
            a((List)paramObject);
          }
        }
      }
      finally
      {
        break label74;
      }
      return null;
      label74:
      a.b((Throwable)paramObject, this);
      return null;
    }
  }
  
  public static final class d
    implements InvocationHandler
  {
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (a.d(this)) {
        return null;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramObject, "proxy");
        Intrinsics.checkNotNullParameter(paramMethod, "m");
        return null;
      }
      finally
      {
        a.b((Throwable)paramObject, this);
      }
      return null;
    }
  }
  
  public final class e
    implements InvocationHandler
  {
    public Runnable a;
    
    public e(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    /* Error */
    public final void a(List paramList)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
      //   4: ifeq +4 -> 8
      //   7: return
      //   8: aload_1
      //   9: ldc 44
      //   11: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   14: aload_1
      //   15: invokeinterface 50 1 0
      //   20: astore_2
      //   21: aload_2
      //   22: invokeinterface 56 1 0
      //   27: ifeq +117 -> 144
      //   30: aload_2
      //   31: invokeinterface 60 1 0
      //   36: astore_3
      //   37: getstatic 65	E1/m:a	LE1/m;
      //   40: astore_1
      //   41: aload_0
      //   42: getfield 27	E1/h$e:b	LE1/h;
      //   45: invokestatic 69	E1/h:j	(LE1/h;)Ljava/lang/Class;
      //   48: aload_0
      //   49: getfield 27	E1/h$e:b	LE1/h;
      //   52: invokestatic 72	E1/h:d	(LE1/h;)Ljava/lang/reflect/Method;
      //   55: aload_3
      //   56: iconst_0
      //   57: anewarray 4	java/lang/Object
      //   60: invokestatic 75	E1/m:e	(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   63: astore_1
      //   64: aload_1
      //   65: instanceof 77
      //   68: ifeq +15 -> 83
      //   71: aload_1
      //   72: checkcast 77	java/lang/String
      //   75: astore_1
      //   76: goto +9 -> 85
      //   79: astore_1
      //   80: goto +74 -> 154
      //   83: aconst_null
      //   84: astore_1
      //   85: aload_1
      //   86: ifnonnull +6 -> 92
      //   89: goto -68 -> 21
      //   92: new 79	org/json/JSONObject
      //   95: astore_3
      //   96: aload_3
      //   97: aload_1
      //   98: invokespecial 82	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   101: aload_3
      //   102: ldc 84
      //   104: invokevirtual 88	org/json/JSONObject:has	(Ljava/lang/String;)Z
      //   107: ifeq -86 -> 21
      //   110: aload_3
      //   111: ldc 84
      //   113: invokevirtual 92	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
      //   116: astore_1
      //   117: getstatic 96	E1/h:s	LE1/h$b;
      //   120: invokevirtual 101	E1/h$b:e	()Ljava/util/Map;
      //   123: astore 4
      //   125: aload_1
      //   126: ldc 103
      //   128: invokestatic 106	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   131: aload 4
      //   133: aload_1
      //   134: aload_3
      //   135: invokeinterface 112 3 0
      //   140: pop
      //   141: goto -120 -> 21
      //   144: aload_0
      //   145: getfield 32	E1/h$e:a	Ljava/lang/Runnable;
      //   148: invokeinterface 117 1 0
      //   153: return
      //   154: aload_1
      //   155: aload_0
      //   156: invokestatic 120	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
      //   159: return
      //   160: astore_1
      //   161: goto -140 -> 21
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	164	0	this	e
      //   0	164	1	paramList	List
      //   20	11	2	localIterator	Iterator
      //   36	99	3	localObject	Object
      //   123	9	4	localMap	Map
      // Exception table:
      //   from	to	target	type
      //   8	21	79	finally
      //   21	37	79	finally
      //   37	76	79	finally
      //   92	141	79	finally
      //   144	153	79	finally
      //   37	76	160	java/lang/Exception
      //   92	141	160	java/lang/Exception
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (a.d(this)) {
        return null;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramObject, "proxy");
        Intrinsics.checkNotNullParameter(paramMethod, "m");
        if (Intrinsics.a(paramMethod.getName(), "onSkuDetailsResponse"))
        {
          if (paramArrayOfObject == null) {
            paramObject = null;
          } else {
            paramObject = paramArrayOfObject[1];
          }
          if ((paramObject != null) && ((paramObject instanceof List))) {
            a((List)paramObject);
          }
        }
      }
      finally
      {
        break label74;
      }
      return null;
      label74:
      a.b((Throwable)paramObject, this);
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     E1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */