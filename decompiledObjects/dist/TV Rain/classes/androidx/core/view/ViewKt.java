package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000j\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\t\n\002\020\b\n\002\b\r\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\n\0325\020 \032\0020!*\0020\0022#\b\004\020\"\032\035\022\023\022\0210\002¢\006\f\b$\022\b\b%\022\004\b\b(&\022\004\022\0020!0#H\bø\001\000\0325\020'\032\0020!*\0020\0022#\b\004\020\"\032\035\022\023\022\0210\002¢\006\f\b$\022\b\b%\022\004\b\b(&\022\004\022\0020!0#H\bø\001\000\0325\020(\032\0020!*\0020\0022#\b\004\020\"\032\035\022\023\022\0210\002¢\006\f\b$\022\b\b%\022\004\b\b(&\022\004\022\0020!0#H\bø\001\000\0325\020)\032\0020!*\0020\0022#\b\004\020\"\032\035\022\023\022\0210\002¢\006\f\b$\022\b\b%\022\004\b\b(&\022\004\022\0020!0#H\bø\001\000\0325\020*\032\0020+*\0020\0022#\b\004\020\"\032\035\022\023\022\0210\002¢\006\f\b$\022\b\b%\022\004\b\b(&\022\004\022\0020!0#H\bø\001\000\032\024\020,\032\0020-*\0020\0022\b\b\002\020.\032\0020/\032(\0200\032\00201*\0020\0022\006\0202\032\002032\016\b\004\020\"\032\b\022\004\022\0020!04H\bø\001\000\032\"\0205\032\00201*\0020\0022\006\0202\032\002032\f\020\"\032\b\022\004\022\0020!04H\007\032\027\0206\032\0020!*\0020\0022\b\b\001\0207\032\0020\023H\b\032:\0208\032\0020!\"\n\b\000\0209\030\001*\0020:*\0020\0022\027\020;\032\023\022\004\022\002H9\022\004\022\0020!0#¢\006\002\b<H\bø\001\000¢\006\002\b=\032)\0208\032\0020!*\0020\0022\027\020;\032\023\022\004\022\0020:\022\004\022\0020!0#¢\006\002\b<H\bø\001\000\0325\020>\032\0020!*\0020\0022\b\b\003\020?\032\0020\0232\b\b\003\020@\032\0020\0232\b\b\003\020A\032\0020\0232\b\b\003\020B\032\0020\023H\b\0325\020C\032\0020!*\0020\0022\b\b\003\020D\032\0020\0232\b\b\003\020@\032\0020\0232\b\b\003\020E\032\0020\0232\b\b\003\020B\032\0020\023H\b\"\033\020\000\032\b\022\004\022\0020\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\033\020\005\032\b\022\004\022\0020\0060\001*\0020\0028F¢\006\006\032\004\b\007\020\004\"*\020\n\032\0020\t*\0020\0022\006\020\b\032\0020\t8Æ\002@Æ\002X\016¢\006\f\032\004\b\n\020\013\"\004\b\f\020\r\"*\020\016\032\0020\t*\0020\0022\006\020\b\032\0020\t8Æ\002@Æ\002X\016¢\006\f\032\004\b\016\020\013\"\004\b\017\020\r\"*\020\020\032\0020\t*\0020\0022\006\020\b\032\0020\t8Æ\002@Æ\002X\016¢\006\f\032\004\b\020\020\013\"\004\b\021\020\r\"\026\020\022\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\024\020\025\"\026\020\026\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\027\020\025\"\026\020\030\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\031\020\025\"\026\020\032\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\033\020\025\"\026\020\034\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\035\020\025\"\026\020\036\032\0020\023*\0020\0028Æ\002¢\006\006\032\004\b\037\020\025\002\007\n\005\b20\001¨\006F"}, d2={"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class ViewKt
{
  public static final void doOnAttach(@NotNull View paramView, @NotNull final Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    if (ViewCompat.isAttachedToWindow(paramView)) {
      paramFunction1.invoke(paramView);
    } else {
      paramView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
      {
        public void onViewAttachedToWindow(@NotNull View paramAnonymousView)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
          $this_doOnAttach.removeOnAttachStateChangeListener(this);
          paramFunction1.invoke(paramAnonymousView);
        }
        
        public void onViewDetachedFromWindow(@NotNull View paramAnonymousView)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
        }
      });
    }
  }
  
  public static final void doOnDetach(@NotNull View paramView, @NotNull final Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    if (!ViewCompat.isAttachedToWindow(paramView)) {
      paramFunction1.invoke(paramView);
    } else {
      paramView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
      {
        public void onViewAttachedToWindow(@NotNull View paramAnonymousView)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
        }
        
        public void onViewDetachedFromWindow(@NotNull View paramAnonymousView)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
          $this_doOnDetach.removeOnAttachStateChangeListener(this);
          paramFunction1.invoke(paramAnonymousView);
        }
      });
    }
  }
  
  public static final void doOnLayout(@NotNull View paramView, @NotNull Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    if ((ViewCompat.isLaidOut(paramView)) && (!paramView.isLayoutRequested())) {
      paramFunction1.invoke(paramView);
    } else {
      paramView.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public void onLayoutChange(@NotNull View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
          paramAnonymousView.removeOnLayoutChangeListener(this);
          $action$inlined.invoke(paramAnonymousView);
        }
      });
    }
  }
  
  public static final void doOnNextLayout(@NotNull View paramView, @NotNull Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramView.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public void onLayoutChange(@NotNull View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousView, "view");
        paramAnonymousView.removeOnLayoutChangeListener(this);
        $action.invoke(paramAnonymousView);
      }
    });
  }
  
  @NotNull
  public static final OneShotPreDrawListener doOnPreDraw(@NotNull final View paramView, @NotNull Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramView = OneShotPreDrawListener.add(paramView, new Runnable()
    {
      public final void run()
      {
        $action.invoke(paramView);
      }
    });
    Intrinsics.checkNotNullExpressionValue(paramView, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
    return paramView;
  }
  
  @NotNull
  public static final Bitmap drawToBitmap(@NotNull View paramView, @NotNull Bitmap.Config paramConfig)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramConfig, "config");
    if (ViewCompat.isLaidOut(paramView))
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), paramConfig);
      Intrinsics.checkNotNullExpressionValue(localBitmap, "createBitmap(width, height, config)");
      paramConfig = new Canvas(localBitmap);
      paramConfig.translate(-paramView.getScrollX(), -paramView.getScrollY());
      paramView.draw(paramConfig);
      return localBitmap;
    }
    throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
  }
  
  @NotNull
  public static final Sequence<View> getAllViews(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    SequencesKt.sequence(new RestrictedSuspendLambda(paramView, null)
    {
      public int label;
      
      @NotNull
      public final Continuation<Unit> create(@Nullable Object paramAnonymousObject, @NotNull Continuation<?> paramAnonymousContinuation)
      {
        paramAnonymousContinuation = new 1($this_allViews, paramAnonymousContinuation);
        L$0 = paramAnonymousObject;
        return paramAnonymousContinuation;
      }
      
      @Nullable
      public final Object invoke(@NotNull SequenceScope<? super View> paramAnonymousSequenceScope, @Nullable Continuation<? super Unit> paramAnonymousContinuation)
      {
        return ((1)create(paramAnonymousSequenceScope, paramAnonymousContinuation)).invokeSuspend(Unit.INSTANCE);
      }
      
      @Nullable
      public final Object invokeSuspend(@NotNull Object paramAnonymousObject)
      {
        Object localObject1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = label;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2)
            {
              ResultKt.throwOnFailure(paramAnonymousObject);
              break label153;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
          localObject2 = (SequenceScope)L$0;
          ResultKt.throwOnFailure(paramAnonymousObject);
          paramAnonymousObject = localObject2;
        }
        else
        {
          ResultKt.throwOnFailure(paramAnonymousObject);
          localObject2 = (SequenceScope)L$0;
          View localView = $this_allViews;
          L$0 = localObject2;
          label = 1;
          paramAnonymousObject = localObject2;
          if (((SequenceScope)localObject2).yield(localView, this) == localObject1) {
            return localObject1;
          }
        }
        Object localObject2 = $this_allViews;
        if ((localObject2 instanceof ViewGroup))
        {
          localObject2 = ViewGroupKt.getDescendants((ViewGroup)localObject2);
          L$0 = null;
          label = 2;
          if (((SequenceScope)paramAnonymousObject).yieldAll((Sequence)localObject2, this) == localObject1) {
            return localObject1;
          }
        }
        label153:
        return Unit.INSTANCE;
      }
    });
  }
  
  @NotNull
  public static final Sequence<ViewParent> getAncestors(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    return SequencesKt.generateSequence(paramView.getParent(), ancestors.1.INSTANCE);
  }
  
  public static final int getMarginBottom(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      paramView = (ViewGroup.MarginLayoutParams)paramView;
    } else {
      paramView = null;
    }
    int i;
    if (paramView != null) {
      i = bottomMargin;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final int getMarginEnd(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    int i;
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      i = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams)paramView);
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final int getMarginLeft(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      paramView = (ViewGroup.MarginLayoutParams)paramView;
    } else {
      paramView = null;
    }
    int i;
    if (paramView != null) {
      i = leftMargin;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final int getMarginRight(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      paramView = (ViewGroup.MarginLayoutParams)paramView;
    } else {
      paramView = null;
    }
    int i;
    if (paramView != null) {
      i = rightMargin;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final int getMarginStart(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    int i;
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      i = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams)paramView);
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final int getMarginTop(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof ViewGroup.MarginLayoutParams)) {
      paramView = (ViewGroup.MarginLayoutParams)paramView;
    } else {
      paramView = null;
    }
    int i;
    if (paramView != null) {
      i = topMargin;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isGone(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    boolean bool;
    if (paramView.getVisibility() == 8) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean isInvisible(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    boolean bool;
    if (paramView.getVisibility() == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean isVisible(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    boolean bool;
    if (paramView.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public static final Runnable postDelayed(@NotNull View paramView, long paramLong, @NotNull Function0<Unit> paramFunction0)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "action");
    paramFunction0 = new Runnable()
    {
      public final void run()
      {
        $action.invoke();
      }
    };
    paramView.postDelayed(paramFunction0, paramLong);
    return paramFunction0;
  }
  
  @RequiresApi(16)
  @NotNull
  public static final Runnable postOnAnimationDelayed(@NotNull View paramView, long paramLong, @NotNull Function0<Unit> paramFunction0)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "action");
    paramFunction0 = new a(paramFunction0, 1);
    Api16Impl.postOnAnimationDelayed(paramView, paramFunction0, paramLong);
    return paramFunction0;
  }
  
  private static final void postOnAnimationDelayed$lambda-1(Function0 paramFunction0)
  {
    Intrinsics.checkNotNullParameter(paramFunction0, "$action");
    paramFunction0.invoke();
  }
  
  public static final void setGone(@NotNull View paramView, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    int i;
    if (paramBoolean) {
      i = 8;
    } else {
      i = 0;
    }
    paramView.setVisibility(i);
  }
  
  public static final void setInvisible(@NotNull View paramView, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    int i;
    if (paramBoolean) {
      i = 4;
    } else {
      i = 0;
    }
    paramView.setVisibility(i);
  }
  
  public static final void setPadding(@NotNull View paramView, @Px int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView.setPadding(paramInt, paramInt, paramInt, paramInt);
  }
  
  public static final void setVisible(@NotNull View paramView, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 8;
    }
    paramView.setVisibility(i);
  }
  
  public static final void updateLayoutParams(@NotNull View paramView, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
    {
      paramFunction1.invoke(localLayoutParams);
      paramView.setLayoutParams(localLayoutParams);
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
  }
  
  public static final void updatePadding(@NotNull View paramView, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(17)
  public static final void updatePaddingRelative(@NotNull View paramView, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */