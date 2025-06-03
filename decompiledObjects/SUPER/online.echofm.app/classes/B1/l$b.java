package B1;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class l$b
  implements Callable
{
  public final WeakReference o;
  
  public l$b(View paramView)
  {
    o = new WeakReference(paramView);
  }
  
  public String a()
  {
    Object localObject1 = (View)o.get();
    if ((localObject1 != null) && (((View)localObject1).getWidth() != 0) && (((View)localObject1).getHeight() != 0))
    {
      Object localObject2 = Bitmap.createBitmap(((View)localObject1).getWidth(), ((View)localObject1).getHeight(), Bitmap.Config.RGB_565);
      ((View)localObject1).draw(new Canvas((Bitmap)localObject2));
      localObject1 = new ByteArrayOutputStream();
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject1);
      localObject2 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 2);
      Intrinsics.checkNotNullExpressionValue(localObject2, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
      return (String)localObject2;
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     B1.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */