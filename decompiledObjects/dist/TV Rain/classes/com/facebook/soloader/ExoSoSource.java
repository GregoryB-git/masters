package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ExoSoSource
  extends UnpackingSoSource
{
  public ExoSoSource(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  public UnpackingSoSource.Unpacker makeUnpacker()
    throws IOException
  {
    return new ExoUnpacker(this);
  }
  
  public final class ExoUnpacker
    extends UnpackingSoSource.Unpacker
  {
    private final ExoSoSource.FileDso[] mDsos;
    
    /* Error */
    public ExoUnpacker(UnpackingSoSource paramUnpackingSoSource)
      throws IOException
    {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: putfield 20	com/facebook/soloader/ExoSoSource$ExoUnpacker:this$0	Lcom/facebook/soloader/ExoSoSource;
      //   5: aload_0
      //   6: invokespecial 23	com/facebook/soloader/UnpackingSoSource$Unpacker:<init>	()V
      //   9: aload_1
      //   10: getfield 29	com/facebook/soloader/UnpackingSoSource:mContext	Landroid/content/Context;
      //   13: astore_1
      //   14: ldc 31
      //   16: invokestatic 37	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   19: astore_3
      //   20: aload_3
      //   21: aload_1
      //   22: invokevirtual 43	android/content/Context:getPackageName	()Ljava/lang/String;
      //   25: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   28: pop
      //   29: aload_3
      //   30: ldc 50
      //   32: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   35: pop
      //   36: new 52	java/io/File
      //   39: dup
      //   40: aload_3
      //   41: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   44: invokespecial 58	java/io/File:<init>	(Ljava/lang/String;)V
      //   47: astore 4
      //   49: new 60	java/util/ArrayList
      //   52: dup
      //   53: invokespecial 61	java/util/ArrayList:<init>	()V
      //   56: astore 5
      //   58: new 63	java/util/LinkedHashSet
      //   61: dup
      //   62: invokespecial 64	java/util/LinkedHashSet:<init>	()V
      //   65: astore 6
      //   67: invokestatic 70	com/facebook/soloader/SysUtil:getSupportedAbis	()[Ljava/lang/String;
      //   70: astore 7
      //   72: aload 7
      //   74: arraylength
      //   75: istore 8
      //   77: iconst_0
      //   78: istore 9
      //   80: iload 9
      //   82: iload 8
      //   84: if_icmpge +370 -> 454
      //   87: aload 7
      //   89: iload 9
      //   91: aaload
      //   92: astore_1
      //   93: new 52	java/io/File
      //   96: dup
      //   97: aload 4
      //   99: aload_1
      //   100: invokespecial 73	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   103: astore 10
      //   105: aload 10
      //   107: invokevirtual 77	java/io/File:isDirectory	()Z
      //   110: ifne +6 -> 116
      //   113: goto +295 -> 408
      //   116: aload 6
      //   118: aload_1
      //   119: invokeinterface 83 2 0
      //   124: pop
      //   125: new 52	java/io/File
      //   128: dup
      //   129: aload 10
      //   131: ldc 85
      //   133: invokespecial 73	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   136: astore_1
      //   137: aload_1
      //   138: invokevirtual 88	java/io/File:isFile	()Z
      //   141: ifne +6 -> 147
      //   144: goto +264 -> 408
      //   147: new 90	java/io/FileReader
      //   150: dup
      //   151: aload_1
      //   152: invokespecial 93	java/io/FileReader:<init>	(Ljava/io/File;)V
      //   155: astore_1
      //   156: new 95	java/io/BufferedReader
      //   159: astore_3
      //   160: aload_3
      //   161: aload_1
      //   162: invokespecial 98	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   165: iconst_0
      //   166: istore 11
      //   168: aload_3
      //   169: invokevirtual 101	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   172: astore 12
      //   174: aload 12
      //   176: ifnull +224 -> 400
      //   179: aload 12
      //   181: invokevirtual 107	java/lang/String:length	()I
      //   184: ifne +6 -> 190
      //   187: goto -22 -> 165
      //   190: aload 12
      //   192: bipush 32
      //   194: invokevirtual 111	java/lang/String:indexOf	(I)I
      //   197: istore 13
      //   199: iload 13
      //   201: iconst_m1
      //   202: if_icmpeq +152 -> 354
      //   205: new 45	java/lang/StringBuilder
      //   208: astore 14
      //   210: aload 14
      //   212: invokespecial 112	java/lang/StringBuilder:<init>	()V
      //   215: aload 14
      //   217: aload 12
      //   219: iconst_0
      //   220: iload 13
      //   222: invokevirtual 116	java/lang/String:substring	(II)Ljava/lang/String;
      //   225: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   228: pop
      //   229: aload 14
      //   231: ldc 118
      //   233: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   236: pop
      //   237: aload 14
      //   239: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   242: astore 14
      //   244: aload 5
      //   246: invokevirtual 121	java/util/ArrayList:size	()I
      //   249: istore 15
      //   251: iload 11
      //   253: iload 15
      //   255: if_icmpge +36 -> 291
      //   258: aload 5
      //   260: iload 11
      //   262: invokevirtual 125	java/util/ArrayList:get	(I)Ljava/lang/Object;
      //   265: checkcast 127	com/facebook/soloader/ExoSoSource$FileDso
      //   268: getfield 133	com/facebook/soloader/UnpackingSoSource$Dso:name	Ljava/lang/String;
      //   271: aload 14
      //   273: invokevirtual 136	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   276: ifeq +9 -> 285
      //   279: iconst_1
      //   280: istore 11
      //   282: goto +12 -> 294
      //   285: iinc 11 1
      //   288: goto -37 -> 251
      //   291: iconst_0
      //   292: istore 11
      //   294: iload 11
      //   296: ifeq +6 -> 302
      //   299: goto +52 -> 351
      //   302: aload 12
      //   304: iload 13
      //   306: iconst_1
      //   307: iadd
      //   308: invokevirtual 139	java/lang/String:substring	(I)Ljava/lang/String;
      //   311: astore 16
      //   313: new 127	com/facebook/soloader/ExoSoSource$FileDso
      //   316: astore 12
      //   318: new 52	java/io/File
      //   321: astore 17
      //   323: aload 17
      //   325: aload 10
      //   327: aload 16
      //   329: invokespecial 73	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   332: aload 12
      //   334: aload 14
      //   336: aload 16
      //   338: aload 17
      //   340: invokespecial 142	com/facebook/soloader/ExoSoSource$FileDso:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
      //   343: aload 5
      //   345: aload 12
      //   347: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
      //   350: pop
      //   351: goto -186 -> 165
      //   354: new 145	java/lang/RuntimeException
      //   357: astore 10
      //   359: new 45	java/lang/StringBuilder
      //   362: astore_2
      //   363: aload_2
      //   364: invokespecial 112	java/lang/StringBuilder:<init>	()V
      //   367: aload_2
      //   368: ldc -109
      //   370: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   373: pop
      //   374: aload_2
      //   375: aload 12
      //   377: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   380: pop
      //   381: aload_2
      //   382: ldc -107
      //   384: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   387: pop
      //   388: aload 10
      //   390: aload_2
      //   391: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   394: invokespecial 150	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
      //   397: aload 10
      //   399: athrow
      //   400: aload_3
      //   401: invokevirtual 153	java/io/BufferedReader:close	()V
      //   404: aload_1
      //   405: invokevirtual 156	java/io/Reader:close	()V
      //   408: iinc 9 1
      //   411: goto -331 -> 80
      //   414: astore_2
      //   415: aload_2
      //   416: athrow
      //   417: astore 10
      //   419: aload_3
      //   420: invokevirtual 153	java/io/BufferedReader:close	()V
      //   423: goto +9 -> 432
      //   426: astore_3
      //   427: aload_2
      //   428: aload_3
      //   429: invokevirtual 162	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   432: aload 10
      //   434: athrow
      //   435: astore_3
      //   436: aload_3
      //   437: athrow
      //   438: astore_2
      //   439: aload_1
      //   440: invokevirtual 156	java/io/Reader:close	()V
      //   443: goto +9 -> 452
      //   446: astore_1
      //   447: aload_3
      //   448: aload_1
      //   449: invokevirtual 162	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   452: aload_2
      //   453: athrow
      //   454: aload_2
      //   455: aload 6
      //   457: aload 6
      //   459: invokeinterface 163 1 0
      //   464: anewarray 103	java/lang/String
      //   467: invokeinterface 167 2 0
      //   472: checkcast 169	[Ljava/lang/String;
      //   475: invokevirtual 173	com/facebook/soloader/UnpackingSoSource:setSoSourceAbis	([Ljava/lang/String;)V
      //   478: aload_0
      //   479: aload 5
      //   481: aload 5
      //   483: invokevirtual 121	java/util/ArrayList:size	()I
      //   486: anewarray 127	com/facebook/soloader/ExoSoSource$FileDso
      //   489: invokevirtual 174	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
      //   492: checkcast 175	[Lcom/facebook/soloader/ExoSoSource$FileDso;
      //   495: putfield 177	com/facebook/soloader/ExoSoSource$ExoUnpacker:mDsos	[Lcom/facebook/soloader/ExoSoSource$FileDso;
      //   498: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	499	0	this	ExoUnpacker
      //   0	499	1	this$1	ExoSoSource
      //   0	499	2	paramUnpackingSoSource	UnpackingSoSource
      //   19	401	3	localObject1	Object
      //   426	3	3	localThrowable	Throwable
      //   435	13	3	localObject2	Object
      //   47	51	4	localFile1	File
      //   56	426	5	localArrayList	java.util.ArrayList
      //   65	393	6	localLinkedHashSet	java.util.LinkedHashSet
      //   70	18	7	arrayOfString	String[]
      //   75	10	8	i	int
      //   78	331	9	j	int
      //   103	295	10	localObject3	Object
      //   417	16	10	localObject4	Object
      //   166	129	11	k	int
      //   172	204	12	localObject5	Object
      //   197	111	13	m	int
      //   208	127	14	localObject6	Object
      //   249	7	15	n	int
      //   311	26	16	str	String
      //   321	18	17	localFile2	File
      // Exception table:
      //   from	to	target	type
      //   168	174	414	finally
      //   179	187	414	finally
      //   190	199	414	finally
      //   205	251	414	finally
      //   258	279	414	finally
      //   302	351	414	finally
      //   354	400	414	finally
      //   415	417	417	finally
      //   419	423	426	finally
      //   156	165	435	finally
      //   400	404	435	finally
      //   427	432	435	finally
      //   432	435	435	finally
      //   436	438	438	finally
      //   439	443	446	finally
    }
    
    public UnpackingSoSource.DsoManifest getDsoManifest()
      throws IOException
    {
      return new UnpackingSoSource.DsoManifest(mDsos);
    }
    
    public UnpackingSoSource.InputDsoIterator openDsoIterator()
      throws IOException
    {
      return new FileBackedInputDsoIterator(null);
    }
    
    public final class FileBackedInputDsoIterator
      extends UnpackingSoSource.InputDsoIterator
    {
      private int mCurrentDso;
      
      private FileBackedInputDsoIterator() {}
      
      public boolean hasNext()
      {
        boolean bool;
        if (mCurrentDso < ExoSoSource.ExoUnpacker.access$100(ExoSoSource.ExoUnpacker.this).length) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public UnpackingSoSource.InputDso next()
        throws IOException
      {
        Object localObject1 = ExoSoSource.ExoUnpacker.access$100(ExoSoSource.ExoUnpacker.this);
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
  }
  
  public static final class FileDso
    extends UnpackingSoSource.Dso
  {
    public final File backingFile;
    
    public FileDso(String paramString1, String paramString2, File paramFile)
    {
      super(paramString2);
      backingFile = paramFile;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExoSoSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */