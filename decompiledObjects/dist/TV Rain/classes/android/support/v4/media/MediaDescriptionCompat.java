package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
  public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
  public static final long BT_FOLDER_TYPE_GENRES = 4L;
  public static final long BT_FOLDER_TYPE_MIXED = 0L;
  public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
  public static final long BT_FOLDER_TYPE_TITLES = 1L;
  public static final long BT_FOLDER_TYPE_YEARS = 6L;
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator()
  {
    public MediaDescriptionCompat createFromParcel(Parcel paramAnonymousParcel)
    {
      return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(paramAnonymousParcel));
    }
    
    public MediaDescriptionCompat[] newArray(int paramAnonymousInt)
    {
      return new MediaDescriptionCompat[paramAnonymousInt];
    }
  };
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
  public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
  public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
  public static final long STATUS_DOWNLOADED = 2L;
  public static final long STATUS_DOWNLOADING = 1L;
  public static final long STATUS_NOT_DOWNLOADED = 0L;
  private static final String TAG = "MediaDescriptionCompat";
  private final CharSequence mDescription;
  private MediaDescription mDescriptionFwk;
  private final Bundle mExtras;
  private final Bitmap mIcon;
  private final Uri mIconUri;
  private final String mMediaId;
  private final Uri mMediaUri;
  private final CharSequence mSubtitle;
  private final CharSequence mTitle;
  
  public MediaDescriptionCompat(Parcel paramParcel)
  {
    mMediaId = paramParcel.readString();
    mTitle = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mSubtitle = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mDescription = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    ClassLoader localClassLoader = MediaDescriptionCompat.class.getClassLoader();
    mIcon = ((Bitmap)paramParcel.readParcelable(localClassLoader));
    mIconUri = ((Uri)paramParcel.readParcelable(localClassLoader));
    mExtras = paramParcel.readBundle(localClassLoader);
    mMediaUri = ((Uri)paramParcel.readParcelable(localClassLoader));
  }
  
  public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    mMediaId = paramString;
    mTitle = paramCharSequence1;
    mSubtitle = paramCharSequence2;
    mDescription = paramCharSequence3;
    mIcon = paramBitmap;
    mIconUri = paramUri1;
    mExtras = paramBundle;
    mMediaUri = paramUri2;
  }
  
  public static MediaDescriptionCompat fromMediaDescription(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramObject != null)
    {
      Builder localBuilder = new Builder();
      MediaDescription localMediaDescription = (MediaDescription)paramObject;
      localBuilder.setMediaId(Api21Impl.getMediaId(localMediaDescription));
      localBuilder.setTitle(Api21Impl.getTitle(localMediaDescription));
      localBuilder.setSubtitle(Api21Impl.getSubtitle(localMediaDescription));
      localBuilder.setDescription(Api21Impl.getDescription(localMediaDescription));
      localBuilder.setIconBitmap(Api21Impl.getIconBitmap(localMediaDescription));
      localBuilder.setIconUri(Api21Impl.getIconUri(localMediaDescription));
      localObject1 = Api21Impl.getExtras(localMediaDescription);
      paramObject = localObject1;
      if (localObject1 != null) {
        paramObject = MediaSessionCompat.unparcelWithClassLoader((Bundle)localObject1);
      }
      if (paramObject != null) {
        localObject1 = (Uri)((Bundle)paramObject).getParcelable("android.support.v4.media.description.MEDIA_URI");
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        if ((((BaseBundle)paramObject).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) && (((BaseBundle)paramObject).size() == 2))
        {
          paramObject = localObject2;
        }
        else
        {
          ((Bundle)paramObject).remove("android.support.v4.media.description.MEDIA_URI");
          ((Bundle)paramObject).remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
      }
      localBuilder.setExtras((Bundle)paramObject);
      if (localObject1 != null) {
        localBuilder.setMediaUri((Uri)localObject1);
      } else {
        localBuilder.setMediaUri(Api23Impl.getMediaUri(localMediaDescription));
      }
      localObject1 = localBuilder.build();
      mDescriptionFwk = localMediaDescription;
    }
    return (MediaDescriptionCompat)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public CharSequence getDescription()
  {
    return mDescription;
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  @Nullable
  public Bitmap getIconBitmap()
  {
    return mIcon;
  }
  
  @Nullable
  public Uri getIconUri()
  {
    return mIconUri;
  }
  
  public Object getMediaDescription()
  {
    MediaDescription localMediaDescription = mDescriptionFwk;
    Object localObject = localMediaDescription;
    if (localMediaDescription == null)
    {
      localObject = Api21Impl.createBuilder();
      Api21Impl.setMediaId((MediaDescription.Builder)localObject, mMediaId);
      Api21Impl.setTitle((MediaDescription.Builder)localObject, mTitle);
      Api21Impl.setSubtitle((MediaDescription.Builder)localObject, mSubtitle);
      Api21Impl.setDescription((MediaDescription.Builder)localObject, mDescription);
      Api21Impl.setIconBitmap((MediaDescription.Builder)localObject, mIcon);
      Api21Impl.setIconUri((MediaDescription.Builder)localObject, mIconUri);
      Api21Impl.setExtras((MediaDescription.Builder)localObject, mExtras);
      Api23Impl.setMediaUri((MediaDescription.Builder)localObject, mMediaUri);
      localObject = Api21Impl.build((MediaDescription.Builder)localObject);
      mDescriptionFwk = ((MediaDescription)localObject);
    }
    return localObject;
  }
  
  @Nullable
  public String getMediaId()
  {
    return mMediaId;
  }
  
  @Nullable
  public Uri getMediaUri()
  {
    return mMediaUri;
  }
  
  @Nullable
  public CharSequence getSubtitle()
  {
    return mSubtitle;
  }
  
  @Nullable
  public CharSequence getTitle()
  {
    return mTitle;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mTitle);
    localStringBuilder.append(", ");
    localStringBuilder.append(mSubtitle);
    localStringBuilder.append(", ");
    localStringBuilder.append(mDescription);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((MediaDescription)getMediaDescription()).writeToParcel(paramParcel, paramInt);
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static MediaDescription build(MediaDescription.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    @DoNotInline
    public static MediaDescription.Builder createBuilder()
    {
      return new MediaDescription.Builder();
    }
    
    @DoNotInline
    @Nullable
    public static CharSequence getDescription(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getDescription();
    }
    
    @DoNotInline
    @Nullable
    public static Bundle getExtras(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getExtras();
    }
    
    @DoNotInline
    @Nullable
    public static Bitmap getIconBitmap(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getIconBitmap();
    }
    
    @DoNotInline
    @Nullable
    public static Uri getIconUri(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getIconUri();
    }
    
    @DoNotInline
    @Nullable
    public static String getMediaId(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getMediaId();
    }
    
    @DoNotInline
    @Nullable
    public static CharSequence getSubtitle(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getSubtitle();
    }
    
    @DoNotInline
    @Nullable
    public static CharSequence getTitle(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getTitle();
    }
    
    @DoNotInline
    public static void setDescription(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
    {
      paramBuilder.setDescription(paramCharSequence);
    }
    
    @DoNotInline
    public static void setExtras(MediaDescription.Builder paramBuilder, @Nullable Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
    
    @DoNotInline
    public static void setIconBitmap(MediaDescription.Builder paramBuilder, @Nullable Bitmap paramBitmap)
    {
      paramBuilder.setIconBitmap(paramBitmap);
    }
    
    @DoNotInline
    public static void setIconUri(MediaDescription.Builder paramBuilder, @Nullable Uri paramUri)
    {
      paramBuilder.setIconUri(paramUri);
    }
    
    @DoNotInline
    public static void setMediaId(MediaDescription.Builder paramBuilder, @Nullable String paramString)
    {
      paramBuilder.setMediaId(paramString);
    }
    
    @DoNotInline
    public static void setSubtitle(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
    {
      paramBuilder.setSubtitle(paramCharSequence);
    }
    
    @DoNotInline
    public static void setTitle(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
    {
      paramBuilder.setTitle(paramCharSequence);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    @Nullable
    public static Uri getMediaUri(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getMediaUri();
    }
    
    @DoNotInline
    public static void setMediaUri(MediaDescription.Builder paramBuilder, @Nullable Uri paramUri)
    {
      paramBuilder.setMediaUri(paramUri);
    }
  }
  
  public static final class Builder
  {
    private CharSequence mDescription;
    private Bundle mExtras;
    private Bitmap mIcon;
    private Uri mIconUri;
    private String mMediaId;
    private Uri mMediaUri;
    private CharSequence mSubtitle;
    private CharSequence mTitle;
    
    public MediaDescriptionCompat build()
    {
      return new MediaDescriptionCompat(mMediaId, mTitle, mSubtitle, mDescription, mIcon, mIconUri, mExtras, mMediaUri);
    }
    
    public Builder setDescription(@Nullable CharSequence paramCharSequence)
    {
      mDescription = paramCharSequence;
      return this;
    }
    
    public Builder setExtras(@Nullable Bundle paramBundle)
    {
      mExtras = paramBundle;
      return this;
    }
    
    public Builder setIconBitmap(@Nullable Bitmap paramBitmap)
    {
      mIcon = paramBitmap;
      return this;
    }
    
    public Builder setIconUri(@Nullable Uri paramUri)
    {
      mIconUri = paramUri;
      return this;
    }
    
    public Builder setMediaId(@Nullable String paramString)
    {
      mMediaId = paramString;
      return this;
    }
    
    public Builder setMediaUri(@Nullable Uri paramUri)
    {
      mMediaUri = paramUri;
      return this;
    }
    
    public Builder setSubtitle(@Nullable CharSequence paramCharSequence)
    {
      mSubtitle = paramCharSequence;
      return this;
    }
    
    public Builder setTitle(@Nullable CharSequence paramCharSequence)
    {
      mTitle = paramCharSequence;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */