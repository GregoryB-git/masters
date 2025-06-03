package J1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
{
  public String a;
  public Map b;
  
  public a$a(String paramString, Map paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final Map b()
  {
    return b;
  }
  
  public final void c(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<set-?>");
    b = paramMap;
  }
}

/* Location:
 * Qualified Name:     J1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */