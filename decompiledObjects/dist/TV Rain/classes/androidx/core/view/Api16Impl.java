package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\000\bÃ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\007¨\006\013"}, d2={"Landroidx/core/view/Api16Impl;", "", "()V", "postOnAnimationDelayed", "", "view", "Landroid/view/View;", "action", "Ljava/lang/Runnable;", "delayInMillis", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(16)
final class Api16Impl
{
  @NotNull
  public static final Api16Impl INSTANCE = new Api16Impl();
  
  @JvmStatic
  @DoNotInline
  public static final void postOnAnimationDelayed(@NotNull View paramView, @NotNull Runnable paramRunnable, long paramLong)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    Intrinsics.checkNotNullParameter(paramRunnable, "action");
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */