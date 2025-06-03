package V0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.E;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d
  extends b
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public final int A;
  public final long o;
  public final boolean p;
  public final boolean q;
  public final boolean r;
  public final boolean s;
  public final long t;
  public final long u;
  public final List v;
  public final boolean w;
  public final long x;
  public final int y;
  public final int z;
  
  public d(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong2, long paramLong3, List paramList, boolean paramBoolean5, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
  {
    o = paramLong1;
    p = paramBoolean1;
    q = paramBoolean2;
    r = paramBoolean3;
    s = paramBoolean4;
    t = paramLong2;
    u = paramLong3;
    v = Collections.unmodifiableList(paramList);
    w = paramBoolean5;
    x = paramLong4;
    y = paramInt1;
    z = paramInt2;
    A = paramInt3;
  }
  
  public d(Parcel paramParcel)
  {
    o = paramParcel.readLong();
    int i = paramParcel.readByte();
    boolean bool1 = false;
    if (i == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    p = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    q = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    r = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    s = bool2;
    t = paramParcel.readLong();
    u = paramParcel.readLong();
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    for (i = 0; i < j; i++) {
      localArrayList.add(b.a(paramParcel));
    }
    v = Collections.unmodifiableList(localArrayList);
    boolean bool2 = bool1;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    }
    w = bool2;
    x = paramParcel.readLong();
    y = paramParcel.readInt();
    z = paramParcel.readInt();
    A = paramParcel.readInt();
  }
  
  public static d a(z paramz, long paramLong, E paramE)
  {
    long l1 = paramz.I();
    boolean bool1;
    if ((paramz.G() & 0x80) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject = Collections.emptyList();
    int i;
    boolean bool2;
    boolean bool3;
    int j;
    boolean bool4;
    long l2;
    int k;
    boolean bool5;
    if (!bool1)
    {
      i = paramz.G();
      if ((i & 0x80) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if ((i & 0x40) != 0) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if ((i & 0x20) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      if ((i & 0x10) != 0) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      if ((bool3) && (!bool4)) {
        l2 = g.b(paramz, paramLong);
      } else {
        l2 = -9223372036854775807L;
      }
      if (!bool3)
      {
        k = paramz.G();
        localObject = new ArrayList(k);
        for (i = 0; i < k; i++)
        {
          int m = paramz.G();
          long l3;
          if (!bool4) {
            l3 = g.b(paramz, paramLong);
          } else {
            l3 = -9223372036854775807L;
          }
          ((List)localObject).add(new b(m, l3, paramE.b(l3), null));
        }
      }
      if (j != 0)
      {
        paramLong = paramz.G();
        if ((0x80 & paramLong) != 0L) {
          bool5 = true;
        } else {
          bool5 = false;
        }
        paramLong = ((paramLong & 1L) << 32 | paramz.I()) * 1000L / 90L;
      }
      else
      {
        bool5 = false;
        paramLong = -9223372036854775807L;
      }
      k = paramz.M();
      j = paramz.G();
      i = paramz.G();
      paramz = (z)localObject;
      boolean bool6 = bool4;
      bool4 = bool2;
      bool2 = bool6;
    }
    else
    {
      paramz = (z)localObject;
      bool4 = false;
      bool2 = false;
      l2 = -9223372036854775807L;
      bool5 = false;
      paramLong = -9223372036854775807L;
      k = 0;
      j = 0;
      i = 0;
      bool3 = false;
    }
    return new d(l1, bool1, bool4, bool3, bool2, l2, paramE.b(l2), paramz, bool5, paramLong, k, j, i);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SCTE-35 SpliceInsertCommand { programSplicePts=");
    localStringBuilder.append(t);
    localStringBuilder.append(", programSplicePlaybackPositionUs= ");
    localStringBuilder.append(u);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeByte((byte)p);
    paramParcel.writeByte((byte)q);
    paramParcel.writeByte((byte)r);
    paramParcel.writeByte((byte)s);
    paramParcel.writeLong(t);
    paramParcel.writeLong(u);
    int i = v.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      ((b)v.get(paramInt)).b(paramParcel);
    }
    paramParcel.writeByte((byte)w);
    paramParcel.writeLong(x);
    paramParcel.writeInt(y);
    paramParcel.writeInt(z);
    paramParcel.writeInt(A);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public d a(Parcel paramParcel)
    {
      return new d(paramParcel, null);
    }
    
    public d[] b(int paramInt)
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
    
    public static b a(Parcel paramParcel)
    {
      return new b(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong());
    }
    
    public void b(Parcel paramParcel)
    {
      paramParcel.writeInt(a);
      paramParcel.writeLong(b);
      paramParcel.writeLong(c);
    }
  }
}

/* Location:
 * Qualified Name:     V0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */