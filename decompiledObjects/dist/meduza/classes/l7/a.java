package l7;

import java.util.HashMap;

public final class a
{
  public static final HashMap a;
  public static final HashMap b;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    a = localHashMap1;
    HashMap localHashMap2 = new HashMap();
    b = localHashMap2;
    Integer localInteger1 = Integer.valueOf(-1);
    localHashMap1.put(localInteger1, "The Play Store app is either not installed or not the official version.");
    Integer localInteger2 = Integer.valueOf(-2);
    localHashMap1.put(localInteger2, "Call first requestReviewFlow to get the ReviewInfo.");
    Integer localInteger3 = Integer.valueOf(-100);
    localHashMap1.put(localInteger3, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
    localHashMap2.put(localInteger1, "PLAY_STORE_NOT_FOUND");
    localHashMap2.put(localInteger2, "INVALID_REQUEST");
    localHashMap2.put(localInteger3, "INTERNAL_ERROR");
  }
}

/* Location:
 * Qualified Name:     l7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */