package androidx.core.content;

import a;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.core.util.Predicate;
import g;

@RequiresApi(16)
class IntentSanitizer$Api16Impl
{
  private static void checkOtherMembers(int paramInt, ClipData.Item paramItem, Consumer<String> paramConsumer)
  {
    if ((paramItem.getHtmlText() != null) || (paramItem.getIntent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ClipData item at position ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" contains htmlText, textLinks or intent: ");
      localStringBuilder.append(paramItem);
      paramConsumer.accept(localStringBuilder.toString());
    }
  }
  
  @DoNotInline
  public static void sanitizeClipData(@NonNull Intent paramIntent1, Intent paramIntent2, Predicate<ClipData> paramPredicate, boolean paramBoolean, Predicate<Uri> paramPredicate1, Consumer<String> paramConsumer)
  {
    ClipData localClipData = paramIntent1.getClipData();
    if (localClipData == null) {
      return;
    }
    if ((paramPredicate != null) && (paramPredicate.test(localClipData)))
    {
      paramIntent2.setClipData(localClipData);
    }
    else
    {
      int i = 0;
      Object localObject2;
      for (paramIntent1 = null; i < localClipData.getItemCount(); paramIntent1 = (Intent)localObject2)
      {
        Object localObject1 = localClipData.getItemAt(i);
        if (Build.VERSION.SDK_INT >= 31) {
          Api31Impl.checkOtherMembers(i, (ClipData.Item)localObject1, paramConsumer);
        } else {
          checkOtherMembers(i, (ClipData.Item)localObject1, paramConsumer);
        }
        if (paramBoolean)
        {
          paramPredicate = ((ClipData.Item)localObject1).getText();
        }
        else
        {
          if (((ClipData.Item)localObject1).getText() != null)
          {
            paramPredicate = a.r("Item text cannot contain value. Item position: ", i, ". Text: ");
            paramPredicate.append(((ClipData.Item)localObject1).getText());
            paramConsumer.accept(paramPredicate.toString());
          }
          paramPredicate = null;
        }
        if (paramPredicate1 == null)
        {
          if (((ClipData.Item)localObject1).getUri() != null)
          {
            localObject2 = a.r("Item URI is not allowed. Item position: ", i, ". URI: ");
            ((StringBuilder)localObject2).append(((ClipData.Item)localObject1).getUri());
            paramConsumer.accept(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          if ((((ClipData.Item)localObject1).getUri() == null) || (paramPredicate1.test(((ClipData.Item)localObject1).getUri()))) {
            break label259;
          }
          localObject2 = a.r("Item URI is not allowed. Item position: ", i, ". URI: ");
          ((StringBuilder)localObject2).append(((ClipData.Item)localObject1).getUri());
          paramConsumer.accept(((StringBuilder)localObject2).toString());
        }
        localObject1 = null;
        break label266;
        label259:
        localObject1 = ((ClipData.Item)localObject1).getUri();
        label266:
        if (paramPredicate == null)
        {
          localObject2 = paramIntent1;
          if (localObject1 == null) {}
        }
        else if (paramIntent1 == null)
        {
          localObject2 = new ClipData(localClipData.getDescription(), new ClipData.Item(paramPredicate, null, (Uri)localObject1));
        }
        else
        {
          paramIntent1.addItem(new ClipData.Item(paramPredicate, null, (Uri)localObject1));
          localObject2 = paramIntent1;
        }
        i++;
      }
      if (paramIntent1 != null) {
        paramIntent2.setClipData(paramIntent1);
      }
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */