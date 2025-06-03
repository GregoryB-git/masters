package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcelable;
import b2.c;
import java.nio.charset.Charset;

public class IconCompatParcelizer
{
  public static IconCompat read(c paramc)
  {
    IconCompat localIconCompat = new IconCompat();
    a = paramc.o(a, 1);
    byte[] arrayOfByte = c;
    if (paramc.l(2)) {
      arrayOfByte = paramc.i();
    }
    c = arrayOfByte;
    d = paramc.s(d, 3);
    e = paramc.o(e, 4);
    f = paramc.o(f, 5);
    g = ((ColorStateList)paramc.s(g, 6));
    i = paramc.u(7, i);
    j = paramc.u(8, j);
    h = PorterDuff.Mode.valueOf(i);
    switch (a)
    {
    case 0: 
    default: 
      break;
    case 3: 
      b = c;
      break;
    case 2: 
    case 4: 
    case 6: 
      paramc = new String(c, Charset.forName("UTF-16"));
      b = paramc;
      if ((a != 2) || (j != null)) {
        return localIconCompat;
      }
      j = paramc.split(":", -1)[0];
      break;
    case 1: 
    case 5: 
      paramc = d;
      if (paramc == null)
      {
        paramc = c;
        b = paramc;
        a = 3;
        e = 0;
        f = paramc.length;
      }
      break;
    case -1: 
      paramc = d;
      if (paramc == null) {
        break label317;
      }
    }
    b = paramc;
    return localIconCompat;
    label317:
    throw new IllegalArgumentException("Invalid icon");
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, c paramc)
  {
    paramc.getClass();
    paramIconCompat.i = h.name();
    switch (a)
    {
    case 0: 
    default: 
      break;
    case 4: 
    case 6: 
      c = b.toString().getBytes(Charset.forName("UTF-16"));
      break;
    case 3: 
      c = ((byte[])b);
      break;
    case 2: 
      c = ((String)b).getBytes(Charset.forName("UTF-16"));
      break;
    case -1: 
    case 1: 
    case 5: 
      d = ((Parcelable)b);
    }
    int i = a;
    if (-1 != i) {
      paramc.I(i, 1);
    }
    Object localObject = c;
    if (localObject != null)
    {
      paramc.y(2);
      paramc.D((byte[])localObject);
    }
    localObject = d;
    if (localObject != null) {
      paramc.M((Parcelable)localObject, 3);
    }
    i = e;
    if (i != 0) {
      paramc.I(i, 4);
    }
    i = f;
    if (i != 0) {
      paramc.I(i, 5);
    }
    localObject = g;
    if (localObject != null) {
      paramc.M((Parcelable)localObject, 6);
    }
    localObject = paramIconCompat.i;
    if (localObject != null) {
      paramc.O(7, (String)localObject);
    }
    paramIconCompat = j;
    if (paramIconCompat != null) {
      paramc.O(8, paramIconCompat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */