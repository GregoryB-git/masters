package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÃ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\"\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\007J\"\020\013\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\fH\007¨\006\r"}, d2={"Landroidx/core/os/BundleApi21ImplKt;", "", "()V", "putSize", "", "bundle", "Landroid/os/Bundle;", "key", "", "value", "Landroid/util/Size;", "putSizeF", "Landroid/util/SizeF;", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(21)
final class BundleApi21ImplKt
{
  @NotNull
  public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();
  
  @JvmStatic
  @DoNotInline
  public static final void putSize(@NotNull Bundle paramBundle, @NotNull String paramString, @Nullable Size paramSize)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    paramBundle.putSize(paramString, paramSize);
  }
  
  @JvmStatic
  @DoNotInline
  public static final void putSizeF(@NotNull Bundle paramBundle, @NotNull String paramString, @Nullable SizeF paramSizeF)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    paramBundle.putSizeF(paramString, paramSizeF);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.BundleApi21ImplKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */