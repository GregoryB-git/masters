package androidx.core.content.pm;

import android.content.pm.ShortcutInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

@RequiresApi(25)
class ShortcutManagerCompat$Api25Impl
{
  public static String getShortcutInfoWithLowestRank(@NonNull List<ShortcutInfo> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i = -1;
    paramList = null;
    while (localIterator.hasNext())
    {
      ShortcutInfo localShortcutInfo = (ShortcutInfo)localIterator.next();
      if (localShortcutInfo.getRank() > i)
      {
        paramList = localShortcutInfo.getId();
        i = localShortcutInfo.getRank();
      }
    }
    return paramList;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutManagerCompat.Api25Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */