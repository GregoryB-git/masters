package android.support.v4.media.session;

import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import z2;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator()
  {
    public PlaybackStateCompat.CustomAction createFromParcel(Parcel paramAnonymousParcel)
    {
      return new PlaybackStateCompat.CustomAction(paramAnonymousParcel);
    }
    
    public PlaybackStateCompat.CustomAction[] newArray(int paramAnonymousInt)
    {
      return new PlaybackStateCompat.CustomAction[paramAnonymousInt];
    }
  };
  private final String mAction;
  private PlaybackState.CustomAction mCustomActionFwk;
  private final Bundle mExtras;
  private final int mIcon;
  private final CharSequence mName;
  
  public PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    mAction = paramParcel.readString();
    mName = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mIcon = paramParcel.readInt();
    mExtras = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public PlaybackStateCompat$CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
  {
    mAction = paramString;
    mName = paramCharSequence;
    mIcon = paramInt;
    mExtras = paramBundle;
  }
  
  public static CustomAction fromCustomAction(Object paramObject)
  {
    if (paramObject != null)
    {
      paramObject = (PlaybackState.CustomAction)paramObject;
      Object localObject = PlaybackStateCompat.Api21Impl.getExtras((PlaybackState.CustomAction)paramObject);
      MediaSessionCompat.ensureClassLoader((Bundle)localObject);
      localObject = new CustomAction(PlaybackStateCompat.Api21Impl.getAction((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.Api21Impl.getName((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.Api21Impl.getIcon((PlaybackState.CustomAction)paramObject), (Bundle)localObject);
      mCustomActionFwk = ((PlaybackState.CustomAction)paramObject);
      return (CustomAction)localObject;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAction()
  {
    return mAction;
  }
  
  public Object getCustomAction()
  {
    PlaybackState.CustomAction localCustomAction = mCustomActionFwk;
    Object localObject = localCustomAction;
    if (localCustomAction == null)
    {
      localObject = PlaybackStateCompat.Api21Impl.createCustomActionBuilder(mAction, mName, mIcon);
      PlaybackStateCompat.Api21Impl.setExtras((PlaybackState.CustomAction.Builder)localObject, mExtras);
      localObject = PlaybackStateCompat.Api21Impl.build((PlaybackState.CustomAction.Builder)localObject);
    }
    return localObject;
  }
  
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public int getIcon()
  {
    return mIcon;
  }
  
  public CharSequence getName()
  {
    return mName;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Action:mName='");
    localStringBuilder.append(mName);
    localStringBuilder.append(", mIcon=");
    localStringBuilder.append(mIcon);
    localStringBuilder.append(", mExtras=");
    localStringBuilder.append(mExtras);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(mAction);
    TextUtils.writeToParcel(mName, paramParcel, paramInt);
    paramParcel.writeInt(mIcon);
    paramParcel.writeBundle(mExtras);
  }
  
  public static final class Builder
  {
    private final String mAction;
    private Bundle mExtras;
    private final int mIcon;
    private final CharSequence mName;
    
    public Builder(String paramString, CharSequence paramCharSequence, int paramInt)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (!TextUtils.isEmpty(paramCharSequence))
        {
          if (paramInt != 0)
          {
            mAction = paramString;
            mName = paramCharSequence;
            mIcon = paramInt;
            return;
          }
          throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
      }
      throw new IllegalArgumentException("You must specify an action to build a CustomAction");
    }
    
    public PlaybackStateCompat.CustomAction build()
    {
      return new PlaybackStateCompat.CustomAction(mAction, mName, mIcon, mExtras);
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      mExtras = paramBundle;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */