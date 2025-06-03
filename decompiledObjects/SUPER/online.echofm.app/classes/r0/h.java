package r0;

import java.util.Collections;
import java.util.List;
import v0.a;

public abstract class h
  implements a
{
  public final String a;
  public final List b;
  public final boolean c;
  
  public h(String paramString, List paramList, boolean paramBoolean)
  {
    a = paramString;
    b = Collections.unmodifiableList(paramList);
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     r0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */