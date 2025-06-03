package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl
  implements CallbackManager
{
  private static final String TAG = "CallbackManagerImpl";
  private static Map<Integer, Callback> staticCallbacks = new HashMap();
  private Map<Integer, Callback> callbacks = new HashMap();
  
  private static Callback getStaticCallback(Integer paramInteger)
  {
    try
    {
      paramInteger = (Callback)staticCallbacks.get(paramInteger);
      return paramInteger;
    }
    finally
    {
      paramInteger = finally;
      throw paramInteger;
    }
  }
  
  public static void registerStaticCallback(int paramInt, Callback paramCallback)
  {
    try
    {
      Validate.notNull(paramCallback, "callback");
      boolean bool = staticCallbacks.containsKey(Integer.valueOf(paramInt));
      if (bool) {
        return;
      }
      staticCallbacks.put(Integer.valueOf(paramInt), paramCallback);
      return;
    }
    finally {}
  }
  
  private static boolean runStaticCallback(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Callback localCallback = getStaticCallback(Integer.valueOf(paramInt1));
    if (localCallback != null) {
      return localCallback.onActivityResult(paramInt2, paramIntent);
    }
    return false;
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Callback localCallback = (Callback)callbacks.get(Integer.valueOf(paramInt1));
    if (localCallback != null) {
      return localCallback.onActivityResult(paramInt2, paramIntent);
    }
    return runStaticCallback(paramInt1, paramInt2, paramIntent);
  }
  
  public void registerCallback(int paramInt, Callback paramCallback)
  {
    Validate.notNull(paramCallback, "callback");
    callbacks.put(Integer.valueOf(paramInt), paramCallback);
  }
  
  public void unregisterCallback(int paramInt)
  {
    callbacks.remove(Integer.valueOf(paramInt));
  }
  
  public static abstract interface Callback
  {
    public abstract boolean onActivityResult(int paramInt, Intent paramIntent);
  }
  
  public static enum RequestCodeOffset
  {
    private final int offset;
    
    static
    {
      RequestCodeOffset localRequestCodeOffset1 = new RequestCodeOffset("Login", 0, 0);
      Login = localRequestCodeOffset1;
      RequestCodeOffset localRequestCodeOffset2 = new RequestCodeOffset("Share", 1, 1);
      Share = localRequestCodeOffset2;
      RequestCodeOffset localRequestCodeOffset3 = new RequestCodeOffset("Message", 2, 2);
      Message = localRequestCodeOffset3;
      RequestCodeOffset localRequestCodeOffset4 = new RequestCodeOffset("Like", 3, 3);
      Like = localRequestCodeOffset4;
      RequestCodeOffset localRequestCodeOffset5 = new RequestCodeOffset("GameRequest", 4, 4);
      GameRequest = localRequestCodeOffset5;
      RequestCodeOffset localRequestCodeOffset6 = new RequestCodeOffset("AppGroupCreate", 5, 5);
      AppGroupCreate = localRequestCodeOffset6;
      RequestCodeOffset localRequestCodeOffset7 = new RequestCodeOffset("AppGroupJoin", 6, 6);
      AppGroupJoin = localRequestCodeOffset7;
      RequestCodeOffset localRequestCodeOffset8 = new RequestCodeOffset("AppInvite", 7, 7);
      AppInvite = localRequestCodeOffset8;
      RequestCodeOffset localRequestCodeOffset9 = new RequestCodeOffset("DeviceShare", 8, 8);
      DeviceShare = localRequestCodeOffset9;
      RequestCodeOffset localRequestCodeOffset10 = new RequestCodeOffset("GamingFriendFinder", 9, 9);
      GamingFriendFinder = localRequestCodeOffset10;
      RequestCodeOffset localRequestCodeOffset11 = new RequestCodeOffset("GamingGroupIntegration", 10, 10);
      GamingGroupIntegration = localRequestCodeOffset11;
      RequestCodeOffset localRequestCodeOffset12 = new RequestCodeOffset("Referral", 11, 11);
      Referral = localRequestCodeOffset12;
      $VALUES = new RequestCodeOffset[] { localRequestCodeOffset1, localRequestCodeOffset2, localRequestCodeOffset3, localRequestCodeOffset4, localRequestCodeOffset5, localRequestCodeOffset6, localRequestCodeOffset7, localRequestCodeOffset8, localRequestCodeOffset9, localRequestCodeOffset10, localRequestCodeOffset11, localRequestCodeOffset12 };
    }
    
    private RequestCodeOffset(int paramInt)
    {
      offset = paramInt;
    }
    
    public int toRequestCode()
    {
      return FacebookSdk.getCallbackRequestCodeOffset() + offset;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.CallbackManagerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */