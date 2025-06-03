package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\026\n\000\n\002\020\b\n\002\030\002\n\002\020\007\n\002\030\002\n\002\b\t\032\r\020\000\032\0020\001*\0020\002H\n\032\r\020\000\032\0020\003*\0020\004H\n\032\r\020\005\032\0020\001*\0020\002H\n\032\r\020\005\032\0020\003*\0020\004H\n\032\025\020\006\032\0020\002*\0020\0022\006\020\007\032\0020\002H\n\032\025\020\006\032\0020\002*\0020\0022\006\020\b\032\0020\001H\n\032\025\020\006\032\0020\004*\0020\0042\006\020\007\032\0020\004H\n\032\025\020\006\032\0020\004*\0020\0042\006\020\b\032\0020\003H\n\032\025\020\t\032\0020\002*\0020\0022\006\020\007\032\0020\002H\n\032\025\020\t\032\0020\002*\0020\0022\006\020\b\032\0020\001H\n\032\025\020\t\032\0020\004*\0020\0042\006\020\007\032\0020\004H\n\032\025\020\t\032\0020\004*\0020\0042\006\020\b\032\0020\003H\n\032\r\020\n\032\0020\002*\0020\004H\b\032\r\020\013\032\0020\004*\0020\002H\b\032\r\020\f\032\0020\002*\0020\002H\n\032\r\020\f\032\0020\004*\0020\004H\n¨\006\r"}, d2={"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "minus", "p", "xy", "plus", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class PointKt
{
  public static final float component1(@NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    return x;
  }
  
  public static final int component1(@NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    return x;
  }
  
  public static final float component2(@NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    return y;
  }
  
  public static final int component2(@NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    return y;
  }
  
  @NotNull
  public static final Point minus(@NotNull Point paramPoint, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    paramPoint = new Point(x, y);
    paramInt = -paramInt;
    paramPoint.offset(paramInt, paramInt);
    return paramPoint;
  }
  
  @NotNull
  public static final Point minus(@NotNull Point paramPoint1, @NotNull Point paramPoint2)
  {
    Intrinsics.checkNotNullParameter(paramPoint1, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint2, "p");
    paramPoint1 = new Point(x, y);
    paramPoint1.offset(-x, -y);
    return paramPoint1;
  }
  
  @NotNull
  public static final PointF minus(@NotNull PointF paramPointF, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    paramPointF = new PointF(x, y);
    paramFloat = -paramFloat;
    paramPointF.offset(paramFloat, paramFloat);
    return paramPointF;
  }
  
  @NotNull
  public static final PointF minus(@NotNull PointF paramPointF1, @NotNull PointF paramPointF2)
  {
    Intrinsics.checkNotNullParameter(paramPointF1, "<this>");
    Intrinsics.checkNotNullParameter(paramPointF2, "p");
    paramPointF1 = new PointF(x, y);
    paramPointF1.offset(-x, -y);
    return paramPointF1;
  }
  
  @NotNull
  public static final Point plus(@NotNull Point paramPoint, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    paramPoint = new Point(x, y);
    paramPoint.offset(paramInt, paramInt);
    return paramPoint;
  }
  
  @NotNull
  public static final Point plus(@NotNull Point paramPoint1, @NotNull Point paramPoint2)
  {
    Intrinsics.checkNotNullParameter(paramPoint1, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint2, "p");
    paramPoint1 = new Point(x, y);
    paramPoint1.offset(x, y);
    return paramPoint1;
  }
  
  @NotNull
  public static final PointF plus(@NotNull PointF paramPointF, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    paramPointF = new PointF(x, y);
    paramPointF.offset(paramFloat, paramFloat);
    return paramPointF;
  }
  
  @NotNull
  public static final PointF plus(@NotNull PointF paramPointF1, @NotNull PointF paramPointF2)
  {
    Intrinsics.checkNotNullParameter(paramPointF1, "<this>");
    Intrinsics.checkNotNullParameter(paramPointF2, "p");
    paramPointF1 = new PointF(x, y);
    paramPointF1.offset(x, y);
    return paramPointF1;
  }
  
  @NotNull
  public static final Point toPoint(@NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    return new Point((int)x, (int)y);
  }
  
  @NotNull
  public static final PointF toPointF(@NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    return new PointF(paramPoint);
  }
  
  @NotNull
  public static final Point unaryMinus(@NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramPoint, "<this>");
    return new Point(-x, -y);
  }
  
  @NotNull
  public static final PointF unaryMinus(@NotNull PointF paramPointF)
  {
    Intrinsics.checkNotNullParameter(paramPointF, "<this>");
    return new PointF(-x, -y);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PointKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */