package androidx.core.text;

import java.nio.CharBuffer;

abstract class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
  implements TextDirectionHeuristicCompat
{
  private final TextDirectionHeuristicsCompat.TextDirectionAlgorithm mAlgorithm;
  
  public TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat.TextDirectionAlgorithm paramTextDirectionAlgorithm)
  {
    mAlgorithm = paramTextDirectionAlgorithm;
  }
  
  private boolean doCheck(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramInt1 = mAlgorithm.checkRtl(paramCharSequence, paramInt1, paramInt2);
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1) {
        return defaultIsRtl();
      }
      return false;
    }
    return true;
  }
  
  public abstract boolean defaultIsRtl();
  
  public boolean isRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence != null) && (paramInt1 >= 0) && (paramInt2 >= 0) && (paramCharSequence.length() - paramInt2 >= paramInt1))
    {
      if (mAlgorithm == null) {
        return defaultIsRtl();
      }
      return doCheck(paramCharSequence, paramInt1, paramInt2);
    }
    throw new IllegalArgumentException();
  }
  
  public boolean isRtl(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    return isRtl(CharBuffer.wrap(paramArrayOfChar), paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */