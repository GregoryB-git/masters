package android.support.v4.media;

import android.media.Rating;

public final class RatingCompat$b
{
  public static float a(Rating paramRating)
  {
    return paramRating.getPercentRating();
  }
  
  public static int b(Rating paramRating)
  {
    return paramRating.getRatingStyle();
  }
  
  public static float c(Rating paramRating)
  {
    return paramRating.getStarRating();
  }
  
  public static boolean d(Rating paramRating)
  {
    return paramRating.hasHeart();
  }
  
  public static boolean e(Rating paramRating)
  {
    return paramRating.isRated();
  }
  
  public static boolean f(Rating paramRating)
  {
    return paramRating.isThumbUp();
  }
  
  public static Rating g(boolean paramBoolean)
  {
    return Rating.newHeartRating(paramBoolean);
  }
  
  public static Rating h(float paramFloat)
  {
    return Rating.newPercentageRating(paramFloat);
  }
  
  public static Rating i(int paramInt, float paramFloat)
  {
    return Rating.newStarRating(paramInt, paramFloat);
  }
  
  public static Rating j(boolean paramBoolean)
  {
    return Rating.newThumbRating(paramBoolean);
  }
  
  public static Rating k(int paramInt)
  {
    return Rating.newUnratedRating(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */