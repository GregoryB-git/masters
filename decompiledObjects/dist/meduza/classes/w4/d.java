package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d
  extends b
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public final long a;
  public final boolean b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  public final long f;
  public final long o;
  public final List<b> p;
  public final boolean q;
  public final long r;
  public final int s;
  public final int t;
  public final int u;
  
  public d(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong2, long paramLong3, List<b> paramList, boolean paramBoolean5, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramLong1;
    b = paramBoolean1;
    c = paramBoolean2;
    d = paramBoolean3;
    e = paramBoolean4;
    f = paramLong2;
    o = paramLong3;
    p = Collections.unmodifiableList(paramList);
    q = paramBoolean5;
    r = paramLong4;
    s = paramInt1;
    t = paramInt2;
    u = paramInt3;
  }
  
  public d(Parcel paramParcel)
  {
    a = paramParcel.readLong();
    int i = paramParcel.readByte();
    boolean bool1 = true;
    boolean bool2;
    if (i == 1) {
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
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    e = bool2;
    f = paramParcel.readLong();
    o = paramParcel.readLong();
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    for (i = 0; i < j; i++) {
      localArrayList.add(new b(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong()));
    }
    p = Collections.unmodifiableList(localArrayList);
    if (paramParcel.readByte() == 1) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    q = bool2;
    r = paramParcel.readLong();
    s = paramParcel.readInt();
    t = paramParcel.readInt();
    u = paramParcel.readInt();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(a);
    paramParcel.writeByte((byte)b);
    paramParcel.writeByte((byte)c);
    paramParcel.writeByte((byte)d);
    paramParcel.writeByte((byte)e);
    paramParcel.writeLong(f);
    paramParcel.writeLong(o);
    int i = p.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      b localb = (b)p.get(paramInt);
      paramParcel.writeInt(a);
      paramParcel.writeLong(b);
      paramParcel.writeLong(c);
    }
    paramParcel.writeByte((byte)q);
    paramParcel.writeLong(r);
    paramParcel.writeInt(s);
    paramParcel.writeInt(t);
    paramParcel.writeInt(u);
  }
  
  public final class a
    implements Parcelable.Creator<d>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new d(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new d[paramInt];
    }
  }
  
  public static final class b
  {
    public final int a;
    public final long b;
    public final long c;
    
    public b(int paramInt, long paramLong1, long paramLong2)
    {
      a = paramInt;
      b = paramLong1;
      c = paramLong2;
    }
  }
}

/* Location:
 * Qualified Name:     w4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */