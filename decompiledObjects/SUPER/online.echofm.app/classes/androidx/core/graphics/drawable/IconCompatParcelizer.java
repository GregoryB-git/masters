package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import v1.b;

public class IconCompatParcelizer
{
  public static IconCompat read(b paramb)
  {
    IconCompat localIconCompat = new IconCompat();
    a = paramb.p(a, 1);
    c = paramb.j(c, 2);
    d = paramb.r(d, 3);
    e = paramb.p(e, 4);
    f = paramb.p(f, 5);
    g = ((ColorStateList)paramb.r(g, 6));
    i = paramb.t(i, 7);
    j = paramb.t(j, 8);
    localIconCompat.l();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, b paramb)
  {
    paramb.x(true, true);
    paramIconCompat.m(paramb.f());
    int i = a;
    if (-1 != i) {
      paramb.F(i, 1);
    }
    Object localObject = c;
    if (localObject != null) {
      paramb.B((byte[])localObject, 2);
    }
    localObject = d;
    if (localObject != null) {
      paramb.H((Parcelable)localObject, 3);
    }
    i = e;
    if (i != 0) {
      paramb.F(i, 4);
    }
    i = f;
    if (i != 0) {
      paramb.F(i, 5);
    }
    localObject = g;
    if (localObject != null) {
      paramb.H((Parcelable)localObject, 6);
    }
    localObject = paramIconCompat.i;
    if (localObject != null) {
      paramb.J((String)localObject, 7);
    }
    paramIconCompat = j;
    if (paramIconCompat != null) {
      paramb.J(paramIconCompat, 8);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */