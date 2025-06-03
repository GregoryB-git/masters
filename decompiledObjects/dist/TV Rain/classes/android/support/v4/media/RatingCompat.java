package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z2;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator()
  {
    public RatingCompat createFromParcel(Parcel paramAnonymousParcel)
    {
      return new RatingCompat(paramAnonymousParcel.readInt(), paramAnonymousParcel.readFloat());
    }
    
    public RatingCompat[] newArray(int paramAnonymousInt)
    {
      return new RatingCompat[paramAnonymousInt];
    }
  };
  public static final int RATING_3_STARS = 3;
  public static final int RATING_4_STARS = 4;
  public static final int RATING_5_STARS = 5;
  public static final int RATING_HEART = 1;
  public static final int RATING_NONE = 0;
  private static final float RATING_NOT_RATED = -1.0F;
  public static final int RATING_PERCENTAGE = 6;
  public static final int RATING_THUMB_UP_DOWN = 2;
  private static final String TAG = "Rating";
  private Object mRatingObj;
  private final int mRatingStyle;
  private final float mRatingValue;
  
  public RatingCompat(int paramInt, float paramFloat)
  {
    mRatingStyle = paramInt;
    mRatingValue = paramFloat;
  }
  
  public static RatingCompat fromRating(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      localObject = (Rating)paramObject;
      int i = Api19Impl.getRatingStyle((Rating)localObject);
      if (Api19Impl.isRated((Rating)localObject)) {
        switch (i)
        {
        default: 
          return null;
        case 6: 
          localObject = newPercentageRating(Api19Impl.getPercentRating((Rating)localObject));
          break;
        case 3: 
        case 4: 
        case 5: 
          localObject = newStarRating(i, Api19Impl.getStarRating((Rating)localObject));
          break;
        case 2: 
          localObject = newThumbRating(Api19Impl.isThumbUp((Rating)localObject));
          break;
        case 1: 
          localObject = newHeartRating(Api19Impl.hasHeart((Rating)localObject));
          break;
        }
      } else {
        localObject = newUnratedRating(i);
      }
      mRatingObj = paramObject;
    }
    return (RatingCompat)localObject;
  }
  
  public static RatingCompat newHeartRating(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(1, f);
  }
  
  public static RatingCompat newPercentageRating(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 100.0F)) {
      return new RatingCompat(6, paramFloat);
    }
    Log.e("Rating", "Invalid percentage-based rating value");
    return null;
  }
  
  public static RatingCompat newStarRating(int paramInt, float paramFloat)
  {
    float f;
    if (paramInt != 3)
    {
      if (paramInt != 4)
      {
        if (paramInt != 5)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Invalid rating style (");
          localStringBuilder.append(paramInt);
          localStringBuilder.append(") for a star rating");
          Log.e("Rating", localStringBuilder.toString());
          return null;
        }
        f = 5.0F;
      }
      else
      {
        f = 4.0F;
      }
    }
    else {
      f = 3.0F;
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= f)) {
      return new RatingCompat(paramInt, paramFloat);
    }
    Log.e("Rating", "Trying to set out of range star-based rating");
    return null;
  }
  
  public static RatingCompat newThumbRating(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(2, f);
  }
  
  public static RatingCompat newUnratedRating(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new RatingCompat(paramInt, -1.0F);
  }
  
  public int describeContents()
  {
    return mRatingStyle;
  }
  
  public float getPercentRating()
  {
    if ((mRatingStyle == 6) && (isRated())) {
      return mRatingValue;
    }
    return -1.0F;
  }
  
  public Object getRating()
  {
    if (mRatingObj == null) {
      if (isRated())
      {
        int i = mRatingStyle;
        switch (i)
        {
        default: 
          return null;
        case 6: 
          mRatingObj = Api19Impl.newPercentageRating(getPercentRating());
          break;
        case 3: 
        case 4: 
        case 5: 
          mRatingObj = Api19Impl.newStarRating(i, getStarRating());
          break;
        case 2: 
          mRatingObj = Api19Impl.newThumbRating(isThumbUp());
          break;
        case 1: 
          mRatingObj = Api19Impl.newHeartRating(hasHeart());
          break;
        }
      }
      else
      {
        mRatingObj = Api19Impl.newUnratedRating(mRatingStyle);
      }
    }
    return mRatingObj;
  }
  
  public int getRatingStyle()
  {
    return mRatingStyle;
  }
  
  public float getStarRating()
  {
    int i = mRatingStyle;
    if (((i == 3) || (i == 4) || (i == 5)) && (isRated())) {
      return mRatingValue;
    }
    return -1.0F;
  }
  
  public boolean hasHeart()
  {
    int i = mRatingStyle;
    boolean bool = false;
    if (i != 1) {
      return false;
    }
    if (mRatingValue == 1.0F) {
      bool = true;
    }
    return bool;
  }
  
  public boolean isRated()
  {
    boolean bool;
    if (mRatingValue >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isThumbUp()
  {
    int i = mRatingStyle;
    boolean bool = false;
    if (i != 2) {
      return false;
    }
    if (mRatingValue == 1.0F) {
      bool = true;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Rating:style=");
    localStringBuilder.append(mRatingStyle);
    localStringBuilder.append(" rating=");
    float f = mRatingValue;
    String str;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mRatingStyle);
    paramParcel.writeFloat(mRatingValue);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static float getPercentRating(Rating paramRating)
    {
      return paramRating.getPercentRating();
    }
    
    @DoNotInline
    public static int getRatingStyle(Rating paramRating)
    {
      return paramRating.getRatingStyle();
    }
    
    @DoNotInline
    public static float getStarRating(Rating paramRating)
    {
      return paramRating.getStarRating();
    }
    
    @DoNotInline
    public static boolean hasHeart(Rating paramRating)
    {
      return paramRating.hasHeart();
    }
    
    @DoNotInline
    public static boolean isRated(Rating paramRating)
    {
      return paramRating.isRated();
    }
    
    @DoNotInline
    public static boolean isThumbUp(Rating paramRating)
    {
      return paramRating.isThumbUp();
    }
    
    @DoNotInline
    public static Rating newHeartRating(boolean paramBoolean)
    {
      return Rating.newHeartRating(paramBoolean);
    }
    
    @DoNotInline
    public static Rating newPercentageRating(float paramFloat)
    {
      return Rating.newPercentageRating(paramFloat);
    }
    
    @DoNotInline
    public static Rating newStarRating(int paramInt, float paramFloat)
    {
      return Rating.newStarRating(paramInt, paramFloat);
    }
    
    @DoNotInline
    public static Rating newThumbRating(boolean paramBoolean)
    {
      return Rating.newThumbRating(paramBoolean);
    }
    
    @DoNotInline
    public static Rating newUnratedRating(int paramInt)
    {
      return Rating.newUnratedRating(paramInt);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface StarStyle {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Style {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */