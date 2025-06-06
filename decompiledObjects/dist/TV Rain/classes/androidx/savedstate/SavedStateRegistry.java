package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import e4;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z2;

@Metadata(d1={"\000J\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\030\002\n\002\b\005\b\007\030\000 )2\0020\001:\003()*B\007\b\000¢\006\002\020\002J\022\020\024\032\004\030\0010\0232\006\020\025\032\0020\007H\007J\020\020\026\032\004\030\0010\b2\006\020\025\032\0020\007J\025\020\027\032\0020\0302\006\020\031\032\0020\032H\001¢\006\002\b\033J\027\020\034\032\0020\0302\b\020\035\032\004\030\0010\023H\001¢\006\002\b\036J\020\020\037\032\0020\0302\006\020 \032\0020\023H\007J\030\020!\032\0020\0302\006\020\025\032\0020\0072\006\020\"\032\0020\bH\007J\030\020#\032\0020\0302\016\020$\032\n\022\006\b\001\022\0020&0%H\007J\020\020'\032\0020\0302\006\020\025\032\0020\007H\007R\016\020\003\032\0020\004X\016¢\006\002\n\000R\032\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006X\004¢\006\002\n\000R\032\020\t\032\0020\004X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR \020\017\032\0020\0042\006\020\016\032\0020\0048G@BX\016¢\006\b\n\000\032\004\b\017\020\013R\020\020\020\032\004\030\0010\021X\016¢\006\002\n\000R\020\020\022\032\004\030\0010\023X\016¢\006\002\n\000¨\006+"}, d2={"Landroidx/savedstate/SavedStateRegistry;", "", "()V", "attached", "", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "<set-?>", "isRestored", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "restoredState", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "key", "getSavedStateProvider", "performAttach", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "performAttach$savedstate_release", "performRestore", "savedState", "performRestore$savedstate_release", "performSave", "outBundle", "registerSavedStateProvider", "provider", "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "unregisterSavedStateProvider", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry
{
  @NotNull
  private static final Companion Companion = new Companion(null);
  @Deprecated
  @NotNull
  private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
  private boolean attached;
  @NotNull
  private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap();
  private boolean isAllowingSavingState = true;
  private boolean isRestored;
  @Nullable
  private Recreator.SavedStateProvider recreatorProvider;
  @Nullable
  private Bundle restoredState;
  
  private static final void performAttach$lambda-4(SavedStateRegistry paramSavedStateRegistry, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Intrinsics.checkNotNullParameter(paramSavedStateRegistry, "this$0");
    Intrinsics.checkNotNullParameter(paramLifecycleOwner, "<anonymous parameter 0>");
    Intrinsics.checkNotNullParameter(paramEvent, "event");
    if (paramEvent == Lifecycle.Event.ON_START) {
      isAllowingSavingState = true;
    } else if (paramEvent == Lifecycle.Event.ON_STOP) {
      isAllowingSavingState = false;
    }
  }
  
  @MainThread
  @Nullable
  public final Bundle consumeRestoredStateForKey(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    if (isRestored)
    {
      Bundle localBundle1 = restoredState;
      if (localBundle1 != null)
      {
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
        int i = 0;
        int j = i;
        if (paramString != null)
        {
          j = i;
          if (!paramString.isEmpty()) {
            j = 1;
          }
        }
        if (j == 0) {
          restoredState = null;
        }
        return localBundle1;
      }
      return null;
    }
    throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
  }
  
  @Nullable
  public final SavedStateProvider getSavedStateProvider(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Iterator localIterator = components.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      Intrinsics.checkNotNullExpressionValue(localObject, "components");
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (SavedStateProvider)((Map.Entry)localObject).getValue();
      if (Intrinsics.areEqual(str, paramString)) {
        return (String)localObject;
      }
    }
    paramString = null;
    return paramString;
  }
  
  public final boolean isAllowingSavingState$savedstate_release()
  {
    return isAllowingSavingState;
  }
  
  @MainThread
  public final boolean isRestored()
  {
    return isRestored;
  }
  
  @MainThread
  public final void performAttach$savedstate_release(@NotNull Lifecycle paramLifecycle)
  {
    Intrinsics.checkNotNullParameter(paramLifecycle, "lifecycle");
    if ((attached ^ true))
    {
      paramLifecycle.addObserver(new e4(this));
      attached = true;
      return;
    }
    throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
  }
  
  @MainThread
  public final void performRestore$savedstate_release(@Nullable Bundle paramBundle)
  {
    if (attached)
    {
      if ((isRestored ^ true))
      {
        if (paramBundle != null) {
          paramBundle = paramBundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        } else {
          paramBundle = null;
        }
        restoredState = paramBundle;
        isRestored = true;
        return;
      }
      throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
    }
    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
  }
  
  @MainThread
  public final void performSave(@NotNull Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "outBundle");
    Bundle localBundle = new Bundle();
    Object localObject = restoredState;
    if (localObject != null) {
      localBundle.putAll((Bundle)localObject);
    }
    localObject = components.iteratorWithAdditions();
    Intrinsics.checkNotNullExpressionValue(localObject, "this.components.iteratorWithAdditions()");
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      localBundle.putBundle((String)localEntry.getKey(), ((SavedStateProvider)localEntry.getValue()).saveState());
    }
    if (!localBundle.isEmpty()) {
      paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", localBundle);
    }
  }
  
  @MainThread
  public final void registerSavedStateProvider(@NotNull String paramString, @NotNull SavedStateProvider paramSavedStateProvider)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramSavedStateProvider, "provider");
    int i;
    if ((SavedStateProvider)components.putIfAbsent(paramString, paramSavedStateProvider) == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
  }
  
  @MainThread
  public final void runOnNextRecreation(@NotNull Class<? extends AutoRecreated> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "clazz");
    if (isAllowingSavingState)
    {
      Object localObject1 = recreatorProvider;
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Recreator.SavedStateProvider(this);
      }
      recreatorProvider = ((Recreator.SavedStateProvider)localObject2);
      try
      {
        paramClass.getDeclaredConstructor(new Class[0]);
        localObject2 = recreatorProvider;
        if (localObject2 != null)
        {
          paramClass = paramClass.getName();
          Intrinsics.checkNotNullExpressionValue(paramClass, "clazz.name");
          ((Recreator.SavedStateProvider)localObject2).add(paramClass);
        }
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject1 = z2.t("Class ");
        ((StringBuilder)localObject1).append(paramClass.getSimpleName());
        ((StringBuilder)localObject1).append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString(), localNoSuchMethodException);
      }
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
  }
  
  public final void setAllowingSavingState$savedstate_release(boolean paramBoolean)
  {
    isAllowingSavingState = paramBoolean;
  }
  
  @MainThread
  public final void unregisterSavedStateProvider(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    components.remove(paramString);
  }
  
  @Metadata(d1={"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&¨\006\006"}, d2={"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static abstract interface AutoRecreated
  {
    public abstract void onRecreated(@NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner);
  }
  
  @Metadata(d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2={"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion {}
  
  @Metadata(d1={"\000\020\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\bæ\001\030\0002\0020\001J\b\020\002\032\0020\003H&¨\006\004"}, d2={"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static abstract interface SavedStateProvider
  {
    @NotNull
    public abstract Bundle saveState();
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */