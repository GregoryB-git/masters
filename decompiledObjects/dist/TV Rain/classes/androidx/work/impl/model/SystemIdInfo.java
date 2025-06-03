package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys={@androidx.room.ForeignKey(childColumns={"work_spec_id"}, entity=WorkSpec.class, onDelete=5, onUpdate=5, parentColumns={"id"})})
public class SystemIdInfo
{
  @ColumnInfo(name="system_id")
  public final int systemId;
  @NonNull
  @ColumnInfo(name="work_spec_id")
  @PrimaryKey
  public final String workSpecId;
  
  public SystemIdInfo(@NonNull String paramString, int paramInt)
  {
    workSpecId = paramString;
    systemId = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SystemIdInfo)) {
      return false;
    }
    paramObject = (SystemIdInfo)paramObject;
    if (systemId != systemId) {
      return false;
    }
    return workSpecId.equals(workSpecId);
  }
  
  public int hashCode()
  {
    return workSpecId.hashCode() * 31 + systemId;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.SystemIdInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */