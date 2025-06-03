package com.facebook.imagepipeline.common;

import javax.annotation.Nullable;

public enum Priority
{
  static
  {
    Priority localPriority1 = new Priority("LOW", 0);
    LOW = localPriority1;
    Priority localPriority2 = new Priority("MEDIUM", 1);
    MEDIUM = localPriority2;
    Priority localPriority3 = new Priority("HIGH", 2);
    HIGH = localPriority3;
    $VALUES = new Priority[] { localPriority1, localPriority2, localPriority3 };
  }
  
  private Priority() {}
  
  public static Priority getHigherPriority(@Nullable Priority paramPriority1, @Nullable Priority paramPriority2)
  {
    if (paramPriority1 == null) {
      return paramPriority2;
    }
    if (paramPriority2 == null) {
      return paramPriority1;
    }
    if (paramPriority1.ordinal() > paramPriority2.ordinal()) {
      return paramPriority1;
    }
    return paramPriority2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.common.Priority
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */