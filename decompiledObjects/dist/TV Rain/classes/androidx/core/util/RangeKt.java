package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ClosedRange.DefaultImpls;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\030\n\000\n\002\030\002\n\000\n\002\020\017\n\002\b\b\n\002\030\002\n\002\b\002\0327\020\000\032\b\022\004\022\002H\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\b\022\004\022\002H\0020\0012\f\020\004\032\b\022\004\022\002H\0020\001H\f\0326\020\005\032\b\022\004\022\002H\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\b\022\004\022\002H\0020\0012\006\020\006\032\002H\002H\n¢\006\002\020\007\0327\020\005\032\b\022\004\022\002H\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\b\022\004\022\002H\0020\0012\f\020\004\032\b\022\004\022\002H\0020\001H\n\0320\020\b\032\b\022\004\022\002H\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\002H\0022\006\020\t\032\002H\002H\f¢\006\002\020\n\032(\020\013\032\b\022\004\022\002H\0020\f\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\b\022\004\022\002H\0020\001H\007\032(\020\r\032\b\022\004\022\002H\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\003*\b\022\004\022\002H\0020\fH\007¨\006\016"}, d2={"and", "Landroid/util/Range;", "T", "", "other", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "rangeTo", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class RangeKt
{
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> Range<T> and(@NotNull Range<T> paramRange1, @NotNull Range<T> paramRange2)
  {
    Intrinsics.checkNotNullParameter(paramRange1, "<this>");
    Intrinsics.checkNotNullParameter(paramRange2, "other");
    paramRange1 = paramRange1.intersect(paramRange2);
    Intrinsics.checkNotNullExpressionValue(paramRange1, "intersect(other)");
    return paramRange1;
  }
  
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> Range<T> plus(@NotNull Range<T> paramRange1, @NotNull Range<T> paramRange2)
  {
    Intrinsics.checkNotNullParameter(paramRange1, "<this>");
    Intrinsics.checkNotNullParameter(paramRange2, "other");
    paramRange1 = paramRange1.extend(paramRange2);
    Intrinsics.checkNotNullExpressionValue(paramRange1, "extend(other)");
    return paramRange1;
  }
  
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> Range<T> plus(@NotNull Range<T> paramRange, @NotNull T paramT)
  {
    Intrinsics.checkNotNullParameter(paramRange, "<this>");
    Intrinsics.checkNotNullParameter(paramT, "value");
    paramRange = paramRange.extend(paramT);
    Intrinsics.checkNotNullExpressionValue(paramRange, "extend(value)");
    return paramRange;
  }
  
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> Range<T> rangeTo(@NotNull T paramT1, @NotNull T paramT2)
  {
    Intrinsics.checkNotNullParameter(paramT1, "<this>");
    Intrinsics.checkNotNullParameter(paramT2, "that");
    return new Range(paramT1, paramT2);
  }
  
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> ClosedRange<T> toClosedRange(@NotNull Range<T> paramRange)
  {
    Intrinsics.checkNotNullParameter(paramRange, "<this>");
    new ClosedRange()
    {
      public boolean contains(@NotNull T paramAnonymousT)
      {
        return ClosedRange.DefaultImpls.contains(this, paramAnonymousT);
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
    };
  }
  
  @RequiresApi(21)
  @NotNull
  public static final <T extends Comparable<? super T>> Range<T> toRange(@NotNull ClosedRange<T> paramClosedRange)
  {
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return new Range(paramClosedRange.getStart(), paramClosedRange.getEndInclusive());
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.RangeKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */