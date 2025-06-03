package androidx.core.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import z2;

public class AtomicFile
{
  private static final String LOG_TAG = "AtomicFile";
  private final File mBaseName;
  private final File mLegacyBackupName;
  private final File mNewName;
  
  public AtomicFile(@NonNull File paramFile)
  {
    mBaseName = paramFile;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".new");
    mNewName = new File(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFile.getPath());
    localStringBuilder.append(".bak");
    mLegacyBackupName = new File(localStringBuilder.toString());
  }
  
  private static void rename(@NonNull File paramFile1, @NonNull File paramFile2)
  {
    StringBuilder localStringBuilder;
    if ((paramFile2.isDirectory()) && (!paramFile2.delete()))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to delete file which is a directory ");
      localStringBuilder.append(paramFile2);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
    if (!paramFile1.renameTo(paramFile2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to rename ");
      localStringBuilder.append(paramFile1);
      localStringBuilder.append(" to ");
      localStringBuilder.append(paramFile2);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
  }
  
  private static boolean sync(@NonNull FileOutputStream paramFileOutputStream)
  {
    try
    {
      paramFileOutputStream.getFD().sync();
      return true;
    }
    catch (IOException paramFileOutputStream) {}
    return false;
  }
  
  public void delete()
  {
    mBaseName.delete();
    mNewName.delete();
    mLegacyBackupName.delete();
  }
  
  public void failWrite(@Nullable FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream == null) {
      return;
    }
    if (!sync(paramFileOutputStream)) {
      Log.e("AtomicFile", "Failed to sync file output stream");
    }
    try
    {
      paramFileOutputStream.close();
    }
    catch (IOException paramFileOutputStream)
    {
      Log.e("AtomicFile", "Failed to close file output stream", paramFileOutputStream);
    }
    if (!mNewName.delete())
    {
      paramFileOutputStream = z2.t("Failed to delete new file ");
      paramFileOutputStream.append(mNewName);
      Log.e("AtomicFile", paramFileOutputStream.toString());
    }
  }
  
  public void finishWrite(@Nullable FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream == null) {
      return;
    }
    if (!sync(paramFileOutputStream)) {
      Log.e("AtomicFile", "Failed to sync file output stream");
    }
    try
    {
      paramFileOutputStream.close();
    }
    catch (IOException paramFileOutputStream)
    {
      Log.e("AtomicFile", "Failed to close file output stream", paramFileOutputStream);
    }
    rename(mNewName, mBaseName);
  }
  
  @NonNull
  public File getBaseFile()
  {
    return mBaseName;
  }
  
  @NonNull
  public FileInputStream openRead()
    throws FileNotFoundException
  {
    if (mLegacyBackupName.exists()) {
      rename(mLegacyBackupName, mBaseName);
    }
    if ((mNewName.exists()) && (mBaseName.exists()) && (!mNewName.delete()))
    {
      StringBuilder localStringBuilder = z2.t("Failed to delete outdated new file ");
      localStringBuilder.append(mNewName);
      Log.e("AtomicFile", localStringBuilder.toString());
    }
    return new FileInputStream(mBaseName);
  }
  
  /* Error */
  @NonNull
  public byte[] readFully()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 137	androidx/core/util/AtomicFile:openRead	()Ljava/io/FileInputStream;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual 141	java/io/FileInputStream:available	()I
    //   9: newarray <illegal type>
    //   11: astore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: aload_1
    //   15: aload_2
    //   16: iload_3
    //   17: aload_2
    //   18: arraylength
    //   19: iload_3
    //   20: isub
    //   21: invokevirtual 145	java/io/FileInputStream:read	([BII)I
    //   24: istore 4
    //   26: iload 4
    //   28: ifgt +9 -> 37
    //   31: aload_1
    //   32: invokevirtual 146	java/io/FileInputStream:close	()V
    //   35: aload_2
    //   36: areturn
    //   37: iload_3
    //   38: iload 4
    //   40: iadd
    //   41: istore 4
    //   43: aload_1
    //   44: invokevirtual 141	java/io/FileInputStream:available	()I
    //   47: istore 5
    //   49: iload 4
    //   51: istore_3
    //   52: iload 5
    //   54: aload_2
    //   55: arraylength
    //   56: iload 4
    //   58: isub
    //   59: if_icmple -45 -> 14
    //   62: iload 5
    //   64: iload 4
    //   66: iadd
    //   67: newarray <illegal type>
    //   69: astore 6
    //   71: aload_2
    //   72: iconst_0
    //   73: aload 6
    //   75: iconst_0
    //   76: iload 4
    //   78: invokestatic 152	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   81: aload 6
    //   83: astore_2
    //   84: iload 4
    //   86: istore_3
    //   87: goto -73 -> 14
    //   90: astore_2
    //   91: aload_1
    //   92: invokevirtual 146	java/io/FileInputStream:close	()V
    //   95: aload_2
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	AtomicFile
    //   4	88	1	localFileInputStream	FileInputStream
    //   11	73	2	localObject1	Object
    //   90	6	2	localObject2	Object
    //   13	74	3	i	int
    //   24	61	4	j	int
    //   47	20	5	k	int
    //   69	13	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   5	12	90	finally
    //   14	26	90	finally
    //   43	49	90	finally
    //   52	81	90	finally
  }
  
  @NonNull
  public FileOutputStream startWrite()
    throws IOException
  {
    if (mLegacyBackupName.exists()) {
      rename(mLegacyBackupName, mBaseName);
    }
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(mNewName);
      return localFileOutputStream;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      if (mNewName.getParentFile().mkdirs()) {
        try
        {
          localObject = new FileOutputStream(mNewName);
          return (FileOutputStream)localObject;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          localObject = z2.t("Failed to create new file ");
          ((StringBuilder)localObject).append(mNewName);
          throw new IOException(((StringBuilder)localObject).toString(), localFileNotFoundException2);
        }
      }
      Object localObject = z2.t("Failed to create directory for ");
      ((StringBuilder)localObject).append(mNewName);
      throw new IOException(((StringBuilder)localObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.AtomicFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */