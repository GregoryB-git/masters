package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

final class ExtractFromZipSoSource$ZipUnpacker$ZipBackedInputDsoIterator
  extends UnpackingSoSource.InputDsoIterator
{
  private int mCurrentDso;
  
  private ExtractFromZipSoSource$ZipUnpacker$ZipBackedInputDsoIterator(ExtractFromZipSoSource.ZipUnpacker paramZipUnpacker) {}
  
  public boolean hasNext()
  {
    this$1.ensureDsos();
    boolean bool;
    if (mCurrentDso < ExtractFromZipSoSource.ZipUnpacker.access$100(this$1).length) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public UnpackingSoSource.InputDso next()
    throws IOException
  {
    this$1.ensureDsos();
    Object localObject1 = ExtractFromZipSoSource.ZipUnpacker.access$100(this$1);
    int i = mCurrentDso;
    mCurrentDso = (i + 1);
    Object localObject2 = localObject1[i];
    localObject1 = ExtractFromZipSoSource.ZipUnpacker.access$200(this$1).getInputStream(backingEntry);
    try
    {
      localObject2 = new UnpackingSoSource.InputDso((UnpackingSoSource.Dso)localObject2, (InputStream)localObject1);
      return (UnpackingSoSource.InputDso)localObject2;
    }
    finally
    {
      if (localObject1 != null) {
        ((InputStream)localObject1).close();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExtractFromZipSoSource.ZipUnpacker.ZipBackedInputDsoIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */