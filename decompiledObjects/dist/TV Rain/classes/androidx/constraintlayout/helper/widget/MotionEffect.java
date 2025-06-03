package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class MotionEffect
  extends MotionHelper
{
  public static final int AUTO = -1;
  public static final int EAST = 2;
  public static final int NORTH = 0;
  public static final int SOUTH = 1;
  public static final String TAG = "FadeMove";
  private static final int UNSET = -1;
  public static final int WEST = 3;
  private int fadeMove = -1;
  private float motionEffectAlpha = 0.1F;
  private int motionEffectEnd = 50;
  private int motionEffectStart = 49;
  private boolean motionEffectStrictMove = true;
  private int motionEffectTranslationX = 0;
  private int motionEffectTranslationY = 0;
  private int viewTransitionId = -1;
  
  public MotionEffect(Context paramContext)
  {
    super(paramContext);
  }
  
  public MotionEffect(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public MotionEffect(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MotionEffect);
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.MotionEffect_motionEffect_start)
        {
          k = paramContext.getInt(k, motionEffectStart);
          motionEffectStart = k;
          motionEffectStart = Math.max(Math.min(k, 99), 0);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_end)
        {
          k = paramContext.getInt(k, motionEffectEnd);
          motionEffectEnd = k;
          motionEffectEnd = Math.max(Math.min(k, 99), 0);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_translationX)
        {
          motionEffectTranslationX = paramContext.getDimensionPixelOffset(k, motionEffectTranslationX);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_translationY)
        {
          motionEffectTranslationY = paramContext.getDimensionPixelOffset(k, motionEffectTranslationY);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_alpha)
        {
          motionEffectAlpha = paramContext.getFloat(k, motionEffectAlpha);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_move)
        {
          fadeMove = paramContext.getInt(k, fadeMove);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_strict)
        {
          motionEffectStrictMove = paramContext.getBoolean(k, motionEffectStrictMove);
        }
        else if (k == R.styleable.MotionEffect_motionEffect_viewTransition)
        {
          viewTransitionId = paramContext.getResourceId(k, viewTransitionId);
        }
      }
      j = motionEffectStart;
      i = motionEffectEnd;
      if (j == i) {
        if (j > 0) {
          motionEffectStart = (j - 1);
        } else {
          motionEffectEnd = (i + 1);
        }
      }
      paramContext.recycle();
    }
  }
  
  public boolean isDecorator()
  {
    return true;
  }
  
  public void onPreSetup(MotionLayout paramMotionLayout, HashMap<View, MotionController> paramHashMap)
  {
    View[] arrayOfView = getViews((ConstraintLayout)getParent());
    if (arrayOfView == null)
    {
      paramMotionLayout = new StringBuilder();
      paramMotionLayout.append(Debug.getLoc());
      paramMotionLayout.append(" views = null");
      Log.v("FadeMove", paramMotionLayout.toString());
      return;
    }
    KeyAttributes localKeyAttributes1 = new KeyAttributes();
    KeyAttributes localKeyAttributes2 = new KeyAttributes();
    localKeyAttributes1.setValue("alpha", Float.valueOf(motionEffectAlpha));
    localKeyAttributes2.setValue("alpha", Float.valueOf(motionEffectAlpha));
    localKeyAttributes1.setFramePosition(motionEffectStart);
    localKeyAttributes2.setFramePosition(motionEffectEnd);
    KeyPosition localKeyPosition1 = new KeyPosition();
    localKeyPosition1.setFramePosition(motionEffectStart);
    localKeyPosition1.setType(0);
    localKeyPosition1.setValue("percentX", Integer.valueOf(0));
    localKeyPosition1.setValue("percentY", Integer.valueOf(0));
    KeyPosition localKeyPosition2 = new KeyPosition();
    localKeyPosition2.setFramePosition(motionEffectEnd);
    localKeyPosition2.setType(0);
    localKeyPosition2.setValue("percentX", Integer.valueOf(1));
    localKeyPosition2.setValue("percentY", Integer.valueOf(1));
    int i = motionEffectTranslationX;
    KeyAttributes localKeyAttributes3 = null;
    KeyAttributes localKeyAttributes4;
    KeyAttributes localKeyAttributes5;
    if (i > 0)
    {
      localKeyAttributes4 = new KeyAttributes();
      localKeyAttributes5 = new KeyAttributes();
      localKeyAttributes4.setValue("translationX", Integer.valueOf(motionEffectTranslationX));
      localKeyAttributes4.setFramePosition(motionEffectEnd);
      localKeyAttributes5.setValue("translationX", Integer.valueOf(0));
      localKeyAttributes5.setFramePosition(motionEffectEnd - 1);
    }
    else
    {
      localKeyAttributes4 = null;
      localKeyAttributes5 = localKeyAttributes4;
    }
    KeyAttributes localKeyAttributes6;
    if (motionEffectTranslationY > 0)
    {
      localKeyAttributes3 = new KeyAttributes();
      localKeyAttributes6 = new KeyAttributes();
      localKeyAttributes3.setValue("translationY", Integer.valueOf(motionEffectTranslationY));
      localKeyAttributes3.setFramePosition(motionEffectEnd);
      localKeyAttributes6.setValue("translationY", Integer.valueOf(0));
      localKeyAttributes6.setFramePosition(motionEffectEnd - 1);
    }
    else
    {
      localKeyAttributes6 = null;
    }
    i = fadeMove;
    int j = i;
    Object localObject;
    float f1;
    float f2;
    int m;
    if (i == -1)
    {
      localObject = new int[4];
      for (i = 0; i < arrayOfView.length; i++)
      {
        MotionController localMotionController = (MotionController)paramHashMap.get(arrayOfView[i]);
        if (localMotionController != null)
        {
          f1 = localMotionController.getFinalX() - localMotionController.getStartX();
          f2 = localMotionController.getFinalY() - localMotionController.getStartY();
          if (f2 < 0.0F) {
            localObject[1] += 1;
          }
          if (f2 > 0.0F) {
            localObject[0] += 1;
          }
          if (f1 > 0.0F) {
            localObject[3] += 1;
          }
          if (f1 < 0.0F) {
            localObject[2] += 1;
          }
        }
      }
      int k = localObject[0];
      m = 0;
      i = 1;
      for (;;)
      {
        j = m;
        if (i >= 4) {
          break;
        }
        int n = localObject[i];
        j = k;
        if (k < n)
        {
          m = i;
          j = n;
        }
        i++;
        k = j;
      }
    }
    for (i = 0; i < arrayOfView.length; i++)
    {
      localObject = (MotionController)paramHashMap.get(arrayOfView[i]);
      if (localObject != null)
      {
        label731:
        label761:
        label764:
        do
        {
          f1 = ((MotionController)localObject).getFinalX() - ((MotionController)localObject).getStartX();
          f2 = ((MotionController)localObject).getFinalY() - ((MotionController)localObject).getStartY();
          if (j == 0) {
            if ((f2 <= 0.0F) || ((motionEffectStrictMove) && (f1 != 0.0F))) {}
          }
          do
          {
            for (;;)
            {
              m = 0;
              break label764;
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      break label761;
                      if (j != 1) {
                        break;
                      }
                    } while (f2 >= 0.0F);
                    if (!motionEffectStrictMove) {
                      break;
                    }
                  } while (f1 != 0.0F);
                  break;
                  if (j != 2) {
                    break label731;
                  }
                } while (f1 >= 0.0F);
                if (!motionEffectStrictMove) {
                  break;
                }
              } while (f2 != 0.0F);
            }
          } while ((j == 3) && (f1 > 0.0F) && ((!motionEffectStrictMove) || (f2 == 0.0F)));
          m = 1;
        } while (m == 0);
        m = viewTransitionId;
        if (m == -1)
        {
          ((MotionController)localObject).addKey(localKeyAttributes1);
          ((MotionController)localObject).addKey(localKeyAttributes2);
          ((MotionController)localObject).addKey(localKeyPosition1);
          ((MotionController)localObject).addKey(localKeyPosition2);
          if (motionEffectTranslationX > 0)
          {
            ((MotionController)localObject).addKey(localKeyAttributes4);
            ((MotionController)localObject).addKey(localKeyAttributes5);
          }
          if (motionEffectTranslationY > 0)
          {
            ((MotionController)localObject).addKey(localKeyAttributes3);
            ((MotionController)localObject).addKey(localKeyAttributes6);
          }
        }
        else
        {
          paramMotionLayout.applyViewTransition(m, (MotionController)localObject);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.MotionEffect
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */