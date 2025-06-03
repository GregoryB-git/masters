package I;

import A.f;
import android.view.WindowInsets.Builder;
import androidx.annotation.NonNull;

public class x$d
  extends x.f
{
  public final WindowInsets.Builder c;
  
  public x$d()
  {
    c = E.a();
  }
  
  public x$d(@NonNull x paramx)
  {
    super(paramx);
    paramx = paramx.r();
    if (paramx != null) {
      paramx = F.a(paramx);
    } else {
      paramx = E.a();
    }
    c = paramx;
  }
  
  @NonNull
  public x b()
  {
    a();
    x localx = x.s(B.a(c));
    localx.n(b);
    return localx;
  }
  
  public void c(@NonNull f paramf)
  {
    C.a(c, paramf.e());
  }
  
  public void d(@NonNull f paramf)
  {
    z.a(c, paramf.e());
  }
  
  public void e(@NonNull f paramf)
  {
    A.a(c, paramf.e());
  }
  
  public void f(@NonNull f paramf)
  {
    y.a(c, paramf.e());
  }
  
  public void g(@NonNull f paramf)
  {
    D.a(c, paramf.e());
  }
}

/* Location:
 * Qualified Name:     I.x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */