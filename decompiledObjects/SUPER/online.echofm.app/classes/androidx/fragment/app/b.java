package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

public final class b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final ArrayList A;
  public final boolean B;
  public final int[] o;
  public final ArrayList p;
  public final int[] q;
  public final int[] r;
  public final int s;
  public final String t;
  public final int u;
  public final int v;
  public final CharSequence w;
  public final int x;
  public final CharSequence y;
  public final ArrayList z;
  
  public b(Parcel paramParcel)
  {
    o = paramParcel.createIntArray();
    p = paramParcel.createStringArrayList();
    q = paramParcel.createIntArray();
    r = paramParcel.createIntArray();
    s = paramParcel.readInt();
    t = paramParcel.readString();
    u = paramParcel.readInt();
    v = paramParcel.readInt();
    Parcelable.Creator localCreator = TextUtils.CHAR_SEQUENCE_CREATOR;
    w = ((CharSequence)localCreator.createFromParcel(paramParcel));
    x = paramParcel.readInt();
    y = ((CharSequence)localCreator.createFromParcel(paramParcel));
    z = paramParcel.createStringArrayList();
    A = paramParcel.createStringArrayList();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    B = bool;
  }
  
  public b(a parama)
  {
    int i = c.size();
    o = new int[i * 5];
    if (i)
    {
      p = new ArrayList(i);
      q = new int[i];
      r = new int[i];
      int j = 0;
      int k = 0;
      for (;;)
      {
        int m = k;
        if (j >= i) {
          break;
        }
        v.a locala = (v.a)c.get(j);
        o[m] = a;
        ArrayList localArrayList = p;
        Object localObject = b;
        if (localObject != null) {
          localObject = t;
        } else {
          localObject = null;
        }
        localArrayList.add(localObject);
        localObject = o;
        localObject[(m + 1)] = c;
        localObject[(m + 2)] = d;
        localObject[(m + 3)] = e;
        k = m + 5;
        localObject[(m + 4)] = f;
        q[j] = g.ordinal();
        r[j] = h.ordinal();
        j++;
      }
      s = h;
      t = k;
      u = v;
      v = l;
      w = m;
      x = n;
      y = o;
      z = p;
      A = q;
      B = r;
      return;
    }
    throw new IllegalStateException("Not on back stack");
  }
  
  public a a(n paramn)
  {
    a locala = new a(paramn);
    int i = 0;
    for (int j = 0;; j++)
    {
      int k = i;
      if (k >= o.length) {
        break;
      }
      v.a locala1 = new v.a();
      Object localObject = o;
      i = k + 1;
      a = localObject[k];
      if (n.D0(2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Instantiate ");
        ((StringBuilder)localObject).append(locala);
        ((StringBuilder)localObject).append(" op #");
        ((StringBuilder)localObject).append(j);
        ((StringBuilder)localObject).append(" base fragment #");
        ((StringBuilder)localObject).append(o[i]);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = (String)p.get(j);
      if (localObject != null) {}
      for (localObject = paramn.f0((String)localObject);; localObject = null)
      {
        b = ((Fragment)localObject);
        break;
      }
      g = androidx.lifecycle.d.c.values()[q[j]];
      h = androidx.lifecycle.d.c.values()[r[j]];
      localObject = o;
      int m = localObject[i];
      c = m;
      int n = localObject[(k + 2)];
      d = n;
      int i1 = localObject[(k + 3)];
      e = i1;
      i = k + 5;
      k = localObject[(k + 4)];
      f = k;
      d = m;
      e = n;
      f = i1;
      g = k;
      locala.e(locala1);
    }
    h = s;
    k = t;
    v = u;
    i = true;
    l = v;
    m = w;
    n = x;
    o = y;
    p = z;
    q = A;
    r = B;
    locala.m(1);
    return locala;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(o);
    paramParcel.writeStringList(p);
    paramParcel.writeIntArray(q);
    paramParcel.writeIntArray(r);
    paramParcel.writeInt(s);
    paramParcel.writeString(t);
    paramParcel.writeInt(u);
    paramParcel.writeInt(v);
    TextUtils.writeToParcel(w, paramParcel, 0);
    paramParcel.writeInt(x);
    TextUtils.writeToParcel(y, paramParcel, 0);
    paramParcel.writeStringList(z);
    paramParcel.writeStringList(A);
    paramParcel.writeInt(B);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */