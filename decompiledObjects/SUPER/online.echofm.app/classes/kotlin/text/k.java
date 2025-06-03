package kotlin.text;

import W5.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class k
  extends j
{
  public static final g6.l b(String paramString)
  {
    if (paramString.length() == 0) {
      paramString = a.o;
    } else {
      paramString = new b(paramString);
    }
    return paramString;
  }
  
  public static final int c(String paramString)
  {
    int i = paramString.length();
    for (int j = 0; j < i; j++) {
      if ((CharsKt__CharJVMKt.b(paramString.charAt(j)) ^ true)) {
        break label40;
      }
    }
    j = -1;
    label40:
    i = j;
    if (j == -1) {
      i = paramString.length();
    }
    return i;
  }
  
  public static final String d(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "newIndent");
    Object localObject1 = s.M(paramString1);
    Object localObject2 = (Iterable)localObject1;
    Object localObject3 = new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = ((Iterator)localObject2).next();
      if ((i.F((String)localObject4) ^ true)) {
        ((Collection)localObject3).add(localObject4);
      }
    }
    localObject2 = new ArrayList(m.l((Iterable)localObject3, 10));
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((Collection)localObject2).add(Integer.valueOf(c((String)((Iterator)localObject3).next())));
    }
    localObject3 = (Integer)m.A((Iterable)localObject2);
    int i = 0;
    int j;
    if (localObject3 != null) {
      j = ((Integer)localObject3).intValue();
    } else {
      j = 0;
    }
    int k = paramString1.length();
    int m = paramString2.length();
    int n = ((List)localObject1).size();
    localObject3 = b(paramString2);
    int i1 = m.h((List)localObject1);
    paramString1 = (Iterable)localObject1;
    localObject1 = new ArrayList();
    localObject2 = paramString1.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramString1 = ((Iterator)localObject2).next();
      if (i < 0) {
        m.k();
      }
      paramString2 = (String)paramString1;
      if (((i == 0) || (i == i1)) && (i.F(paramString2)))
      {
        paramString1 = null;
      }
      else
      {
        localObject4 = u.g0(paramString2, j);
        paramString1 = paramString2;
        if (localObject4 != null)
        {
          paramString1 = (String)((g6.l)localObject3).invoke(localObject4);
          if (paramString1 == null) {
            paramString1 = paramString2;
          }
        }
      }
      if (paramString1 != null) {
        ((Collection)localObject1).add(paramString1);
      }
      i++;
    }
    paramString1 = ((StringBuilder)m.v((Iterable)localObject1, new StringBuilder(k + m * n), "\n", null, null, 0, null, null, 124, null)).toString();
    Intrinsics.checkNotNullExpressionValue(paramString1, "toString(...)");
    return paramString1;
  }
  
  public static String e(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return d(paramString, "");
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final String a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "line");
      return paramString;
    }
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public b(String paramString)
    {
      super();
    }
    
    public final String a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "line");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(o);
      localStringBuilder.append(paramString);
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.text.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */