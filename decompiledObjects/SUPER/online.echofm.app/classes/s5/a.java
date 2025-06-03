package s5;

import A5.a.b;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.p;
import y1.p.a;

public final class a
  implements A5.a, k.c
{
  public k a;
  public p b;
  public String c;
  public final String d = "FacebookAppEvents";
  
  public final Bundle a(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Object localObject1 = new Bundle();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      paramMap = ((Map.Entry)localObject2).getValue();
      localObject2 = (String)((Map.Entry)localObject2).getKey();
      if ((paramMap instanceof String))
      {
        ((BaseBundle)localObject1).putString((String)localObject2, (String)paramMap);
      }
      else if ((paramMap instanceof Integer))
      {
        ((BaseBundle)localObject1).putInt((String)localObject2, ((Integer)paramMap).intValue());
      }
      else if ((paramMap instanceof Long))
      {
        ((BaseBundle)localObject1).putLong((String)localObject2, ((Long)paramMap).longValue());
      }
      else if ((paramMap instanceof Double))
      {
        ((BaseBundle)localObject1).putDouble((String)localObject2, ((Double)paramMap).doubleValue());
      }
      else if ((paramMap instanceof Boolean))
      {
        ((BaseBundle)localObject1).putBoolean((String)localObject2, ((Boolean)paramMap).booleanValue());
      }
      else if ((paramMap instanceof Map))
      {
        paramMap = a((Map)paramMap);
        Intrinsics.c(paramMap, "null cannot be cast to non-null type android.os.Bundle");
        ((Bundle)localObject1).putBundle((String)localObject2, paramMap);
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unsupported value type: ");
        ((StringBuilder)localObject1).append(f6.a.b(paramMap.getClass()));
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
      }
    }
    return (Bundle)localObject1;
  }
  
  public final void b(j paramj, k.d paramd)
  {
    p.b.b();
    paramd.a(null);
  }
  
  public final void c(j paramj, k.d paramd)
  {
    p.b.c();
    paramd.a(null);
  }
  
  public final void d(j paramj, k.d paramd)
  {
    p localp = b;
    paramj = localp;
    if (localp == null)
    {
      Intrinsics.n("appEventsLogger");
      paramj = null;
    }
    paramj.a();
    paramd.a(null);
  }
  
  public final void e(j paramj, k.d paramd)
  {
    String str = c;
    paramj = str;
    if (str == null)
    {
      Intrinsics.n("anonymousId");
      paramj = null;
    }
    paramd.a(paramj);
  }
  
  public final void f(j paramj, k.d paramd)
  {
    p localp = b;
    paramj = localp;
    if (localp == null)
    {
      Intrinsics.n("appEventsLogger");
      paramj = null;
    }
    paramd.a(paramj.b());
  }
  
  public final void g(j paramj, k.d paramd)
  {
    Object localObject1 = paramj.a("name");
    if ((localObject1 instanceof String)) {
      localObject1 = (String)localObject1;
    } else {
      localObject1 = null;
    }
    Object localObject2 = paramj.a("parameters");
    if ((localObject2 instanceof Map)) {
      localObject2 = (Map)localObject2;
    } else {
      localObject2 = null;
    }
    paramj = paramj.a("_valueToSum");
    if ((paramj instanceof Double)) {
      paramj = (Double)paramj;
    } else {
      paramj = null;
    }
    Object localObject3;
    if ((paramj != null) && (localObject2 != null))
    {
      Bundle localBundle = a((Map)localObject2);
      localObject3 = b;
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        Intrinsics.n("appEventsLogger");
        localObject2 = null;
      }
      ((p)localObject2).e((String)localObject1, paramj.doubleValue(), localBundle);
    }
    else if (paramj != null)
    {
      localObject3 = b;
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        Intrinsics.n("appEventsLogger");
        localObject2 = null;
      }
      ((p)localObject2).d((String)localObject1, paramj.doubleValue());
    }
    else if (localObject2 != null)
    {
      localObject3 = a((Map)localObject2);
      localObject2 = b;
      paramj = (j)localObject2;
      if (localObject2 == null)
      {
        Intrinsics.n("appEventsLogger");
        paramj = null;
      }
      paramj.f((String)localObject1, (Bundle)localObject3);
    }
    else
    {
      localObject2 = b;
      paramj = (j)localObject2;
      if (localObject2 == null)
      {
        Intrinsics.n("appEventsLogger");
        paramj = null;
      }
      paramj.c((String)localObject1);
    }
    paramd.a(null);
  }
  
  public final void h(j paramj, k.d paramd)
  {
    Object localObject1 = paramj.a("amount");
    if ((localObject1 instanceof Double)) {
      localObject1 = (Double)localObject1;
    } else {
      localObject1 = null;
    }
    if (localObject1 != null) {
      localObject1 = new BigDecimal(String.valueOf(((Double)localObject1).doubleValue()));
    } else {
      localObject1 = null;
    }
    Object localObject2 = paramj.a("currency");
    if ((localObject2 instanceof String)) {
      localObject2 = (String)localObject2;
    } else {
      localObject2 = null;
    }
    Currency localCurrency = Currency.getInstance((String)localObject2);
    paramj = paramj.a("parameters");
    if ((paramj instanceof Map)) {
      paramj = (Map)paramj;
    } else {
      paramj = null;
    }
    localObject2 = a(paramj);
    paramj = (j)localObject2;
    if (localObject2 == null) {
      paramj = new Bundle();
    }
    p localp = b;
    localObject2 = localp;
    if (localp == null)
    {
      Intrinsics.n("appEventsLogger");
      localObject2 = null;
    }
    ((p)localObject2).g((BigDecimal)localObject1, localCurrency, paramj);
    paramd.a(null);
  }
  
  public final void i(j paramj, k.d paramd)
  {
    Object localObject = paramj.a("action");
    if ((localObject instanceof String)) {
      localObject = (String)localObject;
    } else {
      localObject = null;
    }
    paramj = paramj.a("payload");
    if ((paramj instanceof Map)) {
      paramj = (Map)paramj;
    } else {
      paramj = null;
    }
    Bundle localBundle = a(paramj);
    Intrinsics.b(localBundle);
    if (localObject != null)
    {
      p localp = b;
      paramj = localp;
      if (localp == null)
      {
        Intrinsics.n("appEventsLogger");
        paramj = null;
      }
      paramj.i(localBundle, (String)localObject);
    }
    else
    {
      localObject = b;
      paramj = (j)localObject;
      if (localObject == null)
      {
        Intrinsics.n("appEventsLogger");
        paramj = null;
      }
      paramj.h(localBundle);
    }
    paramd.a(null);
  }
  
  public final void j(j paramj, k.d paramd)
  {
    paramd.a(null);
  }
  
  public final void k(j paramj, k.d paramd)
  {
    paramj = b;
    Intrinsics.c(paramj, "null cannot be cast to non-null type kotlin.Boolean");
    B.V(((Boolean)paramj).booleanValue());
    paramd.a(null);
  }
  
  public final void l(j paramj, k.d paramd)
  {
    Object localObject1 = paramj.a("options");
    if ((localObject1 instanceof ArrayList)) {
      localObject1 = (ArrayList)localObject1;
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new ArrayList();
    }
    localObject1 = paramj.a("country");
    if ((localObject1 instanceof Integer)) {
      localObject1 = (Integer)localObject1;
    } else {
      localObject1 = null;
    }
    int i;
    if (localObject1 != null) {
      i = ((Integer)localObject1).intValue();
    } else {
      i = 0;
    }
    paramj = paramj.a("state");
    if ((paramj instanceof Integer)) {
      paramj = (Integer)paramj;
    } else {
      paramj = null;
    }
    int j;
    if (paramj != null) {
      j = paramj.intValue();
    } else {
      j = 0;
    }
    B.W((String[])((Collection)localObject2).toArray(new String[0]), i, j);
    paramd.a(null);
  }
  
  public final void m(j paramj, k.d paramd)
  {
    paramj = paramj.a("parameters");
    if ((paramj instanceof Map)) {
      paramj = (Map)paramj;
    } else {
      paramj = null;
    }
    Object localObject = a(paramj);
    p.a locala = p.b;
    if (localObject != null) {
      paramj = ((BaseBundle)localObject).getString("email");
    } else {
      paramj = null;
    }
    String str1;
    if (localObject != null) {
      str1 = ((BaseBundle)localObject).getString("firstName");
    } else {
      str1 = null;
    }
    String str2;
    if (localObject != null) {
      str2 = ((BaseBundle)localObject).getString("lastName");
    } else {
      str2 = null;
    }
    String str3;
    if (localObject != null) {
      str3 = ((BaseBundle)localObject).getString("phone");
    } else {
      str3 = null;
    }
    String str4;
    if (localObject != null) {
      str4 = ((BaseBundle)localObject).getString("dateOfBirth");
    } else {
      str4 = null;
    }
    String str5;
    if (localObject != null) {
      str5 = ((BaseBundle)localObject).getString("gender");
    } else {
      str5 = null;
    }
    String str6;
    if (localObject != null) {
      str6 = ((BaseBundle)localObject).getString("city");
    } else {
      str6 = null;
    }
    String str7;
    if (localObject != null) {
      str7 = ((BaseBundle)localObject).getString("state");
    } else {
      str7 = null;
    }
    String str8;
    if (localObject != null) {
      str8 = ((BaseBundle)localObject).getString("zip");
    } else {
      str8 = null;
    }
    if (localObject != null) {
      localObject = ((BaseBundle)localObject).getString("country");
    } else {
      localObject = null;
    }
    locala.j(paramj, str1, str2, str3, str4, str5, str6, str7, str8, (String)localObject);
    paramd.a(null);
  }
  
  public final void n(j paramj, k.d paramd)
  {
    paramj = b;
    Intrinsics.c(paramj, "null cannot be cast to non-null type kotlin.String");
    paramj = (String)paramj;
    p.b.k(paramj);
    paramd.a(null);
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "flutterPluginBinding");
    Object localObject = new k(paramb.b(), "flutter.oddbit.id/facebook_app_events");
    a = ((k)localObject);
    ((k)localObject).e(this);
    localObject = p.b;
    Context localContext = paramb.a();
    Intrinsics.checkNotNullExpressionValue(localContext, "getApplicationContext(...)");
    b = ((p.a)localObject).h(localContext);
    paramb = paramb.a();
    Intrinsics.checkNotNullExpressionValue(paramb, "getApplicationContext(...)");
    c = ((p.a)localObject).d(paramb);
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "binding");
    k localk = a;
    paramb = localk;
    if (localk == null)
    {
      Intrinsics.n("channel");
      paramb = null;
    }
    paramb.e(null);
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramj, "call");
    Intrinsics.checkNotNullParameter(paramd, "result");
    String str = a;
    if (str != null) {
      switch (str.hashCode())
      {
      default: 
        break;
      case 2126113028: 
        if (str.equals("setAdvertiserTracking")) {
          j(paramj, paramd);
        }
        break;
      case 1989757366: 
        if (str.equals("logEvent")) {
          g(paramj, paramd);
        }
        break;
      case 1817723455: 
        if (str.equals("setDataProcessingOptions")) {
          l(paramj, paramd);
        }
        break;
      case 1722355863: 
        if (str.equals("setUserData")) {
          m(paramj, paramd);
        }
        break;
      case 1413464691: 
        if (str.equals("logPushNotificationOpen")) {
          i(paramj, paramd);
        }
        break;
      case 792787386: 
        if (str.equals("setAutoLogAppEventsEnabled")) {
          k(paramj, paramd);
        }
        break;
      case 645367080: 
        if (str.equals("setUserID")) {
          n(paramj, paramd);
        }
        break;
      case 97532676: 
        if (str.equals("flush")) {
          d(paramj, paramd);
        }
        break;
      case -375431886: 
        if (str.equals("getAnonymousId")) {
          e(paramj, paramd);
        }
        break;
      case -811628443: 
        if (str.equals("logPurchase")) {
          h(paramj, paramd);
        }
        break;
      case -1005195390: 
        if (str.equals("clearUserData")) {
          b(paramj, paramd);
        }
        break;
      case -1529535789: 
        if (str.equals("clearUserID")) {
          c(paramj, paramd);
        }
        break;
      case -2129152299: 
        if (str.equals("getApplicationId")) {
          f(paramj, paramd);
        }
        break;
      }
    }
    paramd.c();
  }
}

/* Location:
 * Qualified Name:     s5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */