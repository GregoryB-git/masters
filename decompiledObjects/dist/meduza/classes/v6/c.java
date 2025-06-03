package v6;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
public final class c
{
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     v6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */