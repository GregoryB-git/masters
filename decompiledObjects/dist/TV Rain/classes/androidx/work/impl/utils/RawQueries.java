package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo.State;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class RawQueries
{
  private static void bindings(@NonNull StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    paramStringBuilder.append("?");
    for (int i = 1; i < paramInt; i++)
    {
      paramStringBuilder.append(",");
      paramStringBuilder.append("?");
    }
  }
  
  @NonNull
  public static SupportSQLiteQuery workQueryToRawQuery(@NonNull WorkQuery paramWorkQuery)
  {
    ArrayList localArrayList1 = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM workspec");
    Object localObject1 = paramWorkQuery.getStates();
    boolean bool = ((List)localObject1).isEmpty();
    String str = " AND";
    Object localObject2 = " WHERE";
    if (!bool)
    {
      localObject2 = new ArrayList(((List)localObject1).size());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject2).add(Integer.valueOf(WorkTypeConverters.stateToInt((WorkInfo.State)((Iterator)localObject1).next())));
      }
      localStringBuilder.append(" WHERE");
      localStringBuilder.append(" state IN (");
      bindings(localStringBuilder, ((ArrayList)localObject2).size());
      localStringBuilder.append(")");
      localArrayList1.addAll((Collection)localObject2);
      localObject2 = " AND";
    }
    List localList = paramWorkQuery.getIds();
    localObject1 = localObject2;
    if (!localList.isEmpty())
    {
      ArrayList localArrayList2 = new ArrayList(localList.size());
      localObject1 = localList.iterator();
      while (((Iterator)localObject1).hasNext()) {
        localArrayList2.add(((UUID)((Iterator)localObject1).next()).toString());
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(" id IN (");
      bindings(localStringBuilder, localList.size());
      localStringBuilder.append(")");
      localArrayList1.addAll(localArrayList2);
      localObject1 = " AND";
    }
    localObject2 = paramWorkQuery.getTags();
    if (!((List)localObject2).isEmpty())
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
      bindings(localStringBuilder, ((List)localObject2).size());
      localStringBuilder.append("))");
      localArrayList1.addAll((Collection)localObject2);
      localObject2 = str;
    }
    else
    {
      localObject2 = localObject1;
    }
    paramWorkQuery = paramWorkQuery.getUniqueWorkNames();
    if (!paramWorkQuery.isEmpty())
    {
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
      bindings(localStringBuilder, paramWorkQuery.size());
      localStringBuilder.append("))");
      localArrayList1.addAll(paramWorkQuery);
    }
    localStringBuilder.append(";");
    return new SimpleSQLiteQuery(localStringBuilder.toString(), localArrayList1.toArray());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.RawQueries
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */