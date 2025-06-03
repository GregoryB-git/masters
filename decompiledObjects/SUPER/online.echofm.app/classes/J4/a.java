package J4;

import N4.k;
import N4.k.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protobuf.r.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final String o;
  public final M4.l p;
  public boolean q;
  
  public a(Parcel paramParcel)
  {
    boolean bool = false;
    q = false;
    o = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool = true;
    }
    q = bool;
    p = ((M4.l)paramParcel.readParcelable(M4.l.class.getClassLoader()));
  }
  
  public a(String paramString, M4.a parama)
  {
    q = false;
    o = paramString;
    p = parama.a();
  }
  
  public static k[] b(List paramList)
  {
    if (paramList.isEmpty()) {
      return null;
    }
    k[] arrayOfk = new k[paramList.size()];
    k localk1 = ((a)paramList.get(0)).a();
    int i = 0;
    for (int j = 1; j < paramList.size(); j++)
    {
      k localk2 = ((a)paramList.get(j)).a();
      if ((i == 0) && (((a)paramList.get(j)).g()))
      {
        arrayOfk[0] = localk2;
        arrayOfk[j] = localk1;
        i = 1;
      }
      else
      {
        arrayOfk[j] = localk2;
      }
    }
    if (i == 0) {
      arrayOfk[0] = localk1;
    }
    return arrayOfk;
  }
  
  public static a c(String paramString)
  {
    paramString = new a(paramString.replace("-", ""), new M4.a());
    paramString.i(j());
    return paramString;
  }
  
  public static boolean j()
  {
    C4.a locala = C4.a.g();
    boolean bool;
    if ((locala.L()) && (Math.random() < locala.D())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public k a()
  {
    k.c localc = k.a0().E(o);
    if (q) {
      localc.D(N4.l.q);
    }
    return (k)localc.v();
  }
  
  public M4.l d()
  {
    return p;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean e()
  {
    return q;
  }
  
  public boolean f()
  {
    boolean bool;
    if (TimeUnit.MICROSECONDS.toMinutes(p.c()) > C4.a.g().A()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    return q;
  }
  
  public String h()
  {
    return o;
  }
  
  public void i(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeByte((byte)q);
    paramParcel.writeParcelable(p, 0);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel, null);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     J4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */