package f5;

import java.util.Collections;
import java.util.List;
import y4.a;

public abstract class g
  implements a<g>
{
  public final String a;
  public final List<String> b;
  public final boolean c;
  
  public g(String paramString, List<String> paramList, boolean paramBoolean)
  {
    a = paramString;
    b = Collections.unmodifiableList(paramList);
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     f5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */