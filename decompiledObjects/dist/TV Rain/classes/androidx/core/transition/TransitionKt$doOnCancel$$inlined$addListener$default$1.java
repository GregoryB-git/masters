package androidx.core.transition;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\t\032\0020\0032\006\020\004\032\0020\005H\026¨\006\n¸\006\000"}, d2={"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class TransitionKt$doOnCancel$$inlined$addListener$default$1
  implements Transition.TransitionListener
{
  public TransitionKt$doOnCancel$$inlined$addListener$default$1(Function1 paramFunction1) {}
  
  public void onTransitionCancel(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "transition");
    $onCancel.invoke(paramTransition);
  }
  
  public void onTransitionEnd(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "transition");
  }
  
  public void onTransitionPause(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "transition");
  }
  
  public void onTransitionResume(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "transition");
  }
  
  public void onTransitionStart(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "transition");
  }
}

/* Location:
 * Qualified Name:     androidx.core.transition.TransitionKt.doOnCancel..inlined.addListener.default.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */