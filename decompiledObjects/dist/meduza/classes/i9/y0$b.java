package i9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n9.o;

public final class y0$b
{
  public final y0 a;
  public final String b;
  public final String c;
  public final List<Object> d;
  public int e = 0;
  public final Iterator<Object> f;
  
  public y0$b(y0 paramy0, String paramString1, List paramList, ArrayList paramArrayList, String paramString2)
  {
    a = paramy0;
    b = paramString1;
    d = paramList;
    c = paramString2;
    f = paramArrayList.iterator();
  }
  
  public y0$b(y0 paramy0, ArrayList paramArrayList)
  {
    a = paramy0;
    b = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
    d = Collections.emptyList();
    c = ") ORDER BY path";
    f = paramArrayList.iterator();
  }
  
  public final y0.d a()
  {
    e += 1;
    Object localObject1 = new ArrayList(d);
    for (int i = 0; (f.hasNext()) && (i < 900 - d.size()); i++) {
      ((ArrayList)localObject1).add(f.next());
    }
    localObject1 = ((ArrayList)localObject1).toArray();
    Object localObject2 = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b);
    localStringBuilder.append(o.h("?", localObject1.length, ", "));
    localStringBuilder.append(c);
    localObject2 = ((y0)localObject2).H(localStringBuilder.toString());
    ((y0.d)localObject2).a((Object[])localObject1);
    return (y0.d)localObject2;
  }
}

/* Location:
 * Qualified Name:     i9.y0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */