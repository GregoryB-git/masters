package W5;

import g6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public class k
  extends j
{
  public static boolean h(Object[] paramArrayOfObject, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    boolean bool;
    if (m(paramArrayOfObject, paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Object i(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if (paramArrayOfObject.length != 0) {
      return paramArrayOfObject[0];
    }
    throw new NoSuchElementException("Array is empty.");
  }
  
  public static int j(int[] paramArrayOfInt)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfInt, "<this>");
    return paramArrayOfInt.length - 1;
  }
  
  public static final int k(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return paramArrayOfObject.length - 1;
  }
  
  public static Object l(Object[] paramArrayOfObject, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if ((paramInt >= 0) && (paramInt < paramArrayOfObject.length)) {
      paramArrayOfObject = paramArrayOfObject[paramInt];
    } else {
      paramArrayOfObject = null;
    }
    return paramArrayOfObject;
  }
  
  public static final int m(Object[] paramArrayOfObject, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = 0;
    int j = 0;
    if (paramObject == null)
    {
      i = paramArrayOfObject.length;
      while (j < i)
      {
        if (paramArrayOfObject[j] == null) {
          return j;
        }
        j++;
      }
    }
    int k = paramArrayOfObject.length;
    for (j = i; j < k; j++) {
      if (Intrinsics.a(paramObject, paramArrayOfObject[j])) {
        return j;
      }
    }
    return -1;
  }
  
  public static final Appendable n(Object[] paramArrayOfObject, Appendable paramAppendable, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "buffer");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramAppendable.append(paramCharSequence2);
    int i = paramArrayOfObject.length;
    int j = 0;
    int k = 0;
    int m;
    for (;;)
    {
      m = k;
      if (j >= i) {
        break;
      }
      paramCharSequence2 = paramArrayOfObject[j];
      k++;
      if (k > 1) {
        paramAppendable.append(paramCharSequence1);
      }
      if (paramInt >= 0)
      {
        m = k;
        if (k > paramInt) {
          break;
        }
      }
      i.a(paramAppendable, paramCharSequence2, paraml);
      j++;
    }
    if ((paramInt >= 0) && (m > paramInt)) {
      paramAppendable.append(paramCharSequence4);
    }
    paramAppendable.append(paramCharSequence3);
    return paramAppendable;
  }
  
  public static final String o(Object[] paramArrayOfObject, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramArrayOfObject = ((StringBuilder)n(paramArrayOfObject, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paraml)).toString();
    Intrinsics.checkNotNullExpressionValue(paramArrayOfObject, "toString(...)");
    return paramArrayOfObject;
  }
  
  public static char q(char[] paramArrayOfChar)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfChar, "<this>");
    int i = paramArrayOfChar.length;
    if (i != 0)
    {
      if (i == 1) {
        return paramArrayOfChar[0];
      }
      throw new IllegalArgumentException("Array has more than one element.");
    }
    throw new NoSuchElementException("Array is empty.");
  }
  
  public static Object r(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if (paramArrayOfObject.length == 1) {
      paramArrayOfObject = paramArrayOfObject[0];
    } else {
      paramArrayOfObject = null;
    }
    return paramArrayOfObject;
  }
  
  public static final Collection s(Object[] paramArrayOfObject, Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++) {
      paramCollection.add(paramArrayOfObject[j]);
    }
    return paramCollection;
  }
  
  public static HashSet t(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return (HashSet)s(paramArrayOfObject, new HashSet(C.a(paramArrayOfObject.length)));
  }
  
  public static List u(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = paramArrayOfObject.length;
    if (i != 0)
    {
      if (i != 1) {
        paramArrayOfObject = v(paramArrayOfObject);
      } else {
        paramArrayOfObject = m.b(paramArrayOfObject[0]);
      }
    }
    else {
      paramArrayOfObject = m.f();
    }
    return paramArrayOfObject;
  }
  
  public static final List v(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new ArrayList(o.e(paramArrayOfObject));
  }
  
  public static final Set w(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    int i = paramArrayOfObject.length;
    if (i != 0)
    {
      if (i != 1) {
        paramArrayOfObject = (Set)s(paramArrayOfObject, new LinkedHashSet(C.a(paramArrayOfObject.length)));
      } else {
        paramArrayOfObject = I.a(paramArrayOfObject[0]);
      }
    }
    else {
      paramArrayOfObject = I.b();
    }
    return paramArrayOfObject;
  }
}

/* Location:
 * Qualified Name:     W5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */