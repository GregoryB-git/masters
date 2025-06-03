package p4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;
import java.util.Arrays;
import java.util.List;
import v3.i0;
import v3.p0.a;
import x6.b;

public final class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final b[] a;
  public final long b;
  
  public a() {}
  
  public a(long paramLong, b... paramVarArgs)
  {
    b = paramLong;
    a = paramVarArgs;
  }
  
  public a(Parcel paramParcel)
  {
    a = new b[paramParcel.readInt()];
    for (int i = 0;; i++)
    {
      b[] arrayOfb = a;
      if (i >= arrayOfb.length) {
        break;
      }
      arrayOfb[i] = ((b)paramParcel.readParcelable(b.class.getClassLoader()));
    }
    b = paramParcel.readLong();
  }
  
  public a(List<? extends b> paramList)
  {
    this((b[])paramList.toArray(new b[0]));
  }
  
  public a(b... paramVarArgs)
  {
    this(-9223372036854775807L, paramVarArgs);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((!Arrays.equals(a, a)) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(a);
    return b.b0(b) + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("entries=");
    localStringBuilder.append(Arrays.toString(a));
    Object localObject;
    if (b == -9223372036854775807L)
    {
      localObject = "";
    }
    else
    {
      localObject = f.l(", presentationTimeUs=");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a.length);
    b[] arrayOfb = a;
    int i = arrayOfb.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfb[paramInt], 0);
    }
    paramParcel.writeLong(b);
  }
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
  
  public static abstract interface b
    extends Parcelable
  {
    public abstract byte[] B();
    
    public abstract void l(p0.a parama);
    
    public abstract i0 n();
  }
}

/* Location:
 * Qualified Name:     p4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */