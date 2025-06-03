package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.work.Data;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys={@androidx.room.ForeignKey(childColumns={"work_spec_id"}, entity=WorkSpec.class, onDelete=5, onUpdate=5, parentColumns={"id"})})
public class WorkProgress
{
  @NonNull
  @ColumnInfo(name="progress")
  public final Data mProgress;
  @NonNull
  @ColumnInfo(name="work_spec_id")
  @PrimaryKey
  public final String mWorkSpecId;
  
  public WorkProgress(@NonNull String paramString, @NonNull Data paramData)
  {
    mWorkSpecId = paramString;
    mProgress = paramData;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkProgress
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */