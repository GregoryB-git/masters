package androidx.room.util;

import a;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ViewInfo
{
  public final String name;
  public final String sql;
  
  public ViewInfo(String paramString1, String paramString2)
  {
    name = paramString1;
    sql = paramString2;
  }
  
  public static ViewInfo read(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(localStringBuilder.toString());
    try
    {
      if (paramSupportSQLiteDatabase.moveToFirst())
      {
        paramString = new ViewInfo(paramSupportSQLiteDatabase.getString(0), paramSupportSQLiteDatabase.getString(1));
        return paramString;
      }
      paramString = new ViewInfo(paramString, null);
      return paramString;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ViewInfo)paramObject;
      String str = name;
      if (str != null ? str.equals(name) : name == null)
      {
        str = sql;
        if (str != null ? str.equals(sql) : sql == null) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = name;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = sql;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ViewInfo{name='");
    a.B(localStringBuilder, name, '\'', ", sql='");
    localStringBuilder.append(sql);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.ViewInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */