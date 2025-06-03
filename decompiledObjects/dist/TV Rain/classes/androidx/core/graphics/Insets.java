package androidx.core.graphics;

import a;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import z2;

public final class Insets
{
  @NonNull
  public static final Insets NONE = new Insets(0, 0, 0, 0);
  public final int bottom;
  public final int left;
  public final int right;
  public final int top;
  
  private Insets(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    left = paramInt1;
    top = paramInt2;
    right = paramInt3;
    bottom = paramInt4;
  }
  
  @NonNull
  public static Insets add(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
  {
    return of(left + left, top + top, right + right, bottom + bottom);
  }
  
  @NonNull
  public static Insets max(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
  {
    return of(Math.max(left, left), Math.max(top, top), Math.max(right, right), Math.max(bottom, bottom));
  }
  
  @NonNull
  public static Insets min(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
  {
    return of(Math.min(left, left), Math.min(top, top), Math.min(right, right), Math.min(bottom, bottom));
  }
  
  @NonNull
  public static Insets of(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return NONE;
    }
    return new Insets(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @NonNull
  public static Insets of(@NonNull Rect paramRect)
  {
    return of(left, top, right, bottom);
  }
  
  @NonNull
  public static Insets subtract(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
  {
    return of(left - left, top - top, right - right, bottom - bottom);
  }
  
  @NonNull
  @RequiresApi(api=29)
  public static Insets toCompatInsets(@NonNull android.graphics.Insets paramInsets)
  {
    return of(left, top, right, bottom);
  }
  
  @Deprecated
  @NonNull
  @RequiresApi(api=29)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Insets wrap(@NonNull android.graphics.Insets paramInsets)
  {
    return toCompatInsets(paramInsets);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Insets.class == paramObject.getClass()))
    {
      paramObject = (Insets)paramObject;
      if (bottom != bottom) {
        return false;
      }
      if (left != left) {
        return false;
      }
      if (right != right) {
        return false;
      }
      return top == top;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((left * 31 + top) * 31 + right) * 31 + bottom;
  }
  
  @NonNull
  @RequiresApi(29)
  public android.graphics.Insets toPlatformInsets()
  {
    return Api29Impl.of(left, top, right, bottom);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Insets{left=");
    localStringBuilder.append(left);
    localStringBuilder.append(", top=");
    localStringBuilder.append(top);
    localStringBuilder.append(", right=");
    localStringBuilder.append(right);
    localStringBuilder.append(", bottom=");
    return a.n(localStringBuilder, bottom, '}');
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static android.graphics.Insets of(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return android.graphics.Insets.of(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.Insets
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */