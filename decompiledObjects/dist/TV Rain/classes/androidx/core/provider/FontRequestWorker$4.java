package androidx.core.provider;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;

class FontRequestWorker$4
  implements Consumer<FontRequestWorker.TypefaceResult>
{
  public FontRequestWorker$4(String paramString) {}
  
  public void accept(FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    synchronized (FontRequestWorker.LOCK)
    {
      SimpleArrayMap localSimpleArrayMap = FontRequestWorker.PENDING_REPLIES;
      ArrayList localArrayList = (ArrayList)localSimpleArrayMap.get(val$id);
      if (localArrayList == null) {
        return;
      }
      localSimpleArrayMap.remove(val$id);
      for (int i = 0; i < localArrayList.size(); i++) {
        ((Consumer)localArrayList.get(i)).accept(paramTypefaceResult);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */