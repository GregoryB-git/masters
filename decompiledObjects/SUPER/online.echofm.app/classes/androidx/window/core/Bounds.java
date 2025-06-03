package androidx.window.core;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Bounds
{
  private final int bottom;
  private final int left;
  private final int right;
  private final int top;
  
  public Bounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    left = paramInt1;
    top = paramInt2;
    right = paramInt3;
    bottom = paramInt4;
  }
  
  public Bounds(@NotNull Rect paramRect)
  {
    this(left, top, right, bottom);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    Class localClass;
    if (paramObject == null) {
      localClass = null;
    } else {
      localClass = paramObject.getClass();
    }
    if (!Intrinsics.a(Bounds.class, localClass)) {
      return false;
    }
    if (paramObject != null)
    {
      paramObject = (Bounds)paramObject;
      if (left != left) {
        return false;
      }
      if (top != top) {
        return false;
      }
      if (right != right) {
        return false;
      }
      return bottom == bottom;
    }
    throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
  }
  
  public final int getBottom()
  {
    return bottom;
  }
  
  public final int getHeight()
  {
    return bottom - top;
  }
  
  public final int getLeft()
  {
    return left;
  }
  
  public final int getRight()
  {
    return right;
  }
  
  public final int getTop()
  {
    return top;
  }
  
  public final int getWidth()
  {
    return right - left;
  }
  
  public int hashCode()
  {
    return ((left * 31 + top) * 31 + right) * 31 + bottom;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if ((getHeight() != 0) && (getWidth() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isZero()
  {
    boolean bool;
    if ((getHeight() == 0) && (getWidth() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public final Rect toRect()
  {
    return new Rect(left, top, right, bottom);
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Bounds.class.getSimpleName());
    localStringBuilder.append(" { [");
    localStringBuilder.append(left);
    localStringBuilder.append(',');
    localStringBuilder.append(top);
    localStringBuilder.append(',');
    localStringBuilder.append(right);
    localStringBuilder.append(',');
    localStringBuilder.append(bottom);
    localStringBuilder.append("] }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.window.core.Bounds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */