package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1={"\000\033\n\000\n\002\020(\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\b\032\0020\tH\002J\026\020\n\032\n \013*\004\030\0018\0008\000H\002¢\006\002\020\fR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\r"}, d2={"androidx/core/util/SparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class SparseArrayKt$valueIterator$1
  implements Iterator<T>, KMappedMarker
{
  private int index;
  
  public SparseArrayKt$valueIterator$1(SparseArray<T> paramSparseArray) {}
  
  public final int getIndex()
  {
    return index;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (index < $this_valueIterator.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public T next()
  {
    SparseArray localSparseArray = $this_valueIterator;
    int i = index;
    index = (i + 1);
    return (T)localSparseArray.valueAt(i);
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void setIndex(int paramInt)
  {
    index = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.SparseArrayKt.valueIterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */