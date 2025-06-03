package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator()
  {
    public MediaSessionCompat.Token createFromParcel(Parcel paramAnonymousParcel)
    {
      return new MediaSessionCompat.Token(paramAnonymousParcel.readParcelable(null));
    }
    
    public MediaSessionCompat.Token[] newArray(int paramAnonymousInt)
    {
      return new MediaSessionCompat.Token[paramAnonymousInt];
    }
  };
  @GuardedBy("mLock")
  private IMediaSession mExtraBinder;
  private final Object mInner;
  private final Object mLock = new Object();
  @GuardedBy("mLock")
  private VersionedParcelable mSession2Token;
  
  public MediaSessionCompat$Token(Object paramObject)
  {
    this(paramObject, null, null);
  }
  
  public MediaSessionCompat$Token(Object paramObject, IMediaSession paramIMediaSession)
  {
    this(paramObject, paramIMediaSession, null);
  }
  
  public MediaSessionCompat$Token(Object paramObject, IMediaSession paramIMediaSession, VersionedParcelable paramVersionedParcelable)
  {
    mInner = paramObject;
    mExtraBinder = paramIMediaSession;
    mSession2Token = paramVersionedParcelable;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Token fromBundle(Bundle paramBundle)
  {
    Object localObject = null;
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(Token.class.getClassLoader());
    IMediaSession localIMediaSession = IMediaSession.Stub.asInterface(BundleCompat.getBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER"));
    VersionedParcelable localVersionedParcelable = ParcelUtils.getVersionedParcelable(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2");
    paramBundle = (Token)paramBundle.getParcelable("android.support.v4.media.session.TOKEN");
    if (paramBundle == null) {
      paramBundle = (Bundle)localObject;
    } else {
      paramBundle = new Token(mInner, localIMediaSession, localVersionedParcelable);
    }
    return paramBundle;
  }
  
  public static Token fromToken(Object paramObject)
  {
    return fromToken(paramObject, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Token fromToken(Object paramObject, IMediaSession paramIMediaSession)
  {
    if (paramObject != null)
    {
      if ((paramObject instanceof MediaSession.Token)) {
        return new Token(paramObject, paramIMediaSession);
      }
      throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
    return null;
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
    if (!(paramObject instanceof Token)) {
      return false;
    }
    Object localObject = (Token)paramObject;
    paramObject = mInner;
    if (paramObject == null)
    {
      if (mInner != null) {
        bool = false;
      }
      return bool;
    }
    localObject = mInner;
    if (localObject == null) {
      return false;
    }
    return paramObject.equals(localObject);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public IMediaSession getExtraBinder()
  {
    synchronized (mLock)
    {
      IMediaSession localIMediaSession = mExtraBinder;
      return localIMediaSession;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public VersionedParcelable getSession2Token()
  {
    synchronized (mLock)
    {
      VersionedParcelable localVersionedParcelable = mSession2Token;
      return localVersionedParcelable;
    }
  }
  
  public Object getToken()
  {
    return mInner;
  }
  
  public int hashCode()
  {
    Object localObject = mInner;
    if (localObject == null) {
      return 0;
    }
    return localObject.hashCode();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void setExtraBinder(IMediaSession paramIMediaSession)
  {
    synchronized (mLock)
    {
      mExtraBinder = paramIMediaSession;
      return;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSession2Token(VersionedParcelable paramVersionedParcelable)
  {
    synchronized (mLock)
    {
      mSession2Token = paramVersionedParcelable;
      return;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.v4.media.session.TOKEN", this);
    synchronized (mLock)
    {
      Object localObject3 = mExtraBinder;
      if (localObject3 != null) {
        BundleCompat.putBinder(localBundle, "android.support.v4.media.session.EXTRA_BINDER", ((IInterface)localObject3).asBinder());
      }
      localObject3 = mSession2Token;
      if (localObject3 != null) {
        ParcelUtils.putVersionedParcelable(localBundle, "android.support.v4.media.session.SESSION_TOKEN2", (VersionedParcelable)localObject3);
      }
      return localBundle;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable((Parcelable)mInner, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */