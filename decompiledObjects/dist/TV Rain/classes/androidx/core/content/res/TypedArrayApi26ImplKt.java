package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3;

@Metadata(d1={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\bÃ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\001\020\007\032\0020\bH\007¨\006\t"}, d2={"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "()V", "getFont", "Landroid/graphics/Typeface;", "typedArray", "Landroid/content/res/TypedArray;", "index", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(26)
final class TypedArrayApi26ImplKt
{
  @NotNull
  public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();
  
  @JvmStatic
  @DoNotInline
  @NotNull
  public static final Typeface getFont(@NotNull TypedArray paramTypedArray, @StyleableRes int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramTypedArray, "typedArray");
    paramTypedArray = p3.e(paramTypedArray, paramInt);
    Intrinsics.checkNotNull(paramTypedArray);
    return paramTypedArray;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.TypedArrayApi26ImplKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */