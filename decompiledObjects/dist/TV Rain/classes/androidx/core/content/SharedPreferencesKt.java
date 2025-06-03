package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000 \n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\0323\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\0010\006¢\006\002\b\bH\bø\001\000\002\007\n\005\b20\001¨\006\t"}, d2={"edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class SharedPreferencesKt
{
  @SuppressLint({"ApplySharedPref"})
  public static final void edit(@NotNull SharedPreferences paramSharedPreferences, boolean paramBoolean, @NotNull Function1<? super SharedPreferences.Editor, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramSharedPreferences, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramSharedPreferences = paramSharedPreferences.edit();
    Intrinsics.checkNotNullExpressionValue(paramSharedPreferences, "editor");
    paramFunction1.invoke(paramSharedPreferences);
    if (paramBoolean) {
      paramSharedPreferences.commit();
    } else {
      paramSharedPreferences.apply();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.SharedPreferencesKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */