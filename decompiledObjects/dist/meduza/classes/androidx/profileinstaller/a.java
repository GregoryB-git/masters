package androidx.profileinstaller;

import java.io.File;

public final class a
{
  public static boolean a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      paramFile = paramFile.listFiles();
      if (paramFile == null) {
        return false;
      }
      int i = paramFile.length;
      int j = 0;
      boolean bool = true;
      while (j < i)
      {
        if ((a(paramFile[j])) && (bool)) {
          bool = true;
        } else {
          bool = false;
        }
        j++;
      }
      return bool;
    }
    paramFile.delete();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */