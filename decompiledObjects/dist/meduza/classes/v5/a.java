package v5;

import f;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a
{
  public final File a;
  public final File b;
  
  public a(File paramFile)
  {
    a = paramFile;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".bak");
    b = new File(localStringBuilder.toString());
  }
  
  public final FileInputStream a()
  {
    if (b.exists())
    {
      a.delete();
      b.renameTo(a);
    }
    return new FileInputStream(a);
  }
  
  public final a b()
  {
    Object localObject1;
    if (a.exists()) {
      if (!b.exists())
      {
        if (!a.renameTo(b))
        {
          localObject1 = f.l("Couldn't rename file ");
          ((StringBuilder)localObject1).append(a);
          ((StringBuilder)localObject1).append(" to backup file ");
          ((StringBuilder)localObject1).append(b);
          m.f("AtomicFile", ((StringBuilder)localObject1).toString());
        }
      }
      else {
        a.delete();
      }
    }
    File localFile;
    try
    {
      localObject1 = new v5/a$a;
      ((a)localObject1).<init>(a);
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      localFile = a.getParentFile();
      if (localFile == null) {
        break label163;
      }
    }
    Object localObject2;
    if (localFile.mkdirs()) {
      try
      {
        localObject2 = new a(a);
        return (a)localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        localObject2 = f.l("Couldn't create ");
        ((StringBuilder)localObject2).append(a);
        throw new IOException(((StringBuilder)localObject2).toString(), localFileNotFoundException2);
      }
    }
    label163:
    StringBuilder localStringBuilder = f.l("Couldn't create ");
    localStringBuilder.append(a);
    throw new IOException(localStringBuilder.toString(), (Throwable)localObject2);
  }
  
  public static final class a
    extends OutputStream
  {
    public final FileOutputStream a;
    public boolean b = false;
    
    public a(File paramFile)
    {
      a = new FileOutputStream(paramFile);
    }
    
    public final void close()
    {
      if (b) {
        return;
      }
      b = true;
      flush();
      try
      {
        a.getFD().sync();
      }
      catch (IOException localIOException)
      {
        m.g("AtomicFile", "Failed to sync file descriptor:", localIOException);
      }
      a.close();
    }
    
    public final void flush()
    {
      a.flush();
    }
    
    public final void write(int paramInt)
    {
      a.write(paramInt);
    }
    
    public final void write(byte[] paramArrayOfByte)
    {
      a.write(paramArrayOfByte);
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      a.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     v5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */