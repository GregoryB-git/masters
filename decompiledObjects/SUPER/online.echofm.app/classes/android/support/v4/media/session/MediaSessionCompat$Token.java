package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession.Token;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import v1.d;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new a();
  public final Object o = new Object();
  public final Object p;
  public b q;
  public d r;
  
  public MediaSessionCompat$Token(Object paramObject)
  {
    this(paramObject, null, null);
  }
  
  public MediaSessionCompat$Token(Object paramObject, b paramb)
  {
    this(paramObject, paramb, null);
  }
  
  public MediaSessionCompat$Token(Object paramObject, b paramb, d paramd)
  {
    p = paramObject;
    q = paramb;
    r = paramd;
  }
  
  public static Token a(Object paramObject)
  {
    return b(paramObject, null);
  }
  
  public static Token b(Object paramObject, b paramb)
  {
    if (paramObject != null)
    {
      if ((paramObject instanceof MediaSession.Token)) {
        return new Token(paramObject, paramb);
      }
      throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
    return null;
  }
  
  public b c()
  {
    synchronized (o)
    {
      b localb = q;
      return localb;
    }
  }
  
  public d d()
  {
    synchronized (o)
    {
      d locald = r;
      return locald;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object e()
  {
    return p;
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
    paramObject = p;
    localObject = p;
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
  
  public void f(b paramb)
  {
    synchronized (o)
    {
      q = paramb;
      return;
    }
  }
  
  public void g(d paramd)
  {
    synchronized (o)
    {
      r = paramd;
      return;
    }
  }
  
  public int hashCode()
  {
    Object localObject = p;
    if (localObject == null) {
      return 0;
    }
    return localObject.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable((Parcelable)p, paramInt);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public MediaSessionCompat.Token a(Parcel paramParcel)
    {
      return new MediaSessionCompat.Token(paramParcel.readParcelable(null));
    }
    
    public MediaSessionCompat.Token[] b(int paramInt)
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