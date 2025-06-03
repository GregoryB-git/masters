package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class MappingTrackSelector$MappedTrackInfo
{
  public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
  public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
  public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
  public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
  @Deprecated
  public final int length;
  private final int rendererCount;
  private final int[][][] rendererFormatSupports;
  private final int[] rendererMixedMimeTypeAdaptiveSupports;
  private final TrackGroupArray[] rendererTrackGroups;
  private final int[] rendererTrackTypes;
  private final TrackGroupArray unmappedTrackGroups;
  
  public MappingTrackSelector$MappedTrackInfo(int[] paramArrayOfInt1, TrackGroupArray[] paramArrayOfTrackGroupArray, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, TrackGroupArray paramTrackGroupArray)
  {
    rendererTrackTypes = paramArrayOfInt1;
    rendererTrackGroups = paramArrayOfTrackGroupArray;
    rendererFormatSupports = paramArrayOfInt;
    rendererMixedMimeTypeAdaptiveSupports = paramArrayOfInt2;
    unmappedTrackGroups = paramTrackGroupArray;
    int i = paramArrayOfInt1.length;
    rendererCount = i;
    length = i;
  }
  
  public int getAdaptiveSupport(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = rendererTrackGroups[paramInt1].get(paramInt2).length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      int m = getTrackSupport(paramInt1, paramInt2, j);
      if (m != 4)
      {
        n = k;
        if (paramBoolean)
        {
          n = k;
          if (m != 3) {}
        }
      }
      else
      {
        arrayOfInt[k] = j;
        n = k + 1;
      }
      j++;
    }
    return getAdaptiveSupport(paramInt1, paramInt2, Arrays.copyOf(arrayOfInt, k));
  }
  
  public int getAdaptiveSupport(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = 0;
    int j = 16;
    Object localObject = null;
    boolean bool1 = false;
    for (boolean bool2 = bool1; i < paramArrayOfInt.length; bool2++)
    {
      int k = paramArrayOfInt[i];
      String str = rendererTrackGroups[paramInt1].get(paramInt2).getFormat(k).sampleMimeType;
      if (!bool2) {
        localObject = str;
      } else {
        bool1 |= Util.areEqual(localObject, str) ^ true;
      }
      j = Math.min(j, rendererFormatSupports[paramInt1][paramInt2][i] & 0x18);
      i++;
    }
    paramInt2 = j;
    if (bool1) {
      paramInt2 = Math.min(j, rendererMixedMimeTypeAdaptiveSupports[paramInt1]);
    }
    return paramInt2;
  }
  
  public int getRendererCount()
  {
    return rendererCount;
  }
  
  public int getRendererSupport(int paramInt)
  {
    int[][] arrayOfInt = rendererFormatSupports[paramInt];
    paramInt = 0;
    int i = paramInt;
    while (paramInt < arrayOfInt.length)
    {
      for (int j = 0;; j++)
      {
        int[] arrayOfInt1 = arrayOfInt[paramInt];
        if (j >= arrayOfInt1.length) {
          break;
        }
        int k = arrayOfInt1[j] & 0x7;
        if (k != 3)
        {
          if (k != 4) {
            k = 1;
          } else {
            return 3;
          }
        }
        else {
          k = 2;
        }
        i = Math.max(i, k);
      }
      paramInt++;
    }
    return i;
  }
  
  public int getRendererType(int paramInt)
  {
    return rendererTrackTypes[paramInt];
  }
  
  @Deprecated
  public int getTrackFormatSupport(int paramInt1, int paramInt2, int paramInt3)
  {
    return getTrackSupport(paramInt1, paramInt2, paramInt3);
  }
  
  public TrackGroupArray getTrackGroups(int paramInt)
  {
    return rendererTrackGroups[paramInt];
  }
  
  public int getTrackSupport(int paramInt1, int paramInt2, int paramInt3)
  {
    return rendererFormatSupports[paramInt1][paramInt2][paramInt3] & 0x7;
  }
  
  @Deprecated
  public int getTrackTypeRendererSupport(int paramInt)
  {
    return getTypeSupport(paramInt);
  }
  
  public int getTypeSupport(int paramInt)
  {
    int i = 0;
    int k;
    for (int j = 0; i < rendererCount; j = k)
    {
      k = j;
      if (rendererTrackTypes[i] == paramInt) {
        k = Math.max(j, getRendererSupport(i));
      }
      i++;
    }
    return j;
  }
  
  @Deprecated
  public TrackGroupArray getUnassociatedTrackGroups()
  {
    return getUnmappedTrackGroups();
  }
  
  public TrackGroupArray getUnmappedTrackGroups()
  {
    return unmappedTrackGroups;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */