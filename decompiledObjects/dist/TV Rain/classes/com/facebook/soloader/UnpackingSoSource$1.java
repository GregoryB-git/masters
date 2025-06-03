package com.facebook.soloader;

import java.io.File;

class UnpackingSoSource$1
  implements Runnable
{
  public UnpackingSoSource$1(UnpackingSoSource paramUnpackingSoSource, File paramFile1, byte[] paramArrayOfByte, UnpackingSoSource.DsoManifest paramDsoManifest, File paramFile2, FileLocker paramFileLocker) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc 45
    //   2: ldc 47
    //   4: invokestatic 53	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   7: pop
    //   8: new 55	java/io/RandomAccessFile
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 28	com/facebook/soloader/UnpackingSoSource$1:val$depsFileName	Ljava/io/File;
    //   17: ldc 57
    //   19: invokespecial 60	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 30	com/facebook/soloader/UnpackingSoSource$1:val$deps	[B
    //   27: invokevirtual 64	java/io/RandomAccessFile:write	([B)V
    //   30: aload_1
    //   31: aload_1
    //   32: invokevirtual 68	java/io/RandomAccessFile:getFilePointer	()J
    //   35: invokevirtual 72	java/io/RandomAccessFile:setLength	(J)V
    //   38: aload_1
    //   39: invokevirtual 75	java/io/RandomAccessFile:close	()V
    //   42: new 77	java/io/File
    //   45: astore_2
    //   46: aload_2
    //   47: aload_0
    //   48: getfield 26	com/facebook/soloader/UnpackingSoSource$1:this$0	Lcom/facebook/soloader/UnpackingSoSource;
    //   51: getfield 82	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   54: ldc 84
    //   56: invokespecial 85	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   59: new 55	java/io/RandomAccessFile
    //   62: astore_3
    //   63: aload_3
    //   64: aload_2
    //   65: ldc 57
    //   67: invokespecial 60	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   70: aload_0
    //   71: getfield 32	com/facebook/soloader/UnpackingSoSource$1:val$manifest	Lcom/facebook/soloader/UnpackingSoSource$DsoManifest;
    //   74: aload_3
    //   75: invokevirtual 90	com/facebook/soloader/UnpackingSoSource$DsoManifest:write	(Ljava/io/DataOutput;)V
    //   78: aload_3
    //   79: invokevirtual 75	java/io/RandomAccessFile:close	()V
    //   82: aload_0
    //   83: getfield 26	com/facebook/soloader/UnpackingSoSource$1:this$0	Lcom/facebook/soloader/UnpackingSoSource;
    //   86: getfield 82	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   89: invokestatic 96	com/facebook/soloader/SysUtil:fsyncRecursive	(Ljava/io/File;)V
    //   92: aload_0
    //   93: getfield 34	com/facebook/soloader/UnpackingSoSource$1:val$stateFileName	Ljava/io/File;
    //   96: iconst_1
    //   97: invokestatic 100	com/facebook/soloader/UnpackingSoSource:access$000	(Ljava/io/File;B)V
    //   100: new 102	java/lang/StringBuilder
    //   103: astore_3
    //   104: aload_3
    //   105: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   108: aload_3
    //   109: ldc 105
    //   111: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload_3
    //   116: aload_0
    //   117: getfield 26	com/facebook/soloader/UnpackingSoSource$1:this$0	Lcom/facebook/soloader/UnpackingSoSource;
    //   120: getfield 82	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   123: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_3
    //   128: ldc 114
    //   130: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: ldc 45
    //   136: aload_3
    //   137: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 53	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   143: pop
    //   144: aload_0
    //   145: getfield 36	com/facebook/soloader/UnpackingSoSource$1:val$lock	Lcom/facebook/soloader/FileLocker;
    //   148: invokevirtual 121	com/facebook/soloader/FileLocker:close	()V
    //   151: return
    //   152: astore_1
    //   153: aload_1
    //   154: athrow
    //   155: astore_2
    //   156: aload_3
    //   157: invokevirtual 75	java/io/RandomAccessFile:close	()V
    //   160: goto +9 -> 169
    //   163: astore_3
    //   164: aload_1
    //   165: aload_3
    //   166: invokevirtual 127	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   169: aload_2
    //   170: athrow
    //   171: astore_2
    //   172: aload_2
    //   173: athrow
    //   174: astore_3
    //   175: aload_1
    //   176: invokevirtual 75	java/io/RandomAccessFile:close	()V
    //   179: goto +9 -> 188
    //   182: astore_1
    //   183: aload_2
    //   184: aload_1
    //   185: invokevirtual 127	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   188: aload_3
    //   189: athrow
    //   190: astore_3
    //   191: new 102	java/lang/StringBuilder
    //   194: astore_2
    //   195: aload_2
    //   196: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   199: aload_2
    //   200: ldc 105
    //   202: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload_2
    //   207: aload_0
    //   208: getfield 26	com/facebook/soloader/UnpackingSoSource$1:this$0	Lcom/facebook/soloader/UnpackingSoSource;
    //   211: getfield 82	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   214: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload_2
    //   219: ldc 114
    //   221: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: ldc 45
    //   227: aload_2
    //   228: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: invokestatic 53	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   234: pop
    //   235: aload_0
    //   236: getfield 36	com/facebook/soloader/UnpackingSoSource$1:val$lock	Lcom/facebook/soloader/FileLocker;
    //   239: invokevirtual 121	com/facebook/soloader/FileLocker:close	()V
    //   242: aload_3
    //   243: athrow
    //   244: astore_3
    //   245: new 129	java/lang/RuntimeException
    //   248: dup
    //   249: aload_3
    //   250: invokespecial 131	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   253: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	1
    //   11	28	1	localRandomAccessFile	java.io.RandomAccessFile
    //   152	24	1	localObject1	Object
    //   182	3	1	localThrowable1	Throwable
    //   45	20	2	localFile	File
    //   155	15	2	localObject2	Object
    //   171	13	2	localObject3	Object
    //   194	34	2	localStringBuilder	StringBuilder
    //   62	95	3	localObject4	Object
    //   163	3	3	localThrowable2	Throwable
    //   174	15	3	localObject5	Object
    //   190	53	3	localObject6	Object
    //   244	6	3	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   70	78	152	finally
    //   153	155	155	finally
    //   156	160	163	finally
    //   22	38	171	finally
    //   172	174	174	finally
    //   175	179	182	finally
    //   0	22	190	finally
    //   38	70	190	finally
    //   78	100	190	finally
    //   164	169	190	finally
    //   169	171	190	finally
    //   183	188	190	finally
    //   188	190	190	finally
    //   100	151	244	java/io/IOException
    //   191	244	244	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */