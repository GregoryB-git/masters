package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.versionedparcelable.ParcelImpl;
import b2.e;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new a();
  public final Object a = new Object();
  public final Object b;
  public IMediaSession c;
  public e d;
  
  public MediaSessionCompat$Token(Object paramObject, IMediaSession paramIMediaSession, e parame)
  {
    b = paramObject;
    c = paramIMediaSession;
    d = parame;
  }
  
  public final IMediaSession a()
  {
    synchronized (a)
    {
      IMediaSession localIMediaSession = c;
      return localIMediaSession;
    }
  }
  
  public final Bundle b()
  {
    Bundle localBundle1 = new Bundle();
    localBundle1.putParcelable("android.support.v4.media.session.TOKEN", this);
    synchronized (a)
    {
      Object localObject3 = c;
      if (localObject3 != null) {
        localBundle1.putBinder("android.support.v4.media.session.EXTRA_BINDER", ((IInterface)localObject3).asBinder());
      }
      localObject3 = d;
      if (localObject3 != null)
      {
        Bundle localBundle2 = new android/os/Bundle;
        localBundle2.<init>();
        ParcelImpl localParcelImpl = new androidx/versionedparcelable/ParcelImpl;
        localParcelImpl.<init>((e)localObject3);
        localBundle2.putParcelable("a", localParcelImpl);
        localBundle1.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", localBundle2);
      }
      return localBundle1;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Token)) {
      return false;
    }
    Object localObject = (Token)paramObject;
    paramObject = b;
    localObject = b;
    if (paramObject == null)
    {
      if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    if (localObject == null) {
      return false;
    }
    return paramObject.equals(localObject);
  }
  
  public final int hashCode()
  {
    Object localObject = b;
    if (localObject == null) {
      return 0;
    }
    return localObject.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable((Parcelable)b, paramInt);
  }
  
  public final class a
    implements Parcelable.Creator<MediaSessionCompat.Token>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new MediaSessionCompat.Token(paramParcel.readParcelable(null), null, null);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new MediaSessionCompat.Token[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */