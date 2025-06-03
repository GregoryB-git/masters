package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

class FontRequestWorker$1
  implements Callable<FontRequestWorker.TypefaceResult>
{
  public FontRequestWorker$1(String paramString, Context paramContext, FontRequest paramFontRequest, int paramInt) {}
  
  public FontRequestWorker.TypefaceResult call()
  {
    return FontRequestWorker.getFontSync(val$id, val$context, val$request, val$style);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */