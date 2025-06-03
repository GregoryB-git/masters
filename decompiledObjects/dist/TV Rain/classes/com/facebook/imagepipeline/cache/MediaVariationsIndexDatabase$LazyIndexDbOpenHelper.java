package com.facebook.imagepipeline.cache;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import javax.annotation.Nullable;

class MediaVariationsIndexDatabase$LazyIndexDbOpenHelper
{
  private final Context mContext;
  @Nullable
  private MediaVariationsIndexDatabase.IndexDbOpenHelper mIndexDbOpenHelper;
  
  private MediaVariationsIndexDatabase$LazyIndexDbOpenHelper(Context paramContext)
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

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase.LazyIndexDbOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */