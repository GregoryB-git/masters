package E1;

import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class h$b
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

/* Location:
 * Qualified Name:     E1.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */