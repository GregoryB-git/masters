package d0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;
import java.util.List;

public final class x
  implements Parcelable
{
  public static final Parcelable.Creator<x> CREATOR = new a();
  public final b[] o;
  public final long p;
  
  public x(long paramLong, List paramList)
  {
    this(paramLong, (b[])paramList.toArray(new b[0]));
  }
  
  public x(long paramLong, b... paramVarArgs)
  {
    p = paramLong;
    o = paramVarArgs;
  }
  
  public x(Parcel paramParcel)
  {
    o = new b[paramParcel.readInt()];
    for (int i = 0;; i++)
    {
      b[] arrayOfb = o;
      if (i >= arrayOfb.length) {
        break;
      }
      arrayOfb[i] = ((b)paramParcel.readParcelable(b.class.getClassLoader()));
    }
    p = paramParcel.readLong();
  }
  
  public x(List paramList)
  {
    this((b[])paramList.toArray(new b[0]));
  }
  
  public x(b... paramVarArgs)
  {
    this(-9223372036854775807L, paramVarArgs);
  }
  
  public x a(b... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      return this;
    }
    return new x(p, (b[])M.N0(o, paramVarArgs));
  }
  
  public x b(x paramx)
  {
    if (paramx == null) {
      return this;
    }
    return a(o);
  }
  
  public x c(long paramLong)
  {
    if (p == paramLong) {
      return this;
    }
    return new x(paramLong, o);
  }
  
  public b d(int paramInt)
  {
    return o[paramInt];
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return o.length;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (x.class == paramObject.getClass()))
    {
      paramObject = (x)paramObject;
      if ((!Arrays.equals(o, o)) || (p != p)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(o) * 31 + h.b(p);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("entries=");
    localStringBuilder.append(Arrays.toString(o));
    Object localObject;
    if (p == -9223372036854775807L)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", presentationTimeUs=");
      ((StringBuilder)localObject).append(p);
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o.length);
    b[] arrayOfb = o;
    int i = arrayOfb.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfb[paramInt], 0);
    }
    paramParcel.writeLong(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public x a(Parcel paramParcel)
    {
      return new x(paramParcel);
    }
    
    public x[] b(int paramInt)
    {
      return new x[paramInt];
    }
  }
  
  public static abstract interface b
    extends Parcelable
  {
    public abstract void D(w.b paramb);
    
    public abstract byte[] M();
    
    public abstract q s();
  }
}

/* Location:
 * Qualified Name:     d0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */