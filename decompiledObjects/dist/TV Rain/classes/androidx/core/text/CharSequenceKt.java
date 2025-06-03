package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\022\n\000\n\002\020\013\n\002\020\r\n\000\n\002\020\b\n\000\032\r\020\000\032\0020\001*\0020\002H\b\032\r\020\003\032\0020\004*\0020\002H\b¨\006\005"}, d2={"isDigitsOnly", "", "", "trimmedLength", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class CharSequenceKt
{
  public static final boolean isDigitsOnly(@NotNull CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return TextUtils.isDigitsOnly(paramCharSequence);
  }
  
  public static final int trimmedLength(@NotNull CharSequence paramCharSequence)
  {
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return TextUtils.getTrimmedLength(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.CharSequenceKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */