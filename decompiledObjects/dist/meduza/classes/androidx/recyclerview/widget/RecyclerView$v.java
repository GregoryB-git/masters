package androidx.recyclerview.widget;

import android.util.Log;
import e0.d0;
import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView$v
{
  public static final List<Object> m = ;
  public int a;
  public int b;
  public long c;
  public int d;
  public v e;
  public int f;
  public ArrayList g;
  public List<Object> h;
  public int i;
  public RecyclerView.p j;
  public boolean k;
  public RecyclerView l;
  
  public final void a(Object paramObject)
  {
    if (paramObject == null)
    {
      b(1024);
    }
    else if ((0x400 & f) == 0)
    {
      if (g == null)
      {
        ArrayList localArrayList = new ArrayList();
        g = localArrayList;
        h = Collections.unmodifiableList(localArrayList);
      }
      g.add(paramObject);
    }
  }
  
  public final void b(int paramInt)
  {
    f = (paramInt | f);
  }
  
  public final int c()
  {
    int n = d;
    int i1 = n;
    if (n == -1) {
      i1 = a;
    }
    return i1;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((f & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((f & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f()
  {
    boolean bool;
    if (j != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean g()
  {
    boolean bool;
    if ((f & 0x100) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void h(boolean paramBoolean)
  {
    int n = i;
    if (paramBoolean) {
      n--;
    } else {
      n++;
    }
    i = n;
    if (n < 0)
    {
      i = 0;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
      localStringBuilder.append(this);
      Log.e("View", localStringBuilder.toString());
    }
    else
    {
      if ((!paramBoolean) && (n == 1)) {}
      for (n = f | 0x10;; n = f & 0xFFFFFFEF)
      {
        f = n;
        break;
        if ((!paramBoolean) || (n != 0)) {
          break;
        }
      }
    }
  }
  
  public final String toString()
  {
    if (v.class.isAnonymousClass()) {
      localObject = "ViewHolder";
    } else {
      localObject = v.class.getSimpleName();
    }
    Object localObject = g.g((String)localObject, "{");
    ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
    ((StringBuilder)localObject).append(" position=");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(" id=");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append(", oldPos=");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(", pLpos:");
    ((StringBuilder)localObject).append(d);
    new StringBuilder(((StringBuilder)localObject).toString());
    if ((f & 0x10) != 0) {
      throw null;
    }
    localObject = d0.a;
    throw null;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */