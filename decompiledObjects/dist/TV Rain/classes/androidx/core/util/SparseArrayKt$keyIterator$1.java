package androidx.core.util;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(d1={"\000\033\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\t\020\b\032\0020\tH\002J\b\020\n\032\0020\003H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\013"}, d2={"androidx/core/util/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class SparseArrayKt$keyIterator$1
  extends IntIterator
{
  private int index;
  
  public SparseArrayKt$keyIterator$1(SparseArray<T> paramSparseArray) {}
  
  public final int getIndex()
  {
    return index;
  }
  
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
  
  public int nextInt()
  {
    SparseArray localSparseArray = $this_keyIterator;
    int i = index;
    index = (i + 1);
    return localSparseArray.keyAt(i);
  }
  
  public final void setIndex(int paramInt)
  {
    index = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.SparseArrayKt.keyIterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */