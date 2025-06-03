package androidx.core.text;

class TextDirectionHeuristicsCompat$AnyStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
  private final boolean mLookForRtl;
  
  private TextDirectionHeuristicsCompat$AnyStrong(boolean paramBoolean)
  {
    mLookForRtl = paramBoolean;
  }
  
  public int checkRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = paramInt1; j < paramInt2 + paramInt1; j++)
    {
      int k = TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(paramCharSequence.charAt(j)));
      if (k != 0)
      {
        if (k != 1) {
          continue;
        }
        if (!mLookForRtl) {
          return 1;
        }
      }
      else if (mLookForRtl)
      {
        return 0;
      }
      i = 1;
    }
    if (i != 0) {
      return mLookForRtl;
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */