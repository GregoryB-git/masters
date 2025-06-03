package I;

import A.f;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

public class x$j
  extends x.i
{
  public f n = null;
  public f o = null;
  public f p = null;
  
  public x$j(@NonNull x paramx, @NonNull j paramj)
  {
    super(paramx, paramj);
  }
  
  public x$j(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramx, paramWindowInsets);
  }
  
  @NonNull
  public f h()
  {
    if (o == null) {
      o = f.d(K.a(c));
    }
    return o;
  }
  
  @NonNull
  public f j()
  {
    if (n == null) {
      n = f.d(L.a(c));
    }
    return n;
  }
  
  @NonNull
  public f l()
  {
    if (p == null) {
      p = f.d(I.a(c));
    }
    return p;
  }
  
  @NonNull
  public x m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return x.s(J.a(c, paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void s(f paramf) {}
}

/* Location:
 * Qualified Name:     I.x.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */