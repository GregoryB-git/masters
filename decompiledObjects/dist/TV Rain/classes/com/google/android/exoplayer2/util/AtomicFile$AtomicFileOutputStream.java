package com.google.android.exoplayer2.util;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class AtomicFile$AtomicFileOutputStream
  extends OutputStream
{
  private boolean closed = false;
  private final FileOutputStream fileOutputStream;
  
  public AtomicFile$AtomicFileOutputStream(File paramFile)
    throws FileNotFoundException
  {
    fileOutputStream = new FileOutputStream(paramFile);
  }
  
  public void close()
    throws IOException
  {
    if (closed) {
      return;
    }
    closed = true;
    flush();
    try
    {
      fileOutputStream.getFD().sync();
    }
    catch (IOException localIOException)
    {
      Log.w("AtomicFile", "Failed to sync file descriptor:", localIOException);
    }
    fileOutputStream.close();
  }
  
  public void flush()
    throws IOException
  {
    fileOutputStream.flush();
  }
  
  public void write(int paramInt)
    throws IOException
  {
    fileOutputStream.write(paramInt);
  }
  
  public void write(@NonNull byte[] paramArrayOfByte)
    throws IOException
  {
    fileOutputStream.write(paramArrayOfByte);
  }
  
  public void write(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    fileOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.AtomicFile.AtomicFileOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */