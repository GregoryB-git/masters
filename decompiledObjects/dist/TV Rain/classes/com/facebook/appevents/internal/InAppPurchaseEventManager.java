package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class InAppPurchaseEventManager
{
  private static final String AS_INTERFACE = "asInterface";
  private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
  private static final String DETAILS_LIST = "DETAILS_LIST";
  private static final String GET_PURCHASES = "getPurchases";
  private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";
  private static final String GET_SKU_DETAILS = "getSkuDetails";
  private static final String INAPP = "inapp";
  private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
  private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
  private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
  private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
  private static final String IS_BILLING_SUPPORTED = "isBillingSupported";
  private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
  private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
  private static final int MAX_QUERY_PURCHASE_NUM = 30;
  private static final String PACKAGE_NAME;
  private static final int PURCHASE_EXPIRE_TIME_SEC = 86400;
  private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
  private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
  private static final String RESPONSE_CODE = "RESPONSE_CODE";
  private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
  private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
  private static final String SUBSCRIPTION = "subs";
  private static final String TAG = "com.facebook.appevents.internal.InAppPurchaseEventManager";
  private static final HashMap<String, Class<?>> classMap;
  private static final HashMap<String, Method> methodMap = new HashMap();
  private static final SharedPreferences purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
  private static final SharedPreferences skuDetailSharedPrefs;
  
  static
  {
    classMap = new HashMap();
    PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();
    skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
  }
  
  @Nullable
  public static Object asInterface(Context paramContext, IBinder paramIBinder)
  {
    return invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[] { paramIBinder });
  }
  
  public static void clearSkuDetailsCache()
  {
    long l1 = System.currentTimeMillis() / 1000L;
    SharedPreferences localSharedPreferences = skuDetailSharedPrefs;
    long l2 = localSharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
    if (l2 == 0L) {
      localSharedPreferences.edit().putLong("LAST_CLEARED_TIME", l1).apply();
    } else if (l1 - l2 > 604800L) {
      localSharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", l1).apply();
    }
  }
  
  private static ArrayList<String> filterPurchases(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    SharedPreferences.Editor localEditor = purchaseInappSharedPrefs.edit();
    long l1 = System.currentTimeMillis() / 1000L;
    paramArrayList = paramArrayList.iterator();
    for (;;)
    {
      String str1;
      if (paramArrayList.hasNext()) {
        str1 = (String)paramArrayList.next();
      }
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str1);
        String str2 = ((JSONObject)localObject).getString("productId");
        long l2 = ((JSONObject)localObject).getLong("purchaseTime");
        localObject = ((JSONObject)localObject).getString("purchaseToken");
        if ((l1 - l2 / 1000L > 86400L) || (purchaseInappSharedPrefs.getString(str2, "").equals(localObject))) {
          continue;
        }
        localEditor.putString(str2, (String)localObject);
        localArrayList.add(str1);
      }
      catch (JSONException localJSONException) {}
      localEditor.apply();
      return localArrayList;
    }
  }
  
  @Nullable
  private static Class<?> getClass(Context paramContext, String paramString)
  {
    HashMap localHashMap = classMap;
    localObject = (Class)localHashMap.get(paramString);
    if (localObject != null) {
      return (Class<?>)localObject;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass(paramString);
      localObject = paramContext;
      localHashMap.put(paramString, paramContext);
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
    return paramContext;
  }
  
  @Nullable
  private static Method getMethod(Class<?> paramClass, String paramString)
  {
    HashMap localHashMap = methodMap;
    Method localMethod = (Method)localHashMap.get(paramString);
    if (localMethod != null) {
      return localMethod;
    }
    Class[] arrayOfClass = null;
    int i = -1;
    localObject = localMethod;
    try
    {
      switch (paramString.hashCode())
      {
      default: 
        break;
      case -573310373: 
        localObject = localMethod;
        if (paramString.equals("getSkuDetails")) {
          i = 1;
        }
        break;
      case -594356707: 
        localObject = localMethod;
        if (paramString.equals("getPurchaseHistory")) {
          i = 4;
        }
        break;
      case -1123215065: 
        localObject = localMethod;
        if (paramString.equals("asInterface")) {
          i = 0;
        }
        break;
      case -1450694211: 
        localObject = localMethod;
        if (paramString.equals("isBillingSupported")) {
          i = 2;
        }
        break;
      case -1801122596: 
        localObject = localMethod;
        if (paramString.equals("getPurchases")) {
          i = 3;
        }
        break;
      }
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 4)
              {
                localObject = localMethod;
                arrayOfClass = new Class[5];
                localObject = localMethod;
                arrayOfClass[0] = Integer.TYPE;
                arrayOfClass[1] = String.class;
                arrayOfClass[2] = String.class;
                arrayOfClass[3] = String.class;
                arrayOfClass[4] = Bundle.class;
              }
            }
            else
            {
              localObject = localMethod;
              arrayOfClass = new Class[4];
              localObject = localMethod;
              arrayOfClass[0] = Integer.TYPE;
              arrayOfClass[1] = String.class;
              arrayOfClass[2] = String.class;
              arrayOfClass[3] = String.class;
            }
          }
          else
          {
            localObject = localMethod;
            arrayOfClass = new Class[3];
            localObject = localMethod;
            arrayOfClass[0] = Integer.TYPE;
            arrayOfClass[1] = String.class;
            arrayOfClass[2] = String.class;
          }
        }
        else
        {
          localObject = localMethod;
          arrayOfClass = new Class[4];
          localObject = localMethod;
          arrayOfClass[0] = Integer.TYPE;
          arrayOfClass[1] = String.class;
          arrayOfClass[2] = String.class;
          arrayOfClass[3] = Bundle.class;
        }
      }
      else
      {
        localObject = localMethod;
        arrayOfClass = new Class[1];
        arrayOfClass[0] = IBinder.class;
      }
      localObject = localMethod;
      paramClass = paramClass.getDeclaredMethod(paramString, arrayOfClass);
      localObject = paramClass;
      localHashMap.put(paramString, paramClass);
    }
    catch (NoSuchMethodException paramClass)
    {
      for (;;)
      {
        paramClass = (Class<?>)localObject;
      }
    }
    return paramClass;
  }
  
  private static ArrayList<String> getPurchaseHistory(Context paramContext, Object paramObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    int j;
    Object localObject1;
    long l;
    Object localObject2;
    if (isBillingSupported(paramContext, paramObject, paramString).booleanValue())
    {
      i = 0;
      j = i;
      localObject1 = null;
      localObject1 = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", paramObject, new Object[] { Integer.valueOf(6), PACKAGE_NAME, paramString, localObject1, new Bundle() });
      if (localObject1 != null)
      {
        l = System.currentTimeMillis() / 1000L;
        localObject1 = (Bundle)localObject1;
        if (((BaseBundle)localObject1).getInt("RESPONSE_CODE") == 0)
        {
          localObject2 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
          if (localObject2 != null) {
            localObject2 = ((ArrayList)localObject2).iterator();
          }
        }
      }
    }
    for (;;)
    {
      int k = j;
      String str;
      if (((Iterator)localObject2).hasNext()) {
        str = (String)((Iterator)localObject2).next();
      }
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        if (l - localJSONObject.getLong("purchaseTime") / 1000L > 1200L)
        {
          k = 1;
        }
        else
        {
          localArrayList.add(str);
          i++;
          continue;
        }
        localObject1 = ((BaseBundle)localObject1).getString("INAPP_CONTINUATION_TOKEN");
        break label230;
        localObject1 = null;
        k = j;
        label230:
        if ((i < 30) && (localObject1 != null))
        {
          j = k;
          if (k == 0) {
            break;
          }
        }
        return localArrayList;
      }
      catch (JSONException localJSONException) {}
    }
  }
  
  public static ArrayList<String> getPurchaseHistoryInapp(Context paramContext, Object paramObject)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramObject == null) {
      return localArrayList;
    }
    Class localClass = getClass(paramContext, "com.android.vending.billing.IInAppBillingService");
    if (localClass == null) {
      return localArrayList;
    }
    if (getMethod(localClass, "getPurchaseHistory") == null) {
      return localArrayList;
    }
    return filterPurchases(getPurchaseHistory(paramContext, paramObject, "inapp"));
  }
  
  private static ArrayList<String> getPurchases(Context paramContext, Object paramObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramObject == null) {
      return localArrayList;
    }
    if (isBillingSupported(paramContext, paramObject, paramString).booleanValue())
    {
      int i = 0;
      Object localObject1 = null;
      Object localObject2;
      label137:
      do
      {
        localObject2 = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchases", paramObject, new Object[] { Integer.valueOf(3), PACKAGE_NAME, paramString, localObject1 });
        if (localObject2 != null)
        {
          localObject2 = (Bundle)localObject2;
          if (((BaseBundle)localObject2).getInt("RESPONSE_CODE") == 0)
          {
            localObject1 = ((Bundle)localObject2).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            if (localObject1 == null) {
              break;
            }
            i += ((ArrayList)localObject1).size();
            localArrayList.addAll((Collection)localObject1);
            localObject2 = ((BaseBundle)localObject2).getString("INAPP_CONTINUATION_TOKEN");
            break label137;
          }
        }
        localObject2 = null;
        if (i >= 30) {
          break;
        }
        localObject1 = localObject2;
      } while (localObject2 != null);
    }
    return localArrayList;
  }
  
  public static ArrayList<String> getPurchasesInapp(Context paramContext, Object paramObject)
  {
    return filterPurchases(getPurchases(paramContext, paramObject, "inapp"));
  }
  
  public static ArrayList<String> getPurchasesSubs(Context paramContext, Object paramObject)
  {
    return filterPurchases(getPurchases(paramContext, paramObject, "subs"));
  }
  
  public static Map<String, String> getSkuDetails(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    Map localMap = readSkuDetailsFromCache(paramArrayList);
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      if (!localMap.containsKey(str)) {
        localArrayList.add(str);
      }
    }
    localMap.putAll(getSkuDetailsFromGoogle(paramContext, localArrayList, paramObject, paramBoolean));
    return localMap;
  }
  
  private static Map<String, String> getSkuDetailsFromGoogle(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if ((paramObject != null) && (!paramArrayList.isEmpty()))
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("ITEM_ID_LIST", paramArrayList);
      int i = 0;
      String str1 = PACKAGE_NAME;
      String str2;
      if (paramBoolean) {
        str2 = "subs";
      } else {
        str2 = "inapp";
      }
      paramContext = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", paramObject, new Object[] { Integer.valueOf(3), str1, str2, localBundle });
      if (paramContext != null)
      {
        paramContext = (Bundle)paramContext;
        if (paramContext.getInt("RESPONSE_CODE") == 0)
        {
          paramContext = paramContext.getStringArrayList("DETAILS_LIST");
          if ((paramContext != null) && (paramArrayList.size() == paramContext.size())) {
            while (i < paramArrayList.size())
            {
              localHashMap.put(paramArrayList.get(i), paramContext.get(i));
              i++;
            }
          }
          writeSkuDetailsToCache(localHashMap);
        }
      }
    }
    return localHashMap;
  }
  
  public static boolean hasFreeTrialPeirod(String paramString)
  {
    bool1 = false;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.optString("freeTrialPeriod");
      bool2 = bool1;
      if (paramString != null)
      {
        boolean bool3 = paramString.isEmpty();
        bool2 = bool1;
        if (!bool3) {
          bool2 = true;
        }
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
    return bool2;
  }
  
  @Nullable
  private static Object invokeMethod(Context paramContext, String paramString1, String paramString2, Object paramObject, Object[] paramArrayOfObject)
  {
    paramString1 = getClass(paramContext, paramString1);
    if (paramString1 == null) {
      return null;
    }
    paramString2 = getMethod(paramString1, paramString2);
    if (paramString2 == null) {
      return null;
    }
    paramContext = (Context)paramObject;
    if (paramObject != null) {
      paramContext = paramString1.cast(paramObject);
    }
    try
    {
      paramContext = paramString2.invoke(paramContext, paramArrayOfObject);
      return paramContext;
    }
    catch (IllegalAccessException|InvocationTargetException paramContext) {}
    return null;
  }
  
  private static Boolean isBillingSupported(Context paramContext, Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return Boolean.FALSE;
    }
    boolean bool1 = false;
    paramContext = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", paramObject, new Object[] { Integer.valueOf(3), PACKAGE_NAME, paramString });
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      bool2 = bool1;
      if (((Integer)paramContext).intValue() == 0) {
        bool2 = true;
      }
    }
    return Boolean.valueOf(bool2);
  }
  
  private static Map<String, String> readSkuDetailsFromCache(ArrayList<String> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    long l = System.currentTimeMillis() / 1000L;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = (String)localIterator.next();
      Object localObject = skuDetailSharedPrefs.getString(paramArrayList, null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split(";", 2);
        if (l - Long.parseLong(localObject[0]) < 43200L) {
          localHashMap.put(paramArrayList, localObject[1]);
        }
      }
    }
    return localHashMap;
  }
  
  private static void writeSkuDetailsToCache(Map<String, String> paramMap)
  {
    long l = System.currentTimeMillis() / 1000L;
    SharedPreferences.Editor localEditor = skuDetailSharedPrefs.edit();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      String str = (String)localEntry.getKey();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(l);
      localStringBuilder.append(";");
      localStringBuilder.append((String)localEntry.getValue());
      localEditor.putString(str, localStringBuilder.toString());
    }
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseEventManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */