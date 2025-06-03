package r1;

import a0.j;
import ec.i;
import f;
import java.util.List;

public final class a$b
{
  public final String a;
  public final String b;
  public final String c;
  public final List<String> d;
  public final List<String> e;
  
  public a$b(String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramList1;
    e = paramList2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    String str = a;
    paramObject = (b)paramObject;
    if (!i.a(str, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (!i.a(c, c)) {
      return false;
    }
    if (i.a(d, d)) {
      bool2 = i.a(e, e);
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    i = j.e(b, i * 31, 31);
    i = j.e(c, i, 31);
    int j = d.hashCode();
    return e.hashCode() + (j + i) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ForeignKey{referenceTable='");
    localStringBuilder.append(a);
    localStringBuilder.append("', onDelete='");
    localStringBuilder.append(b);
    localStringBuilder.append(" +', onUpdate='");
    localStringBuilder.append(c);
    localStringBuilder.append("', columnNames=");
    localStringBuilder.append(d);
    localStringBuilder.append(", referenceColumnNames=");
    localStringBuilder.append(e);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */