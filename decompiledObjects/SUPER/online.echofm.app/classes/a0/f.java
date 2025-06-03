package a0;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class f
{
  public g a;
  
  public f(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    String str = l.a(paramRemoteUserInfo);
    if (str != null)
    {
      if (!TextUtils.isEmpty(str))
      {
        a = new l(paramRemoteUserInfo);
        return;
      }
      throw new IllegalArgumentException("packageName should be nonempty");
    }
    throw new NullPointerException("package shouldn't be null");
  }
  
  public f(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (Build.VERSION.SDK_INT >= 28) {}
        for (paramString = new l(paramString, paramInt1, paramInt2);; paramString = new m(paramString, paramInt1, paramInt2))
        {
          a = paramString;
          break;
        }
        return;
      }
      throw new IllegalArgumentException("packageName should be nonempty");
    }
    throw new NullPointerException("package shouldn't be null");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    return a.equals(a);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     a0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */