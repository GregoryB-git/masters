package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import android.graphics.Path.Op;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\034\n\000\n\002\030\002\n\002\b\002\n\002\020\034\n\002\030\002\n\000\n\002\020\007\n\002\b\005\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\034\020\003\032\b\022\004\022\0020\0050\004*\0020\0012\b\b\002\020\006\032\0020\007H\007\032\025\020\b\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\t\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\n\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\013\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f¨\006\f"}, d2={"and", "Landroid/graphics/Path;", "p", "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class PathKt
{
  @RequiresApi(19)
  @NotNull
  public static final Path and(@NotNull Path paramPath1, @NotNull Path paramPath2)
  {
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "p");
    Path localPath = new Path();
    localPath.op(paramPath1, paramPath2, Path.Op.INTERSECT);
    return localPath;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Iterable<PathSegment> flatten(@NotNull Path paramPath, float paramFloat)
  {
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    paramPath = PathUtils.flatten(paramPath, paramFloat);
    Intrinsics.checkNotNullExpressionValue(paramPath, "flatten(this, error)");
    return paramPath;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Path minus(@NotNull Path paramPath1, @NotNull Path paramPath2)
  {
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "p");
    paramPath1 = new Path(paramPath1);
    paramPath1.op(paramPath2, Path.Op.DIFFERENCE);
    return paramPath1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Path or(@NotNull Path paramPath1, @NotNull Path paramPath2)
  {
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "p");
    paramPath1 = new Path(paramPath1);
    paramPath1.op(paramPath2, Path.Op.UNION);
    return paramPath1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Path plus(@NotNull Path paramPath1, @NotNull Path paramPath2)
  {
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "p");
    paramPath1 = new Path(paramPath1);
    paramPath1.op(paramPath2, Path.Op.UNION);
    return paramPath1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Path xor(@NotNull Path paramPath1, @NotNull Path paramPath2)
  {
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "p");
    paramPath1 = new Path(paramPath1);
    paramPath1.op(paramPath2, Path.Op.XOR);
    return paramPath1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PathKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */