package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(30)
class ParcelCompat$Api30Impl
{
  @DoNotInline
  public static final Parcelable.Creator<?> readParcelableCreator(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
  {
    return d.f(paramParcel, paramClassLoader);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ParcelCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */