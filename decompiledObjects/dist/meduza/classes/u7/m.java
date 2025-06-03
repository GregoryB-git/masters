package u7;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import dc.l;
import ec.i;
import ec.n;
import f;
import java.util.Date;
import p2.m0;
import rb.d;

public final class m
  implements Comparable<m>, Parcelable
{
  public static final Parcelable.Creator<m> CREATOR = new a();
  public final long a;
  public final int b;
  
  static
  {
    new b();
  }
  
  public m(int paramInt, long paramLong)
  {
    b.a(paramLong, paramInt);
    a = paramLong;
    b = paramInt;
  }
  
  public m(Date paramDate)
  {
    long l1 = paramDate.getTime();
    long l2 = 'Ϩ';
    l1 /= l2;
    int i = (int)(paramDate.getTime() % l2 * 1000000);
    if (i < 0) {
      paramDate = new d(Long.valueOf(l1 - 1L), Integer.valueOf(i + 1000000000));
    } else {
      paramDate = new d(Long.valueOf(l1), Integer.valueOf(i));
    }
    l2 = ((Number)a).longValue();
    i = ((Number)b).intValue();
    b.a(l2, i);
    a = l2;
    b = i;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if ((paramObject != this) && ((!(paramObject instanceof m)) || (f((m)paramObject) != 0))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final int f(m paramm)
  {
    i.e(paramm, "other");
    c localc = c.b;
    int i = 0;
    d locald = d.b;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= 2) {
        break;
      }
      l locall = new l[] { localc, locald }[j];
      k = m0.s((Comparable)locall.invoke(this), (Comparable)locall.invoke(paramm));
      if (k != 0) {
        break;
      }
    }
    return k;
  }
  
  public final int hashCode()
  {
    long l = a;
    return ((int)l * 37 * 37 + (int)(l >> 32)) * 37 + b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Timestamp(seconds=");
    localStringBuilder.append(a);
    localStringBuilder.append(", nanoseconds=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.e(paramParcel, "dest");
    paramParcel.writeLong(a);
    paramParcel.writeInt(b);
  }
  
  public static final class a
    implements Parcelable.Creator<m>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      i.e(paramParcel, "source");
      long l = paramParcel.readLong();
      return new m(paramParcel.readInt(), l);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new m[paramInt];
    }
  }
  
  public static final class b
  {
    public static final void a(long paramLong, int paramInt)
    {
      int i = 1;
      int j;
      if ((paramInt >= 0) && (paramInt < 1000000000)) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        if ((-62135596800L <= paramLong) && (paramLong < 253402300800L)) {
          paramInt = i;
        } else {
          paramInt = 0;
        }
        if (paramInt != 0) {
          return;
        }
        throw new IllegalArgumentException(j.i("Timestamp seconds out of range: ", paramLong).toString());
      }
      throw new IllegalArgumentException(f.h("Timestamp nanoseconds out of range: ", paramInt).toString());
    }
  }
}

/* Location:
 * Qualified Name:     u7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */