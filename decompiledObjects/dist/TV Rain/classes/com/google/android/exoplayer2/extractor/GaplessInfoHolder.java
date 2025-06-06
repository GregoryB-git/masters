package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GaplessInfoHolder
{
  private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
  private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
  public int encoderDelay = -1;
  public int encoderPadding = -1;
  
  private boolean setFromComment(String paramString)
  {
    paramString = GAPLESS_COMMENT_PATTERN.matcher(paramString);
    if (paramString.find()) {}
    try
    {
      int i = Integer.parseInt(paramString.group(1), 16);
      int j = Integer.parseInt(paramString.group(2), 16);
      if ((i > 0) || (j > 0))
      {
        encoderDelay = i;
        encoderPadding = j;
        return true;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return false;
  }
  
  public boolean hasGaplessInfo()
  {
    boolean bool;
    if ((encoderDelay != -1) && (encoderPadding != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean setFromMetadata(Metadata paramMetadata)
  {
    for (int i = 0; i < paramMetadata.length(); i++)
    {
      Object localObject = paramMetadata.get(i);
      if ((localObject instanceof CommentFrame))
      {
        localObject = (CommentFrame)localObject;
        if (("iTunSMPB".equals(description)) && (setFromComment(text))) {
          return true;
        }
      }
      else if ((localObject instanceof InternalFrame))
      {
        localObject = (InternalFrame)localObject;
        if (("com.apple.iTunes".equals(domain)) && ("iTunSMPB".equals(description)) && (setFromComment(text))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean setFromXingHeaderValue(int paramInt)
  {
    int i = paramInt >> 12;
    paramInt &= 0xFFF;
    if ((i <= 0) && (paramInt <= 0)) {
      return false;
    }
    encoderDelay = i;
    encoderPadding = paramInt;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.GaplessInfoHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */