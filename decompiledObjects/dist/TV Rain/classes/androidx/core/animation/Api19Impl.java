package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorPauseListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÃ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007¨\006\t"}, d2={"Landroidx/core/animation/Api19Impl;", "", "()V", "addPauseListener", "", "animator", "Landroid/animation/Animator;", "listener", "Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(19)
final class Api19Impl
{
  @NotNull
  public static final Api19Impl INSTANCE = new Api19Impl();
  
  @JvmStatic
  @DoNotInline
  public static final void addPauseListener(@NotNull Animator paramAnimator, @NotNull Animator.AnimatorPauseListener paramAnimatorPauseListener)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
    Intrinsics.checkNotNullParameter(paramAnimatorPauseListener, "listener");
    paramAnimator.addPauseListener(paramAnimatorPauseListener);
  }
}

/* Location:
 * Qualified Name:     androidx.core.animation.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */