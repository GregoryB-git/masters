package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ClosedRange.DefaultImpls;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\r\n\000\n\002\030\002\n\002\b\007*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001R\034\020\002\032\n \003*\004\030\0018\0008\0008VX\004¢\006\006\032\004\b\004\020\005R\034\020\006\032\n \003*\004\030\0018\0008\0008VX\004¢\006\006\032\004\b\007\020\005¨\006\b"}, d2={"androidx/core/util/RangeKt$toClosedRange$1", "Lkotlin/ranges/ClosedRange;", "endInclusive", "kotlin.jvm.PlatformType", "getEndInclusive", "()Ljava/lang/Comparable;", "start", "getStart", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class RangeKt$toClosedRange$1
  implements ClosedRange<T>
{
  public RangeKt$toClosedRange$1(Range<T> paramRange) {}
  
  public boolean contains(@NotNull T paramT)
  {
    return ClosedRange.DefaultImpls.contains(this, paramT);
  }
  
  public T getEndInclusive()
  {
    return $this_toClosedRange.getUpper();
  }
  
  public T getStart()
  {
    return $this_toClosedRange.getLower();
  }
  
  public boolean isEmpty()
  {
    return ClosedRange.DefaultImpls.isEmpty(this);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.RangeKt.toClosedRange.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */