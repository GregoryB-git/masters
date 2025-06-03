package com.facebook.soloader;

import java.io.File;

final class ExoSoSource$FileDso
  extends UnpackingSoSource.Dso
{
  public final File backingFile;
  
  public ExoSoSource$FileDso(String paramString1, String paramString2, File paramFile)
  {
    super(paramString1, paramString2);
    backingFile = paramFile;
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExoSoSource.FileDso
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */