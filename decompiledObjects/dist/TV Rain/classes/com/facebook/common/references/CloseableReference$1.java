package com.facebook.common.references;

import com.facebook.common.internal.Closeables;
import java.io.Closeable;
import java.io.IOException;

final class CloseableReference$1
  implements ResourceReleaser<Closeable>
{
  public void release(Closeable paramCloseable)
  {
    try
    {
      Closeables.close(paramCloseable, true);
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.references.CloseableReference.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */