package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys={@androidx.room.ForeignKey(childColumns={"work_spec_id"}, entity=WorkSpec.class, onDelete=5, onUpdate=5, parentColumns={"id"})}, indices={@androidx.room.Index({"work_spec_id"})}, primaryKeys={"tag", "work_spec_id"})
public class WorkTag
{
  @NonNull
  @ColumnInfo(name="tag")
  public final String tag;
  @NonNull
  @ColumnInfo(name="work_spec_id")
  public final String workSpecId;
  
  public WorkTag(@NonNull String paramString1, @NonNull String paramString2)
  {
    tag = paramString1;
    workSpecId = paramString2;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkTag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */