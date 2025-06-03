package androidx.core.view;

import a;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000T\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020)\n\002\b\003\n\002\030\002\n\002\b\t\032\025\020\020\032\0020\021*\0020\0032\006\020\022\032\0020\002H\n\0323\020\023\032\0020\024*\0020\0032!\020\025\032\035\022\023\022\0210\002¢\006\f\b\027\022\b\b\030\022\004\b\b(\022\022\004\022\0020\0240\026H\bø\001\000\032H\020\031\032\0020\024*\0020\00326\020\025\0322\022\023\022\0210\r¢\006\f\b\027\022\b\b\030\022\004\b\b(\033\022\023\022\0210\002¢\006\f\b\027\022\b\b\030\022\004\b\b(\022\022\004\022\0020\0240\032H\bø\001\000\032\025\020\034\032\0020\002*\0020\0032\006\020\033\032\0020\rH\002\032\r\020\035\032\0020\021*\0020\003H\b\032\r\020\036\032\0020\021*\0020\003H\b\032\023\020\037\032\b\022\004\022\0020\0020 *\0020\003H\002\032\025\020!\032\0020\024*\0020\0032\006\020\022\032\0020\002H\n\032\025\020\"\032\0020\024*\0020\0032\006\020\022\032\0020\002H\n\032\027\020#\032\0020\024*\0020$2\b\b\001\020\f\032\0020\rH\b\0325\020%\032\0020\024*\0020$2\b\b\003\020&\032\0020\r2\b\b\003\020'\032\0020\r2\b\b\003\020(\032\0020\r2\b\b\003\020)\032\0020\rH\b\0325\020*\032\0020\024*\0020$2\b\b\003\020+\032\0020\r2\b\b\003\020'\032\0020\r2\b\b\003\020,\032\0020\r2\b\b\003\020)\032\0020\rH\b\"\033\020\000\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\004\020\005\"\033\020\006\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\007\020\005\"\026\020\b\032\0020\t*\0020\0038Æ\002¢\006\006\032\004\b\n\020\013\"\026\020\f\032\0020\r*\0020\0038Æ\002¢\006\006\032\004\b\016\020\017\002\007\n\005\b20\001¨\006-"}, d2={"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class ViewGroupKt
{
  public static final boolean contains(@NotNull ViewGroup paramViewGroup, @NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Intrinsics.checkNotNullParameter(paramView, "view");
    boolean bool;
    if (paramViewGroup.indexOfChild(paramView) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final void forEach(@NotNull ViewGroup paramViewGroup, @NotNull Function1<? super View, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      Intrinsics.checkNotNullExpressionValue(localView, "getChildAt(index)");
      paramFunction1.invoke(localView);
    }
  }
  
  public static final void forEachIndexed(@NotNull ViewGroup paramViewGroup, @NotNull Function2<? super Integer, ? super View, Unit> paramFunction2)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      Intrinsics.checkNotNullExpressionValue(localView, "getChildAt(index)");
      paramFunction2.invoke(Integer.valueOf(j), localView);
    }
  }
  
  @NotNull
  public static final View get(@NotNull ViewGroup paramViewGroup, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Object localObject = paramViewGroup.getChildAt(paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = a.r("Index: ", paramInt, ", Size: ");
    ((StringBuilder)localObject).append(paramViewGroup.getChildCount());
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  @NotNull
  public static final Sequence<View> getChildren(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    new Sequence()
    {
      @NotNull
      public Iterator<View> iterator()
      {
        return ViewGroupKt.iterator($this_children);
      }
    };
  }
  
  @NotNull
  public static final Sequence<View> getDescendants(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    SequencesKt.sequence(new RestrictedSuspendLambda(paramViewGroup, null)
    {
      public int I$0;
      public int I$1;
      public Object L$1;
      public Object L$2;
      public int label;
      
      @NotNull
      public final Continuation<Unit> create(@Nullable Object paramAnonymousObject, @NotNull Continuation<?> paramAnonymousContinuation)
      {
        paramAnonymousContinuation = new 1($this_descendants, paramAnonymousContinuation);
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
        int j;
        Object localObject2;
        SequenceScope localSequenceScope;
        Object localObject3;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2)
            {
              j = I$1;
              i = I$0;
              localObject2 = (ViewGroup)L$1;
              localSequenceScope = (SequenceScope)L$0;
              ResultKt.throwOnFailure(paramAnonymousObject);
              localObject3 = this;
              paramAnonymousObject = localObject2;
              break label310;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
          j = I$1;
          i = I$0;
          localObject2 = (View)L$2;
          localObject3 = (ViewGroup)L$1;
          localSequenceScope = (SequenceScope)L$0;
          ResultKt.throwOnFailure(paramAnonymousObject);
          paramAnonymousObject = this;
        }
        else
        {
          ResultKt.throwOnFailure(paramAnonymousObject);
          localSequenceScope = (SequenceScope)L$0;
          paramAnonymousObject = $this_descendants;
          i = 0;
          j = ((ViewGroup)paramAnonymousObject).getChildCount();
          localObject3 = this;
        }
        while (i < j)
        {
          localObject2 = ((ViewGroup)paramAnonymousObject).getChildAt(i);
          Intrinsics.checkNotNullExpressionValue(localObject2, "getChildAt(index)");
          L$0 = localSequenceScope;
          L$1 = paramAnonymousObject;
          L$2 = localObject2;
          I$0 = i;
          I$1 = j;
          label = 1;
          if (localSequenceScope.yield(localObject2, (Continuation)localObject3) == localObject1) {
            return localObject1;
          }
          Object localObject4 = localObject3;
          localObject3 = paramAnonymousObject;
          paramAnonymousObject = localObject4;
          if ((localObject2 instanceof ViewGroup))
          {
            localObject2 = ViewGroupKt.getDescendants((ViewGroup)localObject2);
            L$0 = localSequenceScope;
            L$1 = localObject3;
            L$2 = null;
            I$0 = i;
            I$1 = j;
            label = 2;
            if (localSequenceScope.yieldAll((Sequence)localObject2, (Continuation)paramAnonymousObject) == localObject1) {
              return localObject1;
            }
            localObject2 = localObject3;
            localObject3 = paramAnonymousObject;
            paramAnonymousObject = localObject2;
          }
          else
          {
            label310:
            localObject2 = localObject3;
            localObject3 = paramAnonymousObject;
            paramAnonymousObject = localObject2;
          }
          i++;
        }
        return Unit.INSTANCE;
      }
    });
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    return RangesKt.until(0, paramViewGroup.getChildCount());
  }
  
  public static final int getSize(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    return paramViewGroup.getChildCount();
  }
  
  public static final boolean isEmpty(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    boolean bool;
    if (paramViewGroup.getChildCount() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean isNotEmpty(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    boolean bool;
    if (paramViewGroup.getChildCount() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public static final Iterator<View> iterator(@NotNull ViewGroup paramViewGroup)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    new Iterator()
    {
      private int index;
      
      public boolean hasNext()
      {
        boolean bool;
        if (index < $this_iterator.getChildCount()) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      @NotNull
      public View next()
      {
        Object localObject = $this_iterator;
        int i = index;
        index = (i + 1);
        localObject = ((ViewGroup)localObject).getChildAt(i);
        if (localObject != null) {
          return (View)localObject;
        }
        throw new IndexOutOfBoundsException();
      }
      
      public void remove()
      {
        ViewGroup localViewGroup = $this_iterator;
        int i = index - 1;
        index = i;
        localViewGroup.removeViewAt(i);
      }
    };
  }
  
  public static final void minusAssign(@NotNull ViewGroup paramViewGroup, @NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramViewGroup.removeView(paramView);
  }
  
  public static final void plusAssign(@NotNull ViewGroup paramViewGroup, @NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramViewGroup, "<this>");
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramViewGroup.addView(paramView);
  }
  
  public static final void setMargins(@NotNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, @Px int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramMarginLayoutParams, "<this>");
    paramMarginLayoutParams.setMargins(paramInt, paramInt, paramInt, paramInt);
  }
  
  public static final void updateMargins(@NotNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Intrinsics.checkNotNullParameter(paramMarginLayoutParams, "<this>");
    paramMarginLayoutParams.setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(17)
  public static final void updateMarginsRelative(@NotNull ViewGroup.MarginLayoutParams paramMarginLayoutParams, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Intrinsics.checkNotNullParameter(paramMarginLayoutParams, "<this>");
    paramMarginLayoutParams.setMarginStart(paramInt1);
    topMargin = paramInt2;
    paramMarginLayoutParams.setMarginEnd(paramInt3);
    bottomMargin = paramInt4;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewGroupKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */