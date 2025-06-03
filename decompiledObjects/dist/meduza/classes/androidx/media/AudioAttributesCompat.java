package androidx.media;

import android.util.SparseIntArray;
import b2.e;

public class AudioAttributesCompat
  implements e
{
  public AudioAttributesImpl a;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    localSparseIntArray.put(5, 1);
    localSparseIntArray.put(6, 2);
    localSparseIntArray.put(7, 2);
    localSparseIntArray.put(8, 1);
    localSparseIntArray.put(9, 1);
    localSparseIntArray.put(10, 1);
  }
  
  public AudioAttributesCompat() {}
  
  public AudioAttributesCompat(AudioAttributesImpl paramAudioAttributesImpl)
  {
    a = paramAudioAttributesImpl;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1) {
      return 7;
    }
    int i = 0;
    if ((paramInt1 & 0x4) == 4) {
      return 6;
    }
    paramInt1 = i;
    switch (paramInt2)
    {
    case 15: 
    default: 
      break;
    case 13: 
      return 1;
    case 11: 
      return 10;
    case 6: 
      return 2;
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      paramInt1 = 8;
    case 2: 
      return paramInt1;
    }
    return 3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesCompat;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Object localObject = (AudioAttributesCompat)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject == null) {
        bool2 = true;
      }
      return bool2;
    }
    return paramObject.equals(localObject);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */