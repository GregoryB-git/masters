package androidx.room;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import z2;

class SQLiteCopyOpenHelper
  implements SupportSQLiteOpenHelper
{
  @NonNull
  private final Context mContext;
  @Nullable
  private final String mCopyFromAssetPath;
  @Nullable
  private final File mCopyFromFile;
  @Nullable
  private DatabaseConfiguration mDatabaseConfiguration;
  private final int mDatabaseVersion;
  @NonNull
  private final SupportSQLiteOpenHelper mDelegate;
  private boolean mVerified;
  
  public SQLiteCopyOpenHelper(@NonNull Context paramContext, @Nullable String paramString, @Nullable File paramFile, int paramInt, @NonNull SupportSQLiteOpenHelper paramSupportSQLiteOpenHelper)
  {
    mContext = paramContext;
    mCopyFromAssetPath = paramString;
    mCopyFromFile = paramFile;
    mDatabaseVersion = paramInt;
    mDelegate = paramSupportSQLiteOpenHelper;
  }
  
  private void copyDatabaseFile(File paramFile)
    throws IOException
  {
    if (mCopyFromAssetPath != null)
    {
      localObject = Channels.newChannel(mContext.getAssets().open(mCopyFromAssetPath));
    }
    else
    {
      if (mCopyFromFile == null) {
        break label196;
      }
      localObject = new FileInputStream(mCopyFromFile).getChannel();
    }
    File localFile = File.createTempFile("room-copy-helper", ".tmp", mContext.getCacheDir());
    localFile.deleteOnExit();
    FileUtil.copy((ReadableByteChannel)localObject, new FileOutputStream(localFile).getChannel());
    Object localObject = paramFile.getParentFile();
    if ((localObject != null) && (!((File)localObject).exists()) && (!((File)localObject).mkdirs()))
    {
      localObject = z2.t("Failed to create directories for ");
      ((StringBuilder)localObject).append(paramFile.getAbsolutePath());
      throw new IOException(((StringBuilder)localObject).toString());
    }
    if (localFile.renameTo(paramFile)) {
      return;
    }
    localObject = z2.t("Failed to move intermediate file (");
    ((StringBuilder)localObject).append(localFile.getAbsolutePath());
    ((StringBuilder)localObject).append(") to destination (");
    ((StringBuilder)localObject).append(paramFile.getAbsolutePath());
    ((StringBuilder)localObject).append(").");
    throw new IOException(((StringBuilder)localObject).toString());
    label196:
    throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
  }
  
  /* Error */
  private void verifyDatabaseFile()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 149	androidx/room/SQLiteCopyOpenHelper:getDatabaseName	()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 29	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   9: aload_1
    //   10: invokevirtual 153	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 155	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull +19 -> 39
    //   23: aload_3
    //   24: getfield 160	androidx/room/DatabaseConfiguration:multiInstanceInvalidation	Z
    //   27: ifeq +6 -> 33
    //   30: goto +9 -> 39
    //   33: iconst_0
    //   34: istore 4
    //   36: goto +6 -> 42
    //   39: iconst_1
    //   40: istore 4
    //   42: new 162	androidx/room/util/CopyLock
    //   45: dup
    //   46: aload_1
    //   47: aload_0
    //   48: getfield 29	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   51: invokevirtual 165	android/content/Context:getFilesDir	()Ljava/io/File;
    //   54: iload 4
    //   56: invokespecial 168	androidx/room/util/CopyLock:<init>	(Ljava/lang/String;Ljava/io/File;Z)V
    //   59: astore_3
    //   60: aload_3
    //   61: invokevirtual 171	androidx/room/util/CopyLock:lock	()V
    //   64: aload_2
    //   65: invokevirtual 103	java/io/File:exists	()Z
    //   68: istore 4
    //   70: iload 4
    //   72: ifne +27 -> 99
    //   75: aload_0
    //   76: aload_2
    //   77: invokespecial 173	androidx/room/SQLiteCopyOpenHelper:copyDatabaseFile	(Ljava/io/File;)V
    //   80: aload_3
    //   81: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   84: return
    //   85: astore_1
    //   86: new 178	java/lang/RuntimeException
    //   89: astore_2
    //   90: aload_2
    //   91: ldc -76
    //   93: aload_1
    //   94: invokespecial 183	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: aload_2
    //   98: athrow
    //   99: aload_0
    //   100: getfield 155	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   103: astore 5
    //   105: aload 5
    //   107: ifnonnull +8 -> 115
    //   110: aload_3
    //   111: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   114: return
    //   115: aload_2
    //   116: invokestatic 189	androidx/room/util/DBUtil:readVersion	(Ljava/io/File;)I
    //   119: istore 6
    //   121: aload_0
    //   122: getfield 35	androidx/room/SQLiteCopyOpenHelper:mDatabaseVersion	I
    //   125: istore 7
    //   127: iload 6
    //   129: iload 7
    //   131: if_icmpne +8 -> 139
    //   134: aload_3
    //   135: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   138: return
    //   139: aload_0
    //   140: getfield 155	androidx/room/SQLiteCopyOpenHelper:mDatabaseConfiguration	Landroidx/room/DatabaseConfiguration;
    //   143: iload 6
    //   145: iload 7
    //   147: invokevirtual 193	androidx/room/DatabaseConfiguration:isMigrationRequired	(II)Z
    //   150: istore 4
    //   152: iload 4
    //   154: ifeq +8 -> 162
    //   157: aload_3
    //   158: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   161: return
    //   162: aload_0
    //   163: getfield 29	androidx/room/SQLiteCopyOpenHelper:mContext	Landroid/content/Context;
    //   166: aload_1
    //   167: invokevirtual 197	android/content/Context:deleteDatabase	(Ljava/lang/String;)Z
    //   170: istore 4
    //   172: iload 4
    //   174: ifeq +24 -> 198
    //   177: aload_0
    //   178: aload_2
    //   179: invokespecial 173	androidx/room/SQLiteCopyOpenHelper:copyDatabaseFile	(Ljava/io/File;)V
    //   182: goto +54 -> 236
    //   185: astore_1
    //   186: ldc -57
    //   188: ldc -76
    //   190: aload_1
    //   191: invokestatic 205	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   194: pop
    //   195: goto +41 -> 236
    //   198: new 120	java/lang/StringBuilder
    //   201: astore_2
    //   202: aload_2
    //   203: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   206: aload_2
    //   207: ldc -48
    //   209: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_2
    //   214: aload_1
    //   215: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload_2
    //   220: ldc -46
    //   222: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: ldc -57
    //   228: aload_2
    //   229: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokestatic 213	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   235: pop
    //   236: aload_3
    //   237: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   240: return
    //   241: astore_1
    //   242: ldc -57
    //   244: ldc -41
    //   246: aload_1
    //   247: invokestatic 205	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   250: pop
    //   251: aload_3
    //   252: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   255: return
    //   256: astore_1
    //   257: aload_3
    //   258: invokevirtual 176	androidx/room/util/CopyLock:unlock	()V
    //   261: aload_1
    //   262: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	this	SQLiteCopyOpenHelper
    //   4	43	1	str	String
    //   85	82	1	localIOException1	IOException
    //   185	30	1	localIOException2	IOException
    //   241	6	1	localIOException3	IOException
    //   256	6	1	localObject1	Object
    //   13	216	2	localObject2	Object
    //   18	240	3	localObject3	Object
    //   34	139	4	bool	boolean
    //   103	3	5	localDatabaseConfiguration	DatabaseConfiguration
    //   119	25	6	i	int
    //   125	21	7	j	int
    // Exception table:
    //   from	to	target	type
    //   75	80	85	java/io/IOException
    //   177	182	185	java/io/IOException
    //   115	121	241	java/io/IOException
    //   60	70	256	finally
    //   75	80	256	finally
    //   86	99	256	finally
    //   99	105	256	finally
    //   115	121	256	finally
    //   121	127	256	finally
    //   139	152	256	finally
    //   162	172	256	finally
    //   177	182	256	finally
    //   186	195	256	finally
    //   198	236	256	finally
    //   242	251	256	finally
  }
  
  public void close()
  {
    try
    {
      mDelegate.close();
      mVerified = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String getDatabaseName()
  {
    return mDelegate.getDatabaseName();
  }
  
  public SupportSQLiteDatabase getReadableDatabase()
  {
    try
    {
      if (!mVerified)
      {
        verifyDatabaseFile();
        mVerified = true;
      }
      SupportSQLiteDatabase localSupportSQLiteDatabase = mDelegate.getReadableDatabase();
      return localSupportSQLiteDatabase;
    }
    finally {}
  }
  
  public SupportSQLiteDatabase getWritableDatabase()
  {
    try
    {
      if (!mVerified)
      {
        verifyDatabaseFile();
        mVerified = true;
      }
      SupportSQLiteDatabase localSupportSQLiteDatabase = mDelegate.getWritableDatabase();
      return localSupportSQLiteDatabase;
    }
    finally {}
  }
  
  public void setDatabaseConfiguration(@Nullable DatabaseConfiguration paramDatabaseConfiguration)
  {
    mDatabaseConfiguration = paramDatabaseConfiguration;
  }
  
  @RequiresApi(api=16)
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    mDelegate.setWriteAheadLoggingEnabled(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.room.SQLiteCopyOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */