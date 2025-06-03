package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

class FlutterTextUtils
{
  public static final int CANCEL_TAG = 917631;
  public static final int CARRIAGE_RETURN = 13;
  public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
  public static final int LINE_FEED = 10;
  public static final int ZERO_WIDTH_JOINER = 8205;
  private final FlutterJNI flutterJNI;
  
  public FlutterTextUtils(FlutterJNI paramFlutterJNI)
  {
    flutterJNI = paramFlutterJNI;
  }
  
  public int getOffsetAfter(CharSequence paramCharSequence, int paramInt)
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
    if (isRegionalIndicatorSymbol(k))
    {
      if ((n < j) && (isRegionalIndicatorSymbol(Character.codePointAt(paramCharSequence, n))))
      {
        k = paramInt;
        while ((k > 0) && (isRegionalIndicatorSymbol(Character.codePointBefore(paramCharSequence, paramInt))))
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
    if (isKeycapBase(k)) {
      i1 = m + Character.charCount(k);
    }
    if (k == 8419)
    {
      k = Character.codePointBefore(paramCharSequence, n);
      m = Character.charCount(k) + n;
      if ((m < i) && (isVariationSelector(k)))
      {
        j = Character.codePointAt(paramCharSequence, m);
        m = i1;
        if (isKeycapBase(j))
        {
          m = Character.charCount(k);
          m = Character.charCount(j) + m + i1;
        }
      }
      else
      {
        m = i1;
        if (isKeycapBase(k)) {
          m = i1 + Character.charCount(k);
        }
      }
      return paramInt + m;
    }
    j = i1;
    if (isEmoji(k))
    {
      int i2 = 0;
      int i3 = i2;
      m = n;
      n = i1;
      j = k;
      label664:
      do
      {
        i1 = n;
        k = i2;
        if (i2 != 0)
        {
          i1 = Character.charCount(j) + i3 + 1 + n;
          k = 0;
        }
        if (isEmojiModifier(j))
        {
          j = i1;
          break;
        }
        n = m;
        if (m < i)
        {
          j = Character.codePointAt(paramCharSequence, m);
          n = Character.charCount(j) + m;
          if (j == 8419)
          {
            k = Character.codePointBefore(paramCharSequence, n);
            m = Character.charCount(k) + n;
            if ((m < i) && (isVariationSelector(k)))
            {
              j = Character.codePointAt(paramCharSequence, m);
              m = i1;
              if (isKeycapBase(j))
              {
                m = Character.charCount(k);
                m = Character.charCount(j) + m + i1;
              }
            }
            else
            {
              m = i1;
              if (isKeycapBase(k)) {
                m = i1 + Character.charCount(k);
              }
            }
            return paramInt + m;
          }
          if (isEmojiModifier(j)) {}
          while (isVariationSelector(j))
          {
            j = i1 + (Character.charCount(j) + 0);
            break;
          }
          if (j == 8205)
          {
            k = Character.codePointAt(paramCharSequence, n);
            m = Character.charCount(k) + n;
            if ((m < i) && (isVariationSelector(k)))
            {
              k = Character.codePointAt(paramCharSequence, m);
              i3 = Character.charCount(k);
              m = Character.charCount(k) + m;
            }
            else
            {
              i3 = 0;
            }
            i2 = 1;
            break label664;
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
      } while (isEmoji(k));
      j = i1;
    }
    return paramInt + j;
  }
  
  public int getOffsetBefore(CharSequence paramCharSequence, int paramInt)
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
    if (isRegionalIndicatorSymbol(k))
    {
      k = Character.codePointBefore(paramCharSequence, n);
      n -= Character.charCount(k);
      while ((n > 0) && (isRegionalIndicatorSymbol(k)))
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
      if ((j > 0) && (isVariationSelector(k)))
      {
        n = Character.codePointBefore(paramCharSequence, j);
        j = m;
        if (isKeycapBase(n))
        {
          j = Character.charCount(k);
          j = Character.charCount(n) + j + m;
        }
      }
      else
      {
        j = m;
        if (isKeycapBase(k)) {
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
        if ((j <= 0) || (!isTagSpecChar(i1))) {
          break;
        }
        m += Character.charCount(i1);
      }
      if (!isEmoji(i1)) {
        return paramInt - 2;
      }
      i2 = m + Character.charCount(i1);
    }
    k = i1;
    m = i2;
    n = j;
    if (isVariationSelector(i1))
    {
      k = Character.codePointBefore(paramCharSequence, j);
      if (!isEmoji(k)) {
        return paramInt - i2;
      }
      m = i2 + Character.charCount(k);
      n = j - m;
    }
    int i3 = m;
    if (isEmoji(k))
    {
      i1 = 0;
      i2 = i1;
      j = n;
      i3 = m;
      label727:
      do
      {
        m = i3;
        n = i1;
        if (i1 != 0)
        {
          m = Character.charCount(k) + i2 + 1 + i3;
          n = 0;
        }
        if (isEmojiModifier(k))
        {
          k = Character.codePointBefore(paramCharSequence, j);
          i2 = j - Character.charCount(k);
          n = i;
          j = k;
          if (i2 > 0)
          {
            n = i;
            j = k;
            if (isVariationSelector(k))
            {
              j = Character.codePointBefore(paramCharSequence, i2);
              if (!isEmoji(j)) {
                return paramInt - m;
              }
              n = Character.charCount(j);
              Character.charCount(j);
            }
          }
          i3 = m;
          if (!isEmojiModifierBase(j)) {
            break;
          }
          i3 = m + (Character.charCount(j) + n);
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
            if ((j > 0) && (isVariationSelector(n)))
            {
              n = Character.codePointBefore(paramCharSequence, j);
              i2 = Character.charCount(n);
              j -= Character.charCount(n);
            }
            else
            {
              i2 = 0;
            }
            i1 = 1;
            break label727;
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
      } while (isEmoji(n));
      i3 = m;
    }
    return paramInt - i3;
  }
  
  public boolean isEmoji(int paramInt)
  {
    return flutterJNI.isCodePointEmoji(paramInt);
  }
  
  public boolean isEmojiModifier(int paramInt)
  {
    return flutterJNI.isCodePointEmojiModifier(paramInt);
  }
  
  public boolean isEmojiModifierBase(int paramInt)
  {
    return flutterJNI.isCodePointEmojiModifierBase(paramInt);
  }
  
  public boolean isKeycapBase(int paramInt)
  {
    boolean bool;
    if (((48 > paramInt) || (paramInt > 57)) && (paramInt != 35) && (paramInt != 42)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isRegionalIndicatorSymbol(int paramInt)
  {
    return flutterJNI.isCodePointRegionalIndicator(paramInt);
  }
  
  public boolean isTagSpecChar(int paramInt)
  {
    boolean bool;
    if ((917536 <= paramInt) && (paramInt <= 917630)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isVariationSelector(int paramInt)
  {
    return flutterJNI.isCodePointVariantSelector(paramInt);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.FlutterTextUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */