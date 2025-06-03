package p1;

import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl.a;
import ec.i;
import f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import sb.s;
import t1.a;
import t1.c.a;
import tb.b.b;
import u1.c;

public final class k
  extends c.a
{
  public b b;
  public final a c;
  public final String d;
  public final String e;
  
  public k(b paramb, WorkDatabase_Impl.a parama)
  {
    super(a);
    b = paramb;
    c = parama;
    d = "7d73d21f1bd82c9e5268b6dcf9fde2cb";
    e = "3071c8717539de5d5353f4c8cd59a032";
  }
  
  public final void b(c paramc) {}
  
  public final void c(c paramc)
  {
    Object localObject = paramc.C("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
    try
    {
      boolean bool = ((Cursor)localObject).moveToFirst();
      int i = 0;
      if (bool)
      {
        j = ((Cursor)localObject).getInt(0);
        if (j == 0)
        {
          j = 1;
          break label44;
        }
      }
      int j = 0;
      label44:
      x6.b.L((Closeable)localObject, null);
      c.a(paramc);
      if (j == 0)
      {
        localObject = c.b(paramc);
        if (!a)
        {
          paramc = f.l("Pre-packaged database has an invalid schema: ");
          paramc.append(b);
          throw new IllegalStateException(paramc.toString());
        }
      }
      g(paramc);
      paramc = (WorkDatabase_Impl.a)c;
      localObject = b.g;
      if (localObject != null)
      {
        int k = ((List)localObject).size();
        for (j = i; j < k; j++) {
          ((j.b)b.g.get(j)).getClass();
        }
      }
      return;
    }
    finally
    {
      try
      {
        throw localThrowable;
      }
      finally
      {
        x6.b.L((Closeable)localObject, localThrowable);
      }
    }
  }
  
  public final void d(c paramc, int paramInt1, int paramInt2)
  {
    f(paramc, paramInt1, paramInt2);
  }
  
  public final void e(c paramc)
  {
    Object localObject1 = paramc.C("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
    try
    {
      boolean bool = ((Cursor)localObject1).moveToFirst();
      int i = 0;
      if (bool)
      {
        j = ((Cursor)localObject1).getInt(0);
        if (j != 0)
        {
          j = 1;
          break label44;
        }
      }
      int j = 0;
      label44:
      x6.b.L((Closeable)localObject1, null);
      if (j != 0)
      {
        ??? = paramc.y(new a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try
        {
          if (((Cursor)???).moveToFirst()) {
            localObject1 = ((Cursor)???).getString(0);
          } else {
            localObject1 = null;
          }
          x6.b.L((Closeable)???, null);
          if ((i.a(d, localObject1)) || (i.a(e, localObject1))) {
            break label205;
          }
          paramc = f.l("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
          paramc.append(d);
          paramc.append(", found: ");
          paramc.append((String)localObject1);
          throw new IllegalStateException(paramc.toString());
        }
        finally {}
      }
      localObject2 = c.b(paramc);
      if (a)
      {
        c.getClass();
        g(paramc);
        label205:
        localObject2 = (WorkDatabase_Impl.a)c;
        b.a = paramc;
        paramc.m("PRAGMA foreign_keys = ON");
        ??? = b;
        ???.getClass();
        Object localObject4 = e;
        localObject4.getClass();
        synchronized (m)
        {
          if (g)
          {
            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
          }
          else
          {
            paramc.m("PRAGMA temp_store = MEMORY;");
            paramc.m("PRAGMA recursive_triggers='ON';");
            paramc.m("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            ((e)localObject4).g(paramc);
            h = paramc.q("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            g = true;
            localObject4 = rb.h.a;
          }
          ??? = b.g;
          if (??? != null)
          {
            int k = ((List)???).size();
            for (j = i; j < k; j++) {
              ((j.b)b.g.get(j)).a(paramc);
            }
          }
          b = null;
          return;
        }
      }
      paramc = f.l("Pre-packaged database has an invalid schema: ");
      paramc.append(b);
      throw new IllegalStateException(paramc.toString());
    }
    finally
    {
      try
      {
        throw localThrowable2;
      }
      finally
      {
        Object localObject2;
        x6.b.L((Closeable)localObject2, localThrowable2);
      }
    }
  }
  
  public final void f(c paramc, int paramInt1, int paramInt2)
  {
    Object localObject1 = b;
    int i = 0;
    int j = 1;
    Object localObject5;
    if (localObject1 != null)
    {
      Object localObject4 = d;
      localObject4.getClass();
      Object localObject6;
      if (paramInt1 == paramInt2)
      {
        localObject1 = s.a;
      }
      else
      {
        if (paramInt2 > paramInt1) {
          k = 1;
        } else {
          k = 0;
        }
        localObject5 = new ArrayList();
        int m = paramInt1;
        int n;
        label254:
        label257:
        label300:
        do
        {
          if (k != 0 ? m < paramInt2 : m > paramInt2) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0) {
            break label311;
          }
          localObject6 = (TreeMap)a.get(Integer.valueOf(m));
          if (localObject6 == null) {
            break;
          }
          if (k != 0) {
            localObject1 = ((TreeMap)localObject6).descendingKeySet();
          } else {
            localObject1 = ((TreeMap)localObject6).keySet();
          }
          Iterator localIterator = ((Set)localObject1).iterator();
          while (localIterator.hasNext())
          {
            localObject1 = (Integer)localIterator.next();
            if (k != 0)
            {
              i.d(localObject1, "targetVersion");
              n = ((Integer)localObject1).intValue();
              if ((m + 1 > n) || (n > paramInt2)) {
                break label254;
              }
            }
            else
            {
              i.d(localObject1, "targetVersion");
              n = ((Integer)localObject1).intValue();
              if ((paramInt2 > n) || (n >= m)) {
                break label254;
              }
            }
            n = 1;
            break label257;
            n = 0;
            if (n != 0)
            {
              localObject6 = ((TreeMap)localObject6).get(localObject1);
              i.b(localObject6);
              ((ArrayList)localObject5).add(localObject6);
              m = ((Integer)localObject1).intValue();
              n = 1;
              break label300;
            }
          }
          n = 0;
        } while (n != 0);
        localObject1 = null;
        break label315;
        label311:
        localObject1 = localObject5;
      }
      label315:
      if (localObject1 != null)
      {
        ((WorkDatabase_Impl.a)c).getClass();
        localObject5 = new tb.b(null);
        localObject4 = paramc.C("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try
        {
          while (((Cursor)localObject4).moveToNext()) {
            ((tb.b)localObject5).add(((Cursor)localObject4).getString(0));
          }
          localObject6 = rb.h.a;
          x6.b.L((Closeable)localObject4, null);
          ((tb.b)localObject5).m();
          c = true;
          if (b <= 0) {
            localObject5 = tb.b.d;
          }
          localObject5 = ((tb.b)localObject5).listIterator(0);
          for (;;)
          {
            localObject4 = (b.b)localObject5;
            if (!((b.b)localObject4).hasNext()) {
              break;
            }
            localObject6 = (String)((b.b)localObject4).next();
            i.d(localObject6, "triggerName");
            if (lc.h.n0((String)localObject6, "room_fts_content_sync_"))
            {
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("DROP TRIGGER IF EXISTS ");
              ((StringBuilder)localObject4).append((String)localObject6);
              paramc.m(((StringBuilder)localObject4).toString());
            }
          }
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((q1.b)((Iterator)localObject1).next()).a(paramc);
          }
          localObject1 = c.b(paramc);
          if (a)
          {
            c.getClass();
            g(paramc);
            k = j;
            break label625;
          }
          paramc = f.l("Migration didn't properly handle: ");
          paramc.append(b);
          throw new IllegalStateException(paramc.toString());
        }
        finally
        {
          try
          {
            throw paramc;
          }
          finally
          {
            x6.b.L((Closeable)localObject4, paramc);
          }
        }
      }
    }
    int k = 0;
    label625:
    if (k == 0)
    {
      Object localObject3 = b;
      if ((localObject3 != null) && (!((b)localObject3).a(paramInt1, paramInt2)))
      {
        localObject5 = (WorkDatabase_Impl.a)c;
        localObject5.getClass();
        paramc.m("DROP TABLE IF EXISTS `Dependency`");
        paramc.m("DROP TABLE IF EXISTS `WorkSpec`");
        paramc.m("DROP TABLE IF EXISTS `WorkTag`");
        paramc.m("DROP TABLE IF EXISTS `SystemIdInfo`");
        paramc.m("DROP TABLE IF EXISTS `WorkName`");
        paramc.m("DROP TABLE IF EXISTS `WorkProgress`");
        paramc.m("DROP TABLE IF EXISTS `Preference`");
        localObject3 = b.g;
        if (localObject3 != null)
        {
          paramInt2 = ((List)localObject3).size();
          for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++) {
            ((j.b)b.g.get(paramInt1)).getClass();
          }
        }
        c.a(paramc);
      }
      else
      {
        paramc = new StringBuilder();
        paramc.append("A migration from ");
        paramc.append(paramInt1);
        paramc.append(" to ");
        paramc.append(paramInt2);
        paramc.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(paramc.toString());
      }
    }
  }
  
  public final void g(c paramc)
  {
    paramc.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    String str = d;
    i.e(str, "hash");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
    localStringBuilder.append(str);
    localStringBuilder.append("')");
    paramc.m(localStringBuilder.toString());
  }
  
  public static abstract class a
  {
    public final int a = 20;
    
    public abstract void a(c paramc);
    
    public abstract k.b b(c paramc);
  }
  
  public static final class b
  {
    public final boolean a;
    public final String b;
    
    public b(String paramString, boolean paramBoolean)
    {
      a = paramBoolean;
      b = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     p1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */