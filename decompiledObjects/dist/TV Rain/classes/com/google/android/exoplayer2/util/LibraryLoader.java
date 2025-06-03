package com.google.android.exoplayer2.util;

public final class LibraryLoader
{
  private boolean isAvailable;
  private boolean loadAttempted;
  private String[] nativeLibraries;
  
  public LibraryLoader(String... paramVarArgs)
  {
    nativeLibraries = paramVarArgs;
  }
  
  public boolean isAvailable()
  {
    for (;;)
    {
      boolean bool;
      String[] arrayOfString;
      int i;
      int j;
      try
      {
        if (loadAttempted)
        {
          bool = isAvailable;
          return bool;
        }
        loadAttempted = true;
      }
      finally {}
      try
      {
        arrayOfString = nativeLibraries;
        i = arrayOfString.length;
        j = 0;
        if (j < i)
        {
          System.loadLibrary(arrayOfString[j]);
          j++;
        }
        else
        {
          isAvailable = true;
        }
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {}
    }
    bool = isAvailable;
    return bool;
  }
  
  public void setLibraries(String... paramVarArgs)
  {
    try
    {
      boolean bool;
      if (!loadAttempted) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool, "Cannot set libraries after loading");
      nativeLibraries = paramVarArgs;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.LibraryLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */