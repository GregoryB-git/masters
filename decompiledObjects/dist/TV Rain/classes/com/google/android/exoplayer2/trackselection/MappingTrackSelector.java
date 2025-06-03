package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public abstract class MappingTrackSelector
  extends TrackSelector
{
  @Nullable
  private MappedTrackInfo currentMappedTrackInfo;
  
  private static int findRenderer(RendererCapabilities[] paramArrayOfRendererCapabilities, TrackGroup paramTrackGroup)
    throws ExoPlaybackException
  {
    int i = paramArrayOfRendererCapabilities.length;
    int j = 0;
    int k = j;
    while (j < paramArrayOfRendererCapabilities.length)
    {
      RendererCapabilities localRendererCapabilities = paramArrayOfRendererCapabilities[j];
      int m = 0;
      while (m < length)
      {
        int n = localRendererCapabilities.supportsFormat(paramTrackGroup.getFormat(m)) & 0x7;
        int i1 = k;
        if (n > k)
        {
          if (n == 4) {
            return j;
          }
          i = j;
          i1 = n;
        }
        m++;
        k = i1;
      }
      j++;
    }
    return i;
  }
  
  private static int[] getFormatSupport(RendererCapabilities paramRendererCapabilities, TrackGroup paramTrackGroup)
    throws ExoPlaybackException
  {
    int[] arrayOfInt = new int[length];
    for (int i = 0; i < length; i++) {
      arrayOfInt[i] = paramRendererCapabilities.supportsFormat(paramTrackGroup.getFormat(i));
    }
    return arrayOfInt;
  }
  
  private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] paramArrayOfRendererCapabilities)
    throws ExoPlaybackException
  {
    int i = paramArrayOfRendererCapabilities.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = paramArrayOfRendererCapabilities[j].supportsMixedMimeTypeAdaptation();
    }
    return arrayOfInt;
  }
  
  @Nullable
  public final MappedTrackInfo getCurrentMappedTrackInfo()
  {
    return currentMappedTrackInfo;
  }
  
  public final void onSelectionActivated(Object paramObject)
  {
    currentMappedTrackInfo = ((MappedTrackInfo)paramObject);
  }
  
  public abstract Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappedTrackInfo paramMappedTrackInfo, int[][][] paramArrayOfInt, int[] paramArrayOfInt1)
    throws ExoPlaybackException;
  
  public final TrackSelectorResult selectTracks(RendererCapabilities[] paramArrayOfRendererCapabilities, TrackGroupArray paramTrackGroupArray)
    throws ExoPlaybackException
  {
    int[] arrayOfInt1 = new int[paramArrayOfRendererCapabilities.length + 1];
    int i = paramArrayOfRendererCapabilities.length + 1;
    TrackGroup[][] arrayOfTrackGroup = new TrackGroup[i][];
    int[][][] arrayOfInt = new int[paramArrayOfRendererCapabilities.length + 1][][];
    int j = 0;
    int m;
    for (int k = 0; k < i; k++)
    {
      m = length;
      arrayOfTrackGroup[k] = new TrackGroup[m];
      arrayOfInt[k] = new int[m][];
    }
    int[] arrayOfInt2 = getMixedMimeTypeAdaptationSupports(paramArrayOfRendererCapabilities);
    for (k = 0; k < length; k++)
    {
      TrackGroup localTrackGroup = paramTrackGroupArray.get(k);
      i = findRenderer(paramArrayOfRendererCapabilities, localTrackGroup);
      if (i == paramArrayOfRendererCapabilities.length) {
        localObject = new int[length];
      } else {
        localObject = getFormatSupport(paramArrayOfRendererCapabilities[i], localTrackGroup);
      }
      m = arrayOfInt1[i];
      arrayOfTrackGroup[i][m] = localTrackGroup;
      arrayOfInt[i][m] = localObject;
      arrayOfInt1[i] = (m + 1);
    }
    Object localObject = new TrackGroupArray[paramArrayOfRendererCapabilities.length];
    paramTrackGroupArray = new int[paramArrayOfRendererCapabilities.length];
    for (k = j; k < paramArrayOfRendererCapabilities.length; k++)
    {
      j = arrayOfInt1[k];
      localObject[k] = new TrackGroupArray((TrackGroup[])Util.nullSafeArrayCopy(arrayOfTrackGroup[k], j));
      arrayOfInt[k] = ((int[][])Util.nullSafeArrayCopy(arrayOfInt[k], j));
      paramTrackGroupArray[k] = paramArrayOfRendererCapabilities[k].getTrackType();
    }
    k = arrayOfInt1[paramArrayOfRendererCapabilities.length];
    paramArrayOfRendererCapabilities = new MappedTrackInfo(paramTrackGroupArray, (TrackGroupArray[])localObject, arrayOfInt2, arrayOfInt, new TrackGroupArray((TrackGroup[])Util.nullSafeArrayCopy(arrayOfTrackGroup[paramArrayOfRendererCapabilities.length], k)));
    paramTrackGroupArray = selectTracks(paramArrayOfRendererCapabilities, arrayOfInt, arrayOfInt2);
    return new TrackSelectorResult((RendererConfiguration[])first, (TrackSelection[])second, paramArrayOfRendererCapabilities);
  }
  
  public static final class MappedTrackInfo
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
    
    public MappedTrackInfo(int[] paramArrayOfInt1, TrackGroupArray[] paramArrayOfTrackGroupArray, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, TrackGroupArray paramTrackGroupArray)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.MappingTrackSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */