package kotlin.text;

import V5.q;
import W5.g;
import g6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l6.d;
import n6.b;

public class s
  extends r
{
  public static final int A(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject;
    if (!paramBoolean2) {
      localObject = new l6.c(d.a(paramInt1, 0), d.b(paramInt2, paramCharSequence1.length()));
    } else {
      localObject = d.f(d.b(paramInt1, x(paramCharSequence1)), d.a(paramInt2, 0));
    }
    int i;
    int j;
    if (((paramCharSequence1 instanceof String)) && ((paramCharSequence2 instanceof String)))
    {
      paramInt2 = ((l6.a)localObject).a();
      i = ((l6.a)localObject).d();
      j = ((l6.a)localObject).f();
      if (j > 0)
      {
        paramInt1 = paramInt2;
        if (paramInt2 <= i) {}
      }
      else
      {
        if ((j >= 0) || (i > paramInt2)) {
          break label230;
        }
        paramInt1 = paramInt2;
      }
      for (;;)
      {
        if (r.m((String)paramCharSequence2, 0, (String)paramCharSequence1, paramInt1, paramCharSequence2.length(), paramBoolean1)) {
          return paramInt1;
        }
        if (paramInt1 == i) {
          break;
        }
        paramInt1 += j;
      }
    }
    else
    {
      paramInt2 = ((l6.a)localObject).a();
      j = ((l6.a)localObject).d();
      i = ((l6.a)localObject).f();
      if (i > 0)
      {
        paramInt1 = paramInt2;
        if (paramInt2 <= j) {}
      }
      else
      {
        if ((i >= 0) || (j > paramInt2)) {
          break label230;
        }
        paramInt1 = paramInt2;
      }
      for (;;)
      {
        if (R(paramCharSequence2, 0, paramCharSequence1, paramInt1, paramCharSequence2.length(), paramBoolean1)) {
          return paramInt1;
        }
        if (paramInt1 == j) {
          break;
        }
        paramInt1 += i;
      }
    }
    label230:
    return -1;
  }
  
  public static final int E(CharSequence paramCharSequence, char[] paramArrayOfChar, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfChar, "chars");
    int i;
    if ((!paramBoolean) && (paramArrayOfChar.length == 1) && ((paramCharSequence instanceof String)))
    {
      i = g.q(paramArrayOfChar);
      return ((String)paramCharSequence).indexOf(i, paramInt);
    }
    paramInt = d.a(paramInt, 0);
    int j = x(paramCharSequence);
    if (paramInt <= j) {
      for (;;)
      {
        char c = paramCharSequence.charAt(paramInt);
        int k = paramArrayOfChar.length;
        for (i = 0; i < k; i++) {
          if (a.d(paramArrayOfChar[i], c, paramBoolean)) {
            return paramInt;
          }
        }
        if (paramInt == j) {
          break;
        }
        paramInt++;
      }
    }
    return -1;
  }
  
  public static boolean F(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    boolean bool = false;
    for (int i = 0; i < paramCharSequence.length(); i++) {
      if (!CharsKt__CharJVMKt.b(paramCharSequence.charAt(i))) {
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public static final int G(CharSequence paramCharSequence, char paramChar, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    if ((!paramBoolean) && ((paramCharSequence instanceof String))) {
      paramInt = ((String)paramCharSequence).lastIndexOf(paramChar, paramInt);
    } else {
      paramInt = K(paramCharSequence, new char[] { paramChar }, paramInt, paramBoolean);
    }
    return paramInt;
  }
  
  public static final int H(CharSequence paramCharSequence, String paramString, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "string");
    if ((!paramBoolean) && ((paramCharSequence instanceof String))) {
      paramInt = ((String)paramCharSequence).lastIndexOf(paramString, paramInt);
    } else {
      paramInt = A(paramCharSequence, paramString, paramInt, 0, paramBoolean, true);
    }
    return paramInt;
  }
  
  public static final int K(CharSequence paramCharSequence, char[] paramArrayOfChar, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfChar, "chars");
    int i;
    if ((!paramBoolean) && (paramArrayOfChar.length == 1) && ((paramCharSequence instanceof String)))
    {
      i = g.q(paramArrayOfChar);
      return ((String)paramCharSequence).lastIndexOf(i, paramInt);
    }
    for (paramInt = d.b(paramInt, x(paramCharSequence)); -1 < paramInt; paramInt--)
    {
      char c = paramCharSequence.charAt(paramInt);
      int j = paramArrayOfChar.length;
      for (i = 0; i < j; i++) {
        if (a.d(paramArrayOfChar[i], c, paramBoolean)) {
          return paramInt;
        }
      }
    }
    return -1;
  }
  
  public static final b L(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return X(paramCharSequence, new String[] { "\r\n", "\n", "\r" }, false, 0, 6, null);
  }
  
  public static final List M(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return n6.c.e(L(paramCharSequence));
  }
  
  public static final CharSequence N(CharSequence paramCharSequence, int paramInt, char paramChar)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    if (paramInt >= 0)
    {
      if (paramInt <= paramCharSequence.length()) {
        return paramCharSequence.subSequence(0, paramCharSequence.length());
      }
      StringBuilder localStringBuilder = new StringBuilder(paramInt);
      int i = paramInt - paramCharSequence.length();
      paramInt = 1;
      if (1 <= i) {
        for (;;)
        {
          localStringBuilder.append(paramChar);
          if (paramInt == i) {
            break;
          }
          paramInt++;
        }
      }
      localStringBuilder.append(paramCharSequence);
      return localStringBuilder;
    }
    paramCharSequence = new StringBuilder();
    paramCharSequence.append("Desired length ");
    paramCharSequence.append(paramInt);
    paramCharSequence.append(" is less than zero.");
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static String O(String paramString, int paramInt, char paramChar)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return N(paramString, paramInt, paramChar).toString();
  }
  
  public static final b P(CharSequence paramCharSequence, String[] paramArrayOfString, int paramInt1, final boolean paramBoolean, int paramInt2)
  {
    S(paramInt2);
    return new c(paramCharSequence, paramInt1, paramInt2, new a(g.b(paramArrayOfString), paramBoolean));
  }
  
  public static final boolean R(CharSequence paramCharSequence1, int paramInt1, CharSequence paramCharSequence2, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    if ((paramInt2 >= 0) && (paramInt1 >= 0) && (paramInt1 <= paramCharSequence1.length() - paramInt3) && (paramInt2 <= paramCharSequence2.length() - paramInt3))
    {
      for (int i = 0; i < paramInt3; i++) {
        if (!a.d(paramCharSequence1.charAt(paramInt1 + i), paramCharSequence2.charAt(paramInt2 + i), paramBoolean)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static final void S(int paramInt)
  {
    if (paramInt >= 0) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Limit must be non-negative, but was ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString().toString());
  }
  
  public static final List T(CharSequence paramCharSequence, String[] paramArrayOfString, boolean paramBoolean, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "delimiters");
    if (paramArrayOfString.length == 1)
    {
      localObject = paramArrayOfString[0];
      if (((CharSequence)localObject).length() != 0) {
        return U(paramCharSequence, (String)localObject, paramBoolean, paramInt);
      }
    }
    Object localObject = n6.c.c(Q(paramCharSequence, paramArrayOfString, 0, paramBoolean, paramInt, 2, null));
    paramArrayOfString = new ArrayList(W5.m.l((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramArrayOfString.add(Y(paramCharSequence, (l6.c)((Iterator)localObject).next()));
    }
    return paramArrayOfString;
  }
  
  public static final List U(CharSequence paramCharSequence, String paramString, boolean paramBoolean, int paramInt)
  {
    S(paramInt);
    int i = 0;
    int j = z(paramCharSequence, paramString, 0, paramBoolean);
    if ((j != -1) && (paramInt != 1))
    {
      int k;
      if (paramInt > 0) {
        k = 1;
      } else {
        k = 0;
      }
      int m = 10;
      if (k != 0) {
        m = d.b(paramInt, 10);
      }
      ArrayList localArrayList = new ArrayList(m);
      m = j;
      int n;
      do
      {
        localArrayList.add(paramCharSequence.subSequence(i, m).toString());
        n = paramString.length() + m;
        if ((k != 0) && (localArrayList.size() == paramInt - 1)) {
          break;
        }
        j = z(paramCharSequence, paramString, n, paramBoolean);
        i = n;
        m = j;
      } while (j != -1);
      localArrayList.add(paramCharSequence.subSequence(n, paramCharSequence.length()).toString());
      return localArrayList;
    }
    return W5.m.b(paramCharSequence.toString());
  }
  
  public static final b W(CharSequence paramCharSequence, String[] paramArrayOfString, boolean paramBoolean, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "delimiters");
    return n6.c.d(Q(paramCharSequence, paramArrayOfString, 0, paramBoolean, paramInt, 2, null), new b(paramCharSequence));
  }
  
  public static final String Y(CharSequence paramCharSequence, l6.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramc, "range");
    return paramCharSequence.subSequence(paramc.q().intValue(), paramc.k().intValue() + 1).toString();
  }
  
  public static final String Z(String paramString1, char paramChar, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = i.C(paramString1, paramChar, 0, false, 6, null);
    if (i != -1)
    {
      paramString2 = paramString1.substring(i + 1, paramString1.length());
      Intrinsics.checkNotNullExpressionValue(paramString2, "substring(...)");
    }
    return paramString2;
  }
  
  public static final String a0(String paramString1, String paramString2, String paramString3)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = i.D(paramString1, paramString2, 0, false, 6, null);
    if (i != -1)
    {
      paramString3 = paramString1.substring(i + paramString2.length(), paramString1.length());
      Intrinsics.checkNotNullExpressionValue(paramString3, "substring(...)");
    }
    return paramString3;
  }
  
  public static String d0(String paramString1, char paramChar, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = I(paramString1, paramChar, 0, false, 6, null);
    if (i != -1)
    {
      paramString2 = paramString1.substring(i + 1, paramString1.length());
      Intrinsics.checkNotNullExpressionValue(paramString2, "substring(...)");
    }
    return paramString2;
  }
  
  public static CharSequence f0(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    int i = paramCharSequence.length() - 1;
    int j = 0;
    int k = 0;
    while (j <= i)
    {
      int m;
      if (k == 0) {
        m = j;
      } else {
        m = i;
      }
      boolean bool = CharsKt__CharJVMKt.b(paramCharSequence.charAt(m));
      if (k == 0)
      {
        if (!bool) {
          k = 1;
        } else {
          j++;
        }
      }
      else
      {
        if (!bool) {
          break;
        }
        i--;
      }
    }
    return paramCharSequence.subSequence(j, i + 1);
  }
  
  public static final boolean u(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    boolean bool1 = paramCharSequence2 instanceof String;
    boolean bool2 = false;
    if (bool1)
    {
      if (i.D(paramCharSequence1, (String)paramCharSequence2, 0, paramBoolean, 2, null) < 0) {}
    }
    else {
      while (B(paramCharSequence1, paramCharSequence2, 0, paramCharSequence1.length(), paramBoolean, false, 16, null) >= 0)
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public static final V5.m w(CharSequence paramCharSequence, Collection paramCollection, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    if ((!paramBoolean1) && (paramCollection.size() == 1))
    {
      paramCollection = (String)W5.m.B((Iterable)paramCollection);
      if (!paramBoolean2) {
        paramInt = i.D(paramCharSequence, paramCollection, paramInt, false, 4, null);
      } else {
        paramInt = i.J(paramCharSequence, paramCollection, paramInt, false, 4, null);
      }
      if (paramInt < 0) {
        paramCharSequence = (CharSequence)localObject1;
      } else {
        paramCharSequence = q.a(Integer.valueOf(paramInt), paramCollection);
      }
      return paramCharSequence;
    }
    if (!paramBoolean2) {
      localObject1 = new l6.c(d.a(paramInt, 0), paramCharSequence.length());
    } else {
      localObject1 = d.f(d.b(paramInt, x(paramCharSequence)), 0);
    }
    int i;
    int j;
    int k;
    Object localObject2;
    Object localObject3;
    if ((paramCharSequence instanceof String))
    {
      i = ((l6.a)localObject1).a();
      j = ((l6.a)localObject1).d();
      k = ((l6.a)localObject1).f();
      if (k > 0)
      {
        paramInt = i;
        if (i <= j) {}
      }
      else
      {
        if ((k >= 0) || (j > i)) {
          break label421;
        }
        paramInt = i;
      }
      for (;;)
      {
        localObject2 = ((Iterable)paramCollection).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = ((Iterator)localObject2).next();
          localObject3 = (String)localObject1;
          if (r.m((String)localObject3, 0, (String)paramCharSequence, paramInt, ((String)localObject3).length(), paramBoolean1)) {
            break label240;
          }
        }
        localObject1 = null;
        label240:
        localObject1 = (String)localObject1;
        if (localObject1 != null)
        {
          paramCharSequence = (CharSequence)localObject1;
          return q.a(Integer.valueOf(paramInt), paramCharSequence);
        }
        if (paramInt == j) {
          break;
        }
        paramInt += k;
      }
    }
    else
    {
      i = ((l6.a)localObject1).a();
      j = ((l6.a)localObject1).d();
      k = ((l6.a)localObject1).f();
      if (k > 0)
      {
        paramInt = i;
        if (i <= j) {}
      }
      else
      {
        if ((k >= 0) || (j > i)) {
          break label421;
        }
        paramInt = i;
      }
      for (;;)
      {
        localObject3 = ((Iterable)paramCollection).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = ((Iterator)localObject3).next();
          localObject2 = (String)localObject1;
          if (R((CharSequence)localObject2, 0, paramCharSequence, paramInt, ((String)localObject2).length(), paramBoolean1)) {
            break label389;
          }
        }
        localObject1 = null;
        label389:
        localObject1 = (String)localObject1;
        if (localObject1 != null)
        {
          paramCharSequence = (CharSequence)localObject1;
          break;
        }
        if (paramInt == j) {
          break label421;
        }
        paramInt += k;
      }
    }
    label421:
    return null;
  }
  
  public static final int x(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return paramCharSequence.length() - 1;
  }
  
  public static final int y(CharSequence paramCharSequence, char paramChar, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    if ((!paramBoolean) && ((paramCharSequence instanceof String))) {
      paramInt = ((String)paramCharSequence).indexOf(paramChar, paramInt);
    } else {
      paramInt = E(paramCharSequence, new char[] { paramChar }, paramInt, paramBoolean);
    }
    return paramInt;
  }
  
  public static final int z(CharSequence paramCharSequence, String paramString, int paramInt, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "string");
    if ((!paramBoolean) && ((paramCharSequence instanceof String))) {
      paramInt = ((String)paramCharSequence).indexOf(paramString, paramInt);
    } else {
      paramInt = B(paramCharSequence, paramString, paramInt, paramCharSequence.length(), paramBoolean, false, 16, null);
    }
    return paramInt;
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements p
  {
    public a(List paramList, boolean paramBoolean)
    {
      super();
    }
    
    public final V5.m a(CharSequence paramCharSequence, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramCharSequence, "$this$$receiver");
      paramCharSequence = s.t(paramCharSequence, (Collection)o, paramInt, paramBoolean, false);
      if (paramCharSequence != null) {
        paramCharSequence = q.a(paramCharSequence.c(), Integer.valueOf(((String)paramCharSequence.d()).length()));
      } else {
        paramCharSequence = null;
      }
      return paramCharSequence;
    }
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public b(CharSequence paramCharSequence)
    {
      super();
    }
    
    public final String a(l6.c paramc)
    {
      Intrinsics.checkNotNullParameter(paramc, "it");
      return s.Y(o, paramc);
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.text.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */