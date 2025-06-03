package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import f;

public class LinearLayoutManager
  extends RecyclerView.j
{
  public int h = 1;
  public b i;
  public j j;
  public boolean k = false;
  public boolean l = false;
  public boolean m = false;
  public boolean n = true;
  public c o = null;
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    new a();
    paramContext = RecyclerView.j.x(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = a;
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      throw new IllegalArgumentException(f.h("invalid orientation:", paramInt1));
    }
    a(null);
    if ((paramInt1 != h) || (j == null))
    {
      j = j.a(this, paramInt1);
      h = paramInt1;
      I();
    }
    boolean bool = c;
    a(null);
    if (bool != k)
    {
      k = bool;
      I();
    }
    R(d);
  }
  
  public final void B(RecyclerView paramRecyclerView) {}
  
  public final void C(AccessibilityEvent paramAccessibilityEvent)
  {
    super.C(paramAccessibilityEvent);
    if (p() > 0)
    {
      View localView = Q(0, p(), false);
      if (localView == null)
      {
        paramAccessibilityEvent.setFromIndex(-1);
        localView = Q(p() - 1, -1, false);
        if (localView == null)
        {
          paramAccessibilityEvent.setToIndex(-1);
        }
        else
        {
          RecyclerView.j.w(localView);
          throw null;
        }
      }
      else
      {
        RecyclerView.j.w(localView);
        throw null;
      }
    }
  }
  
  public final Parcelable D()
  {
    Object localObject = o;
    if (localObject != null) {
      return new c((c)localObject);
    }
    c localc = new c();
    if (p() > 0)
    {
      N();
      boolean bool1 = l;
      int i1 = 0;
      int i2 = 0;
      boolean bool2 = false ^ bool1;
      c = bool2;
      if (bool2)
      {
        if (!bool1) {
          i2 = p() - 1;
        }
        localObject = o(i2);
        b = (j.d() - j.b((View)localObject));
        RecyclerView.j.w((View)localObject);
        throw null;
      }
      i2 = i1;
      if (bool1) {
        i2 = p() - 1;
      }
      RecyclerView.j.w(o(i2));
      throw null;
    }
    a = -1;
    return localc;
  }
  
  public final int K(RecyclerView.s params)
  {
    if (p() == 0) {
      return 0;
    }
    N();
    return n.a(params, j, P(n ^ true), O(n ^ true), this, n);
  }
  
  public final void L(RecyclerView.s params)
  {
    if (p() == 0) {
      return;
    }
    N();
    View localView1 = P(n ^ true);
    View localView2 = O(n ^ true);
    if ((p() != 0) && (params.a() != 0) && (localView1 != null) && (localView2 != null))
    {
      RecyclerView.j.w(localView1);
      throw null;
    }
  }
  
  public final int M(RecyclerView.s params)
  {
    if (p() == 0) {
      return 0;
    }
    N();
    return n.b(params, j, P(n ^ true), O(n ^ true), this, n);
  }
  
  public final void N()
  {
    if (i == null) {
      i = new b();
    }
  }
  
  public final View O(boolean paramBoolean)
  {
    boolean bool = l;
    int i1 = -1;
    int i2;
    if (bool)
    {
      i2 = 0;
      i1 = p();
    }
    else
    {
      i2 = p() - 1;
    }
    return Q(i2, i1, paramBoolean);
  }
  
  public final View P(boolean paramBoolean)
  {
    boolean bool = l;
    int i1 = -1;
    int i2;
    if (bool)
    {
      i2 = p() - 1;
    }
    else
    {
      i2 = 0;
      i1 = p();
    }
    return Q(i2, i1, paramBoolean);
  }
  
  public final View Q(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    N();
    int i1;
    if (paramBoolean) {
      i1 = 24579;
    } else {
      i1 = 320;
    }
    p localp;
    if (h == 0) {
      localp = c;
    } else {
      localp = d;
    }
    return localp.a(paramInt1, paramInt2, i1, 320);
  }
  
  public void R(boolean paramBoolean)
  {
    a(null);
    if (m == paramBoolean) {
      return;
    }
    m = paramBoolean;
    I();
  }
  
  public final void a(String paramString)
  {
    if (o == null) {
      super.a(paramString);
    }
  }
  
  public final boolean b()
  {
    boolean bool;
    if (h == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean c()
  {
    int i1 = h;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final int f(RecyclerView.s params)
  {
    return K(params);
  }
  
  public void g(RecyclerView.s params)
  {
    L(params);
  }
  
  public int h(RecyclerView.s params)
  {
    return M(params);
  }
  
  public final int i(RecyclerView.s params)
  {
    return K(params);
  }
  
  public void j(RecyclerView.s params)
  {
    L(params);
  }
  
  public int k(RecyclerView.s params)
  {
    return M(params);
  }
  
  public RecyclerView.k l()
  {
    return new RecyclerView.k(-2, -2);
  }
  
  public final boolean z()
  {
    return true;
  }
  
  public static final class a
  {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    
    public a()
    {
      a();
    }
    
    public final void a()
    {
      a = -1;
      b = Integer.MIN_VALUE;
      c = false;
      d = false;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("AnchorInfo{mPosition=");
      localStringBuilder.append(a);
      localStringBuilder.append(", mCoordinate=");
      localStringBuilder.append(b);
      localStringBuilder.append(", mLayoutFromEnd=");
      localStringBuilder.append(c);
      localStringBuilder.append(", mValid=");
      localStringBuilder.append(d);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b {}
  
  public static final class c
    implements Parcelable
  {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public int a;
    public int b;
    public boolean c;
    
    public c() {}
    
    public c(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      b = paramParcel.readInt();
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      c = bool;
    }
    
    public c(c paramc)
    {
      a = a;
      b = b;
      c = c;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
      paramParcel.writeInt(b);
      paramParcel.writeInt(c);
    }
    
    public final class a
      implements Parcelable.Creator<LinearLayoutManager.c>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new LinearLayoutManager.c(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new LinearLayoutManager.c[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */