package com.facebook.imagepipeline.cache;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class MediaVariationsIndexDatabase$IndexDbOpenHelper
  extends SQLiteOpenHelper
{
  public static final String DATABASE_NAME = "FrescoMediaVariationsIndex.db";
  public static final int DATABASE_VERSION = 3;
  private static final String INTEGER_TYPE = " INTEGER";
  private static final String SQL_CREATE_ENTRIES = "CREATE TABLE media_variations_index (_id INTEGER PRIMARY KEY,media_id TEXT,width INTEGER,height INTEGER,cache_choice TEXT,cache_key TEXT,resource_id TEXT UNIQUE,date INTEGER )";
  private static final String SQL_CREATE_INDEX = "CREATE INDEX index_media_id ON media_variations_index (media_id)";
  private static final String TEXT_TYPE = " TEXT";
  
  public MediaVariationsIndexDatabase$IndexDbOpenHelper(Context paramContext)
  {
    super(paramContext, "FrescoMediaVariationsIndex.db", null, 3);
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

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase.IndexDbOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */