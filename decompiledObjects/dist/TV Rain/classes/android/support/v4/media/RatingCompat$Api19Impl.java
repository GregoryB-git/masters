package android.support.v4.media;

import android.media.Rating;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class RatingCompat$Api19Impl
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

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */