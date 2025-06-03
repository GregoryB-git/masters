package androidx.core.os;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\034\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\020\016\n\002\020\000\n\002\b\002\032\006\020\000\032\0020\001\032;\020\000\032\0020\0012.\020\002\032\030\022\024\b\001\022\020\022\004\022\0020\005\022\006\022\004\030\0010\0060\0040\003\"\020\022\004\022\0020\005\022\006\022\004\030\0010\0060\004¢\006\002\020\007¨\006\b"}, d2={"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class BundleKt
{
  @NotNull
  public static final Bundle bundleOf()
  {
    return new Bundle(0);
  }
  
  @NotNull
  public static final Bundle bundleOf(@NotNull Pair<String, ? extends Object>... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    Object localObject1 = new Bundle(paramVarArgs.length);
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = paramVarArgs[j];
      String str = (String)((Pair)localObject2).component1();
      localObject2 = ((Pair)localObject2).component2();
      if (localObject2 == null)
      {
        ((BaseBundle)localObject1).putString(str, null);
      }
      else if ((localObject2 instanceof Boolean))
      {
        ((BaseBundle)localObject1).putBoolean(str, ((Boolean)localObject2).booleanValue());
      }
      else if ((localObject2 instanceof Byte))
      {
        ((Bundle)localObject1).putByte(str, ((Number)localObject2).byteValue());
      }
      else if ((localObject2 instanceof Character))
      {
        ((Bundle)localObject1).putChar(str, ((Character)localObject2).charValue());
      }
      else if ((localObject2 instanceof Double))
      {
        ((BaseBundle)localObject1).putDouble(str, ((Number)localObject2).doubleValue());
      }
      else if ((localObject2 instanceof Float))
      {
        ((Bundle)localObject1).putFloat(str, ((Number)localObject2).floatValue());
      }
      else if ((localObject2 instanceof Integer))
      {
        ((BaseBundle)localObject1).putInt(str, ((Number)localObject2).intValue());
      }
      else if ((localObject2 instanceof Long))
      {
        ((BaseBundle)localObject1).putLong(str, ((Number)localObject2).longValue());
      }
      else if ((localObject2 instanceof Short))
      {
        ((Bundle)localObject1).putShort(str, ((Number)localObject2).shortValue());
      }
      else if ((localObject2 instanceof Bundle))
      {
        ((Bundle)localObject1).putBundle(str, (Bundle)localObject2);
      }
      else if ((localObject2 instanceof CharSequence))
      {
        ((Bundle)localObject1).putCharSequence(str, (CharSequence)localObject2);
      }
      else if ((localObject2 instanceof Parcelable))
      {
        ((Bundle)localObject1).putParcelable(str, (Parcelable)localObject2);
      }
      else if ((localObject2 instanceof boolean[]))
      {
        ((BaseBundle)localObject1).putBooleanArray(str, (boolean[])localObject2);
      }
      else if ((localObject2 instanceof byte[]))
      {
        ((Bundle)localObject1).putByteArray(str, (byte[])localObject2);
      }
      else if ((localObject2 instanceof char[]))
      {
        ((Bundle)localObject1).putCharArray(str, (char[])localObject2);
      }
      else if ((localObject2 instanceof double[]))
      {
        ((BaseBundle)localObject1).putDoubleArray(str, (double[])localObject2);
      }
      else if ((localObject2 instanceof float[]))
      {
        ((Bundle)localObject1).putFloatArray(str, (float[])localObject2);
      }
      else if ((localObject2 instanceof int[]))
      {
        ((BaseBundle)localObject1).putIntArray(str, (int[])localObject2);
      }
      else if ((localObject2 instanceof long[]))
      {
        ((BaseBundle)localObject1).putLongArray(str, (long[])localObject2);
      }
      else if ((localObject2 instanceof short[]))
      {
        ((Bundle)localObject1).putShortArray(str, (short[])localObject2);
      }
      else if ((localObject2 instanceof Object[]))
      {
        Class localClass = localObject2.getClass().getComponentType();
        Intrinsics.checkNotNull(localClass);
        if (Parcelable.class.isAssignableFrom(localClass))
        {
          Intrinsics.checkNotNull(localObject2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
          ((Bundle)localObject1).putParcelableArray(str, (Parcelable[])localObject2);
        }
        else if (String.class.isAssignableFrom(localClass))
        {
          Intrinsics.checkNotNull(localObject2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
          ((BaseBundle)localObject1).putStringArray(str, (String[])localObject2);
        }
        else if (CharSequence.class.isAssignableFrom(localClass))
        {
          Intrinsics.checkNotNull(localObject2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
          ((Bundle)localObject1).putCharSequenceArray(str, (CharSequence[])localObject2);
        }
        else if (Serializable.class.isAssignableFrom(localClass))
        {
          ((Bundle)localObject1).putSerializable(str, (Serializable)localObject2);
        }
        else
        {
          localObject1 = localClass.getCanonicalName();
          paramVarArgs = new StringBuilder();
          paramVarArgs.append("Illegal value array type ");
          paramVarArgs.append((String)localObject1);
          paramVarArgs.append(" for key \"");
          paramVarArgs.append(str);
          paramVarArgs.append('"');
          throw new IllegalArgumentException(paramVarArgs.toString());
        }
      }
      else if ((localObject2 instanceof Serializable))
      {
        ((Bundle)localObject1).putSerializable(str, (Serializable)localObject2);
      }
      else if ((localObject2 instanceof IBinder))
      {
        BundleApi18ImplKt.putBinder((Bundle)localObject1, str, (IBinder)localObject2);
      }
      else if ((localObject2 instanceof Size))
      {
        BundleApi21ImplKt.putSize((Bundle)localObject1, str, (Size)localObject2);
      }
      else
      {
        if (!(localObject2 instanceof SizeF)) {
          break label798;
        }
        BundleApi21ImplKt.putSizeF((Bundle)localObject1, str, (SizeF)localObject2);
      }
      j++;
      continue;
      label798:
      localObject1 = localObject2.getClass().getCanonicalName();
      paramVarArgs = new StringBuilder();
      paramVarArgs.append("Illegal value type ");
      paramVarArgs.append((String)localObject1);
      paramVarArgs.append(" for key \"");
      paramVarArgs.append(str);
      paramVarArgs.append('"');
      throw new IllegalArgumentException(paramVarArgs.toString());
    }
    return (Bundle)localObject1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.BundleKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */