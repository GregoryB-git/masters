package b8;

import java.util.Map;

public final class s
{
  public String a;
  public Map<String, Object> b;
  
  public s(String paramString, Map<String, Object> paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public final long a(String paramString)
  {
    paramString = (Integer)b.get(paramString);
    if (paramString == null) {
      return 0L;
    }
    return paramString.longValue();
  }
}

/* Location:
 * Qualified Name:     b8.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */