package androidx.core.app;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(16)
class ShareCompat$Api16Impl
{
  @DoNotInline
  public static String escapeHtml(CharSequence paramCharSequence)
  {
    return Html.escapeHtml(paramCharSequence);
  }
  
  @DoNotInline
  public static void migrateExtraStreamToClipData(@NonNull Intent paramIntent, @NonNull ArrayList<Uri> paramArrayList)
  {
    Object localObject1 = paramIntent.getCharSequenceExtra("android.intent.extra.TEXT");
    String str = paramIntent.getStringExtra("android.intent.extra.HTML_TEXT");
    Object localObject2 = paramIntent.getType();
    localObject1 = new ClipData.Item((CharSequence)localObject1, str, null, (Uri)paramArrayList.get(0));
    localObject2 = new ClipData(null, new String[] { localObject2 }, (ClipData.Item)localObject1);
    int i = paramArrayList.size();
    for (int j = 1; j < i; j++) {
      ((ClipData)localObject2).addItem(new ClipData.Item((Uri)paramArrayList.get(j)));
    }
    paramIntent.setClipData((ClipData)localObject2);
    paramIntent.addFlags(1);
  }
  
  @DoNotInline
  public static void removeClipData(@NonNull Intent paramIntent)
  {
    paramIntent.setClipData(null);
    paramIntent.setFlags(paramIntent.getFlags() & 0xFFFFFFFE);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ShareCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */