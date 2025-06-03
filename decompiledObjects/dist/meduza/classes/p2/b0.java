package p2;

import android.content.Context;
import ec.i;
import java.io.File;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o2.j;
import rb.d;
import sb.y;

public final class b0
{
  public static final void a(Context paramContext)
  {
    i.e(paramContext, "context");
    Object localObject1 = paramContext.getDatabasePath("androidx.work.workdb");
    i.d(localObject1, "context.getDatabasePath(WORK_DATABASE_NAME)");
    if (((File)localObject1).exists())
    {
      j.d().a(c0.a, "Migrating WorkDatabase to the no-backup directory");
      localObject1 = paramContext.getDatabasePath("androidx.work.workdb");
      i.d(localObject1, "context.getDatabasePath(WORK_DATABASE_NAME)");
      File localFile = new File(a.a.a(paramContext), "androidx.work.workdb");
      Object localObject2 = c0.b;
      int i = y.H0(localObject2.length);
      int j = i;
      if (i < 16) {
        j = 16;
      }
      paramContext = new LinkedHashMap(j);
      j = 0;
      i = localObject2.length;
      Object localObject3;
      Object localObject4;
      while (j < i)
      {
        localObject3 = localObject2[j];
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(((File)localObject1).getPath());
        ((StringBuilder)localObject4).append((String)localObject3);
        localObject4 = new File(((StringBuilder)localObject4).toString());
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localFile.getPath());
        localStringBuilder.append((String)localObject3);
        paramContext.put(localObject4, new File(localStringBuilder.toString()));
        j++;
      }
      localObject2 = new d(localObject1, localFile);
      if (paramContext.isEmpty())
      {
        paramContext = y.I0((d)localObject2);
      }
      else
      {
        paramContext = new LinkedHashMap(paramContext);
        paramContext.put(localObject1, localFile);
      }
      localObject1 = paramContext.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramContext = (Map.Entry)((Iterator)localObject1).next();
        localFile = (File)paramContext.getKey();
        localObject2 = (File)paramContext.getValue();
        if (localFile.exists())
        {
          if (((File)localObject2).exists())
          {
            localObject3 = j.d();
            localObject4 = c0.a;
            paramContext = new StringBuilder();
            paramContext.append("Over-writing contents of ");
            paramContext.append(localObject2);
            ((j)localObject3).g((String)localObject4, paramContext.toString());
          }
          if (localFile.renameTo((File)localObject2))
          {
            paramContext = new StringBuilder();
            paramContext.append("Migrated ");
            paramContext.append(localFile);
            paramContext.append("to ");
            paramContext.append(localObject2);
          }
          else
          {
            paramContext = new StringBuilder();
            paramContext.append("Renaming ");
            paramContext.append(localFile);
            paramContext.append(" to ");
            paramContext.append(localObject2);
            paramContext.append(" failed");
          }
          paramContext = paramContext.toString();
          j.d().a(c0.a, paramContext);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     p2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */