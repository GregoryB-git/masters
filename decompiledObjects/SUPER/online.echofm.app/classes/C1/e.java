package C1;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class e
{
  public static final e a = new e();
  public static final String b = e.class.getCanonicalName();
  public static Class c;
  
  public static final void a()
  {
    d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
  }
  
  public static final void c(String paramString)
  {
    d("UnityFacebookSDKPlugin", "OnReceiveMapping", paramString);
  }
  
  public static final void d(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (c == null) {
        c = a.b();
      }
    }
    catch (Exception paramString1)
    {
      break label105;
    }
    Class localClass = c;
    if (localClass != null)
    {
      Method localMethod = localClass.getMethod("UnitySendMessage", new Class[] { String.class, String.class, String.class });
      localClass = c;
      if (localClass != null)
      {
        localMethod.invoke(localClass, new Object[] { paramString1, paramString2, paramString3 });
      }
      else
      {
        Intrinsics.n("unityPlayer");
        throw null;
      }
    }
    else
    {
      Intrinsics.n("unityPlayer");
      throw null;
      label105:
      Log.e(b, "Failed to send message to Unity", paramString1);
    }
  }
  
  public final Class b()
  {
    Class localClass = Class.forName("com.unity3d.player.UnityPlayer");
    Intrinsics.checkNotNullExpressionValue(localClass, "forName(UNITY_PLAYER_CLASS)");
    return localClass;
  }
}

/* Location:
 * Qualified Name:     C1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */