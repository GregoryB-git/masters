package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.text.ICUCompat;
import java.util.Locale;
import z2;

public final class LocaleListCompat
{
  private static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
  private final LocaleListInterface mImpl;
  
  private LocaleListCompat(LocaleListInterface paramLocaleListInterface)
  {
    mImpl = paramLocaleListInterface;
  }
  
  @NonNull
  public static LocaleListCompat create(@NonNull Locale... paramVarArgs)
  {
    return wrap(Api24Impl.createLocaleList(paramVarArgs));
  }
  
  public static Locale forLanguageTagCompat(String paramString)
  {
    String[] arrayOfString;
    if (paramString.contains("-"))
    {
      arrayOfString = paramString.split("-", -1);
      if (arrayOfString.length > 2) {
        return new Locale(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
      }
      if (arrayOfString.length > 1) {
        return new Locale(arrayOfString[0], arrayOfString[1]);
      }
      if (arrayOfString.length == 1) {
        return new Locale(arrayOfString[0]);
      }
    }
    else
    {
      if (!paramString.contains("_")) {
        break label170;
      }
      arrayOfString = paramString.split("_", -1);
      if (arrayOfString.length > 2) {
        return new Locale(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
      }
      if (arrayOfString.length > 1) {
        return new Locale(arrayOfString[0], arrayOfString[1]);
      }
      if (arrayOfString.length == 1) {
        return new Locale(arrayOfString[0]);
      }
    }
    throw new IllegalArgumentException(z2.p("Can not parse language tag: [", paramString, "]"));
    label170:
    return new Locale(paramString);
  }
  
  @NonNull
  public static LocaleListCompat forLanguageTags(@Nullable String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      paramString = paramString.split(",", -1);
      int i = paramString.length;
      Locale[] arrayOfLocale = new Locale[i];
      for (int j = 0; j < i; j++) {
        arrayOfLocale[j] = Api21Impl.forLanguageTag(paramString[j]);
      }
      return create(arrayOfLocale);
    }
    return getEmptyLocaleList();
  }
  
  @NonNull
  @Size(min=1L)
  public static LocaleListCompat getAdjustedDefault()
  {
    return wrap(Api24Impl.getAdjustedDefault());
  }
  
  @NonNull
  @Size(min=1L)
  public static LocaleListCompat getDefault()
  {
    return wrap(Api24Impl.getDefault());
  }
  
  @NonNull
  public static LocaleListCompat getEmptyLocaleList()
  {
    return sEmptyLocaleList;
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  @RequiresApi(21)
  public static boolean matchesLanguageAndScript(@NonNull Locale paramLocale1, @NonNull Locale paramLocale2)
  {
    if (BuildCompat.isAtLeastT()) {
      return LocaleList.matchesLanguageAndScript(paramLocale1, paramLocale2);
    }
    return Api21Impl.matchesLanguageAndScript(paramLocale1, paramLocale2);
  }
  
  @NonNull
  @RequiresApi(24)
  public static LocaleListCompat wrap(@NonNull LocaleList paramLocaleList)
  {
    return new LocaleListCompat(new LocaleListPlatformWrapper(paramLocaleList));
  }
  
  @Deprecated
  @RequiresApi(24)
  public static LocaleListCompat wrap(Object paramObject)
  {
    return wrap((LocaleList)paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof LocaleListCompat)) && (mImpl.equals(mImpl))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public Locale get(int paramInt)
  {
    return mImpl.get(paramInt);
  }
  
  @Nullable
  public Locale getFirstMatch(@NonNull String[] paramArrayOfString)
  {
    return mImpl.getFirstMatch(paramArrayOfString);
  }
  
  public int hashCode()
  {
    return mImpl.hashCode();
  }
  
  @IntRange(from=-1L)
  public int indexOf(@Nullable Locale paramLocale)
  {
    return mImpl.indexOf(paramLocale);
  }
  
  public boolean isEmpty()
  {
    return mImpl.isEmpty();
  }
  
  @IntRange(from=0L)
  public int size()
  {
    return mImpl.size();
  }
  
  @NonNull
  public String toLanguageTags()
  {
    return mImpl.toLanguageTags();
  }
  
  @NonNull
  public String toString()
  {
    return mImpl.toString();
  }
  
  @Nullable
  public Object unwrap()
  {
    return mImpl.getLocaleList();
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    private static final Locale[] PSEUDO_LOCALE = { new Locale("en", "XA"), new Locale("ar", "XB") };
    
    @DoNotInline
    public static Locale forLanguageTag(String paramString)
    {
      return Locale.forLanguageTag(paramString);
    }
    
    private static boolean isPseudoLocale(Locale paramLocale)
    {
      Locale[] arrayOfLocale = PSEUDO_LOCALE;
      int i = arrayOfLocale.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfLocale[j].equals(paramLocale)) {
          return true;
        }
      }
      return false;
    }
    
    @DoNotInline
    public static boolean matchesLanguageAndScript(@NonNull Locale paramLocale1, @NonNull Locale paramLocale2)
    {
      boolean bool1 = paramLocale1.equals(paramLocale2);
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
        return false;
      }
      if ((!isPseudoLocale(paramLocale1)) && (!isPseudoLocale(paramLocale2)))
      {
        String str = ICUCompat.maximizeAndGetScript(paramLocale1);
        if (str.isEmpty())
        {
          paramLocale1 = paramLocale1.getCountry();
          bool1 = bool2;
          if (!paramLocale1.isEmpty()) {
            if (paramLocale1.equals(paramLocale2.getCountry())) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          return bool1;
        }
        return str.equals(ICUCompat.maximizeAndGetScript(paramLocale2));
      }
      return false;
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static LocaleList createLocaleList(Locale... paramVarArgs)
    {
      return new LocaleList(paramVarArgs);
    }
    
    @DoNotInline
    public static LocaleList getAdjustedDefault()
    {
      return LocaleList.getAdjustedDefault();
    }
    
    @DoNotInline
    public static LocaleList getDefault()
    {
      return LocaleList.getDefault();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.LocaleListCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */