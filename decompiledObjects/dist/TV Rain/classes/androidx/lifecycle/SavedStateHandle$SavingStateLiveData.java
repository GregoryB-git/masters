package androidx.lifecycle;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\003\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B!\b\026\022\b\020\003\032\004\030\0010\004\022\006\020\005\032\0020\006\022\006\020\007\032\0028\000¢\006\002\020\bB\031\b\026\022\b\020\003\032\004\030\0010\004\022\006\020\005\032\0020\006¢\006\002\020\tJ\006\020\n\032\0020\013J\025\020\f\032\0020\0132\006\020\007\032\0028\000H\026¢\006\002\020\rR\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000¨\006\016"}, d2={"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandle$SavingStateLiveData<T>
  extends MutableLiveData<T>
{
  @Nullable
  private SavedStateHandle handle;
  @NotNull
  private String key;
  
  public SavedStateHandle$SavingStateLiveData(@Nullable SavedStateHandle paramSavedStateHandle, @NotNull String paramString)
  {
    key = paramString;
    handle = paramSavedStateHandle;
  }
  
  public SavedStateHandle$SavingStateLiveData(@Nullable SavedStateHandle paramSavedStateHandle, @NotNull String paramString, T paramT)
  {
    super(paramT);
    key = paramString;
    handle = paramSavedStateHandle;
  }
  
  public final void detach()
  {
    handle = null;
  }
  
  public void setValue(T paramT)
  {
    Object localObject = handle;
    if (localObject != null)
    {
      SavedStateHandle.access$getRegular$p((SavedStateHandle)localObject).put(key, paramT);
      localObject = (MutableStateFlow)SavedStateHandle.access$getFlows$p((SavedStateHandle)localObject).get(key);
      if (localObject != null) {
        ((MutableStateFlow)localObject).setValue(paramT);
      }
    }
    super.setValue(paramT);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandle.SavingStateLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */