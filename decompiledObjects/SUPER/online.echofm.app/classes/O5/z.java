package O5;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.T.b;
import com.google.firebase.messaging.T.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public abstract class z
{
  public static FirebaseMessaging a(Map paramMap)
  {
    return FirebaseMessaging.r();
  }
  
  public static T b(Map paramMap)
  {
    paramMap = paramMap.get("message");
    Objects.requireNonNull(paramMap);
    paramMap = (Map)paramMap;
    Object localObject = paramMap.get("to");
    Objects.requireNonNull(localObject);
    localObject = new T.b((String)localObject);
    String str1 = (String)paramMap.get("collapseKey");
    String str2 = (String)paramMap.get("messageId");
    String str3 = (String)paramMap.get("messageType");
    Integer localInteger = (Integer)paramMap.get("ttl");
    paramMap = (Map)paramMap.get("data");
    if (str1 != null) {
      ((T.b)localObject).b(str1);
    }
    if (str3 != null) {
      ((T.b)localObject).e(str3);
    }
    if (str2 != null) {
      ((T.b)localObject).d(str2);
    }
    if (localInteger != null) {
      ((T.b)localObject).f(localInteger.intValue());
    }
    if (paramMap != null) {
      ((T.b)localObject).c(paramMap);
    }
    return ((T.b)localObject).a();
  }
  
  public static Map c(Map paramMap)
  {
    paramMap = paramMap.get("message");
    Objects.requireNonNull(paramMap);
    paramMap = (Map)paramMap;
    if (paramMap.get("notification") == null) {
      return null;
    }
    return (Map)paramMap.get("notification");
  }
  
  public static boolean d(Context paramContext)
  {
    Object localObject = (KeyguardManager)paramContext.getSystemService("keyguard");
    if ((localObject != null) && (((KeyguardManager)localObject).isKeyguardLocked())) {
      return false;
    }
    localObject = (ActivityManager)paramContext.getSystemService("activity");
    if (localObject == null) {
      return false;
    }
    localObject = ((ActivityManager)localObject).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    paramContext = paramContext.getPackageName();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      if ((importance == 100) && (processName.equals(paramContext))) {
        return true;
      }
    }
    return false;
  }
  
  public static Map e(T.c paramc)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    if (paramc.p() != null) {
      localHashMap1.put("title", paramc.p());
    }
    if (paramc.r() != null) {
      localHashMap1.put("titleLocKey", paramc.r());
    }
    if (paramc.q() != null) {
      localHashMap1.put("titleLocArgs", Arrays.asList(paramc.q()));
    }
    if (paramc.a() != null) {
      localHashMap1.put("body", paramc.a());
    }
    if (paramc.c() != null) {
      localHashMap1.put("bodyLocKey", paramc.c());
    }
    if (paramc.b() != null) {
      localHashMap1.put("bodyLocArgs", Arrays.asList(paramc.b()));
    }
    if (paramc.d() != null) {
      localHashMap2.put("channelId", paramc.d());
    }
    if (paramc.e() != null) {
      localHashMap2.put("clickAction", paramc.e());
    }
    if (paramc.f() != null) {
      localHashMap2.put("color", paramc.f());
    }
    if (paramc.g() != null) {
      localHashMap2.put("smallIcon", paramc.g());
    }
    if (paramc.h() != null) {
      localHashMap2.put("imageUrl", paramc.h().toString());
    }
    if (paramc.i() != null) {
      localHashMap2.put("link", paramc.i().toString());
    }
    if (paramc.k() != null) {
      localHashMap2.put("count", paramc.k());
    }
    if (paramc.l() != null) {
      localHashMap2.put("priority", paramc.l());
    }
    if (paramc.m() != null) {
      localHashMap2.put("sound", paramc.m());
    }
    if (paramc.o() != null) {
      localHashMap2.put("ticker", paramc.o());
    }
    if (paramc.s() != null) {
      localHashMap2.put("visibility", paramc.s());
    }
    if (paramc.n() != null) {
      localHashMap2.put("tag", paramc.n());
    }
    localHashMap1.put("android", localHashMap2);
    return localHashMap1;
  }
  
  public static Map f(T paramT)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    if (paramT.a() != null) {
      localHashMap1.put("collapseKey", paramT.a());
    }
    if (paramT.f() != null) {
      localHashMap1.put("from", paramT.f());
    }
    if (paramT.U() != null) {
      localHashMap1.put("to", paramT.U());
    }
    if (paramT.g() != null) {
      localHashMap1.put("messageId", paramT.g());
    }
    if (paramT.k() != null) {
      localHashMap1.put("messageType", paramT.k());
    }
    if (paramT.d().size() > 0)
    {
      Iterator localIterator = paramT.d().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localHashMap2.put((String)localEntry.getKey(), localEntry.getValue());
      }
    }
    localHashMap1.put("data", localHashMap2);
    localHashMap1.put("ttl", Integer.valueOf(paramT.V()));
    localHashMap1.put("sentTime", Long.valueOf(paramT.T()));
    if (paramT.q() != null) {
      localHashMap1.put("notification", e(paramT.q()));
    }
    return localHashMap1;
  }
}

/* Location:
 * Qualified Name:     O5.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */