package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues
{
  public static final int BOOLEAN_MASK = 1;
  public static final int FLOAT_MASK = 4;
  public static final int INT_MASK = 2;
  public static final int STRING_MASK = 8;
  public static final String S_CUSTOM = "CUSTOM";
  public static final int TYPE_FRAME_POSITION = 100;
  public static final int TYPE_TARGET = 101;
  
  public abstract int getId(String paramString);
  
  public abstract boolean setValue(int paramInt, float paramFloat);
  
  public abstract boolean setValue(int paramInt1, int paramInt2);
  
  public abstract boolean setValue(int paramInt, String paramString);
  
  public abstract boolean setValue(int paramInt, boolean paramBoolean);
  
  public static abstract interface AttributesType
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
  
  public static abstract interface Custom
  {
    public static final String[] KEY_WORDS = { "float", "color", "string", "boolean", "dimension", "refrence" };
    public static final String NAME = "Custom";
    public static final String S_BOOLEAN = "boolean";
    public static final String S_COLOR = "color";
    public static final String S_DIMENSION = "dimension";
    public static final String S_FLOAT = "float";
    public static final String S_INT = "integer";
    public static final String S_REFERENCE = "refrence";
    public static final String S_STRING = "string";
    public static final int TYPE_BOOLEAN = 904;
    public static final int TYPE_COLOR = 902;
    public static final int TYPE_DIMENSION = 905;
    public static final int TYPE_FLOAT = 901;
    public static final int TYPE_INT = 900;
    public static final int TYPE_REFERENCE = 906;
    public static final int TYPE_STRING = 903;
    
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
                  } while (!paramString.equals("integer"));
                  i = 6;
                  break;
                } while (!paramString.equals("float"));
                i = 5;
                break;
              } while (!paramString.equals("color"));
              i = 4;
              break;
            } while (!paramString.equals("boolean"));
            i = 3;
            break;
          } while (!paramString.equals("refrence"));
          i = 2;
          break;
        } while (!paramString.equals("string"));
        i = 1;
        break;
      } while (!paramString.equals("dimension"));
      int i = 0;
      switch (i)
      {
      default: 
        return -1;
      case 6: 
        return 900;
      case 5: 
        return 901;
      case 4: 
        return 902;
      case 3: 
        return 904;
      case 2: 
        return 906;
      case 1: 
        return 903;
      }
      return 905;
    }
  }
  
  public static abstract interface CycleType
  {
    public static final String[] KEY_WORDS = { "curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase" };
    public static final String NAME = "KeyCycle";
    public static final String S_ALPHA = "alpha";
    public static final String S_CURVE_FIT = "curveFit";
    public static final String S_CUSTOM_WAVE_SHAPE = "customWave";
    public static final String S_EASING = "easing";
    public static final String S_ELEVATION = "elevation";
    public static final String S_PATH_ROTATE = "pathRotate";
    public static final String S_PIVOT_X = "pivotX";
    public static final String S_PIVOT_Y = "pivotY";
    public static final String S_PROGRESS = "progress";
    public static final String S_ROTATION_X = "rotationX";
    public static final String S_ROTATION_Y = "rotationY";
    public static final String S_ROTATION_Z = "rotationZ";
    public static final String S_SCALE_X = "scaleX";
    public static final String S_SCALE_Y = "scaleY";
    public static final String S_TRANSLATION_X = "translationX";
    public static final String S_TRANSLATION_Y = "translationY";
    public static final String S_TRANSLATION_Z = "translationZ";
    public static final String S_VISIBILITY = "visibility";
    public static final String S_WAVE_OFFSET = "offset";
    public static final String S_WAVE_PERIOD = "period";
    public static final String S_WAVE_PHASE = "phase";
    public static final String S_WAVE_SHAPE = "waveShape";
    public static final int TYPE_ALPHA = 403;
    public static final int TYPE_CURVE_FIT = 401;
    public static final int TYPE_CUSTOM_WAVE_SHAPE = 422;
    public static final int TYPE_EASING = 420;
    public static final int TYPE_ELEVATION = 307;
    public static final int TYPE_PATH_ROTATE = 416;
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
    public static final int TYPE_VISIBILITY = 402;
    public static final int TYPE_WAVE_OFFSET = 424;
    public static final int TYPE_WAVE_PERIOD = 423;
    public static final int TYPE_WAVE_PHASE = 425;
    public static final int TYPE_WAVE_SHAPE = 421;
    
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
                                      i = -1;
                                      break;
                                    } while (!paramString.equals("visibility"));
                                    i = 15;
                                    break;
                                  } while (!paramString.equals("pathRotate"));
                                  i = 14;
                                  break;
                                } while (!paramString.equals("curveFit"));
                                i = 13;
                                break;
                              } while (!paramString.equals("alpha"));
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
      case 15: 
        return 402;
      case 14: 
        return 416;
      case 13: 
        return 401;
      case 12: 
        return 403;
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
      return 420;
    }
    
    public static int getType(int paramInt)
    {
      if (paramInt != 100)
      {
        if (paramInt != 101)
        {
          if (paramInt != 416)
          {
            if ((paramInt == 420) || (paramInt == 421)) {
              break label156;
            }
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                switch (paramInt)
                {
                default: 
                  return -1;
                }
                break;
              }
              break;
            }
          }
          return 4;
        }
        label156:
        return 8;
      }
      return 2;
    }
  }
  
  public static abstract interface MotionScene
  {
    public static final String[] KEY_WORDS = { "defaultDuration", "layoutDuringTransition" };
    public static final String NAME = "MotionScene";
    public static final String S_DEFAULT_DURATION = "defaultDuration";
    public static final String S_LAYOUT_DURING_TRANSITION = "layoutDuringTransition";
    public static final int TYPE_DEFAULT_DURATION = 600;
    public static final int TYPE_LAYOUT_DURING_TRANSITION = 601;
    
    public static int getId(String paramString)
    {
      paramString.getClass();
      if (!paramString.equals("defaultDuration"))
      {
        if (!paramString.equals("layoutDuringTransition")) {
          return -1;
        }
        return 601;
      }
      return 600;
    }
    
    public static int getType(int paramInt)
    {
      if (paramInt != 600)
      {
        if (paramInt != 601) {
          return -1;
        }
        return 1;
      }
      return 2;
    }
  }
  
  public static abstract interface MotionType
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
  
  public static abstract interface OnSwipe
  {
    public static final String AUTOCOMPLETE_MODE = "autocompletemode";
    public static final String[] AUTOCOMPLETE_MODE_ENUM = { "continuousVelocity", "spring" };
    public static final String DRAG_DIRECTION = "dragdirection";
    public static final String DRAG_SCALE = "dragscale";
    public static final String DRAG_THRESHOLD = "dragthreshold";
    public static final String LIMIT_BOUNDS_TO = "limitboundsto";
    public static final String MAX_ACCELERATION = "maxacceleration";
    public static final String MAX_VELOCITY = "maxvelocity";
    public static final String MOVE_WHEN_SCROLLAT_TOP = "movewhenscrollattop";
    public static final String NESTED_SCROLL_FLAGS = "nestedscrollflags";
    public static final String[] NESTED_SCROLL_FLAGS_ENUM = { "none", "disablePostScroll", "disableScroll", "supportScrollUp" };
    public static final String ON_TOUCH_UP = "ontouchup";
    public static final String[] ON_TOUCH_UP_ENUM = { "autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd" };
    public static final String ROTATION_CENTER_ID = "rotationcenterid";
    public static final String SPRINGS_TOP_THRESHOLD = "springstopthreshold";
    public static final String SPRING_BOUNDARY = "springboundary";
    public static final String[] SPRING_BOUNDARY_ENUM = { "overshoot", "bounceStart", "bounceEnd", "bounceBoth" };
    public static final String SPRING_DAMPING = "springdamping";
    public static final String SPRING_MASS = "springmass";
    public static final String SPRING_STIFFNESS = "springstiffness";
    public static final String TOUCH_ANCHOR_ID = "touchanchorid";
    public static final String TOUCH_ANCHOR_SIDE = "touchanchorside";
    public static final String TOUCH_REGION_ID = "touchregionid";
  }
  
  public static abstract interface PositionType
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
  
  public static abstract interface TransitionType
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
  
  public static abstract interface TriggerType
  {
    public static final String CROSS = "CROSS";
    public static final String[] KEY_WORDS = { "viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS" };
    public static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    
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
                              i = -1;
                              break;
                            } while (!paramString.equals("triggerReceiver"));
                            i = 11;
                            break;
                          } while (!paramString.equals("postLayout"));
                          i = 10;
                          break;
                        } while (!paramString.equals("viewTransitionOnCross"));
                        i = 9;
                        break;
                      } while (!paramString.equals("triggerSlack"));
                      i = 8;
                      break;
                    } while (!paramString.equals("CROSS"));
                    i = 7;
                    break;
                  } while (!paramString.equals("viewTransitionOnNegativeCross"));
                  i = 6;
                  break;
                } while (!paramString.equals("triggerCollisionView"));
                i = 5;
                break;
              } while (!paramString.equals("negativeCross"));
              i = 4;
              break;
            } while (!paramString.equals("triggerID"));
            i = 3;
            break;
          } while (!paramString.equals("triggerCollisionId"));
          i = 2;
          break;
        } while (!paramString.equals("viewTransitionOnPositiveCross"));
        i = 1;
        break;
      } while (!paramString.equals("positiveCross"));
      int i = 0;
      switch (i)
      {
      default: 
        return -1;
      case 11: 
        return 311;
      case 10: 
        return 304;
      case 9: 
        return 301;
      case 8: 
        return 305;
      case 7: 
        return 312;
      case 6: 
        return 303;
      case 5: 
        return 306;
      case 4: 
        return 310;
      case 3: 
        return 308;
      case 2: 
        return 307;
      case 1: 
        return 302;
      }
      return 309;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */