package com.afollestad.materialdialogs;

public enum StackingBehavior
{
  static
  {
    StackingBehavior localStackingBehavior1 = new StackingBehavior("ALWAYS", 0);
    ALWAYS = localStackingBehavior1;
    StackingBehavior localStackingBehavior2 = new StackingBehavior("ADAPTIVE", 1);
    ADAPTIVE = localStackingBehavior2;
    StackingBehavior localStackingBehavior3 = new StackingBehavior("NEVER", 2);
    NEVER = localStackingBehavior3;
    $VALUES = new StackingBehavior[] { localStackingBehavior1, localStackingBehavior2, localStackingBehavior3 };
  }
  
  private StackingBehavior() {}
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.StackingBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */