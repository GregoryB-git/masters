package com.facebook.cache.common;

import javax.annotation.Nullable;

public abstract interface CacheErrorLogger
{
  public abstract void logError(CacheErrorCategory paramCacheErrorCategory, Class<?> paramClass, String paramString, @Nullable Throwable paramThrowable);
  
  public static enum CacheErrorCategory
  {
    static
    {
      CacheErrorCategory localCacheErrorCategory1 = new CacheErrorCategory("READ_DECODE", 0);
      READ_DECODE = localCacheErrorCategory1;
      CacheErrorCategory localCacheErrorCategory2 = new CacheErrorCategory("READ_FILE", 1);
      READ_FILE = localCacheErrorCategory2;
      CacheErrorCategory localCacheErrorCategory3 = new CacheErrorCategory("READ_FILE_NOT_FOUND", 2);
      READ_FILE_NOT_FOUND = localCacheErrorCategory3;
      CacheErrorCategory localCacheErrorCategory4 = new CacheErrorCategory("READ_INVALID_ENTRY", 3);
      READ_INVALID_ENTRY = localCacheErrorCategory4;
      CacheErrorCategory localCacheErrorCategory5 = new CacheErrorCategory("WRITE_ENCODE", 4);
      WRITE_ENCODE = localCacheErrorCategory5;
      CacheErrorCategory localCacheErrorCategory6 = new CacheErrorCategory("WRITE_CREATE_TEMPFILE", 5);
      WRITE_CREATE_TEMPFILE = localCacheErrorCategory6;
      CacheErrorCategory localCacheErrorCategory7 = new CacheErrorCategory("WRITE_UPDATE_FILE_NOT_FOUND", 6);
      WRITE_UPDATE_FILE_NOT_FOUND = localCacheErrorCategory7;
      CacheErrorCategory localCacheErrorCategory8 = new CacheErrorCategory("WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND", 7);
      WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND = localCacheErrorCategory8;
      CacheErrorCategory localCacheErrorCategory9 = new CacheErrorCategory("WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND", 8);
      WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND = localCacheErrorCategory9;
      CacheErrorCategory localCacheErrorCategory10 = new CacheErrorCategory("WRITE_RENAME_FILE_OTHER", 9);
      WRITE_RENAME_FILE_OTHER = localCacheErrorCategory10;
      CacheErrorCategory localCacheErrorCategory11 = new CacheErrorCategory("WRITE_CREATE_DIR", 10);
      WRITE_CREATE_DIR = localCacheErrorCategory11;
      CacheErrorCategory localCacheErrorCategory12 = new CacheErrorCategory("WRITE_CALLBACK_ERROR", 11);
      WRITE_CALLBACK_ERROR = localCacheErrorCategory12;
      CacheErrorCategory localCacheErrorCategory13 = new CacheErrorCategory("WRITE_INVALID_ENTRY", 12);
      WRITE_INVALID_ENTRY = localCacheErrorCategory13;
      CacheErrorCategory localCacheErrorCategory14 = new CacheErrorCategory("DELETE_FILE", 13);
      DELETE_FILE = localCacheErrorCategory14;
      CacheErrorCategory localCacheErrorCategory15 = new CacheErrorCategory("EVICTION", 14);
      EVICTION = localCacheErrorCategory15;
      CacheErrorCategory localCacheErrorCategory16 = new CacheErrorCategory("GENERIC_IO", 15);
      GENERIC_IO = localCacheErrorCategory16;
      CacheErrorCategory localCacheErrorCategory17 = new CacheErrorCategory("OTHER", 16);
      OTHER = localCacheErrorCategory17;
      $VALUES = new CacheErrorCategory[] { localCacheErrorCategory1, localCacheErrorCategory2, localCacheErrorCategory3, localCacheErrorCategory4, localCacheErrorCategory5, localCacheErrorCategory6, localCacheErrorCategory7, localCacheErrorCategory8, localCacheErrorCategory9, localCacheErrorCategory10, localCacheErrorCategory11, localCacheErrorCategory12, localCacheErrorCategory13, localCacheErrorCategory14, localCacheErrorCategory15, localCacheErrorCategory16, localCacheErrorCategory17 };
    }
    
    private CacheErrorCategory() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.CacheErrorLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */