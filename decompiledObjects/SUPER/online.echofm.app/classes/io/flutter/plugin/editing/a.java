package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

public class a
{
  public final FlutterJNI a;
  
  public a(FlutterJNI paramFlutterJNI)
  {
    a = paramFlutterJNI;
  }
  
  public int a(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = i - 1;
    if (paramInt >= j) {
      return i;
    }
    int k = Character.codePointAt(paramCharSequence, paramInt);
    int m = Character.charCount(k);
    int n = paramInt + m;
    int i1 = 0;
    if (n == 0) {
      return 0;
    }
    if (k == 10)
    {
      i1 = m;
      if (Character.codePointAt(paramCharSequence, n) == 13) {
        i1 = m + 1;
      }
      return paramInt + i1;
    }
    if (g(k))
    {
      if ((n < j) && (g(Character.codePointAt(paramCharSequence, n))))
      {
        k = paramInt;
        while ((k > 0) && (g(Character.codePointBefore(paramCharSequence, paramInt))))
        {
          k -= Character.charCount(Character.codePointBefore(paramCharSequence, paramInt));
          i1++;
        }
        k = m;
        if (i1 % 2 == 0) {
          k = m + 2;
        }
        return paramInt + k;
      }
      return n;
    }
    i1 = m;
    if (f(k)) {
      i1 = m + Character.charCount(k);
    }
    if (k == 8419)
    {
      k = Character.codePointBefore(paramCharSequence, n);
      m = n + Character.charCount(k);
      if ((m < i) && (i(k)))
      {
        j = Character.codePointAt(paramCharSequence, m);
        m = i1;
        if (f(j)) {
          m = i1 + (Character.charCount(k) + Character.charCount(j));
        }
      }
      else
      {
        m = i1;
        if (f(k)) {
          m = i1 + Character.charCount(k);
        }
      }
      return paramInt + m;
    }
    j = i1;
    if (c(k))
    {
      int i2 = 0;
      int i3 = i2;
      m = n;
      n = i1;
      j = k;
      do
      {
        i1 = n;
        k = i2;
        if (i2 != 0)
        {
          i1 = n + (Character.charCount(j) + i3 + 1);
          k = 0;
        }
        if (d(j))
        {
          j = i1;
          break;
        }
        n = m;
        if (m < i)
        {
          i3 = Character.codePointAt(paramCharSequence, m);
          m += Character.charCount(i3);
          if (i3 == 8419)
          {
            k = Character.codePointBefore(paramCharSequence, m);
            m += Character.charCount(k);
            if ((m < i) && (i(k)))
            {
              j = Character.codePointAt(paramCharSequence, m);
              m = i1;
              if (f(j)) {
                m = i1 + (Character.charCount(k) + Character.charCount(j));
              }
            }
            else
            {
              m = i1;
              if (f(k)) {
                m = i1 + Character.charCount(k);
              }
            }
            return paramInt + m;
          }
          if (d(i3)) {}
          while (i(i3))
          {
            j = i1 + Character.charCount(i3);
            break;
          }
          j = i3;
          n = m;
          if (i3 == 8205)
          {
            k = Character.codePointAt(paramCharSequence, m);
            m += Character.charCount(k);
            if ((m < i) && (i(k)))
            {
              k = Character.codePointAt(paramCharSequence, m);
              i3 = Character.charCount(k);
              m += Character.charCount(k);
            }
            for (;;)
            {
              i2 = 1;
              break;
              i3 = 0;
            }
          }
        }
        i3 = 0;
        i2 = k;
        m = n;
        k = j;
        if (m >= i)
        {
          j = i1;
          break;
        }
        j = i1;
        if (i2 == 0) {
          break;
        }
        j = k;
        n = i1;
      } while (c(k));
      j = i1;
    }
    return paramInt + j;
  }
  
  public int b(CharSequence paramCharSequence, int paramInt)
  {
    int i = 0;
    int j = 1;
    if (paramInt <= 1) {
      return 0;
    }
    int k = Character.codePointBefore(paramCharSequence, paramInt);
    int m = Character.charCount(k);
    int n = paramInt - m;
    if (n == 0) {
      return 0;
    }
    if (k == 10)
    {
      j = m;
      if (Character.codePointBefore(paramCharSequence, n) == 13) {
        j = m + 1;
      }
      return paramInt - j;
    }
    if (g(k))
    {
      k = Character.codePointBefore(paramCharSequence, n);
      n -= Character.charCount(k);
      while ((n > 0) && (g(k)))
      {
        k = Character.codePointBefore(paramCharSequence, n);
        n -= Character.charCount(k);
        j++;
      }
      n = m;
      if (j % 2 == 0) {
        n = m + 2;
      }
      return paramInt - n;
    }
    if (k == 8419)
    {
      k = Character.codePointBefore(paramCharSequence, n);
      j = n - Character.charCount(k);
      if ((j > 0) && (i(k)))
      {
        n = Character.codePointBefore(paramCharSequence, j);
        j = m;
        if (f(n)) {
          j = m + (Character.charCount(k) + Character.charCount(n));
        }
      }
      else
      {
        j = m;
        if (f(k)) {
          j = m + Character.charCount(k);
        }
      }
      return paramInt - j;
    }
    int i1 = k;
    int i2 = m;
    j = n;
    if (k == 917631)
    {
      j = n;
      for (;;)
      {
        i1 = Character.codePointBefore(paramCharSequence, j);
        j -= Character.charCount(i1);
        if ((j <= 0) || (!h(i1))) {
          break;
        }
        m += Character.charCount(i1);
      }
      if (!c(i1)) {
        return paramInt - 2;
      }
      i2 = m + Character.charCount(i1);
    }
    k = i1;
    m = i2;
    n = j;
    if (i(i1))
    {
      k = Character.codePointBefore(paramCharSequence, j);
      if (!c(k)) {
        return paramInt - i2;
      }
      m = i2 + Character.charCount(k);
      n = j - m;
    }
    int i3 = m;
    if (c(k))
    {
      i1 = 0;
      i2 = i1;
      j = n;
      i3 = m;
      do
      {
        m = i3;
        n = i1;
        if (i1 != 0)
        {
          m = i3 + (Character.charCount(k) + i2 + 1);
          n = 0;
        }
        if (d(k))
        {
          k = Character.codePointBefore(paramCharSequence, j);
          i2 = j - Character.charCount(k);
          n = i;
          j = k;
          if (i2 > 0)
          {
            n = i;
            j = k;
            if (i(k))
            {
              j = Character.codePointBefore(paramCharSequence, i2);
              if (!c(j)) {
                return paramInt - m;
              }
              n = Character.charCount(j);
              Character.charCount(j);
            }
          }
          i3 = m;
          if (!e(j)) {
            break;
          }
          i3 = m + (n + Character.charCount(j));
          break;
        }
        i3 = j;
        if (j > 0)
        {
          i2 = Character.codePointBefore(paramCharSequence, j);
          j -= Character.charCount(i2);
          k = i2;
          i3 = j;
          if (i2 == 8205)
          {
            n = Character.codePointBefore(paramCharSequence, j);
            j -= Character.charCount(n);
            if ((j > 0) && (i(n)))
            {
              n = Character.codePointBefore(paramCharSequence, j);
              i2 = Character.charCount(n);
              j -= Character.charCount(n);
            }
            for (;;)
            {
              i1 = 1;
              break;
              i2 = 0;
            }
          }
        }
        i2 = 0;
        i1 = n;
        j = i3;
        n = k;
        if (j == 0)
        {
          i3 = m;
          break;
        }
        i3 = m;
        if (i1 == 0) {
          break;
        }
        k = n;
        i3 = m;
      } while (c(n));
      i3 = m;
    }
    return paramInt - i3;
  }
  
  public boolean c(int paramInt)
  {
    return a.isCodePointEmoji(paramInt);
  }
  
  public boolean d(int paramInt)
  {
    return a.isCodePointEmojiModifier(paramInt);
  }
  
  public boolean e(int paramInt)
  {
    return a.isCodePointEmojiModifierBase(paramInt);
  }
  
  public boolean f(int paramInt)
  {
    boolean bool;
    if (((48 > paramInt) || (paramInt > 57)) && (paramInt != 35) && (paramInt != 42)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean g(int paramInt)
  {
    return a.isCodePointRegionalIndicator(paramInt);
  }
  
  public boolean h(int paramInt)
  {
    boolean bool;
    if ((917536 <= paramInt) && (paramInt <= 917630)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i(int paramInt)
  {
    return a.isCodePointVariantSelector(paramInt);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */