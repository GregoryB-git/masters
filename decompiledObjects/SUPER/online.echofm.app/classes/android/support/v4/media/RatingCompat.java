package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
  public final int o;
  public final float p;
  public Object q;
  
  public RatingCompat(int paramInt, float paramFloat)
  {
    o = paramInt;
    p = paramFloat;
  }
  
  public static RatingCompat a(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      localObject = (Rating)paramObject;
      int i = b.b((Rating)localObject);
      if (b.e((Rating)localObject)) {
        switch (i)
        {
        default: 
          return null;
        case 6: 
          localObject = j(b.a((Rating)localObject));
          break;
        case 3: 
        case 4: 
        case 5: 
          localObject = k(i, b.c((Rating)localObject));
          break;
        case 2: 
          localObject = l(b.f((Rating)localObject));
          break;
        case 1: 
          localObject = i(b.d((Rating)localObject));
          break;
        }
      } else {
        localObject = m(i);
      }
      q = paramObject;
    }
    return (RatingCompat)localObject;
  }
  
  public static RatingCompat i(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(1, f);
  }
  
  public static RatingCompat j(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 100.0F)) {
      return new RatingCompat(6, paramFloat);
    }
    Log.e("Rating", "Invalid percentage-based rating value");
    return null;
  }
  
  public static RatingCompat k(int paramInt, float paramFloat)
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
        return new RatingCompat(paramInt, paramFloat);
      }
    }
  }
  
  public static RatingCompat l(boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    return new RatingCompat(2, f);
  }
  
  public static RatingCompat m(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new RatingCompat(paramInt, -1.0F);
  }
  
  public float b()
  {
    if ((o == 6) && (g())) {
      return p;
    }
    return -1.0F;
  }
  
  public Object c()
  {
    if (q == null)
    {
      int i;
      Rating localRating;
      if (g())
      {
        i = o;
        switch (i)
        {
        default: 
          return null;
        case 6: 
          localRating = b.h(b());
        }
      }
      for (;;)
      {
        q = localRating;
        break;
        localRating = b.i(i, e());
        continue;
        localRating = b.j(h());
        continue;
        localRating = b.g(f());
        continue;
        localRating = b.k(o);
      }
    }
    return q;
  }
  
  public int d()
  {
    return o;
  }
  
  public int describeContents()
  {
    return o;
  }
  
  public float e()
  {
    int i = o;
    if (((i == 3) || (i == 4) || (i == 5)) && (g())) {
      return p;
    }
    return -1.0F;
  }
  
  public boolean f()
  {
    int i = o;
    boolean bool = false;
    if (i != 1) {
      return false;
    }
    if (p == 1.0F) {
      bool = true;
    }
    return bool;
  }
  
  public boolean g()
  {
    boolean bool;
    if (p >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean h()
  {
    int i = o;
    boolean bool = false;
    if (i != 2) {
      return false;
    }
    if (p == 1.0F) {
      bool = true;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Rating:style=");
    localStringBuilder.append(o);
    localStringBuilder.append(" rating=");
    float f = p;
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
    paramParcel.writeInt(o);
    paramParcel.writeFloat(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public RatingCompat a(Parcel paramParcel)
    {
      return new RatingCompat(paramParcel.readInt(), paramParcel.readFloat());
    }
    
    public RatingCompat[] b(int paramInt)
    {
      return new RatingCompat[paramInt];
    }
  }
  
  public static abstract class b
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