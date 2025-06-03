package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys={@androidx.room.ForeignKey(childColumns={"work_spec_id"}, entity=WorkSpec.class, onDelete=5, onUpdate=5, parentColumns={"id"}), @androidx.room.ForeignKey(childColumns={"prerequisite_id"}, entity=WorkSpec.class, onDelete=5, onUpdate=5, parentColumns={"id"})}, indices={@androidx.room.Index({"work_spec_id"}), @androidx.room.Index({"prerequisite_id"})}, primaryKeys={"work_spec_id", "prerequisite_id"})
public class Dependency
{
  @NonNull
  @ColumnInfo(name="prerequisite_id")
  public final String prerequisiteId;
  @NonNull
  @ColumnInfo(name="work_spec_id")
  public final String workSpecId;
  
  public Dependency(@NonNull String paramString1, @NonNull String paramString2)
  {
    workSpecId = paramString1;
    prerequisiteId = paramString2;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.Dependency
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */