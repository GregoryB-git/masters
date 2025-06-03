package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class zzcj
  extends SQLiteOpenHelper
{
  public zzcj(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this(paramContext, paramString, null, 1, zzco.zza);
  }
  
  private zzcj(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, zzco paramzzco)
  {
    super(paramContext, paramCursorFactory, null, 1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */