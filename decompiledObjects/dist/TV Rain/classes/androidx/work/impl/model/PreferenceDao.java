package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public abstract interface PreferenceDao
{
  @Nullable
  @Query("SELECT long_value FROM Preference where `key`=:key")
  public abstract Long getLongValue(@NonNull String paramString);
  
  @NonNull
  @Query("SELECT long_value FROM Preference where `key`=:key")
  public abstract LiveData<Long> getObservableLongValue(@NonNull String paramString);
  
  @Insert(onConflict=1)
  public abstract void insertPreference(@NonNull Preference paramPreference);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.PreferenceDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */