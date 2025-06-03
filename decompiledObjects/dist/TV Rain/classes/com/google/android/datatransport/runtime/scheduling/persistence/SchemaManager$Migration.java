package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public abstract interface SchemaManager$Migration
{
  public abstract void upgrade(SQLiteDatabase paramSQLiteDatabase);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */