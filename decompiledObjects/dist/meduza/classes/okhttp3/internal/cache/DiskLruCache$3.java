package okhttp3.internal.cache;

import java.util.Iterator;
import java.util.NoSuchElementException;

class DiskLruCache$3
  implements Iterator<DiskLruCache.Snapshot>
{
  public DiskLruCache.Snapshot a;
  
  public final boolean hasNext()
  {
    throw null;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      a = null;
      return null;
    }
    throw new NoSuchElementException();
  }
  
  /* Error */
  public final void remove()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	okhttp3/internal/cache/DiskLruCache$3:a	Lokhttp3/internal/cache/DiskLruCache$Snapshot;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +13 -> 19
    //   9: new 29	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 31
    //   15: invokespecial 34	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: aload_1
    //   20: invokevirtual 38	java/lang/Object:getClass	()Ljava/lang/Class;
    //   23: pop
    //   24: aconst_null
    //   25: athrow
    //   26: astore_1
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 18	okhttp3/internal/cache/DiskLruCache$3:a	Lokhttp3/internal/cache/DiskLruCache$Snapshot;
    //   32: aload_1
    //   33: athrow
    //   34: astore_1
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 18	okhttp3/internal/cache/DiskLruCache$3:a	Lokhttp3/internal/cache/DiskLruCache$Snapshot;
    //   40: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	3
    //   4	16	1	localSnapshot	DiskLruCache.Snapshot
    //   26	7	1	localObject	Object
    //   34	1	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   19	24	26	finally
    //   24	26	26	finally
    //   19	24	34	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.DiskLruCache.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */