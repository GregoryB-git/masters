package androidx.core.provider;

import androidx.core.util.Consumer;

class FontRequestWorker$2
  implements Consumer<FontRequestWorker.TypefaceResult>
{
  public FontRequestWorker$2(CallbackWithHandler paramCallbackWithHandler) {}
  
  public void accept(FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    FontRequestWorker.TypefaceResult localTypefaceResult = paramTypefaceResult;
    if (paramTypefaceResult == null) {
      localTypefaceResult = new FontRequestWorker.TypefaceResult(-3);
    }
    val$callback.onTypefaceResult(localTypefaceResult);
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */