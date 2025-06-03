package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(33)
class ParcelCompat$TiramisuImpl
{
  @DoNotInline
  public static <T> T[] readArray(Parcel paramParcel, ClassLoader paramClassLoader, Class<T> paramClass)
  {
    return paramParcel.readArray(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T> ArrayList<T> readArrayList(Parcel paramParcel, ClassLoader paramClassLoader, Class<? extends T> paramClass)
  {
    return paramParcel.readArrayList(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <V, K> HashMap<K, V> readHashMap(Parcel paramParcel, ClassLoader paramClassLoader, Class<? extends K> paramClass, Class<? extends V> paramClass1)
  {
    return paramParcel.readHashMap(paramClassLoader, paramClass, paramClass1);
  }
  
  @DoNotInline
  public static <T> void readList(@NonNull Parcel paramParcel, @NonNull List<? super T> paramList, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    paramParcel.readList(paramList, paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <K, V> void readMap(Parcel paramParcel, Map<? super K, ? super V> paramMap, ClassLoader paramClassLoader, Class<K> paramClass, Class<V> paramClass1)
  {
    paramParcel.readMap(paramMap, paramClassLoader, paramClass, paramClass1);
  }
  
  @DoNotInline
  public static <T extends Parcelable> T readParcelable(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    return (Parcelable)paramParcel.readParcelable(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T> T[] readParcelableArray(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    return paramParcel.readParcelableArray(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T> Parcelable.Creator<T> readParcelableCreator(Parcel paramParcel, ClassLoader paramClassLoader, Class<T> paramClass)
  {
    return paramParcel.readParcelableCreator(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T> List<T> readParcelableList(@NonNull Parcel paramParcel, @NonNull List<T> paramList, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    return paramParcel.readParcelableList(paramList, paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T extends Serializable> T readSerializable(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    return (Serializable)paramParcel.readSerializable(paramClassLoader, paramClass);
  }
  
  @DoNotInline
  public static <T> SparseArray<T> readSparseArray(Parcel paramParcel, ClassLoader paramClassLoader, Class<? extends T> paramClass)
  {
    return paramParcel.readSparseArray(paramClassLoader, paramClass);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ParcelCompat.TiramisuImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */