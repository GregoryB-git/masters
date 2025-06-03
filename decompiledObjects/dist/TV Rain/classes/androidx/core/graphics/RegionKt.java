package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\0004\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020(\n\002\b\007\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003H\f\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\004\032\0020\005*\0020\0012\006\020\006\032\0020\007H\n\0323\020\b\032\0020\t*\0020\0012!\020\n\032\035\022\023\022\0210\003¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\0020\t0\013H\bø\001\000\032\023\020\017\032\b\022\004\022\0020\0030\020*\0020\001H\002\032\025\020\021\032\0020\001*\0020\0012\006\020\002\032\0020\003H\n\032\025\020\021\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\r\020\022\032\0020\001*\0020\001H\n\032\025\020\023\032\0020\001*\0020\0012\006\020\002\032\0020\003H\f\032\025\020\023\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\024\032\0020\001*\0020\0012\006\020\002\032\0020\003H\n\032\025\020\024\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\r\020\025\032\0020\001*\0020\001H\n\032\025\020\026\032\0020\001*\0020\0012\006\020\002\032\0020\003H\f\032\025\020\026\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\002\007\n\005\b20\001¨\006\027"}, d2={"and", "Landroid/graphics/Region;", "r", "Landroid/graphics/Rect;", "contains", "", "p", "Landroid/graphics/Point;", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rect", "iterator", "", "minus", "not", "or", "plus", "unaryMinus", "xor", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class RegionKt
{
  @NotNull
  public static final Region and(@NotNull Region paramRegion, @NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "r");
    paramRegion = new Region(paramRegion);
    paramRegion.op(paramRect, Region.Op.INTERSECT);
    return paramRegion;
  }
  
  @NotNull
  public static final Region and(@NotNull Region paramRegion1, @NotNull Region paramRegion2)
  {
    Intrinsics.checkNotNullParameter(paramRegion1, "<this>");
    Intrinsics.checkNotNullParameter(paramRegion2, "r");
    paramRegion1 = new Region(paramRegion1);
    paramRegion1.op(paramRegion2, Region.Op.INTERSECT);
    return paramRegion1;
  }
  
  public static final boolean contains(@NotNull Region paramRegion, @NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramPoint, "p");
    return paramRegion.contains(x, y);
  }
  
  public static final void forEach(@NotNull Region paramRegion, @NotNull Function1<? super Rect, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramRegion = new RegionIterator(paramRegion);
    for (;;)
    {
      Rect localRect = new Rect();
      if (!paramRegion.next(localRect)) {
        return;
      }
      paramFunction1.invoke(localRect);
    }
  }
  
  @NotNull
  public static final Iterator<Rect> iterator(@NotNull Region paramRegion)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    new Iterator()
    {
      private boolean hasMore;
      @NotNull
      private final RegionIterator iterator;
      @NotNull
      private final Rect rect;
      
      public boolean hasNext()
      {
        return hasMore;
      }
      
      @NotNull
      public Rect next()
      {
        if (hasMore)
        {
          Rect localRect = new Rect(rect);
          hasMore = iterator.next(rect);
          return localRect;
        }
        throw new IndexOutOfBoundsException();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
  
  @NotNull
  public static final Region minus(@NotNull Region paramRegion, @NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "r");
    paramRegion = new Region(paramRegion);
    paramRegion.op(paramRect, Region.Op.DIFFERENCE);
    return paramRegion;
  }
  
  @NotNull
  public static final Region minus(@NotNull Region paramRegion1, @NotNull Region paramRegion2)
  {
    Intrinsics.checkNotNullParameter(paramRegion1, "<this>");
    Intrinsics.checkNotNullParameter(paramRegion2, "r");
    paramRegion1 = new Region(paramRegion1);
    paramRegion1.op(paramRegion2, Region.Op.DIFFERENCE);
    return paramRegion1;
  }
  
  @NotNull
  public static final Region not(@NotNull Region paramRegion)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Region localRegion = new Region(paramRegion.getBounds());
    localRegion.op(paramRegion, Region.Op.DIFFERENCE);
    return localRegion;
  }
  
  @NotNull
  public static final Region or(@NotNull Region paramRegion, @NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "r");
    paramRegion = new Region(paramRegion);
    paramRegion.union(paramRect);
    return paramRegion;
  }
  
  @NotNull
  public static final Region or(@NotNull Region paramRegion1, @NotNull Region paramRegion2)
  {
    Intrinsics.checkNotNullParameter(paramRegion1, "<this>");
    Intrinsics.checkNotNullParameter(paramRegion2, "r");
    paramRegion1 = new Region(paramRegion1);
    paramRegion1.op(paramRegion2, Region.Op.UNION);
    return paramRegion1;
  }
  
  @NotNull
  public static final Region plus(@NotNull Region paramRegion, @NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "r");
    paramRegion = new Region(paramRegion);
    paramRegion.union(paramRect);
    return paramRegion;
  }
  
  @NotNull
  public static final Region plus(@NotNull Region paramRegion1, @NotNull Region paramRegion2)
  {
    Intrinsics.checkNotNullParameter(paramRegion1, "<this>");
    Intrinsics.checkNotNullParameter(paramRegion2, "r");
    paramRegion1 = new Region(paramRegion1);
    paramRegion1.op(paramRegion2, Region.Op.UNION);
    return paramRegion1;
  }
  
  @NotNull
  public static final Region unaryMinus(@NotNull Region paramRegion)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Region localRegion = new Region(paramRegion.getBounds());
    localRegion.op(paramRegion, Region.Op.DIFFERENCE);
    return localRegion;
  }
  
  @NotNull
  public static final Region xor(@NotNull Region paramRegion, @NotNull Rect paramRect)
  {
    Intrinsics.checkNotNullParameter(paramRegion, "<this>");
    Intrinsics.checkNotNullParameter(paramRect, "r");
    paramRegion = new Region(paramRegion);
    paramRegion.op(paramRect, Region.Op.XOR);
    return paramRegion;
  }
  
  @NotNull
  public static final Region xor(@NotNull Region paramRegion1, @NotNull Region paramRegion2)
  {
    Intrinsics.checkNotNullParameter(paramRegion1, "<this>");
    Intrinsics.checkNotNullParameter(paramRegion2, "r");
    paramRegion1 = new Region(paramRegion1);
    paramRegion1.op(paramRegion2, Region.Op.XOR);
    return paramRegion1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.RegionKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */