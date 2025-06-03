package androidx.window.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Version$Companion
{
  @NotNull
  public final Version getCURRENT()
  {
    return Version.access$getCURRENT$cp();
  }
  
  @NotNull
  public final Version getUNKNOWN()
  {
    return Version.access$getUNKNOWN$cp();
  }
  
  @NotNull
  public final Version getVERSION_0_1()
  {
    return Version.access$getVERSION_0_1$cp();
  }
  
  @NotNull
  public final Version getVERSION_1_0()
  {
    return Version.access$getVERSION_1_0$cp();
  }
  
  public final Version parse(String paramString)
  {
    if ((paramString != null) && (!i.F(paramString)))
    {
      Matcher localMatcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(paramString);
      if (!localMatcher.matches()) {
        return null;
      }
      paramString = localMatcher.group(1);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = Integer.valueOf(Integer.parseInt(paramString));
      }
      if (paramString == null) {
        return null;
      }
      int i = paramString.intValue();
      paramString = localMatcher.group(2);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = Integer.valueOf(Integer.parseInt(paramString));
      }
      if (paramString == null) {
        return null;
      }
      int j = paramString.intValue();
      paramString = localMatcher.group(3);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = Integer.valueOf(Integer.parseInt(paramString));
      }
      if (paramString == null) {
        return null;
      }
      int k = paramString.intValue();
      if (localMatcher.group(4) != null) {}
      for (paramString = localMatcher.group(4);; paramString = "") {
        break;
      }
      Intrinsics.checkNotNullExpressionValue(paramString, "description");
      return new Version(i, j, k, paramString, null);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.window.core.Version.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */