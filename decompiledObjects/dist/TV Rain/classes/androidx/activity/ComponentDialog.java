package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import h0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000P\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\b\026\030\0002\0020\0012\0020\0022\0020\003B\031\b\007\022\006\020\004\032\0020\005\022\b\b\003\020\006\032\0020\007¢\006\002\020\bJ\032\020\020\032\0020\0212\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\025H\026J\006\020\026\032\0020\027J\006\020\030\032\0020\017J\b\020\031\032\0020\021H\002J\b\020\032\032\0020\021H\027J\022\020\033\032\0020\0212\b\020\034\032\004\030\0010\035H\025J\b\020\036\032\0020\021H\025J\b\020\037\032\0020\021H\025J\020\020 \032\0020\0212\006\020\022\032\0020\023H\026J\032\020 \032\0020\0212\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\025H\026J\020\020 \032\0020\0212\006\020!\032\0020\007H\026R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\024\020\013\032\0020\n8BX\004¢\006\006\032\004\b\f\020\rR\016\020\016\032\0020\017X\004¢\006\002\n\000¨\006\""}, d2={"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "addContentView", "", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getOnBackPressedDispatcher", "initViewTreeOwners", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setContentView", "layoutResID", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ComponentDialog
  extends Dialog
  implements LifecycleOwner, OnBackPressedDispatcherOwner
{
  @Nullable
  private LifecycleRegistry _lifecycleRegistry;
  @NotNull
  private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new h0(this, 1));
  
  @JvmOverloads
  public ComponentDialog(@NotNull Context paramContext)
  {
    this(paramContext, 0, 2, null);
  }
  
  @JvmOverloads
  public ComponentDialog(@NotNull Context paramContext, @StyleRes int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  private final LifecycleRegistry getLifecycleRegistry()
  {
    LifecycleRegistry localLifecycleRegistry1 = _lifecycleRegistry;
    LifecycleRegistry localLifecycleRegistry2 = localLifecycleRegistry1;
    if (localLifecycleRegistry1 == null)
    {
      localLifecycleRegistry2 = new LifecycleRegistry(this);
      _lifecycleRegistry = localLifecycleRegistry2;
    }
    return localLifecycleRegistry2;
  }
  
  private final void initViewTreeOwners()
  {
    Object localObject = getWindow();
    Intrinsics.checkNotNull(localObject);
    ViewTreeLifecycleOwner.set(((Window)localObject).getDecorView(), this);
    localObject = getWindow();
    Intrinsics.checkNotNull(localObject);
    localObject = ((Window)localObject).getDecorView();
    Intrinsics.checkNotNullExpressionValue(localObject, "window!!.decorView");
    ViewTreeOnBackPressedDispatcherOwner.set((View)localObject, this);
  }
  
  private static final void onBackPressedDispatcher$lambda-1(ComponentDialog paramComponentDialog)
  {
    Intrinsics.checkNotNullParameter(paramComponentDialog, "this$0");
    paramComponentDialog.onBackPressed();
  }
  
  public void addContentView(@NotNull View paramView, @Nullable ViewGroup.LayoutParams paramLayoutParams)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    initViewTreeOwners();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  @NotNull
  public final Lifecycle getLifecycle()
  {
    return getLifecycleRegistry();
  }
  
  @NotNull
  public final OnBackPressedDispatcher getOnBackPressedDispatcher()
  {
    return onBackPressedDispatcher;
  }
  
  @CallSuper
  public void onBackPressed()
  {
    onBackPressedDispatcher.onBackPressed();
  }
  
  @CallSuper
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
  }
  
  @CallSuper
  public void onStart()
  {
    super.onStart();
    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
  }
  
  @CallSuper
  public void onStop()
  {
    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    _lifecycleRegistry = null;
    super.onStop();
  }
  
  public void setContentView(int paramInt)
  {
    initViewTreeOwners();
    super.setContentView(paramInt);
  }
  
  public void setContentView(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    initViewTreeOwners();
    super.setContentView(paramView);
  }
  
  public void setContentView(@NotNull View paramView, @Nullable ViewGroup.LayoutParams paramLayoutParams)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    initViewTreeOwners();
    super.setContentView(paramView, paramLayoutParams);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */