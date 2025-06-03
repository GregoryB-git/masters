package androidx.core.text;

class TextDirectionHeuristicsCompat$FirstStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final FirstStrong INSTANCE = new FirstStrong();
  
  public int checkRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 2;
    for (int j = paramInt1; (j < paramInt2 + paramInt1) && (i == 2); j++) {
      i = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(paramCharSequence.charAt(j)));
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */