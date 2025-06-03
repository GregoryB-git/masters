package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\b\n\000\n\002\020\016\n\000\032\r\020\000\032\0020\001*\0020\001H\b¨\006\002"}, d2={"htmlEncode", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class StringKt
{
  @NotNull
  public static final String htmlEncode(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    paramString = TextUtils.htmlEncode(paramString);
    Intrinsics.checkNotNullExpressionValue(paramString, "htmlEncode(this)");
    return paramString;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.StringKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */