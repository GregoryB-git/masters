package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class SizeFCompat
{
  private final float mHeight;
  private final float mWidth;
  
  public SizeFCompat(float paramFloat1, float paramFloat2)
  {
    mWidth = Preconditions.checkArgumentFinite(paramFloat1, "width");
    mHeight = Preconditions.checkArgumentFinite(paramFloat2, "height");
  }
  
  @NonNull
  @RequiresApi(21)
  public static SizeFCompat toSizeFCompat(@NonNull SizeF paramSizeF)
  {
    return Api21Impl.toSizeFCompat(paramSizeF);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SizeFCompat)) {
      return false;
    }
    paramObject = (SizeFCompat)paramObject;
    if ((mWidth != mWidth) || (mHeight != mHeight)) {
      bool = false;
    }
    return bool;
  }
  
  public float getHeight()
  {
    return mHeight;
  }
  
  public float getWidth()
  {
    return mWidth;
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(mWidth) ^ Float.floatToIntBits(mHeight);
  }
  
  @NonNull
  @RequiresApi(21)
  public SizeF toSizeF()
  {
    return Api21Impl.toSizeF(this);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mWidth);
    localStringBuilder.append("x");
    localStringBuilder.append(mHeight);
    return localStringBuilder.toString();
  }
  
  @RequiresApi(21)
  public static final class Api21Impl
  {
    @DoNotInline
    @NonNull
    public static SizeF toSizeF(@NonNull SizeFCompat paramSizeFCompat)
    {
      Preconditions.checkNotNull(paramSizeFCompat);
      return new SizeF(paramSizeFCompat.getWidth(), paramSizeFCompat.getHeight());
    }
    
    @DoNotInline
    @NonNull
    public static SizeFCompat toSizeFCompat(@NonNull SizeF paramSizeF)
    {
      Preconditions.checkNotNull(paramSizeF);
      return new SizeFCompat(paramSizeF.getWidth(), paramSizeF.getHeight());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.SizeFCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */