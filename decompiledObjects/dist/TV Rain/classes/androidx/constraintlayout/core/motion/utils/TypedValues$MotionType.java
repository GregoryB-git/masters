package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$MotionType
{
  public static final String[] KEY_WORDS = { "Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID" };
  public static final String NAME = "Motion";
  public static final String S_ANIMATE_CIRCLEANGLE_TO = "AnimateCircleAngleTo";
  public static final String S_ANIMATE_RELATIVE_TO = "AnimateRelativeTo";
  public static final String S_DRAW_PATH = "DrawPath";
  public static final String S_EASING = "TransitionEasing";
  public static final String S_PATHMOTION_ARC = "PathMotionArc";
  public static final String S_PATH_ROTATE = "PathRotate";
  public static final String S_POLAR_RELATIVETO = "PolarRelativeTo";
  public static final String S_QUANTIZE_INTERPOLATOR = "QuantizeInterpolator";
  public static final String S_QUANTIZE_INTERPOLATOR_ID = "QuantizeInterpolatorID";
  public static final String S_QUANTIZE_INTERPOLATOR_TYPE = "QuantizeInterpolatorType";
  public static final String S_QUANTIZE_MOTIONSTEPS = "QuantizeMotionSteps";
  public static final String S_QUANTIZE_MOTION_PHASE = "QuantizeMotionPhase";
  public static final String S_STAGGER = "Stagger";
  public static final int TYPE_ANIMATE_CIRCLEANGLE_TO = 606;
  public static final int TYPE_ANIMATE_RELATIVE_TO = 605;
  public static final int TYPE_DRAW_PATH = 608;
  public static final int TYPE_EASING = 603;
  public static final int TYPE_PATHMOTION_ARC = 607;
  public static final int TYPE_PATH_ROTATE = 601;
  public static final int TYPE_POLAR_RELATIVETO = 609;
  public static final int TYPE_QUANTIZE_INTERPOLATOR = 604;
  public static final int TYPE_QUANTIZE_INTERPOLATOR_ID = 612;
  public static final int TYPE_QUANTIZE_INTERPOLATOR_TYPE = 611;
  public static final int TYPE_QUANTIZE_MOTIONSTEPS = 610;
  public static final int TYPE_QUANTIZE_MOTION_PHASE = 602;
  public static final int TYPE_STAGGER = 600;
  
  public static int getId(String paramString)
  {
    paramString.getClass();
    switch (paramString.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              i = -1;
                              break;
                            } while (!paramString.equals("PathMotionArc"));
                            i = 12;
                            break;
                          } while (!paramString.equals("AnimateRelativeTo"));
                          i = 11;
                          break;
                        } while (!paramString.equals("TransitionEasing"));
                        i = 10;
                        break;
                      } while (!paramString.equals("QuantizeInterpolatorID"));
                      i = 9;
                      break;
                    } while (!paramString.equals("QuantizeInterpolatorType"));
                    i = 8;
                    break;
                  } while (!paramString.equals("PolarRelativeTo"));
                  i = 7;
                  break;
                } while (!paramString.equals("Stagger"));
                i = 6;
                break;
              } while (!paramString.equals("DrawPath"));
              i = 5;
              break;
            } while (!paramString.equals("QuantizeInterpolator"));
            i = 4;
            break;
          } while (!paramString.equals("PathRotate"));
          i = 3;
          break;
        } while (!paramString.equals("QuantizeMotionSteps"));
        i = 2;
        break;
      } while (!paramString.equals("QuantizeMotionPhase"));
      i = 1;
      break;
    } while (!paramString.equals("AnimateCircleAngleTo"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 12: 
      return 607;
    case 11: 
      return 605;
    case 10: 
      return 603;
    case 9: 
      return 612;
    case 8: 
      return 611;
    case 7: 
      return 609;
    case 6: 
      return 600;
    case 5: 
      return 608;
    case 4: 
      return 604;
    case 3: 
      return 601;
    case 2: 
      return 610;
    case 1: 
      return 602;
    }
    return 606;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.MotionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */