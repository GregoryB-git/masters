package com.facebook.imagepipeline.cache;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.logging.FLog;
import com.facebook.common.time.Clock;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.MediaVariations;
import com.facebook.imagepipeline.request.MediaVariations.Builder;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class MediaVariationsIndexDatabase
  implements MediaVariationsIndex
{
  private static final long MILLIS_IN_FIVE_DAYS;
  private static final long MILLIS_IN_ONE_DAY;
  private static final String[] PROJECTION = { "cache_choice", "cache_key", "width", "height" };
  private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS media_variations_index";
  private static final String TAG = "MediaVariationsIndexDatabase";
  private static final String WHERE_CLAUSE_DATE_BEFORE = "date < ?";
  private final Clock mClock;
  @GuardedBy("MediaVariationsIndexDatabase.class")
  private final LazyIndexDbOpenHelper mDbHelper;
  private long mLastTrimTimestamp;
  private final Executor mReadExecutor;
  private final Executor mWriteExecutor;
  
  static
  {
    TimeUnit localTimeUnit = TimeUnit.DAYS;
    MILLIS_IN_ONE_DAY = localTimeUnit.toMillis(1L);
    MILLIS_IN_FIVE_DAYS = localTimeUnit.toMillis(5L);
  }
  
  public MediaVariationsIndexDatabase(Context paramContext, Executor paramExecutor1, Executor paramExecutor2, Clock paramClock)
  {
    mDbHelper = new LazyIndexDbOpenHelper(paramContext, null);
    mReadExecutor = paramExecutor1;
    mWriteExecutor = paramExecutor2;
    mClock = paramClock;
  }
  
  public Task<MediaVariations> getCachedVariants(String paramString, MediaVariations.Builder paramBuilder)
  {
    try
    {
      Callable local1 = new com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$1;
      local1.<init>(this, paramString, paramBuilder);
      paramBuilder = Task.call(local1, mReadExecutor);
      return paramBuilder;
    }
    catch (Exception paramBuilder)
    {
      FLog.w(TAG, paramBuilder, "Failed to schedule query task for %s", new Object[] { paramString });
    }
    return Task.forError(paramBuilder);
  }
  
  /* Error */
  @com.facebook.common.internal.VisibleForTesting
  public MediaVariations getCachedVariantsSync(String paramString, MediaVariations.Builder paramBuilder)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: getfield 85	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:mDbHelper	Lcom/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$LazyIndexDbOpenHelper;
    //   7: invokevirtual 129	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$LazyIndexDbOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload_3
    //   18: ldc -125
    //   20: getstatic 59	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:PROJECTION	[Ljava/lang/String;
    //   23: ldc -123
    //   25: iconst_1
    //   26: anewarray 49	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: aload_1
    //   32: aastore
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: invokevirtual 139	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   39: astore_3
    //   40: aload_3
    //   41: invokeinterface 145 1 0
    //   46: ifne +19 -> 65
    //   49: aload_2
    //   50: invokevirtual 151	com/facebook/imagepipeline/request/MediaVariations$Builder:build	()Lcom/facebook/imagepipeline/request/MediaVariations;
    //   53: astore_2
    //   54: aload_3
    //   55: invokeinterface 154 1 0
    //   60: ldc 2
    //   62: monitorexit
    //   63: aload_2
    //   64: areturn
    //   65: aload_3
    //   66: ldc 53
    //   68: invokeinterface 158 2 0
    //   73: istore 6
    //   75: aload_3
    //   76: ldc 55
    //   78: invokeinterface 158 2 0
    //   83: istore 7
    //   85: aload_3
    //   86: ldc 57
    //   88: invokeinterface 158 2 0
    //   93: istore 8
    //   95: aload_3
    //   96: ldc 51
    //   98: invokeinterface 158 2 0
    //   103: istore 9
    //   105: aload_3
    //   106: invokeinterface 162 1 0
    //   111: ifeq +83 -> 194
    //   114: aload_3
    //   115: iload 9
    //   117: invokeinterface 166 2 0
    //   122: astore 5
    //   124: aload_3
    //   125: iload 6
    //   127: invokeinterface 166 2 0
    //   132: invokestatic 172	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   135: astore 4
    //   137: aload_3
    //   138: iload 7
    //   140: invokeinterface 176 2 0
    //   145: istore 10
    //   147: aload_3
    //   148: iload 8
    //   150: invokeinterface 176 2 0
    //   155: istore 11
    //   157: aload 5
    //   159: invokestatic 182	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   162: ifeq +9 -> 171
    //   165: aconst_null
    //   166: astore 5
    //   168: goto +10 -> 178
    //   171: aload 5
    //   173: invokestatic 188	com/facebook/imagepipeline/request/ImageRequest$CacheChoice:valueOf	(Ljava/lang/String;)Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;
    //   176: astore 5
    //   178: aload_2
    //   179: aload 4
    //   181: iload 10
    //   183: iload 11
    //   185: aload 5
    //   187: invokevirtual 192	com/facebook/imagepipeline/request/MediaVariations$Builder:addVariant	(Landroid/net/Uri;IILcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;)Lcom/facebook/imagepipeline/request/MediaVariations$Builder;
    //   190: pop
    //   191: goto -86 -> 105
    //   194: aload_2
    //   195: invokevirtual 151	com/facebook/imagepipeline/request/MediaVariations$Builder:build	()Lcom/facebook/imagepipeline/request/MediaVariations;
    //   198: astore_2
    //   199: aload_3
    //   200: invokeinterface 154 1 0
    //   205: ldc 2
    //   207: monitorexit
    //   208: aload_2
    //   209: areturn
    //   210: astore_1
    //   211: aload_3
    //   212: astore 5
    //   214: goto +48 -> 262
    //   217: astore_2
    //   218: aload_3
    //   219: astore 5
    //   221: aload_2
    //   222: astore_3
    //   223: aload 5
    //   225: astore_2
    //   226: goto +11 -> 237
    //   229: astore_1
    //   230: goto +32 -> 262
    //   233: astore_3
    //   234: aload 4
    //   236: astore_2
    //   237: aload_2
    //   238: astore 5
    //   240: getstatic 106	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:TAG	Ljava/lang/String;
    //   243: aload_3
    //   244: ldc -62
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_1
    //   253: aastore
    //   254: invokestatic 197	com/facebook/common/logging/FLog:e	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: aload_2
    //   258: astore 5
    //   260: aload_3
    //   261: athrow
    //   262: aload 5
    //   264: ifnull +10 -> 274
    //   267: aload 5
    //   269: invokeinterface 154 1 0
    //   274: aload_1
    //   275: athrow
    //   276: astore_1
    //   277: ldc 2
    //   279: monitorexit
    //   280: aload_1
    //   281: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	282	0	this	MediaVariationsIndexDatabase
    //   0	282	1	paramString	String
    //   0	282	2	paramBuilder	MediaVariations.Builder
    //   10	213	3	localObject1	Object
    //   233	28	3	localSQLException	android.database.SQLException
    //   12	223	4	localUri	android.net.Uri
    //   15	253	5	localObject2	Object
    //   73	53	6	i	int
    //   83	56	7	j	int
    //   93	56	8	k	int
    //   103	13	9	m	int
    //   145	37	10	n	int
    //   155	29	11	i1	int
    // Exception table:
    //   from	to	target	type
    //   40	54	210	finally
    //   65	105	210	finally
    //   105	165	210	finally
    //   171	178	210	finally
    //   178	191	210	finally
    //   194	199	210	finally
    //   40	54	217	android/database/SQLException
    //   65	105	217	android/database/SQLException
    //   105	165	217	android/database/SQLException
    //   171	178	217	android/database/SQLException
    //   178	191	217	android/database/SQLException
    //   194	199	217	android/database/SQLException
    //   17	40	229	finally
    //   240	257	229	finally
    //   260	262	229	finally
    //   17	40	233	android/database/SQLException
    //   3	11	276	finally
    //   54	63	276	finally
    //   199	208	276	finally
    //   267	274	276	finally
    //   274	276	276	finally
    //   277	280	276	finally
  }
  
  public void saveCachedVariant(final String paramString, final ImageRequest.CacheChoice paramCacheChoice, final CacheKey paramCacheKey, final EncodedImage paramEncodedImage)
  {
    mWriteExecutor.execute(new Runnable()
    {
      public void run()
      {
        saveCachedVariantSync(paramString, paramCacheChoice, paramCacheKey, paramEncodedImage);
      }
    });
  }
  
  /* Error */
  public void saveCachedVariantSync(String paramString, ImageRequest.CacheChoice paramCacheChoice, CacheKey paramCacheKey, EncodedImage paramEncodedImage)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: getfield 85	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:mDbHelper	Lcom/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$LazyIndexDbOpenHelper;
    //   7: invokevirtual 129	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$LazyIndexDbOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 5
    //   12: aload_0
    //   13: getfield 91	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:mClock	Lcom/facebook/common/time/Clock;
    //   16: invokeinterface 218 1 0
    //   21: lstore 6
    //   23: aload 5
    //   25: invokevirtual 221	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   28: new 223	android/content/ContentValues
    //   31: astore 8
    //   33: aload 8
    //   35: invokespecial 224	android/content/ContentValues:<init>	()V
    //   38: aload 8
    //   40: ldc -30
    //   42: aload_1
    //   43: invokevirtual 230	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: aload 8
    //   48: ldc 55
    //   50: aload 4
    //   52: invokevirtual 235	com/facebook/imagepipeline/image/EncodedImage:getWidth	()I
    //   55: invokestatic 240	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: invokevirtual 243	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   61: aload 8
    //   63: ldc 57
    //   65: aload 4
    //   67: invokevirtual 246	com/facebook/imagepipeline/image/EncodedImage:getHeight	()I
    //   70: invokestatic 240	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   73: invokevirtual 243	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   76: aload 8
    //   78: ldc 51
    //   80: aload_2
    //   81: invokevirtual 252	java/lang/Enum:name	()Ljava/lang/String;
    //   84: invokevirtual 230	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload 8
    //   89: ldc 53
    //   91: aload_3
    //   92: invokeinterface 257 1 0
    //   97: invokevirtual 230	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: aload 8
    //   102: ldc_w 259
    //   105: aload_3
    //   106: invokestatic 265	com/facebook/cache/common/CacheKeyUtil:getFirstResourceId	(Lcom/facebook/cache/common/CacheKey;)Ljava/lang/String;
    //   109: invokevirtual 230	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload 8
    //   114: ldc_w 267
    //   117: lload 6
    //   119: invokestatic 272	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   122: invokevirtual 275	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   125: aload 5
    //   127: ldc -125
    //   129: aconst_null
    //   130: aload 8
    //   132: invokevirtual 279	android/database/sqlite/SQLiteDatabase:replaceOrThrow	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   135: pop2
    //   136: aload_0
    //   137: getfield 281	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:mLastTrimTimestamp	J
    //   140: lload 6
    //   142: getstatic 71	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:MILLIS_IN_ONE_DAY	J
    //   145: lsub
    //   146: lcmp
    //   147: ifgt +35 -> 182
    //   150: aload 5
    //   152: ldc -125
    //   154: ldc 34
    //   156: iconst_1
    //   157: anewarray 49	java/lang/String
    //   160: dup
    //   161: iconst_0
    //   162: lload 6
    //   164: getstatic 75	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:MILLIS_IN_FIVE_DAYS	J
    //   167: lsub
    //   168: invokestatic 285	java/lang/Long:toString	(J)Ljava/lang/String;
    //   171: aastore
    //   172: invokevirtual 289	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   175: pop
    //   176: aload_0
    //   177: lload 6
    //   179: putfield 281	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:mLastTrimTimestamp	J
    //   182: aload 5
    //   184: invokevirtual 292	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   187: aload 5
    //   189: invokevirtual 295	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   192: goto +29 -> 221
    //   195: astore_1
    //   196: goto +29 -> 225
    //   199: astore_2
    //   200: getstatic 106	com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase:TAG	Ljava/lang/String;
    //   203: aload_2
    //   204: ldc_w 297
    //   207: iconst_1
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload_1
    //   214: aastore
    //   215: invokestatic 197	com/facebook/common/logging/FLog:e	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -31 -> 187
    //   221: ldc 2
    //   223: monitorexit
    //   224: return
    //   225: aload 5
    //   227: invokevirtual 295	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   230: aload_1
    //   231: athrow
    //   232: astore_1
    //   233: ldc 2
    //   235: monitorexit
    //   236: aload_1
    //   237: athrow
    //   238: astore_1
    //   239: goto -18 -> 221
    //   242: astore_2
    //   243: goto -13 -> 230
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	this	MediaVariationsIndexDatabase
    //   0	246	1	paramString	String
    //   0	246	2	paramCacheChoice	ImageRequest.CacheChoice
    //   0	246	3	paramCacheKey	CacheKey
    //   0	246	4	paramEncodedImage	EncodedImage
    //   10	216	5	localSQLiteDatabase	SQLiteDatabase
    //   21	157	6	l	long
    //   31	100	8	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   23	182	195	finally
    //   182	187	195	finally
    //   200	218	195	finally
    //   23	182	199	java/lang/Exception
    //   182	187	199	java/lang/Exception
    //   3	23	232	finally
    //   187	192	232	finally
    //   221	224	232	finally
    //   225	230	232	finally
    //   230	232	232	finally
    //   233	236	232	finally
    //   187	192	238	android/database/sqlite/SQLiteException
    //   225	230	242	android/database/sqlite/SQLiteException
  }
  
  public static class IndexDbOpenHelper
    extends SQLiteOpenHelper
  {
    public static final String DATABASE_NAME = "FrescoMediaVariationsIndex.db";
    public static final int DATABASE_VERSION = 3;
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE media_variations_index (_id INTEGER PRIMARY KEY,media_id TEXT,width INTEGER,height INTEGER,cache_choice TEXT,cache_key TEXT,resource_id TEXT UNIQUE,date INTEGER )";
    private static final String SQL_CREATE_INDEX = "CREATE INDEX index_media_id ON media_variations_index (media_id)";
    private static final String TEXT_TYPE = " TEXT";
    
    public IndexDbOpenHelper(Context paramContext)
    {
      super("FrescoMediaVariationsIndex.db", null, 3);
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.beginTransaction();
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE media_variations_index (_id INTEGER PRIMARY KEY,media_id TEXT,width INTEGER,height INTEGER,cache_choice TEXT,cache_key TEXT,resource_id TEXT UNIQUE,date INTEGER )");
        paramSQLiteDatabase.execSQL("CREATE INDEX index_media_id ON media_variations_index (media_id)");
        paramSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        paramSQLiteDatabase.endTransaction();
      }
    }
    
    public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      onUpgrade(paramSQLiteDatabase, paramInt1, paramInt2);
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      paramSQLiteDatabase.beginTransaction();
      try
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_variations_index");
        paramSQLiteDatabase.setTransactionSuccessful();
        paramSQLiteDatabase.endTransaction();
        onCreate(paramSQLiteDatabase);
        return;
      }
      finally
      {
        paramSQLiteDatabase.endTransaction();
      }
    }
  }
  
  public static final class IndexEntry
    implements BaseColumns
  {
    public static final String COLUMN_NAME_CACHE_CHOICE = "cache_choice";
    public static final String COLUMN_NAME_CACHE_KEY = "cache_key";
    public static final String COLUMN_NAME_DATE = "date";
    public static final String COLUMN_NAME_HEIGHT = "height";
    public static final String COLUMN_NAME_MEDIA_ID = "media_id";
    public static final String COLUMN_NAME_RESOURCE_ID = "resource_id";
    public static final String COLUMN_NAME_WIDTH = "width";
    public static final String TABLE_NAME = "media_variations_index";
  }
  
  public static class LazyIndexDbOpenHelper
  {
    private final Context mContext;
    @Nullable
    private MediaVariationsIndexDatabase.IndexDbOpenHelper mIndexDbOpenHelper;
    
    private LazyIndexDbOpenHelper(Context paramContext)
    {
      mContext = paramContext;
    }
    
    public SQLiteDatabase getWritableDatabase()
    {
      try
      {
        if (mIndexDbOpenHelper == null)
        {
          localObject1 = new com/facebook/imagepipeline/cache/MediaVariationsIndexDatabase$IndexDbOpenHelper;
          ((MediaVariationsIndexDatabase.IndexDbOpenHelper)localObject1).<init>(mContext);
          mIndexDbOpenHelper = ((MediaVariationsIndexDatabase.IndexDbOpenHelper)localObject1);
        }
        Object localObject1 = mIndexDbOpenHelper.getWritableDatabase();
        return (SQLiteDatabase)localObject1;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */