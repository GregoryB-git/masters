package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

class FontRequestWorker$3
  implements Callable<FontRequestWorker.TypefaceResult>
{
  public FontRequestWorker$3(String paramString, Context paramContext, FontRequest paramFontRequest, int paramInt) {}
  
  public FontRequestWorker.TypefaceResult call()
  {
    try
    {
      FontRequestWorker.TypefaceResult localTypefaceResult = FontRequestWorker.getFontSync(val$id, val$context, val$request, val$style);
      return localTypefaceResult;
    }
    finally {}
    return new FontRequestWorker.TypefaceResult(-3);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */