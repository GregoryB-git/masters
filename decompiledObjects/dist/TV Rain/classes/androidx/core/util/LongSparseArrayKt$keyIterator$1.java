package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(d1={"\000\037\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\t\n\000*\001\000\b\n\030\0002\0020\001J\t\020\b\032\0020\tH\002J\b\020\n\032\0020\013H\027R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\f"}, d2={"androidx/core/util/LongSparseArrayKt$keyIterator$1", "Lkotlin/collections/LongIterator;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextLong", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class LongSparseArrayKt$keyIterator$1
  extends LongIterator
{
  private int index;
  
  public LongSparseArrayKt$keyIterator$1(LongSparseArray<T> paramLongSparseArray) {}
  
  public final int getIndex()
  {
    return index;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  public boolean hasNext()
  {
    boolean bool;
    if (index < $this_keyIterator.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  public long nextLong()
  {
    LongSparseArray localLongSparseArray = $this_keyIterator;
    int i = index;
    index = (i + 1);
    return localLongSparseArray.keyAt(i);
  }
  
  public final void setIndex(int paramInt)
  {
    index = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.LongSparseArrayKt.keyIterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */