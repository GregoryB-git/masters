package V0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
  extends b
{
  public static final Parcelable.Creator<f> CREATOR = new a();
  public final List o;
  
  public f(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(c.a(paramParcel));
    }
    o = Collections.unmodifiableList(localArrayList);
  }
  
  public f(List paramList)
  {
    o = Collections.unmodifiableList(paramList);
  }
  
  public static f a(z paramz)
  {
    int i = paramz.G();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(c.b(paramz));
    }
    return new f(localArrayList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = o.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      c.c((c)o.get(paramInt), paramParcel);
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public f a(Parcel paramParcel)
    {
      return new f(paramParcel, null);
    }
    
    public f[] b(int paramInt)
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
    
    public static b c(Parcel paramParcel)
    {
      return new b(paramParcel.readInt(), paramParcel.readLong());
    }
    
    public final void d(Parcel paramParcel)
    {
      paramParcel.writeInt(a);
      paramParcel.writeLong(b);
    }
  }
  
  public static final class c
  {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    
    public c(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List paramList, long paramLong2, boolean paramBoolean4, long paramLong3, int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramLong1;
      b = paramBoolean1;
      c = paramBoolean2;
      d = paramBoolean3;
      f = Collections.unmodifiableList(paramList);
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
        localArrayList.add(f.b.a(paramParcel));
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
    
    public static c d(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public static c e(z paramz)
    {
      long l1 = paramz.I();
      boolean bool1;
      if ((paramz.G() & 0x80) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      ArrayList localArrayList = new ArrayList();
      int m;
      boolean bool2;
      boolean bool3;
      long l2;
      int n;
      int i1;
      long l3;
      boolean bool4;
      if (!bool1)
      {
        m = paramz.G();
        if ((m & 0x80) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        if ((m & 0x40) != 0) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        if ((m & 0x20) != 0) {
          m = 1;
        } else {
          m = 0;
        }
        if (bool3) {
          l2 = paramz.I();
        } else {
          l2 = -9223372036854775807L;
        }
        if (!bool3)
        {
          n = paramz.G();
          localArrayList = new ArrayList(n);
          for (i1 = 0; i1 < n; i1++) {
            localArrayList.add(new f.b(paramz.G(), paramz.I(), null));
          }
        }
        if (m != 0)
        {
          l3 = paramz.G();
          if ((0x80 & l3) != 0L) {
            bool4 = true;
          } else {
            bool4 = false;
          }
          l3 = ((l3 & 1L) << 32 | paramz.I()) * 1000L / 90L;
        }
        else
        {
          bool4 = false;
          l3 = -9223372036854775807L;
        }
        n = paramz.M();
        i1 = paramz.G();
        m = paramz.G();
        paramz = localArrayList;
      }
      else
      {
        paramz = localArrayList;
        bool2 = false;
        l2 = -9223372036854775807L;
        bool4 = false;
        l3 = -9223372036854775807L;
        n = 0;
        i1 = 0;
        m = 0;
        bool3 = false;
      }
      return new c(l1, bool1, bool2, bool3, paramz, l2, bool4, l3, n, i1, m);
    }
    
    public final void f(Parcel paramParcel)
    {
      paramParcel.writeLong(a);
      paramParcel.writeByte((byte)b);
      paramParcel.writeByte((byte)c);
      paramParcel.writeByte((byte)d);
      int m = f.size();
      paramParcel.writeInt(m);
      for (int n = 0; n < m; n++) {
        f.b.b((f.b)f.get(n), paramParcel);
      }
      paramParcel.writeLong(e);
      paramParcel.writeByte((byte)g);
      paramParcel.writeLong(h);
      paramParcel.writeInt(i);
      paramParcel.writeInt(j);
      paramParcel.writeInt(k);
    }
  }
}

/* Location:
 * Qualified Name:     V0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */