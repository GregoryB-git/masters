package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import z2;

public final class AccessTokenManager
{
  public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
  public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
  public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
  private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
  public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
  public static final String TAG = "AccessTokenManager";
  private static final String TOKEN_EXTEND_GRAPH_PATH = "oauth/access_token";
  private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
  private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
  private static volatile AccessTokenManager instance;
  private final AccessTokenCache accessTokenCache;
  private AccessToken currentAccessToken;
  private Date lastAttemptedTokenExtendDate = new Date(0L);
  private final LocalBroadcastManager localBroadcastManager;
  private AtomicBoolean tokenRefreshInProgress = new AtomicBoolean(false);
  
  public AccessTokenManager(LocalBroadcastManager paramLocalBroadcastManager, AccessTokenCache paramAccessTokenCache)
  {
    Validate.notNull(paramLocalBroadcastManager, "localBroadcastManager");
    Validate.notNull(paramAccessTokenCache, "accessTokenCache");
    localBroadcastManager = paramLocalBroadcastManager;
    accessTokenCache = paramAccessTokenCache;
  }
  
  private static GraphRequest createExtendAccessTokenRequest(AccessToken paramAccessToken, GraphRequest.Callback paramCallback)
  {
    Bundle localBundle = z2.d("grant_type", "fb_extend_sso_token");
    localBundle.putString("client_id", paramAccessToken.getApplicationId());
    return new GraphRequest(paramAccessToken, "oauth/access_token", localBundle, HttpMethod.GET, paramCallback);
  }
  
  private static GraphRequest createGrantedPermissionsRequest(AccessToken paramAccessToken, GraphRequest.Callback paramCallback)
  {
    return new GraphRequest(paramAccessToken, "me/permissions", new Bundle(), HttpMethod.GET, paramCallback);
  }
  
  public static AccessTokenManager getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null)
        {
          LocalBroadcastManager localLocalBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
          AccessTokenCache localAccessTokenCache = new com/facebook/AccessTokenCache;
          localAccessTokenCache.<init>();
          AccessTokenManager localAccessTokenManager = new com/facebook/AccessTokenManager;
          localAccessTokenManager.<init>(localLocalBroadcastManager, localAccessTokenCache);
          instance = localAccessTokenManager;
        }
      }
      finally {}
    }
    return instance;
  }
  
  private void refreshCurrentAccessTokenImpl(final AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
    final AccessToken localAccessToken = currentAccessToken;
    if (localAccessToken == null)
    {
      if (paramAccessTokenRefreshCallback != null) {
        paramAccessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
      }
      return;
    }
    if (!tokenRefreshInProgress.compareAndSet(false, true))
    {
      if (paramAccessTokenRefreshCallback != null) {
        paramAccessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
      }
      return;
    }
    lastAttemptedTokenExtendDate = new Date();
    final HashSet localHashSet1 = new HashSet();
    final HashSet localHashSet2 = new HashSet();
    final HashSet localHashSet3 = new HashSet();
    final AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    final RefreshResult localRefreshResult = new RefreshResult(null);
    GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch(new GraphRequest[] { createGrantedPermissionsRequest(localAccessToken, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
        if (paramAnonymousGraphResponse == null) {
          return;
        }
        JSONArray localJSONArray = paramAnonymousGraphResponse.optJSONArray("data");
        if (localJSONArray == null) {
          return;
        }
        localAtomicBoolean.set(true);
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          Object localObject = localJSONArray.optJSONObject(i);
          if (localObject != null)
          {
            paramAnonymousGraphResponse = ((JSONObject)localObject).optString("permission");
            localObject = ((JSONObject)localObject).optString("status");
            if ((!Utility.isNullOrEmpty(paramAnonymousGraphResponse)) && (!Utility.isNullOrEmpty((String)localObject)))
            {
              localObject = ((String)localObject).toLowerCase(Locale.US);
              if (((String)localObject).equals("granted")) {
                localHashSet1.add(paramAnonymousGraphResponse);
              } else if (((String)localObject).equals("declined")) {
                localHashSet2.add(paramAnonymousGraphResponse);
              } else if (((String)localObject).equals("expired")) {
                localHashSet3.add(paramAnonymousGraphResponse);
              } else {
                z2.A("Unexpected status: ", (String)localObject, "AccessTokenManager");
              }
            }
          }
        }
      }
    }), createExtendAccessTokenRequest(localAccessToken, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
        if (paramAnonymousGraphResponse == null) {
          return;
        }
        localRefreshResultaccessToken = paramAnonymousGraphResponse.optString("access_token");
        localRefreshResultexpiresAt = paramAnonymousGraphResponse.optInt("expires_at");
        localRefreshResultdataAccessExpirationTime = Long.valueOf(paramAnonymousGraphResponse.optLong("data_access_expiration_time"));
        localRefreshResultgraphDomain = paramAnonymousGraphResponse.optString("graph_domain", null);
      }
    }) });
    localGraphRequestBatch.addCallback(new GraphRequestBatch.Callback()
    {
      public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
      {
        try
        {
          if ((AccessTokenManager.getInstance().getCurrentAccessToken() != null) && (AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() == localAccessToken.getUserId()))
          {
            Object localObject1;
            if (!localAtomicBoolean.get())
            {
              paramAnonymousGraphRequestBatch = localRefreshResult;
              if ((accessToken == null) && (expiresAt == 0))
              {
                localObject1 = paramAccessTokenRefreshCallback;
                if (localObject1 != null)
                {
                  paramAnonymousGraphRequestBatch = new com/facebook/FacebookException;
                  paramAnonymousGraphRequestBatch.<init>("Failed to refresh access token");
                  ((AccessToken.AccessTokenRefreshCallback)localObject1).OnTokenRefreshFailed(paramAnonymousGraphRequestBatch);
                }
                AccessTokenManager.access$200(AccessTokenManager.this).set(false);
                return;
              }
            }
            paramAnonymousGraphRequestBatch = localRefreshResultaccessToken;
            if (paramAnonymousGraphRequestBatch == null) {
              paramAnonymousGraphRequestBatch = localAccessToken.getToken();
            }
            String str1 = localAccessToken.getApplicationId();
            String str2 = localAccessToken.getUserId();
            if (localAtomicBoolean.get()) {
              localObject1 = localHashSet1;
            } else {
              localObject1 = localAccessToken.getPermissions();
            }
            if (localAtomicBoolean.get()) {
              localObject4 = localHashSet2;
            } else {
              localObject4 = localAccessToken.getDeclinedPermissions();
            }
            Set localSet;
            if (localAtomicBoolean.get()) {
              localSet = localHashSet3;
            } else {
              localSet = localAccessToken.getExpiredPermissions();
            }
            AccessTokenSource localAccessTokenSource = localAccessToken.getSource();
            Date localDate1;
            if (localRefreshResultexpiresAt != 0)
            {
              localDate1 = new java/util/Date;
              localDate1.<init>(localRefreshResultexpiresAt * 1000L);
            }
            else
            {
              localDate1 = localAccessToken.getExpires();
            }
            Date localDate2 = new java/util/Date;
            localDate2.<init>();
            Date localDate3;
            if (localRefreshResultdataAccessExpirationTime != null)
            {
              localDate3 = new java/util/Date;
              localDate3.<init>(1000L * localRefreshResultdataAccessExpirationTime.longValue());
            }
            else
            {
              localDate3 = localAccessToken.getDataAccessExpirationTime();
            }
            paramAnonymousGraphRequestBatch = new AccessToken(paramAnonymousGraphRequestBatch, str1, str2, (Collection)localObject1, (Collection)localObject4, localSet, localAccessTokenSource, localDate1, localDate2, localDate3, localRefreshResultgraphDomain);
            try
            {
              AccessTokenManager.getInstance().setCurrentAccessToken(paramAnonymousGraphRequestBatch);
              AccessTokenManager.access$200(AccessTokenManager.this).set(false);
              localObject1 = paramAccessTokenRefreshCallback;
              if (localObject1 != null) {
                ((AccessToken.AccessTokenRefreshCallback)localObject1).OnTokenRefreshed(paramAnonymousGraphRequestBatch);
              }
              return;
            }
            finally
            {
              break label441;
            }
          }
          AccessToken.AccessTokenRefreshCallback localAccessTokenRefreshCallback = paramAccessTokenRefreshCallback;
          if (localAccessTokenRefreshCallback != null)
          {
            paramAnonymousGraphRequestBatch = new com/facebook/FacebookException;
            paramAnonymousGraphRequestBatch.<init>("No current access token to refresh");
            localAccessTokenRefreshCallback.OnTokenRefreshFailed(paramAnonymousGraphRequestBatch);
          }
          AccessTokenManager.access$200(AccessTokenManager.this).set(false);
          return;
        }
        finally
        {
          paramAnonymousGraphRequestBatch = null;
          label441:
          AccessTokenManager.access$200(AccessTokenManager.this).set(false);
          Object localObject4 = paramAccessTokenRefreshCallback;
          if ((localObject4 != null) && (paramAnonymousGraphRequestBatch != null)) {
            ((AccessToken.AccessTokenRefreshCallback)localObject4).OnTokenRefreshed(paramAnonymousGraphRequestBatch);
          }
        }
      }
    });
    localGraphRequestBatch.executeAsync();
  }
  
  private void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken paramAccessToken1, AccessToken paramAccessToken2)
  {
    Intent localIntent = new Intent(FacebookSdk.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
    localIntent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", paramAccessToken1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", paramAccessToken2);
    localBroadcastManager.sendBroadcast(localIntent);
  }
  
  private void setCurrentAccessToken(AccessToken paramAccessToken, boolean paramBoolean)
  {
    AccessToken localAccessToken = currentAccessToken;
    currentAccessToken = paramAccessToken;
    tokenRefreshInProgress.set(false);
    lastAttemptedTokenExtendDate = new Date(0L);
    if (paramBoolean) {
      if (paramAccessToken != null)
      {
        accessTokenCache.save(paramAccessToken);
      }
      else
      {
        accessTokenCache.clear();
        Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
      }
    }
    if (!Utility.areObjectsEqual(localAccessToken, paramAccessToken))
    {
      sendCurrentAccessTokenChangedBroadcastIntent(localAccessToken, paramAccessToken);
      setTokenExpirationBroadcastAlarm();
    }
  }
  
  private void setTokenExpirationBroadcastAlarm()
  {
    Context localContext = FacebookSdk.getApplicationContext();
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    AlarmManager localAlarmManager = (AlarmManager)localContext.getSystemService("alarm");
    Object localObject;
    if ((AccessToken.isCurrentAccessTokenActive()) && (localAccessToken.getExpires() != null) && (localAlarmManager != null))
    {
      localObject = new Intent(localContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
      ((Intent)localObject).setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
      localObject = PendingIntent.getBroadcast(localContext, 0, (Intent)localObject, 0);
    }
    try
    {
      localAlarmManager.set(1, localAccessToken.getExpires().getTime(), (PendingIntent)localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private boolean shouldExtendAccessToken()
  {
    Object localObject = currentAccessToken;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    localObject = Long.valueOf(new Date().getTime());
    boolean bool2 = bool1;
    if (currentAccessToken.getSource().canExtendToken())
    {
      bool2 = bool1;
      if (((Long)localObject).longValue() - lastAttemptedTokenExtendDate.getTime() > 3600000L)
      {
        bool2 = bool1;
        if (((Long)localObject).longValue() - currentAccessToken.getLastRefresh().getTime() > 86400000L) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public void currentAccessTokenChanged()
  {
    AccessToken localAccessToken = currentAccessToken;
    sendCurrentAccessTokenChangedBroadcastIntent(localAccessToken, localAccessToken);
  }
  
  public void extendAccessTokenIfNeeded()
  {
    if (!shouldExtendAccessToken()) {
      return;
    }
    refreshCurrentAccessToken(null);
  }
  
  public AccessToken getCurrentAccessToken()
  {
    return currentAccessToken;
  }
  
  public boolean loadCurrentAccessToken()
  {
    AccessToken localAccessToken = accessTokenCache.load();
    if (localAccessToken != null)
    {
      setCurrentAccessToken(localAccessToken, false);
      return true;
    }
    return false;
  }
  
  public void refreshCurrentAccessToken(final AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
    if (Looper.getMainLooper().equals(Looper.myLooper())) {
      refreshCurrentAccessTokenImpl(paramAccessTokenRefreshCallback);
    } else {
      new Handler(Looper.getMainLooper()).post(new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            AccessTokenManager.access$000(AccessTokenManager.this, paramAccessTokenRefreshCallback);
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      });
    }
  }
  
  public void setCurrentAccessToken(AccessToken paramAccessToken)
  {
    setCurrentAccessToken(paramAccessToken, true);
  }
  
  public static class RefreshResult
  {
    public String accessToken;
    public Long dataAccessExpirationTime;
    public int expiresAt;
    public String graphDomain;
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */