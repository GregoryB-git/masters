package androidx.core.text;

class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
  extends TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
{
  private final boolean mDefaultIsRtl;
  
  public TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat.TextDirectionAlgorithm paramTextDirectionAlgorithm, boolean paramBoolean)
  {
    super(paramTextDirectionAlgorithm);
    mDefaultIsRtl = paramBoolean;
  }
  
  public boolean defaultIsRtl()
  {
    return mDefaultIsRtl;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */