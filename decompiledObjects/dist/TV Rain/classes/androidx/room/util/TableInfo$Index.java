package androidx.room.util;

import a;
import androidx.annotation.RestrictTo;
import java.util.List;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TableInfo$Index
{
  public static final String DEFAULT_PREFIX = "index_";
  public final List<String> columns;
  public final String name;
  public final boolean unique;
  
  public TableInfo$Index(String paramString, boolean paramBoolean, List<String> paramList)
  {
    name = paramString;
    unique = paramBoolean;
    columns = paramList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (Index)paramObject;
      if (unique != unique) {
        return false;
      }
      if (!columns.equals(columns)) {
        return false;
      }
      if (name.startsWith("index_")) {
        return name.startsWith("index_");
      }
      return name.equals(name);
    }
    return false;
  }
  
  public int hashCode()
  {
    int i;
    if (name.startsWith("index_")) {
      i = -1184239155;
    } else {
      i = name.hashCode();
    }
    int j = unique;
    return columns.hashCode() + (i * 31 + j) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Index{name='");
    a.B(localStringBuilder, name, '\'', ", unique=");
    localStringBuilder.append(unique);
    localStringBuilder.append(", columns=");
    localStringBuilder.append(columns);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.TableInfo.Index
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */