package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import l6.c;
import l6.d;

public abstract class h
{
  public static final f c(Matcher paramMatcher, CharSequence paramCharSequence)
  {
    if (!paramMatcher.matches()) {
      paramMatcher = null;
    } else {
      paramMatcher = new g(paramMatcher, paramCharSequence);
    }
    return paramMatcher;
  }
  
  public static final c d(MatchResult paramMatchResult, int paramInt)
  {
    return d.g(paramMatchResult.start(paramInt), paramMatchResult.end(paramInt));
  }
}

/* Location:
 * Qualified Name:     kotlin.text.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */