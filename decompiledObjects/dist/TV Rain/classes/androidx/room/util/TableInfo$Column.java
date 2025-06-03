package androidx.room.util;

import a;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo.SQLiteTypeAffinity;
import java.util.Locale;
import z2;

public class TableInfo$Column
{
  @ColumnInfo.SQLiteTypeAffinity
  public final int affinity;
  public final String defaultValue;
  private final int mCreatedFrom;
  public final String name;
  public final boolean notNull;
  public final int primaryKeyPosition;
  public final String type;
  
  @Deprecated
  public TableInfo$Column(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    this(paramString1, paramString2, paramBoolean, paramInt, null, 0);
  }
  
  public TableInfo$Column(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, String paramString3, int paramInt2)
  {
    name = paramString1;
    type = paramString2;
    notNull = paramBoolean;
    primaryKeyPosition = paramInt1;
    affinity = findAffinity(paramString2);
    defaultValue = paramString3;
    mCreatedFrom = paramInt2;
  }
  
  @ColumnInfo.SQLiteTypeAffinity
  private static int findAffinity(@Nullable String paramString)
  {
    if (paramString == null) {
      return 5;
    }
    paramString = paramString.toUpperCase(Locale.US);
    if (paramString.contains("INT")) {
      return 3;
    }
    if ((!paramString.contains("CHAR")) && (!paramString.contains("CLOB")) && (!paramString.contains("TEXT")))
    {
      if (paramString.contains("BLOB")) {
        return 5;
      }
      if ((!paramString.contains("REAL")) && (!paramString.contains("FLOA")) && (!paramString.contains("DOUB"))) {
        return 1;
      }
      return 4;
    }
    return 2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (Column)paramObject;
      if (primaryKeyPosition != primaryKeyPosition) {
        return false;
      }
      if (!name.equals(name)) {
        return false;
      }
      if (notNull != notNull) {
        return false;
      }
      String str;
      if ((mCreatedFrom == 1) && (mCreatedFrom == 2))
      {
        str = defaultValue;
        if ((str != null) && (!str.equals(defaultValue))) {
          return false;
        }
      }
      if ((mCreatedFrom == 2) && (mCreatedFrom == 1))
      {
        str = defaultValue;
        if ((str != null) && (!str.equals(defaultValue))) {
          return false;
        }
      }
      int i = mCreatedFrom;
      if ((i != 0) && (i == mCreatedFrom))
      {
        str = defaultValue;
        if (str != null ? !str.equals(defaultValue) : defaultValue != null) {
          return false;
        }
      }
      if (affinity != affinity) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = name.hashCode();
    int j = affinity;
    int k;
    if (notNull) {
      k = 1231;
    } else {
      k = 1237;
    }
    return ((i * 31 + j) * 31 + k) * 31 + primaryKeyPosition;
  }
  
  public boolean isPrimaryKey()
  {
    boolean bool;
    if (primaryKeyPosition > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Column{name='");
    a.B(localStringBuilder, name, '\'', ", type='");
    a.B(localStringBuilder, type, '\'', ", affinity='");
    localStringBuilder.append(affinity);
    localStringBuilder.append('\'');
    localStringBuilder.append(", notNull=");
    localStringBuilder.append(notNull);
    localStringBuilder.append(", primaryKeyPosition=");
    localStringBuilder.append(primaryKeyPosition);
    localStringBuilder.append(", defaultValue='");
    localStringBuilder.append(defaultValue);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.TableInfo.Column
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */