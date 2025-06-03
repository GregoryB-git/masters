package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.FileLruCache.Limits;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.widget.LikeView.ObjectType;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@Deprecated
public class LikeActionController
{
  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";
  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";
  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";
  @Deprecated
  public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
  private static final int ERROR_CODE_OBJECT_ALREADY_LIKED = 3501;
  @Deprecated
  public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";
  @Deprecated
  public static final String ERROR_PUBLISH_ERROR = "Unable to publish the like/unlike action";
  private static final String JSON_BOOL_IS_OBJECT_LIKED_KEY = "is_object_liked";
  private static final String JSON_BUNDLE_FACEBOOK_DIALOG_ANALYTICS_BUNDLE = "facebook_dialog_analytics_bundle";
  private static final String JSON_INT_OBJECT_TYPE_KEY = "object_type";
  private static final String JSON_INT_VERSION_KEY = "com.facebook.share.internal.LikeActionController.version";
  private static final String JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY = "like_count_string_without_like";
  private static final String JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY = "like_count_string_with_like";
  private static final String JSON_STRING_OBJECT_ID_KEY = "object_id";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY = "social_sentence_without_like";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY = "social_sentence_with_like";
  private static final String JSON_STRING_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final String LIKE_ACTION_CONTROLLER_STORE = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
  private static final String LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY = "OBJECT_SUFFIX";
  private static final String LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY = "PENDING_CONTROLLER_KEY";
  private static final int LIKE_ACTION_CONTROLLER_VERSION = 3;
  private static final String LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY = "like_count_string";
  private static final String LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY = "object_is_liked";
  private static final String LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY = "social_sentence";
  private static final String LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final int MAX_CACHE_SIZE = 128;
  private static final int MAX_OBJECT_SUFFIX = 1000;
  private static final String TAG = "LikeActionController";
  private static AccessTokenTracker accessTokenTracker;
  private static final ConcurrentHashMap<String, LikeActionController> cache = new ConcurrentHashMap();
  private static FileLruCache controllerDiskCache;
  private static WorkQueue diskIOWorkQueue = new WorkQueue(1);
  private static Handler handler;
  private static boolean isInitialized;
  private static WorkQueue mruCacheWorkQueue = new WorkQueue(1);
  private static String objectIdForPendingController;
  private static volatile int objectSuffix;
  private Bundle facebookDialogAnalyticsBundle;
  private boolean isObjectLiked;
  private boolean isObjectLikedOnServer;
  private boolean isPendingLikeOrUnlike;
  private String likeCountStringWithLike;
  private String likeCountStringWithoutLike;
  private InternalAppEventsLogger logger;
  private String objectId;
  private boolean objectIsPage;
  private LikeView.ObjectType objectType;
  private String socialSentenceWithLike;
  private String socialSentenceWithoutLike;
  private String unlikeToken;
  private String verifiedObjectId;
  
  private LikeActionController(String paramString, LikeView.ObjectType paramObjectType)
  {
    objectId = paramString;
    objectType = paramObjectType;
  }
  
  private static void broadcastAction(LikeActionController paramLikeActionController, String paramString)
  {
    broadcastAction(paramLikeActionController, paramString, null);
  }
  
  private static void broadcastAction(LikeActionController paramLikeActionController, String paramString, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramString);
    paramString = paramBundle;
    if (paramLikeActionController != null)
    {
      paramString = paramBundle;
      if (paramBundle == null) {
        paramString = new Bundle();
      }
      paramString.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", paramLikeActionController.getObjectId());
    }
    if (paramString != null) {
      localIntent.putExtras(paramString);
    }
    LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(localIntent);
  }
  
  private boolean canUseOGPublish()
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    boolean bool;
    if ((!objectIsPage) && (verifiedObjectId != null) && (AccessToken.isCurrentAccessTokenActive()) && (localAccessToken.getPermissions() != null) && (localAccessToken.getPermissions().contains("publish_actions"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void clearState()
  {
    facebookDialogAnalyticsBundle = null;
    storeObjectIdForPendingController(null);
  }
  
  private static void createControllerForObjectIdAndType(String paramString, LikeView.ObjectType paramObjectType, CreationCallback paramCreationCallback)
  {
    Object localObject = getControllerFromInMemoryCache(paramString);
    if (localObject != null)
    {
      verifyControllerAndInvokeCallback((LikeActionController)localObject, paramObjectType, paramCreationCallback);
      return;
    }
    LikeActionController localLikeActionController = deserializeFromDiskSynchronously(paramString);
    localObject = localLikeActionController;
    if (localLikeActionController == null)
    {
      localObject = new LikeActionController(paramString, paramObjectType);
      serializeToDiskAsync((LikeActionController)localObject);
    }
    putControllerInMemoryCache(paramString, (LikeActionController)localObject);
    handler.post(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          LikeActionController.access$200(val$controllerToRefresh);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
    invokeCallbackWithController(paramCreationCallback, (LikeActionController)localObject, null);
  }
  
  /* Error */
  private static LikeActionController deserializeFromDiskSynchronously(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_0
    //   7: invokestatic 442	com/facebook/share/internal/LikeActionController:getCacheKeyForObjectId	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_0
    //   11: getstatic 324	com/facebook/share/internal/LikeActionController:controllerDiskCache	Lcom/facebook/internal/FileLruCache;
    //   14: aload_0
    //   15: invokevirtual 448	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore 4
    //   20: aload_3
    //   21: astore_0
    //   22: aload 4
    //   24: ifnull +48 -> 72
    //   27: aload 4
    //   29: astore 5
    //   31: aload 4
    //   33: invokestatic 454	com/facebook/internal/Utility:readStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   36: astore 6
    //   38: aload_3
    //   39: astore_0
    //   40: aload 4
    //   42: astore 5
    //   44: aload 6
    //   46: invokestatic 458	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   49: ifne +23 -> 72
    //   52: aload 4
    //   54: astore 5
    //   56: aload 6
    //   58: invokestatic 461	com/facebook/share/internal/LikeActionController:deserializeFromJson	(Ljava/lang/String;)Lcom/facebook/share/internal/LikeActionController;
    //   61: astore_0
    //   62: goto +10 -> 72
    //   65: astore_3
    //   66: aload 4
    //   68: astore_0
    //   69: goto +32 -> 101
    //   72: aload_0
    //   73: astore 5
    //   75: aload 4
    //   77: ifnull +54 -> 131
    //   80: aload_0
    //   81: astore 5
    //   83: aload 4
    //   85: invokestatic 465	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   88: goto +43 -> 131
    //   91: astore_0
    //   92: aconst_null
    //   93: astore 5
    //   95: goto +40 -> 135
    //   98: astore_3
    //   99: aconst_null
    //   100: astore_0
    //   101: aload_0
    //   102: astore 5
    //   104: getstatic 228	com/facebook/share/internal/LikeActionController:TAG	Ljava/lang/String;
    //   107: ldc_w 467
    //   110: aload_3
    //   111: invokestatic 473	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   114: pop
    //   115: aload_2
    //   116: astore 5
    //   118: aload_0
    //   119: ifnull +12 -> 131
    //   122: aload_1
    //   123: astore 5
    //   125: aload_0
    //   126: astore 4
    //   128: goto -45 -> 83
    //   131: aload 5
    //   133: areturn
    //   134: astore_0
    //   135: aload 5
    //   137: ifnull +8 -> 145
    //   140: aload 5
    //   142: invokestatic 465	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   145: aload_0
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	paramString	String
    //   1	122	1	localObject1	Object
    //   3	113	2	localObject2	Object
    //   5	34	3	localObject3	Object
    //   65	1	3	localIOException1	java.io.IOException
    //   98	13	3	localIOException2	java.io.IOException
    //   18	109	4	localObject4	Object
    //   29	112	5	localObject5	Object
    //   36	21	6	str	String
    // Exception table:
    //   from	to	target	type
    //   31	38	65	java/io/IOException
    //   44	52	65	java/io/IOException
    //   56	62	65	java/io/IOException
    //   6	20	91	finally
    //   6	20	98	java/io/IOException
    //   31	38	134	finally
    //   44	52	134	finally
    //   56	62	134	finally
    //   104	115	134	finally
  }
  
  private static LikeActionController deserializeFromJson(String paramString)
  {
    Object localObject = null;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      if (localJSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
        return null;
      }
      String str = localJSONObject.getString("object_id");
      int i = localJSONObject.optInt("object_type", LikeView.ObjectType.UNKNOWN.getValue());
      paramString = new com/facebook/share/internal/LikeActionController;
      paramString.<init>(str, LikeView.ObjectType.fromInt(i));
      likeCountStringWithLike = localJSONObject.optString("like_count_string_with_like", null);
      likeCountStringWithoutLike = localJSONObject.optString("like_count_string_without_like", null);
      socialSentenceWithLike = localJSONObject.optString("social_sentence_with_like", null);
      socialSentenceWithoutLike = localJSONObject.optString("social_sentence_without_like", null);
      isObjectLiked = localJSONObject.optBoolean("is_object_liked");
      unlikeToken = localJSONObject.optString("unlike_token", null);
      localJSONObject = localJSONObject.optJSONObject("facebook_dialog_analytics_bundle");
      if (localJSONObject != null) {
        facebookDialogAnalyticsBundle = BundleJSONConverter.convertToBundle(localJSONObject);
      }
    }
    catch (JSONException paramString)
    {
      Log.e(TAG, "Unable to deserialize controller from JSON", paramString);
      paramString = (String)localObject;
    }
    return paramString;
  }
  
  private void fetchVerifiedObjectId(final RequestCompletionCallback paramRequestCompletionCallback)
  {
    if (!Utility.isNullOrEmpty(verifiedObjectId))
    {
      if (paramRequestCompletionCallback != null) {
        paramRequestCompletionCallback.onComplete();
      }
      return;
    }
    final GetOGObjectIdRequestWrapper localGetOGObjectIdRequestWrapper = new GetOGObjectIdRequestWrapper(objectId, objectType);
    final GetPageIdRequestWrapper localGetPageIdRequestWrapper = new GetPageIdRequestWrapper(objectId, objectType);
    GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch();
    localGetOGObjectIdRequestWrapper.addToBatch(localGraphRequestBatch);
    localGetPageIdRequestWrapper.addToBatch(localGraphRequestBatch);
    localGraphRequestBatch.addCallback(new GraphRequestBatch.Callback()
    {
      public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
      {
        LikeActionController.access$1602(LikeActionController.this, localGetOGObjectIdRequestWrapperverifiedObjectId);
        if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
        {
          LikeActionController.access$1602(LikeActionController.this, localGetPageIdRequestWrapperverifiedObjectId);
          LikeActionController.access$2302(LikeActionController.this, localGetPageIdRequestWrapperobjectIsPage);
        }
        if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
        {
          Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.access$100(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] { LikeActionController.access$2200(LikeActionController.this) });
          LikeActionController localLikeActionController = LikeActionController.this;
          if (localGetPageIdRequestWrapper.getError() != null) {
            paramAnonymousGraphRequestBatch = localGetPageIdRequestWrapper.getError();
          } else {
            paramAnonymousGraphRequestBatch = localGetOGObjectIdRequestWrapper.getError();
          }
          LikeActionController.access$2400(localLikeActionController, "get_verified_id", paramAnonymousGraphRequestBatch);
        }
        paramAnonymousGraphRequestBatch = paramRequestCompletionCallback;
        if (paramAnonymousGraphRequestBatch != null) {
          paramAnonymousGraphRequestBatch.onComplete();
        }
      }
    });
    localGraphRequestBatch.executeAsync();
  }
  
  private InternalAppEventsLogger getAppEventsLogger()
  {
    if (logger == null) {
      logger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
    }
    return logger;
  }
  
  private static String getCacheKeyForObjectId(String paramString)
  {
    Object localObject1 = AccessToken.getCurrentAccessToken();
    if (AccessToken.isCurrentAccessTokenActive()) {
      localObject1 = ((AccessToken)localObject1).getToken();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 != null) {
      localObject2 = Utility.md5hash((String)localObject1);
    }
    return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[] { paramString, Utility.coerceValueIfNullOrEmpty((String)localObject2, ""), Integer.valueOf(objectSuffix) });
  }
  
  @Deprecated
  public static void getControllerForObjectId(String paramString, LikeView.ObjectType paramObjectType, CreationCallback paramCreationCallback)
  {
    if (!isInitialized) {
      performFirstInitialize();
    }
    LikeActionController localLikeActionController = getControllerFromInMemoryCache(paramString);
    if (localLikeActionController != null) {
      verifyControllerAndInvokeCallback(localLikeActionController, paramObjectType, paramCreationCallback);
    } else {
      diskIOWorkQueue.addActiveWorkItem(new CreateLikeActionControllerWorkItem(paramString, paramObjectType, paramCreationCallback));
    }
  }
  
  private static LikeActionController getControllerFromInMemoryCache(String paramString)
  {
    paramString = getCacheKeyForObjectId(paramString);
    LikeActionController localLikeActionController = (LikeActionController)cache.get(paramString);
    if (localLikeActionController != null) {
      mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(paramString, false));
    }
    return localLikeActionController;
  }
  
  private ResultProcessor getResultProcessor(final Bundle paramBundle)
  {
    new ResultProcessor(null)
    {
      public void onCancel(AppCall paramAnonymousAppCall)
      {
        onError(paramAnonymousAppCall, new FacebookOperationCanceledException());
      }
      
      public void onError(AppCall paramAnonymousAppCall, FacebookException paramAnonymousFacebookException)
      {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Like Dialog failed with error : %s", new Object[] { paramAnonymousFacebookException });
        Bundle localBundle1 = paramBundle;
        Bundle localBundle2 = localBundle1;
        if (localBundle1 == null) {
          localBundle2 = new Bundle();
        }
        localBundle2.putString("call_id", paramAnonymousAppCall.getCallId().toString());
        LikeActionController.access$1400(LikeActionController.this, "present_dialog", localBundle2);
        LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(paramAnonymousFacebookException));
      }
      
      public void onSuccess(AppCall paramAnonymousAppCall, Bundle paramAnonymousBundle)
      {
        if ((paramAnonymousBundle != null) && (paramAnonymousBundle.containsKey("object_is_liked")))
        {
          boolean bool = paramAnonymousBundle.getBoolean("object_is_liked");
          String str1 = LikeActionController.access$700(LikeActionController.this);
          String str2 = LikeActionController.access$800(LikeActionController.this);
          if (paramAnonymousBundle.containsKey("like_count_string"))
          {
            str1 = paramAnonymousBundle.getString("like_count_string");
            str2 = str1;
          }
          String str3 = LikeActionController.access$900(LikeActionController.this);
          String str4 = LikeActionController.access$1000(LikeActionController.this);
          if (paramAnonymousBundle.containsKey("social_sentence"))
          {
            str3 = paramAnonymousBundle.getString("social_sentence");
            str4 = str3;
          }
          if (paramAnonymousBundle.containsKey("object_is_liked")) {
            paramAnonymousBundle = paramAnonymousBundle.getString("unlike_token");
          } else {
            paramAnonymousBundle = LikeActionController.access$1100(LikeActionController.this);
          }
          Bundle localBundle1 = paramBundle;
          Bundle localBundle2 = localBundle1;
          if (localBundle1 == null) {
            localBundle2 = new Bundle();
          }
          localBundle2.putString("call_id", paramAnonymousAppCall.getCallId().toString());
          LikeActionController.access$1200(LikeActionController.this).logEventImplicitly("fb_like_control_dialog_did_succeed", localBundle2);
          LikeActionController.access$1300(LikeActionController.this, bool, str1, str2, str3, str4, paramAnonymousBundle);
        }
      }
    };
  }
  
  @Deprecated
  public static boolean handleOnActivityResult(int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    if (Utility.isNullOrEmpty(objectIdForPendingController)) {
      objectIdForPendingController = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
    }
    if (Utility.isNullOrEmpty(objectIdForPendingController)) {
      return false;
    }
    getControllerForObjectId(objectIdForPendingController, LikeView.ObjectType.UNKNOWN, new CreationCallback()
    {
      public void onComplete(LikeActionController paramAnonymousLikeActionController, FacebookException paramAnonymousFacebookException)
      {
        if (paramAnonymousFacebookException == null) {
          LikeActionController.access$000(paramAnonymousLikeActionController, val$requestCode, paramInt2, paramIntent);
        } else {
          Utility.logd(LikeActionController.access$100(), paramAnonymousFacebookException);
        }
      }
    });
    return true;
  }
  
  private static void invokeCallbackWithController(CreationCallback paramCreationCallback, final LikeActionController paramLikeActionController, final FacebookException paramFacebookException)
  {
    if (paramCreationCallback == null) {
      return;
    }
    handler.post(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          val$callback.onComplete(paramLikeActionController, paramFacebookException);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  private void logAppEventForError(String paramString, Bundle paramBundle)
  {
    paramBundle = new Bundle(paramBundle);
    paramBundle.putString("object_id", objectId);
    paramBundle.putString("object_type", objectType.toString());
    paramBundle.putString("current_action", paramString);
    getAppEventsLogger().logEventImplicitly("fb_like_control_error", null, paramBundle);
  }
  
  private void logAppEventForError(String paramString, FacebookRequestError paramFacebookRequestError)
  {
    Bundle localBundle = new Bundle();
    if (paramFacebookRequestError != null)
    {
      paramFacebookRequestError = paramFacebookRequestError.getRequestResult();
      if (paramFacebookRequestError != null) {
        localBundle.putString("error", paramFacebookRequestError.toString());
      }
    }
    logAppEventForError(paramString, localBundle);
  }
  
  private void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ShareInternalUtility.handleActivityResult(paramInt1, paramInt2, paramIntent, getResultProcessor(facebookDialogAnalyticsBundle));
    clearState();
  }
  
  private static void performFirstInitialize()
  {
    try
    {
      boolean bool = isInitialized;
      if (bool) {
        return;
      }
      Object localObject1 = new android/os/Handler;
      ((Handler)localObject1).<init>(Looper.getMainLooper());
      handler = (Handler)localObject1;
      objectSuffix = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
      FileLruCache localFileLruCache = new com/facebook/internal/FileLruCache;
      String str = TAG;
      localObject1 = new com/facebook/internal/FileLruCache$Limits;
      ((FileLruCache.Limits)localObject1).<init>();
      localFileLruCache.<init>(str, (FileLruCache.Limits)localObject1);
      controllerDiskCache = localFileLruCache;
      registerAccessTokenTracker();
      int i = CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
      localObject1 = new com/facebook/share/internal/LikeActionController$3;
      ((3)localObject1).<init>();
      CallbackManagerImpl.registerStaticCallback(i, (CallbackManagerImpl.Callback)localObject1);
      isInitialized = true;
      return;
    }
    finally {}
  }
  
  private void presentLikeDialog(Activity paramActivity, FragmentWrapper paramFragmentWrapper, Bundle paramBundle)
  {
    boolean bool = LikeDialog.canShowNativeDialog();
    Object localObject = null;
    if (bool)
    {
      localObject = "fb_like_control_did_present_dialog";
    }
    else if (LikeDialog.canShowWebFallback())
    {
      localObject = "fb_like_control_did_present_fallback_dialog";
    }
    else
    {
      logAppEventForError("present_dialog", paramBundle);
      Utility.logd(TAG, "Cannot show the Like Dialog on this device.");
      broadcastAction(null, "com.facebook.sdk.LikeActionController.UPDATED");
    }
    if (localObject != null)
    {
      localObject = objectType;
      if (localObject != null) {
        localObject = ((LikeView.ObjectType)localObject).toString();
      } else {
        localObject = LikeView.ObjectType.UNKNOWN.toString();
      }
      localObject = new LikeContent.Builder().setObjectId(objectId).setObjectType((String)localObject).build();
      if (paramFragmentWrapper != null) {
        new LikeDialog(paramFragmentWrapper).show((LikeContent)localObject);
      } else {
        new LikeDialog(paramActivity).show((LikeContent)localObject);
      }
      saveState(paramBundle);
      getAppEventsLogger().logEventImplicitly("fb_like_control_did_present_dialog", paramBundle);
    }
  }
  
  private void publishAgainIfNeeded(Bundle paramBundle)
  {
    boolean bool = isObjectLiked;
    if ((bool != isObjectLikedOnServer) && (!publishLikeOrUnlikeAsync(bool, paramBundle))) {
      publishDidError(isObjectLiked ^ true);
    }
  }
  
  private void publishDidError(boolean paramBoolean)
  {
    updateLikeState(paramBoolean);
    broadcastAction(this, "com.facebook.sdk.LikeActionController.DID_ERROR", z2.d("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action"));
  }
  
  private void publishLikeAsync(final Bundle paramBundle)
  {
    isPendingLikeOrUnlike = true;
    fetchVerifiedObjectId(new RequestCompletionCallback()
    {
      public void onComplete()
      {
        if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
        {
          localObject1 = z2.d("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
          LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", (Bundle)localObject1);
          return;
        }
        Object localObject1 = new GraphRequestBatch();
        final Object localObject2 = LikeActionController.this;
        localObject2 = new LikeActionController.PublishLikeRequestWrapper((LikeActionController)localObject2, LikeActionController.access$1600((LikeActionController)localObject2), LikeActionController.access$1700(LikeActionController.this));
        ((LikeActionController.AbstractRequestWrapper)localObject2).addToBatch((GraphRequestBatch)localObject1);
        ((GraphRequestBatch)localObject1).addCallback(new GraphRequestBatch.Callback()
        {
          public void onBatchCompleted(GraphRequestBatch paramAnonymous2GraphRequestBatch)
          {
            LikeActionController.access$1802(LikeActionController.this, false);
            if (localObject2.getError() != null)
            {
              LikeActionController.access$1900(LikeActionController.this, false);
            }
            else
            {
              LikeActionController.access$1102(LikeActionController.this, Utility.coerceValueIfNullOrEmpty(localObject2unlikeToken, null));
              LikeActionController.access$2002(LikeActionController.this, true);
              LikeActionController.access$1200(LikeActionController.this).logEventImplicitly("fb_like_control_did_like", null, val$analyticsParameters);
              paramAnonymous2GraphRequestBatch = LikeActionController.7.this;
              LikeActionController.access$2100(this$0, val$analyticsParameters);
            }
          }
        });
        ((GraphRequestBatch)localObject1).executeAsync();
      }
    });
  }
  
  private boolean publishLikeOrUnlikeAsync(boolean paramBoolean, Bundle paramBundle)
  {
    boolean bool1 = canUseOGPublish();
    boolean bool2 = true;
    if (bool1)
    {
      if (paramBoolean)
      {
        publishLikeAsync(paramBundle);
        return bool2;
      }
      if (!Utility.isNullOrEmpty(unlikeToken))
      {
        publishUnlikeAsync(paramBundle);
        return bool2;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  private void publishUnlikeAsync(final Bundle paramBundle)
  {
    isPendingLikeOrUnlike = true;
    GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch();
    final PublishUnlikeRequestWrapper localPublishUnlikeRequestWrapper = new PublishUnlikeRequestWrapper(unlikeToken);
    localPublishUnlikeRequestWrapper.addToBatch(localGraphRequestBatch);
    localGraphRequestBatch.addCallback(new GraphRequestBatch.Callback()
    {
      public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
      {
        LikeActionController.access$1802(LikeActionController.this, false);
        if (localPublishUnlikeRequestWrapper.getError() != null)
        {
          LikeActionController.access$1900(LikeActionController.this, true);
        }
        else
        {
          LikeActionController.access$1102(LikeActionController.this, null);
          LikeActionController.access$2002(LikeActionController.this, false);
          LikeActionController.access$1200(LikeActionController.this).logEventImplicitly("fb_like_control_did_unlike", null, paramBundle);
          LikeActionController.access$2100(LikeActionController.this, paramBundle);
        }
      }
    });
    localGraphRequestBatch.executeAsync();
  }
  
  private static void putControllerInMemoryCache(String paramString, LikeActionController paramLikeActionController)
  {
    paramString = getCacheKeyForObjectId(paramString);
    mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(paramString, true));
    cache.put(paramString, paramLikeActionController);
  }
  
  private void refreshStatusAsync()
  {
    if (!AccessToken.isCurrentAccessTokenActive())
    {
      refreshStatusViaService();
      return;
    }
    fetchVerifiedObjectId(new RequestCompletionCallback()
    {
      public void onComplete()
      {
        final Object localObject1;
        if (LikeActionController.12.$SwitchMap$com$facebook$share$widget$LikeView$ObjectType[LikeActionController.access$1700(LikeActionController.this).ordinal()] != 1)
        {
          localObject1 = LikeActionController.this;
          localObject1 = new LikeActionController.GetOGObjectLikesRequestWrapper((LikeActionController)localObject1, LikeActionController.access$1600((LikeActionController)localObject1), LikeActionController.access$1700(LikeActionController.this));
        }
        else
        {
          localObject1 = LikeActionController.this;
          localObject1 = new LikeActionController.GetPageLikesRequestWrapper((LikeActionController)localObject1, LikeActionController.access$1600((LikeActionController)localObject1));
        }
        Object localObject2 = LikeActionController.this;
        final LikeActionController.GetEngagementRequestWrapper localGetEngagementRequestWrapper = new LikeActionController.GetEngagementRequestWrapper((LikeActionController)localObject2, LikeActionController.access$1600((LikeActionController)localObject2), LikeActionController.access$1700(LikeActionController.this));
        localObject2 = new GraphRequestBatch();
        ((LikeActionController.RequestWrapper)localObject1).addToBatch((GraphRequestBatch)localObject2);
        localGetEngagementRequestWrapper.addToBatch((GraphRequestBatch)localObject2);
        ((GraphRequestBatch)localObject2).addCallback(new GraphRequestBatch.Callback()
        {
          public void onBatchCompleted(GraphRequestBatch paramAnonymous2GraphRequestBatch)
          {
            if ((localObject1.getError() == null) && (localGetEngagementRequestWrapper.getError() == null))
            {
              LikeActionController localLikeActionController = LikeActionController.this;
              boolean bool = localObject1.isObjectLiked();
              paramAnonymous2GraphRequestBatch = localGetEngagementRequestWrapper;
              LikeActionController.access$1300(localLikeActionController, bool, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceStringWithLike, socialSentenceStringWithoutLike, localObject1.getUnlikeToken());
              return;
            }
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Unable to refresh like state for id: '%s'", new Object[] { LikeActionController.access$2200(LikeActionController.this) });
          }
        });
        ((GraphRequestBatch)localObject2).executeAsync();
      }
    });
  }
  
  private void refreshStatusViaService()
  {
    LikeStatusClient localLikeStatusClient = new LikeStatusClient(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId(), objectId);
    if (!localLikeStatusClient.start()) {
      return;
    }
    localLikeStatusClient.setCompletedListener(new PlatformServiceClient.CompletedListener()
    {
      public void completed(Bundle paramAnonymousBundle)
      {
        if ((paramAnonymousBundle != null) && (paramAnonymousBundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")))
        {
          boolean bool = paramAnonymousBundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
          String str1;
          if (paramAnonymousBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
            str1 = paramAnonymousBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
          } else {
            str1 = LikeActionController.access$700(LikeActionController.this);
          }
          String str2;
          if (paramAnonymousBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
            str2 = paramAnonymousBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
          } else {
            str2 = LikeActionController.access$800(LikeActionController.this);
          }
          String str3;
          if (paramAnonymousBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
            str3 = paramAnonymousBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
          } else {
            str3 = LikeActionController.access$900(LikeActionController.this);
          }
          String str4;
          if (paramAnonymousBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
            str4 = paramAnonymousBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
          } else {
            str4 = LikeActionController.access$1000(LikeActionController.this);
          }
          if (paramAnonymousBundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
            paramAnonymousBundle = paramAnonymousBundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
          } else {
            paramAnonymousBundle = LikeActionController.access$1100(LikeActionController.this);
          }
          LikeActionController.access$1300(LikeActionController.this, bool, str1, str2, str3, str4, paramAnonymousBundle);
        }
      }
    });
  }
  
  private static void registerAccessTokenTracker()
  {
    accessTokenTracker = new AccessTokenTracker()
    {
      public void onCurrentAccessTokenChanged(AccessToken paramAnonymousAccessToken1, AccessToken paramAnonymousAccessToken2)
      {
        paramAnonymousAccessToken1 = FacebookSdk.getApplicationContext();
        if (paramAnonymousAccessToken2 == null)
        {
          LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
          paramAnonymousAccessToken1.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
          LikeActionController.access$400().clear();
          LikeActionController.access$500().clearCache();
        }
        LikeActionController.access$600(null, "com.facebook.sdk.LikeActionController.DID_RESET");
      }
    };
  }
  
  private void saveState(Bundle paramBundle)
  {
    storeObjectIdForPendingController(objectId);
    facebookDialogAnalyticsBundle = paramBundle;
    serializeToDiskAsync(this);
  }
  
  private static void serializeToDiskAsync(LikeActionController paramLikeActionController)
  {
    String str = serializeToJson(paramLikeActionController);
    paramLikeActionController = getCacheKeyForObjectId(objectId);
    if ((!Utility.isNullOrEmpty(str)) && (!Utility.isNullOrEmpty(paramLikeActionController))) {
      diskIOWorkQueue.addActiveWorkItem(new SerializeToDiskWorkItem(paramLikeActionController, str));
    }
  }
  
  /* Error */
  private static void serializeToDiskSynchronously(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: getstatic 324	com/facebook/share/internal/LikeActionController:controllerDiskCache	Lcom/facebook/internal/FileLruCache;
    //   7: aload_0
    //   8: invokevirtual 814	com/facebook/internal/FileLruCache:openPutStream	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   11: astore_0
    //   12: aload_0
    //   13: astore_3
    //   14: aload_0
    //   15: astore_2
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 818	java/lang/String:getBytes	()[B
    //   21: invokevirtual 824	java/io/OutputStream:write	([B)V
    //   24: aload_0
    //   25: invokestatic 465	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   28: goto +30 -> 58
    //   31: astore_0
    //   32: goto +27 -> 59
    //   35: astore_0
    //   36: aload_2
    //   37: astore_3
    //   38: getstatic 228	com/facebook/share/internal/LikeActionController:TAG	Ljava/lang/String;
    //   41: ldc_w 826
    //   44: aload_0
    //   45: invokestatic 473	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   48: pop
    //   49: aload_2
    //   50: ifnull +8 -> 58
    //   53: aload_2
    //   54: astore_0
    //   55: goto -31 -> 24
    //   58: return
    //   59: aload_3
    //   60: ifnull +7 -> 67
    //   63: aload_3
    //   64: invokestatic 465	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   67: aload_0
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	paramString1	String
    //   0	69	1	paramString2	String
    //   1	53	2	str1	String
    //   3	61	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	12	31	finally
    //   16	24	31	finally
    //   38	49	31	finally
    //   4	12	35	java/io/IOException
    //   16	24	35	java/io/IOException
  }
  
  private static String serializeToJson(LikeActionController paramLikeActionController)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
      localJSONObject.put("object_id", objectId);
      localJSONObject.put("object_type", objectType.getValue());
      localJSONObject.put("like_count_string_with_like", likeCountStringWithLike);
      localJSONObject.put("like_count_string_without_like", likeCountStringWithoutLike);
      localJSONObject.put("social_sentence_with_like", socialSentenceWithLike);
      localJSONObject.put("social_sentence_without_like", socialSentenceWithoutLike);
      localJSONObject.put("is_object_liked", isObjectLiked);
      localJSONObject.put("unlike_token", unlikeToken);
      paramLikeActionController = facebookDialogAnalyticsBundle;
      if (paramLikeActionController != null)
      {
        paramLikeActionController = BundleJSONConverter.convertToJSON(paramLikeActionController);
        if (paramLikeActionController != null) {
          localJSONObject.put("facebook_dialog_analytics_bundle", paramLikeActionController);
        }
      }
      return localJSONObject.toString();
    }
    catch (JSONException paramLikeActionController)
    {
      Log.e(TAG, "Unable to serialize controller to JSON", paramLikeActionController);
    }
    return null;
  }
  
  private static void storeObjectIdForPendingController(String paramString)
  {
    objectIdForPendingController = paramString;
    FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
  }
  
  private void updateLikeState(boolean paramBoolean)
  {
    updateState(paramBoolean, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceWithLike, socialSentenceWithoutLike, unlikeToken);
  }
  
  private void updateState(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    paramString1 = Utility.coerceValueIfNullOrEmpty(paramString1, null);
    paramString2 = Utility.coerceValueIfNullOrEmpty(paramString2, null);
    paramString3 = Utility.coerceValueIfNullOrEmpty(paramString3, null);
    paramString4 = Utility.coerceValueIfNullOrEmpty(paramString4, null);
    paramString5 = Utility.coerceValueIfNullOrEmpty(paramString5, null);
    int i;
    if ((paramBoolean == isObjectLiked) && (Utility.areObjectsEqual(paramString1, likeCountStringWithLike)) && (Utility.areObjectsEqual(paramString2, likeCountStringWithoutLike)) && (Utility.areObjectsEqual(paramString3, socialSentenceWithLike)) && (Utility.areObjectsEqual(paramString4, socialSentenceWithoutLike)) && (Utility.areObjectsEqual(paramString5, unlikeToken))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0) {
      return;
    }
    isObjectLiked = paramBoolean;
    likeCountStringWithLike = paramString1;
    likeCountStringWithoutLike = paramString2;
    socialSentenceWithLike = paramString3;
    socialSentenceWithoutLike = paramString4;
    unlikeToken = paramString5;
    serializeToDiskAsync(this);
    broadcastAction(this, "com.facebook.sdk.LikeActionController.UPDATED");
  }
  
  private static void verifyControllerAndInvokeCallback(LikeActionController paramLikeActionController, LikeView.ObjectType paramObjectType, CreationCallback paramCreationCallback)
  {
    LikeView.ObjectType localObjectType = ShareInternalUtility.getMostSpecificObjectType(paramObjectType, objectType);
    Object localObject = null;
    if (localObjectType == null)
    {
      paramLikeActionController = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", new Object[] { objectId, objectType.toString(), paramObjectType.toString() });
      paramObjectType = null;
    }
    else
    {
      objectType = localObjectType;
      paramObjectType = paramLikeActionController;
      paramLikeActionController = (LikeActionController)localObject;
    }
    invokeCallbackWithController(paramCreationCallback, paramObjectType, paramLikeActionController);
  }
  
  @Deprecated
  public String getLikeCountString()
  {
    String str;
    if (isObjectLiked) {
      str = likeCountStringWithLike;
    } else {
      str = likeCountStringWithoutLike;
    }
    return str;
  }
  
  @Deprecated
  public String getObjectId()
  {
    return objectId;
  }
  
  @Deprecated
  public String getSocialSentence()
  {
    String str;
    if (isObjectLiked) {
      str = socialSentenceWithLike;
    } else {
      str = socialSentenceWithoutLike;
    }
    return str;
  }
  
  @Deprecated
  public boolean isObjectLiked()
  {
    return isObjectLiked;
  }
  
  @Deprecated
  public boolean shouldEnableView()
  {
    return false;
  }
  
  @Deprecated
  public void toggleLike(Activity paramActivity, FragmentWrapper paramFragmentWrapper, Bundle paramBundle)
  {
    boolean bool = isObjectLiked ^ true;
    if (canUseOGPublish())
    {
      updateLikeState(bool);
      if (isPendingLikeOrUnlike)
      {
        getAppEventsLogger().logEventImplicitly("fb_like_control_did_undo_quickly", paramBundle);
      }
      else if (!publishLikeOrUnlikeAsync(bool, paramBundle))
      {
        updateLikeState(bool ^ true);
        presentLikeDialog(paramActivity, paramFragmentWrapper, paramBundle);
      }
    }
    else
    {
      presentLikeDialog(paramActivity, paramFragmentWrapper, paramBundle);
    }
  }
  
  public abstract class AbstractRequestWrapper
    implements LikeActionController.RequestWrapper
  {
    public FacebookRequestError error;
    public String objectId;
    public LikeView.ObjectType objectType;
    private GraphRequest request;
    
    public AbstractRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      objectId = paramString;
      objectType = paramObjectType;
    }
    
    public void addToBatch(GraphRequestBatch paramGraphRequestBatch)
    {
      paramGraphRequestBatch.add(request);
    }
    
    public FacebookRequestError getError()
    {
      return error;
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error running request for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
    }
    
    public abstract void processSuccess(GraphResponse paramGraphResponse);
    
    public void setRequest(GraphRequest paramGraphRequest)
    {
      request = paramGraphRequest;
      paramGraphRequest.setVersion(FacebookSdk.getGraphApiVersion());
      paramGraphRequest.setCallback(new GraphRequest.Callback()
      {
        public void onCompleted(GraphResponse paramAnonymousGraphResponse)
        {
          error = paramAnonymousGraphResponse.getError();
          LikeActionController.AbstractRequestWrapper localAbstractRequestWrapper = LikeActionController.AbstractRequestWrapper.this;
          FacebookRequestError localFacebookRequestError = error;
          if (localFacebookRequestError != null) {
            localAbstractRequestWrapper.processError(localFacebookRequestError);
          } else {
            localAbstractRequestWrapper.processSuccess(paramAnonymousGraphResponse);
          }
        }
      });
    }
  }
  
  public static class CreateLikeActionControllerWorkItem
    implements Runnable
  {
    private LikeActionController.CreationCallback callback;
    private String objectId;
    private LikeView.ObjectType objectType;
    
    public CreateLikeActionControllerWorkItem(String paramString, LikeView.ObjectType paramObjectType, LikeActionController.CreationCallback paramCreationCallback)
    {
      objectId = paramString;
      objectType = paramObjectType;
      callback = paramCreationCallback;
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        LikeActionController.access$2700(objectId, objectType, callback);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
  
  @Deprecated
  public static abstract interface CreationCallback
  {
    public abstract void onComplete(LikeActionController paramLikeActionController, FacebookException paramFacebookException);
  }
  
  public class GetEngagementRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
  {
    public String likeCountStringWithLike = LikeActionController.access$700(LikeActionController.this);
    public String likeCountStringWithoutLike = LikeActionController.access$800(LikeActionController.this);
    public String socialSentenceStringWithLike = LikeActionController.access$900(LikeActionController.this);
    public String socialSentenceStringWithoutLike = LikeActionController.access$1000(LikeActionController.this);
    
    public GetEngagementRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      super(paramString, paramObjectType);
      this$1 = z2.d("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
      putString("locale", Locale.getDefault().toString());
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), paramString, LikeActionController.this, HttpMethod.GET));
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
      LikeActionController.access$2400(LikeActionController.this, "get_engagement", paramFacebookRequestError);
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      paramGraphResponse = Utility.tryGetJSONObjectFromResponse(paramGraphResponse.getJSONObject(), "engagement");
      if (paramGraphResponse != null)
      {
        likeCountStringWithLike = paramGraphResponse.optString("count_string_with_like", likeCountStringWithLike);
        likeCountStringWithoutLike = paramGraphResponse.optString("count_string_without_like", likeCountStringWithoutLike);
        socialSentenceStringWithLike = paramGraphResponse.optString("social_sentence_with_like", socialSentenceStringWithLike);
        socialSentenceStringWithoutLike = paramGraphResponse.optString("social_sentence_without_like", socialSentenceStringWithoutLike);
      }
    }
  }
  
  public class GetOGObjectIdRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
  {
    public String verifiedObjectId;
    
    public GetOGObjectIdRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      super(paramString, paramObjectType);
      this$1 = new Bundle();
      putString("fields", "og_object.fields(id)");
      putString("ids", paramString);
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      if (paramFacebookRequestError.getErrorMessage().contains("og_object")) {
        error = null;
      } else {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
      }
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      paramGraphResponse = Utility.tryGetJSONObjectFromResponse(paramGraphResponse.getJSONObject(), objectId);
      if (paramGraphResponse != null)
      {
        paramGraphResponse = paramGraphResponse.optJSONObject("og_object");
        if (paramGraphResponse != null) {
          verifiedObjectId = paramGraphResponse.optString("id");
        }
      }
    }
  }
  
  public class GetOGObjectLikesRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
    implements LikeActionController.LikeRequestWrapper
  {
    private final String objectId;
    private boolean objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
    private final LikeView.ObjectType objectType;
    private String unlikeToken;
    
    public GetOGObjectLikesRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      super(paramString, paramObjectType);
      objectId = paramString;
      objectType = paramObjectType;
      this$1 = new Bundle();
      putString("fields", "id,application");
      putString("object", paramString);
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.GET));
    }
    
    public String getUnlikeToken()
    {
      return unlikeToken;
    }
    
    public boolean isObjectLiked()
    {
      return objectIsLiked;
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
      LikeActionController.access$2400(LikeActionController.this, "get_og_object_like", paramFacebookRequestError);
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      paramGraphResponse = Utility.tryGetJSONArrayFromResponse(paramGraphResponse.getJSONObject(), "data");
      if (paramGraphResponse != null) {
        for (int i = 0; i < paramGraphResponse.length(); i++)
        {
          JSONObject localJSONObject1 = paramGraphResponse.optJSONObject(i);
          if (localJSONObject1 != null)
          {
            objectIsLiked = true;
            JSONObject localJSONObject2 = localJSONObject1.optJSONObject("application");
            AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
            if ((localJSONObject2 != null) && (AccessToken.isCurrentAccessTokenActive()) && (Utility.areObjectsEqual(localAccessToken.getApplicationId(), localJSONObject2.optString("id")))) {
              unlikeToken = localJSONObject1.optString("id");
            }
          }
        }
      }
    }
  }
  
  public class GetPageIdRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
  {
    public boolean objectIsPage;
    public String verifiedObjectId;
    
    public GetPageIdRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      super(paramString, paramObjectType);
      this$1 = new Bundle();
      putString("fields", "id");
      putString("ids", paramString);
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      paramGraphResponse = Utility.tryGetJSONObjectFromResponse(paramGraphResponse.getJSONObject(), objectId);
      if (paramGraphResponse != null)
      {
        paramGraphResponse = paramGraphResponse.optString("id");
        verifiedObjectId = paramGraphResponse;
        objectIsPage = (Utility.isNullOrEmpty(paramGraphResponse) ^ true);
      }
    }
  }
  
  public class GetPageLikesRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
    implements LikeActionController.LikeRequestWrapper
  {
    private boolean objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
    private String pageId;
    
    public GetPageLikesRequestWrapper(String paramString)
    {
      super(paramString, LikeView.ObjectType.PAGE);
      pageId = paramString;
      this$1 = z2.d("fields", "id");
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), z2.o("me/likes/", paramString), LikeActionController.this, HttpMethod.GET));
    }
    
    public String getUnlikeToken()
    {
      return null;
    }
    
    public boolean isObjectLiked()
    {
      return objectIsLiked;
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for page id '%s': %s", new Object[] { pageId, paramFacebookRequestError });
      LikeActionController.access$2400(LikeActionController.this, "get_page_like", paramFacebookRequestError);
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      paramGraphResponse = Utility.tryGetJSONArrayFromResponse(paramGraphResponse.getJSONObject(), "data");
      if ((paramGraphResponse != null) && (paramGraphResponse.length() > 0)) {
        objectIsLiked = true;
      }
    }
  }
  
  public static abstract interface LikeRequestWrapper
    extends LikeActionController.RequestWrapper
  {
    public abstract String getUnlikeToken();
    
    public abstract boolean isObjectLiked();
  }
  
  public static class MRUCacheWorkItem
    implements Runnable
  {
    private static ArrayList<String> mruCachedItems = new ArrayList();
    private String cacheItem;
    private boolean shouldTrim;
    
    public MRUCacheWorkItem(String paramString, boolean paramBoolean)
    {
      cacheItem = paramString;
      shouldTrim = paramBoolean;
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        Object localObject = cacheItem;
        if (localObject != null)
        {
          mruCachedItems.remove(localObject);
          mruCachedItems.add(0, cacheItem);
        }
        if ((shouldTrim) && (mruCachedItems.size() >= 128)) {
          while (64 < mruCachedItems.size())
          {
            localObject = mruCachedItems;
            localObject = (String)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
            LikeActionController.access$400().remove(localObject);
          }
        }
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
  
  public class PublishLikeRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
  {
    public String unlikeToken;
    
    public PublishLikeRequestWrapper(String paramString, LikeView.ObjectType paramObjectType)
    {
      super(paramString, paramObjectType);
      this$1 = z2.d("object", paramString);
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.POST));
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      if (paramFacebookRequestError.getErrorCode() == 3501)
      {
        error = null;
      }
      else
      {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error liking object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
        LikeActionController.access$2400(LikeActionController.this, "publish_like", paramFacebookRequestError);
      }
    }
    
    public void processSuccess(GraphResponse paramGraphResponse)
    {
      unlikeToken = Utility.safeGetStringFromResponse(paramGraphResponse.getJSONObject(), "id");
    }
  }
  
  public class PublishUnlikeRequestWrapper
    extends LikeActionController.AbstractRequestWrapper
  {
    private String unlikeToken;
    
    public PublishUnlikeRequestWrapper(String paramString)
    {
      super(null, null);
      unlikeToken = paramString;
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), paramString, null, HttpMethod.DELETE));
    }
    
    public void processError(FacebookRequestError paramFacebookRequestError)
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error unliking object with unlike token '%s' : %s", new Object[] { unlikeToken, paramFacebookRequestError });
      LikeActionController.access$2400(LikeActionController.this, "publish_unlike", paramFacebookRequestError);
    }
    
    public void processSuccess(GraphResponse paramGraphResponse) {}
  }
  
  public static abstract interface RequestCompletionCallback
  {
    public abstract void onComplete();
  }
  
  public static abstract interface RequestWrapper
  {
    public abstract void addToBatch(GraphRequestBatch paramGraphRequestBatch);
    
    public abstract FacebookRequestError getError();
  }
  
  public static class SerializeToDiskWorkItem
    implements Runnable
  {
    private String cacheKey;
    private String controllerJson;
    
    public SerializeToDiskWorkItem(String paramString1, String paramString2)
    {
      cacheKey = paramString1;
      controllerJson = paramString2;
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        LikeActionController.access$2600(cacheKey, controllerJson);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */