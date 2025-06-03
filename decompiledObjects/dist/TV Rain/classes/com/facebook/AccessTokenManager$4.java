package com.facebook;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

class AccessTokenManager$4
  implements GraphRequestBatch.Callback
{
  public AccessTokenManager$4(AccessTokenManager paramAccessTokenManager, AccessToken paramAccessToken, AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback, AtomicBoolean paramAtomicBoolean, AccessTokenManager.RefreshResult paramRefreshResult, Set paramSet1, Set paramSet2, Set paramSet3) {}
  
  public void onBatchCompleted(GraphRequestBatch paramGraphRequestBatch)
  {
    try
    {
      if ((AccessTokenManager.getInstance().getCurrentAccessToken() != null) && (AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() == val$accessToken.getUserId()))
      {
        Object localObject1;
        if (!val$permissionsCallSucceeded.get())
        {
          paramGraphRequestBatch = val$refreshResult;
          if ((accessToken == null) && (expiresAt == 0))
          {
            localObject1 = val$callback;
            if (localObject1 != null)
            {
              paramGraphRequestBatch = new com/facebook/FacebookException;
              paramGraphRequestBatch.<init>("Failed to refresh access token");
              ((AccessToken.AccessTokenRefreshCallback)localObject1).OnTokenRefreshFailed(paramGraphRequestBatch);
            }
            AccessTokenManager.access$200(this$0).set(false);
            return;
          }
        }
        paramGraphRequestBatch = val$refreshResult.accessToken;
        if (paramGraphRequestBatch == null) {
          paramGraphRequestBatch = val$accessToken.getToken();
        }
        String str1 = val$accessToken.getApplicationId();
        String str2 = val$accessToken.getUserId();
        if (val$permissionsCallSucceeded.get()) {
          localObject1 = val$permissions;
        } else {
          localObject1 = val$accessToken.getPermissions();
        }
        if (val$permissionsCallSucceeded.get()) {
          localObject4 = val$declinedPermissions;
        } else {
          localObject4 = val$accessToken.getDeclinedPermissions();
        }
        Set localSet;
        if (val$permissionsCallSucceeded.get()) {
          localSet = val$expiredPermissions;
        } else {
          localSet = val$accessToken.getExpiredPermissions();
        }
        AccessTokenSource localAccessTokenSource = val$accessToken.getSource();
        Date localDate1;
        if (val$refreshResult.expiresAt != 0)
        {
          localDate1 = new java/util/Date;
          localDate1.<init>(val$refreshResult.expiresAt * 1000L);
        }
        else
        {
          localDate1 = val$accessToken.getExpires();
        }
        Date localDate2 = new java/util/Date;
        localDate2.<init>();
        Date localDate3;
        if (val$refreshResult.dataAccessExpirationTime != null)
        {
          localDate3 = new java/util/Date;
          localDate3.<init>(1000L * val$refreshResult.dataAccessExpirationTime.longValue());
        }
        else
        {
          localDate3 = val$accessToken.getDataAccessExpirationTime();
        }
        paramGraphRequestBatch = new AccessToken(paramGraphRequestBatch, str1, str2, (Collection)localObject1, (Collection)localObject4, localSet, localAccessTokenSource, localDate1, localDate2, localDate3, val$refreshResult.graphDomain);
        try
        {
          AccessTokenManager.getInstance().setCurrentAccessToken(paramGraphRequestBatch);
          AccessTokenManager.access$200(this$0).set(false);
          localObject1 = val$callback;
          if (localObject1 != null) {
            ((AccessToken.AccessTokenRefreshCallback)localObject1).OnTokenRefreshed(paramGraphRequestBatch);
          }
          return;
        }
        finally
        {
          break label441;
        }
      }
      AccessToken.AccessTokenRefreshCallback localAccessTokenRefreshCallback = val$callback;
      if (localAccessTokenRefreshCallback != null)
      {
        paramGraphRequestBatch = new com/facebook/FacebookException;
        paramGraphRequestBatch.<init>("No current access token to refresh");
        localAccessTokenRefreshCallback.OnTokenRefreshFailed(paramGraphRequestBatch);
      }
      AccessTokenManager.access$200(this$0).set(false);
      return;
    }
    finally
    {
      paramGraphRequestBatch = null;
      label441:
      AccessTokenManager.access$200(this$0).set(false);
      Object localObject4 = val$callback;
      if ((localObject4 != null) && (paramGraphRequestBatch != null)) {
        ((AccessToken.AccessTokenRefreshCallback)localObject4).OnTokenRefreshed(paramGraphRequestBatch);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenManager.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */