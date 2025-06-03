package kotlin.text;

import W5.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6.d;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Regex
  implements Serializable
{
  public static final a p = new a(null);
  public final Pattern o;
  
  public Regex(@NotNull String paramString)
  {
    this(paramString);
  }
  
  public Regex(Pattern paramPattern)
  {
    o = paramPattern;
  }
  
  private final Object writeReplace()
  {
    String str = o.pattern();
    Intrinsics.checkNotNullExpressionValue(str, "pattern(...)");
    return new b(str, o.flags());
  }
  
  public final f a(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Matcher localMatcher = o.matcher(paramCharSequence);
    Intrinsics.checkNotNullExpressionValue(localMatcher, "matcher(...)");
    return h.a(localMatcher, paramCharSequence);
  }
  
  public final boolean b(CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    return o.matcher(paramCharSequence).matches();
  }
  
  public final List c(CharSequence paramCharSequence, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    s.S(paramInt);
    Matcher localMatcher = o.matcher(paramCharSequence);
    if ((paramInt != 1) && (localMatcher.find()))
    {
      int i = 10;
      if (paramInt > 0) {
        i = d.b(paramInt, 10);
      }
      ArrayList localArrayList = new ArrayList(i);
      int j = paramInt - 1;
      paramInt = 0;
      do
      {
        localArrayList.add(paramCharSequence.subSequence(paramInt, localMatcher.start()).toString());
        i = localMatcher.end();
        if ((j >= 0) && (localArrayList.size() == j)) {
          break;
        }
        paramInt = i;
      } while (localMatcher.find());
      localArrayList.add(paramCharSequence.subSequence(i, paramCharSequence.length()).toString());
      return localArrayList;
    }
    return m.b(paramCharSequence.toString());
  }
  
  @NotNull
  public final String replace(@NotNull CharSequence paramCharSequence, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Intrinsics.checkNotNullParameter(paramString, "replacement");
    paramCharSequence = o.matcher(paramCharSequence).replaceAll(paramString);
    Intrinsics.checkNotNullExpressionValue(paramCharSequence, "replaceAll(...)");
    return paramCharSequence;
  }
  
  public String toString()
  {
    String str = o.toString();
    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
    return str;
  }
  
  public static final class a {}
  
  public static final class b
    implements Serializable
  {
    public static final a q = new a(null);
    private static final long serialVersionUID = 0L;
    public final String o;
    public final int p;
    
    public b(String paramString, int paramInt)
    {
      o = paramString;
      p = paramInt;
    }
    
    private final Object readResolve()
    {
      Pattern localPattern = Pattern.compile(o, p);
      Intrinsics.checkNotNullExpressionValue(localPattern, "compile(...)");
      return new Regex(localPattern);
    }
    
    public static final class a {}
  }
}

/* Location:
 * Qualified Name:     kotlin.text.Regex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */