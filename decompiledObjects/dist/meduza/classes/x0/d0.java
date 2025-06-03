package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class d0
  implements Parcelable
{
  public static final Parcelable.Creator<d0> CREATOR = new a();
  public final String a;
  public final String b;
  public final boolean c;
  public final int d;
  public final int e;
  public final String f;
  public final boolean o;
  public final boolean p;
  public final boolean q;
  public final boolean r;
  public final int s;
  public final String t;
  public final int u;
  public final boolean v;
  
  public d0(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool1 = true;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    d = paramParcel.readInt();
    e = paramParcel.readInt();
    f = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    o = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    p = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    q = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    r = bool2;
    s = paramParcel.readInt();
    t = paramParcel.readString();
    u = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    v = bool2;
  }
  
  public d0(i parami)
  {
    a = parami.getClass().getName();
    b = mWho;
    c = mFromLayout;
    d = mFragmentId;
    e = mContainerId;
    f = mTag;
    o = mRetainInstance;
    p = mRemoving;
    q = mDetached;
    r = mHidden;
    s = mMaxState.ordinal();
    t = mTargetWho;
    u = mTargetRequestCode;
    v = mUserVisibleHint;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentState{");
    localStringBuilder.append(a);
    localStringBuilder.append(" (");
    localStringBuilder.append(b);
    localStringBuilder.append(")}:");
    if (c) {
      localStringBuilder.append(" fromLayout");
    }
    if (e != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(e));
    }
    String str = f;
    if ((str != null) && (!str.isEmpty()))
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(f);
    }
    if (o) {
      localStringBuilder.append(" retainInstance");
    }
    if (p) {
      localStringBuilder.append(" removing");
    }
    if (q) {
      localStringBuilder.append(" detached");
    }
    if (r) {
      localStringBuilder.append(" hidden");
    }
    if (t != null)
    {
      localStringBuilder.append(" targetWho=");
      localStringBuilder.append(t);
      localStringBuilder.append(" targetRequestCode=");
      localStringBuilder.append(u);
    }
    if (v) {
      localStringBuilder.append(" userVisibleHint");
    }
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeInt(e);
    paramParcel.writeString(f);
    paramParcel.writeInt(o);
    paramParcel.writeInt(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeInt(s);
    paramParcel.writeString(t);
    paramParcel.writeInt(u);
    paramParcel.writeInt(v);
  }
  
  public final class a
    implements Parcelable.Creator<d0>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new d0(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new d0[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x0.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */