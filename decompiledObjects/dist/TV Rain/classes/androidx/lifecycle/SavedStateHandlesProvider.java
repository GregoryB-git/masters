package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\000\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\021\032\004\030\0010\n2\006\020\022\032\0020\023J\006\020\024\032\0020\025J\b\020\026\032\0020\nH\026R\016\020\007\032\0020\bX\016¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\033\020\013\032\0020\f8BX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016¨\006\027"}, d2={"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "consumeRestoredStateForKey", "key", "", "performRestore", "", "saveState", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandlesProvider
  implements SavedStateRegistry.SavedStateProvider
{
  private boolean restored;
  @Nullable
  private Bundle restoredState;
  @NotNull
  private final SavedStateRegistry savedStateRegistry;
  @NotNull
  private final Lazy viewModel$delegate;
  
  public SavedStateHandlesProvider(@NotNull SavedStateRegistry paramSavedStateRegistry, @NotNull ViewModelStoreOwner paramViewModelStoreOwner)
  {
    savedStateRegistry = paramSavedStateRegistry;
    viewModel$delegate = LazyKt.lazy(new Lambda(paramViewModelStoreOwner)
    {
      @NotNull
      public final SavedStateHandlesVM invoke()
      {
        return SavedStateHandleSupport.getSavedStateHandlesVM($viewModelStoreOwner);
      }
    });
  }
  
  private final SavedStateHandlesVM getViewModel()
  {
    return (SavedStateHandlesVM)viewModel$delegate.getValue();
  }
  
  @Nullable
  public final Bundle consumeRestoredStateForKey(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    performRestore();
    Bundle localBundle1 = restoredState;
    if (localBundle1 != null) {
      localBundle1 = localBundle1.getBundle(paramString);
    } else {
      localBundle1 = null;
    }
    Bundle localBundle2 = restoredState;
    if (localBundle2 != null) {
      localBundle2.remove(paramString);
    }
    paramString = restoredState;
    int i = 1;
    if ((paramString == null) || (paramString.isEmpty() != true)) {
      i = 0;
    }
    if (i != 0) {
      restoredState = null;
    }
    return localBundle1;
  }
  
  public final void performRestore()
  {
    if (!restored)
    {
      restoredState = savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
      restored = true;
      getViewModel();
    }
  }
  
  @NotNull
  public Bundle saveState()
  {
    Bundle localBundle = new Bundle();
    Object localObject1 = restoredState;
    if (localObject1 != null) {
      localBundle.putAll((Bundle)localObject1);
    }
    Iterator localIterator = getViewModel().getHandles().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      localObject1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = ((SavedStateHandle)((Map.Entry)localObject2).getValue()).savedStateProvider().saveState();
      if (!Intrinsics.areEqual(localObject2, Bundle.EMPTY)) {
        localBundle.putBundle((String)localObject1, (Bundle)localObject2);
      }
    }
    restored = false;
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandlesProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */