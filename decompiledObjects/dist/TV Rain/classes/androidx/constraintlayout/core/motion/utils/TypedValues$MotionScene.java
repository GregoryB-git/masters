package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$MotionScene
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */