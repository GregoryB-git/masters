package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$TriggerType
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */