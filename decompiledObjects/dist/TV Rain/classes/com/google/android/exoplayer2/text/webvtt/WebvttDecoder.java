package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

public final class WebvttDecoder
  extends SimpleSubtitleDecoder
{
  private static final String COMMENT_START = "NOTE";
  private static final int EVENT_COMMENT = 1;
  private static final int EVENT_CUE = 3;
  private static final int EVENT_END_OF_FILE = 0;
  private static final int EVENT_NONE = -1;
  private static final int EVENT_STYLE_BLOCK = 2;
  private static final String STYLE_START = "STYLE";
  private final CssParser cssParser = new CssParser();
  private final WebvttCueParser cueParser = new WebvttCueParser();
  private final List<WebvttCssStyle> definedStyles = new ArrayList();
  private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
  private final WebvttCue.Builder webvttCueBuilder = new WebvttCue.Builder();
  
  public WebvttDecoder()
  {
    super("WebvttDecoder");
  }
  
  private static int getNextEvent(ParsableByteArray paramParsableByteArray)
  {
    int i = 0;
    int j = -1;
    while (j == -1)
    {
      i = paramParsableByteArray.getPosition();
      String str = paramParsableByteArray.readLine();
      if (str == null) {
        j = 0;
      } else if ("STYLE".equals(str)) {
        j = 2;
      } else if ("NOTE".startsWith(str)) {
        j = 1;
      } else {
        j = 3;
      }
    }
    paramParsableByteArray.setPosition(i);
    return j;
  }
  
  private static void skipComment(ParsableByteArray paramParsableByteArray)
  {
    while (!TextUtils.isEmpty(paramParsableByteArray.readLine())) {}
  }
  
  public WebvttSubtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
    throws SubtitleDecoderException
  {
    parsableWebvttData.reset(paramArrayOfByte, paramInt);
    webvttCueBuilder.reset();
    definedStyles.clear();
    try
    {
      WebvttParserUtil.validateWebvttHeaderLine(parsableWebvttData);
      while (!TextUtils.isEmpty(parsableWebvttData.readLine())) {}
      paramArrayOfByte = new ArrayList();
      for (;;)
      {
        paramInt = getNextEvent(parsableWebvttData);
        if (paramInt == 0) {
          break;
        }
        if (paramInt == 1)
        {
          skipComment(parsableWebvttData);
        }
        else if (paramInt == 2)
        {
          if (paramArrayOfByte.isEmpty())
          {
            parsableWebvttData.readLine();
            WebvttCssStyle localWebvttCssStyle = cssParser.parseBlock(parsableWebvttData);
            if (localWebvttCssStyle != null) {
              definedStyles.add(localWebvttCssStyle);
            }
          }
          else
          {
            throw new SubtitleDecoderException("A style block was found after the first cue.");
          }
        }
        else if ((paramInt == 3) && (cueParser.parseCue(parsableWebvttData, webvttCueBuilder, definedStyles)))
        {
          paramArrayOfByte.add(webvttCueBuilder.build());
          webvttCueBuilder.reset();
        }
      }
      return new WebvttSubtitle(paramArrayOfByte);
    }
    catch (ParserException paramArrayOfByte)
    {
      throw new SubtitleDecoderException(paramArrayOfByte);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */