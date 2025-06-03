package i9;

import android.database.Cursor;
import j9.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import k9.k;
import ma.a;
import ma.b0;
import n9.c;

public final class m0
  implements b
{
  public final y0 a;
  public final i b;
  public final String c;
  
  public m0(y0 paramy0, i parami, e9.e parame)
  {
    a = paramy0;
    b = parami;
    paramy0 = a;
    int i;
    if (paramy0 != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      paramy0 = "";
    }
    c = paramy0;
  }
  
  public final void a(int paramInt, HashMap paramHashMap)
  {
    paramHashMap = paramHashMap.entrySet().iterator();
    while (paramHashMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramHashMap.next();
      Object localObject2 = (j9.i)((Map.Entry)localObject1).getKey();
      localObject1 = (k9.f)((Map.Entry)localObject1).getValue();
      if (localObject1 != null)
      {
        Object localObject3 = a;
        String str = ((j9.e)localObject3).n(((j9.e)localObject3).q() - 2);
        localObject3 = p2.m0.A((o)a.s());
        localObject2 = a.m();
        a.G("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", new Object[] { c, str, localObject3, localObject2, Integer.valueOf(paramInt), b.a.k((k9.f)localObject1).j() });
      }
      else
      {
        throw new NullPointerException(String.format(Locale.US, "null value for key: %s", new Object[] { localObject2 }));
      }
    }
  }
  
  public final HashMap b(int paramInt1, int paramInt2, String paramString)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = new String[1];
    String[] arrayOfString = new String[1];
    int[] arrayOfInt = new int[1];
    c localc = new c();
    Object localObject2 = a.H("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
    ((y0.d)localObject2).a(new Object[] { c, paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ((y0.d)localObject2).d(new l0(this, arrayOfInt, (String[])localObject1, arrayOfString, localc, localHashMap));
    if (localObject1[0] == null) {
      return localHashMap;
    }
    y0.d locald = a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
    localObject2 = c;
    localObject1 = localObject1[0];
    locald.a(new Object[] { localObject2, paramString, localObject1, localObject1, arrayOfString[0], Integer.valueOf(arrayOfInt[0]) });
    locald.d(new j0(this, localc, localHashMap, 1));
    localc.a();
    return localHashMap;
  }
  
  public final k c(j9.i parami)
  {
    String str1 = p2.m0.A((o)a.s());
    String str2 = a.m();
    parami = a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
    parami.a(new Object[] { c, str1, str2 });
    return (k)parami.c(new aa.m0(this, 3));
  }
  
  public final HashMap d(TreeSet paramTreeSet)
  {
    boolean bool;
    if (paramTreeSet.comparator() == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("getOverlays() requires natural order", bool, new Object[0]);
    HashMap localHashMap = new HashMap();
    c localc = new c();
    Object localObject = o.b;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramTreeSet.iterator();
    for (paramTreeSet = (TreeSet)localObject; localIterator.hasNext(); paramTreeSet = (TreeSet)localObject)
    {
      j9.i locali = (j9.i)localIterator.next();
      localObject = paramTreeSet;
      if (!paramTreeSet.equals(locali.i()))
      {
        i(localHashMap, localc, paramTreeSet, localArrayList);
        localObject = locali.i();
        localArrayList.clear();
      }
      localArrayList.add(a.m());
    }
    i(localHashMap, localc, paramTreeSet, localArrayList);
    localc.a();
    return localHashMap;
  }
  
  public final HashMap e(o paramo, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    c localc = new c();
    y0.d locald = a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
    locald.a(new Object[] { c, p2.m0.A(paramo), Integer.valueOf(paramInt) });
    locald.d(new k0(this, localc, localHashMap, 0));
    localc.a();
    return localHashMap;
  }
  
  public final void f(int paramInt)
  {
    a.G("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", new Object[] { c, Integer.valueOf(paramInt) });
  }
  
  public final k9.b g(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = ka.e0.a0(paramArrayOfByte);
      paramArrayOfByte = new k9.b(paramInt, b.a.c(paramArrayOfByte));
      return paramArrayOfByte;
    }
    catch (b0 paramArrayOfByte)
    {
      x6.b.T("Overlay failed to parse: %s", new Object[] { paramArrayOfByte });
      throw null;
    }
  }
  
  public final void h(c paramc, Map<j9.i, k> paramMap, Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(0);
    int i = paramCursor.getInt(1);
    if (paramCursor.isLast()) {
      paramc = n9.f.b;
    }
    paramc.execute(new q3.f(this, arrayOfByte, i, paramMap, 1));
  }
  
  public final void i(HashMap paramHashMap, c paramc, o paramo, ArrayList paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    paramo = new y0.b(a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(new Object[] { c, p2.m0.A(paramo) }), paramArrayList, ")");
    while (f.hasNext()) {
      paramo.a().d(new j0(this, paramc, paramHashMap, 0));
    }
  }
}

/* Location:
 * Qualified Name:     i9.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */