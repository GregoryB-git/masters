package v1;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseIntArray;
import t.a;

public class c
  extends b
{
  public final SparseIntArray d = new SparseIntArray();
  public final Parcel e;
  public final int f;
  public final int g;
  public final String h;
  public int i = -1;
  public int j;
  public int k = -1;
  
  public c(Parcel paramParcel)
  {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", new a(), new a(), new a());
  }
  
  public c(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, a parama1, a parama2, a parama3)
  {
    super(parama1, parama2, parama3);
    e = paramParcel;
    f = paramInt1;
    g = paramInt2;
    j = paramInt1;
    h = paramString;
  }
  
  public void A(byte[] paramArrayOfByte)
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
  
  public void C(CharSequence paramCharSequence)
  {
    TextUtils.writeToParcel(paramCharSequence, e, 0);
  }
  
  public void E(int paramInt)
  {
    e.writeInt(paramInt);
  }
  
  public void G(Parcelable paramParcelable)
  {
    e.writeParcelable(paramParcelable, 0);
  }
  
  public void I(String paramString)
  {
    e.writeString(paramString);
  }
  
  public void a()
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
  
  public b b()
  {
    Parcel localParcel = e;
    int m = localParcel.dataPosition();
    int n = j;
    int i1 = n;
    if (n == f) {
      i1 = g;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(h);
    localStringBuilder.append("  ");
    return new c(localParcel, m, i1, localStringBuilder.toString(), a, b, c);
  }
  
  public boolean g()
  {
    boolean bool;
    if (e.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public byte[] i()
  {
    int m = e.readInt();
    if (m < 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[m];
    e.readByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  public CharSequence k()
  {
    return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(e);
  }
  
  public boolean m(int paramInt)
  {
    boolean bool;
    for (;;)
    {
      int m = j;
      int n = g;
      bool = false;
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
    if (k == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  public int o()
  {
    return e.readInt();
  }
  
  public Parcelable q()
  {
    return e.readParcelable(getClass().getClassLoader());
  }
  
  public String s()
  {
    return e.readString();
  }
  
  public void w(int paramInt)
  {
    a();
    i = paramInt;
    d.put(paramInt, e.dataPosition());
    E(0);
    E(paramInt);
  }
  
  public void y(boolean paramBoolean)
  {
    e.writeInt(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     v1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */