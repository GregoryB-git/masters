package com.facebook.appevents.codeless.internal;

import android.util.Log;
import java.lang.reflect.Method;

public class UnityReflection
{
  private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
  private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";
  private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
  private static final String TAG = "com.facebook.appevents.codeless.internal.UnityReflection";
  private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
  private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
  private static Class<?> unityPlayer;
  
  public static void captureViewHierarchy()
  {
    sendMessage("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
  }
  
  public static void sendEventMapping(String paramString)
  {
    sendMessage("UnityFacebookSDKPlugin", "OnReceiveMapping", paramString);
  }
  
  public static void sendMessage(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (unityPlayer == null) {
        unityPlayer = Class.forName("com.unity3d.player.UnityPlayer");
      }
      unityPlayer.getMethod("UnitySendMessage", new Class[] { String.class, String.class, String.class }).invoke(unityPlayer, new Object[] { paramString1, paramString2, paramString3 });
    }
    catch (Exception paramString1)
    {
      Log.e(TAG, "Failed to send message to Unity", paramString1);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.UnityReflection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */