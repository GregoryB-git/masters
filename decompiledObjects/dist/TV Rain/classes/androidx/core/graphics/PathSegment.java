package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import z2;

public final class PathSegment
{
  private final PointF mEnd;
  private final float mEndFraction;
  private final PointF mStart;
  private final float mStartFraction;
  
  public PathSegment(@NonNull PointF paramPointF1, float paramFloat1, @NonNull PointF paramPointF2, float paramFloat2)
  {
    mStart = ((PointF)Preconditions.checkNotNull(paramPointF1, "start == null"));
    mStartFraction = paramFloat1;
    mEnd = ((PointF)Preconditions.checkNotNull(paramPointF2, "end == null"));
    mEndFraction = paramFloat2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof PathSegment)) {
      return false;
    }
    paramObject = (PathSegment)paramObject;
    if ((Float.compare(mStartFraction, mStartFraction) != 0) || (Float.compare(mEndFraction, mEndFraction) != 0) || (!mStart.equals(mStart)) || (!mEnd.equals(mEnd))) {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public PointF getEnd()
  {
    return mEnd;
  }
  
  public float getEndFraction()
  {
    return mEndFraction;
  }
  
  @NonNull
  public PointF getStart()
  {
    return mStart;
  }
  
  public float getStartFraction()
  {
    return mStartFraction;
  }
  
  public int hashCode()
  {
    int i = mStart.hashCode();
    float f = mStartFraction;
    int j = 0;
    int k;
    if (f != 0.0F) {
      k = Float.floatToIntBits(f);
    } else {
      k = 0;
    }
    int m = mEnd.hashCode();
    f = mEndFraction;
    if (f != 0.0F) {
      j = Float.floatToIntBits(f);
    }
    return (m + (i * 31 + k) * 31) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("PathSegment{start=");
    localStringBuilder.append(mStart);
    localStringBuilder.append(", startFraction=");
    localStringBuilder.append(mStartFraction);
    localStringBuilder.append(", end=");
    localStringBuilder.append(mEnd);
    localStringBuilder.append(", endFraction=");
    localStringBuilder.append(mEndFraction);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PathSegment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */