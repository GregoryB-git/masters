package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

class AccessTokenCache
{
  public static final String CACHED_ACCESS_TOKEN_KEY = "com.facebook.AccessTokenManager.CachedAccessToken";
  private final SharedPreferences sharedPreferences;
  private LegacyTokenHelper tokenCachingStrategy;
  private final SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory;
  
  public AccessTokenCache()
  {
    this(FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new SharedPreferencesTokenCachingStrategyFactory());
  }
  
  public AccessTokenCache(SharedPreferences paramSharedPreferences, SharedPreferencesTokenCachingStrategyFactory paramSharedPreferencesTokenCachingStrategyFactory)
  {
    sharedPreferences = paramSharedPreferences;
    tokenCachingStrategyFactory = paramSharedPreferencesTokenCachingStrategyFactory;
  }
  
  private AccessToken getCachedAccessToken()
  {
    Object localObject = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    if (localObject != null) {}
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      localObject = AccessToken.createFromJSONObject(localJSONObject);
      return (AccessToken)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private AccessToken getLegacyAccessToken()
  {
    Object localObject = getTokenCachingStrategy().load();
    if ((localObject != null) && (LegacyTokenHelper.hasTokenInformation((Bundle)localObject))) {
      localObject = AccessToken.createFromLegacyCache((Bundle)localObject);
    } else {
      localObject = null;
    }
    return (AccessToken)localObject;
  }
  
  private LegacyTokenHelper getTokenCachingStrategy()
  {
    if (tokenCachingStrategy == null) {
      try
      {
        if (tokenCachingStrategy == null) {
          tokenCachingStrategy = tokenCachingStrategyFactory.create();
        }
      }
      finally {}
    }
    return tokenCachingStrategy;
  }
  
  private boolean hasCachedAccessToken()
  {
    return sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
  }
  
  private boolean shouldCheckLegacyToken()
  {
    return FacebookSdk.isLegacyTokenUpgradeSupported();
  }
  
  public void clear()
  {
    sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    if (shouldCheckLegacyToken()) {
      getTokenCachingStrategy().clear();
    }
  }
  
  public AccessToken load()
  {
    Object localObject;
    if (hasCachedAccessToken())
    {
      localObject = getCachedAccessToken();
    }
    else if (shouldCheckLegacyToken())
    {
      AccessToken localAccessToken = getLegacyAccessToken();
      localObject = localAccessToken;
      if (localAccessToken != null)
      {
        save(localAccessToken);
        getTokenCachingStrategy().clear();
        localObject = localAccessToken;
      }
    }
    else
    {
      localObject = null;
    }
    return (AccessToken)localObject;
  }
  
  public void save(AccessToken paramAccessToken)
  {
    Validate.notNull(paramAccessToken, "accessToken");
    try
    {
      paramAccessToken = paramAccessToken.toJSONObject();
      sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", paramAccessToken.toString()).apply();
      return;
    }
    catch (JSONException paramAccessToken)
    {
      for (;;) {}
    }
  }
  
  public static class SharedPreferencesTokenCachingStrategyFactory
  {
    public LegacyTokenHelper create()
    {
      return new LegacyTokenHelper(FacebookSdk.getApplicationContext());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */