package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\034\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003¨\006\004"}, d2={"asAndroidXConsumer", "Landroidx/core/util/Consumer;", "T", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class AndroidXConsumerKt
{
  @NotNull
  public static final <T> Consumer<T> asAndroidXConsumer(@NotNull Continuation<? super T> paramContinuation)
  {
    Intrinsics.checkNotNullParameter(paramContinuation, "<this>");
    return new AndroidXContinuationConsumer(paramContinuation);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.AndroidXConsumerKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */