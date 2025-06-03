package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a
  extends v
  implements n.n
{
  public final n t;
  public boolean u;
  public int v = -1;
  
  public a(n paramn)
  {
    super(localj, localClassLoader);
    t = paramn;
  }
  
  public static boolean w(v.a parama)
  {
    parama = b;
    boolean bool;
    if ((parama != null) && (z) && (V != null) && (!O) && (!N) && (parama.a0())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Fragment A(ArrayList paramArrayList, Fragment paramFragment)
  {
    for (int i = c.size() - 1; i >= 0; i--)
    {
      v.a locala = (v.a)c.get(i);
      int j = a;
      if (j != 1)
      {
        if (j != 3) {}
        switch (j)
        {
        default: 
          break;
        case 10: 
          h = g;
          break;
        case 9: 
          paramFragment = b;
          break;
        case 8: 
          paramFragment = null;
          break;
        case 6: 
          paramArrayList.add(b);
          break;
        }
      }
      else
      {
        paramArrayList.remove(b);
      }
    }
    return paramFragment;
  }
  
  public boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Run: ");
      localStringBuilder.append(this);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    paramArrayList1.add(this);
    paramArrayList2.add(Boolean.FALSE);
    if (i) {
      t.e(this);
    }
    return true;
  }
  
  public int f()
  {
    return n(false);
  }
  
  public int g()
  {
    return n(true);
  }
  
  public void h()
  {
    i();
    t.b0(this, true);
  }
  
  public void j(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    super.j(paramInt1, paramFragment, paramString, paramInt2);
    G = t;
  }
  
  public v k(Fragment paramFragment)
  {
    Object localObject = G;
    if ((localObject != null) && (localObject != t))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
      ((StringBuilder)localObject).append(paramFragment.toString());
      ((StringBuilder)localObject).append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return super.k(paramFragment);
  }
  
  public void m(int paramInt)
  {
    if (!this.i) {
      return;
    }
    Object localObject1;
    if (n.D0(2))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Bump nesting in ");
      ((StringBuilder)localObject1).append(this);
      ((StringBuilder)localObject1).append(" by ");
      ((StringBuilder)localObject1).append(paramInt);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    int i = c.size();
    for (int j = 0; j < i; j++)
    {
      localObject1 = (v.a)c.get(j);
      Object localObject2 = b;
      if (localObject2 != null)
      {
        F += paramInt;
        if (n.D0(2))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Bump nesting of ");
          ((StringBuilder)localObject2).append(b);
          ((StringBuilder)localObject2).append(" to ");
          ((StringBuilder)localObject2).append(b.F);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
      }
    }
  }
  
  public int n(boolean paramBoolean)
  {
    if (!u)
    {
      if (n.D0(2))
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Commit: ");
        ((StringBuilder)localObject).append(this);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        localObject = new PrintWriter(new A("FragmentManager"));
        o("  ", (PrintWriter)localObject);
        ((PrintWriter)localObject).close();
      }
      u = true;
      if (this.i) {}
      for (int i = t.j();; i = -1)
      {
        v = i;
        break;
      }
      t.Y(this, paramBoolean);
      return v;
    }
    throw new IllegalStateException("commit already called");
  }
  
  public void o(String paramString, PrintWriter paramPrintWriter)
  {
    p(paramString, paramPrintWriter, true);
  }
  
  public void p(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(k);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(v);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(u);
      if (h != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(h));
      }
      if ((d != 0) || (e != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(d));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(e));
      }
      if ((f != 0) || (g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(f));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(g));
      }
      if ((l != 0) || (m != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(l));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(m);
      }
      if ((n != 0) || (o != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(n));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(o);
      }
    }
    if (!c.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = c.size();
      for (int j = 0; j < i; j++)
      {
        v.a locala = (v.a)c.get(j);
        Object localObject;
        switch (a)
        {
        default: 
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("cmd=");
          ((StringBuilder)localObject).append(a);
          localObject = ((StringBuilder)localObject).toString();
          break;
        case 10: 
          localObject = "OP_SET_MAX_LIFECYCLE";
          break;
        case 9: 
          localObject = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject = "ATTACH";
          break;
        case 6: 
          localObject = "DETACH";
          break;
        case 5: 
          localObject = "SHOW";
          break;
        case 4: 
          localObject = "HIDE";
          break;
        case 3: 
          localObject = "REMOVE";
          break;
        case 2: 
          localObject = "REPLACE";
          break;
        case 1: 
          localObject = "ADD";
          break;
        case 0: 
          localObject = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.print((String)localObject);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(b);
        if (paramBoolean)
        {
          if ((c != 0) || (d != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(d));
          }
          if ((e != 0) || (f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(e));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(f));
          }
        }
      }
    }
  }
  
  public void q()
  {
    int i = c.size();
    Object localObject1;
    for (int j = 0; j < i; j++)
    {
      localObject1 = (v.a)c.get(j);
      Object localObject2 = b;
      if (localObject2 != null)
      {
        ((Fragment)localObject2).A1(h);
        ((Fragment)localObject2).E1(p, q);
      }
      switch (a)
      {
      case 2: 
      default: 
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Unknown cmd: ");
        ((StringBuilder)localObject2).append(a);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 10: 
        t.h1((Fragment)localObject2, h);
        break;
      case 9: 
        t.i1(null);
        break;
      case 8: 
        t.i1((Fragment)localObject2);
        break;
      case 7: 
        ((Fragment)localObject2).z1(c);
        t.g1((Fragment)localObject2, false);
        t.l((Fragment)localObject2);
        break;
      case 6: 
        ((Fragment)localObject2).z1(d);
        t.x((Fragment)localObject2);
        break;
      case 5: 
        ((Fragment)localObject2).z1(c);
        t.g1((Fragment)localObject2, false);
        t.k1((Fragment)localObject2);
        break;
      case 4: 
        ((Fragment)localObject2).z1(d);
        t.B0((Fragment)localObject2);
        break;
      case 3: 
        ((Fragment)localObject2).z1(d);
        t.Y0((Fragment)localObject2);
        break;
      case 1: 
        ((Fragment)localObject2).z1(c);
        t.g1((Fragment)localObject2, false);
        t.g((Fragment)localObject2);
      }
      if ((!r) && (a != 1) && (localObject2 != null) && (!n.P)) {
        t.L0((Fragment)localObject2);
      }
    }
    if ((!r) && (!n.P))
    {
      localObject1 = t;
      ((n)localObject1).M0(q, true);
    }
  }
  
  public void r(boolean paramBoolean)
  {
    Object localObject1;
    for (int i = c.size() - 1; i >= 0; i--)
    {
      localObject1 = (v.a)c.get(i);
      Object localObject2 = b;
      if (localObject2 != null)
      {
        ((Fragment)localObject2).A1(n.d1(h));
        ((Fragment)localObject2).E1(q, p);
      }
      switch (a)
      {
      case 2: 
      default: 
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Unknown cmd: ");
        ((StringBuilder)localObject2).append(a);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 10: 
        t.h1((Fragment)localObject2, g);
        break;
      case 9: 
        t.i1((Fragment)localObject2);
        break;
      case 8: 
        t.i1(null);
        break;
      case 7: 
        ((Fragment)localObject2).z1(f);
        t.g1((Fragment)localObject2, true);
        t.x((Fragment)localObject2);
        break;
      case 6: 
        ((Fragment)localObject2).z1(e);
        t.l((Fragment)localObject2);
        break;
      case 5: 
        ((Fragment)localObject2).z1(f);
        t.g1((Fragment)localObject2, true);
        t.B0((Fragment)localObject2);
        break;
      case 4: 
        ((Fragment)localObject2).z1(e);
        t.k1((Fragment)localObject2);
        break;
      case 3: 
        ((Fragment)localObject2).z1(e);
        t.g((Fragment)localObject2);
        break;
      case 1: 
        ((Fragment)localObject2).z1(f);
        t.g1((Fragment)localObject2, true);
        t.Y0((Fragment)localObject2);
      }
      if ((!r) && (a != 3) && (localObject2 != null) && (!n.P)) {
        t.L0((Fragment)localObject2);
      }
    }
    if ((!r) && (paramBoolean) && (!n.P))
    {
      localObject1 = t;
      ((n)localObject1).M0(q, true);
    }
  }
  
  public Fragment s(ArrayList paramArrayList, Fragment paramFragment)
  {
    int i = 0;
    for (Fragment localFragment1 = paramFragment; i < c.size(); localFragment1 = paramFragment)
    {
      Object localObject = (v.a)c.get(i);
      int j = a;
      if (j != 1) {
        if (j != 2)
        {
          if ((j != 3) && (j != 6))
          {
            if (j != 7)
            {
              if (j != 8)
              {
                paramFragment = localFragment1;
                j = i;
                break label442;
              }
              c.add(i, new v.a(9, localFragment1));
              j = i + 1;
              paramFragment = b;
              break label442;
            }
          }
          else
          {
            paramArrayList.remove(b);
            localObject = b;
            paramFragment = localFragment1;
            j = i;
            if (localObject != localFragment1) {
              break label442;
            }
            c.add(i, new v.a(9, (Fragment)localObject));
            j = i + 1;
            paramFragment = null;
            break label442;
          }
        }
        else
        {
          Fragment localFragment2 = b;
          int k = L;
          int m = paramArrayList.size() - 1;
          int n = 0;
          j = i;
          paramFragment = localFragment1;
          while (m >= 0)
          {
            Fragment localFragment3 = (Fragment)paramArrayList.get(m);
            localFragment1 = paramFragment;
            int i1 = j;
            i = n;
            if (L == k) {
              if (localFragment3 == localFragment2)
              {
                i = 1;
                localFragment1 = paramFragment;
                i1 = j;
              }
              else
              {
                localFragment1 = paramFragment;
                i = j;
                if (localFragment3 == paramFragment)
                {
                  c.add(j, new v.a(9, localFragment3));
                  i = j + 1;
                  localFragment1 = null;
                }
                paramFragment = new v.a(3, localFragment3);
                c = c;
                e = e;
                d = d;
                f = f;
                c.add(i, paramFragment);
                paramArrayList.remove(localFragment3);
                i1 = i + 1;
                i = n;
              }
            }
            m--;
            paramFragment = localFragment1;
            j = i1;
            n = i;
          }
          if (n != 0)
          {
            c.remove(j);
            j--;
            break label442;
          }
          a = 1;
          paramArrayList.add(localFragment2);
          break label442;
        }
      }
      paramArrayList.add(b);
      j = i;
      paramFragment = localFragment1;
      label442:
      i = j + 1;
    }
    return localFragment1;
  }
  
  public String t()
  {
    return k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (v >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(v);
    }
    if (k != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(k);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public boolean u(int paramInt)
  {
    int i = c.size();
    for (int j = 0; j < i; j++)
    {
      Fragment localFragment = c.get(j)).b;
      int k;
      if (localFragment != null) {
        k = L;
      } else {
        k = 0;
      }
      if ((k != 0) && (k == paramInt)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean v(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    if (paramInt2 == paramInt1) {
      return false;
    }
    int i = c.size();
    int j = -1;
    int k = 0;
    while (k < i)
    {
      Object localObject = c.get(k)).b;
      int m;
      if (localObject != null) {
        m = L;
      } else {
        m = 0;
      }
      int n = j;
      if (m != 0)
      {
        n = j;
        if (m != j)
        {
          for (j = paramInt1; j < paramInt2; j++)
          {
            localObject = (a)paramArrayList.get(j);
            int i1 = c.size();
            for (n = 0; n < i1; n++)
            {
              Fragment localFragment = c.get(n)).b;
              int i2;
              if (localFragment != null) {
                i2 = L;
              } else {
                i2 = 0;
              }
              if (i2 == m) {
                return true;
              }
            }
          }
          n = m;
        }
      }
      k++;
      j = n;
    }
    return false;
  }
  
  public boolean x()
  {
    for (int i = 0; i < c.size(); i++) {
      if (w((v.a)c.get(i))) {
        return true;
      }
    }
    return false;
  }
  
  public void y()
  {
    if (s != null)
    {
      for (int i = 0; i < s.size(); i++) {
        ((Runnable)s.get(i)).run();
      }
      s = null;
    }
  }
  
  public void z(Fragment.k paramk)
  {
    for (int i = 0; i < c.size(); i++)
    {
      v.a locala = (v.a)c.get(i);
      if (w(locala)) {
        b.B1(paramk);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */