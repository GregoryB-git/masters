package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public final class AccessToken
  implements Parcelable
{
  public static final String ACCESS_TOKEN_KEY = "access_token";
  private static final String APPLICATION_ID_KEY = "application_id";
  public static final Parcelable.Creator<AccessToken> CREATOR = new Parcelable.Creator()
  {
    public AccessToken createFromParcel(Parcel paramAnonymousParcel)
    {
      return new AccessToken(paramAnonymousParcel);
    }
    
    public AccessToken[] newArray(int paramAnonymousInt)
    {
      return new AccessToken[paramAnonymousInt];
    }
  };
  private static final int CURRENT_JSON_FORMAT = 1;
  public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
  private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
  private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
  private static final Date DEFAULT_EXPIRATION_TIME;
  private static final Date DEFAULT_LAST_REFRESH_TIME;
  private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
  private static final String EXPIRES_AT_KEY = "expires_at";
  public static final String EXPIRES_IN_KEY = "expires_in";
  private static final String GRAPH_DOMAIN = "graph_domain";
  private static final String LAST_REFRESH_KEY = "last_refresh";
  private static final Date MAX_DATE;
  private static final String PERMISSIONS_KEY = "permissions";
  private static final String SOURCE_KEY = "source";
  private static final String TOKEN_KEY = "token";
  public static final String USER_ID_KEY = "user_id";
  private static final String VERSION_KEY = "version";
  private final String applicationId;
  private final Date dataAccessExpirationTime;
  private final Set<String> declinedPermissions;
  private final Set<String> expiredPermissions;
  private final Date expires;
  private final String graphDomain;
  private final Date lastRefresh;
  private final Set<String> permissions;
  private final AccessTokenSource source;
  private final String token;
  private final String userId;
  
  static
  {
    Date localDate = new Date(Long.MAX_VALUE);
    MAX_DATE = localDate;
    DEFAULT_EXPIRATION_TIME = localDate;
    DEFAULT_LAST_REFRESH_TIME = new Date();
    DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
  }
  
  public AccessToken(Parcel paramParcel)
  {
    expires = new Date(paramParcel.readLong());
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    permissions = Collections.unmodifiableSet(new HashSet(localArrayList));
    localArrayList.clear();
    paramParcel.readStringList(localArrayList);
    declinedPermissions = Collections.unmodifiableSet(new HashSet(localArrayList));
    localArrayList.clear();
    paramParcel.readStringList(localArrayList);
    expiredPermissions = Collections.unmodifiableSet(new HashSet(localArrayList));
    token = paramParcel.readString();
    source = AccessTokenSource.valueOf(paramParcel.readString());
    lastRefresh = new Date(paramParcel.readLong());
    applicationId = paramParcel.readString();
    userId = paramParcel.readString();
    dataAccessExpirationTime = new Date(paramParcel.readLong());
    graphDomain = paramParcel.readString();
  }
  
  public AccessToken(String paramString1, String paramString2, String paramString3, @Nullable Collection<String> paramCollection1, @Nullable Collection<String> paramCollection2, @Nullable Collection<String> paramCollection3, @Nullable AccessTokenSource paramAccessTokenSource, @Nullable Date paramDate1, @Nullable Date paramDate2, @Nullable Date paramDate3)
  {
    this(paramString1, paramString2, paramString3, paramCollection1, paramCollection2, paramCollection3, paramAccessTokenSource, paramDate1, paramDate2, paramDate3, null);
  }
  
  public AccessToken(String paramString1, String paramString2, String paramString3, @Nullable Collection<String> paramCollection1, @Nullable Collection<String> paramCollection2, @Nullable Collection<String> paramCollection3, @Nullable AccessTokenSource paramAccessTokenSource, @Nullable Date paramDate1, @Nullable Date paramDate2, @Nullable Date paramDate3, @Nullable String paramString4)
  {
    Validate.notNullOrEmpty(paramString1, "accessToken");
    Validate.notNullOrEmpty(paramString2, "applicationId");
    Validate.notNullOrEmpty(paramString3, "userId");
    if (paramDate1 == null) {
      paramDate1 = DEFAULT_EXPIRATION_TIME;
    }
    expires = paramDate1;
    paramDate1 = new java/util/HashSet;
    if (paramCollection1 != null) {
      paramDate1.<init>(paramCollection1);
    } else {
      paramDate1.<init>();
    }
    permissions = Collections.unmodifiableSet(paramDate1);
    paramCollection1 = new java/util/HashSet;
    if (paramCollection2 != null) {
      paramCollection1.<init>(paramCollection2);
    } else {
      paramCollection1.<init>();
    }
    declinedPermissions = Collections.unmodifiableSet(paramCollection1);
    paramCollection1 = new java/util/HashSet;
    if (paramCollection3 != null) {
      paramCollection1.<init>(paramCollection3);
    } else {
      paramCollection1.<init>();
    }
    expiredPermissions = Collections.unmodifiableSet(paramCollection1);
    token = paramString1;
    if (paramAccessTokenSource == null) {
      paramAccessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
    }
    source = paramAccessTokenSource;
    if (paramDate2 == null) {
      paramDate2 = DEFAULT_LAST_REFRESH_TIME;
    }
    lastRefresh = paramDate2;
    applicationId = paramString2;
    userId = paramString3;
    if ((paramDate3 == null) || (paramDate3.getTime() == 0L)) {
      paramDate3 = DEFAULT_EXPIRATION_TIME;
    }
    dataAccessExpirationTime = paramDate3;
    graphDomain = paramString4;
  }
  
  private void appendPermissions(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(" permissions:");
    if (permissions == null)
    {
      paramStringBuilder.append("null");
    }
    else
    {
      paramStringBuilder.append("[");
      paramStringBuilder.append(TextUtils.join(", ", permissions));
      paramStringBuilder.append("]");
    }
  }
  
  public static AccessToken createExpired(AccessToken paramAccessToken)
  {
    return new AccessToken(token, applicationId, paramAccessToken.getUserId(), paramAccessToken.getPermissions(), paramAccessToken.getDeclinedPermissions(), paramAccessToken.getExpiredPermissions(), source, new Date(), new Date(), dataAccessExpirationTime);
  }
  
  private static AccessToken createFromBundle(List<String> paramList, Bundle paramBundle, AccessTokenSource paramAccessTokenSource, Date paramDate, String paramString)
  {
    String str = paramBundle.getString("access_token");
    Date localDate = Utility.getBundleLongAsDate(paramBundle, "expires_in", paramDate);
    paramDate = paramBundle.getString("user_id");
    paramBundle = Utility.getBundleLongAsDate(paramBundle, "data_access_expiration_time", new Date(0L));
    if ((!Utility.isNullOrEmpty(str)) && (localDate != null)) {
      return new AccessToken(str, paramString, paramDate, paramList, null, null, paramAccessTokenSource, localDate, new Date(), paramBundle);
    }
    return null;
  }
  
  public static AccessToken createFromJSONObject(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject.getInt("version") <= 1)
    {
      String str1 = paramJSONObject.getString("token");
      Date localDate1 = new Date(paramJSONObject.getLong("expires_at"));
      Object localObject1 = paramJSONObject.getJSONArray("permissions");
      Object localObject2 = paramJSONObject.getJSONArray("declined_permissions");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("expired_permissions");
      Date localDate2 = new Date(paramJSONObject.getLong("last_refresh"));
      AccessTokenSource localAccessTokenSource = AccessTokenSource.valueOf(paramJSONObject.getString("source"));
      String str2 = paramJSONObject.getString("application_id");
      String str3 = paramJSONObject.getString("user_id");
      Date localDate3 = new Date(paramJSONObject.optLong("data_access_expiration_time", 0L));
      String str4 = paramJSONObject.optString("graph_domain", null);
      localObject1 = Utility.jsonArrayToStringList((JSONArray)localObject1);
      localObject2 = Utility.jsonArrayToStringList((JSONArray)localObject2);
      if (localJSONArray == null) {
        paramJSONObject = new ArrayList();
      } else {
        paramJSONObject = Utility.jsonArrayToStringList(localJSONArray);
      }
      return new AccessToken(str1, str2, str3, (Collection)localObject1, (Collection)localObject2, paramJSONObject, localAccessTokenSource, localDate1, localDate2, localDate3, str4);
    }
    throw new FacebookException("Unknown AccessToken serialization format.");
  }
  
  public static AccessToken createFromLegacyCache(Bundle paramBundle)
  {
    List localList1 = getPermissionsFromBundle(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
    List localList2 = getPermissionsFromBundle(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
    List localList3 = getPermissionsFromBundle(paramBundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
    String str1 = LegacyTokenHelper.getApplicationId(paramBundle);
    String str2 = str1;
    if (Utility.isNullOrEmpty(str1)) {
      str2 = FacebookSdk.getApplicationId();
    }
    str1 = LegacyTokenHelper.getToken(paramBundle);
    Object localObject = Utility.awaitGetGraphMeRequestWithCache(str1);
    try
    {
      localObject = ((JSONObject)localObject).getString("id");
      return new AccessToken(str1, str2, (String)localObject, localList1, localList2, localList3, LegacyTokenHelper.getSource(paramBundle), LegacyTokenHelper.getDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.getDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
    }
    catch (JSONException paramBundle) {}
    return null;
  }
  
  public static void createFromNativeLinkingIntent(Intent paramIntent, final String paramString, final AccessTokenCreationCallback paramAccessTokenCreationCallback)
  {
    Validate.notNull(paramIntent, "intent");
    if (paramIntent.getExtras() == null)
    {
      paramAccessTokenCreationCallback.onError(new FacebookException("No extras found on intent"));
      return;
    }
    Bundle localBundle = new Bundle(paramIntent.getExtras());
    paramIntent = localBundle.getString("access_token");
    if ((paramIntent != null) && (!paramIntent.isEmpty()))
    {
      String str = localBundle.getString("user_id");
      if ((str != null) && (!str.isEmpty())) {
        paramAccessTokenCreationCallback.onSuccess(createFromBundle(null, localBundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), paramString));
      } else {
        Utility.getGraphMeRequestWithCacheAsync(paramIntent, new Utility.GraphMeRequestWithCacheCallback()
        {
          public void onFailure(FacebookException paramAnonymousFacebookException)
          {
            paramAccessTokenCreationCallback.onError(paramAnonymousFacebookException);
          }
          
          public void onSuccess(JSONObject paramAnonymousJSONObject)
          {
            try
            {
              paramAnonymousJSONObject = paramAnonymousJSONObject.getString("id");
              val$extras.putString("user_id", paramAnonymousJSONObject);
              paramAnonymousJSONObject = paramAccessTokenCreationCallback;
              Bundle localBundle = val$extras;
              AccessTokenSource localAccessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
              Date localDate = new java/util/Date;
              localDate.<init>();
              paramAnonymousJSONObject.onSuccess(AccessToken.access$000(null, localBundle, localAccessTokenSource, localDate, paramString));
            }
            catch (JSONException paramAnonymousJSONObject)
            {
              paramAccessTokenCreationCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
            }
          }
        });
      }
      return;
    }
    paramAccessTokenCreationCallback.onError(new FacebookException("No access token found on intent"));
  }
  
  @SuppressLint({"FieldGetter"})
  public static AccessToken createFromRefresh(AccessToken paramAccessToken, Bundle paramBundle)
  {
    Object localObject = source;
    if ((localObject != AccessTokenSource.FACEBOOK_APPLICATION_WEB) && (localObject != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE) && (localObject != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE))
    {
      paramBundle = z2.t("Invalid token source: ");
      paramBundle.append(source);
      throw new FacebookException(paramBundle.toString());
    }
    Date localDate = Utility.getBundleLongAsDate(paramBundle, "expires_in", new Date(0L));
    localObject = paramBundle.getString("access_token");
    String str = paramBundle.getString("graph_domain");
    paramBundle = Utility.getBundleLongAsDate(paramBundle, "data_access_expiration_time", new Date(0L));
    if (Utility.isNullOrEmpty((String)localObject)) {
      return null;
    }
    return new AccessToken((String)localObject, applicationId, paramAccessToken.getUserId(), paramAccessToken.getPermissions(), paramAccessToken.getDeclinedPermissions(), paramAccessToken.getExpiredPermissions(), source, localDate, new Date(), paramBundle, str);
  }
  
  public static void expireCurrentAccessToken()
  {
    AccessToken localAccessToken = AccessTokenManager.getInstance().getCurrentAccessToken();
    if (localAccessToken != null) {
      setCurrentAccessToken(createExpired(localAccessToken));
    }
  }
  
  public static AccessToken getCurrentAccessToken()
  {
    return AccessTokenManager.getInstance().getCurrentAccessToken();
  }
  
  public static List<String> getPermissionsFromBundle(Bundle paramBundle, String paramString)
  {
    paramBundle = paramBundle.getStringArrayList(paramString);
    if (paramBundle == null) {
      paramBundle = Collections.emptyList();
    } else {
      paramBundle = Collections.unmodifiableList(new ArrayList(paramBundle));
    }
    return paramBundle;
  }
  
  public static boolean isCurrentAccessTokenActive()
  {
    AccessToken localAccessToken = AccessTokenManager.getInstance().getCurrentAccessToken();
    boolean bool;
    if ((localAccessToken != null) && (!localAccessToken.isExpired())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isDataAccessActive()
  {
    AccessToken localAccessToken = AccessTokenManager.getInstance().getCurrentAccessToken();
    boolean bool;
    if ((localAccessToken != null) && (!localAccessToken.isDataAccessExpired())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void refreshCurrentAccessTokenAsync()
  {
    AccessTokenManager.getInstance().refreshCurrentAccessToken(null);
  }
  
  public static void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
    AccessTokenManager.getInstance().refreshCurrentAccessToken(paramAccessTokenRefreshCallback);
  }
  
  public static void setCurrentAccessToken(AccessToken paramAccessToken)
  {
    AccessTokenManager.getInstance().setCurrentAccessToken(paramAccessToken);
  }
  
  private String tokenToString()
  {
    if (token == null) {
      return "null";
    }
    if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
      return token;
    }
    return "ACCESS_TOKEN_REMOVED";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AccessToken)) {
      return false;
    }
    Object localObject = (AccessToken)paramObject;
    if ((expires.equals(expires)) && (permissions.equals(permissions)) && (declinedPermissions.equals(declinedPermissions)) && (expiredPermissions.equals(expiredPermissions)) && (token.equals(token)) && (source == source) && (lastRefresh.equals(lastRefresh)))
    {
      paramObject = applicationId;
      if ((paramObject == null ? applicationId == null : ((String)paramObject).equals(applicationId)) && (userId.equals(userId)) && (dataAccessExpirationTime.equals(dataAccessExpirationTime)))
      {
        paramObject = graphDomain;
        localObject = graphDomain;
        if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {
          return bool;
        }
      }
    }
    bool = false;
    return bool;
  }
  
  public String getApplicationId()
  {
    return applicationId;
  }
  
  public Date getDataAccessExpirationTime()
  {
    return dataAccessExpirationTime;
  }
  
  public Set<String> getDeclinedPermissions()
  {
    return declinedPermissions;
  }
  
  public Set<String> getExpiredPermissions()
  {
    return expiredPermissions;
  }
  
  public Date getExpires()
  {
    return expires;
  }
  
  public String getGraphDomain()
  {
    return graphDomain;
  }
  
  public Date getLastRefresh()
  {
    return lastRefresh;
  }
  
  public Set<String> getPermissions()
  {
    return permissions;
  }
  
  public AccessTokenSource getSource()
  {
    return source;
  }
  
  public String getToken()
  {
    return token;
  }
  
  public String getUserId()
  {
    return userId;
  }
  
  public int hashCode()
  {
    int i = expires.hashCode();
    int j = permissions.hashCode();
    int k = declinedPermissions.hashCode();
    int m = expiredPermissions.hashCode();
    int n = z2.c(token, (m + (k + (j + (i + 527) * 31) * 31) * 31) * 31, 31);
    i = source.hashCode();
    k = lastRefresh.hashCode();
    String str = applicationId;
    j = 0;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    i = z2.c(userId, ((k + (i + n) * 31) * 31 + m) * 31, 31);
    k = dataAccessExpirationTime.hashCode();
    str = graphDomain;
    if (str == null) {
      m = j;
    } else {
      m = str.hashCode();
    }
    return (k + i) * 31 + m;
  }
  
  public boolean isDataAccessExpired()
  {
    return new Date().after(dataAccessExpirationTime);
  }
  
  public boolean isExpired()
  {
    return new Date().after(expires);
  }
  
  public JSONObject toJSONObject()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("version", 1);
    localJSONObject.put("token", token);
    localJSONObject.put("expires_at", expires.getTime());
    localJSONObject.put("permissions", new JSONArray(permissions));
    localJSONObject.put("declined_permissions", new JSONArray(declinedPermissions));
    localJSONObject.put("expired_permissions", new JSONArray(expiredPermissions));
    localJSONObject.put("last_refresh", lastRefresh.getTime());
    localJSONObject.put("source", source.name());
    localJSONObject.put("application_id", applicationId);
    localJSONObject.put("user_id", userId);
    localJSONObject.put("data_access_expiration_time", dataAccessExpirationTime.getTime());
    String str = graphDomain;
    if (str != null) {
      localJSONObject.put("graph_domain", str);
    }
    return localJSONObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("{AccessToken", " token:");
    localStringBuilder.append(tokenToString());
    appendPermissions(localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(expires.getTime());
    paramParcel.writeStringList(new ArrayList(permissions));
    paramParcel.writeStringList(new ArrayList(declinedPermissions));
    paramParcel.writeStringList(new ArrayList(expiredPermissions));
    paramParcel.writeString(token);
    paramParcel.writeString(source.name());
    paramParcel.writeLong(lastRefresh.getTime());
    paramParcel.writeString(applicationId);
    paramParcel.writeString(userId);
    paramParcel.writeLong(dataAccessExpirationTime.getTime());
    paramParcel.writeString(graphDomain);
  }
  
  public static abstract interface AccessTokenCreationCallback
  {
    public abstract void onError(FacebookException paramFacebookException);
    
    public abstract void onSuccess(AccessToken paramAccessToken);
  }
  
  public static abstract interface AccessTokenRefreshCallback
  {
    public abstract void OnTokenRefreshFailed(FacebookException paramFacebookException);
    
    public abstract void OnTokenRefreshed(AccessToken paramAccessToken);
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */