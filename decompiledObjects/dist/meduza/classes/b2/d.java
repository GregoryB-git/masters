package b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseIntArray;
import g;
import java.lang.reflect.Method;
import r.b;

public final class d
  extends c
{
  public final SparseIntArray d = new SparseIntArray();
  public final Parcel e;
  public final int f;
  public final int g;
  public final String h;
  public int i = -1;
  public int j;
  public int k = -1;
  
  public d(Parcel paramParcel)
  {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", new b(), new b(), new b());
  }
  
  public d(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, b<String, Method> paramb1, b<String, Method> paramb2, b<String, Class> paramb)
  {
    super(paramb1, paramb2, paramb);
    e = paramParcel;
    f = paramInt1;
    g = paramInt2;
    j = paramInt1;
    h = paramString;
  }
  
  public final void A(boolean paramBoolean)
  {
    e.writeInt(paramBoolean);
  }
  
  public final void C(Bundle paramBundle)
  {
    e.writeBundle(paramBundle);
  }
  
  public final void D(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      e.writeInt(paramArrayOfByte.length);
      e.writeByteArray(paramArrayOfByte);
    }
    else
    {
      e.writeInt(-1);
    }
  }
  
  public final void E(CharSequence paramCharSequence)
  {
    TextUtils.writeToParcel(paramCharSequence, e, 0);
  }
  
  public final void G(float paramFloat)
  {
    e.writeFloat(paramFloat);
  }
  
  public final void H(int paramInt)
  {
    e.writeInt(paramInt);
  }
  
  public final void K(long paramLong)
  {
    e.writeLong(paramLong);
  }
  
  public final void L(Parcelable paramParcelable)
  {
    e.writeParcelable(paramParcelable, 0);
  }
  
  public final void N(String paramString)
  {
    e.writeString(paramString);
  }
  
  public final void P(IBinder paramIBinder)
  {
    e.writeStrongBinder(paramIBinder);
  }
  
  public final void S()
  {
    int m = i;
    if (m >= 0)
    {
      int n = d.get(m);
      m = e.dataPosition();
      e.setDataPosition(n);
      e.writeInt(m - n);
      e.setDataPosition(m);
    }
  }
  
  public final d a()
  {
    Parcel localParcel = e;
    int m = localParcel.dataPosition();
    int n = j;
    int i1 = n;
    if (n == f) {
      i1 = g;
    }
    return new d(localParcel, m, i1, g.f(new StringBuilder(), h, "  "), a, b, c);
  }
  
  public final boolean e()
  {
    boolean bool;
    if (e.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Bundle g()
  {
    return e.readBundle(d.class.getClassLoader());
  }
  
  public final byte[] i()
  {
    int m = e.readInt();
    if (m < 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[m];
    e.readByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  public final CharSequence j()
  {
    return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(e);
  }
  
  public final boolean l(int paramInt)
  {
    boolean bool;
    for (;;)
    {
      int m = j;
      int n = g;
      bool = true;
      if (m >= n) {
        break;
      }
      n = k;
      if (n == paramInt) {
        return true;
      }
      if (String.valueOf(n).compareTo(String.valueOf(paramInt)) > 0) {
        return false;
      }
      e.setDataPosition(j);
      n = e.readInt();
      k = e.readInt();
      j += n;
    }
    if (k != paramInt) {
      bool = false;
    }
    return bool;
  }
  
  public final float m()
  {
    return e.readFloat();
  }
  
  public final int n()
  {
    return e.readInt();
  }
  
  public final long p()
  {
    return e.readLong();
  }
  
  public final <T extends Parcelable> T r()
  {
    return e.readParcelable(d.class.getClassLoader());
  }
  
  public final String t()
  {
    return e.readString();
  }
  
  public final IBinder v()
  {
    return e.readStrongBinder();
  }
  
  public final void y(int paramInt)
  {
    S();
    i = paramInt;
    d.put(paramInt, e.dataPosition());
    H(0);
    H(paramInt);
  }
}

/* Location:
 * Qualified Name:     b2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */