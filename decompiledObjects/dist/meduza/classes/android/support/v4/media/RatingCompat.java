package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import f;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
  public final int a;
  public final float b;
  public Object c;
  
  public RatingCompat(float paramFloat, int paramInt)
  {
    a = paramInt;
    b = paramFloat;
  }
  
  public static RatingCompat a(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramObject != null)
    {
      localObject1 = (Rating)paramObject;
      int i = b.b((Rating)localObject1);
      if (b.e((Rating)localObject1))
      {
        float f = 1.0F;
        switch (i)
        {
        default: 
          return null;
        case 6: 
          f = b.a((Rating)localObject1);
          if ((f >= 0.0F) && (f <= 100.0F))
          {
            localObject1 = new RatingCompat(f, 6);
          }
          else
          {
            Log.e("Rating", "Invalid percentage-based rating value");
            localObject1 = localObject2;
          }
          break;
        case 3: 
        case 4: 
        case 5: 
          localObject1 = b(b.c((Rating)localObject1), i);
          break;
        case 2: 
          if (!b.f((Rating)localObject1)) {
            f = 0.0F;
          }
          localObject1 = new RatingCompat(f, 2);
          break;
        case 1: 
          if (!b.d((Rating)localObject1)) {
            f = 0.0F;
          }
          localObject1 = new RatingCompat(f, 1);
        }
      }
      else
      {
        localObject1 = c(i);
      }
      c = paramObject;
    }
    return (RatingCompat)localObject1;
  }
  
  public static RatingCompat b(float paramFloat, int paramInt)
  {
    if (paramInt != 3) {
      if (paramInt != 4) {
        if (paramInt != 5)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Invalid rating style (");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(") for a star rating");
        }
      }
    }
    for (Object localObject = ((StringBuilder)localObject).toString();; localObject = "Trying to set out of range star-based rating")
    {
      Log.e("Rating", (String)localObject);
      return null;
      float f = 5.0F;
      break label72;
      f = 4.0F;
      break label72;
      f = 3.0F;
      label72:
      if ((paramFloat >= 0.0F) && (paramFloat <= f)) {
        return new RatingCompat(paramFloat, paramInt);
      }
    }
  }
  
  public static RatingCompat c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new RatingCompat(-1.0F, paramInt);
  }
  
  public final int describeContents()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Rating:style=");
    localStringBuilder.append(a);
    localStringBuilder.append(" rating=");
    float f = b;
    String str;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeFloat(b);
  }
  
  public final class a
    implements Parcelable.Creator<RatingCompat>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      int i = paramParcel.readInt();
      return new RatingCompat(paramParcel.readFloat(), i);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new RatingCompat[paramInt];
    }
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */