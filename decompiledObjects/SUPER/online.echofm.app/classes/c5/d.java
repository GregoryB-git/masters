package c5;

import V4.a;
import Y4.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class d
  extends n
{
  public static int f(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    a locala1 = g(paramCharSequence, paramInt1);
    a locala2 = a.p;
    if (locala1 == locala2) {
      return 100;
    }
    a locala3 = a.o;
    if (locala1 == locala3)
    {
      if (paramInt1 < paramCharSequence.length())
      {
        paramInt1 = paramCharSequence.charAt(paramInt1);
        if ((paramInt1 < 32) || ((paramInt2 == 101) && (paramInt1 < 96))) {
          return 101;
        }
      }
      return 100;
    }
    if (paramInt2 == 99) {
      return 99;
    }
    if (paramInt2 == 100)
    {
      locala4 = a.r;
      if (locala1 == locala4) {
        return 100;
      }
      locala1 = g(paramCharSequence, paramInt1 + 2);
      if ((locala1 != locala3) && (locala1 != locala2))
      {
        if (locala1 == locala4)
        {
          if (g(paramCharSequence, paramInt1 + 3) == a.q) {
            return 99;
          }
          return 100;
        }
        paramInt1 += 4;
        for (;;)
        {
          locala4 = g(paramCharSequence, paramInt1);
          if (locala4 != a.q) {
            break;
          }
          paramInt1 += 2;
        }
        if (locala4 == a.p) {
          return 100;
        }
        return 99;
      }
      return 100;
    }
    a locala4 = locala1;
    if (locala1 == a.r) {
      locala4 = g(paramCharSequence, paramInt1 + 1);
    }
    if (locala4 == a.q) {
      return 99;
    }
    return 100;
  }
  
  public static a g(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    if (paramInt >= i) {
      return a.o;
    }
    int j = paramCharSequence.charAt(paramInt);
    if (j == 241) {
      return a.r;
    }
    if ((j >= 48) && (j <= 57))
    {
      paramInt++;
      if (paramInt >= i) {
        return a.p;
      }
      paramInt = paramCharSequence.charAt(paramInt);
      if ((paramInt >= 48) && (paramInt <= 57)) {
        return a.q;
      }
      return a.p;
    }
    return a.o;
  }
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.s) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if ((i > 0) && (i <= 80))
    {
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        char c = paramString.charAt(k);
        switch (c)
        {
        default: 
          if (c > '') {
            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(c)));
          }
          break;
        }
      }
      Object localObject = new ArrayList();
      int m = 0;
      k = m;
      int n = k;
      int i1 = 1;
      int i2 = k;
      for (;;)
      {
        int i3 = 103;
        if (m >= i) {
          break;
        }
        int i4 = f(paramString, m, n);
        k = 100;
        if (i4 == n)
        {
          switch (paramString.charAt(m))
          {
          default: 
            if (n != 100)
            {
              if (n != 101)
              {
                k = Integer.parseInt(paramString.substring(m, m + 2));
                i4 = m + 1;
              }
              else
              {
                int i5 = paramString.charAt(m);
                i3 = i5 - 32;
                i4 = m;
                k = i3;
                if (i3 < 0)
                {
                  k = i5 + 64;
                  i4 = m;
                }
              }
            }
            else
            {
              k = paramString.charAt(m) - ' ';
              i4 = m;
            }
            break;
          case 'ô': 
            i4 = m;
            if (n == 101)
            {
              k = 101;
              i4 = m;
            }
            break;
          case 'ó': 
            k = 96;
            i4 = m;
            break;
          case 'ò': 
            k = 97;
            i4 = m;
            break;
          case 'ñ': 
            k = 102;
            i4 = m;
          }
          i3 = i4 + 1;
          i4 = n;
        }
        else
        {
          if (n == 0)
          {
            if (i4 != 100)
            {
              k = i3;
              if (i4 != 101) {
                k = 105;
              }
            }
            else
            {
              k = 104;
            }
          }
          else {
            k = i4;
          }
          i3 = m;
        }
        ((Collection)localObject).add(c.a[k]);
        k = i2 + k * i1;
        m = i3;
        i2 = k;
        n = i4;
        if (i3 != 0)
        {
          i1++;
          m = i3;
          i2 = k;
          n = i4;
        }
      }
      paramString = c.a;
      ((Collection)localObject).add(paramString[(i2 % 103)]);
      ((Collection)localObject).add(paramString[106]);
      paramString = ((Collection)localObject).iterator();
      k = 0;
      if (paramString.hasNext())
      {
        int[] arrayOfInt = (int[])paramString.next();
        i2 = arrayOfInt.length;
        i1 = 0;
        m = k;
        for (;;)
        {
          k = m;
          if (i1 >= i2) {
            break;
          }
          m += arrayOfInt[i1];
          i1++;
        }
      }
      paramString = new boolean[k];
      localObject = ((Collection)localObject).iterator();
      k = j;
      while (((Iterator)localObject).hasNext()) {
        k += n.b(paramString, k, (int[])((Iterator)localObject).next(), true);
      }
      return paramString;
    }
    throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(i)));
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("UNCODABLE", 0);
      o = locala1;
      a locala2 = new a("ONE_DIGIT", 1);
      p = locala2;
      a locala3 = new a("TWO_DIGITS", 2);
      q = locala3;
      a locala4 = new a("FNC_1", 3);
      r = locala4;
      s = new a[] { locala1, locala2, locala3, locala4 };
    }
  }
}

/* Location:
 * Qualified Name:     c5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */