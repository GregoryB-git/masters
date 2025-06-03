package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import e0.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager
  extends RecyclerView.j
{
  public int h = -1;
  public f[] i;
  public j j;
  public j k;
  public int l;
  public boolean m;
  public boolean n;
  public d o;
  public int p;
  public boolean q;
  public final a r;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    m = false;
    n = false;
    o = new d();
    p = 2;
    new Rect();
    new b();
    q = true;
    r = new a();
    paramAttributeSet = RecyclerView.j.x(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = a;
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    a(null);
    if (paramInt1 != l)
    {
      l = paramInt1;
      paramContext = j;
      j = k;
      k = paramContext;
      I();
    }
    paramInt1 = b;
    a(null);
    if (paramInt1 != h)
    {
      o.a();
      I();
      h = paramInt1;
      new BitSet(h);
      i = new f[h];
      for (paramInt1 = i1; paramInt1 < h; paramInt1++) {
        i[paramInt1] = new f(paramInt1);
      }
      I();
    }
    boolean bool = c;
    a(null);
    m = bool;
    I();
    new f();
    j = j.a(this, l);
    k = j.a(this, 1 - l);
  }
  
  public final void A()
  {
    o.a();
    for (int i1 = 0; i1 < h; i1++) {
      i[i1].b();
    }
  }
  
  public final void B(RecyclerView paramRecyclerView)
  {
    a locala = r;
    RecyclerView localRecyclerView = b;
    if (localRecyclerView != null) {
      localRecyclerView.removeCallbacks(locala);
    }
    for (int i1 = 0; i1 < h; i1++) {
      i[i1].b();
    }
    paramRecyclerView.requestLayout();
  }
  
  public final void C(AccessibilityEvent paramAccessibilityEvent)
  {
    super.C(paramAccessibilityEvent);
    if (p() > 0)
    {
      View localView = P(false);
      paramAccessibilityEvent = O(false);
      if ((localView != null) && (paramAccessibilityEvent != null))
      {
        RecyclerView.j.w(localView);
        throw null;
      }
    }
  }
  
  public final Parcelable D()
  {
    e locale = new e();
    p = m;
    int i1 = 0;
    q = false;
    r = false;
    Object localObject = o;
    if (localObject != null) {
      localObject.getClass();
    }
    e = 0;
    if (p() > 0)
    {
      Q();
      a = 0;
      if (n) {
        localObject = O(true);
      } else {
        localObject = P(true);
      }
      if (localObject == null)
      {
        b = -1;
        int i2 = h;
        c = i2;
        d = new int[i2];
        while (i1 < h)
        {
          int i3 = i[i1].e(Integer.MIN_VALUE);
          i2 = i3;
          if (i3 != Integer.MIN_VALUE) {
            i2 = i3 - j.e();
          }
          d[i1] = i2;
          i1++;
        }
      }
      RecyclerView.j.w((View)localObject);
      throw null;
    }
    a = -1;
    b = -1;
    c = 0;
    return locale;
  }
  
  public final void E(int paramInt)
  {
    if (paramInt == 0) {
      K();
    }
  }
  
  public final boolean K()
  {
    if ((p() != 0) && (p != 0) && (e))
    {
      if (n)
      {
        R();
        Q();
      }
      else
      {
        Q();
        R();
      }
      if (S() != null)
      {
        o.a();
        I();
        return true;
      }
    }
    return false;
  }
  
  public final int L(RecyclerView.s params)
  {
    if (p() == 0) {
      return 0;
    }
    return n.a(params, j, P(q ^ true), O(q ^ true), this, q);
  }
  
  public final void M(RecyclerView.s params)
  {
    if (p() == 0) {
      return;
    }
    View localView1 = P(q ^ true);
    View localView2 = O(q ^ true);
    if ((p() != 0) && (params.a() != 0) && (localView1 != null) && (localView2 != null))
    {
      RecyclerView.j.w(localView1);
      throw null;
    }
  }
  
  public final int N(RecyclerView.s params)
  {
    if (p() == 0) {
      return 0;
    }
    return n.b(params, j, P(q ^ true), O(q ^ true), this, q);
  }
  
  public final View O(boolean paramBoolean)
  {
    int i1 = j.e();
    int i2 = j.d();
    int i3 = p() - 1;
    Object localObject2;
    for (Object localObject1 = null; i3 >= 0; localObject1 = localObject2)
    {
      View localView = o(i3);
      int i4 = j.c(localView);
      int i5 = j.b(localView);
      localObject2 = localObject1;
      if (i5 > i1) {
        if (i4 >= i2)
        {
          localObject2 = localObject1;
        }
        else if ((i5 > i2) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      i3--;
    }
    return (View)localObject1;
  }
  
  public final View P(boolean paramBoolean)
  {
    int i1 = j.e();
    int i2 = j.d();
    int i3 = p();
    Object localObject1 = null;
    int i4 = 0;
    while (i4 < i3)
    {
      View localView = o(i4);
      int i5 = j.c(localView);
      Object localObject2 = localObject1;
      if (j.b(localView) > i1) {
        if (i5 >= i2)
        {
          localObject2 = localObject1;
        }
        else if ((i5 < i1) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      i4++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  public final void Q()
  {
    if (p() == 0) {
      return;
    }
    RecyclerView.j.w(o(0));
    throw null;
  }
  
  public final void R()
  {
    int i1 = p();
    if (i1 == 0) {
      return;
    }
    RecyclerView.j.w(o(i1 - 1));
    throw null;
  }
  
  public final View S()
  {
    int i1 = p() - 1;
    new BitSet(h).set(0, h, true);
    int i2 = l;
    int i3 = -1;
    if (i2 == 1) {
      T();
    }
    if (!n)
    {
      i3 = i1 + 1;
      i1 = 0;
    }
    if (i1 == i3) {
      return null;
    }
    ((c)o(i1).getLayoutParams()).getClass();
    throw null;
  }
  
  public final boolean T()
  {
    RecyclerView localRecyclerView = b;
    WeakHashMap localWeakHashMap = d0.a;
    int i1 = localRecyclerView.getLayoutDirection();
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final void a(String paramString)
  {
    super.a(paramString);
  }
  
  public final boolean b()
  {
    boolean bool;
    if (l == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean c()
  {
    int i1 = l;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean d(RecyclerView.k paramk)
  {
    return paramk instanceof c;
  }
  
  public final int f(RecyclerView.s params)
  {
    return L(params);
  }
  
  public final void g(RecyclerView.s params)
  {
    M(params);
  }
  
  public final int h(RecyclerView.s params)
  {
    return N(params);
  }
  
  public final int i(RecyclerView.s params)
  {
    return L(params);
  }
  
  public final void j(RecyclerView.s params)
  {
    M(params);
  }
  
  public final int k(RecyclerView.s params)
  {
    return N(params);
  }
  
  public final RecyclerView.k l()
  {
    if (l == 0) {
      return new c(-2, -1);
    }
    return new c(-1, -2);
  }
  
  public final RecyclerView.k m(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new c(paramContext, paramAttributeSet);
  }
  
  public final RecyclerView.k n(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new c((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new c(paramLayoutParams);
  }
  
  public final boolean z()
  {
    boolean bool;
    if (p != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      K();
    }
  }
  
  public final class b
  {
    public b()
    {
      a();
    }
    
    public final void a() {}
  }
  
  public static final class c
    extends RecyclerView.k
  {
    public c(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public c(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public c(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public c(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  public static final class d
  {
    public List<a> a;
    
    public final void a()
    {
      a = null;
    }
    
    public static final class a
      implements Parcelable
    {
      public static final Parcelable.Creator<a> CREATOR = new a();
      public int a;
      public int b;
      public int[] c;
      public boolean d;
      
      public a() {}
      
      public a(Parcel paramParcel)
      {
        a = paramParcel.readInt();
        b = paramParcel.readInt();
        int i = paramParcel.readInt();
        boolean bool = true;
        if (i != 1) {
          bool = false;
        }
        d = bool;
        i = paramParcel.readInt();
        if (i > 0)
        {
          int[] arrayOfInt = new int[i];
          c = arrayOfInt;
          paramParcel.readIntArray(arrayOfInt);
        }
      }
      
      public final int describeContents()
      {
        return 0;
      }
      
      public final String toString()
      {
        StringBuilder localStringBuilder = f.l("FullSpanItem{mPosition=");
        localStringBuilder.append(a);
        localStringBuilder.append(", mGapDir=");
        localStringBuilder.append(b);
        localStringBuilder.append(", mHasUnwantedGapAfter=");
        localStringBuilder.append(d);
        localStringBuilder.append(", mGapPerSpan=");
        localStringBuilder.append(Arrays.toString(c));
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
      
      public final void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(a);
        paramParcel.writeInt(b);
        paramParcel.writeInt(d);
        int[] arrayOfInt = c;
        if ((arrayOfInt != null) && (arrayOfInt.length > 0))
        {
          paramParcel.writeInt(arrayOfInt.length);
          paramParcel.writeIntArray(c);
        }
        else
        {
          paramParcel.writeInt(0);
        }
      }
      
      public final class a
        implements Parcelable.Creator<StaggeredGridLayoutManager.d.a>
      {
        public final Object createFromParcel(Parcel paramParcel)
        {
          return new StaggeredGridLayoutManager.d.a(paramParcel);
        }
        
        public final Object[] newArray(int paramInt)
        {
          return new StaggeredGridLayoutManager.d.a[paramInt];
        }
      }
    }
  }
  
  public static final class e
    implements Parcelable
  {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List<StaggeredGridLayoutManager.d.a> o;
    public boolean p;
    public boolean q;
    public boolean r;
    
    public e() {}
    
    public e(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      b = paramParcel.readInt();
      int i = paramParcel.readInt();
      c = i;
      int[] arrayOfInt;
      if (i > 0)
      {
        arrayOfInt = new int[i];
        d = arrayOfInt;
        paramParcel.readIntArray(arrayOfInt);
      }
      i = paramParcel.readInt();
      e = i;
      if (i > 0)
      {
        arrayOfInt = new int[i];
        f = arrayOfInt;
        paramParcel.readIntArray(arrayOfInt);
      }
      i = paramParcel.readInt();
      boolean bool1 = false;
      if (i == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      p = bool2;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      q = bool2;
      boolean bool2 = bool1;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      }
      r = bool2;
      o = paramParcel.readArrayList(StaggeredGridLayoutManager.d.a.class.getClassLoader());
    }
    
    public e(e parame)
    {
      c = c;
      a = a;
      b = b;
      d = d;
      e = e;
      f = f;
      p = p;
      q = q;
      r = r;
      o = o;
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
      if (c > 0) {
        paramParcel.writeIntArray(d);
      }
      paramParcel.writeInt(e);
      if (e > 0) {
        paramParcel.writeIntArray(f);
      }
      paramParcel.writeInt(p);
      paramParcel.writeInt(q);
      paramParcel.writeInt(r);
      paramParcel.writeList(o);
    }
    
    public final class a
      implements Parcelable.Creator<StaggeredGridLayoutManager.e>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new StaggeredGridLayoutManager.e(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new StaggeredGridLayoutManager.e[paramInt];
      }
    }
  }
  
  public final class f
  {
    public ArrayList<View> a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public final int d;
    
    public f(int paramInt)
    {
      d = paramInt;
    }
    
    public static StaggeredGridLayoutManager.c d(View paramView)
    {
      return (StaggeredGridLayoutManager.c)paramView.getLayoutParams();
    }
    
    public final void a()
    {
      Object localObject = a;
      localObject = (View)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      StaggeredGridLayoutManager.c localc = d((View)localObject);
      c = j.b((View)localObject);
      localc.getClass();
    }
    
    public final void b()
    {
      a.clear();
      b = Integer.MIN_VALUE;
      c = Integer.MIN_VALUE;
    }
    
    public final int c(int paramInt)
    {
      int i = c;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      if (a.size() == 0) {
        return paramInt;
      }
      a();
      return c;
    }
    
    public final int e(int paramInt)
    {
      int i = b;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      if (a.size() == 0) {
        return paramInt;
      }
      View localView = (View)a.get(0);
      StaggeredGridLayoutManager.c localc = d(localView);
      b = j.c(localView);
      localc.getClass();
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */