package com.google.android.datatransport;

public enum Priority
{
  static
  {
    Priority localPriority1 = new Priority("DEFAULT", 0);
    DEFAULT = localPriority1;
    Priority localPriority2 = new Priority("VERY_LOW", 1);
    VERY_LOW = localPriority2;
    Priority localPriority3 = new Priority("HIGHEST", 2);
    HIGHEST = localPriority3;
    $VALUES = new Priority[] { localPriority1, localPriority2, localPriority3 };
  }
  
  private Priority() {}
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.Priority
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */