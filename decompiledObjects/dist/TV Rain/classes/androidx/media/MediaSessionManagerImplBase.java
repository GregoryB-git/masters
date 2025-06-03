package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import z2;

class MediaSessionManagerImplBase
  implements MediaSessionManager.MediaSessionManagerImpl
{
  private static final boolean DEBUG = MediaSessionManager.DEBUG;
  private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
  private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
  private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
  private static final String TAG = "MediaSessionManager";
  public ContentResolver mContentResolver;
  public Context mContext;
  
  public MediaSessionManagerImplBase(Context paramContext)
  {
    mContext = paramContext;
    mContentResolver = paramContext.getContentResolver();
  }
  
  private boolean isPermissionGranted(MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl, String paramString)
  {
    int i = paramRemoteUserInfoImpl.getPid();
    boolean bool1 = true;
    boolean bool2 = true;
    if (i < 0)
    {
      if (mContext.getPackageManager().checkPermission(paramString, paramRemoteUserInfoImpl.getPackageName()) != 0) {
        bool2 = false;
      }
      return bool2;
    }
    if (mContext.checkPermission(paramString, paramRemoteUserInfoImpl.getPid(), paramRemoteUserInfoImpl.getUid()) == 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  public boolean isEnabledNotificationListener(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    Object localObject = Settings.Secure.getString(mContentResolver, "enabled_notification_listeners");
    if (localObject != null)
    {
      String[] arrayOfString = ((String)localObject).split(":");
      for (int i = 0; i < arrayOfString.length; i++)
      {
        localObject = ComponentName.unflattenFromString(arrayOfString[i]);
        if ((localObject != null) && (((ComponentName)localObject).getPackageName().equals(paramRemoteUserInfoImpl.getPackageName()))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    boolean bool = false;
    try
    {
      ApplicationInfo localApplicationInfo = mContext.getPackageManager().getApplicationInfo(paramRemoteUserInfoImpl.getPackageName(), 0);
      if (localApplicationInfo == null) {
        return false;
      }
      if ((isPermissionGranted(paramRemoteUserInfoImpl, "android.permission.STATUS_BAR_SERVICE")) || (isPermissionGranted(paramRemoteUserInfoImpl, "android.permission.MEDIA_CONTENT_CONTROL")) || (paramRemoteUserInfoImpl.getUid() == 1000) || (isEnabledNotificationListener(paramRemoteUserInfoImpl))) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (DEBUG)
      {
        StringBuilder localStringBuilder = z2.t("Package ");
        localStringBuilder.append(paramRemoteUserInfoImpl.getPackageName());
        localStringBuilder.append(" doesn't exist");
        Log.d("MediaSessionManager", localStringBuilder.toString());
      }
    }
    return false;
  }
  
  public static class RemoteUserInfoImplBase
    implements MediaSessionManager.RemoteUserInfoImpl
  {
    private String mPackageName;
    private int mPid;
    private int mUid;
    
    public RemoteUserInfoImplBase(String paramString, int paramInt1, int paramInt2)
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
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManagerImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */