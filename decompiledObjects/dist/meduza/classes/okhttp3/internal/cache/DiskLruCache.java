package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.util.regex.Pattern;

public final class DiskLruCache
  implements Closeable, Flushable
{
  static
  {
    Pattern.compile("[a-z0-9_-]{1,120}");
  }
  
  public final void close() {}
  
  public final void flush() {}
  
  public final class Editor {}
  
  public final class Entry {}
  
  public final class Snapshot
    implements Closeable
  {
    public final void close()
    {
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.DiskLruCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */