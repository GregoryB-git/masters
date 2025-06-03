package r0;

import dc.l;
import ec.i;
import ec.j;
import java.util.Map.Entry;

public final class a$a
  extends j
  implements l<Map.Entry<d.a<?>, Object>, CharSequence>
{
  public static final a a = new a();
  
  public a$a()
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    i.e(paramObject, "entry");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("  ");
    localStringBuilder.append(getKeya);
    localStringBuilder.append(" = ");
    localStringBuilder.append(((Map.Entry)paramObject).getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */