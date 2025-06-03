package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0004\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003BA\b\007\022\f\020\004\032\b\022\004\022\0028\0000\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\f\020\t\032\b\022\004\022\0020\n0\007\022\016\b\002\020\013\032\b\022\004\022\0020\f0\007¢\006\002\020\rJ\b\020\023\032\0020\024H\026R\022\020\016\032\004\030\0018\000X\016¢\006\004\n\002\020\017R\024\020\013\032\b\022\004\022\0020\f0\007X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\n0\007X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R\024\020\020\032\0028\0008VX\004¢\006\006\032\004\b\021\020\022R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\025"}, d2={"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ViewModelLazy<VM extends ViewModel>
  implements Lazy<VM>
{
  @Nullable
  private VM cached;
  @NotNull
  private final Function0<CreationExtras> extrasProducer;
  @NotNull
  private final Function0<ViewModelProvider.Factory> factoryProducer;
  @NotNull
  private final Function0<ViewModelStore> storeProducer;
  @NotNull
  private final KClass<VM> viewModelClass;
  
  @JvmOverloads
  public ViewModelLazy(@NotNull KClass<VM> paramKClass, @NotNull Function0<? extends ViewModelStore> paramFunction0, @NotNull Function0<? extends ViewModelProvider.Factory> paramFunction01)
  {
    this(paramKClass, paramFunction0, paramFunction01, null, 8, null);
  }
  
  @JvmOverloads
  public ViewModelLazy(@NotNull KClass<VM> paramKClass, @NotNull Function0<? extends ViewModelStore> paramFunction0, @NotNull Function0<? extends ViewModelProvider.Factory> paramFunction01, @NotNull Function0<? extends CreationExtras> paramFunction02)
  {
    viewModelClass = paramKClass;
    storeProducer = paramFunction0;
    factoryProducer = paramFunction01;
    extrasProducer = paramFunction02;
  }
  
  @NotNull
  public VM getValue()
  {
    ViewModel localViewModel = cached;
    Object localObject = localViewModel;
    if (localViewModel == null)
    {
      localObject = (ViewModelProvider.Factory)factoryProducer.invoke();
      localObject = new ViewModelProvider((ViewModelStore)storeProducer.invoke(), (ViewModelProvider.Factory)localObject, (CreationExtras)extrasProducer.invoke()).get(JvmClassMappingKt.getJavaClass(viewModelClass));
      cached = ((ViewModel)localObject);
    }
    return (VM)localObject;
  }
  
  public boolean isInitialized()
  {
    boolean bool;
    if (cached != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelLazy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */