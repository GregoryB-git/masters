package androidx.core.transition;

import android.annotation.SuppressLint;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000 \n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\013\032É\001\020\000\032\0020\001*\0020\0022#\b\006\020\003\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\t\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\n\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\013\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\f\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\r\032\0020\001*\0020\0022#\b\004\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\017\032\0020\001*\0020\0022#\b\004\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\020\032\0020\001*\0020\0022#\b\004\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\021\032\0020\001*\0020\0022#\b\004\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\022\032\0020\001*\0020\0022#\b\004\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\002\007\n\005\b20\001¨\006\023"}, d2={"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class TransitionKt
{
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener addListener(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction11, @NotNull final Function1<? super Transition, Unit> paramFunction12, @NotNull final Function1<? super Transition, Unit> paramFunction13, @NotNull final Function1<? super Transition, Unit> paramFunction14, @NotNull final Function1<? super Transition, Unit> paramFunction15)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "onEnd");
    Intrinsics.checkNotNullParameter(paramFunction12, "onStart");
    Intrinsics.checkNotNullParameter(paramFunction13, "onCancel");
    Intrinsics.checkNotNullParameter(paramFunction14, "onResume");
    Intrinsics.checkNotNullParameter(paramFunction15, "onPause");
    paramFunction11 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        paramFunction13.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onEnd.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        paramFunction15.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        paramFunction14.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        paramFunction12.invoke(paramAnonymousTransition);
      }
    };
    paramTransition.addListener(paramFunction11);
    return paramFunction11;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener doOnCancel(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onCancel.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
    };
    paramTransition.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener doOnEnd(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onEnd.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
    };
    paramTransition.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener doOnPause(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onPause.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
    };
    paramTransition.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener doOnResume(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onResume.invoke(paramAnonymousTransition);
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
    };
    paramTransition.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Transition.TransitionListener doOnStart(@NotNull Transition paramTransition, @NotNull Function1<? super Transition, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Transition.TransitionListener()
    {
      public void onTransitionCancel(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionEnd(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionPause(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionResume(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
      }
      
      public void onTransitionStart(@NotNull Transition paramAnonymousTransition)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousTransition, "transition");
        $onStart.invoke(paramAnonymousTransition);
      }
    };
    paramTransition.addListener(paramFunction1);
    return paramFunction1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.transition.TransitionKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */