package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class ActionFile
{
  public static final int VERSION = 0;
  private final File actionFile;
  private final AtomicFile atomicFile;
  
  public ActionFile(File paramFile)
  {
    actionFile = paramFile;
    atomicFile = new AtomicFile(paramFile);
  }
  
  public DownloadAction[] load(DownloadAction.Deserializer... paramVarArgs)
    throws IOException
  {
    boolean bool = actionFile.exists();
    int i = 0;
    if (!bool) {
      return new DownloadAction[0];
    }
    Object localObject1 = null;
    try
    {
      InputStream localInputStream = atomicFile.openRead();
      localObject1 = localInputStream;
      DataInputStream localDataInputStream = new java/io/DataInputStream;
      localObject1 = localInputStream;
      localDataInputStream.<init>(localInputStream);
      localObject1 = localInputStream;
      int j = localDataInputStream.readInt();
      if (j <= 0)
      {
        localObject1 = localInputStream;
        j = localDataInputStream.readInt();
        localObject1 = localInputStream;
        localObject2 = new DownloadAction[j];
        while (i < j)
        {
          localObject1 = localInputStream;
          localObject2[i] = DownloadAction.deserializeFromStream(paramVarArgs, localDataInputStream);
          i++;
        }
        Util.closeQuietly(localInputStream);
        return (DownloadAction[])localObject2;
      }
      localObject1 = localInputStream;
      paramVarArgs = new java/io/IOException;
      localObject1 = localInputStream;
      Object localObject2 = new java/lang/StringBuilder;
      localObject1 = localInputStream;
      ((StringBuilder)localObject2).<init>();
      localObject1 = localInputStream;
      ((StringBuilder)localObject2).append("Unsupported action file version: ");
      localObject1 = localInputStream;
      ((StringBuilder)localObject2).append(j);
      localObject1 = localInputStream;
      paramVarArgs.<init>(((StringBuilder)localObject2).toString());
      localObject1 = localInputStream;
      throw paramVarArgs;
    }
    finally
    {
      Util.closeQuietly((Closeable)localObject1);
    }
  }
  
  /* Error */
  public void store(DownloadAction... paramVarArgs)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 84	java/io/DataOutputStream
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: getfield 24	com/google/android/exoplayer2/offline/ActionFile:atomicFile	Lcom/google/android/exoplayer2/util/AtomicFile;
    //   11: invokevirtual 88	com/google/android/exoplayer2/util/AtomicFile:startWrite	()Ljava/io/OutputStream;
    //   14: invokespecial 91	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   17: iconst_0
    //   18: istore 4
    //   20: aload_3
    //   21: iconst_0
    //   22: invokevirtual 95	java/io/DataOutputStream:writeInt	(I)V
    //   25: aload_3
    //   26: aload_1
    //   27: arraylength
    //   28: invokevirtual 95	java/io/DataOutputStream:writeInt	(I)V
    //   31: aload_1
    //   32: arraylength
    //   33: istore 5
    //   35: iload 4
    //   37: iload 5
    //   39: if_icmpge +17 -> 56
    //   42: aload_1
    //   43: iload 4
    //   45: aaload
    //   46: aload_3
    //   47: invokestatic 99	com/google/android/exoplayer2/offline/DownloadAction:serializeToStream	(Lcom/google/android/exoplayer2/offline/DownloadAction;Ljava/io/OutputStream;)V
    //   50: iinc 4 1
    //   53: goto -18 -> 35
    //   56: aload_0
    //   57: getfield 24	com/google/android/exoplayer2/offline/ActionFile:atomicFile	Lcom/google/android/exoplayer2/util/AtomicFile;
    //   60: aload_3
    //   61: invokevirtual 102	com/google/android/exoplayer2/util/AtomicFile:endWrite	(Ljava/io/OutputStream;)V
    //   64: aconst_null
    //   65: invokestatic 60	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   68: return
    //   69: astore_1
    //   70: aload_3
    //   71: astore_2
    //   72: goto +4 -> 76
    //   75: astore_1
    //   76: aload_2
    //   77: invokestatic 60	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	ActionFile
    //   0	82	1	paramVarArgs	DownloadAction[]
    //   1	76	2	localObject	Object
    //   5	66	3	localDataOutputStream	java.io.DataOutputStream
    //   18	33	4	i	int
    //   33	7	5	j	int
    // Exception table:
    //   from	to	target	type
    //   20	35	69	finally
    //   42	50	69	finally
    //   56	64	69	finally
    //   2	17	75	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.ActionFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */