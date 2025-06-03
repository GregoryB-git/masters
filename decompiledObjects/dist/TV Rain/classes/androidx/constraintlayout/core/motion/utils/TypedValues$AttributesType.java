package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$AttributesType
{
  public static final String[] KEY_WORDS = { "curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget" };
  public static final String NAME = "KeyAttributes";
  public static final String S_ALPHA = "alpha";
  public static final String S_CURVE_FIT = "curveFit";
  public static final String S_CUSTOM = "CUSTOM";
  public static final String S_EASING = "easing";
  public static final String S_ELEVATION = "elevation";
  public static final String S_FRAME = "frame";
  public static final String S_PATH_ROTATE = "pathRotate";
  public static final String S_PIVOT_TARGET = "pivotTarget";
  public static final String S_PIVOT_X = "pivotX";
  public static final String S_PIVOT_Y = "pivotY";
  public static final String S_PROGRESS = "progress";
  public static final String S_ROTATION_X = "rotationX";
  public static final String S_ROTATION_Y = "rotationY";
  public static final String S_ROTATION_Z = "rotationZ";
  public static final String S_SCALE_X = "scaleX";
  public static final String S_SCALE_Y = "scaleY";
  public static final String S_TARGET = "target";
  public static final String S_TRANSLATION_X = "translationX";
  public static final String S_TRANSLATION_Y = "translationY";
  public static final String S_TRANSLATION_Z = "translationZ";
  public static final String S_VISIBILITY = "visibility";
  public static final int TYPE_ALPHA = 303;
  public static final int TYPE_CURVE_FIT = 301;
  public static final int TYPE_EASING = 317;
  public static final int TYPE_ELEVATION = 307;
  public static final int TYPE_PATH_ROTATE = 316;
  public static final int TYPE_PIVOT_TARGET = 318;
  public static final int TYPE_PIVOT_X = 313;
  public static final int TYPE_PIVOT_Y = 314;
  public static final int TYPE_PROGRESS = 315;
  public static final int TYPE_ROTATION_X = 308;
  public static final int TYPE_ROTATION_Y = 309;
  public static final int TYPE_ROTATION_Z = 310;
  public static final int TYPE_SCALE_X = 311;
  public static final int TYPE_SCALE_Y = 312;
  public static final int TYPE_TRANSLATION_X = 304;
  public static final int TYPE_TRANSLATION_Y = 305;
  public static final int TYPE_TRANSLATION_Z = 306;
  public static final int TYPE_VISIBILITY = 302;
  
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
                                          } while (!paramString.equals("visibility"));
                                          i = 19;
                                          break;
                                        } while (!paramString.equals("pivotTarget"));
                                        i = 18;
                                        break;
                                      } while (!paramString.equals("pathRotate"));
                                      i = 17;
                                      break;
                                    } while (!paramString.equals("curveFit"));
                                    i = 16;
                                    break;
                                  } while (!paramString.equals("frame"));
                                  i = 15;
                                  break;
                                } while (!paramString.equals("alpha"));
                                i = 14;
                                break;
                              } while (!paramString.equals("elevation"));
                              i = 13;
                              break;
                            } while (!paramString.equals("target"));
                            i = 12;
                            break;
                          } while (!paramString.equals("scaleY"));
                          i = 11;
                          break;
                        } while (!paramString.equals("scaleX"));
                        i = 10;
                        break;
                      } while (!paramString.equals("pivotY"));
                      i = 9;
                      break;
                    } while (!paramString.equals("pivotX"));
                    i = 8;
                    break;
                  } while (!paramString.equals("progress"));
                  i = 7;
                  break;
                } while (!paramString.equals("translationZ"));
                i = 6;
                break;
              } while (!paramString.equals("translationY"));
              i = 5;
              break;
            } while (!paramString.equals("translationX"));
            i = 4;
            break;
          } while (!paramString.equals("rotationZ"));
          i = 3;
          break;
        } while (!paramString.equals("rotationY"));
        i = 2;
        break;
      } while (!paramString.equals("rotationX"));
      i = 1;
      break;
    } while (!paramString.equals("easing"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 19: 
      return 302;
    case 18: 
      return 318;
    case 17: 
      return 316;
    case 16: 
      return 301;
    case 15: 
      return 100;
    case 14: 
      return 303;
    case 13: 
      return 307;
    case 12: 
      return 101;
    case 11: 
      return 312;
    case 10: 
      return 311;
    case 9: 
      return 314;
    case 8: 
      return 313;
    case 7: 
      return 315;
    case 6: 
      return 306;
    case 5: 
      return 305;
    case 4: 
      return 304;
    case 3: 
      return 310;
    case 2: 
      return 309;
    case 1: 
      return 308;
    }
    return 317;
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
      case 303: 
      case 304: 
      case 305: 
      case 306: 
      case 307: 
      case 308: 
      case 309: 
      case 310: 
      case 311: 
      case 312: 
      case 313: 
      case 314: 
      case 315: 
      case 316: 
        return 4;
      case 317: 
      case 318: 
        return 8;
      }
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */