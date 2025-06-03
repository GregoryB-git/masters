package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.util.Log;
import z2;

public class WebvttCue$Builder
{
  private static final String TAG = "WebvttCueBuilder";
  private long endTime;
  private float line;
  private int lineAnchor;
  private int lineType;
  private float position;
  private int positionAnchor;
  private long startTime;
  private SpannableStringBuilder text;
  private Layout.Alignment textAlignment;
  private float width;
  
  public WebvttCue$Builder()
  {
    reset();
  }
  
  private Builder derivePositionAnchorFromAlignment()
  {
    Object localObject = textAlignment;
    if (localObject == null)
    {
      positionAnchor = Integer.MIN_VALUE;
    }
    else
    {
      int i = WebvttCue.1.$SwitchMap$android$text$Layout$Alignment[localObject.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            localObject = z2.t("Unrecognized alignment: ");
            ((StringBuilder)localObject).append(textAlignment);
            Log.w("WebvttCueBuilder", ((StringBuilder)localObject).toString());
            positionAnchor = 0;
          }
          else
          {
            positionAnchor = 2;
          }
        }
        else {
          positionAnchor = 1;
        }
      }
      else {
        positionAnchor = 0;
      }
    }
    return this;
  }
  
  public WebvttCue build()
  {
    if ((position != Float.MIN_VALUE) && (positionAnchor == Integer.MIN_VALUE)) {
      derivePositionAnchorFromAlignment();
    }
    return new WebvttCue(startTime, endTime, text, textAlignment, line, lineType, lineAnchor, position, positionAnchor, width);
  }
  
  public void reset()
  {
    startTime = 0L;
    endTime = 0L;
    text = null;
    textAlignment = null;
    line = Float.MIN_VALUE;
    lineType = Integer.MIN_VALUE;
    lineAnchor = Integer.MIN_VALUE;
    position = Float.MIN_VALUE;
    positionAnchor = Integer.MIN_VALUE;
    width = Float.MIN_VALUE;
  }
  
  public Builder setEndTime(long paramLong)
  {
    endTime = paramLong;
    return this;
  }
  
  public Builder setLine(float paramFloat)
  {
    line = paramFloat;
    return this;
  }
  
  public Builder setLineAnchor(int paramInt)
  {
    lineAnchor = paramInt;
    return this;
  }
  
  public Builder setLineType(int paramInt)
  {
    lineType = paramInt;
    return this;
  }
  
  public Builder setPosition(float paramFloat)
  {
    position = paramFloat;
    return this;
  }
  
  public Builder setPositionAnchor(int paramInt)
  {
    positionAnchor = paramInt;
    return this;
  }
  
  public Builder setStartTime(long paramLong)
  {
    startTime = paramLong;
    return this;
  }
  
  public Builder setText(SpannableStringBuilder paramSpannableStringBuilder)
  {
    text = paramSpannableStringBuilder;
    return this;
  }
  
  public Builder setTextAlignment(Layout.Alignment paramAlignment)
  {
    textAlignment = paramAlignment;
    return this;
  }
  
  public Builder setWidth(float paramFloat)
  {
    width = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttCue.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */