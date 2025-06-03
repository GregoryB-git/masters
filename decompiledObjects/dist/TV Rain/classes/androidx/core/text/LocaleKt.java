package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\003\"\026\020\000\032\0020\001*\0020\0028Ç\002¢\006\006\032\004\b\003\020\004¨\006\005"}, d2={"layoutDirection", "", "Ljava/util/Locale;", "getLayoutDirection", "(Ljava/util/Locale;)I", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class LocaleKt
{
  @RequiresApi(17)
  public static final int getLayoutDirection(@NotNull Locale paramLocale)
  {
    Intrinsics.checkNotNullParameter(paramLocale, "<this>");
    return TextUtils.getLayoutDirectionFromLocale(paramLocale);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.LocaleKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */