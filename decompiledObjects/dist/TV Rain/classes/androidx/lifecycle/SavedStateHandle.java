package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import d4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000X\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\b\003\n\002\020%\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\"\n\002\b\t\030\000 *2\0020\001:\002*+B\035\b\026\022\024\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0010\003¢\006\002\020\005B\007\b\026¢\006\002\020\006J\020\020\020\032\0020\0212\006\020\022\032\0020\004H\007J\021\020\023\032\0020\0242\006\020\022\032\0020\004H\002J\036\020\025\032\004\030\001H\026\"\004\b\000\020\0262\006\020\022\032\0020\004H\002¢\006\002\020\027J\034\020\030\032\b\022\004\022\002H\0260\031\"\004\b\000\020\0262\006\020\022\032\0020\004H\007J)\020\030\032\b\022\004\022\002H\0260\031\"\004\b\000\020\0262\006\020\022\032\0020\0042\006\020\032\032\002H\026H\007¢\006\002\020\033J1\020\034\032\b\022\004\022\002H\0260\031\"\004\b\000\020\0262\006\020\022\032\0020\0042\006\020\035\032\0020\0242\006\020\032\032\002H\026H\002¢\006\002\020\036J)\020\037\032\b\022\004\022\002H\0260 \"\004\b\000\020\0262\006\020\022\032\0020\0042\006\020\032\032\002H\026H\007¢\006\002\020!J\016\020\"\032\b\022\004\022\0020\0040#H\007J\035\020$\032\004\030\001H\026\"\004\b\000\020\0262\006\020\022\032\0020\004H\007¢\006\002\020\027J\b\020\r\032\0020\016H\007J&\020%\032\0020\021\"\004\b\000\020\0262\006\020\022\032\0020\0042\b\020&\032\004\030\001H\026H\002¢\006\002\020'J\030\020(\032\0020\0212\006\020\022\032\0020\0042\006\020)\032\0020\016H\007R\"\020\007\032\026\022\004\022\0020\004\022\f\022\n\022\006\022\004\030\0010\0010\t0\bX\004¢\006\002\n\000R\036\020\n\032\022\022\004\022\0020\004\022\b\022\006\022\002\b\0030\0130\bX\004¢\006\002\n\000R\034\020\f\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0010\bX\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000R\032\020\017\032\016\022\004\022\0020\004\022\004\022\0020\0160\bX\004¢\006\002\n\000¨\006,"}, d2={"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "(Ljava/util/Map;)V", "()V", "flows", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "liveDatas", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "regular", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProviders", "clearSavedStateProvider", "", "key", "contains", "", "get", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "keys", "", "remove", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setSavedStateProvider", "provider", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandle
{
  @NotNull
  private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = { Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class };
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private static final String KEYS = "keys";
  @NotNull
  private static final String VALUES = "values";
  @NotNull
  private final Map<String, MutableStateFlow<Object>> flows;
  @NotNull
  private final Map<String, SavingStateLiveData<?>> liveDatas;
  @NotNull
  private final Map<String, Object> regular;
  @NotNull
  private final SavedStateRegistry.SavedStateProvider savedStateProvider;
  @NotNull
  private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
  
  public SavedStateHandle()
  {
    regular = new LinkedHashMap();
    savedStateProviders = new LinkedHashMap();
    liveDatas = new LinkedHashMap();
    flows = new LinkedHashMap();
    savedStateProvider = new d4(this, 1);
  }
  
  public SavedStateHandle(@NotNull Map<String, ? extends Object> paramMap)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    regular = localLinkedHashMap;
    savedStateProviders = new LinkedHashMap();
    liveDatas = new LinkedHashMap();
    flows = new LinkedHashMap();
    savedStateProvider = new d4(this, 0);
    localLinkedHashMap.putAll(paramMap);
  }
  
  @JvmStatic
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @NotNull
  public static final SavedStateHandle createHandle(@Nullable Bundle paramBundle1, @Nullable Bundle paramBundle2)
  {
    return Companion.createHandle(paramBundle1, paramBundle2);
  }
  
  private final <T> MutableLiveData<T> getLiveDataInternal(String paramString, boolean paramBoolean, T paramT)
  {
    Object localObject = liveDatas.get(paramString);
    if ((localObject instanceof MutableLiveData)) {
      localObject = (MutableLiveData)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      return (MutableLiveData<T>)localObject;
    }
    if (regular.containsKey(paramString))
    {
      paramT = new SavingStateLiveData(this, paramString, regular.get(paramString));
    }
    else if (paramBoolean)
    {
      regular.put(paramString, paramT);
      paramT = new SavingStateLiveData(this, paramString, paramT);
    }
    else
    {
      paramT = new SavingStateLiveData(this, paramString);
    }
    liveDatas.put(paramString, paramT);
    return paramT;
  }
  
  private static final Bundle savedStateProvider$lambda-0(SavedStateHandle paramSavedStateHandle)
  {
    Intrinsics.checkNotNullParameter(paramSavedStateHandle, "this$0");
    Object localObject1 = MapsKt.toMap(savedStateProviders).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      paramSavedStateHandle.set((String)((Map.Entry)localObject2).getKey(), ((SavedStateRegistry.SavedStateProvider)((Map.Entry)localObject2).getValue()).saveState());
    }
    Object localObject3 = regular.keySet();
    localObject1 = new ArrayList(((Set)localObject3).size());
    Object localObject2 = new ArrayList(((ArrayList)localObject1).size());
    localObject3 = ((Set)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      String str = (String)((Iterator)localObject3).next();
      ((ArrayList)localObject1).add(str);
      ((ArrayList)localObject2).add(regular.get(str));
    }
    return BundleKt.bundleOf(new Pair[] { TuplesKt.to("keys", localObject1), TuplesKt.to("values", localObject2) });
  }
  
  @MainThread
  public final void clearSavedStateProvider(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    savedStateProviders.remove(paramString);
  }
  
  @MainThread
  public final boolean contains(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    return regular.containsKey(paramString);
  }
  
  @MainThread
  @Nullable
  public final <T> T get(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    return (T)regular.get(paramString);
  }
  
  @MainThread
  @NotNull
  public final <T> MutableLiveData<T> getLiveData(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    return getLiveDataInternal(paramString, false, null);
  }
  
  @MainThread
  @NotNull
  public final <T> MutableLiveData<T> getLiveData(@NotNull String paramString, T paramT)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    return getLiveDataInternal(paramString, true, paramT);
  }
  
  @MainThread
  @NotNull
  public final <T> StateFlow<T> getStateFlow(@NotNull String paramString, T paramT)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Map localMap = flows;
    Object localObject1 = localMap.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      if (!regular.containsKey(paramString)) {
        regular.put(paramString, paramT);
      }
      localObject2 = StateFlowKt.MutableStateFlow(regular.get(paramString));
      flows.put(paramString, localObject2);
      localMap.put(paramString, localObject2);
    }
    return FlowKt.asStateFlow((MutableStateFlow)localObject2);
  }
  
  @MainThread
  @NotNull
  public final Set<String> keys()
  {
    return SetsKt.a(SetsKt.a(regular.keySet(), savedStateProviders.keySet()), liveDatas.keySet());
  }
  
  @MainThread
  @Nullable
  public final <T> T remove(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Object localObject = regular.remove(paramString);
    SavingStateLiveData localSavingStateLiveData = (SavingStateLiveData)liveDatas.remove(paramString);
    if (localSavingStateLiveData != null) {
      localSavingStateLiveData.detach();
    }
    flows.remove(paramString);
    return (T)localObject;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @NotNull
  public final SavedStateRegistry.SavedStateProvider savedStateProvider()
  {
    return savedStateProvider;
  }
  
  @MainThread
  public final <T> void set(@NotNull String paramString, @Nullable T paramT)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    if (Companion.validateValue(paramT))
    {
      Object localObject = liveDatas.get(paramString);
      if ((localObject instanceof MutableLiveData)) {
        localObject = (MutableLiveData)localObject;
      } else {
        localObject = null;
      }
      if (localObject != null) {
        ((MutableLiveData)localObject).setValue(paramT);
      } else {
        regular.put(paramString, paramT);
      }
      paramString = (MutableStateFlow)flows.get(paramString);
      if (paramString != null) {
        paramString.setValue(paramT);
      }
      return;
    }
    paramString = new StringBuilder();
    paramString.append("Can't put value with type ");
    Intrinsics.checkNotNull(paramT);
    paramString.append(paramT.getClass());
    paramString.append(" into saved state");
    throw new IllegalArgumentException(paramString.toString());
  }
  
  @MainThread
  public final void setSavedStateProvider(@NotNull String paramString, @NotNull SavedStateRegistry.SavedStateProvider paramSavedStateProvider)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramSavedStateProvider, "provider");
    savedStateProviders.put(paramString, paramSavedStateProvider);
  }
  
  @Metadata(d1={"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\n\032\0020\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\rH\007J\022\020\017\032\0020\0202\b\020\021\032\004\030\0010\001H\007R \020\003\032\022\022\016\022\f\022\006\b\001\022\0020\001\030\0010\0050\004X\004¢\006\004\n\002\020\006R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000¨\006\022"}, d2={"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
  {
    @JvmStatic
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SavedStateHandle createHandle(@Nullable Bundle paramBundle1, @Nullable Bundle paramBundle2)
    {
      Object localObject2;
      if (paramBundle1 == null)
      {
        if (paramBundle2 == null)
        {
          paramBundle1 = new SavedStateHandle();
        }
        else
        {
          paramBundle1 = new HashMap();
          localObject1 = paramBundle2.keySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            Intrinsics.checkNotNullExpressionValue(localObject2, "key");
            paramBundle1.put(localObject2, paramBundle2.get((String)localObject2));
          }
          paramBundle1 = new SavedStateHandle(paramBundle1);
        }
        return paramBundle1;
      }
      paramBundle2 = paramBundle1.getParcelableArrayList("keys");
      Object localObject1 = paramBundle1.getParcelableArrayList("values");
      int i = 0;
      int j;
      if ((paramBundle2 != null) && (localObject1 != null) && (paramBundle2.size() == ((ArrayList)localObject1).size())) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        localObject2 = new LinkedHashMap();
        int k = paramBundle2.size();
        j = i;
        while (j < k)
        {
          paramBundle1 = paramBundle2.get(j);
          if (paramBundle1 != null)
          {
            ((Map)localObject2).put((String)paramBundle1, ((ArrayList)localObject1).get(j));
            j++;
          }
          else
          {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
          }
        }
        return new SavedStateHandle((Map)localObject2);
      }
      throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean validateValue(@Nullable Object paramObject)
    {
      if (paramObject == null) {
        return true;
      }
      for (Class localClass : SavedStateHandle.access$getACCEPTABLE_CLASSES$cp())
      {
        Intrinsics.checkNotNull(localClass);
        if (localClass.isInstance(paramObject)) {
          return true;
        }
      }
      return false;
    }
  }
  
  @Metadata(d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\003\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B!\b\026\022\b\020\003\032\004\030\0010\004\022\006\020\005\032\0020\006\022\006\020\007\032\0028\000¢\006\002\020\bB\031\b\026\022\b\020\003\032\004\030\0010\004\022\006\020\005\032\0020\006¢\006\002\020\tJ\006\020\n\032\0020\013J\025\020\f\032\0020\0132\006\020\007\032\0028\000H\026¢\006\002\020\rR\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000¨\006\016"}, d2={"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class SavingStateLiveData<T>
    extends MutableLiveData<T>
  {
    @Nullable
    private SavedStateHandle handle;
    @NotNull
    private String key;
    
    public SavingStateLiveData(@Nullable SavedStateHandle paramSavedStateHandle, @NotNull String paramString)
    {
      key = paramString;
      handle = paramSavedStateHandle;
    }
    
    public SavingStateLiveData(@Nullable SavedStateHandle paramSavedStateHandle, @NotNull String paramString, T paramT)
    {
      super();
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
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */