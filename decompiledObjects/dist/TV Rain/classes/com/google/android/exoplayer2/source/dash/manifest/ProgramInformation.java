package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

public class ProgramInformation
{
  public final String copyright;
  public final String lang;
  public final String moreInformationURL;
  public final String source;
  public final String title;
  
  public ProgramInformation(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    title = paramString1;
    source = paramString2;
    copyright = paramString3;
    moreInformationURL = paramString4;
    lang = paramString5;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ProgramInformation)paramObject;
      if ((!Util.areEqual(title, title)) || (!Util.areEqual(source, source)) || (!Util.areEqual(copyright, copyright)) || (!Util.areEqual(moreInformationURL, moreInformationURL)) || (!Util.areEqual(lang, lang))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = title;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = source;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = copyright;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = moreInformationURL;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = lang;
    if (str != null) {
      i = str.hashCode();
    }
    return ((((527 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.ProgramInformation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */