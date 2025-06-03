package com.facebook.soloader;

import a;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import z2;

public class DirectorySoSource
  extends SoSource
{
  public static final int ON_LD_LIBRARY_PATH = 2;
  public static final int RESOLVE_DEPENDENCIES = 1;
  public final int flags;
  public final File soDirectory;
  
  public DirectorySoSource(File paramFile, int paramInt)
  {
    soDirectory = paramFile;
    flags = paramInt;
  }
  
  private static String[] getDependencies(File paramFile)
    throws IOException
  {
    boolean bool = SoLoader.SYSTRACE_LIBRARY_LOADING;
    if (bool)
    {
      StringBuilder localStringBuilder = z2.t("SoLoader.getElfDependencies[");
      localStringBuilder.append(paramFile.getName());
      localStringBuilder.append("]");
      Api18TraceUtils.beginTraceSection(localStringBuilder.toString());
    }
    try
    {
      paramFile = MinElf.extract_DT_NEEDED(paramFile);
      if (bool) {
        Api18TraceUtils.endSection();
      }
      return paramFile;
    }
    finally
    {
      if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
        Api18TraceUtils.endSection();
      }
    }
  }
  
  public void addToLdLibraryPath(Collection<String> paramCollection)
  {
    paramCollection.add(soDirectory.getAbsolutePath());
  }
  
  public int loadLibrary(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
    throws IOException
  {
    return loadLibraryFrom(paramString, paramInt, soDirectory, paramThreadPolicy);
  }
  
  public int loadLibraryFrom(String paramString, int paramInt, File paramFile, StrictMode.ThreadPolicy paramThreadPolicy)
    throws IOException
  {
    File localFile = new File(paramFile, paramString);
    boolean bool = localFile.exists();
    int i = 0;
    if (!bool)
    {
      paramString = z2.u(paramString, " not found on ");
      paramString.append(paramFile.getCanonicalPath());
      Log.d("SoLoader", paramString.toString());
      return 0;
    }
    if (((paramInt & 0x1) != 0) && ((flags & 0x2) != 0)) {
      return 2;
    }
    if ((flags & 0x1) != 0)
    {
      paramString = getDependencies(localFile);
      int j = i;
      if (paramString.length > 0)
      {
        paramFile = z2.t("Loading lib dependencies: ");
        paramFile.append(Arrays.toString(paramString));
        Log.d("SoLoader", paramFile.toString());
      }
      for (j = i; j < paramString.length; j++)
      {
        paramFile = paramString[j];
        if (!paramFile.startsWith("/")) {
          SoLoader.loadLibraryBySoName(paramFile, paramInt | 0x1, paramThreadPolicy);
        }
      }
    }
    SoLoader.sSoFileLoader.load(localFile.getAbsolutePath(), paramInt);
    return 1;
  }
  
  public String toString()
  {
    String str2;
    try
    {
      String str1 = String.valueOf(soDirectory.getCanonicalPath());
    }
    catch (IOException localIOException)
    {
      str2 = soDirectory.getName();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append("[root = ");
    localStringBuilder.append(str2);
    localStringBuilder.append(" flags = ");
    return a.n(localStringBuilder, flags, ']');
  }
  
  @Nullable
  public File unpackLibrary(String paramString)
    throws IOException
  {
    paramString = new File(soDirectory, paramString);
    if (paramString.exists()) {
      return paramString;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.DirectorySoSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */