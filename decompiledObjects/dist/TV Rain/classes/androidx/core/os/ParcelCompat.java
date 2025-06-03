package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3;

public final class ParcelCompat
{
  @SuppressLint({"ArrayReturn", "NullableCollection"})
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T> T[] readArray(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readArray(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readArray(paramClassLoader);
  }
  
  @SuppressLint({"ConcreteCollection", "NullableCollection"})
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T> ArrayList<T> readArrayList(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<? extends T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readArrayList(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readArrayList(paramClassLoader);
  }
  
  public static boolean readBoolean(@NonNull Parcel paramParcel)
  {
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @SuppressLint({"ConcreteCollection", "NullableCollection"})
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <K, V> HashMap<K, V> readHashMap(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<? extends K> paramClass, @NonNull Class<? extends V> paramClass1)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readHashMap(paramParcel, paramClassLoader, paramClass, paramClass1);
    }
    return paramParcel.readHashMap(paramClassLoader);
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T> void readList(@NonNull Parcel paramParcel, @NonNull List<? super T> paramList, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      TiramisuImpl.readList(paramParcel, paramList, paramClassLoader, paramClass);
    } else {
      paramParcel.readList(paramList, paramClassLoader);
    }
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <K, V> void readMap(@NonNull Parcel paramParcel, @NonNull Map<? super K, ? super V> paramMap, @Nullable ClassLoader paramClassLoader, @NonNull Class<K> paramClass, @NonNull Class<V> paramClass1)
  {
    if (BuildCompat.isAtLeastT()) {
      TiramisuImpl.readMap(paramParcel, paramMap, paramClassLoader, paramClass, paramClass1);
    } else {
      paramParcel.readMap(paramMap, paramClassLoader);
    }
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T extends Parcelable> T readParcelable(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readParcelable(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readParcelable(paramClassLoader);
  }
  
  @SuppressLint({"ArrayReturn", "NullableCollection"})
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T> T[] readParcelableArray(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readParcelableArray(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readParcelableArray(paramClassLoader);
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  @RequiresApi(30)
  public static <T> Parcelable.Creator<T> readParcelableCreator(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readParcelableCreator(paramParcel, paramClassLoader, paramClass);
    }
    return Api30Impl.readParcelableCreator(paramParcel, paramClassLoader);
  }
  
  @NonNull
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  @RequiresApi(api=29)
  public static <T> List<T> readParcelableList(@NonNull Parcel paramParcel, @NonNull List<T> paramList, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readParcelableList(paramParcel, paramList, paramClassLoader, paramClass);
    }
    return Api29Impl.readParcelableList(paramParcel, paramList, paramClassLoader);
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T extends Serializable> T readSerializable(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readSerializable(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readSerializable();
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static <T> SparseArray<T> readSparseArray(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader, @NonNull Class<? extends T> paramClass)
  {
    if (BuildCompat.isAtLeastT()) {
      return TiramisuImpl.readSparseArray(paramParcel, paramClassLoader, paramClass);
    }
    return paramParcel.readSparseArray(paramClassLoader);
  }
  
  public static void writeBoolean(@NonNull Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static final <T extends Parcelable> List<T> readParcelableList(@NonNull Parcel paramParcel, @NonNull List<T> paramList, @Nullable ClassLoader paramClassLoader)
    {
      return o3.j(paramParcel, paramList, paramClassLoader);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static final Parcelable.Creator<?> readParcelableCreator(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
    {
      return d.f(paramParcel, paramClassLoader);
    }
  }
  
  @RequiresApi(33)
  public static class TiramisuImpl
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
}

/* Location:
 * Qualified Name:     androidx.core.os.ParcelCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */