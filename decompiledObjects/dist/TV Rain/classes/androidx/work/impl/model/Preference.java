package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity
public class Preference
{
  @NonNull
  @ColumnInfo(name="key")
  @PrimaryKey
  public String mKey;
  @Nullable
  @ColumnInfo(name="long_value")
  public Long mValue;
  
  public Preference(@NonNull String paramString, long paramLong)
  {
    mKey = paramString;
    mValue = Long.valueOf(paramLong);
  }
  
  public Preference(@NonNull String paramString, boolean paramBoolean)
  {
    this(paramString, l);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Preference)) {
      return false;
    }
    Object localObject = (Preference)paramObject;
    if (!mKey.equals(mKey)) {
      return false;
    }
    paramObject = mValue;
    localObject = mValue;
    if (paramObject != null) {
      bool = ((Long)paramObject).equals(localObject);
    } else if (localObject != null) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = mKey.hashCode();
    Long localLong = mValue;
    int j;
    if (localLong != null) {
      j = localLong.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.Preference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */