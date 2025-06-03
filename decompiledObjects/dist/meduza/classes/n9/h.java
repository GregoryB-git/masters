package n9;

import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public final class h
{
  public static void a(File paramFile)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      a.a(paramFile);
    }
    else if ((!paramFile.delete()) && (paramFile.exists()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to delete file ");
      localStringBuilder.append(paramFile);
      throw new IOException(localStringBuilder.toString());
    }
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     n9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */