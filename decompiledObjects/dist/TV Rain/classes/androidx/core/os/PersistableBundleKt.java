package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\"\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\020\016\n\002\020\000\n\002\b\002\n\002\020$\n\000\032\b\020\000\032\0020\001H\007\032=\020\000\032\0020\0012.\020\002\032\030\022\024\b\001\022\020\022\004\022\0020\005\022\006\022\004\030\0010\0060\0040\003\"\020\022\004\022\0020\005\022\006\022\004\030\0010\0060\004H\007¢\006\002\020\007\032\032\020\b\032\0020\001*\020\022\004\022\0020\005\022\006\022\004\030\0010\0060\tH\007¨\006\n"}, d2={"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class PersistableBundleKt
{
  @RequiresApi(21)
  @NotNull
  public static final PersistableBundle persistableBundleOf()
  {
    return PersistableBundleApi21ImplKt.createPersistableBundle(0);
  }
  
  @RequiresApi(21)
  @NotNull
  public static final PersistableBundle persistableBundleOf(@NotNull Pair<String, ? extends Object>... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    PersistableBundle localPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Pair<String, ? extends Object> localPair = paramVarArgs[j];
      PersistableBundleApi21ImplKt.putValue(localPersistableBundle, (String)localPair.component1(), localPair.component2());
    }
    return localPersistableBundle;
  }
  
  @RequiresApi(21)
  @NotNull
  public static final PersistableBundle toPersistableBundle(@NotNull Map<String, ? extends Object> paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    PersistableBundle localPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      PersistableBundleApi21ImplKt.putValue(localPersistableBundle, (String)paramMap.getKey(), paramMap.getValue());
    }
    return localPersistableBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.PersistableBundleKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */