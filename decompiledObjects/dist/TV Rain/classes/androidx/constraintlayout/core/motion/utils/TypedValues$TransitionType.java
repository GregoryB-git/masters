package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$TransitionType
{
  public static final String[] KEY_WORDS = { "duration", "from", "to", "pathMotionArc", "autoTransition", "motionInterpolator", "staggered", "from", "transitionFlags" };
  public static final String NAME = "Transitions";
  public static final String S_AUTO_TRANSITION = "autoTransition";
  public static final String S_DURATION = "duration";
  public static final String S_FROM = "from";
  public static final String S_INTERPOLATOR = "motionInterpolator";
  public static final String S_PATH_MOTION_ARC = "pathMotionArc";
  public static final String S_STAGGERED = "staggered";
  public static final String S_TO = "to";
  public static final String S_TRANSITION_FLAGS = "transitionFlags";
  public static final int TYPE_AUTO_TRANSITION = 704;
  public static final int TYPE_DURATION = 700;
  public static final int TYPE_FROM = 701;
  public static final int TYPE_INTERPOLATOR = 705;
  public static final int TYPE_PATH_MOTION_ARC = 509;
  public static final int TYPE_STAGGERED = 706;
  public static final int TYPE_TO = 702;
  public static final int TYPE_TRANSITION_FLAGS = 707;
  
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
                    i = -1;
                    break;
                  } while (!paramString.equals("staggered"));
                  i = 7;
                  break;
                } while (!paramString.equals("pathMotionArc"));
                i = 6;
                break;
              } while (!paramString.equals("from"));
              i = 5;
              break;
            } while (!paramString.equals("to"));
            i = 4;
            break;
          } while (!paramString.equals("autoTransition"));
          i = 3;
          break;
        } while (!paramString.equals("motionInterpolator"));
        i = 2;
        break;
      } while (!paramString.equals("duration"));
      i = 1;
      break;
    } while (!paramString.equals("transitionFlags"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 7: 
      return 706;
    case 6: 
      return 509;
    case 5: 
      return 701;
    case 4: 
      return 702;
    case 3: 
      return 704;
    case 2: 
      return 705;
    case 1: 
      return 700;
    }
    return 707;
  }
  
  public static int getType(int paramInt)
  {
    if (paramInt != 509) {
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          return -1;
        case 706: 
          return 4;
        }
      case 701: 
      case 702: 
        return 8;
      }
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */