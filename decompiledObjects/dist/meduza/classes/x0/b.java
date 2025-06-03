package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

public final class b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final int[] a;
  public final ArrayList<String> b;
  public final int[] c;
  public final int[] d;
  public final int e;
  public final String f;
  public final int o;
  public final int p;
  public final CharSequence q;
  public final int r;
  public final CharSequence s;
  public final ArrayList<String> t;
  public final ArrayList<String> u;
  public final boolean v;
  
  public b(Parcel paramParcel)
  {
    a = paramParcel.createIntArray();
    b = paramParcel.createStringArrayList();
    c = paramParcel.createIntArray();
    d = paramParcel.createIntArray();
    e = paramParcel.readInt();
    f = paramParcel.readString();
    o = paramParcel.readInt();
    p = paramParcel.readInt();
    q = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    r = paramParcel.readInt();
    s = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    t = paramParcel.createStringArrayList();
    u = paramParcel.createStringArrayList();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    v = bool;
  }
  
  public b(a parama)
  {
    int i = a.size();
    a = new int[i * 6];
    if (g)
    {
      b = new ArrayList(i);
      c = new int[i];
      d = new int[i];
      int j = 0;
      for (int k = 0; j < i; k++)
      {
        g0.a locala = (g0.a)a.get(j);
        Object localObject = a;
        int m = k + 1;
        localObject[k] = a;
        ArrayList localArrayList = b;
        localObject = b;
        if (localObject != null) {
          localObject = mWho;
        } else {
          localObject = null;
        }
        localArrayList.add(localObject);
        localObject = a;
        int n = m + 1;
        localObject[m] = c;
        k = n + 1;
        localObject[n] = d;
        m = k + 1;
        localObject[k] = e;
        k = m + 1;
        localObject[m] = f;
        localObject[k] = g;
        c[j] = h.ordinal();
        d[j] = i.ordinal();
        j++;
      }
      e = f;
      f = h;
      o = r;
      p = i;
      q = j;
      r = k;
      s = l;
      t = m;
      u = n;
      v = o;
      return;
    }
    throw new IllegalStateException("Not on back stack");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(a);
    paramParcel.writeStringList(b);
    paramParcel.writeIntArray(c);
    paramParcel.writeIntArray(d);
    paramParcel.writeInt(e);
    paramParcel.writeString(f);
    paramParcel.writeInt(o);
    paramParcel.writeInt(p);
    TextUtils.writeToParcel(q, paramParcel, 0);
    paramParcel.writeInt(r);
    TextUtils.writeToParcel(s, paramParcel, 0);
    paramParcel.writeStringList(t);
    paramParcel.writeStringList(u);
    paramParcel.writeInt(v);
  }
  
  public final class a
    implements Parcelable.Creator<b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */