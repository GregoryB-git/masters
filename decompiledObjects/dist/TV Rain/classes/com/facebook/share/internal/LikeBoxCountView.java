package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.common.R.color;
import com.facebook.common.R.dimen;

@Deprecated
public class LikeBoxCountView
  extends FrameLayout
{
  private int additionalTextPadding;
  private Paint borderPaint;
  private float borderRadius;
  private float caretHeight;
  private LikeBoxCountViewCaretPosition caretPosition = LikeBoxCountViewCaretPosition.LEFT;
  private float caretWidth;
  private TextView likeCountLabel;
  private int textPadding;
  
  @Deprecated
  public LikeBoxCountView(Context paramContext)
  {
    super(paramContext);
    initialize(paramContext);
  }
  
  private void drawBorder(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    float f1 = borderRadius * 2.0F;
    float f2 = paramFloat1 + f1;
    float f3 = paramFloat2 + f1;
    localPath.addArc(new RectF(paramFloat1, paramFloat2, f2, f3), -180.0F, 90.0F);
    if (caretPosition == LikeBoxCountViewCaretPosition.TOP)
    {
      f4 = paramFloat3 - paramFloat1;
      localPath.lineTo((f4 - caretWidth) / 2.0F + paramFloat1, paramFloat2);
      localPath.lineTo(f4 / 2.0F + paramFloat1, paramFloat2 - caretHeight);
      localPath.lineTo((f4 + caretWidth) / 2.0F + paramFloat1, paramFloat2);
    }
    localPath.lineTo(paramFloat3 - borderRadius, paramFloat2);
    float f4 = paramFloat3 - f1;
    localPath.addArc(new RectF(f4, paramFloat2, paramFloat3, f3), -90.0F, 90.0F);
    if (caretPosition == LikeBoxCountViewCaretPosition.RIGHT)
    {
      f3 = paramFloat4 - paramFloat2;
      localPath.lineTo(paramFloat3, (f3 - caretWidth) / 2.0F + paramFloat2);
      localPath.lineTo(caretHeight + paramFloat3, f3 / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat3, (f3 + caretWidth) / 2.0F + paramFloat2);
    }
    localPath.lineTo(paramFloat3, paramFloat4 - borderRadius);
    f1 = paramFloat4 - f1;
    localPath.addArc(new RectF(f4, f1, paramFloat3, paramFloat4), 0.0F, 90.0F);
    if (caretPosition == LikeBoxCountViewCaretPosition.BOTTOM)
    {
      paramFloat3 -= paramFloat1;
      localPath.lineTo((caretWidth + paramFloat3) / 2.0F + paramFloat1, paramFloat4);
      localPath.lineTo(paramFloat3 / 2.0F + paramFloat1, caretHeight + paramFloat4);
      localPath.lineTo((paramFloat3 - caretWidth) / 2.0F + paramFloat1, paramFloat4);
    }
    localPath.lineTo(borderRadius + paramFloat1, paramFloat4);
    localPath.addArc(new RectF(paramFloat1, f1, f2, paramFloat4), 90.0F, 90.0F);
    if (caretPosition == LikeBoxCountViewCaretPosition.LEFT)
    {
      paramFloat3 = paramFloat4 - paramFloat2;
      localPath.lineTo(paramFloat1, (caretWidth + paramFloat3) / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat1 - caretHeight, paramFloat3 / 2.0F + paramFloat2);
      localPath.lineTo(paramFloat1, (paramFloat3 - caretWidth) / 2.0F + paramFloat2);
    }
    localPath.lineTo(paramFloat1, paramFloat2 + borderRadius);
    paramCanvas.drawPath(localPath, borderPaint);
  }
  
  private void initialize(Context paramContext)
  {
    setWillNotDraw(false);
    caretHeight = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_height);
    caretWidth = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_width);
    borderRadius = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_radius);
    Paint localPaint = new Paint();
    borderPaint = localPaint;
    localPaint.setColor(getResources().getColor(R.color.com_facebook_likeboxcountview_border_color));
    borderPaint.setStrokeWidth(getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_width));
    borderPaint.setStyle(Paint.Style.STROKE);
    initializeLikeCountLabel(paramContext);
    addView(likeCountLabel);
    setCaretPosition(caretPosition);
  }
  
  private void initializeLikeCountLabel(Context paramContext)
  {
    likeCountLabel = new TextView(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    likeCountLabel.setLayoutParams(paramContext);
    likeCountLabel.setGravity(17);
    likeCountLabel.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeboxcountview_text_size));
    likeCountLabel.setTextColor(getResources().getColor(R.color.com_facebook_likeboxcountview_text_color));
    textPadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_text_padding);
    additionalTextPadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_caret_height);
  }
  
  private void setAdditionalTextPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    TextView localTextView = likeCountLabel;
    int i = textPadding;
    localTextView.setPadding(paramInt1 + i, paramInt2 + i, paramInt3 + i, i + paramInt4);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getPaddingTop();
    int j = getPaddingLeft();
    int k = getWidth() - getPaddingRight();
    int m = getHeight() - getPaddingBottom();
    int n = 1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[caretPosition.ordinal()];
    if (n != 1)
    {
      if (n != 2)
      {
        if (n != 3)
        {
          if (n == 4) {
            m = (int)(m - caretHeight);
          }
        }
        else {
          k = (int)(k - caretHeight);
        }
      }
      else {
        i = (int)(i + caretHeight);
      }
    }
    else {
      j = (int)(j + caretHeight);
    }
    drawBorder(paramCanvas, j, i, k, m);
  }
  
  @Deprecated
  public void setCaretPosition(LikeBoxCountViewCaretPosition paramLikeBoxCountViewCaretPosition)
  {
    caretPosition = paramLikeBoxCountViewCaretPosition;
    int i = 1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[paramLikeBoxCountViewCaretPosition.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            setAdditionalTextPadding(0, 0, 0, additionalTextPadding);
          }
        }
        else {
          setAdditionalTextPadding(0, 0, additionalTextPadding, 0);
        }
      }
      else {
        setAdditionalTextPadding(0, additionalTextPadding, 0, 0);
      }
    }
    else {
      setAdditionalTextPadding(additionalTextPadding, 0, 0, 0);
    }
  }
  
  @Deprecated
  public void setText(String paramString)
  {
    likeCountLabel.setText(paramString);
  }
  
  public static enum LikeBoxCountViewCaretPosition
  {
    static
    {
      LikeBoxCountViewCaretPosition localLikeBoxCountViewCaretPosition1 = new LikeBoxCountViewCaretPosition("LEFT", 0);
      LEFT = localLikeBoxCountViewCaretPosition1;
      LikeBoxCountViewCaretPosition localLikeBoxCountViewCaretPosition2 = new LikeBoxCountViewCaretPosition("TOP", 1);
      TOP = localLikeBoxCountViewCaretPosition2;
      LikeBoxCountViewCaretPosition localLikeBoxCountViewCaretPosition3 = new LikeBoxCountViewCaretPosition("RIGHT", 2);
      RIGHT = localLikeBoxCountViewCaretPosition3;
      LikeBoxCountViewCaretPosition localLikeBoxCountViewCaretPosition4 = new LikeBoxCountViewCaretPosition("BOTTOM", 3);
      BOTTOM = localLikeBoxCountViewCaretPosition4;
      $VALUES = new LikeBoxCountViewCaretPosition[] { localLikeBoxCountViewCaretPosition1, localLikeBoxCountViewCaretPosition2, localLikeBoxCountViewCaretPosition3, localLikeBoxCountViewCaretPosition4 };
    }
    
    private LikeBoxCountViewCaretPosition() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeBoxCountView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */