package e0;

import android.os.Build.VERSION;
import android.view.View;
import java.util.Objects;
import x.b;

public class s0$k
{
  public static final s0 b;
  public final s0 a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 30) {
      localObject = new s0.d();
    } else if (i >= 29) {
      localObject = new s0.c();
    } else {
      localObject = new s0.b();
    }
    b = ba.a().a.b().a.c();
  }
  
  public s0$k(s0 params0)
  {
    a = params0;
  }
  
  public s0 a()
  {
    return a;
  }
  
  public s0 b()
  {
    return a;
  }
  
  public s0 c()
  {
    return a;
  }
  
  public void d(View paramView) {}
  
  public h e()
  {
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = (k)paramObject;
    if ((j() != ((k)paramObject).j()) || (i() != ((k)paramObject).i()) || (!Objects.equals(g(), ((k)paramObject).g())) || (!Objects.equals(f(), ((k)paramObject).f())) || (!Objects.equals(e(), ((k)paramObject).e()))) {
      bool = false;
    }
    return bool;
  }
  
  public b f()
  {
    return b.e;
  }
  
  public b g()
  {
    return b.e;
  }
  
  public s0 h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return b;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e() });
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j()
  {
    return false;
  }
  
  public void k(b[] paramArrayOfb) {}
  
  public void l(s0 params0) {}
  
  public void m(b paramb) {}
}

/* Location:
 * Qualified Name:     e0.s0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */