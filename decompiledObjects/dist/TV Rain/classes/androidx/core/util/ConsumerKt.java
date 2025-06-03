package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\036\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\007¨\006\004"}, d2={"asConsumer", "Ljava/util/function/Consumer;", "T", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@RequiresApi(24)
public final class ConsumerKt
{
  @RequiresApi(24)
  @NotNull
  public static final <T> Consumer<T> asConsumer(@NotNull Continuation<? super T> paramContinuation)
  {
    Intrinsics.checkNotNullParameter(paramContinuation, "<this>");
    return new ContinuationConsumer(paramContinuation);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.ConsumerKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */