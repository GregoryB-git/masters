package bolts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLinkNavigation
{
  private static final String KEY_NAME_REFERER_APP_LINK = "referer_app_link";
  private static final String KEY_NAME_REFERER_APP_LINK_APP_NAME = "app_name";
  private static final String KEY_NAME_REFERER_APP_LINK_PACKAGE = "package";
  private static final String KEY_NAME_USER_AGENT = "user_agent";
  private static final String KEY_NAME_VERSION = "version";
  private static final String VERSION = "1.0";
  private static AppLinkResolver defaultResolver;
  private final AppLink appLink;
  private final Bundle appLinkData;
  private final Bundle extras;
  
  public AppLinkNavigation(AppLink paramAppLink, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramAppLink != null)
    {
      Bundle localBundle = paramBundle1;
      if (paramBundle1 == null) {
        localBundle = new Bundle();
      }
      paramBundle1 = paramBundle2;
      if (paramBundle2 == null) {
        paramBundle1 = new Bundle();
      }
      appLink = paramAppLink;
      extras = localBundle;
      appLinkData = paramBundle1;
      return;
    }
    throw new IllegalArgumentException("appLink must not be null.");
  }
  
  private Bundle buildAppLinkDataForNavigation(Context paramContext)
  {
    Bundle localBundle1 = new Bundle();
    Bundle localBundle2 = new Bundle();
    if (paramContext != null)
    {
      Object localObject = paramContext.getPackageName();
      if (localObject != null) {
        localBundle2.putString("package", (String)localObject);
      }
      localObject = paramContext.getApplicationInfo();
      if (localObject != null)
      {
        paramContext = paramContext.getString(labelRes);
        if (paramContext != null) {
          localBundle2.putString("app_name", paramContext);
        }
      }
    }
    localBundle1.putAll(getAppLinkData());
    localBundle1.putString("target_url", getAppLink().getSourceUrl().toString());
    localBundle1.putString("version", "1.0");
    localBundle1.putString("user_agent", "Bolts Android 1.4.0");
    localBundle1.putBundle("referer_app_link", localBundle2);
    localBundle1.putBundle("extras", getExtras());
    return localBundle1;
  }
  
  public static AppLinkResolver getDefaultResolver()
  {
    return defaultResolver;
  }
  
  private JSONObject getJSONForBundle(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, getJSONValue(paramBundle.get(str)));
    }
    return localJSONObject;
  }
  
  private Object getJSONValue(Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle)) {
      return getJSONForBundle((Bundle)paramObject);
    }
    if ((paramObject instanceof CharSequence)) {
      return paramObject.toString();
    }
    JSONArray localJSONArray;
    if ((paramObject instanceof List))
    {
      localJSONArray = new JSONArray();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        localJSONArray.put(getJSONValue(((Iterator)paramObject).next()));
      }
      return localJSONArray;
    }
    boolean bool = paramObject instanceof SparseArray;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    if (bool)
    {
      localJSONArray = new JSONArray();
      paramObject = (SparseArray)paramObject;
      for (i = i5; i < ((SparseArray)paramObject).size(); i++) {
        localJSONArray.put(((SparseArray)paramObject).keyAt(i), getJSONValue(((SparseArray)paramObject).valueAt(i)));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof Character)) {
      return paramObject.toString();
    }
    if ((paramObject instanceof Boolean)) {
      return paramObject;
    }
    if ((paramObject instanceof Number))
    {
      if ((!(paramObject instanceof Double)) && (!(paramObject instanceof Float))) {
        return Long.valueOf(((Number)paramObject).longValue());
      }
      return Double.valueOf(((Number)paramObject).doubleValue());
    }
    if ((paramObject instanceof boolean[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (boolean[])paramObject;
      j = paramObject.length;
      while (i < j)
      {
        localJSONArray.put(getJSONValue(Boolean.valueOf(paramObject[i])));
        i++;
      }
      return localJSONArray;
    }
    if ((paramObject instanceof char[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (char[])paramObject;
      k = paramObject.length;
      for (i = j; i < k; i++) {
        localJSONArray.put(getJSONValue(Character.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof CharSequence[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (CharSequence[])paramObject;
      j = paramObject.length;
      for (i = k; i < j; i++) {
        localJSONArray.put(getJSONValue(paramObject[i]));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof double[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (double[])paramObject;
      j = paramObject.length;
      for (i = m; i < j; i++) {
        localJSONArray.put(getJSONValue(Double.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof float[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (float[])paramObject;
      j = paramObject.length;
      for (i = n; i < j; i++) {
        localJSONArray.put(getJSONValue(Float.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof int[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (int[])paramObject;
      j = paramObject.length;
      for (i = i1; i < j; i++) {
        localJSONArray.put(getJSONValue(Integer.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof long[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (long[])paramObject;
      j = paramObject.length;
      for (i = i2; i < j; i++) {
        localJSONArray.put(getJSONValue(Long.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof short[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (short[])paramObject;
      j = paramObject.length;
      for (i = i3; i < j; i++) {
        localJSONArray.put(getJSONValue(Short.valueOf(paramObject[i])));
      }
      return localJSONArray;
    }
    if ((paramObject instanceof String[]))
    {
      localJSONArray = new JSONArray();
      paramObject = (String[])paramObject;
      j = paramObject.length;
      for (i = i4; i < j; i++) {
        localJSONArray.put(getJSONValue(paramObject[i]));
      }
      return localJSONArray;
    }
    return null;
  }
  
  private static AppLinkResolver getResolver(Context paramContext)
  {
    if (getDefaultResolver() != null) {
      return getDefaultResolver();
    }
    return new WebViewAppLinkResolver(paramContext);
  }
  
  public static NavigationResult navigate(Context paramContext, AppLink paramAppLink)
  {
    return new AppLinkNavigation(paramAppLink, null, null).navigate(paramContext);
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, Uri paramUri)
  {
    return navigateInBackground(paramContext, paramUri, getResolver(paramContext));
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, Uri paramUri, AppLinkResolver paramAppLinkResolver)
  {
    paramAppLinkResolver.getAppLinkFromUrlInBackground(paramUri).onSuccess(new Continuation()
    {
      public AppLinkNavigation.NavigationResult then(Task<AppLink> paramAnonymousTask)
        throws Exception
      {
        return AppLinkNavigation.navigate(val$context, (AppLink)paramAnonymousTask.getResult());
      }
    }, Task.UI_THREAD_EXECUTOR);
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, String paramString)
  {
    return navigateInBackground(paramContext, paramString, getResolver(paramContext));
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, String paramString, AppLinkResolver paramAppLinkResolver)
  {
    return navigateInBackground(paramContext, Uri.parse(paramString), paramAppLinkResolver);
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, URL paramURL)
  {
    return navigateInBackground(paramContext, paramURL, getResolver(paramContext));
  }
  
  public static Task<NavigationResult> navigateInBackground(Context paramContext, URL paramURL, AppLinkResolver paramAppLinkResolver)
  {
    return navigateInBackground(paramContext, Uri.parse(paramURL.toString()), paramAppLinkResolver);
  }
  
  private void sendAppLinkNavigateEventBroadcast(Context paramContext, Intent paramIntent, NavigationResult paramNavigationResult, JSONException paramJSONException)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONException != null) {
      localHashMap.put("error", paramJSONException.getLocalizedMessage());
    }
    if (paramNavigationResult.isSucceeded()) {
      paramJSONException = "1";
    } else {
      paramJSONException = "0";
    }
    localHashMap.put("success", paramJSONException);
    localHashMap.put("type", paramNavigationResult.getCode());
    MeasurementEvent.sendBroadcastEvent(paramContext, "al_nav_out", paramIntent, localHashMap);
  }
  
  public static void setDefaultResolver(AppLinkResolver paramAppLinkResolver)
  {
    defaultResolver = paramAppLinkResolver;
  }
  
  public AppLink getAppLink()
  {
    return appLink;
  }
  
  public Bundle getAppLinkData()
  {
    return appLinkData;
  }
  
  public Bundle getExtras()
  {
    return extras;
  }
  
  public NavigationResult navigate(Context paramContext)
  {
    Object localObject1 = paramContext.getPackageManager();
    Bundle localBundle = buildAppLinkDataForNavigation(paramContext);
    Object localObject2 = getAppLink().getTargets().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      AppLink.Target localTarget = (AppLink.Target)((Iterator)localObject2).next();
      localIntent = new Intent("android.intent.action.VIEW");
      if (localTarget.getUrl() != null) {
        localIntent.setData(localTarget.getUrl());
      } else {
        localIntent.setData(appLink.getSourceUrl());
      }
      localIntent.setPackage(localTarget.getPackageName());
      if (localTarget.getClassName() != null) {
        localIntent.setClassName(localTarget.getPackageName(), localTarget.getClassName());
      }
      localIntent.putExtra("al_applink_data", localBundle);
      if (((PackageManager)localObject1).resolveActivity(localIntent, 65536) != null) {
        break label157;
      }
    }
    Intent localIntent = null;
    label157:
    localObject2 = NavigationResult.FAILED;
    if (localIntent != null)
    {
      localObject2 = NavigationResult.APP;
    }
    else
    {
      localObject1 = getAppLink().getWebUrl();
      if (localObject1 != null) {
        try
        {
          localObject2 = getJSONForBundle(localBundle);
          localIntent = new Intent("android.intent.action.VIEW", ((Uri)localObject1).buildUpon().appendQueryParameter("al_applink_data", ((JSONObject)localObject2).toString()).build());
          localObject2 = NavigationResult.WEB;
        }
        catch (JSONException localJSONException)
        {
          sendAppLinkNavigateEventBroadcast(paramContext, localIntent, NavigationResult.FAILED, localJSONException);
          throw new RuntimeException(localJSONException);
        }
      } else {
        localIntent = null;
      }
    }
    sendAppLinkNavigateEventBroadcast(paramContext, localIntent, localJSONException, null);
    if (localIntent != null) {
      paramContext.startActivity(localIntent);
    }
    return localJSONException;
  }
  
  public static enum NavigationResult
  {
    private String code;
    private boolean succeeded;
    
    static
    {
      NavigationResult localNavigationResult1 = new NavigationResult("FAILED", 0, "failed", false);
      FAILED = localNavigationResult1;
      NavigationResult localNavigationResult2 = new NavigationResult("WEB", 1, "web", true);
      WEB = localNavigationResult2;
      NavigationResult localNavigationResult3 = new NavigationResult("APP", 2, "app", true);
      APP = localNavigationResult3;
      $VALUES = new NavigationResult[] { localNavigationResult1, localNavigationResult2, localNavigationResult3 };
    }
    
    private NavigationResult(String paramString, boolean paramBoolean)
    {
      code = paramString;
      succeeded = paramBoolean;
    }
    
    public String getCode()
    {
      return code;
    }
    
    public boolean isSucceeded()
    {
      return succeeded;
    }
  }
}

/* Location:
 * Qualified Name:     bolts.AppLinkNavigation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */