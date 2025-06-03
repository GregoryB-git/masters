package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\032\023\020\000\032\004\030\0010\001*\0020\002H\007¢\006\002\b\003\032\031\020\004\032\0020\005*\0020\0022\006\020\006\032\0020\001H\007¢\006\002\b\007¨\006\b"}, d2={"findViewTreeOnBackPressedDispatcherOwner", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroid/view/View;", "get", "setViewTreeOnBackPressedDispatcherOwner", "", "onBackPressedDispatcherOwner", "set", "activity_release"}, k=2, mv={1, 6, 0}, xi=48)
@JvmName(name="ViewTreeOnBackPressedDispatcherOwner")
public final class ViewTreeOnBackPressedDispatcherOwner
{
  @JvmName(name="get")
  @Nullable
  public static final OnBackPressedDispatcherOwner get(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    return (OnBackPressedDispatcherOwner)SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(paramView, findViewTreeOnBackPressedDispatcherOwner.1.INSTANCE), findViewTreeOnBackPressedDispatcherOwner.2.INSTANCE));
  }
  
  @JvmName(name="set")
  public static final void set(@NotNull View paramView, @NotNull OnBackPressedDispatcherOwner paramOnBackPressedDispatcherOwner)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    Intrinsics.checkNotNullParameter(paramOnBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
    paramView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, paramOnBackPressedDispatcherOwner);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ViewTreeOnBackPressedDispatcherOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */