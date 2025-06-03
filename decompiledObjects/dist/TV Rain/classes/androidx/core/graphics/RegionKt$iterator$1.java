package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\035\n\000\n\002\020(\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\t\020\b\032\0020\004H\002J\t\020\t\032\0020\002H\002R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\002X\004¢\006\002\n\000¨\006\n"}, d2={"androidx/core/graphics/RegionKt$iterator$1", "", "Landroid/graphics/Rect;", "hasMore", "", "iterator", "Landroid/graphics/RegionIterator;", "rect", "hasNext", "next", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class RegionKt$iterator$1
  implements Iterator<Rect>, KMappedMarker
{
  private boolean hasMore;
  @NotNull
  private final RegionIterator iterator;
  @NotNull
  private final Rect rect;
  
  public RegionKt$iterator$1(Region paramRegion)
  {
    paramRegion = new RegionIterator(paramRegion);
    iterator = paramRegion;
    Rect localRect = new Rect();
    rect = localRect;
    hasMore = paramRegion.next(localRect);
  }
  
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
}

/* Location:
 * Qualified Name:     androidx.core.graphics.RegionKt.iterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */