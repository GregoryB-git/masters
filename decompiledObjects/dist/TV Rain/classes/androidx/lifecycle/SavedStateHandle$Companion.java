package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\n\032\0020\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\rH\007J\022\020\017\032\0020\0202\b\020\021\032\004\030\0010\001H\007R \020\003\032\022\022\016\022\f\022\006\b\001\022\0020\001\030\0010\0050\004X\004¢\006\004\n\002\020\006R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000¨\006\022"}, d2={"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandle$Companion
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

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandle.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */