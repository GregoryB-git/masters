package androidx.core.text;

class BidiFormatter$DirectionalityEstimator
{
  private static final byte[] DIR_TYPE_CACHE = new byte['܀'];
  private static final int DIR_TYPE_CACHE_SIZE = 1792;
  private int charIndex;
  private final boolean isHtml;
  private char lastChar;
  private final int length;
  private final CharSequence text;
  
  static
  {
    for (int i = 0; i < 1792; i++) {
      DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
    }
  }
  
  public BidiFormatter$DirectionalityEstimator(CharSequence paramCharSequence, boolean paramBoolean)
  {
    text = paramCharSequence;
    isHtml = paramBoolean;
    length = paramCharSequence.length();
  }
  
  private static byte getCachedDirectionality(char paramChar)
  {
    byte b1;
    byte b2;
    if (paramChar < '܀')
    {
      b1 = DIR_TYPE_CACHE[paramChar];
      b2 = b1;
    }
    else
    {
      b1 = Character.getDirectionality(paramChar);
      b2 = b1;
    }
    return b2;
  }
  
  private byte skipEntityBackward()
  {
    int i = charIndex;
    int j;
    do
    {
      j = charIndex;
      if (j <= 0) {
        break;
      }
      CharSequence localCharSequence = text;
      j--;
      charIndex = j;
      j = localCharSequence.charAt(j);
      lastChar = ((char)j);
      if (j == 38) {
        return 12;
      }
    } while (j != 59);
    charIndex = i;
    lastChar = ((char)59);
    return 13;
  }
  
  private byte skipEntityForward()
  {
    int i;
    do
    {
      i = charIndex;
      if (i >= length) {
        break;
      }
      CharSequence localCharSequence = text;
      charIndex = (i + 1);
      i = localCharSequence.charAt(i);
      lastChar = ((char)i);
    } while (i != 59);
    return 12;
  }
  
  private byte skipTagBackward()
  {
    int i = charIndex;
    int j;
    CharSequence localCharSequence;
    do
    {
      j = charIndex;
      if (j <= 0) {
        break;
      }
      localCharSequence = text;
      j--;
      charIndex = j;
      j = localCharSequence.charAt(j);
      lastChar = ((char)j);
      if (j == 60) {
        return 12;
      }
      if (j == 62) {
        break;
      }
    } while ((j != 34) && (j != 39));
    for (;;)
    {
      int k = charIndex;
      if (k <= 0) {
        break;
      }
      localCharSequence = text;
      k--;
      charIndex = k;
      k = localCharSequence.charAt(k);
      lastChar = ((char)k);
      if (k == j) {
        break;
      }
    }
    charIndex = i;
    lastChar = ((char)62);
    return 13;
  }
  
  private byte skipTagForward()
  {
    int i = charIndex;
    int j;
    CharSequence localCharSequence;
    do
    {
      j = charIndex;
      if (j >= length) {
        break;
      }
      localCharSequence = text;
      charIndex = (j + 1);
      j = localCharSequence.charAt(j);
      lastChar = ((char)j);
      if (j == 62) {
        return 12;
      }
    } while ((j != 34) && (j != 39));
    for (;;)
    {
      int k = charIndex;
      if (k >= length) {
        break;
      }
      localCharSequence = text;
      charIndex = (k + 1);
      k = localCharSequence.charAt(k);
      lastChar = ((char)k);
      if (k == j) {
        break;
      }
    }
    charIndex = i;
    lastChar = ((char)60);
    return 13;
  }
  
  public byte dirTypeBackward()
  {
    char c = text.charAt(charIndex - 1);
    lastChar = c;
    if (Character.isLowSurrogate(c))
    {
      i = Character.codePointBefore(text, charIndex);
      charIndex -= Character.charCount(i);
      return Character.getDirectionality(i);
    }
    charIndex -= 1;
    int i = getCachedDirectionality(lastChar);
    int j = i;
    if (isHtml)
    {
      int k = lastChar;
      if (k == 62)
      {
        i = skipTagBackward();
        j = i;
      }
      else
      {
        j = i;
        if (k == 59)
        {
          i = skipEntityBackward();
          j = i;
        }
      }
    }
    return j;
  }
  
  public byte dirTypeForward()
  {
    char c = text.charAt(charIndex);
    lastChar = c;
    int i;
    if (Character.isHighSurrogate(c))
    {
      i = Character.codePointAt(text, charIndex);
      j = charIndex;
      charIndex = (Character.charCount(i) + j);
      return Character.getDirectionality(i);
    }
    charIndex += 1;
    int j = getCachedDirectionality(lastChar);
    int k = j;
    if (isHtml)
    {
      i = lastChar;
      if (i == 60)
      {
        i = skipTagForward();
        k = i;
      }
      else
      {
        k = j;
        if (i == 38)
        {
          i = skipEntityForward();
          k = i;
        }
      }
    }
    return k;
  }
  
  public int getEntryDir()
  {
    charIndex = 0;
    int i = 0;
    int j = i;
    int k = j;
    while ((charIndex < length) && (i == 0))
    {
      int m = dirTypeForward();
      if (m != 0)
      {
        if ((m != 1) && (m != 2))
        {
          if (m == 9) {}
        }
        else {
          switch (m)
          {
          default: 
            break;
          case 18: 
            k--;
            j = 0;
            break;
          case 16: 
          case 17: 
            k++;
            j = 1;
            break;
          case 14: 
          case 15: 
            k++;
            j = -1;
            continue;
            if (k != 0) {
              break label131;
            }
            return 1;
          }
        }
      }
      else
      {
        if (k == 0) {
          return -1;
        }
        label131:
        i = k;
      }
    }
    if (i == 0) {
      return 0;
    }
    if (j != 0) {
      return j;
    }
    while (charIndex > 0) {
      switch (dirTypeBackward())
      {
      default: 
        break;
      case 18: 
        k++;
        break;
      case 16: 
      case 17: 
        if (i == k) {
          return 1;
        }
      case 14: 
      case 15: 
        if (i == k) {
          return -1;
        }
        k--;
      }
    }
    return 0;
  }
  
  public int getExitDir()
  {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a5\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:31)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.Ir2JRegAssignTransformer.transform(Ir2JRegAssignTransformer.java:182)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:167)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:442)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:40)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:132)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:575)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:434)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:450)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:175)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:275)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:112)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:290)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:33)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:89)\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:27)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:31)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.BidiFormatter.DirectionalityEstimator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */