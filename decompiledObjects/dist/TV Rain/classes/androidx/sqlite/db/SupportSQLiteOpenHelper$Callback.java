package androidx.sqlite.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import z2;

public abstract class SupportSQLiteOpenHelper$Callback
{
  private static final String TAG = "SupportSQLite";
  public final int version;
  
  public SupportSQLiteOpenHelper$Callback(int paramInt)
  {
    version = paramInt;
  }
  
  private void deleteDatabaseFile(String paramString)
  {
    if ((!paramString.equalsIgnoreCase(":memory:")) && (paramString.trim().length() != 0))
    {
      z2.A("deleting the database file: ", paramString, "SupportSQLite");
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        SQLiteDatabase.deleteDatabase(localFile);
      }
      catch (Exception paramString)
      {
        Log.w("SupportSQLite", "delete failed: ", paramString);
      }
    }
  }
  
  public void onConfigure(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  
  public void onCorruption(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    Object localObject1 = z2.t("Corruption reported by sqlite on database: ");
    ((StringBuilder)localObject1).append(paramSupportSQLiteDatabase.getPath());
    Log.e("SupportSQLite", ((StringBuilder)localObject1).toString());
    if (!paramSupportSQLiteDatabase.isOpen())
    {
      deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
      return;
    }
    localObject1 = null;
    Object localObject3 = null;
    try
    {
      try
      {
        List localList = paramSupportSQLiteDatabase.getAttachedDbs();
        localObject1 = localList;
      }
      finally
      {
        break label80;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    localObject3 = localObject2;
    try
    {
      paramSupportSQLiteDatabase.close();
    }
    catch (IOException localIOException)
    {
      label80:
      for (;;) {}
    }
    if (localObject3 != null)
    {
      paramSupportSQLiteDatabase = ((List)localObject3).iterator();
      while (paramSupportSQLiteDatabase.hasNext()) {
        deleteDatabaseFile((String)nextsecond);
      }
    }
    deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
    throw ((Throwable)localObject2);
    if (localObject2 != null)
    {
      paramSupportSQLiteDatabase = ((List)localObject2).iterator();
      while (paramSupportSQLiteDatabase.hasNext()) {
        deleteDatabaseFile((String)nextsecond);
      }
    }
    deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
  }
  
  public abstract void onCreate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase);
  
  public void onDowngrade(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
  {
    throw new SQLiteException(z2.n("Can't downgrade database from version ", paramInt1, " to ", paramInt2));
  }
  
  public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  
  public abstract void onUpgrade(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */