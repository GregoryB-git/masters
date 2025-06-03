package com.facebook.common.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class Closeables
{
  @VisibleForTesting
  public static final Logger logger = Logger.getLogger(Closeables.class.getName());
  
  public static void close(@Nullable Closeable paramCloseable, boolean paramBoolean)
    throws IOException
  {
    if (paramCloseable == null) {
      return;
    }
    try
    {
      paramCloseable.close();
    }
    catch (IOException paramCloseable)
    {
      if (!paramBoolean) {
        break label32;
      }
    }
    logger.log(Level.WARNING, "IOException thrown while closing Closeable.", paramCloseable);
    return;
    label32:
    throw paramCloseable;
  }
  
  public static void closeQuietly(@Nullable InputStream paramInputStream)
  {
    try
    {
      close(paramInputStream, true);
      return;
    }
    catch (IOException paramInputStream)
    {
      throw new AssertionError(paramInputStream);
    }
  }
  
  public static void closeQuietly(@Nullable Reader paramReader)
  {
    try
    {
      close(paramReader, true);
      return;
    }
    catch (IOException paramReader)
    {
      throw new AssertionError(paramReader);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Closeables
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */