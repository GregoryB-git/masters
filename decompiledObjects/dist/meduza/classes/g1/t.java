package g1;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class t
{
  public v a;
  
  public t(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    String str = u.a(paramRemoteUserInfo);
    if (str != null)
    {
      if (!TextUtils.isEmpty(str))
      {
        a = new u(paramRemoteUserInfo);
        return;
      }
      throw new IllegalArgumentException("packageName should be nonempty");
    }
    throw new NullPointerException("package shouldn't be null");
  }
  
  public t(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (Build.VERSION.SDK_INT >= 28) {
          paramString = new u(paramString, paramInt1, paramInt2);
        } else {
          paramString = new v(paramString, paramInt1, paramInt2);
        }
        a = paramString;
        return;
      }
      throw new IllegalArgumentException("packageName should be nonempty");
    }
    throw new NullPointerException("package shouldn't be null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof t)) {
      return false;
    }
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     g1.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */