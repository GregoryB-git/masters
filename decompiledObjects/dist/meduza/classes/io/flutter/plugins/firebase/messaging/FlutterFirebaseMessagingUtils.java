package io.flutter.plugins.firebase.messaging;

import aa.z;
import aa.z.a;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import r.b;
import r.h;

class FlutterFirebaseMessagingUtils
{
  public static final String EXTRA_REMOTE_MESSAGE = "notification";
  public static final String IS_AUTO_INIT_ENABLED = "isAutoInitEnabled";
  public static final int JOB_ID = 2020;
  private static final String KEY_COLLAPSE_KEY = "collapseKey";
  private static final String KEY_DATA = "data";
  private static final String KEY_FROM = "from";
  private static final String KEY_MESSAGE_ID = "messageId";
  private static final String KEY_MESSAGE_TYPE = "messageType";
  private static final String KEY_SENT_TIME = "sentTime";
  private static final String KEY_TO = "to";
  private static final String KEY_TTL = "ttl";
  public static final String SHARED_PREFERENCES_KEY = "io.flutter.firebase.messaging.callback";
  
  public static FirebaseMessaging getFirebaseMessagingForArguments(Map<String, Object> paramMap)
  {
    return FirebaseMessaging.d();
  }
  
  public static z getRemoteMessageForArguments(Map<String, Object> paramMap)
  {
    paramMap = paramMap.get("message");
    Objects.requireNonNull(paramMap);
    Object localObject1 = (Map)paramMap;
    paramMap = ((Map)localObject1).get("to");
    Objects.requireNonNull(paramMap);
    Object localObject2 = (String)paramMap;
    paramMap = new Bundle();
    Object localObject3 = new b();
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      paramMap.putString("google.to", (String)localObject2);
      localObject2 = (String)((Map)localObject1).get("collapseKey");
      String str1 = (String)((Map)localObject1).get("messageId");
      String str2 = (String)((Map)localObject1).get("messageType");
      Integer localInteger = (Integer)((Map)localObject1).get("ttl");
      localObject1 = (Map)((Map)localObject1).get("data");
      if (localObject2 != null) {
        paramMap.putString("collapse_key", (String)localObject2);
      }
      if (str2 != null) {
        paramMap.putString("message_type", str2);
      }
      if (str1 != null) {
        paramMap.putString("google.message_id", str1);
      }
      if (localInteger != null) {
        paramMap.putString("google.ttl", String.valueOf(localInteger.intValue()));
      }
      if (localObject1 != null)
      {
        ((h)localObject3).clear();
        ((b)localObject3).putAll((Map)localObject1);
      }
      localObject1 = new Bundle();
      localObject2 = ((b)localObject3).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        ((BaseBundle)localObject1).putString((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
      }
      ((Bundle)localObject1).putAll(paramMap);
      paramMap.remove("from");
      return new z((Bundle)localObject1);
    }
    throw new IllegalArgumentException(g.d("Invalid to: ", (String)localObject2));
  }
  
  public static Map<String, Object> getRemoteMessageNotificationForArguments(Map<String, Object> paramMap)
  {
    paramMap = paramMap.get("message");
    Objects.requireNonNull(paramMap);
    paramMap = (Map)paramMap;
    if (paramMap.get("notification") == null) {
      return null;
    }
    return (Map)paramMap.get("notification");
  }
  
  public static boolean isApplicationForeground(Context paramContext)
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
  
  private static Map<String, Object> remoteMessageNotificationToMap(z.a parama)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = a;
    if (localObject1 != null) {
      localHashMap1.put("title", localObject1);
    }
    localObject1 = b;
    if (localObject1 != null) {
      localHashMap1.put("titleLocKey", localObject1);
    }
    localObject1 = c;
    if (localObject1 != null) {
      localHashMap1.put("titleLocArgs", Arrays.asList((Object[])localObject1));
    }
    localObject1 = d;
    if (localObject1 != null) {
      localHashMap1.put("body", localObject1);
    }
    localObject1 = e;
    if (localObject1 != null) {
      localHashMap1.put("bodyLocKey", localObject1);
    }
    localObject1 = f;
    if (localObject1 != null) {
      localHashMap1.put("bodyLocArgs", Arrays.asList((Object[])localObject1));
    }
    localObject1 = m;
    if (localObject1 != null) {
      localHashMap2.put("channelId", localObject1);
    }
    localObject1 = l;
    if (localObject1 != null) {
      localHashMap2.put("clickAction", localObject1);
    }
    localObject1 = k;
    if (localObject1 != null) {
      localHashMap2.put("color", localObject1);
    }
    localObject1 = g;
    if (localObject1 != null) {
      localHashMap2.put("smallIcon", localObject1);
    }
    localObject1 = h;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = Uri.parse((String)localObject1);
    } else {
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      String str = h;
      localObject1 = localObject2;
      if (str != null) {
        localObject1 = Uri.parse(str);
      }
      localHashMap2.put("imageUrl", ((Uri)localObject1).toString());
    }
    localObject1 = n;
    if (localObject1 != null) {
      localHashMap2.put("link", ((Uri)localObject1).toString());
    }
    localObject1 = r;
    if (localObject1 != null) {
      localHashMap2.put("count", localObject1);
    }
    localObject1 = p;
    if (localObject1 != null) {
      localHashMap2.put("priority", localObject1);
    }
    localObject1 = i;
    if (localObject1 != null) {
      localHashMap2.put("sound", localObject1);
    }
    localObject1 = o;
    if (localObject1 != null) {
      localHashMap2.put("ticker", localObject1);
    }
    localObject1 = q;
    if (localObject1 != null) {
      localHashMap2.put("visibility", localObject1);
    }
    parama = j;
    if (parama != null) {
      localHashMap2.put("tag", parama);
    }
    localHashMap1.put("android", localHashMap2);
    return localHashMap1;
  }
  
  public static Map<String, Object> remoteMessageToMap(z paramz)
  {
    HashMap localHashMap = new HashMap();
    Object localObject = new HashMap();
    if (a.getString("collapse_key") != null) {
      localHashMap.put("collapseKey", a.getString("collapse_key"));
    }
    if (a.getString("from") != null) {
      localHashMap.put("from", a.getString("from"));
    }
    if (a.getString("google.to") != null) {
      localHashMap.put("to", a.getString("google.to"));
    }
    if (paramz.E() != null) {
      localHashMap.put("messageId", paramz.E());
    }
    if (a.getString("message_type") != null) {
      localHashMap.put("messageType", a.getString("message_type"));
    }
    if (!((h)paramz.D()).isEmpty())
    {
      Iterator localIterator = ((b)paramz.D()).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        ((HashMap)localObject).put((String)localEntry.getKey(), localEntry.getValue());
      }
    }
    localHashMap.put("data", localObject);
    localObject = a.get("google.ttl");
    int i;
    if ((localObject instanceof Integer)) {
      i = ((Integer)localObject).intValue();
    } else if ((localObject instanceof String)) {
      try
      {
        i = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("Invalid TTL: ");
        localStringBuilder1.append(localObject);
        Log.w("FirebaseMessaging", localStringBuilder1.toString());
      }
    } else {
      i = 0;
    }
    localHashMap.put("ttl", Integer.valueOf(i));
    localObject = a.get("google.sent_time");
    long l;
    if ((localObject instanceof Long)) {
      l = ((Long)localObject).longValue();
    } else if ((localObject instanceof String)) {
      try
      {
        l = Long.parseLong((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Invalid sent time: ");
        localStringBuilder2.append(localObject);
        Log.w("FirebaseMessaging", localStringBuilder2.toString());
      }
    } else {
      l = 0L;
    }
    localHashMap.put("sentTime", Long.valueOf(l));
    if (paramz.F() != null) {
      localHashMap.put("notification", remoteMessageNotificationToMap(paramz.F()));
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */