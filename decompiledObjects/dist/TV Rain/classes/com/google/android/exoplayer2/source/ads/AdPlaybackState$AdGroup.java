package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

public final class AdPlaybackState$AdGroup
{
  public final int count;
  public final long[] durationsUs;
  public final int[] states;
  public final Uri[] uris;
  
  public AdPlaybackState$AdGroup()
  {
    this(-1, new int[0], new Uri[0], new long[0]);
  }
  
  private AdPlaybackState$AdGroup(int paramInt, int[] paramArrayOfInt, Uri[] paramArrayOfUri, long[] paramArrayOfLong)
  {
    boolean bool;
    if (paramArrayOfInt.length == paramArrayOfUri.length) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    count = paramInt;
    states = paramArrayOfInt;
    uris = paramArrayOfUri;
    durationsUs = paramArrayOfLong;
  }
  
  @CheckResult
  private static long[] copyDurationsUsWithSpaceForAdCount(long[] paramArrayOfLong, int paramInt)
  {
    int i = paramArrayOfLong.length;
    paramInt = Math.max(paramInt, i);
    paramArrayOfLong = Arrays.copyOf(paramArrayOfLong, paramInt);
    Arrays.fill(paramArrayOfLong, i, paramInt, -9223372036854775807L);
    return paramArrayOfLong;
  }
  
  @CheckResult
  private static int[] copyStatesWithSpaceForAdCount(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    paramInt = Math.max(paramInt, i);
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramInt);
    Arrays.fill(paramArrayOfInt, i, paramInt, 0);
    return paramArrayOfInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AdGroup.class == paramObject.getClass()))
    {
      paramObject = (AdGroup)paramObject;
      if ((count != count) || (!Arrays.equals(uris, uris)) || (!Arrays.equals(states, states)) || (!Arrays.equals(durationsUs, durationsUs))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getFirstAdIndexToPlay()
  {
    return getNextAdIndexToPlay(-1);
  }
  
  public int getNextAdIndexToPlay(int paramInt)
  {
    
    for (;;)
    {
      int[] arrayOfInt = states;
      if (paramInt >= arrayOfInt.length) {
        break;
      }
      int i = arrayOfInt[paramInt];
      if ((i == 0) || (i == 1)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public boolean hasUnplayedAds()
  {
    boolean bool;
    if ((count != -1) && (getFirstAdIndexToPlay() >= count)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = count;
    int j = Arrays.hashCode(uris);
    int k = Arrays.hashCode(states);
    return Arrays.hashCode(durationsUs) + (k + (i * 31 + j) * 31) * 31;
  }
  
  @CheckResult
  public AdGroup withAdCount(int paramInt)
  {
    boolean bool;
    if ((count == -1) && (states.length <= paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    int[] arrayOfInt = copyStatesWithSpaceForAdCount(states, paramInt);
    long[] arrayOfLong = copyDurationsUsWithSpaceForAdCount(durationsUs, paramInt);
    return new AdGroup(paramInt, arrayOfInt, (Uri[])Arrays.copyOf(uris, paramInt), arrayOfLong);
  }
  
  @CheckResult
  public AdGroup withAdDurationsUs(long[] paramArrayOfLong)
  {
    boolean bool;
    if ((count != -1) && (paramArrayOfLong.length > uris.length)) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkArgument(bool);
    int i = paramArrayOfLong.length;
    Uri[] arrayOfUri = uris;
    long[] arrayOfLong = paramArrayOfLong;
    if (i < arrayOfUri.length) {
      arrayOfLong = copyDurationsUsWithSpaceForAdCount(paramArrayOfLong, arrayOfUri.length);
    }
    return new AdGroup(count, states, uris, arrayOfLong);
  }
  
  @CheckResult
  public AdGroup withAdState(int paramInt1, int paramInt2)
  {
    int i = count;
    boolean bool1 = false;
    boolean bool2;
    if ((i != -1) && (paramInt2 >= i)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    Assertions.checkArgument(bool2);
    int[] arrayOfInt = copyStatesWithSpaceForAdCount(states, paramInt2 + 1);
    i = arrayOfInt[paramInt2];
    if ((i != 0) && (i != 1))
    {
      bool2 = bool1;
      if (i != paramInt1) {}
    }
    else
    {
      bool2 = true;
    }
    Assertions.checkArgument(bool2);
    long[] arrayOfLong = durationsUs;
    if (arrayOfLong.length != arrayOfInt.length) {
      arrayOfLong = copyDurationsUsWithSpaceForAdCount(arrayOfLong, arrayOfInt.length);
    }
    Uri[] arrayOfUri = uris;
    if (arrayOfUri.length != arrayOfInt.length) {
      arrayOfUri = (Uri[])Arrays.copyOf(arrayOfUri, arrayOfInt.length);
    }
    arrayOfInt[paramInt2] = paramInt1;
    return new AdGroup(count, arrayOfInt, arrayOfUri, arrayOfLong);
  }
  
  @CheckResult
  public AdGroup withAdUri(Uri paramUri, int paramInt)
  {
    int i = count;
    boolean bool1 = false;
    if ((i != -1) && (paramInt >= i)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    Assertions.checkArgument(bool2);
    int[] arrayOfInt = copyStatesWithSpaceForAdCount(states, paramInt + 1);
    boolean bool2 = bool1;
    if (arrayOfInt[paramInt] == 0) {
      bool2 = true;
    }
    Assertions.checkArgument(bool2);
    long[] arrayOfLong = durationsUs;
    if (arrayOfLong.length != arrayOfInt.length) {
      arrayOfLong = copyDurationsUsWithSpaceForAdCount(arrayOfLong, arrayOfInt.length);
    }
    Uri[] arrayOfUri = (Uri[])Arrays.copyOf(uris, arrayOfInt.length);
    arrayOfUri[paramInt] = paramUri;
    arrayOfInt[paramInt] = 1;
    return new AdGroup(count, arrayOfInt, arrayOfUri, arrayOfLong);
  }
  
  @CheckResult
  public AdGroup withAllAdsSkipped()
  {
    int i = count;
    int j = 0;
    if (i == -1) {
      return new AdGroup(0, new int[0], new Uri[0], new long[0]);
    }
    int[] arrayOfInt = states;
    i = arrayOfInt.length;
    arrayOfInt = Arrays.copyOf(arrayOfInt, i);
    while (j < i)
    {
      int k = arrayOfInt[j];
      if ((k == 1) || (k == 0)) {
        arrayOfInt[j] = 2;
      }
      j++;
    }
    return new AdGroup(i, arrayOfInt, uris, durationsUs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */