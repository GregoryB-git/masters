package androidx.lifecycle.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\024\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\003\032\004\030\001H\004\"\004\b\000\020\0042\f\020\005\032\b\022\004\022\002H\0040\006H\002¢\006\002\020\007¨\006\b"}, d2={"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "()V", "get", "T", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class CreationExtras$Empty
  extends CreationExtras
{
  @NotNull
  public static final Empty INSTANCE = new Empty();
  
  @Nullable
  public <T> T get(@NotNull CreationExtras.Key<T> paramKey)
  {
    Intrinsics.checkNotNullParameter(paramKey, "key");
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.viewmodel.CreationExtras.Empty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */