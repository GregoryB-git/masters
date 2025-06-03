package Q1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum c$c
{
  public final String e()
  {
    int i = a.a[ordinal()];
    String str;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5) {
              str = "Unknown";
            } else {
              str = "thread_check_log_";
            }
          }
          else {
            str = "shield_log_";
          }
        }
        else {
          str = "crash_log_";
        }
      }
      else {
        str = "anr_log_";
      }
    }
    else {
      str = "analysis_log_";
    }
    return str;
  }
  
  public String toString()
  {
    int i = a.a[ordinal()];
    String str;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5) {
              str = "Unknown";
            } else {
              str = "ThreadCheck";
            }
          }
          else {
            str = "CrashShield";
          }
        }
        else {
          str = "CrashReport";
        }
      }
      else {
        str = "AnrReport";
      }
    }
    else {
      str = "Analysis";
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     Q1.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */