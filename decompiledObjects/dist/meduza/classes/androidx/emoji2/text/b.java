package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.TextPaint;

public final class b
  implements d.d
{
  public static final ThreadLocal<StringBuilder> b = new ThreadLocal();
  public final TextPaint a;
  
  public b()
  {
    TextPaint localTextPaint = new TextPaint();
    a = localTextPaint;
    localTextPaint.setTextSize(10.0F);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */