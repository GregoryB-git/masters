package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000<\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\020\007\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\000\032\0020\003*\0020\0032\006\020\002\032\0020\003H\f\032\r\020\004\032\0020\005*\0020\001H\n\032\r\020\004\032\0020\006*\0020\003H\n\032\r\020\007\032\0020\005*\0020\001H\n\032\r\020\007\032\0020\006*\0020\003H\n\032\r\020\b\032\0020\005*\0020\001H\n\032\r\020\b\032\0020\006*\0020\003H\n\032\r\020\t\032\0020\005*\0020\001H\n\032\r\020\t\032\0020\006*\0020\003H\n\032\025\020\n\032\0020\013*\0020\0012\006\020\f\032\0020\rH\n\032\025\020\n\032\0020\013*\0020\0032\006\020\f\032\0020\016H\n\032\025\020\017\032\0020\001*\0020\0012\006\020\020\032\0020\rH\n\032\025\020\017\032\0020\021*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\017\032\0020\001*\0020\0012\006\020\020\032\0020\005H\n\032\025\020\017\032\0020\003*\0020\0032\006\020\020\032\0020\016H\n\032\025\020\017\032\0020\021*\0020\0032\006\020\002\032\0020\003H\n\032\025\020\017\032\0020\003*\0020\0032\006\020\020\032\0020\006H\n\032\025\020\022\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\022\032\0020\003*\0020\0032\006\020\002\032\0020\003H\f\032\025\020\023\032\0020\001*\0020\0012\006\020\020\032\0020\rH\n\032\025\020\023\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\023\032\0020\001*\0020\0012\006\020\020\032\0020\005H\n\032\025\020\023\032\0020\003*\0020\0032\006\020\020\032\0020\016H\n\032\025\020\023\032\0020\003*\0020\0032\006\020\002\032\0020\003H\n\032\025\020\023\032\0020\003*\0020\0032\006\020\020\032\0020\006H\n\032\025\020\024\032\0020\001*\0020\0012\006\020\025\032\0020\005H\n\032\025\020\024\032\0020\003*\0020\0032\006\020\025\032\0020\006H\n\032\025\020\024\032\0020\003*\0020\0032\006\020\025\032\0020\005H\n\032\r\020\026\032\0020\001*\0020\003H\b\032\r\020\027\032\0020\003*\0020\001H\b\032\r\020\030\032\0020\021*\0020\001H\b\032\r\020\030\032\0020\021*\0020\003H\b\032\025\020\031\032\0020\003*\0020\0032\006\020\032\032\0020\033H\b\032\025\020\034\032\0020\021*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\034\032\0020\021*\0020\0032\006\020\002\032\0020\003H\f¨\006\035"}, d2={"and", "Landroid/graphics/Rect;", "r", "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class RectKt
{
  @SuppressLint({"CheckResult"})
  @NotNull
  public static final Rect and(@NotNull Rect paramRect1, @NotNull Rect paramRect2)
  {
    Intrinsics.checkNotNullParameter(paramRect1, "<this>");
    Intrinsics.checkNotNullParameter(paramRect2, "r");
    paramRect1 = new Rect(paramRect1);
    paramRect1.intersect(paramRect2);
    return paramRect1;
  }
  
  @SuppressLint({"CheckResult"})
  @NotNull
  public static final RectF and(@NotNull RectF paramRectF1, @NotNull RectF paramRectF2)
  {
    Intrinsics.checkNotNullParameter(paramRectF1, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF2, "r");
    paramRectF1 = new RectF(paramRectF1);
    paramRectF1.intersect(paramRectF2);
    return paramRectF1;
  }
  
  public static final float component1(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    return left;
  }
  
  public static final int component1(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return left;
  }
  
  public static final float component2(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    return top;
  }
  
  public static final int component2(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return top;
  }
  
  public static final float component3(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    return right;
  }
  
  public static final int component3(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return right;
  }
  
  public static final float component4(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    return bottom;
  }
  
  public static final int component4(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return bottom;
  }
  
  public static final boolean contains(@NotNull Rect paramRect, @NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint, "p");
    return paramRect.contains(x, y);
  }
  
  public static final boolean contains(@NotNull RectF paramRectF, @NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Intrinsics.checkNotNullParameter(paramPointF, "p");
    return paramRectF.contains(x, y);
  }
  
  @NotNull
  public static final Rect minus(@NotNull Rect paramRect, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    paramRect = new Rect(paramRect);
    paramInt = -paramInt;
    paramRect.offset(paramInt, paramInt);
    return paramRect;
  }
  
  @NotNull
  public static final Rect minus(@NotNull Rect paramRect, @NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint, "xy");
    paramRect = new Rect(paramRect);
    paramRect.offset(-x, -y);
    return paramRect;
  }
  
  @NotNull
  public static final RectF minus(@NotNull RectF paramRectF, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    paramRectF = new RectF(paramRectF);
    paramFloat = -paramFloat;
    paramRectF.offset(paramFloat, paramFloat);
    return paramRectF;
  }
  
  @NotNull
  public static final RectF minus(@NotNull RectF paramRectF, @NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Intrinsics.checkNotNullParameter(paramPointF, "xy");
    paramRectF = new RectF(paramRectF);
    paramRectF.offset(-x, -y);
    return paramRectF;
  }
  
  @NotNull
  public static final Region minus(@NotNull Rect paramRect1, @NotNull Rect paramRect2)
  {
    Intrinsics.checkNotNullParameter(paramRect1, "<this>");
    Intrinsics.checkNotNullParameter(paramRect2, "r");
    paramRect1 = new Region(paramRect1);
    paramRect1.op(paramRect2, Region.Op.DIFFERENCE);
    return paramRect1;
  }
  
  @NotNull
  public static final Region minus(@NotNull RectF paramRectF1, @NotNull RectF paramRectF2)
  {
    Intrinsics.checkNotNullParameter(paramRectF1, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF2, "r");
    Rect localRect = new Rect();
    paramRectF1.roundOut(localRect);
    paramRectF1 = new Region(localRect);
    localRect = new Rect();
    paramRectF2.roundOut(localRect);
    paramRectF1.op(localRect, Region.Op.DIFFERENCE);
    return paramRectF1;
  }
  
  @NotNull
  public static final Rect or(@NotNull Rect paramRect1, @NotNull Rect paramRect2)
  {
    Intrinsics.checkNotNullParameter(paramRect1, "<this>");
    Intrinsics.checkNotNullParameter(paramRect2, "r");
    paramRect1 = new Rect(paramRect1);
    paramRect1.union(paramRect2);
    return paramRect1;
  }
  
  @NotNull
  public static final RectF or(@NotNull RectF paramRectF1, @NotNull RectF paramRectF2)
  {
    Intrinsics.checkNotNullParameter(paramRectF1, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF2, "r");
    paramRectF1 = new RectF(paramRectF1);
    paramRectF1.union(paramRectF2);
    return paramRectF1;
  }
  
  @NotNull
  public static final Rect plus(@NotNull Rect paramRect, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    paramRect = new Rect(paramRect);
    paramRect.offset(paramInt, paramInt);
    return paramRect;
  }
  
  @NotNull
  public static final Rect plus(@NotNull Rect paramRect, @NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint, "xy");
    paramRect = new Rect(paramRect);
    paramRect.offset(x, y);
    return paramRect;
  }
  
  @NotNull
  public static final Rect plus(@NotNull Rect paramRect1, @NotNull Rect paramRect2)
  {
    Intrinsics.checkNotNullParameter(paramRect1, "<this>");
    Intrinsics.checkNotNullParameter(paramRect2, "r");
    paramRect1 = new Rect(paramRect1);
    paramRect1.union(paramRect2);
    return paramRect1;
  }
  
  @NotNull
  public static final RectF plus(@NotNull RectF paramRectF, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    paramRectF = new RectF(paramRectF);
    paramRectF.offset(paramFloat, paramFloat);
    return paramRectF;
  }
  
  @NotNull
  public static final RectF plus(@NotNull RectF paramRectF, @NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Intrinsics.checkNotNullParameter(paramPointF, "xy");
    paramRectF = new RectF(paramRectF);
    paramRectF.offset(x, y);
    return paramRectF;
  }
  
  @NotNull
  public static final RectF plus(@NotNull RectF paramRectF1, @NotNull RectF paramRectF2)
  {
    Intrinsics.checkNotNullParameter(paramRectF1, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF2, "r");
    paramRectF1 = new RectF(paramRectF1);
    paramRectF1.union(paramRectF2);
    return paramRectF1;
  }
  
  @NotNull
  public static final Rect times(@NotNull Rect paramRect, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    paramRect = new Rect(paramRect);
    top *= paramInt;
    left *= paramInt;
    right *= paramInt;
    bottom *= paramInt;
    return paramRect;
  }
  
  @NotNull
  public static final RectF times(@NotNull RectF paramRectF, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    paramRectF = new RectF(paramRectF);
    top *= paramFloat;
    left *= paramFloat;
    right *= paramFloat;
    bottom *= paramFloat;
    return paramRectF;
  }
  
  @NotNull
  public static final RectF times(@NotNull RectF paramRectF, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    float f = paramInt;
    paramRectF = new RectF(paramRectF);
    top *= f;
    left *= f;
    right *= f;
    bottom *= f;
    return paramRectF;
  }
  
  @NotNull
  public static final Rect toRect(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Rect localRect = new Rect();
    paramRectF.roundOut(localRect);
    return localRect;
  }
  
  @NotNull
  public static final RectF toRectF(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return new RectF(paramRect);
  }
  
  @NotNull
  public static final Region toRegion(@NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRect, "<this>");
    return new Region(paramRect);
  }
  
  @NotNull
  public static final Region toRegion(@NotNull RectF paramRectF)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Rect localRect = new Rect();
    paramRectF.roundOut(localRect);
    return new Region(localRect);
  }
  
  @NotNull
  public static final RectF transform(@NotNull RectF paramRectF, @NotNull Matrix paramMatrix)
  {
    Intrinsics.checkNotNullParameter(paramRectF, "<this>");
    Intrinsics.checkNotNullParameter(paramMatrix, "m");
    paramMatrix.mapRect(paramRectF);
    return paramRectF;
  }
  
  @NotNull
  public static final Region xor(@NotNull Rect paramRect1, @NotNull Rect paramRect2)
  {
    Intrinsics.checkNotNullParameter(paramRect1, "<this>");
    Intrinsics.checkNotNullParameter(paramRect2, "r");
    paramRect1 = new Region(paramRect1);
    paramRect1.op(paramRect2, Region.Op.XOR);
    return paramRect1;
  }
  
  @NotNull
  public static final Region xor(@NotNull RectF paramRectF1, @NotNull RectF paramRectF2)
  {
    Intrinsics.checkNotNullParameter(paramRectF1, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF2, "r");
    Rect localRect = new Rect();
    paramRectF1.roundOut(localRect);
    paramRectF1 = new Region(localRect);
    localRect = new Rect();
    paramRectF2.roundOut(localRect);
    paramRectF1.op(localRect, Region.Op.XOR);
    return paramRectF1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.RectKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */