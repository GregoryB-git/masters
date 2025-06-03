package androidx.core.text;

import java.util.Locale;

class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale
  extends TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
{
  public static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();
  
  public TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()
  {
    super(null);
  }
  
  public boolean defaultIsRtl()
  {
    int i = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault());
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */