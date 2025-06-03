package androidx.core.os;

import a;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import z2;

final class LocaleListCompatWrapper
  implements LocaleListInterface
{
  private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");
  private static final Locale LOCALE_AR_XB;
  private static final Locale LOCALE_EN_XA;
  private static final Locale[] sEmptyList = new Locale[0];
  private final Locale[] mList;
  @NonNull
  private final String mStringRepresentation;
  
  static
  {
    LOCALE_EN_XA = new Locale("en", "XA");
    LOCALE_AR_XB = new Locale("ar", "XB");
  }
  
  public LocaleListCompatWrapper(@NonNull Locale... paramVarArgs)
  {
    if (paramVarArgs.length == 0)
    {
      mList = sEmptyList;
      mStringRepresentation = "";
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramVarArgs.length)
      {
        Locale localLocale = paramVarArgs[i];
        if (localLocale != null)
        {
          if (!localHashSet.contains(localLocale))
          {
            localLocale = (Locale)localLocale.clone();
            localArrayList.add(localLocale);
            toLanguageTag(localStringBuilder, localLocale);
            if (i < paramVarArgs.length - 1) {
              localStringBuilder.append(',');
            }
            localHashSet.add(localLocale);
          }
          i++;
        }
        else
        {
          throw new NullPointerException(a.g("list[", i, "] is null"));
        }
      }
      mList = ((Locale[])localArrayList.toArray(new Locale[0]));
      mStringRepresentation = localStringBuilder.toString();
    }
  }
  
  private Locale computeFirstMatch(Collection<String> paramCollection, boolean paramBoolean)
  {
    int i = computeFirstMatchIndex(paramCollection, paramBoolean);
    if (i == -1) {
      paramCollection = null;
    } else {
      paramCollection = mList[i];
    }
    return paramCollection;
  }
  
  private int computeFirstMatchIndex(Collection<String> paramCollection, boolean paramBoolean)
  {
    Locale[] arrayOfLocale = mList;
    if (arrayOfLocale.length == 1) {
      return 0;
    }
    if (arrayOfLocale.length == 0) {
      return -1;
    }
    int i;
    if (paramBoolean)
    {
      i = findFirstMatchIndex(EN_LATN);
      if (i == 0) {
        return 0;
      }
      if (i < Integer.MAX_VALUE) {}
    }
    else
    {
      i = Integer.MAX_VALUE;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      int j = findFirstMatchIndex(LocaleListCompat.forLanguageTagCompat((String)paramCollection.next()));
      if (j == 0) {
        return 0;
      }
      if (j < i) {
        i = j;
      }
    }
    if (i == Integer.MAX_VALUE) {
      return 0;
    }
    return i;
  }
  
  private int findFirstMatchIndex(Locale paramLocale)
  {
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      if (matchScore(paramLocale, arrayOfLocale[i]) > 0) {
        return i;
      }
    }
    return Integer.MAX_VALUE;
  }
  
  private static String getLikelyScript(Locale paramLocale)
  {
    paramLocale = Api21Impl.getScript(paramLocale);
    if (!paramLocale.isEmpty()) {
      return paramLocale;
    }
    return "";
  }
  
  private static boolean isPseudoLocale(Locale paramLocale)
  {
    boolean bool;
    if ((!LOCALE_EN_XA.equals(paramLocale)) && (!LOCALE_AR_XB.equals(paramLocale))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @IntRange(from=0L, to=1L)
  private static int matchScore(Locale paramLocale1, Locale paramLocale2)
  {
    boolean bool = paramLocale1.equals(paramLocale2);
    int i = 1;
    if (bool) {
      return 1;
    }
    if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
      return 0;
    }
    if ((!isPseudoLocale(paramLocale1)) && (!isPseudoLocale(paramLocale2)))
    {
      String str = getLikelyScript(paramLocale1);
      if (str.isEmpty())
      {
        paramLocale1 = paramLocale1.getCountry();
        int j = i;
        if (!paramLocale1.isEmpty()) {
          if (paramLocale1.equals(paramLocale2.getCountry())) {
            j = i;
          } else {
            j = 0;
          }
        }
        return j;
      }
      return str.equals(getLikelyScript(paramLocale2));
    }
    return 0;
  }
  
  @VisibleForTesting
  public static void toLanguageTag(StringBuilder paramStringBuilder, Locale paramLocale)
  {
    paramStringBuilder.append(paramLocale.getLanguage());
    String str = paramLocale.getCountry();
    if ((str != null) && (!str.isEmpty()))
    {
      paramStringBuilder.append('-');
      paramStringBuilder.append(paramLocale.getCountry());
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof LocaleListCompatWrapper)) {
      return false;
    }
    Locale[] arrayOfLocale = mList;
    if (mList.length != arrayOfLocale.length) {
      return false;
    }
    for (int i = 0;; i++)
    {
      paramObject = mList;
      if (i >= paramObject.length) {
        break;
      }
      if (!paramObject[i].equals(arrayOfLocale[i])) {
        return false;
      }
    }
    return true;
  }
  
  public Locale get(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = mList;
      if (paramInt < localObject.length) {
        return localObject[paramInt];
      }
    }
    Object localObject = null;
    return (Locale)localObject;
  }
  
  public Locale getFirstMatch(@NonNull String[] paramArrayOfString)
  {
    return computeFirstMatch(Arrays.asList(paramArrayOfString), false);
  }
  
  @Nullable
  public Object getLocaleList()
  {
    return null;
  }
  
  public int hashCode()
  {
    Locale[] arrayOfLocale = mList;
    int i = arrayOfLocale.length;
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + arrayOfLocale[k].hashCode();
    }
    return j;
  }
  
  public int indexOf(Locale paramLocale)
  {
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      if (arrayOfLocale[i].equals(paramLocale)) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (mList.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int size()
  {
    return mList.length;
  }
  
  public String toLanguageTags()
  {
    return mStringRepresentation;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("[");
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = mList;
      if (i >= arrayOfLocale.length) {
        break;
      }
      localStringBuilder.append(arrayOfLocale[i]);
      if (i < mList.length - 1) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static String getScript(Locale paramLocale)
    {
      return paramLocale.getScript();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.LocaleListCompatWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */