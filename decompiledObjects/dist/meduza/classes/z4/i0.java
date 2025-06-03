package z4;

import a0.j;
import e0.d;
import java.util.Arrays;
import v3.g;
import v5.e0;
import v5.m;
import v5.p;
import x6.b;

public final class i0
  implements g
{
  public static final String f = e0.E(0);
  public static final String o = e0.E(1);
  public static final d p = new d(15);
  public final int a;
  public final String b;
  public final int c;
  public final v3.i0[] d;
  public int e;
  
  public i0() {}
  
  public i0(String paramString, v3.i0... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 1;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    b = paramString;
    d = paramVarArgs;
    a = paramVarArgs.length;
    int k = p.i(0t);
    i = k;
    if (k == -1) {
      i = p.i(0s);
    }
    c = i;
    String str = 0c;
    if (str != null)
    {
      paramString = str;
      if (!str.equals("und")) {}
    }
    else
    {
      paramString = "";
    }
    k = 0e;
    for (i = j;; i++)
    {
      paramVarArgs = d;
      if (i >= paramVarArgs.length) {
        break;
      }
      str = c;
      if (str != null)
      {
        paramVarArgs = str;
        if (!str.equals("und")) {}
      }
      else
      {
        paramVarArgs = "";
      }
      if (!paramString.equals(paramVarArgs))
      {
        paramString = d;
        b("languages", 0c, c, i);
        break;
      }
      paramVarArgs = d;
      if ((k | 0x4000) != (e | 0x4000))
      {
        b("role flags", Integer.toBinaryString(0e), Integer.toBinaryString(d[i].e), i);
        break;
      }
    }
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Different ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" combined in one TrackGroup: '");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("' (track 0) and '");
    localStringBuilder.append(paramString3);
    localStringBuilder.append("' (track ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(")");
    m.d("TrackGroup", "", new IllegalStateException(localStringBuilder.toString()));
  }
  
  public final int a(v3.i0 parami0)
  {
    for (int i = 0;; i++)
    {
      v3.i0[] arrayOfi0 = d;
      if (i >= arrayOfi0.length) {
        break;
      }
      if (parami0 == arrayOfi0[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i0.class == paramObject.getClass()))
    {
      paramObject = (i0)paramObject;
      if ((!b.equals(b)) || (!Arrays.equals(d, d))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (e == 0) {
      e = (j.e(b, 527, 31) + Arrays.hashCode(d));
    }
    return e;
  }
}

/* Location:
 * Qualified Name:     z4.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */