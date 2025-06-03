package com.facebook.soloader;

import a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.annotation.Nullable;
import z2;

public abstract class UnpackingSoSource
  extends DirectorySoSource
{
  private static final String DEPS_FILE_NAME = "dso_deps";
  private static final String LOCK_FILE_NAME = "dso_lock";
  private static final String MANIFEST_FILE_NAME = "dso_manifest";
  private static final byte MANIFEST_VERSION = 1;
  private static final byte STATE_CLEAN = 1;
  private static final byte STATE_DIRTY = 0;
  private static final String STATE_FILE_NAME = "dso_state";
  private static final String TAG = "fb-UnpackingSoSource";
  @Nullable
  private String[] mAbis;
  public final Context mContext;
  
  public UnpackingSoSource(Context paramContext, File paramFile)
  {
    super(paramFile, 1);
    mContext = paramContext;
  }
  
  public UnpackingSoSource(Context paramContext, String paramString)
  {
    super(getSoStorePath(paramContext, paramString), 1);
    mContext = paramContext;
  }
  
  private void deleteUnmentionedFiles(Dso[] paramArrayOfDso)
    throws IOException
  {
    String[] arrayOfString = soDirectory.list();
    if (arrayOfString != null)
    {
      for (int i = 0; i < arrayOfString.length; i++)
      {
        Object localObject = arrayOfString[i];
        if ((!((String)localObject).equals("dso_state")) && (!((String)localObject).equals("dso_lock")) && (!((String)localObject).equals("dso_deps")) && (!((String)localObject).equals("dso_manifest")))
        {
          int j = 0;
          for (int k = j; (j == 0) && (k < paramArrayOfDso.length); k++) {
            if (name.equals(localObject)) {
              j = 1;
            }
          }
          if (j == 0)
          {
            File localFile = new File(soDirectory, (String)localObject);
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("deleting unaccounted-for file ");
            ((StringBuilder)localObject).append(localFile);
            Log.v("fb-UnpackingSoSource", ((StringBuilder)localObject).toString());
            SysUtil.dumbDeleteRecursive(localFile);
          }
        }
      }
      return;
    }
    paramArrayOfDso = z2.t("unable to list directory ");
    paramArrayOfDso.append(soDirectory);
    throw new IOException(paramArrayOfDso.toString());
  }
  
  private void extractDso(InputDso paramInputDso, byte[] paramArrayOfByte)
    throws IOException
  {
    Object localObject = z2.t("extracting DSO ");
    ((StringBuilder)localObject).append(dso.name);
    Log.i("fb-UnpackingSoSource", ((StringBuilder)localObject).toString());
    if (soDirectory.setWritable(true, true))
    {
      File localFile = new File(soDirectory, dso.name);
      RandomAccessFile localRandomAccessFile;
      try
      {
        localObject = new java/io/RandomAccessFile;
        ((RandomAccessFile)localObject).<init>(localFile, "rw");
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("error overwriting ");
        localStringBuilder.append(localFile);
        localStringBuilder.append(" trying to delete and start over");
        Log.w("fb-UnpackingSoSource", localStringBuilder.toString(), localIOException);
        SysUtil.dumbDeleteRecursive(localFile);
        localRandomAccessFile = new RandomAccessFile(localFile, "rw");
      }
      try
      {
        int i = content.available();
        if (i > 1) {
          SysUtil.fallocateIfSupported(localRandomAccessFile.getFD(), i);
        }
        SysUtil.copyBytes(localRandomAccessFile, content, Integer.MAX_VALUE, paramArrayOfByte);
        localRandomAccessFile.setLength(localRandomAccessFile.getFilePointer());
        boolean bool = localFile.setExecutable(true, false);
        if (bool) {
          return;
        }
        paramArrayOfByte = new java/io/IOException;
        paramInputDso = new java/lang/StringBuilder;
        paramInputDso.<init>();
        paramInputDso.append("cannot make file executable: ");
        paramInputDso.append(localFile);
        paramArrayOfByte.<init>(paramInputDso.toString());
        throw paramArrayOfByte;
      }
      finally
      {
        localRandomAccessFile.close();
      }
    }
    paramInputDso = z2.t("cannot make directory writable for us: ");
    paramInputDso.append(soDirectory);
    throw new IOException(paramInputDso.toString());
  }
  
  public static File getSoStorePath(Context paramContext, String paramString)
  {
    return new File(a.p(new StringBuilder(), getApplicationInfodataDir, "/", paramString));
  }
  
  /* Error */
  private boolean refreshLocked(final FileLocker paramFileLocker, int paramInt, final byte[] paramArrayOfByte)
    throws IOException
  {
    // Byte code:
    //   0: new 77	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: getfield 75	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   8: ldc 40
    //   10: invokespecial 93	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: astore 4
    //   15: new 150	java/io/RandomAccessFile
    //   18: dup
    //   19: aload 4
    //   21: ldc -104
    //   23: invokespecial 153	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   26: astore 5
    //   28: aload 5
    //   30: invokevirtual 230	java/io/RandomAccessFile:readByte	()B
    //   33: istore 6
    //   35: iload 6
    //   37: istore 7
    //   39: iload 6
    //   41: iconst_1
    //   42: if_icmpeq +78 -> 120
    //   45: new 95	java/lang/StringBuilder
    //   48: astore 8
    //   50: aload 8
    //   52: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   55: aload 8
    //   57: ldc -24
    //   59: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload 8
    //   65: aload_0
    //   66: getfield 75	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   69: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 8
    //   75: ldc -22
    //   77: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: ldc 43
    //   83: aload 8
    //   85: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   91: pop
    //   92: goto +25 -> 117
    //   95: astore_1
    //   96: aload_1
    //   97: athrow
    //   98: astore_3
    //   99: aload 5
    //   101: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   104: goto +11 -> 115
    //   107: astore 5
    //   109: aload_1
    //   110: aload 5
    //   112: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   115: aload_3
    //   116: athrow
    //   117: iconst_0
    //   118: istore 7
    //   120: aload 5
    //   122: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   125: new 77	java/io/File
    //   128: dup
    //   129: aload_0
    //   130: getfield 75	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   133: ldc 25
    //   135: invokespecial 93	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   138: astore 9
    //   140: aconst_null
    //   141: astore 5
    //   143: new 150	java/io/RandomAccessFile
    //   146: dup
    //   147: aload 9
    //   149: ldc -104
    //   151: invokespecial 153	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   154: astore 8
    //   156: aload 8
    //   158: invokevirtual 243	java/io/RandomAccessFile:length	()J
    //   161: l2i
    //   162: istore 6
    //   164: iload 6
    //   166: newarray <illegal type>
    //   168: astore 10
    //   170: aload 8
    //   172: aload 10
    //   174: invokevirtual 247	java/io/RandomAccessFile:read	([B)I
    //   177: iload 6
    //   179: if_icmpeq +14 -> 193
    //   182: ldc 43
    //   184: ldc -7
    //   186: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   189: pop
    //   190: iconst_0
    //   191: istore 7
    //   193: iload 7
    //   195: istore 11
    //   197: aload 10
    //   199: aload_3
    //   200: invokestatic 254	java/util/Arrays:equals	([B[B)Z
    //   203: ifne +19 -> 222
    //   206: ldc 43
    //   208: ldc_w 256
    //   211: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   214: pop
    //   215: iconst_0
    //   216: istore 7
    //   218: iload 7
    //   220: istore 11
    //   222: iload 11
    //   224: ifne +120 -> 344
    //   227: ldc 43
    //   229: ldc_w 258
    //   232: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   235: pop
    //   236: aload 4
    //   238: iconst_0
    //   239: invokestatic 68	com/facebook/soloader/UnpackingSoSource:writeState	(Ljava/io/File;B)V
    //   242: aload_0
    //   243: invokevirtual 262	com/facebook/soloader/UnpackingSoSource:makeUnpacker	()Lcom/facebook/soloader/UnpackingSoSource$Unpacker;
    //   246: astore 10
    //   248: aload 10
    //   250: invokevirtual 266	com/facebook/soloader/UnpackingSoSource$Unpacker:getDsoManifest	()Lcom/facebook/soloader/UnpackingSoSource$DsoManifest;
    //   253: astore 5
    //   255: aload 10
    //   257: invokevirtual 270	com/facebook/soloader/UnpackingSoSource$Unpacker:openDsoIterator	()Lcom/facebook/soloader/UnpackingSoSource$InputDsoIterator;
    //   260: astore 12
    //   262: aload_0
    //   263: iload 11
    //   265: aload 5
    //   267: aload 12
    //   269: invokespecial 274	com/facebook/soloader/UnpackingSoSource:regenerate	(BLcom/facebook/soloader/UnpackingSoSource$DsoManifest;Lcom/facebook/soloader/UnpackingSoSource$InputDsoIterator;)V
    //   272: aload 12
    //   274: ifnull +8 -> 282
    //   277: aload 12
    //   279: invokevirtual 275	com/facebook/soloader/UnpackingSoSource$InputDsoIterator:close	()V
    //   282: aload 10
    //   284: invokevirtual 276	com/facebook/soloader/UnpackingSoSource$Unpacker:close	()V
    //   287: goto +57 -> 344
    //   290: astore_3
    //   291: aload_3
    //   292: athrow
    //   293: astore_1
    //   294: aload 12
    //   296: ifnull +19 -> 315
    //   299: aload 12
    //   301: invokevirtual 275	com/facebook/soloader/UnpackingSoSource$InputDsoIterator:close	()V
    //   304: goto +11 -> 315
    //   307: astore 5
    //   309: aload_3
    //   310: aload 5
    //   312: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   315: aload_1
    //   316: athrow
    //   317: astore_3
    //   318: aload_3
    //   319: athrow
    //   320: astore_1
    //   321: aload 10
    //   323: ifnull +19 -> 342
    //   326: aload 10
    //   328: invokevirtual 276	com/facebook/soloader/UnpackingSoSource$Unpacker:close	()V
    //   331: goto +11 -> 342
    //   334: astore 5
    //   336: aload_3
    //   337: aload 5
    //   339: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   342: aload_1
    //   343: athrow
    //   344: aload 8
    //   346: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   349: aload 5
    //   351: ifnonnull +5 -> 356
    //   354: iconst_0
    //   355: ireturn
    //   356: new 6	com/facebook/soloader/UnpackingSoSource$1
    //   359: dup
    //   360: aload_0
    //   361: aload 9
    //   363: aload_3
    //   364: aload 5
    //   366: aload 4
    //   368: aload_1
    //   369: invokespecial 279	com/facebook/soloader/UnpackingSoSource$1:<init>	(Lcom/facebook/soloader/UnpackingSoSource;Ljava/io/File;[BLcom/facebook/soloader/UnpackingSoSource$DsoManifest;Ljava/io/File;Lcom/facebook/soloader/FileLocker;)V
    //   372: astore_1
    //   373: iload_2
    //   374: iconst_1
    //   375: iand
    //   376: ifeq +40 -> 416
    //   379: ldc_w 281
    //   382: invokestatic 130	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: astore_3
    //   386: aload_3
    //   387: aload_0
    //   388: getfield 75	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   391: invokevirtual 284	java/io/File:getName	()Ljava/lang/String;
    //   394: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: new 286	java/lang/Thread
    //   401: dup
    //   402: aload_1
    //   403: aload_3
    //   404: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   407: invokespecial 289	java/lang/Thread:<init>	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   410: invokevirtual 292	java/lang/Thread:start	()V
    //   413: goto +9 -> 422
    //   416: aload_1
    //   417: invokeinterface 297 1 0
    //   422: iconst_1
    //   423: ireturn
    //   424: astore_1
    //   425: aload_1
    //   426: athrow
    //   427: astore_3
    //   428: aload 8
    //   430: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   433: goto +11 -> 444
    //   436: astore 5
    //   438: aload_1
    //   439: aload 5
    //   441: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   444: aload_3
    //   445: athrow
    //   446: astore 8
    //   448: goto -331 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	451	0	this	UnpackingSoSource
    //   0	451	1	paramFileLocker	FileLocker
    //   0	451	2	paramInt	int
    //   0	451	3	paramArrayOfByte	byte[]
    //   13	354	4	localFile1	File
    //   26	74	5	localRandomAccessFile	RandomAccessFile
    //   107	14	5	localThrowable1	Throwable
    //   141	125	5	localDsoManifest	DsoManifest
    //   307	4	5	localThrowable2	Throwable
    //   334	31	5	localThrowable3	Throwable
    //   436	4	5	localThrowable4	Throwable
    //   33	147	6	i	int
    //   37	182	7	j	int
    //   48	381	8	localObject1	Object
    //   446	1	8	localEOFException	java.io.EOFException
    //   138	224	9	localFile2	File
    //   168	159	10	localObject2	Object
    //   195	69	11	k	int
    //   260	40	12	localInputDsoIterator	InputDsoIterator
    // Exception table:
    //   from	to	target	type
    //   28	35	95	finally
    //   45	92	95	finally
    //   96	98	98	finally
    //   99	104	107	finally
    //   262	272	290	finally
    //   291	293	293	finally
    //   299	304	307	finally
    //   248	262	317	finally
    //   277	282	317	finally
    //   309	315	317	finally
    //   315	317	317	finally
    //   318	320	320	finally
    //   326	331	334	finally
    //   156	170	424	finally
    //   170	190	424	finally
    //   197	215	424	finally
    //   227	248	424	finally
    //   282	287	424	finally
    //   336	342	424	finally
    //   342	344	424	finally
    //   425	427	427	finally
    //   428	433	436	finally
    //   28	35	446	java/io/EOFException
    //   45	92	446	java/io/EOFException
  }
  
  /* Error */
  private void regenerate(byte paramByte, DsoManifest paramDsoManifest, InputDsoIterator paramInputDsoIterator)
    throws IOException
  {
    // Byte code:
    //   0: ldc_w 301
    //   3: invokestatic 130	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6: astore 4
    //   8: aload 4
    //   10: aload_0
    //   11: invokevirtual 307	java/lang/Object:getClass	()Ljava/lang/Class;
    //   14: invokevirtual 310	java/lang/Class:getName	()Ljava/lang/String;
    //   17: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: ldc 43
    //   23: aload 4
    //   25: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: new 150	java/io/RandomAccessFile
    //   35: dup
    //   36: new 77	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: getfield 75	com/facebook/soloader/DirectorySoSource:soDirectory	Ljava/io/File;
    //   44: ldc 31
    //   46: invokespecial 93	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   49: ldc -104
    //   51: invokespecial 153	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   54: astore 5
    //   56: iload_1
    //   57: iconst_1
    //   58: if_icmpne +30 -> 88
    //   61: aload 5
    //   63: invokestatic 313	com/facebook/soloader/UnpackingSoSource$DsoManifest:read	(Ljava/io/DataInput;)Lcom/facebook/soloader/UnpackingSoSource$DsoManifest;
    //   66: astore 4
    //   68: goto +23 -> 91
    //   71: astore_2
    //   72: goto +256 -> 328
    //   75: astore 4
    //   77: ldc 43
    //   79: ldc_w 315
    //   82: aload 4
    //   84: invokestatic 317	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aconst_null
    //   89: astore 4
    //   91: aload 4
    //   93: astore 6
    //   95: aload 4
    //   97: ifnonnull +17 -> 114
    //   100: new 11	com/facebook/soloader/UnpackingSoSource$DsoManifest
    //   103: astore 6
    //   105: aload 6
    //   107: iconst_0
    //   108: anewarray 8	com/facebook/soloader/UnpackingSoSource$Dso
    //   111: invokespecial 319	com/facebook/soloader/UnpackingSoSource$DsoManifest:<init>	([Lcom/facebook/soloader/UnpackingSoSource$Dso;)V
    //   114: aload_0
    //   115: aload_2
    //   116: getfield 323	com/facebook/soloader/UnpackingSoSource$DsoManifest:dsos	[Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   119: invokespecial 325	com/facebook/soloader/UnpackingSoSource:deleteUnmentionedFiles	([Lcom/facebook/soloader/UnpackingSoSource$Dso;)V
    //   122: ldc_w 326
    //   125: newarray <illegal type>
    //   127: astore 4
    //   129: aload_3
    //   130: invokevirtual 330	com/facebook/soloader/UnpackingSoSource$InputDsoIterator:hasNext	()Z
    //   133: ifeq +151 -> 284
    //   136: aload_3
    //   137: invokevirtual 334	com/facebook/soloader/UnpackingSoSource$InputDsoIterator:next	()Lcom/facebook/soloader/UnpackingSoSource$InputDso;
    //   140: astore_2
    //   141: iconst_1
    //   142: istore 7
    //   144: iconst_0
    //   145: istore_1
    //   146: iload 7
    //   148: ifeq +86 -> 234
    //   151: aload 6
    //   153: getfield 323	com/facebook/soloader/UnpackingSoSource$DsoManifest:dsos	[Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   156: astore 8
    //   158: iload_1
    //   159: aload 8
    //   161: arraylength
    //   162: if_icmpge +72 -> 234
    //   165: iload 7
    //   167: istore 9
    //   169: aload 8
    //   171: iload_1
    //   172: aaload
    //   173: getfield 90	com/facebook/soloader/UnpackingSoSource$Dso:name	Ljava/lang/String;
    //   176: aload_2
    //   177: getfield 141	com/facebook/soloader/UnpackingSoSource$InputDso:dso	Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   180: getfield 90	com/facebook/soloader/UnpackingSoSource$Dso:name	Ljava/lang/String;
    //   183: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +33 -> 219
    //   189: iload 7
    //   191: istore 9
    //   193: aload 6
    //   195: getfield 323	com/facebook/soloader/UnpackingSoSource$DsoManifest:dsos	[Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   198: iload_1
    //   199: aaload
    //   200: getfield 337	com/facebook/soloader/UnpackingSoSource$Dso:hash	Ljava/lang/String;
    //   203: aload_2
    //   204: getfield 141	com/facebook/soloader/UnpackingSoSource$InputDso:dso	Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   207: getfield 337	com/facebook/soloader/UnpackingSoSource$Dso:hash	Ljava/lang/String;
    //   210: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   213: ifeq +6 -> 219
    //   216: iconst_0
    //   217: istore 9
    //   219: iinc 1 1
    //   222: iload 9
    //   224: istore 7
    //   226: goto -80 -> 146
    //   229: astore 4
    //   231: goto +18 -> 249
    //   234: iload 7
    //   236: ifeq +37 -> 273
    //   239: aload_0
    //   240: aload_2
    //   241: aload 4
    //   243: invokespecial 339	com/facebook/soloader/UnpackingSoSource:extractDso	(Lcom/facebook/soloader/UnpackingSoSource$InputDso;[B)V
    //   246: goto +27 -> 273
    //   249: aload 4
    //   251: athrow
    //   252: astore_3
    //   253: aload_2
    //   254: ifnull +17 -> 271
    //   257: aload_2
    //   258: invokevirtual 340	com/facebook/soloader/UnpackingSoSource$InputDso:close	()V
    //   261: goto +10 -> 271
    //   264: astore_2
    //   265: aload 4
    //   267: aload_2
    //   268: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   271: aload_3
    //   272: athrow
    //   273: aload_2
    //   274: ifnull -145 -> 129
    //   277: aload_2
    //   278: invokevirtual 340	com/facebook/soloader/UnpackingSoSource$InputDso:close	()V
    //   281: goto -152 -> 129
    //   284: aload 5
    //   286: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   289: new 95	java/lang/StringBuilder
    //   292: dup
    //   293: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   296: astore_2
    //   297: aload_2
    //   298: ldc_w 342
    //   301: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload_2
    //   306: aload_0
    //   307: invokevirtual 307	java/lang/Object:getClass	()Ljava/lang/Class;
    //   310: invokevirtual 310	java/lang/Class:getName	()Ljava/lang/String;
    //   313: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: ldc 43
    //   319: aload_2
    //   320: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   323: invokestatic 117	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   326: pop
    //   327: return
    //   328: aload_2
    //   329: athrow
    //   330: astore_3
    //   331: aload 5
    //   333: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   336: goto +11 -> 347
    //   339: astore 4
    //   341: aload_2
    //   342: aload 4
    //   344: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   347: aload_3
    //   348: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	this	UnpackingSoSource
    //   0	349	1	paramByte	byte
    //   0	349	2	paramDsoManifest	DsoManifest
    //   0	349	3	paramInputDsoIterator	InputDsoIterator
    //   6	61	4	localObject1	Object
    //   75	8	4	localException	Exception
    //   89	39	4	arrayOfByte1	byte[]
    //   229	37	4	arrayOfByte2	byte[]
    //   339	4	4	localThrowable	Throwable
    //   54	278	5	localRandomAccessFile	RandomAccessFile
    //   93	101	6	localObject2	Object
    //   142	93	7	i	int
    //   156	14	8	arrayOfDso	Dso[]
    //   167	56	9	j	int
    // Exception table:
    //   from	to	target	type
    //   61	68	71	finally
    //   77	88	71	finally
    //   100	114	71	finally
    //   114	129	71	finally
    //   129	141	71	finally
    //   265	271	71	finally
    //   271	273	71	finally
    //   277	281	71	finally
    //   61	68	75	java/lang/Exception
    //   151	165	229	finally
    //   169	189	229	finally
    //   193	216	229	finally
    //   239	246	229	finally
    //   249	252	252	finally
    //   257	261	264	finally
    //   328	330	330	finally
    //   331	336	339	finally
  }
  
  /* Error */
  private static void writeState(File paramFile, byte paramByte)
    throws IOException
  {
    // Byte code:
    //   0: new 150	java/io/RandomAccessFile
    //   3: dup
    //   4: aload_0
    //   5: ldc -104
    //   7: invokespecial 153	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   10: astore_2
    //   11: aload_2
    //   12: lconst_0
    //   13: invokevirtual 345	java/io/RandomAccessFile:seek	(J)V
    //   16: aload_2
    //   17: iload_1
    //   18: invokevirtual 349	java/io/RandomAccessFile:write	(I)V
    //   21: aload_2
    //   22: aload_2
    //   23: invokevirtual 188	java/io/RandomAccessFile:getFilePointer	()J
    //   26: invokevirtual 192	java/io/RandomAccessFile:setLength	(J)V
    //   29: aload_2
    //   30: invokevirtual 175	java/io/RandomAccessFile:getFD	()Ljava/io/FileDescriptor;
    //   33: invokevirtual 354	java/io/FileDescriptor:sync	()V
    //   36: aload_2
    //   37: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   40: return
    //   41: astore_0
    //   42: aload_0
    //   43: athrow
    //   44: astore_3
    //   45: aload_2
    //   46: invokevirtual 198	java/io/RandomAccessFile:close	()V
    //   49: goto +9 -> 58
    //   52: astore_2
    //   53: aload_0
    //   54: aload_2
    //   55: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   58: aload_3
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	paramFile	File
    //   0	60	1	paramByte	byte
    //   10	36	2	localRandomAccessFile	RandomAccessFile
    //   52	3	2	localThrowable	Throwable
    //   44	15	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	36	41	finally
    //   42	44	44	finally
    //   45	49	52	finally
  }
  
  /* Error */
  public byte[] getDepsBlock()
    throws IOException
  {
    // Byte code:
    //   0: invokestatic 362	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual 262	com/facebook/soloader/UnpackingSoSource:makeUnpacker	()Lcom/facebook/soloader/UnpackingSoSource$Unpacker;
    //   8: astore_2
    //   9: aload_2
    //   10: invokevirtual 266	com/facebook/soloader/UnpackingSoSource$Unpacker:getDsoManifest	()Lcom/facebook/soloader/UnpackingSoSource$DsoManifest;
    //   13: getfield 323	com/facebook/soloader/UnpackingSoSource$DsoManifest:dsos	[Lcom/facebook/soloader/UnpackingSoSource$Dso;
    //   16: astore_3
    //   17: aload_1
    //   18: iconst_1
    //   19: invokevirtual 366	android/os/Parcel:writeByte	(B)V
    //   22: aload_1
    //   23: aload_3
    //   24: arraylength
    //   25: invokevirtual 369	android/os/Parcel:writeInt	(I)V
    //   28: iconst_0
    //   29: istore 4
    //   31: iload 4
    //   33: aload_3
    //   34: arraylength
    //   35: if_icmpge +31 -> 66
    //   38: aload_1
    //   39: aload_3
    //   40: iload 4
    //   42: aaload
    //   43: getfield 90	com/facebook/soloader/UnpackingSoSource$Dso:name	Ljava/lang/String;
    //   46: invokevirtual 372	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_1
    //   50: aload_3
    //   51: iload 4
    //   53: aaload
    //   54: getfield 337	com/facebook/soloader/UnpackingSoSource$Dso:hash	Ljava/lang/String;
    //   57: invokevirtual 372	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: iinc 4 1
    //   63: goto -32 -> 31
    //   66: aload_2
    //   67: invokevirtual 276	com/facebook/soloader/UnpackingSoSource$Unpacker:close	()V
    //   70: aload_1
    //   71: invokevirtual 375	android/os/Parcel:marshall	()[B
    //   74: astore_2
    //   75: aload_1
    //   76: invokevirtual 378	android/os/Parcel:recycle	()V
    //   79: aload_2
    //   80: areturn
    //   81: astore_1
    //   82: aload_1
    //   83: athrow
    //   84: astore_3
    //   85: aload_2
    //   86: ifnull +16 -> 102
    //   89: aload_2
    //   90: invokevirtual 276	com/facebook/soloader/UnpackingSoSource$Unpacker:close	()V
    //   93: goto +9 -> 102
    //   96: astore_2
    //   97: aload_1
    //   98: aload_2
    //   99: invokevirtual 240	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   102: aload_3
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	UnpackingSoSource
    //   3	73	1	localParcel	android.os.Parcel
    //   81	17	1	localObject1	Object
    //   8	82	2	localObject2	Object
    //   96	3	2	localThrowable	Throwable
    //   16	35	3	arrayOfDso	Dso[]
    //   84	19	3	localObject3	Object
    //   29	32	4	i	int
    // Exception table:
    //   from	to	target	type
    //   9	28	81	finally
    //   31	60	81	finally
    //   82	84	84	finally
    //   89	93	96	finally
  }
  
  public String[] getSoSourceAbis()
  {
    String[] arrayOfString1 = mAbis;
    String[] arrayOfString2 = arrayOfString1;
    if (arrayOfString1 == null) {
      arrayOfString2 = super.getSoSourceAbis();
    }
    return arrayOfString2;
  }
  
  public abstract Unpacker makeUnpacker()
    throws IOException;
  
  public void prepare(int paramInt)
    throws IOException
  {
    SysUtil.mkdirOrThrow(soDirectory);
    Object localObject1 = FileLocker.lock(new File(soDirectory, "dso_lock"));
    try
    {
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1.append("locked dso store ");
      localStringBuilder1.append(soDirectory);
      Log.v("fb-UnpackingSoSource", localStringBuilder1.toString());
      if (refreshLocked((FileLocker)localObject1, paramInt, getDepsBlock()))
      {
        localObject1 = null;
      }
      else
      {
        localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>();
        localStringBuilder1.append("dso store is up-to-date: ");
        localStringBuilder1.append(soDirectory);
        Log.i("fb-UnpackingSoSource", localStringBuilder1.toString());
      }
      return;
    }
    finally
    {
      if (localObject1 != null)
      {
        StringBuilder localStringBuilder2 = z2.t("releasing dso store lock for ");
        localStringBuilder2.append(soDirectory);
        Log.v("fb-UnpackingSoSource", localStringBuilder2.toString());
        ((FileLocker)localObject1).close();
      }
      else
      {
        localObject1 = z2.t("not releasing dso store lock for ");
        ((StringBuilder)localObject1).append(soDirectory);
        ((StringBuilder)localObject1).append(" (syncer thread started)");
        Log.v("fb-UnpackingSoSource", ((StringBuilder)localObject1).toString());
      }
    }
  }
  
  public void setSoSourceAbis(String[] paramArrayOfString)
  {
    mAbis = paramArrayOfString;
  }
  
  public static class Dso
  {
    public final String hash;
    public final String name;
    
    public Dso(String paramString1, String paramString2)
    {
      name = paramString1;
      hash = paramString2;
    }
  }
  
  public static final class DsoManifest
  {
    public final UnpackingSoSource.Dso[] dsos;
    
    public DsoManifest(UnpackingSoSource.Dso[] paramArrayOfDso)
    {
      dsos = paramArrayOfDso;
    }
    
    public static final DsoManifest read(DataInput paramDataInput)
      throws IOException
    {
      if (paramDataInput.readByte() == 1)
      {
        int i = paramDataInput.readInt();
        if (i >= 0)
        {
          UnpackingSoSource.Dso[] arrayOfDso = new UnpackingSoSource.Dso[i];
          for (int j = 0; j < i; j++) {
            arrayOfDso[j] = new UnpackingSoSource.Dso(paramDataInput.readUTF(), paramDataInput.readUTF());
          }
          return new DsoManifest(arrayOfDso);
        }
        throw new RuntimeException("illegal number of shared libraries");
      }
      throw new RuntimeException("wrong dso manifest version");
    }
    
    public final void write(DataOutput paramDataOutput)
      throws IOException
    {
      paramDataOutput.writeByte(1);
      paramDataOutput.writeInt(dsos.length);
      for (int i = 0;; i++)
      {
        UnpackingSoSource.Dso[] arrayOfDso = dsos;
        if (i >= arrayOfDso.length) {
          break;
        }
        paramDataOutput.writeUTF(name);
        paramDataOutput.writeUTF(dsos[i].hash);
      }
    }
  }
  
  public static final class InputDso
    implements Closeable
  {
    public final InputStream content;
    public final UnpackingSoSource.Dso dso;
    
    public InputDso(UnpackingSoSource.Dso paramDso, InputStream paramInputStream)
    {
      dso = paramDso;
      content = paramInputStream;
    }
    
    public void close()
      throws IOException
    {
      content.close();
    }
  }
  
  public static abstract class InputDsoIterator
    implements Closeable
  {
    public void close()
      throws IOException
    {}
    
    public abstract boolean hasNext();
    
    public abstract UnpackingSoSource.InputDso next()
      throws IOException;
  }
  
  public static abstract class Unpacker
    implements Closeable
  {
    public void close()
      throws IOException
    {}
    
    public abstract UnpackingSoSource.DsoManifest getDsoManifest()
      throws IOException;
    
    public abstract UnpackingSoSource.InputDsoIterator openDsoIterator()
      throws IOException;
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */