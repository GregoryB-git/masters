package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import z2;

class MotionLayout$DevModeDraw
{
  private static final int DEBUG_PATH_TICKS_PER_MS = 16;
  public final int DIAMOND_SIZE = 10;
  public final int GRAPH_COLOR = -13391360;
  public final int KEYFRAME_COLOR = -2067046;
  public final int RED_COLOR = 43571;
  public final int SHADOW_COLOR = 1996488704;
  public Rect mBounds = new Rect();
  public DashPathEffect mDashPathEffect;
  public Paint mFillPaint;
  public int mKeyFrameCount;
  public float[] mKeyFramePoints;
  public Paint mPaint;
  public Paint mPaintGraph;
  public Paint mPaintKeyframes;
  public Path mPath;
  public int[] mPathMode;
  public float[] mPoints;
  public boolean mPresentationMode = false;
  private float[] mRectangle;
  public int mShadowTranslate = 1;
  public Paint mTextPaint;
  
  public MotionLayout$DevModeDraw(MotionLayout paramMotionLayout)
  {
    Paint localPaint = new Paint();
    mPaint = localPaint;
    localPaint.setAntiAlias(true);
    mPaint.setColor(43571);
    mPaint.setStrokeWidth(2.0F);
    mPaint.setStyle(Paint.Style.STROKE);
    localPaint = new Paint();
    mPaintKeyframes = localPaint;
    localPaint.setAntiAlias(true);
    mPaintKeyframes.setColor(-2067046);
    mPaintKeyframes.setStrokeWidth(2.0F);
    mPaintKeyframes.setStyle(Paint.Style.STROKE);
    localPaint = new Paint();
    mPaintGraph = localPaint;
    localPaint.setAntiAlias(true);
    mPaintGraph.setColor(-13391360);
    mPaintGraph.setStrokeWidth(2.0F);
    mPaintGraph.setStyle(Paint.Style.STROKE);
    localPaint = new Paint();
    mTextPaint = localPaint;
    localPaint.setAntiAlias(true);
    mTextPaint.setColor(-13391360);
    mTextPaint.setTextSize(getContextgetResourcesgetDisplayMetricsdensity * 12.0F);
    mRectangle = new float[8];
    paramMotionLayout = new Paint();
    mFillPaint = paramMotionLayout;
    paramMotionLayout.setAntiAlias(true);
    paramMotionLayout = new DashPathEffect(new float[] { 4.0F, 8.0F }, 0.0F);
    mDashPathEffect = paramMotionLayout;
    mPaintGraph.setPathEffect(paramMotionLayout);
    mKeyFramePoints = new float[100];
    mPathMode = new int[50];
    if (mPresentationMode)
    {
      mPaint.setStrokeWidth(8.0F);
      mFillPaint.setStrokeWidth(8.0F);
      mPaintKeyframes.setStrokeWidth(8.0F);
      mShadowTranslate = 4;
    }
  }
  
  private void drawBasicPath(Canvas paramCanvas)
  {
    paramCanvas.drawLines(mPoints, mPaint);
  }
  
  private void drawPathAsConfigured(Canvas paramCanvas)
  {
    int i = 0;
    int j = 0;
    int k = j;
    while (i < mKeyFrameCount)
    {
      int m = mPathMode[i];
      if (m == 1) {
        j = 1;
      }
      if (m == 0) {
        k = 1;
      }
      i++;
    }
    if (j != 0) {
      drawPathRelative(paramCanvas);
    }
    if (k != 0) {
      drawPathCartesian(paramCanvas);
    }
  }
  
  private void drawPathCartesian(Canvas paramCanvas)
  {
    float[] arrayOfFloat = mPoints;
    float f1 = arrayOfFloat[0];
    float f2 = arrayOfFloat[1];
    float f3 = arrayOfFloat[(arrayOfFloat.length - 2)];
    float f4 = arrayOfFloat[(arrayOfFloat.length - 1)];
    paramCanvas.drawLine(Math.min(f1, f3), Math.max(f2, f4), Math.max(f1, f3), Math.max(f2, f4), mPaintGraph);
    paramCanvas.drawLine(Math.min(f1, f3), Math.min(f2, f4), Math.min(f1, f3), Math.max(f2, f4), mPaintGraph);
  }
  
  private void drawPathCartesianTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    Object localObject = mPoints;
    float f1 = localObject[0];
    float f2 = localObject[1];
    float f3 = localObject[(localObject.length - 2)];
    float f4 = localObject[(localObject.length - 1)];
    float f5 = Math.min(f1, f3);
    float f6 = Math.max(f2, f4);
    float f7 = paramFloat1 - Math.min(f1, f3);
    float f8 = Math.max(f2, f4) - paramFloat2;
    localObject = z2.t("");
    ((StringBuilder)localObject).append((int)(f7 * 100.0F / Math.abs(f3 - f1) + 0.5D) / 100.0F);
    localObject = ((StringBuilder)localObject).toString();
    getTextBounds((String)localObject, mTextPaint);
    paramCanvas.drawText((String)localObject, f7 / 2.0F - mBounds.width() / 2 + f5, paramFloat2 - 20.0F, mTextPaint);
    paramCanvas.drawLine(paramFloat1, paramFloat2, Math.min(f1, f3), paramFloat2, mPaintGraph);
    localObject = z2.t("");
    ((StringBuilder)localObject).append((int)(f8 * 100.0F / Math.abs(f4 - f2) + 0.5D) / 100.0F);
    localObject = ((StringBuilder)localObject).toString();
    getTextBounds((String)localObject, mTextPaint);
    paramCanvas.drawText((String)localObject, paramFloat1 + 5.0F, f6 - (f8 / 2.0F - mBounds.height() / 2), mTextPaint);
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, Math.max(f2, f4), mPaintGraph);
  }
  
  private void drawPathRelative(Canvas paramCanvas)
  {
    float[] arrayOfFloat = mPoints;
    paramCanvas.drawLine(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[(arrayOfFloat.length - 2)], arrayOfFloat[(arrayOfFloat.length - 1)], mPaintGraph);
  }
  
  private void drawPathRelativeTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    Object localObject1 = mPoints;
    float f1 = localObject1[0];
    float f2 = localObject1[1];
    float f3 = localObject1[(localObject1.length - 2)];
    float f4 = localObject1[(localObject1.length - 1)];
    float f5 = (float)Math.hypot(f1 - f3, f2 - f4);
    float f6 = f3 - f1;
    f4 -= f2;
    f3 = ((paramFloat2 - f2) * f4 + (paramFloat1 - f1) * f6) / (f5 * f5);
    f1 += f6 * f3;
    f4 = f2 + f3 * f4;
    localObject1 = new Path();
    ((Path)localObject1).moveTo(paramFloat1, paramFloat2);
    ((Path)localObject1).lineTo(f1, f4);
    f2 = (float)Math.hypot(f1 - paramFloat1, f4 - paramFloat2);
    Object localObject2 = z2.t("");
    ((StringBuilder)localObject2).append((int)(f2 * 100.0F / f5) / 100.0F);
    localObject2 = ((StringBuilder)localObject2).toString();
    getTextBounds((String)localObject2, mTextPaint);
    paramCanvas.drawTextOnPath((String)localObject2, (Path)localObject1, f2 / 2.0F - mBounds.width() / 2, -20.0F, mTextPaint);
    paramCanvas.drawLine(paramFloat1, paramFloat2, f1, f4, mPaintGraph);
  }
  
  private void drawPathScreenTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    Object localObject = z2.t("");
    ((StringBuilder)localObject).append((int)((paramFloat1 - paramInt1 / 2) * 100.0F / (this$0.getWidth() - paramInt1) + 0.5D) / 100.0F);
    localObject = ((StringBuilder)localObject).toString();
    getTextBounds((String)localObject, mTextPaint);
    paramCanvas.drawText((String)localObject, paramFloat1 / 2.0F - mBounds.width() / 2 + 0.0F, paramFloat2 - 20.0F, mTextPaint);
    paramCanvas.drawLine(paramFloat1, paramFloat2, Math.min(0.0F, 1.0F), paramFloat2, mPaintGraph);
    localObject = z2.t("");
    ((StringBuilder)localObject).append((int)((paramFloat2 - paramInt2 / 2) * 100.0F / (this$0.getHeight() - paramInt2) + 0.5D) / 100.0F);
    localObject = ((StringBuilder)localObject).toString();
    getTextBounds((String)localObject, mTextPaint);
    paramCanvas.drawText((String)localObject, paramFloat1 + 5.0F, 0.0F - (paramFloat2 / 2.0F - mBounds.height() / 2), mTextPaint);
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, Math.max(0.0F, 1.0F), mPaintGraph);
  }
  
  private void drawRectangle(Canvas paramCanvas, MotionController paramMotionController)
  {
    mPath.reset();
    for (int i = 0; i <= 50; i++)
    {
      paramMotionController.buildRect(i / 50, mRectangle, 0);
      Path localPath = mPath;
      float[] arrayOfFloat = mRectangle;
      localPath.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
      localPath = mPath;
      arrayOfFloat = mRectangle;
      localPath.lineTo(arrayOfFloat[2], arrayOfFloat[3]);
      localPath = mPath;
      arrayOfFloat = mRectangle;
      localPath.lineTo(arrayOfFloat[4], arrayOfFloat[5]);
      localPath = mPath;
      arrayOfFloat = mRectangle;
      localPath.lineTo(arrayOfFloat[6], arrayOfFloat[7]);
      mPath.close();
    }
    mPaint.setColor(1140850688);
    paramCanvas.translate(2.0F, 2.0F);
    paramCanvas.drawPath(mPath, mPaint);
    paramCanvas.translate(-2.0F, -2.0F);
    mPaint.setColor(-65536);
    paramCanvas.drawPath(mPath, mPaint);
  }
  
  private void drawTicks(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
  {
    Object localObject = mView;
    int i;
    int j;
    if (localObject != null)
    {
      i = ((View)localObject).getWidth();
      j = mView.getHeight();
    }
    else
    {
      i = 0;
      j = i;
    }
    for (int k = 1; k < paramInt2 - 1; k++) {
      if ((paramInt1 != 4) || (mPathMode[(k - 1)] != 0))
      {
        localObject = mKeyFramePoints;
        int m = k * 2;
        float f1 = localObject[m];
        float f2 = localObject[(m + 1)];
        mPath.reset();
        mPath.moveTo(f1, f2 + 10.0F);
        mPath.lineTo(f1 + 10.0F, f2);
        mPath.lineTo(f1, f2 - 10.0F);
        mPath.lineTo(f1 - 10.0F, f2);
        mPath.close();
        m = k - 1;
        paramMotionController.getKeyFrame(m);
        if (paramInt1 == 4)
        {
          m = mPathMode[m];
          if (m == 1) {
            drawPathRelativeTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
          }
          for (;;)
          {
            break;
            if (m == 0) {
              drawPathCartesianTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
            } else if (m == 2) {
              drawPathScreenTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F, i, j);
            }
          }
          paramCanvas.drawPath(mPath, mFillPaint);
        }
        if (paramInt1 == 2) {
          drawPathRelativeTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
        }
        if (paramInt1 == 3) {
          drawPathCartesianTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
        }
        if (paramInt1 == 6) {
          drawPathScreenTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F, i, j);
        }
        paramCanvas.drawPath(mPath, mFillPaint);
      }
    }
    paramMotionController = mPoints;
    if (paramMotionController.length > 1)
    {
      paramCanvas.drawCircle(paramMotionController[0], paramMotionController[1], 8.0F, mPaintKeyframes);
      paramMotionController = mPoints;
      paramCanvas.drawCircle(paramMotionController[(paramMotionController.length - 2)], paramMotionController[(paramMotionController.length - 1)], 8.0F, mPaintKeyframes);
    }
  }
  
  private void drawTranslation(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramCanvas.drawRect(paramFloat1, paramFloat2, paramFloat3, paramFloat4, mPaintGraph);
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4, mPaintGraph);
  }
  
  public void draw(Canvas paramCanvas, HashMap<View, MotionController> paramHashMap, int paramInt1, int paramInt2)
  {
    if ((paramHashMap != null) && (paramHashMap.size() != 0))
    {
      paramCanvas.save();
      Object localObject;
      if ((!this$0.isInEditMode()) && ((paramInt2 & 0x1) == 2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(this$0.getContext().getResources().getResourceName(MotionLayout.access$100(this$0)));
        ((StringBuilder)localObject).append(":");
        ((StringBuilder)localObject).append(this$0.getProgress());
        localObject = ((StringBuilder)localObject).toString();
        paramCanvas.drawText((String)localObject, 10.0F, this$0.getHeight() - 30, mTextPaint);
        paramCanvas.drawText((String)localObject, 11.0F, this$0.getHeight() - 29, mPaint);
      }
      paramHashMap = paramHashMap.values().iterator();
      while (paramHashMap.hasNext())
      {
        MotionController localMotionController = (MotionController)paramHashMap.next();
        int i = localMotionController.getDrawPath();
        int j = i;
        if (paramInt2 > 0)
        {
          j = i;
          if (i == 0) {
            j = 1;
          }
        }
        if (j != 0)
        {
          mKeyFrameCount = localMotionController.buildKeyFrames(mKeyFramePoints, mPathMode);
          if (j >= 1)
          {
            int k = paramInt1 / 16;
            localObject = mPoints;
            if ((localObject == null) || (localObject.length != k * 2))
            {
              mPoints = new float[k * 2];
              mPath = new Path();
            }
            i = mShadowTranslate;
            paramCanvas.translate(i, i);
            mPaint.setColor(1996488704);
            mFillPaint.setColor(1996488704);
            mPaintKeyframes.setColor(1996488704);
            mPaintGraph.setColor(1996488704);
            localMotionController.buildPath(mPoints, k);
            drawAll(paramCanvas, j, mKeyFrameCount, localMotionController);
            mPaint.setColor(43571);
            mPaintKeyframes.setColor(-2067046);
            mFillPaint.setColor(-2067046);
            mPaintGraph.setColor(-13391360);
            i = mShadowTranslate;
            paramCanvas.translate(-i, -i);
            drawAll(paramCanvas, j, mKeyFrameCount, localMotionController);
            if (j == 5) {
              drawRectangle(paramCanvas, localMotionController);
            }
          }
        }
      }
      paramCanvas.restore();
    }
  }
  
  public void drawAll(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
  {
    if (paramInt1 == 4) {
      drawPathAsConfigured(paramCanvas);
    }
    if (paramInt1 == 2) {
      drawPathRelative(paramCanvas);
    }
    if (paramInt1 == 3) {
      drawPathCartesian(paramCanvas);
    }
    drawBasicPath(paramCanvas);
    drawTicks(paramCanvas, paramInt1, paramInt2, paramMotionController);
  }
  
  public void getTextBounds(String paramString, Paint paramPaint)
  {
    paramPaint.getTextBounds(paramString, 0, paramString.length(), mBounds);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */