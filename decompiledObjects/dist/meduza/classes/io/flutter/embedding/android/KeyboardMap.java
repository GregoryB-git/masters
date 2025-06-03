package io.flutter.embedding.android;

import a0.j;
import f;
import java.util.AbstractMap;
import java.util.HashMap;

public class KeyboardMap
{
  public static final long kAndroidPlane = 73014444032L;
  public static final long kUnicodePlane = 0L;
  public static final long kValueMask = 4294967295L;
  public static final HashMap<Long, Long> keyCodeToLogical = new HashMap()
  {
    private static final long serialVersionUID = 1L;
  };
  public static final PressingGoal[] pressingGoals = { new PressingGoal(4096, new KeyPair[] { new KeyPair(458976L, 8589934848L), new KeyPair(458980L, 8589934849L) }), new PressingGoal(1, new KeyPair[] { new KeyPair(458977L, 8589934850L), new KeyPair(458981L, 8589934851L) }), new PressingGoal(2, new KeyPair[] { new KeyPair(458978L, 8589934852L), new KeyPair(458982L, 8589934853L) }) };
  public static final HashMap<Long, Long> scanCodeToPhysical = new HashMap()
  {
    private static final long serialVersionUID = 1L;
  };
  
  public static TogglingGoal[] getTogglingGoals()
  {
    return new TogglingGoal[] { new TogglingGoal(1048576, 458809L, 4294967556L) };
  }
  
  public static class KeyPair
  {
    public long logicalKey;
    public long physicalKey;
    
    public KeyPair(long paramLong1, long paramLong2)
    {
      physicalKey = paramLong1;
      logicalKey = paramLong2;
    }
  }
  
  public static class PressingGoal
  {
    public final KeyboardMap.KeyPair[] keys;
    public final int mask;
    
    public PressingGoal(int paramInt, KeyboardMap.KeyPair[] paramArrayOfKeyPair)
    {
      mask = paramInt;
      keys = paramArrayOfKeyPair;
    }
  }
  
  public static class TogglingGoal
  {
    public boolean enabled = false;
    public final long logicalKey;
    public final int mask;
    public final long physicalKey;
    
    public TogglingGoal(int paramInt, long paramLong1, long paramLong2)
    {
      mask = paramInt;
      physicalKey = paramLong1;
      logicalKey = paramLong2;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */