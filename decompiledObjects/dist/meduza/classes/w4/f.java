package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
  extends b
{
  public static final Parcelable.Creator<f> CREATOR = new a();
  public final List<c> a;
  
  public f(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(new c(paramParcel));
    }
    a = Collections.unmodifiableList(localArrayList);
  }
  
  public f(ArrayList paramArrayList)
  {
    a = Collections.unmodifiableList(paramArrayList);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      c localc = (c)a.get(paramInt);
      paramParcel.writeLong(a);
      paramParcel.writeByte((byte)b);
      paramParcel.writeByte((byte)c);
      paramParcel.writeByte((byte)d);
      int j = f.size();
      paramParcel.writeInt(j);
      for (int k = 0; k < j; k++)
      {
        b localb = (b)f.get(k);
        paramParcel.writeInt(a);
        paramParcel.writeLong(b);
      }
      paramParcel.writeLong(e);
      paramParcel.writeByte((byte)g);
      paramParcel.writeLong(h);
      paramParcel.writeInt(i);
      paramParcel.writeInt(j);
      paramParcel.writeInt(k);
    }
  }
  
  public final class a
    implements Parcelable.Creator<f>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new f(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new f[paramInt];
    }
  }
  
  public static final class b
  {
    public final int a;
    public final long b;
    
    public b(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
  }
  
  public static final class c
  {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List<f.b> f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    
    public c(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, ArrayList paramArrayList, long paramLong2, boolean paramBoolean4, long paramLong3, int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramLong1;
      b = paramBoolean1;
      c = paramBoolean2;
      d = paramBoolean3;
      f = Collections.unmodifiableList(paramArrayList);
      e = paramLong2;
      g = paramBoolean4;
      h = paramLong3;
      i = paramInt1;
      j = paramInt2;
      k = paramInt3;
    }
    
    public c(Parcel paramParcel)
    {
      a = paramParcel.readLong();
      int m = paramParcel.readByte();
      boolean bool1 = false;
      if (m == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b = bool2;
      if (paramParcel.readByte() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      c = bool2;
      if (paramParcel.readByte() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      d = bool2;
      int n = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(n);
      for (m = 0; m < n; m++) {
        localArrayList.add(new f.b(paramParcel.readInt(), paramParcel.readLong()));
      }
      f = Collections.unmodifiableList(localArrayList);
      e = paramParcel.readLong();
      boolean bool2 = bool1;
      if (paramParcel.readByte() == 1) {
        bool2 = true;
      }
      g = bool2;
      h = paramParcel.readLong();
      i = paramParcel.readInt();
      j = paramParcel.readInt();
      k = paramParcel.readInt();
    }
  }
}

/* Location:
 * Qualified Name:     w4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */