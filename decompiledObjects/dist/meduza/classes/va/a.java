package va;

import android.text.TextUtils;
import b8.d;
import b8.h;
import ec.i;
import java.util.Collections;
import java.util.List;
import sb.s;
import tb.c;
import tb.g;

public class a
{
  public static final String[] a;
  
  public static final g a(g paramg)
  {
    c localc = a;
    localc.c();
    u = true;
    if (q <= 0) {
      i.c(c.v, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
    }
    if (a.q <= 0) {
      paramg = g.b;
    }
    return paramg;
  }
  
  public static final void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= paramInt2) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("toIndex (");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(") is greater than size (");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(").");
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public static h c(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      Object localObject1 = d.d;
      m6.j.e(paramString2);
      Object localObject2;
      try
      {
        localObject1 = new b8/d;
        ((d)localObject1).<init>(paramString2);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        com.google.android.gms.internal.firebase-auth-api.zzan localzzan = d.d;
        if (localzzan.containsKey(b)) {
          i = ((Integer)localzzan.get(b)).intValue();
        } else {
          i = 3;
        }
        if (i == 4)
        {
          i = 1;
          break label89;
        }
      }
    }
    int i = 0;
    label89:
    if (i != 0) {
      return new h(paramString1, null, paramString2, null, false);
    }
    throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
  }
  
  public static final int d(List paramList)
  {
    i.e(paramList, "<this>");
    return paramList.size() - 1;
  }
  
  public static final int e(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt3 > 0)
    {
      if (paramInt1 < paramInt2)
      {
        i = paramInt2 % paramInt3;
        if (i < 0) {
          i += paramInt3;
        }
        paramInt1 %= paramInt3;
        if (paramInt1 < 0) {
          paramInt1 += paramInt3;
        }
        paramInt1 = (i - paramInt1) % paramInt3;
        if (paramInt1 < 0) {
          paramInt1 += paramInt3;
        }
        paramInt2 -= paramInt1;
      }
    }
    else
    {
      if (paramInt3 >= 0) {
        break label134;
      }
      if (paramInt1 > paramInt2)
      {
        i = -paramInt3;
        paramInt1 %= i;
        if (paramInt1 < 0) {
          paramInt1 += i;
        }
        paramInt3 = paramInt2 % i;
        if (paramInt3 < 0) {
          paramInt3 += i;
        }
        paramInt1 = (paramInt1 - paramInt3) % i;
        if (paramInt1 < 0) {
          paramInt1 += i;
        }
        paramInt2 += paramInt1;
      }
    }
    return paramInt2;
    label134:
    throw new IllegalArgumentException("Step is zero.");
  }
  
  public static final List f(Object paramObject)
  {
    paramObject = Collections.singletonList(paramObject);
    i.d(paramObject, "singletonList(...)");
    return (List)paramObject;
  }
  
  public static final List g(Object... paramVarArgs)
  {
    i.e(paramVarArgs, "elements");
    if (paramVarArgs.length > 0) {
      paramVarArgs = sb.j.j(paramVarArgs);
    } else {
      paramVarArgs = s.a;
    }
    return paramVarArgs;
  }
  
  public static int h(int paramInt)
  {
    int i = 0;
    while (i < 6)
    {
      int j = new int[] { 1, 2, 3, 4, 5, 6 }[i];
      if (j != 0)
      {
        if (j - 1 == paramInt) {
          return j;
        }
        i++;
      }
      else
      {
        throw null;
      }
    }
    return 1;
  }
  
  public static String i(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = Math.min(paramArrayOfString1.length, paramArrayOfString2.length);
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString1[j];
      boolean bool;
      if ((paramString == null) && (str == null)) {
        bool = true;
      } else if (paramString == null) {
        bool = false;
      } else {
        bool = paramString.equals(str);
      }
      if (bool) {
        return paramArrayOfString2[j];
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     va.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */