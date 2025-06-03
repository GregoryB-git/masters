package androidx.core.content;

import android.content.ClipData.Item;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import g;

@RequiresApi(31)
class IntentSanitizer$Api16Impl$Api31Impl
{
  @DoNotInline
  public static void checkOtherMembers(int paramInt, ClipData.Item paramItem, Consumer<String> paramConsumer)
  {
    if ((paramItem.getHtmlText() != null) || (paramItem.getIntent() != null) || (g.f(paramItem) != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ClipData item at position ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" contains htmlText, textLinks or intent: ");
      localStringBuilder.append(paramItem);
      paramConsumer.accept(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */