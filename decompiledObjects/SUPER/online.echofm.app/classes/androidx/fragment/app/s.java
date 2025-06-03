package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class s
  implements Parcelable
{
  public static final Parcelable.Creator<s> CREATOR = new a();
  public Bundle A;
  public final String o;
  public final String p;
  public final boolean q;
  public final int r;
  public final int s;
  public final String t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public final Bundle x;
  public final boolean y;
  public final int z;
  
  public s(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool1 = true;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    q = bool2;
    r = paramParcel.readInt();
    s = paramParcel.readInt();
    t = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    u = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    v = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    w = bool2;
    x = paramParcel.readBundle();
    if (paramParcel.readInt() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    y = bool2;
    A = paramParcel.readBundle();
    z = paramParcel.readInt();
  }
  
  public s(Fragment paramFragment)
  {
    o = paramFragment.getClass().getName();
    p = t;
    q = B;
    r = K;
    s = L;
    t = M;
    u = P;
    v = A;
    w = O;
    x = u;
    y = N;
    z = f0.ordinal();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentState{");
    localStringBuilder.append(o);
    localStringBuilder.append(" (");
    localStringBuilder.append(p);
    localStringBuilder.append(")}:");
    if (q) {
      localStringBuilder.append(" fromLayout");
    }
    if (s != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(s));
    }
    String str = t;
    if ((str != null) && (!str.isEmpty()))
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(t);
    }
    if (u) {
      localStringBuilder.append(" retainInstance");
    }
    if (v) {
      localStringBuilder.append(" removing");
    }
    if (w) {
      localStringBuilder.append(" detached");
    }
    if (y) {
      localStringBuilder.append(" hidden");
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeInt(s);
    paramParcel.writeString(t);
    paramParcel.writeInt(u);
    paramParcel.writeInt(v);
    paramParcel.writeInt(w);
    paramParcel.writeBundle(x);
    paramParcel.writeInt(y);
    paramParcel.writeBundle(A);
    paramParcel.writeInt(z);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public s a(Parcel paramParcel)
    {
      return new s(paramParcel);
    }
    
    public s[] b(int paramInt)
    {
      return new s[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */