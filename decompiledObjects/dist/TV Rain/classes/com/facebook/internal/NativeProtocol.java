package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NativeProtocol
{
  public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
  public static final String ACTION_CAMERA_EFFECT = "com.facebook.platform.action.request.CAMERA_EFFECT";
  public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
  public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
  public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
  public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
  public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
  public static final String ACTION_SHARE_STORY = "com.facebook.platform.action.request.SHARE_STORY";
  public static final String AUDIENCE_EVERYONE = "everyone";
  public static final String AUDIENCE_FRIENDS = "friends";
  public static final String AUDIENCE_ME = "only_me";
  public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
  public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";
  public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";
  public static final String BRIDGE_ARG_ERROR_CODE = "error_code";
  public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
  public static final String BRIDGE_ARG_ERROR_JSON = "error_json";
  public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
  public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";
  private static final String CONTENT_SCHEME = "content://";
  public static final String ERROR_APPLICATION_ERROR = "ApplicationError";
  public static final String ERROR_NETWORK_ERROR = "NetworkError";
  public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";
  public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";
  public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";
  public static final String ERROR_UNKNOWN_ERROR = "UnknownError";
  public static final String ERROR_USER_CANCELED = "UserCanceled";
  public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
  public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
  public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
  public static final String EXTRA_DATA_ACCESS_EXPIRATION_TIME = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
  public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
  public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
  public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
  public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
  public static final String EXTRA_GRAPH_API_VERSION = "com.facebook.platform.extra.GRAPH_API_VERSION";
  public static final String EXTRA_LOGGER_REF = "com.facebook.platform.extra.LOGGER_REF";
  public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
  public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
  public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
  public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
  public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
  public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
  public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
  public static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
  public static final String EXTRA_TOAST_DURATION_MS = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";
  public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
  private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
  public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
  public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
  public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
  public static final String FACEBOOK_SDK_VERSION_KEY = "facebook_sdk_version";
  private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
  public static final String IMAGE_URL_KEY = "url";
  public static final String IMAGE_USER_GENERATED_KEY = "user_generated";
  public static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
  public static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
  private static final List<Integer> KNOWN_PROTOCOL_VERSIONS = Arrays.asList(new Integer[] { Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101) });
  public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 65537;
  public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 65536;
  public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY = 65545;
  public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST = 65544;
  public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 65541;
  public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 65540;
  public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 65543;
  public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 65542;
  public static final int MESSAGE_GET_LOGIN_STATUS_REPLY = 65547;
  public static final int MESSAGE_GET_LOGIN_STATUS_REQUEST = 65546;
  public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 65539;
  public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 65538;
  public static final int NO_PROTOCOL_AVAILABLE = -1;
  public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
  private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";
  private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
  private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
  public static final int PROTOCOL_VERSION_20121101 = 20121101;
  public static final int PROTOCOL_VERSION_20130502 = 20130502;
  public static final int PROTOCOL_VERSION_20130618 = 20130618;
  public static final int PROTOCOL_VERSION_20131107 = 20131107;
  public static final int PROTOCOL_VERSION_20140204 = 20140204;
  public static final int PROTOCOL_VERSION_20140324 = 20140324;
  public static final int PROTOCOL_VERSION_20140701 = 20140701;
  public static final int PROTOCOL_VERSION_20141001 = 20141001;
  public static final int PROTOCOL_VERSION_20141028 = 20141028;
  public static final int PROTOCOL_VERSION_20141107 = 20141107;
  public static final int PROTOCOL_VERSION_20141218 = 20141218;
  public static final int PROTOCOL_VERSION_20160327 = 20160327;
  public static final int PROTOCOL_VERSION_20170213 = 20170213;
  public static final int PROTOCOL_VERSION_20170411 = 20170411;
  public static final int PROTOCOL_VERSION_20170417 = 20170417;
  public static final int PROTOCOL_VERSION_20171115 = 20171115;
  public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";
  public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
  public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
  public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
  public static final String RESULT_ARGS_GRAPH_DOMAIN = "graph_domain";
  public static final String RESULT_ARGS_PERMISSIONS = "permissions";
  public static final String RESULT_ARGS_SIGNED_REQUEST = "signed request";
  public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
  public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
  public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
  public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
  public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
  private static final String TAG = "com.facebook.internal.NativeProtocol";
  public static final String WEB_DIALOG_ACTION = "action";
  public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";
  public static final String WEB_DIALOG_PARAMS = "params";
  public static final String WEB_DIALOG_URL = "url";
  private static final Map<String, List<NativeAppInfo>> actionToAppInfoMap;
  private static final List<NativeAppInfo> effectCameraAppInfoList;
  private static final List<NativeAppInfo> facebookAppInfoList = ;
  private static final AtomicBoolean protocolVersionsAsyncUpdating;
  
  static
  {
    effectCameraAppInfoList = buildEffectCameraAppInfoList();
    actionToAppInfoMap = buildActionToAppInfoMap();
    protocolVersionsAsyncUpdating = new AtomicBoolean(false);
  }
  
  private static Map<String, List<NativeAppInfo>> buildActionToAppInfoMap()
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = new com/facebook/internal/NativeProtocol$MessengerAppInfo;
      ((MessengerAppInfo)localObject).<init>(null);
      localArrayList.add(localObject);
      localObject = facebookAppInfoList;
      localHashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.FEED_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", localArrayList);
      localHashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", localArrayList);
      localHashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
      localHashMap.put("com.facebook.platform.action.request.SHARE_STORY", localObject);
      return localHashMap;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return null;
  }
  
  private static List<NativeAppInfo> buildEffectCameraAppInfoList()
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(buildFacebookAppList());
      EffectTestAppInfo localEffectTestAppInfo = new com/facebook/internal/NativeProtocol$EffectTestAppInfo;
      localEffectTestAppInfo.<init>(null);
      localArrayList.add(0, localEffectTestAppInfo);
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return null;
  }
  
  private static List<NativeAppInfo> buildFacebookAppList()
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = new com/facebook/internal/NativeProtocol$KatanaAppInfo;
      ((KatanaAppInfo)localObject).<init>(null);
      localArrayList.add(localObject);
      localObject = new com/facebook/internal/NativeProtocol$WakizashiAppInfo;
      ((WakizashiAppInfo)localObject).<init>(null);
      localArrayList.add(localObject);
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return null;
  }
  
  private static Uri buildPlatformProviderVersionURI(NativeAppInfo paramNativeAppInfo)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("content://");
      localStringBuilder.append(paramNativeAppInfo.getPackage());
      localStringBuilder.append(".provider.PlatformProvider/versions");
      paramNativeAppInfo = Uri.parse(localStringBuilder.toString());
      return paramNativeAppInfo;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramNativeAppInfo, NativeProtocol.class);
    }
    return null;
  }
  
  public static int computeLatestAvailableVersionFromVersionSpec(TreeSet<Integer> paramTreeSet, int paramInt, int[] paramArrayOfInt)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return 0;
    }
    try
    {
      int i = paramArrayOfInt.length - 1;
      paramTreeSet = paramTreeSet.descendingIterator();
      int j = -1;
      int k = -1;
      int n;
      int i1;
      do
      {
        m = j;
        if (!paramTreeSet.hasNext()) {
          break;
        }
        m = ((Integer)paramTreeSet.next()).intValue();
        n = Math.max(k, m);
        for (i1 = i; (i1 >= 0) && (paramArrayOfInt[i1] > m); i1--) {}
        if (i1 < 0) {
          return -1;
        }
        i = i1;
        k = n;
      } while (paramArrayOfInt[i1] != m);
      int m = j;
      if (i1 % 2 == 0) {
        m = Math.min(n, paramInt);
      }
      return m;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTreeSet, NativeProtocol.class);
    }
    return 0;
  }
  
  public static Bundle createBundleForException(FacebookException paramFacebookException)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    if (paramFacebookException == null) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("error_description", paramFacebookException.toString());
      if ((paramFacebookException instanceof FacebookOperationCanceledException)) {
        localBundle.putString("error_type", "UserCanceled");
      }
      return localBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookException, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent createFacebookLiteIntent(Context paramContext, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      FBLiteAppInfo localFBLiteAppInfo = new com/facebook/internal/NativeProtocol$FBLiteAppInfo;
      localFBLiteAppInfo.<init>(null);
      paramContext = validateActivityIntent(paramContext, createNativeAppIntent(localFBLiteAppInfo, paramString1, paramCollection, paramString2, paramBoolean1, paramBoolean2, paramDefaultAudience, paramString3, paramString4, false), localFBLiteAppInfo);
      return paramContext;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  private static Intent createNativeAppIntent(NativeAppInfo paramNativeAppInfo, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4, boolean paramBoolean3)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      String str = paramNativeAppInfo.getLoginActivity();
      if (str == null) {
        return null;
      }
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      paramNativeAppInfo = localIntent.setClassName(paramNativeAppInfo.getPackage(), str).putExtra("client_id", paramString1);
      paramNativeAppInfo.putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
      if (!Utility.isNullOrEmpty(paramCollection)) {
        paramNativeAppInfo.putExtra("scope", TextUtils.join(",", paramCollection));
      }
      if (!Utility.isNullOrEmpty(paramString2)) {
        paramNativeAppInfo.putExtra("e2e", paramString2);
      }
      paramNativeAppInfo.putExtra("state", paramString3);
      paramNativeAppInfo.putExtra("response_type", "token,signed_request,graph_domain");
      paramNativeAppInfo.putExtra("return_scopes", "true");
      if (paramBoolean2) {
        paramNativeAppInfo.putExtra("default_audience", paramDefaultAudience.getNativeProtocolAudience());
      }
      paramNativeAppInfo.putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
      paramNativeAppInfo.putExtra("auth_type", paramString4);
      if (paramBoolean3) {
        paramNativeAppInfo.putExtra("fail_on_logged_out", true);
      }
      return paramNativeAppInfo;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramNativeAppInfo, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent createPlatformActivityIntent(Context paramContext, String paramString1, String paramString2, ProtocolVersionQueryResult paramProtocolVersionQueryResult, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    if (paramProtocolVersionQueryResult == null) {
      return null;
    }
    try
    {
      NativeAppInfo localNativeAppInfo = ProtocolVersionQueryResult.access$700(paramProtocolVersionQueryResult);
      if (localNativeAppInfo == null) {
        return null;
      }
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      paramContext = validateActivityIntent(paramContext, localIntent.setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(localNativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), localNativeAppInfo);
      if (paramContext == null) {
        return null;
      }
      setupProtocolRequestIntent(paramContext, paramString1, paramString2, ProtocolVersionQueryResult.access$800(paramProtocolVersionQueryResult), paramBundle);
      return paramContext;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent createPlatformServiceIntent(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      Iterator localIterator = facebookAppInfoList.iterator();
      while (localIterator.hasNext())
      {
        NativeAppInfo localNativeAppInfo = (NativeAppInfo)localIterator.next();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>("com.facebook.platform.PLATFORM_SERVICE");
        localIntent = validateServiceIntent(paramContext, localIntent.setPackage(localNativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), localNativeAppInfo);
        if (localIntent != null) {
          return localIntent;
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent createProtocolResultIntent(Intent paramIntent, Bundle paramBundle, FacebookException paramFacebookException)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      UUID localUUID = getCallIdFromIntent(paramIntent);
      if (localUUID == null) {
        return null;
      }
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(paramIntent));
      paramIntent = new android/os/Bundle;
      paramIntent.<init>();
      paramIntent.putString("action_id", localUUID.toString());
      if (paramFacebookException != null) {
        paramIntent.putBundle("error", createBundleForException(paramFacebookException));
      }
      localIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramIntent);
      if (paramBundle != null) {
        localIntent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", paramBundle);
      }
      return localIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return null;
  }
  
  public static List<Intent> createProxyAuthIntents(Context paramContext, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4, boolean paramBoolean3)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = facebookAppInfoList.iterator();
      while (localIterator.hasNext())
      {
        paramContext = createNativeAppIntent((NativeAppInfo)localIterator.next(), paramString1, paramCollection, paramString2, paramBoolean1, paramBoolean2, paramDefaultAudience, paramString3, paramString4, paramBoolean3);
        if (paramContext != null) {
          localArrayList.add(paramContext);
        }
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent createTokenRefreshIntent(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      Iterator localIterator = facebookAppInfoList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (NativeAppInfo)localIterator.next();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localObject = validateServiceIntent(paramContext, localIntent.setClassName(((NativeAppInfo)localObject).getPackage(), "com.facebook.katana.platform.TokenRefreshService"), (NativeAppInfo)localObject);
        if (localObject != null) {
          return (Intent)localObject;
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  /* Error */
  private static TreeSet<Integer> fetchAllAvailableProtocolVersionsForAppInfo(NativeAppInfo paramNativeAppInfo)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 382	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 446	java/util/TreeSet
    //   13: astore_1
    //   14: aload_1
    //   15: invokespecial 644	java/util/TreeSet:<init>	()V
    //   18: invokestatic 648	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   21: invokevirtual 654	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   24: astore_2
    //   25: aload_0
    //   26: invokestatic 656	com/facebook/internal/NativeProtocol:buildPlatformProviderVersionURI	(Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/net/Uri;
    //   29: astore_3
    //   30: invokestatic 648	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   33: invokevirtual 660	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   36: astore 4
    //   38: new 424	java/lang/StringBuilder
    //   41: astore 5
    //   43: aload 5
    //   45: invokespecial 425	java/lang/StringBuilder:<init>	()V
    //   48: aload 5
    //   50: aload_0
    //   51: invokevirtual 433	com/facebook/internal/NativeProtocol$NativeAppInfo:getPackage	()Ljava/lang/String;
    //   54: invokevirtual 429	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload 5
    //   60: ldc -21
    //   62: invokevirtual 429	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload 5
    //   68: invokevirtual 436	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore_0
    //   72: aload 4
    //   74: aload_0
    //   75: iconst_0
    //   76: invokevirtual 666	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   79: astore_0
    //   80: goto +17 -> 97
    //   83: astore_0
    //   84: getstatic 668	com/facebook/internal/NativeProtocol:TAG	Ljava/lang/String;
    //   87: ldc_w 670
    //   90: aload_0
    //   91: invokestatic 676	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   94: pop
    //   95: aconst_null
    //   96: astore_0
    //   97: aload_0
    //   98: ifnull +83 -> 181
    //   101: aload_2
    //   102: aload_3
    //   103: iconst_1
    //   104: anewarray 678	java/lang/String
    //   107: dup
    //   108: iconst_0
    //   109: ldc -15
    //   111: aastore
    //   112: aconst_null
    //   113: aconst_null
    //   114: aconst_null
    //   115: invokevirtual 684	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore_0
    //   119: goto +16 -> 135
    //   122: astore_0
    //   123: getstatic 668	com/facebook/internal/NativeProtocol:TAG	Ljava/lang/String;
    //   126: ldc_w 670
    //   129: invokestatic 687	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   132: pop
    //   133: aconst_null
    //   134: astore_0
    //   135: aload_0
    //   136: astore_3
    //   137: aload_0
    //   138: ifnull +45 -> 183
    //   141: aload_0
    //   142: astore_3
    //   143: aload_0
    //   144: invokeinterface 692 1 0
    //   149: ifeq +34 -> 183
    //   152: aload_1
    //   153: aload_0
    //   154: aload_0
    //   155: ldc -15
    //   157: invokeinterface 696 2 0
    //   162: invokeinterface 700 2 0
    //   167: invokestatic 363	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   170: invokevirtual 701	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   173: pop
    //   174: goto -33 -> 141
    //   177: astore_3
    //   178: goto +20 -> 198
    //   181: aconst_null
    //   182: astore_3
    //   183: aload_3
    //   184: ifnull +9 -> 193
    //   187: aload_3
    //   188: invokeinterface 704 1 0
    //   193: aload_1
    //   194: areturn
    //   195: astore_3
    //   196: aconst_null
    //   197: astore_0
    //   198: aload_0
    //   199: ifnull +9 -> 208
    //   202: aload_0
    //   203: invokeinterface 704 1 0
    //   208: aload_3
    //   209: athrow
    //   210: astore_0
    //   211: aload_0
    //   212: ldc 2
    //   214: invokestatic 389	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   217: aconst_null
    //   218: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramNativeAppInfo	NativeAppInfo
    //   13	181	1	localTreeSet	TreeSet
    //   24	78	2	localContentResolver	android.content.ContentResolver
    //   29	114	3	localObject1	Object
    //   177	1	3	localObject2	Object
    //   182	6	3	localObject3	Object
    //   195	14	3	localObject4	Object
    //   36	37	4	localPackageManager	PackageManager
    //   41	26	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   72	80	83	java/lang/RuntimeException
    //   101	119	122	java/lang/NullPointerException
    //   101	119	122	java/lang/SecurityException
    //   101	119	122	java/lang/IllegalArgumentException
    //   143	174	177	finally
    //   30	72	195	finally
    //   72	80	195	finally
    //   84	95	195	finally
    //   101	119	195	finally
    //   123	133	195	finally
    //   10	30	210	finally
    //   187	193	210	finally
    //   202	208	210	finally
    //   208	210	210	finally
  }
  
  public static Bundle getBridgeArgumentsFromIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(paramIntent))) {
        return null;
      }
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return null;
  }
  
  /* Error */
  public static UUID getCallIdFromIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 382	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: aload_0
    //   15: ifnonnull +5 -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: aload_0
    //   21: invokestatic 616	com/facebook/internal/NativeProtocol:getProtocolVersionFromIntent	(Landroid/content/Intent;)I
    //   24: invokestatic 711	com/facebook/internal/NativeProtocol:isVersionCompatibleWithBucketedIntent	(I)Z
    //   27: ifeq +29 -> 56
    //   30: aload_0
    //   31: ldc -108
    //   33: invokevirtual 715	android/content/Intent:getBundleExtra	(Ljava/lang/String;)Landroid/os/Bundle;
    //   36: astore_0
    //   37: aload_0
    //   38: ifnull +13 -> 51
    //   41: aload_0
    //   42: ldc 64
    //   44: invokevirtual 719	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   47: astore_0
    //   48: goto +15 -> 63
    //   51: aconst_null
    //   52: astore_0
    //   53: goto +10 -> 63
    //   56: aload_0
    //   57: ldc -105
    //   59: invokevirtual 722	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   62: astore_0
    //   63: aload_2
    //   64: astore_3
    //   65: aload_0
    //   66: ifnull +8 -> 74
    //   69: aload_0
    //   70: invokestatic 726	java/util/UUID:fromString	(Ljava/lang/String;)Ljava/util/UUID;
    //   73: astore_3
    //   74: aload_3
    //   75: areturn
    //   76: astore_0
    //   77: aload_0
    //   78: ldc 2
    //   80: invokestatic 389	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   83: aconst_null
    //   84: areturn
    //   85: astore_0
    //   86: aload_2
    //   87: astore_3
    //   88: goto -14 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramIntent	Intent
    //   5	4	1	bool	boolean
    //   7	80	2	localObject1	Object
    //   64	24	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   20	37	76	finally
    //   41	48	76	finally
    //   56	63	76	finally
    //   69	74	76	finally
    //   69	74	85	java/lang/IllegalArgumentException
  }
  
  public static Bundle getErrorDataFromResultIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      if (!isErrorResult(paramIntent)) {
        return null;
      }
      Bundle localBundle = getBridgeArgumentsFromIntent(paramIntent);
      if (localBundle != null) {
        return localBundle.getBundle("error");
      }
      paramIntent = paramIntent.getExtras();
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return null;
  }
  
  public static FacebookException getExceptionFromErrorData(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    if (paramBundle == null) {
      return null;
    }
    try
    {
      Object localObject1 = paramBundle.getString("error_type");
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
      }
      String str = paramBundle.getString("error_description");
      localObject1 = str;
      if (str == null) {
        localObject1 = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
      }
      if ((localObject2 != null) && (((String)localObject2).equalsIgnoreCase("UserCanceled"))) {
        return new FacebookOperationCanceledException((String)localObject1);
      }
      paramBundle = new FacebookException((String)localObject1);
      return paramBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, NativeProtocol.class);
    }
    return null;
  }
  
  public static ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(String paramString, int[] paramArrayOfInt)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      paramString = getLatestAvailableProtocolVersionForAppInfoList((List)actionToAppInfoMap.get(paramString), paramArrayOfInt);
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, NativeProtocol.class);
    }
    return null;
  }
  
  private static ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List<NativeAppInfo> paramList, int[] paramArrayOfInt)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      updateAllAvailableProtocolVersionsAsync();
      if (paramList == null) {
        return ProtocolVersionQueryResult.createEmpty();
      }
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        NativeAppInfo localNativeAppInfo = (NativeAppInfo)paramList.next();
        int i = computeLatestAvailableVersionFromVersionSpec(localNativeAppInfo.getAvailableVersions(), getLatestKnownVersion(), paramArrayOfInt);
        if (i != -1) {
          return ProtocolVersionQueryResult.create(localNativeAppInfo, i);
        }
      }
      paramList = ProtocolVersionQueryResult.createEmpty();
      return paramList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList, NativeProtocol.class);
    }
    return null;
  }
  
  public static int getLatestAvailableProtocolVersionForService(int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return 0;
    }
    try
    {
      paramInt = getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[] { paramInt }).getProtocolVersion();
      return paramInt;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return 0;
  }
  
  public static final int getLatestKnownVersion()
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return 0;
    }
    try
    {
      int i = ((Integer)KNOWN_PROTOCOL_VERSIONS.get(0)).intValue();
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return 0;
  }
  
  public static Bundle getMethodArgumentsFromIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(paramIntent))) {
        return paramIntent.getExtras();
      }
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return null;
  }
  
  public static int getProtocolVersionFromIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return 0;
    }
    try
    {
      int i = paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return 0;
  }
  
  public static Bundle getSuccessResultsFromIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    try
    {
      int i = getProtocolVersionFromIntent(paramIntent);
      Bundle localBundle = paramIntent.getExtras();
      paramIntent = localBundle;
      if (isVersionCompatibleWithBucketedIntent(i)) {
        if (localBundle == null) {
          paramIntent = localBundle;
        } else {
          paramIntent = localBundle.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        }
      }
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return null;
  }
  
  public static boolean isErrorResult(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return false;
    }
    try
    {
      Bundle localBundle = getBridgeArgumentsFromIntent(paramIntent);
      if (localBundle != null) {
        return localBundle.containsKey("error");
      }
      boolean bool = paramIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
    return false;
  }
  
  public static boolean isVersionCompatibleWithBucketedIntent(int paramInt)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(NativeProtocol.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      boolean bool3 = KNOWN_PROTOCOL_VERSIONS.contains(Integer.valueOf(paramInt));
      bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramInt >= 20140701) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
    return false;
  }
  
  public static void setupProtocolRequestIntent(Intent paramIntent, String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return;
    }
    try
    {
      String str1 = FacebookSdk.getApplicationId();
      String str2 = FacebookSdk.getApplicationName();
      paramIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", paramInt).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", paramString2).putExtra("com.facebook.platform.extra.APPLICATION_ID", str1);
      if (isVersionCompatibleWithBucketedIntent(paramInt))
      {
        paramString2 = new android/os/Bundle;
        paramString2.<init>();
        paramString2.putString("action_id", paramString1);
        Utility.putNonEmptyString(paramString2, "app_name", str2);
        paramIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramString2);
        paramString1 = paramBundle;
        if (paramBundle == null)
        {
          paramString1 = new android/os/Bundle;
          paramString1.<init>();
        }
        paramIntent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", paramString1);
      }
      else
      {
        paramIntent.putExtra("com.facebook.platform.protocol.CALL_ID", paramString1);
        if (!Utility.isNullOrEmpty(str2)) {
          paramIntent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str2);
        }
        paramIntent.putExtras(paramBundle);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, NativeProtocol.class);
    }
  }
  
  public static void updateAllAvailableProtocolVersionsAsync()
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return;
    }
    try
    {
      if (!protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
        return;
      }
      Executor localExecutor = FacebookSdk.getExecutor();
      Runnable local1 = new com/facebook/internal/NativeProtocol$1;
      local1.<init>();
      localExecutor.execute(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, NativeProtocol.class);
    }
  }
  
  public static Intent validateActivityIntent(Context paramContext, Intent paramIntent, NativeAppInfo paramNativeAppInfo)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramNativeAppInfo = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
      if (paramNativeAppInfo == null) {
        return null;
      }
      boolean bool = FacebookSignatureValidator.validateSignature(paramContext, activityInfo.packageName);
      if (!bool) {
        return null;
      }
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  public static Intent validateServiceIntent(Context paramContext, Intent paramIntent, NativeAppInfo paramNativeAppInfo)
  {
    if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
      return null;
    }
    if (paramIntent == null) {
      return null;
    }
    try
    {
      paramNativeAppInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
      if (paramNativeAppInfo == null) {
        return null;
      }
      boolean bool = FacebookSignatureValidator.validateSignature(paramContext, serviceInfo.packageName);
      if (!bool) {
        return null;
      }
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, NativeProtocol.class);
    }
    return null;
  }
  
  public static class EffectTestAppInfo
    extends NativeProtocol.NativeAppInfo
  {
    public static final String EFFECT_TEST_APP_PACKAGE = "com.facebook.arstudio.player";
    
    private EffectTestAppInfo()
    {
      super();
    }
    
    public String getLoginActivity()
    {
      return null;
    }
    
    public String getPackage()
    {
      return "com.facebook.arstudio.player";
    }
  }
  
  public static class FBLiteAppInfo
    extends NativeProtocol.NativeAppInfo
  {
    public static final String FACEBOOK_LITE_ACTIVITY = "com.facebook.lite.platform.LoginGDPDialogActivity";
    public static final String FBLITE_PACKAGE = "com.facebook.lite";
    
    private FBLiteAppInfo()
    {
      super();
    }
    
    public String getLoginActivity()
    {
      return "com.facebook.lite.platform.LoginGDPDialogActivity";
    }
    
    public String getPackage()
    {
      return "com.facebook.lite";
    }
  }
  
  public static class KatanaAppInfo
    extends NativeProtocol.NativeAppInfo
  {
    public static final String KATANA_PACKAGE = "com.facebook.katana";
    
    private KatanaAppInfo()
    {
      super();
    }
    
    public String getLoginActivity()
    {
      return "com.facebook.katana.ProxyAuth";
    }
    
    public String getPackage()
    {
      return "com.facebook.katana";
    }
  }
  
  public static class MessengerAppInfo
    extends NativeProtocol.NativeAppInfo
  {
    public static final String MESSENGER_PACKAGE = "com.facebook.orca";
    
    private MessengerAppInfo()
    {
      super();
    }
    
    public String getLoginActivity()
    {
      return null;
    }
    
    public String getPackage()
    {
      return "com.facebook.orca";
    }
  }
  
  public static abstract class NativeAppInfo
  {
    private TreeSet<Integer> availableVersions;
    
    private void fetchAvailableVersions(boolean paramBoolean)
    {
      if (!paramBoolean) {}
      try
      {
        TreeSet localTreeSet = availableVersions;
        if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
          availableVersions = NativeProtocol.access$000(this);
        }
        return;
      }
      finally {}
    }
    
    public TreeSet<Integer> getAvailableVersions()
    {
      TreeSet localTreeSet = availableVersions;
      if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
        fetchAvailableVersions(false);
      }
      return availableVersions;
    }
    
    public abstract String getLoginActivity();
    
    public abstract String getPackage();
  }
  
  public static class ProtocolVersionQueryResult
  {
    private NativeProtocol.NativeAppInfo nativeAppInfo;
    private int protocolVersion;
    
    public static ProtocolVersionQueryResult create(NativeProtocol.NativeAppInfo paramNativeAppInfo, int paramInt)
    {
      ProtocolVersionQueryResult localProtocolVersionQueryResult = new ProtocolVersionQueryResult();
      nativeAppInfo = paramNativeAppInfo;
      protocolVersion = paramInt;
      return localProtocolVersionQueryResult;
    }
    
    public static ProtocolVersionQueryResult createEmpty()
    {
      ProtocolVersionQueryResult localProtocolVersionQueryResult = new ProtocolVersionQueryResult();
      protocolVersion = -1;
      return localProtocolVersionQueryResult;
    }
    
    @Nullable
    public NativeProtocol.NativeAppInfo getAppInfo()
    {
      return nativeAppInfo;
    }
    
    public int getProtocolVersion()
    {
      return protocolVersion;
    }
  }
  
  public static class WakizashiAppInfo
    extends NativeProtocol.NativeAppInfo
  {
    public static final String WAKIZASHI_PACKAGE = "com.facebook.wakizashi";
    
    private WakizashiAppInfo()
    {
      super();
    }
    
    public String getLoginActivity()
    {
      return "com.facebook.katana.ProxyAuth";
    }
    
    public String getPackage()
    {
      return "com.facebook.wakizashi";
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */