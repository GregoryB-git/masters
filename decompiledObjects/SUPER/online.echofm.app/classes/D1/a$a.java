package D1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
{
  public String a;
  public List b;
  
  public a$a(String paramString, List paramList)
  {
    a = paramString;
    b = paramList;
  }
  
  public final List a()
  {
    return b;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final void c(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<set-?>");
    b = paramList;
  }
}

/* Location:
 * Qualified Name:     D1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */