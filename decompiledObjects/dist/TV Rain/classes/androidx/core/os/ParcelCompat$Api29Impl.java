package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import o3;

@RequiresApi(29)
class ParcelCompat$Api29Impl
{
  @DoNotInline
  public static final <T extends Parcelable> List<T> readParcelableList(@NonNull Parcel paramParcel, @NonNull List<T> paramList, @Nullable ClassLoader paramClassLoader)
  {
    return o3.j(paramParcel, paramList, paramClassLoader);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ParcelCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */