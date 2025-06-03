package k6;

import f;

public final class c
{
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 9: 
    case 11: 
    case 12: 
    default: 
      return f.h("unknown status code: ", paramInt);
    case 22: 
      return "RECONNECTION_TIMED_OUT";
    case 21: 
      return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
    case 20: 
      return "CONNECTION_SUSPENDED_DURING_CALL";
    case 19: 
      return "REMOTE_EXCEPTION";
    case 18: 
      return "DEAD_CLIENT";
    case 17: 
      return "API_NOT_CONNECTED";
    case 16: 
      return "CANCELED";
    case 15: 
      return "TIMEOUT";
    case 14: 
      return "INTERRUPTED";
    case 13: 
      return "ERROR";
    case 10: 
      return "DEVELOPER_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 7: 
      return "NETWORK_ERROR";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 0: 
      return "SUCCESS";
    }
    return "SUCCESS_CACHE";
  }
}

/* Location:
 * Qualified Name:     k6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */