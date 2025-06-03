package n9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public final class h$a
{
  public static void a(File paramFile)
  {
    try
    {
      Files.deleteIfExists(paramFile.toPath());
      return;
    }
    catch (IOException localIOException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to delete file ");
      localStringBuilder.append(paramFile);
      localStringBuilder.append(": ");
      localStringBuilder.append(localIOException);
      throw new IOException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     n9.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */