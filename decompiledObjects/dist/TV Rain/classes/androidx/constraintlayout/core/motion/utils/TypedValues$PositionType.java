package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$PositionType
{
  public static final String[] KEY_WORDS = { "transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY" };
  public static final String NAME = "KeyPosition";
  public static final String S_DRAWPATH = "drawPath";
  public static final String S_PERCENT_HEIGHT = "percentHeight";
  public static final String S_PERCENT_WIDTH = "percentWidth";
  public static final String S_PERCENT_X = "percentX";
  public static final String S_PERCENT_Y = "percentY";
  public static final String S_SIZE_PERCENT = "sizePercent";
  public static final String S_TRANSITION_EASING = "transitionEasing";
  public static final int TYPE_CURVE_FIT = 508;
  public static final int TYPE_DRAWPATH = 502;
  public static final int TYPE_PATH_MOTION_ARC = 509;
  public static final int TYPE_PERCENT_HEIGHT = 504;
  public static final int TYPE_PERCENT_WIDTH = 503;
  public static final int TYPE_PERCENT_X = 506;
  public static final int TYPE_PERCENT_Y = 507;
  public static final int TYPE_POSITION_TYPE = 510;
  public static final int TYPE_SIZE_PERCENT = 505;
  public static final int TYPE_TRANSITION_EASING = 501;
  
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
                  i = -1;
                  break;
                } while (!paramString.equals("percentY"));
                i = 6;
                break;
              } while (!paramString.equals("percentX"));
              i = 5;
              break;
            } while (!paramString.equals("sizePercent"));
            i = 4;
            break;
          } while (!paramString.equals("drawPath"));
          i = 3;
          break;
        } while (!paramString.equals("percentHeight"));
        i = 2;
        break;
      } while (!paramString.equals("percentWidth"));
      i = 1;
      break;
    } while (!paramString.equals("transitionEasing"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 6: 
      return 507;
    case 5: 
      return 506;
    case 4: 
      return 505;
    case 3: 
      return 502;
    case 2: 
      return 504;
    case 1: 
      return 503;
    }
    return 501;
  }
  
  public static int getType(int paramInt)
  {
    if (paramInt != 100)
    {
      if (paramInt != 101) {}
      switch (paramInt)
      {
      default: 
        return -1;
      case 503: 
      case 504: 
      case 505: 
      case 506: 
      case 507: 
        return 4;
      case 501: 
      case 502: 
        return 8;
      }
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.PositionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */