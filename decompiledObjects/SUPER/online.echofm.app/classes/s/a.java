package s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

public class a
  implements c
{
  public void a(b paramb, float paramFloat)
  {
    paramb.a().setElevation(paramFloat);
  }
  
  public float b(b paramb)
  {
    return o(paramb).d();
  }
  
  public float c(b paramb)
  {
    return b(paramb) * 2.0F;
  }
  
  public void d(b paramb)
  {
    l(paramb, i(paramb));
  }
  
  public float e(b paramb)
  {
    return paramb.a().getElevation();
  }
  
  public void f() {}
  
  public void g(b paramb, float paramFloat)
  {
    o(paramb).h(paramFloat);
  }
  
  public ColorStateList h(b paramb)
  {
    return o(paramb).b();
  }
  
  public float i(b paramb)
  {
    return o(paramb).c();
  }
  
  public void j(b paramb, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramb.c(new d(paramColorStateList, paramFloat1));
    paramContext = paramb.a();
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    l(paramb, paramFloat3);
  }
  
  public void k(b paramb)
  {
    l(paramb, i(paramb));
  }
  
  public void l(b paramb, float paramFloat)
  {
    o(paramb).g(paramFloat, paramb.e(), paramb.d());
    p(paramb);
  }
  
  public void m(b paramb, ColorStateList paramColorStateList)
  {
    o(paramb).f(paramColorStateList);
  }
  
  public float n(b paramb)
  {
    return b(paramb) * 2.0F;
  }
  
  public final d o(b paramb)
  {
    return (d)paramb.f();
  }
  
  public void p(b paramb)
  {
    if (!paramb.e())
    {
      paramb.b(0, 0, 0, 0);
      return;
    }
    float f1 = i(paramb);
    float f2 = b(paramb);
    int i = (int)Math.ceil(e.a(f1, f2, paramb.d()));
    int j = (int)Math.ceil(e.b(f1, f2, paramb.d()));
    paramb.b(i, j, i, j);
  }
}

/* Location:
 * Qualified Name:     s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */