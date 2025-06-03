package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;

@Dao
public abstract interface RawWorkInfoDao
{
  @NonNull
  @RawQuery(observedEntities={WorkSpec.class})
  public abstract List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(@NonNull SupportSQLiteQuery paramSupportSQLiteQuery);
  
  @NonNull
  @RawQuery(observedEntities={WorkSpec.class})
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(@NonNull SupportSQLiteQuery paramSupportSQLiteQuery);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.RawWorkInfoDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */