package J;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public class u$a
{
  public static final a A;
  public static final a B;
  public static final a C;
  public static final a D;
  public static final a E;
  public static final a F;
  public static final a G;
  public static final a H;
  public static final a I;
  public static final a J;
  public static final a K;
  public static final a L;
  public static final a M;
  public static final a N;
  public static final a O;
  public static final a P;
  public static final a Q;
  public static final a R;
  public static final a S;
  public static final a T;
  public static final a d;
  public static final a e;
  public static final a f;
  public static final a g;
  public static final a h;
  public static final a i;
  public static final a j;
  public static final a k;
  public static final a l;
  public static final a m;
  public static final a n;
  public static final a o;
  public static final a p;
  public static final a q;
  public static final a r;
  public static final a s;
  public static final a t;
  public static final a u;
  public static final a v;
  public static final a w;
  public static final a x;
  public static final a y;
  public static final a z;
  public final Object a;
  public final int b;
  public final Class c;
  
  static
  {
    Object localObject1 = null;
    d = new a(1, null);
    e = new a(2, null);
    f = new a(4, null);
    g = new a(8, null);
    h = new a(16, null);
    i = new a(32, null);
    j = new a(64, null);
    k = new a(128, null);
    l = new a(256, null, x.b.class);
    m = new a(512, null, x.b.class);
    n = new a(1024, null, x.c.class);
    o = new a(2048, null, x.c.class);
    p = new a(4096, null);
    q = new a(8192, null);
    r = new a(16384, null);
    s = new a(32768, null);
    t = new a(65536, null);
    u = new a(131072, null, x.g.class);
    v = new a(262144, null);
    w = new a(524288, null);
    x = new a(1048576, null);
    y = new a(2097152, null, x.h.class);
    int i1 = Build.VERSION.SDK_INT;
    z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
    A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, x.e.class);
    B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
    C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
    D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
    E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
    if (i1 >= 29) {
      localObject2 = g.a();
    } else {
      localObject2 = null;
    }
    F = new a(localObject2, 16908358, null, null, null);
    if (i1 >= 29) {
      localObject2 = p.a();
    } else {
      localObject2 = null;
    }
    G = new a(localObject2, 16908359, null, null, null);
    if (i1 >= 29) {
      localObject2 = q.a();
    } else {
      localObject2 = null;
    }
    H = new a(localObject2, 16908360, null, null, null);
    if (i1 >= 29) {
      localObject2 = r.a();
    } else {
      localObject2 = null;
    }
    I = new a(localObject2, 16908361, null, null, null);
    J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
    if (i1 >= 24) {
      localObject2 = s.a();
    } else {
      localObject2 = null;
    }
    K = new a(localObject2, 16908349, null, null, x.f.class);
    if (i1 >= 26) {
      localObject2 = t.a();
    } else {
      localObject2 = null;
    }
    L = new a(localObject2, 16908354, null, null, x.d.class);
    if (i1 >= 28) {
      localObject2 = h.a();
    } else {
      localObject2 = null;
    }
    M = new a(localObject2, 16908356, null, null, null);
    if (i1 >= 28) {
      localObject2 = i.a();
    } else {
      localObject2 = null;
    }
    N = new a(localObject2, 16908357, null, null, null);
    if (i1 >= 30) {
      localObject2 = j.a();
    } else {
      localObject2 = null;
    }
    O = new a(localObject2, 16908362, null, null, null);
    if (i1 >= 30) {
      localObject2 = k.a();
    } else {
      localObject2 = null;
    }
    P = new a(localObject2, 16908372, null, null, null);
    if (i1 >= 32) {
      localObject2 = l.a();
    } else {
      localObject2 = null;
    }
    Q = new a(localObject2, 16908373, null, null, null);
    if (i1 >= 32) {
      localObject2 = m.a();
    } else {
      localObject2 = null;
    }
    R = new a(localObject2, 16908374, null, null, null);
    if (i1 >= 32) {
      localObject2 = n.a();
    } else {
      localObject2 = null;
    }
    S = new a(localObject2, 16908375, null, null, null);
    Object localObject2 = localObject1;
    if (i1 >= 33) {
      localObject2 = o.a();
    }
    T = new a(localObject2, 16908376, null, null, null);
  }
  
  public u$a(int paramInt, CharSequence paramCharSequence)
  {
    this(null, paramInt, paramCharSequence, null, null);
  }
  
  public u$a(int paramInt, CharSequence paramCharSequence, Class paramClass)
  {
    this(null, paramInt, paramCharSequence, null, paramClass);
  }
  
  public u$a(Object paramObject)
  {
    this(paramObject, 0, null, null, null);
  }
  
  public u$a(Object paramObject, int paramInt, CharSequence paramCharSequence, x paramx, Class paramClass)
  {
    b = paramInt;
    paramx = (x)paramObject;
    if (paramObject == null) {
      paramx = new AccessibilityNodeInfo.AccessibilityAction(paramInt, paramCharSequence);
    }
    a = paramx;
    c = paramClass;
  }
  
  public int a()
  {
    return ((AccessibilityNodeInfo.AccessibilityAction)a).getId();
  }
  
  public CharSequence b()
  {
    return ((AccessibilityNodeInfo.AccessibilityAction)a).getLabel();
  }
  
  public boolean c(View paramView, Bundle paramBundle)
  {
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    Object localObject = (a)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!paramObject.equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i1;
    if (localObject != null) {
      i1 = localObject.hashCode();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AccessibilityActionCompat: ");
    String str1 = u.g(b);
    String str2 = str1;
    if (str1.equals("ACTION_UNKNOWN"))
    {
      str2 = str1;
      if (b() != null) {
        str2 = b().toString();
      }
    }
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     J.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */