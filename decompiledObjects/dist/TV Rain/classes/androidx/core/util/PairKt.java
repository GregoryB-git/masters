package androidx.core.util;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\032\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\032*\020\000\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\003H\n¢\006\002\020\004\032*\020\000\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\005H\n¢\006\002\020\006\032*\020\007\032\002H\002\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\003H\n¢\006\002\020\004\032*\020\007\032\002H\002\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\005H\n¢\006\002\020\006\0321\020\b\032\016\022\004\022\002H\001\022\004\022\002H\0020\003\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\tH\b\0321\020\n\032\016\022\004\022\002H\001\022\004\022\002H\0020\005\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\tH\b\0321\020\013\032\016\022\004\022\002H\001\022\004\022\002H\0020\t\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\003H\b\0321\020\013\032\016\022\004\022\002H\001\022\004\022\002H\0020\t\"\004\b\000\020\001\"\004\b\001\020\002*\016\022\004\022\002H\001\022\004\022\002H\0020\005H\b¨\006\f"}, d2={"component1", "F", "S", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "Landroidx/core/util/Pair;", "(Landroidx/core/util/Pair;)Ljava/lang/Object;", "component2", "toAndroidPair", "Lkotlin/Pair;", "toAndroidXPair", "toKotlinPair", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class PairKt
{
  @SuppressLint({"UnknownNullness"})
  public static final <F, S> F component1(@NotNull android.util.Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (F)first;
  }
  
  @SuppressLint({"UnknownNullness"})
  public static final <F, S> F component1(@NotNull Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (F)first;
  }
  
  @SuppressLint({"UnknownNullness"})
  public static final <F, S> S component2(@NotNull android.util.Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (S)second;
  }
  
  @SuppressLint({"UnknownNullness"})
  public static final <F, S> S component2(@NotNull Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (S)second;
  }
  
  @NotNull
  public static final <F, S> android.util.Pair<F, S> toAndroidPair(@NotNull kotlin.Pair<? extends F, ? extends S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return new android.util.Pair(paramPair.getFirst(), paramPair.getSecond());
  }
  
  @NotNull
  public static final <F, S> Pair<F, S> toAndroidXPair(@NotNull kotlin.Pair<? extends F, ? extends S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return new Pair(paramPair.getFirst(), paramPair.getSecond());
  }
  
  @NotNull
  public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@NotNull android.util.Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return new kotlin.Pair(first, second);
  }
  
  @NotNull
  public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@NotNull Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return new kotlin.Pair(first, second);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.PairKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */