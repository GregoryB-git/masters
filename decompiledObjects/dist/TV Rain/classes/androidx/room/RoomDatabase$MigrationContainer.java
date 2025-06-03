package androidx.room;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class RoomDatabase$MigrationContainer
{
  private HashMap<Integer, TreeMap<Integer, Migration>> mMigrations = new HashMap();
  
  private void addMigration(Migration paramMigration)
  {
    int i = startVersion;
    int j = endVersion;
    Object localObject1 = (TreeMap)mMigrations.get(Integer.valueOf(i));
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new TreeMap();
      mMigrations.put(Integer.valueOf(i), localObject2);
    }
    Migration localMigration = (Migration)((TreeMap)localObject2).get(Integer.valueOf(j));
    if (localMigration != null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Overriding migration ");
      ((StringBuilder)localObject1).append(localMigration);
      ((StringBuilder)localObject1).append(" with ");
      ((StringBuilder)localObject1).append(paramMigration);
      Log.w("ROOM", ((StringBuilder)localObject1).toString());
    }
    ((TreeMap)localObject2).put(Integer.valueOf(j), paramMigration);
  }
  
  private List<Migration> findUpMigrationPath(List<Migration> paramList, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    while (paramBoolean ? paramInt1 < paramInt2 : paramInt1 > paramInt2)
    {
      TreeMap localTreeMap = (TreeMap)mMigrations.get(Integer.valueOf(paramInt1));
      if (localTreeMap == null) {
        return null;
      }
      if (paramBoolean) {
        localObject = localTreeMap.descendingKeySet();
      } else {
        localObject = localTreeMap.keySet();
      }
      Object localObject = ((Set)localObject).iterator();
      int i;
      int k;
      do
      {
        boolean bool = ((Iterator)localObject).hasNext();
        i = 1;
        int j = 0;
        if (!bool) {
          break;
        }
        k = ((Integer)((Iterator)localObject).next()).intValue();
        if (paramBoolean)
        {
          m = j;
          if (k <= paramInt2)
          {
            m = j;
            if (k <= paramInt1) {}
          }
        }
        else
        {
          do
          {
            m = 1;
            break;
            m = j;
            if (k < paramInt2) {
              break;
            }
            m = j;
          } while (k < paramInt1);
        }
      } while (m == 0);
      paramList.add(localTreeMap.get(Integer.valueOf(k)));
      paramInt1 = k;
      int m = i;
      break label197;
      m = 0;
      label197:
      if (m == 0) {
        return null;
      }
    }
    return paramList;
  }
  
  public void addMigrations(@NonNull Migration... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      addMigration(paramVarArgs[j]);
    }
  }
  
  @Nullable
  public List<Migration> findMigrationPath(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return Collections.emptyList();
    }
    boolean bool;
    if (paramInt2 > paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return findUpMigrationPath(new ArrayList(), bool, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomDatabase.MigrationContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */