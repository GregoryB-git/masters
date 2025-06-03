package b3;

import b.a0;
import f;
import java.util.Iterator;
import java.util.List;
import sb.q;
import x2.n;
import x2.s;
import x2.x;

public final class b
{
  public static final String a;
  
  static
  {
    String str = o2.j.f("DiagnosticsWrkr");
    ec.i.d(str, "tagWithPrefix(\"DiagnosticsWrkr\")");
    a = str;
  }
  
  public static final String a(n paramn, x paramx, x2.j paramj, List paramList)
  {
    StringBuilder localStringBuilder1 = f.l("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      paramList = paramj.c(a0.s(locals));
      if (paramList != null) {
        paramList = Integer.valueOf(c);
      } else {
        paramList = null;
      }
      String str1 = q.p(paramn.b(a), ",", null, null, null, 62);
      String str2 = q.p(paramx.a(a), ",", null, null, null, 62);
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append('\n');
      localStringBuilder2.append(a);
      localStringBuilder2.append("\t ");
      localStringBuilder2.append(c);
      localStringBuilder2.append("\t ");
      localStringBuilder2.append(paramList);
      localStringBuilder2.append("\t ");
      localStringBuilder2.append(b.name());
      localStringBuilder2.append("\t ");
      localStringBuilder2.append(str1);
      localStringBuilder2.append("\t ");
      localStringBuilder2.append(str2);
      localStringBuilder2.append('\t');
      localStringBuilder1.append(localStringBuilder2.toString());
    }
    paramn = localStringBuilder1.toString();
    ec.i.d(paramn, "StringBuilder().apply(builderAction).toString()");
    return paramn;
  }
}

/* Location:
 * Qualified Name:     b3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */