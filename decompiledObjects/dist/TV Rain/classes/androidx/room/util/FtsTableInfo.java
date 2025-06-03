package androidx.room.util;

import a;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FtsTableInfo
{
  private static final String[] FTS_OPTIONS = { "tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress=" };
  public final Set<String> columns;
  public final String name;
  public final Set<String> options;
  
  public FtsTableInfo(String paramString1, Set<String> paramSet, String paramString2)
  {
    name = paramString1;
    columns = paramSet;
    options = parseOptions(paramString2);
  }
  
  public FtsTableInfo(String paramString, Set<String> paramSet1, Set<String> paramSet2)
  {
    name = paramString;
    columns = paramSet1;
    options = paramSet2;
  }
  
  @VisibleForTesting
  public static Set<String> parseOptions(String paramString)
  {
    if (paramString.isEmpty()) {
      return new HashSet();
    }
    Object localObject1 = paramString.substring(paramString.indexOf('(') + 1, paramString.lastIndexOf(')'));
    Object localObject2 = new ArrayList();
    paramString = new ArrayDeque();
    int i = -1;
    int j = 0;
    while (j < ((String)localObject1).length())
    {
      char c = ((String)localObject1).charAt(j);
      int k;
      if ((c != '"') && (c != '\'')) {
        if (c != ',')
        {
          if (c != '[')
          {
            if (c != ']')
            {
              if (c != '`')
              {
                k = i;
                break label266;
              }
            }
            else
            {
              k = i;
              if (paramString.isEmpty()) {
                break label266;
              }
              k = i;
              if (((Character)paramString.peek()).charValue() != '[') {
                break label266;
              }
              paramString.pop();
              k = i;
              break label266;
            }
          }
          else
          {
            k = i;
            if (!paramString.isEmpty()) {
              break label266;
            }
            paramString.push(Character.valueOf(c));
            k = i;
            break label266;
          }
        }
        else
        {
          k = i;
          if (!paramString.isEmpty()) {
            break label266;
          }
          ((ArrayList)localObject2).add(((String)localObject1).substring(i + 1, j).trim());
          k = j;
          break label266;
        }
      }
      if (paramString.isEmpty())
      {
        paramString.push(Character.valueOf(c));
        k = i;
      }
      else
      {
        k = i;
        if (((Character)paramString.peek()).charValue() == c)
        {
          paramString.pop();
          k = i;
        }
      }
      label266:
      j++;
      i = k;
    }
    ((ArrayList)localObject2).add(((String)localObject1).substring(i + 1).trim());
    paramString = new HashSet();
    localObject2 = ((ArrayList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      localObject1 = FTS_OPTIONS;
      i = localObject1.length;
      for (j = 0; j < i; j++) {
        if (str.startsWith(localObject1[j])) {
          paramString.add(str);
        }
      }
    }
    return paramString;
  }
  
  public static FtsTableInfo read(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    return new FtsTableInfo(paramString, readColumns(paramSupportSQLiteDatabase, paramString), readOptions(paramSupportSQLiteDatabase, paramString));
  }
  
  private static Set<String> readColumns(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PRAGMA table_info(`");
    localStringBuilder.append(paramString);
    localStringBuilder.append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(localStringBuilder.toString());
    paramString = new HashSet();
    try
    {
      if (paramSupportSQLiteDatabase.getColumnCount() > 0)
      {
        int i = paramSupportSQLiteDatabase.getColumnIndex("name");
        while (paramSupportSQLiteDatabase.moveToNext()) {
          paramString.add(paramSupportSQLiteDatabase.getString(i));
        }
      }
      return paramString;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private static Set<String> readOptions(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT * FROM sqlite_master WHERE `name` = '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    paramString = paramSupportSQLiteDatabase.query(localStringBuilder.toString());
    try
    {
      if (paramString.moveToFirst()) {
        paramSupportSQLiteDatabase = paramString.getString(paramString.getColumnIndexOrThrow("sql"));
      } else {
        paramSupportSQLiteDatabase = "";
      }
      return parseOptions(paramSupportSQLiteDatabase);
    }
    finally
    {
      paramString.close();
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
      paramObject = (FtsTableInfo)paramObject;
      Object localObject = name;
      if (localObject != null ? !((String)localObject).equals(name) : name != null) {
        return false;
      }
      localObject = columns;
      if (localObject != null ? !((Set)localObject).equals(columns) : columns != null) {
        return false;
      }
      localObject = options;
      paramObject = options;
      if (localObject != null) {
        bool = ((Set)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = name;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = columns;
    int k;
    if (localObject != null) {
      k = ((Set)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = options;
    if (localObject != null) {
      i = ((Set)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("FtsTableInfo{name='");
    a.B(localStringBuilder, name, '\'', ", columns=");
    localStringBuilder.append(columns);
    localStringBuilder.append(", options=");
    localStringBuilder.append(options);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.FtsTableInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */