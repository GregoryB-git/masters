package com.google.android.exoplayer2.util;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import z2;

public final class AtomicFile
{
  private static final String TAG = "AtomicFile";
  private final File backupName;
  private final File baseName;
  
  public AtomicFile(File paramFile)
  {
    baseName = paramFile;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".bak");
    backupName = new File(localStringBuilder.toString());
  }
  
  private void restoreBackup()
  {
    if (backupName.exists())
    {
      baseName.delete();
      backupName.renameTo(baseName);
    }
  }
  
  public void delete()
  {
    baseName.delete();
    backupName.delete();
  }
  
  public void endWrite(OutputStream paramOutputStream)
    throws IOException
  {
    paramOutputStream.close();
    backupName.delete();
  }
  
  public InputStream openRead()
    throws FileNotFoundException
  {
    restoreBackup();
    return new FileInputStream(baseName);
  }
  
  public OutputStream startWrite()
    throws IOException
  {
    Object localObject1;
    if (baseName.exists()) {
      if (!backupName.exists())
      {
        if (!baseName.renameTo(backupName))
        {
          localObject1 = z2.t("Couldn't rename file ");
          ((StringBuilder)localObject1).append(baseName);
          ((StringBuilder)localObject1).append(" to backup file ");
          ((StringBuilder)localObject1).append(backupName);
          Log.w("AtomicFile", ((StringBuilder)localObject1).toString());
        }
      }
      else {
        baseName.delete();
      }
    }
    try
    {
      localObject1 = new com/google/android/exoplayer2/util/AtomicFile$AtomicFileOutputStream;
      ((AtomicFileOutputStream)localObject1).<init>(baseName);
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      localObject2 = baseName.getParentFile();
      if (localObject2 == null) {
        break label163;
      }
    }
    if (((File)localObject2).mkdirs()) {
      try
      {
        AtomicFileOutputStream localAtomicFileOutputStream = new AtomicFileOutputStream(baseName);
        return localAtomicFileOutputStream;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        localObject2 = z2.t("Couldn't create ");
        ((StringBuilder)localObject2).append(baseName);
        throw new IOException(((StringBuilder)localObject2).toString(), localFileNotFoundException2);
      }
    }
    label163:
    Object localObject2 = z2.t("Couldn't create directory ");
    ((StringBuilder)localObject2).append(baseName);
    throw new IOException(((StringBuilder)localObject2).toString(), localFileNotFoundException2);
  }
  
  public static final class AtomicFileOutputStream
    extends OutputStream
  {
    private boolean closed = false;
    private final FileOutputStream fileOutputStream;
    
    public AtomicFileOutputStream(File paramFile)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.AtomicFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */