package androidx.core.graphics;

import a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000>\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\013\0321\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\0321\020\000\032\0020\001*\0020\0022\006\020\b\032\0020\t2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\0321\020\000\032\0020\001*\0020\0022\006\020\b\032\0020\n2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032I\020\000\032\0020\001*\0020\0022\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\006\020\017\032\0020\f2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032I\020\000\032\0020\001*\0020\0022\006\020\013\032\0020\0202\006\020\r\032\0020\0202\006\020\016\032\0020\0202\006\020\017\032\0020\0202\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\0323\020\021\032\0020\001*\0020\0022\b\b\002\020\022\032\0020\0232\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032G\020\024\032\0020\001*\0020\0022\b\b\002\020\025\032\0020\f2\b\b\002\020\026\032\0020\f2\b\b\002\020\027\032\0020\f2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032)\020\030\032\0020\001*\0020\0022\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032Q\020\031\032\0020\001*\0020\0022\b\b\002\020\032\032\0020\f2\b\b\002\020\033\032\0020\f2\b\b\002\020\026\032\0020\f2\b\b\002\020\027\032\0020\f2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032=\020\034\032\0020\001*\0020\0022\b\b\002\020\032\032\0020\f2\b\b\002\020\033\032\0020\f2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\032=\020\035\032\0020\001*\0020\0022\b\b\002\020\032\032\0020\f2\b\b\002\020\033\032\0020\f2\027\020\005\032\023\022\004\022\0020\002\022\004\022\0020\0010\006¢\006\002\b\007H\bø\001\000\002\007\n\005\b20\001¨\006\036"}, d2={"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class CanvasKt
{
  public static final void withClip(@NotNull Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.clipRect(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withClip(@NotNull Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withClip(@NotNull Canvas paramCanvas, @NotNull Path paramPath, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramPath, "clipPath");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.clipPath(paramPath);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withClip(@NotNull Canvas paramCanvas, @NotNull Rect paramRect, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "clipRect");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.clipRect(paramRect);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withClip(@NotNull Canvas paramCanvas, @NotNull RectF paramRectF, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramRectF, "clipRect");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.clipRect(paramRectF);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withMatrix(@NotNull Canvas paramCanvas, @NotNull Matrix paramMatrix, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramMatrix, "matrix");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withRotation(@NotNull Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.rotate(paramFloat1, paramFloat2, paramFloat3);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withSave(@NotNull Canvas paramCanvas, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withScale(@NotNull Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.scale(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withSkew(@NotNull Canvas paramCanvas, float paramFloat1, float paramFloat2, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.skew(paramFloat1, paramFloat2);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
  
  public static final void withTranslation(@NotNull Canvas paramCanvas, float paramFloat1, float paramFloat2, @NotNull Function1<? super Canvas, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramCanvas, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    int i = paramCanvas.save();
    paramCanvas.translate(paramFloat1, paramFloat2);
    try
    {
      paramFunction1.invoke(paramCanvas);
      return;
    }
    finally
    {
      a.z(1, paramCanvas, i, 1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.CanvasKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */