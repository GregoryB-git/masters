package androidx.core.os;

import android.os.BaseBundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\bÃ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007J$\020\007\032\0020\b2\006\020\t\032\0020\0042\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\001H\007¨\006\r"}, d2={"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(21)
final class PersistableBundleApi21ImplKt
{
  @NotNull
  public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();
  
  @JvmStatic
  @DoNotInline
  @NotNull
  public static final PersistableBundle createPersistableBundle(int paramInt)
  {
    return new PersistableBundle(paramInt);
  }
  
  @JvmStatic
  @DoNotInline
  public static final void putValue(@NotNull PersistableBundle paramPersistableBundle, @Nullable String paramString, @Nullable Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramPersistableBundle, "persistableBundle");
    Class localClass;
    if (paramObject == null)
    {
      paramPersistableBundle.putString(paramString, null);
    }
    else if ((paramObject instanceof Boolean))
    {
      PersistableBundleApi22ImplKt.putBoolean(paramPersistableBundle, paramString, ((Boolean)paramObject).booleanValue());
    }
    else if ((paramObject instanceof Double))
    {
      paramPersistableBundle.putDouble(paramString, ((Number)paramObject).doubleValue());
    }
    else if ((paramObject instanceof Integer))
    {
      paramPersistableBundle.putInt(paramString, ((Number)paramObject).intValue());
    }
    else if ((paramObject instanceof Long))
    {
      paramPersistableBundle.putLong(paramString, ((Number)paramObject).longValue());
    }
    else if ((paramObject instanceof String))
    {
      paramPersistableBundle.putString(paramString, (String)paramObject);
    }
    else if ((paramObject instanceof boolean[]))
    {
      PersistableBundleApi22ImplKt.putBooleanArray(paramPersistableBundle, paramString, (boolean[])paramObject);
    }
    else if ((paramObject instanceof double[]))
    {
      paramPersistableBundle.putDoubleArray(paramString, (double[])paramObject);
    }
    else if ((paramObject instanceof int[]))
    {
      paramPersistableBundle.putIntArray(paramString, (int[])paramObject);
    }
    else if ((paramObject instanceof long[]))
    {
      paramPersistableBundle.putLongArray(paramString, (long[])paramObject);
    }
    else
    {
      if (!(paramObject instanceof Object[])) {
        break label304;
      }
      localClass = paramObject.getClass().getComponentType();
      Intrinsics.checkNotNull(localClass);
      if (!String.class.isAssignableFrom(localClass)) {
        break label246;
      }
      Intrinsics.checkNotNull(paramObject, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
      paramPersistableBundle.putStringArray(paramString, (String[])paramObject);
    }
    return;
    label246:
    paramPersistableBundle = localClass.getCanonicalName();
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Illegal value array type ");
    ((StringBuilder)paramObject).append(paramPersistableBundle);
    ((StringBuilder)paramObject).append(" for key \"");
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append('"');
    throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    label304:
    paramPersistableBundle = paramObject.getClass().getCanonicalName();
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Illegal value type ");
    ((StringBuilder)paramObject).append(paramPersistableBundle);
    ((StringBuilder)paramObject).append(" for key \"");
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append('"');
    throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.PersistableBundleApi21ImplKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */