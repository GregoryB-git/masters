package com.facebook.soloader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ExoSoSource$ExoUnpacker$FileBackedInputDsoIterator
  extends UnpackingSoSource.InputDsoIterator
{
  private int mCurrentDso;
  
  private ExoSoSource$ExoUnpacker$FileBackedInputDsoIterator(ExoSoSource.ExoUnpacker paramExoUnpacker) {}
  
  public boolean hasNext()
  {
    boolean bool;
    if (mCurrentDso < ExoSoSource.ExoUnpacker.access$100(this$1).length) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public UnpackingSoSource.InputDso next()
    throws IOException
  {
    Object localObject1 = ExoSoSource.ExoUnpacker.access$100(this$1);
    int i = mCurrentDso;
    mCurrentDso = (i + 1);
    Object localObject2 = localObject1[i];
    localObject1 = new FileInputStream(backingFile);
    try
    {
      localObject2 = new UnpackingSoSource.InputDso((UnpackingSoSource.Dso)localObject2, (InputStream)localObject1);
      return (UnpackingSoSource.InputDso)localObject2;
    }
    finally
    {
      ((FileInputStream)localObject1).close();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExoSoSource.ExoUnpacker.FileBackedInputDsoIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */