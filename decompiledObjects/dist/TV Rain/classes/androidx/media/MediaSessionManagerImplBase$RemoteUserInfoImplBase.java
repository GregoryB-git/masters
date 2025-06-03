package androidx.media;

import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;

class MediaSessionManagerImplBase$RemoteUserInfoImplBase
  implements MediaSessionManager.RemoteUserInfoImpl
{
  private String mPackageName;
  private int mPid;
  private int mUid;
  
  public MediaSessionManagerImplBase$RemoteUserInfoImplBase(String paramString, int paramInt1, int paramInt2)
  {
    mPackageName = paramString;
    mPid = paramInt1;
    mUid = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof RemoteUserInfoImplBase)) {
      return false;
    }
    paramObject = (RemoteUserInfoImplBase)paramObject;
    if ((mPid >= 0) && (mPid >= 0))
    {
      if ((!TextUtils.equals(mPackageName, mPackageName)) || (mPid != mPid) || (mUid != mUid)) {
        bool2 = false;
      }
      return bool2;
    }
    if ((TextUtils.equals(mPackageName, mPackageName)) && (mUid == mUid)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public String getPackageName()
  {
    return mPackageName;
  }
  
  public int getPid()
  {
    return mPid;
  }
  
  public int getUid()
  {
    return mUid;
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { mPackageName, Integer.valueOf(mUid) });
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */