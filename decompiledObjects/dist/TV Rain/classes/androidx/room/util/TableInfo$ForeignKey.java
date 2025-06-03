package androidx.room.util;

import a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TableInfo$ForeignKey
{
  @NonNull
  public final List<String> columnNames;
  @NonNull
  public final String onDelete;
  @NonNull
  public final String onUpdate;
  @NonNull
  public final List<String> referenceColumnNames;
  @NonNull
  public final String referenceTable;
  
  public TableInfo$ForeignKey(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @NonNull List<String> paramList1, @NonNull List<String> paramList2)
  {
    referenceTable = paramString1;
    onDelete = paramString2;
    onUpdate = paramString3;
    columnNames = Collections.unmodifiableList(paramList1);
    referenceColumnNames = Collections.unmodifiableList(paramList2);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ForeignKey)paramObject;
      if (!referenceTable.equals(referenceTable)) {
        return false;
      }
      if (!onDelete.equals(onDelete)) {
        return false;
      }
      if (!onUpdate.equals(onUpdate)) {
        return false;
      }
      if (!columnNames.equals(columnNames)) {
        return false;
      }
      return referenceColumnNames.equals(referenceColumnNames);
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = referenceTable.hashCode();
    i = z2.c(onDelete, i * 31, 31);
    i = z2.c(onUpdate, i, 31);
    int j = columnNames.hashCode();
    return referenceColumnNames.hashCode() + (j + i) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ForeignKey{referenceTable='");
    a.B(localStringBuilder, referenceTable, '\'', ", onDelete='");
    a.B(localStringBuilder, onDelete, '\'', ", onUpdate='");
    a.B(localStringBuilder, onUpdate, '\'', ", columnNames=");
    localStringBuilder.append(columnNames);
    localStringBuilder.append(", referenceColumnNames=");
    localStringBuilder.append(referenceColumnNames);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.TableInfo.ForeignKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */