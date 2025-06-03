package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class VersionedParcelParcel
  extends VersionedParcel
{
  private static final boolean DEBUG = false;
  private static final String TAG = "VersionedParcelParcel";
  private int mCurrentField = -1;
  private final int mEnd;
  private int mFieldId = -1;
  private int mNextRead;
  private final int mOffset;
  private final Parcel mParcel;
  private final SparseIntArray mPositionLookup = new SparseIntArray();
  private final String mPrefix;
  
  public VersionedParcelParcel(Parcel paramParcel)
  {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
  }
  
  private VersionedParcelParcel(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, ArrayMap<String, Method> paramArrayMap1, ArrayMap<String, Method> paramArrayMap2, ArrayMap<String, Class> paramArrayMap)
  {
    super(paramArrayMap1, paramArrayMap2, paramArrayMap);
    mParcel = paramParcel;
    mOffset = paramInt1;
    mEnd = paramInt2;
    mNextRead = paramInt1;
    mPrefix = paramString;
  }
  
  public void closeField()
  {
    int i = mCurrentField;
    if (i >= 0)
    {
      int j = mPositionLookup.get(i);
      i = mParcel.dataPosition();
      mParcel.setDataPosition(j);
      mParcel.writeInt(i - j);
      mParcel.setDataPosition(i);
    }
  }
  
  public VersionedParcel createSubParcel()
  {
    Parcel localParcel = mParcel;
    int i = localParcel.dataPosition();
    int j = mNextRead;
    int k = j;
    if (j == mOffset) {
      k = mEnd;
    }
    return new VersionedParcelParcel(localParcel, i, k, z2.s(new StringBuilder(), mPrefix, "  "), mReadCache, mWriteCache, mParcelizerCache);
  }
  
  public boolean readBoolean()
  {
    boolean bool;
    if (mParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Bundle readBundle()
  {
    return mParcel.readBundle(getClass().getClassLoader());
  }
  
  public byte[] readByteArray()
  {
    int i = mParcel.readInt();
    if (i < 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[i];
    mParcel.readByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  public CharSequence readCharSequence()
  {
    return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(mParcel);
  }
  
  public double readDouble()
  {
    return mParcel.readDouble();
  }
  
  public boolean readField(int paramInt)
  {
    boolean bool;
    for (;;)
    {
      int i = mNextRead;
      int j = mEnd;
      bool = true;
      if (i >= j) {
        break;
      }
      j = mFieldId;
      if (j == paramInt) {
        return true;
      }
      if (String.valueOf(j).compareTo(String.valueOf(paramInt)) > 0) {
        return false;
      }
      mParcel.setDataPosition(mNextRead);
      j = mParcel.readInt();
      mFieldId = mParcel.readInt();
      mNextRead += j;
    }
    if (mFieldId != paramInt) {
      bool = false;
    }
    return bool;
  }
  
  public float readFloat()
  {
    return mParcel.readFloat();
  }
  
  public int readInt()
  {
    return mParcel.readInt();
  }
  
  public long readLong()
  {
    return mParcel.readLong();
  }
  
  public <T extends Parcelable> T readParcelable()
  {
    return mParcel.readParcelable(getClass().getClassLoader());
  }
  
  public String readString()
  {
    return mParcel.readString();
  }
  
  public IBinder readStrongBinder()
  {
    return mParcel.readStrongBinder();
  }
  
  public void setOutputField(int paramInt)
  {
    closeField();
    mCurrentField = paramInt;
    mPositionLookup.put(paramInt, mParcel.dataPosition());
    writeInt(0);
    writeInt(paramInt);
  }
  
  public void writeBoolean(boolean paramBoolean)
  {
    mParcel.writeInt(paramBoolean);
  }
  
  public void writeBundle(Bundle paramBundle)
  {
    mParcel.writeBundle(paramBundle);
  }
  
  public void writeByteArray(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      mParcel.writeInt(paramArrayOfByte.length);
      mParcel.writeByteArray(paramArrayOfByte);
    }
    else
    {
      mParcel.writeInt(-1);
    }
  }
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      mParcel.writeInt(paramArrayOfByte.length);
      mParcel.writeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    }
    else
    {
      mParcel.writeInt(-1);
    }
  }
  
  public void writeCharSequence(CharSequence paramCharSequence)
  {
    TextUtils.writeToParcel(paramCharSequence, mParcel, 0);
  }
  
  public void writeDouble(double paramDouble)
  {
    mParcel.writeDouble(paramDouble);
  }
  
  public void writeFloat(float paramFloat)
  {
    mParcel.writeFloat(paramFloat);
  }
  
  public void writeInt(int paramInt)
  {
    mParcel.writeInt(paramInt);
  }
  
  public void writeLong(long paramLong)
  {
    mParcel.writeLong(paramLong);
  }
  
  public void writeParcelable(Parcelable paramParcelable)
  {
    mParcel.writeParcelable(paramParcelable, 0);
  }
  
  public void writeString(String paramString)
  {
    mParcel.writeString(paramString);
  }
  
  public void writeStrongBinder(IBinder paramIBinder)
  {
    mParcel.writeStrongBinder(paramIBinder);
  }
  
  public void writeStrongInterface(IInterface paramIInterface)
  {
    mParcel.writeStrongInterface(paramIInterface);
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */