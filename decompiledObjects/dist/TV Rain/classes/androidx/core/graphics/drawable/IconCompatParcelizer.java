package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer
{
  public static IconCompat read(VersionedParcel paramVersionedParcel)
  {
    IconCompat localIconCompat = new IconCompat();
    mType = paramVersionedParcel.readInt(mType, 1);
    mData = paramVersionedParcel.readByteArray(mData, 2);
    mParcelable = paramVersionedParcel.readParcelable(mParcelable, 3);
    mInt1 = paramVersionedParcel.readInt(mInt1, 4);
    mInt2 = paramVersionedParcel.readInt(mInt2, 5);
    mTintList = ((ColorStateList)paramVersionedParcel.readParcelable(mTintList, 6));
    mTintModeStr = paramVersionedParcel.readString(mTintModeStr, 7);
    mString1 = paramVersionedParcel.readString(mString1, 8);
    localIconCompat.onPostParceling();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(true, true);
    paramIconCompat.onPreParceling(paramVersionedParcel.isStream());
    int i = mType;
    if (-1 != i) {
      paramVersionedParcel.writeInt(i, 1);
    }
    Object localObject = mData;
    if (localObject != null) {
      paramVersionedParcel.writeByteArray((byte[])localObject, 2);
    }
    localObject = mParcelable;
    if (localObject != null) {
      paramVersionedParcel.writeParcelable((Parcelable)localObject, 3);
    }
    i = mInt1;
    if (i != 0) {
      paramVersionedParcel.writeInt(i, 4);
    }
    i = mInt2;
    if (i != 0) {
      paramVersionedParcel.writeInt(i, 5);
    }
    localObject = mTintList;
    if (localObject != null) {
      paramVersionedParcel.writeParcelable((Parcelable)localObject, 6);
    }
    localObject = mTintModeStr;
    if (localObject != null) {
      paramVersionedParcel.writeString((String)localObject, 7);
    }
    paramIconCompat = mString1;
    if (paramIconCompat != null) {
      paramVersionedParcel.writeString(paramIconCompat, 8);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */