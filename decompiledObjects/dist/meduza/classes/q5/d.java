package q5;

import java.util.Collections;
import java.util.Set;

public final class d
{
  public String a = "";
  public String b = "";
  public Set<String> c = Collections.emptySet();
  public String d = "";
  public String e = null;
  public int f;
  public boolean g = false;
  public int h;
  public boolean i = false;
  public int j = -1;
  public int k = -1;
  public int l = -1;
  public int m = -1;
  public int n = -1;
  public float o;
  public int p = -1;
  public boolean q = false;
  
  public static int a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (!paramString1.isEmpty())
    {
      int i1 = -1;
      if (paramInt1 != -1)
      {
        if (paramString1.equals(paramString2)) {
          i1 = paramInt1 + paramInt2;
        }
        return i1;
      }
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     q5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */