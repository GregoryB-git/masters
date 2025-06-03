package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
final class LocaleListPlatformWrapper
  implements LocaleListInterface
{
  private final LocaleList mLocaleList;
  
  public LocaleListPlatformWrapper(Object paramObject)
  {
    mLocaleList = ((LocaleList)paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    return mLocaleList.equals(((LocaleListInterface)paramObject).getLocaleList());
  }
  
  public Locale get(int paramInt)
  {
    return mLocaleList.get(paramInt);
  }
  
  @Nullable
  public Locale getFirstMatch(@NonNull String[] paramArrayOfString)
  {
    return mLocaleList.getFirstMatch(paramArrayOfString);
  }
  
  public Object getLocaleList()
  {
    return mLocaleList;
  }
  
  public int hashCode()
  {
    return mLocaleList.hashCode();
  }
  
  public int indexOf(Locale paramLocale)
  {
    return mLocaleList.indexOf(paramLocale);
  }
  
  public boolean isEmpty()
  {
    return mLocaleList.isEmpty();
  }
  
  public int size()
  {
    return mLocaleList.size();
  }
  
  public String toLanguageTags()
  {
    return mLocaleList.toLanguageTags();
  }
  
  public String toString()
  {
    return mLocaleList.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.LocaleListPlatformWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */