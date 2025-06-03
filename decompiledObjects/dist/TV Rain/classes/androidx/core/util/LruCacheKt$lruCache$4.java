package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000#\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\027\020\002\032\004\030\0018\0012\006\020\003\032\0028\000H\024¢\006\002\020\004J/\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\003\032\0028\0002\006\020\t\032\0028\0012\b\020\n\032\004\030\0018\001H\024¢\006\002\020\013J\035\020\f\032\0020\r2\006\020\003\032\0028\0002\006\020\016\032\0028\001H\024¢\006\002\020\017¨\006\020"}, d2={"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class LruCacheKt$lruCache$4
  extends LruCache<K, V>
{
  public LruCacheKt$lruCache$4(int paramInt, Function2<? super K, ? super V, Integer> paramFunction2, Function1<? super K, ? extends V> paramFunction1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> paramFunction4)
  {
    super(paramInt);
  }
  
  @Nullable
  public V create(@NotNull K paramK)
  {
    Intrinsics.checkNotNullParameter(paramK, "key");
    return (V)$create.invoke(paramK);
  }
  
  public void entryRemoved(boolean paramBoolean, @NotNull K paramK, @NotNull V paramV1, @Nullable V paramV2)
  {
    Intrinsics.checkNotNullParameter(paramK, "key");
    Intrinsics.checkNotNullParameter(paramV1, "oldValue");
    $onEntryRemoved.invoke(Boolean.valueOf(paramBoolean), paramK, paramV1, paramV2);
  }
  
  public int sizeOf(@NotNull K paramK, @NotNull V paramV)
  {
    Intrinsics.checkNotNullParameter(paramK, "key");
    Intrinsics.checkNotNullParameter(paramV, "value");
    return ((Number)$sizeOf.invoke(paramK, paramV)).intValue();
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.LruCacheKt.lruCache.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */