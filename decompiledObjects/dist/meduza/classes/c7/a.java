package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import b.z;

@Deprecated
public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new g();
  public final a a;
  public final String b;
  public final String c;
  
  static
  {
    new a();
    new a("unavailable");
    new a("unused");
  }
  
  public a()
  {
    a = a.b;
    c = null;
    b = null;
  }
  
  public a(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      arrayOfa = a.values();
      i = arrayOfa.length;
      j = 0;
    }
    catch (b paramString1)
    {
      for (;;)
      {
        a[] arrayOfa;
        int i;
        int j;
        a locala;
        break;
        j++;
        continue;
        paramString1 = new c7/a$b;
        paramString1.<init>(paramInt);
        throw paramString1;
      }
      throw new IllegalArgumentException(paramString1);
    }
    if (j < i)
    {
      locala = arrayOfa[j];
      if (paramInt == a)
      {
        a = locala;
        b = paramString1;
        c = paramString2;
        return;
      }
    }
  }
  
  public a(String paramString)
  {
    b = paramString;
    a = a.c;
    c = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (!a.equals(a)) {
      return false;
    }
    int i = a.ordinal();
    if (i != 0)
    {
      String str;
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        str = c;
      }
      for (paramObject = c;; paramObject = b)
      {
        return str.equals(paramObject);
        str = b;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode() + 31;
    int j = a.ordinal();
    if (j != 1)
    {
      if (j != 2) {
        return i;
      }
      j = i * 31;
    }
    for (String str = c;; str = b)
    {
      return str.hashCode() + j;
      j = i * 31;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 2, a.a);
    z.F(paramParcel, 3, b, false);
    z.F(paramParcel, 4, c, false);
    z.L(paramInt, paramParcel);
  }
  
  public static enum a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new f();
    public final int a;
    
    static
    {
      a locala1 = new a("ABSENT", 0, 0);
      b = locala1;
      a locala2 = new a("STRING", 1, 1);
      c = locala2;
      d = new a[] { locala1, locala2, new a("OBJECT", 2, 2) };
    }
    
    public a(int paramInt1)
    {
      a = paramInt1;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
    }
  }
  
  public static final class b
    extends Exception
  {
    public b(int paramInt)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     c7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */