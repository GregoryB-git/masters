package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultTrackSelector
  extends MappingTrackSelector
{
  private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98F;
  private static final int[] NO_TRACKS = new int[0];
  private static final int WITHIN_RENDERER_CAPABILITIES_BONUS = 1000;
  private final TrackSelection.Factory adaptiveTrackSelectionFactory;
  private final AtomicReference<Parameters> parametersReference;
  
  public DefaultTrackSelector()
  {
    this(new AdaptiveTrackSelection.Factory());
  }
  
  public DefaultTrackSelector(TrackSelection.Factory paramFactory)
  {
    adaptiveTrackSelectionFactory = paramFactory;
    parametersReference = new AtomicReference(Parameters.DEFAULT);
  }
  
  @Deprecated
  public DefaultTrackSelector(BandwidthMeter paramBandwidthMeter)
  {
    this(new AdaptiveTrackSelection.Factory(paramBandwidthMeter));
  }
  
  private static int compareFormatValues(int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramInt1 == -1)
    {
      paramInt1 = i;
      if (paramInt2 == -1) {
        paramInt1 = 0;
      }
    }
    else if (paramInt2 == -1)
    {
      paramInt1 = 1;
    }
    else
    {
      paramInt1 -= paramInt2;
    }
    return paramInt1;
  }
  
  private static int compareInts(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      paramInt1 = 1;
    } else if (paramInt2 > paramInt1) {
      paramInt1 = -1;
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
  
  private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup paramTrackGroup, int[] paramArrayOfInt, int paramInt1, @Nullable String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<Integer> paramList)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      int j = ((Integer)paramList.get(i)).intValue();
      if (!isSupportedAdaptiveVideoTrack(paramTrackGroup.getFormat(j), paramString, paramArrayOfInt[j], paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
        paramList.remove(i);
      }
    }
  }
  
  public static boolean formatHasLanguage(Format paramFormat, @Nullable String paramString)
  {
    boolean bool;
    if ((paramString != null) && (TextUtils.equals(paramString, Util.normalizeLanguageCode(language)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean formatHasNoLanguage(Format paramFormat)
  {
    boolean bool;
    if ((!TextUtils.isEmpty(language)) && (!formatHasLanguage(paramFormat, "und"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static int getAdaptiveAudioTrackCount(TrackGroup paramTrackGroup, int[] paramArrayOfInt, AudioConfigurationTuple paramAudioConfigurationTuple)
  {
    int i = 0;
    int k;
    for (int j = 0; i < length; j = k)
    {
      k = j;
      if (isSupportedAdaptiveAudioTrack(paramTrackGroup.getFormat(i), paramArrayOfInt[i], paramAudioConfigurationTuple)) {
        k = j + 1;
      }
      i++;
    }
    return j;
  }
  
  private static int[] getAdaptiveAudioTracks(TrackGroup paramTrackGroup, int[] paramArrayOfInt, boolean paramBoolean)
  {
    HashSet localHashSet = new HashSet();
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    int k = j;
    Object localObject2;
    int n;
    while (j < length)
    {
      localObject2 = paramTrackGroup.getFormat(j);
      int m = channelCount;
      n = sampleRate;
      if (paramBoolean) {
        localObject2 = null;
      } else {
        localObject2 = sampleMimeType;
      }
      AudioConfigurationTuple localAudioConfigurationTuple = new AudioConfigurationTuple(m, n, (String)localObject2);
      n = k;
      localObject2 = localObject1;
      if (localHashSet.add(localAudioConfigurationTuple))
      {
        m = getAdaptiveAudioTrackCount(paramTrackGroup, paramArrayOfInt, localAudioConfigurationTuple);
        n = k;
        localObject2 = localObject1;
        if (m > k)
        {
          n = m;
          localObject2 = localAudioConfigurationTuple;
        }
      }
      j++;
      k = n;
      localObject1 = localObject2;
    }
    if (k > 1)
    {
      localObject2 = new int[k];
      k = 0;
      j = i;
      while (j < length)
      {
        n = k;
        if (isSupportedAdaptiveAudioTrack(paramTrackGroup.getFormat(j), paramArrayOfInt[j], (AudioConfigurationTuple)Assertions.checkNotNull(localObject1)))
        {
          localObject2[k] = j;
          n = k + 1;
        }
        j++;
        k = n;
      }
      return (int[])localObject2;
    }
    return NO_TRACKS;
  }
  
  private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup paramTrackGroup, int[] paramArrayOfInt, int paramInt1, @Nullable String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<Integer> paramList)
  {
    int i = 0;
    int m;
    for (int j = 0; i < paramList.size(); j = m)
    {
      int k = ((Integer)paramList.get(i)).intValue();
      m = j;
      if (isSupportedAdaptiveVideoTrack(paramTrackGroup.getFormat(k), paramString, paramArrayOfInt[k], paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
        m = j + 1;
      }
      i++;
    }
    return j;
  }
  
  private static int[] getAdaptiveVideoTracksForGroup(TrackGroup paramTrackGroup, int[] paramArrayOfInt, boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2)
  {
    if (length < 2) {
      return NO_TRACKS;
    }
    List localList = getViewportFilteredTrackIndices(paramTrackGroup, paramInt6, paramInt7, paramBoolean2);
    if (localList.size() < 2) {
      return NO_TRACKS;
    }
    Object localObject1;
    if (!paramBoolean1)
    {
      HashSet localHashSet = new HashSet();
      localObject1 = null;
      paramInt7 = 0;
      int i;
      for (paramInt6 = paramInt7; paramInt7 < localList.size(); paramInt6 = i)
      {
        String str = getFormatgetintValuesampleMimeType;
        Object localObject2 = localObject1;
        i = paramInt6;
        if (localHashSet.add(str))
        {
          int j = getAdaptiveVideoTrackCountForMimeType(paramTrackGroup, paramArrayOfInt, paramInt1, str, paramInt2, paramInt3, paramInt4, paramInt5, localList);
          localObject2 = localObject1;
          i = paramInt6;
          if (j > paramInt6)
          {
            i = j;
            localObject2 = str;
          }
        }
        paramInt7++;
        localObject1 = localObject2;
      }
    }
    else
    {
      localObject1 = null;
    }
    filterAdaptiveVideoTrackCountForMimeType(paramTrackGroup, paramArrayOfInt, paramInt1, (String)localObject1, paramInt2, paramInt3, paramInt4, paramInt5, localList);
    if (localList.size() < 2) {
      paramTrackGroup = NO_TRACKS;
    } else {
      paramTrackGroup = Util.toArray(localList);
    }
    return paramTrackGroup;
  }
  
  private static Point getMaxVideoSizeInViewport(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean)
    {
      i = 1;
      if (paramInt3 > paramInt4) {
        j = 1;
      } else {
        j = 0;
      }
      if (paramInt1 <= paramInt2) {
        i = 0;
      }
      if (j != i) {}
    }
    else
    {
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = j;
    }
    int i = paramInt3 * paramInt1;
    int j = paramInt4 * paramInt2;
    if (i >= j) {
      return new Point(paramInt2, Util.ceilDivide(j, paramInt3));
    }
    return new Point(Util.ceilDivide(i, paramInt4), paramInt1);
  }
  
  private static List<Integer> getViewportFilteredTrackIndices(TrackGroup paramTrackGroup, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(length);
    int i = 0;
    for (int j = 0; j < length; j++) {
      localArrayList.add(Integer.valueOf(j));
    }
    if ((paramInt1 != Integer.MAX_VALUE) && (paramInt2 != Integer.MAX_VALUE))
    {
      int m;
      for (j = Integer.MAX_VALUE; i < length; j = m)
      {
        Format localFormat = paramTrackGroup.getFormat(i);
        int k = width;
        m = j;
        if (k > 0)
        {
          int n = height;
          m = j;
          if (n > 0)
          {
            Point localPoint = getMaxVideoSizeInViewport(paramBoolean, paramInt1, paramInt2, k, n);
            int i1 = width;
            k = height;
            n = i1 * k;
            m = j;
            if (i1 >= (int)(x * 0.98F))
            {
              m = j;
              if (k >= (int)(y * 0.98F))
              {
                m = j;
                if (n < j) {
                  m = n;
                }
              }
            }
          }
        }
        i++;
      }
      if (j != Integer.MAX_VALUE) {
        for (paramInt1 = localArrayList.size() - 1; paramInt1 >= 0; paramInt1--)
        {
          paramInt2 = paramTrackGroup.getFormat(((Integer)localArrayList.get(paramInt1)).intValue()).getPixelCount();
          if ((paramInt2 == -1) || (paramInt2 > j)) {
            localArrayList.remove(paramInt1);
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean isSupported(int paramInt, boolean paramBoolean)
  {
    paramInt &= 0x7;
    if ((paramInt != 4) && ((!paramBoolean) || (paramInt != 3))) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  private static boolean isSupportedAdaptiveAudioTrack(Format paramFormat, int paramInt, AudioConfigurationTuple paramAudioConfigurationTuple)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (isSupported(paramInt, false))
    {
      bool2 = bool1;
      if (channelCount == channelCount)
      {
        bool2 = bool1;
        if (sampleRate == sampleRate)
        {
          paramAudioConfigurationTuple = mimeType;
          if (paramAudioConfigurationTuple != null)
          {
            bool2 = bool1;
            if (!TextUtils.equals(paramAudioConfigurationTuple, sampleMimeType)) {}
          }
          else
          {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  private static boolean isSupportedAdaptiveVideoTrack(Format paramFormat, @Nullable String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (isSupported(paramInt1, false))
    {
      bool2 = bool1;
      if ((paramInt1 & paramInt2) != 0) {
        if (paramString != null)
        {
          bool2 = bool1;
          if (!Util.areEqual(sampleMimeType, paramString)) {}
        }
        else
        {
          paramInt1 = width;
          if (paramInt1 != -1)
          {
            bool2 = bool1;
            if (paramInt1 > paramInt3) {}
          }
          else
          {
            paramInt1 = height;
            if (paramInt1 != -1)
            {
              bool2 = bool1;
              if (paramInt1 > paramInt4) {}
            }
            else
            {
              float f = frameRate;
              if (f != -1.0F)
              {
                bool2 = bool1;
                if (f > paramInt5) {}
              }
              else
              {
                paramInt1 = bitrate;
                if (paramInt1 != -1)
                {
                  bool2 = bool1;
                  if (paramInt1 > paramInt6) {}
                }
                else
                {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo paramMappedTrackInfo, int[][][] paramArrayOfInt, RendererConfiguration[] paramArrayOfRendererConfiguration, TrackSelection[] paramArrayOfTrackSelection, int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    int i = 0;
    int j = 0;
    int k = -1;
    for (int m = k; j < paramMappedTrackInfo.getRendererCount(); m = i2)
    {
      int n = paramMappedTrackInfo.getRendererType(j);
      TrackSelection localTrackSelection = paramArrayOfTrackSelection[j];
      int i1;
      if (n != 1)
      {
        i1 = k;
        i2 = m;
        if (n != 2) {}
      }
      else
      {
        i1 = k;
        i2 = m;
        if (localTrackSelection != null)
        {
          i1 = k;
          i2 = m;
          if (rendererSupportsTunneling(paramArrayOfInt[j], paramMappedTrackInfo.getTrackGroups(j), localTrackSelection))
          {
            if (n == 1)
            {
              if (m == -1)
              {
                i2 = j;
                i1 = k;
                break label147;
              }
            }
            else {
              if (k == -1) {
                break label139;
              }
            }
            j = 0;
            break label164;
            label139:
            i1 = j;
            i2 = m;
          }
        }
      }
      label147:
      j++;
      k = i1;
    }
    j = 1;
    label164:
    int i2 = i;
    if (m != -1)
    {
      i2 = i;
      if (k != -1) {
        i2 = 1;
      }
    }
    if ((j & i2) != 0)
    {
      paramMappedTrackInfo = new RendererConfiguration(paramInt);
      paramArrayOfRendererConfiguration[m] = paramMappedTrackInfo;
      paramArrayOfRendererConfiguration[k] = paramMappedTrackInfo;
    }
  }
  
  private static boolean rendererSupportsTunneling(int[][] paramArrayOfInt, TrackGroupArray paramTrackGroupArray, TrackSelection paramTrackSelection)
  {
    if (paramTrackSelection == null) {
      return false;
    }
    int i = paramTrackGroupArray.indexOf(paramTrackSelection.getTrackGroup());
    for (int j = 0; j < paramTrackSelection.length(); j++) {
      if ((paramArrayOfInt[i][paramTrackSelection.getIndexInTrackGroup(j)] & 0x20) != 32) {
        return false;
      }
    }
    return true;
  }
  
  @Nullable
  private static TrackSelection selectAdaptiveVideoTrack(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, int paramInt, Parameters paramParameters, TrackSelection.Factory paramFactory, BandwidthMeter paramBandwidthMeter)
    throws ExoPlaybackException
  {
    int i;
    if (allowNonSeamlessAdaptiveness) {
      i = 24;
    } else {
      i = 16;
    }
    boolean bool;
    if ((allowMixedMimeAdaptiveness) && ((paramInt & i) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    for (paramInt = 0;; paramInt++)
    {
      Object localObject = paramTrackGroupArray;
      if (paramInt >= length) {
        break;
      }
      TrackGroup localTrackGroup = ((TrackGroupArray)localObject).get(paramInt);
      localObject = getAdaptiveVideoTracksForGroup(localTrackGroup, paramArrayOfInt[paramInt], bool, i, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, viewportWidth, viewportHeight, viewportOrientationMayChange);
      if (localObject.length > 0) {
        return ((TrackSelection.Factory)Assertions.checkNotNull(paramFactory)).createTrackSelection(localTrackGroup, paramBandwidthMeter, (int[])localObject);
      }
    }
    return null;
  }
  
  @Nullable
  private static TrackSelection selectFixedVideoTrack(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, Parameters paramParameters)
  {
    int i = -1;
    int j = i;
    int k = 0;
    Object localObject1 = null;
    int m = 0;
    int n = 0;
    for (;;)
    {
      Object localObject2 = paramTrackGroupArray;
      if (k >= length) {
        break;
      }
      TrackGroup localTrackGroup = ((TrackGroupArray)localObject2).get(k);
      List localList = getViewportFilteredTrackIndices(localTrackGroup, viewportWidth, viewportHeight, viewportOrientationMayChange);
      int[] arrayOfInt = paramArrayOfInt[k];
      int i1 = 0;
      while (i1 < length)
      {
        localObject2 = localObject1;
        int i2 = m;
        int i3 = n;
        int i4 = i;
        int i5 = j;
        if (isSupported(arrayOfInt[i1], exceedRendererCapabilitiesIfNecessary))
        {
          Format localFormat = localTrackGroup.getFormat(i1);
          boolean bool = localList.contains(Integer.valueOf(i1));
          i3 = 1;
          int i6;
          if (bool)
          {
            i6 = width;
            if ((i6 == -1) || (i6 <= maxVideoWidth))
            {
              i6 = height;
              if ((i6 == -1) || (i6 <= maxVideoHeight))
              {
                float f = frameRate;
                if ((f == -1.0F) || (f <= maxVideoFrameRate))
                {
                  i6 = bitrate;
                  if ((i6 == -1) || (i6 <= maxVideoBitrate))
                  {
                    i4 = 1;
                    break label243;
                  }
                }
              }
            }
          }
          i4 = 0;
          label243:
          if ((i4 == 0) && (!exceedVideoConstraintsIfNecessary))
          {
            localObject2 = localObject1;
            i2 = m;
            i3 = n;
            i4 = i;
            i5 = j;
          }
          else
          {
            if (i4 != 0) {
              i5 = 2;
            } else {
              i5 = 1;
            }
            bool = isSupported(arrayOfInt[i1], false);
            i6 = i5;
            if (bool) {
              i6 = i5 + 1000;
            }
            if (i6 > n) {
              i5 = 1;
            } else {
              i5 = 0;
            }
            int i7 = i5;
            if (i6 == n)
            {
              if (forceLowestBitrate) {
                if (compareFormatValues(bitrate, j) < 0) {
                  i5 = i3;
                } else {
                  i5 = 0;
                }
              }
              for (;;)
              {
                i7 = i5;
                break label453;
                i5 = localFormat.getPixelCount();
                if (i5 != i) {
                  i5 = compareFormatValues(i5, i);
                } else {
                  i5 = compareFormatValues(bitrate, j);
                }
                if ((bool) && (i4 != 0))
                {
                  if (i5 <= 0) {
                    break;
                  }
                  i5 = i3;
                  continue;
                }
                if (i5 >= 0) {
                  break;
                }
                i5 = i3;
              }
            }
            label453:
            localObject2 = localObject1;
            i2 = m;
            i3 = n;
            i4 = i;
            i5 = j;
            if (i7 != 0)
            {
              i5 = bitrate;
              i4 = localFormat.getPixelCount();
              localObject2 = localTrackGroup;
              i2 = i1;
              i3 = i6;
            }
          }
        }
        i1++;
        localObject1 = localObject2;
        m = i2;
        n = i3;
        i = i4;
        j = i5;
      }
      k++;
    }
    if (localObject1 == null) {
      paramTrackGroupArray = null;
    } else {
      paramTrackGroupArray = new FixedTrackSelection((TrackGroup)localObject1, m);
    }
    return paramTrackGroupArray;
  }
  
  public ParametersBuilder buildUponParameters()
  {
    return getParameters().buildUpon();
  }
  
  @Deprecated
  public final void clearSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
  {
    setParameters(buildUponParameters().clearSelectionOverride(paramInt, paramTrackGroupArray));
  }
  
  @Deprecated
  public final void clearSelectionOverrides()
  {
    setParameters(buildUponParameters().clearSelectionOverrides());
  }
  
  @Deprecated
  public final void clearSelectionOverrides(int paramInt)
  {
    setParameters(buildUponParameters().clearSelectionOverrides(paramInt));
  }
  
  public Parameters getParameters()
  {
    return (Parameters)parametersReference.get();
  }
  
  @Deprecated
  public final boolean getRendererDisabled(int paramInt)
  {
    return getParameters().getRendererDisabled(paramInt);
  }
  
  @Deprecated
  @Nullable
  public final SelectionOverride getSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
  {
    return getParameters().getSelectionOverride(paramInt, paramTrackGroupArray);
  }
  
  @Deprecated
  public final boolean hasSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
  {
    return getParameters().hasSelectionOverride(paramInt, paramTrackGroupArray);
  }
  
  public TrackSelection[] selectAllTracks(MappingTrackSelector.MappedTrackInfo paramMappedTrackInfo, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, Parameters paramParameters)
    throws ExoPlaybackException
  {
    int i = paramMappedTrackInfo.getRendererCount();
    TrackSelection[] arrayOfTrackSelection = new TrackSelection[i];
    int j = 0;
    int k = j;
    int m = k;
    int n = k;
    int i1;
    for (;;)
    {
      i1 = 1;
      if (n >= i) {
        break;
      }
      k = j;
      i2 = m;
      if (2 == paramMappedTrackInfo.getRendererType(n))
      {
        k = j;
        if (j == 0)
        {
          localObject1 = selectVideoTrack(paramMappedTrackInfo.getTrackGroups(n), paramArrayOfInt[n], paramArrayOfInt1[n], paramParameters, adaptiveTrackSelectionFactory);
          arrayOfTrackSelection[n] = localObject1;
          if (localObject1 != null) {
            k = 1;
          } else {
            k = 0;
          }
        }
        if (getTrackGroupslength > 0) {
          j = i1;
        } else {
          j = 0;
        }
        i2 = m | j;
      }
      n++;
      j = k;
      m = i2;
    }
    k = 0;
    j = -1;
    n = j;
    Object localObject1 = null;
    int i2 = Integer.MIN_VALUE;
    while (k < i)
    {
      i1 = paramMappedTrackInfo.getRendererType(k);
      Object localObject2;
      if (i1 != 1)
      {
        if (i1 != 2) {
          if (i1 != 3)
          {
            arrayOfTrackSelection[k] = selectOtherTrack(i1, paramMappedTrackInfo.getTrackGroups(k), paramArrayOfInt[k], paramParameters);
          }
          else
          {
            localObject2 = selectTextTrack(paramMappedTrackInfo.getTrackGroups(k), paramArrayOfInt[k], paramParameters);
            if ((localObject2 != null) && (((Integer)second).intValue() > i2))
            {
              if (n != -1) {
                arrayOfTrackSelection[n] = null;
              }
              arrayOfTrackSelection[k] = ((TrackSelection)first);
              i2 = ((Integer)second).intValue();
              n = k;
              break label452;
            }
          }
        }
      }
      else
      {
        TrackGroupArray localTrackGroupArray = paramMappedTrackInfo.getTrackGroups(k);
        int[][] arrayOfInt = paramArrayOfInt[k];
        int i3 = paramArrayOfInt1[k];
        if (m != 0) {
          localObject2 = null;
        } else {
          localObject2 = adaptiveTrackSelectionFactory;
        }
        int i4 = j;
        Object localObject3 = localObject1;
        i1 = k;
        localObject2 = selectAudioTrack(localTrackGroupArray, arrayOfInt, i3, paramParameters, (TrackSelection.Factory)localObject2);
        if ((localObject2 != null) && ((localObject3 == null) || (((AudioTrackScore)second).compareTo((AudioTrackScore)localObject3) > 0)))
        {
          if (i4 != -1) {
            arrayOfTrackSelection[i4] = null;
          }
          arrayOfTrackSelection[i1] = ((TrackSelection)first);
          localObject1 = (AudioTrackScore)second;
          j = i1;
        }
      }
      label452:
      k++;
    }
    return arrayOfTrackSelection;
  }
  
  @Nullable
  public Pair<TrackSelection, AudioTrackScore> selectAudioTrack(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, int paramInt, Parameters paramParameters, @Nullable TrackSelection.Factory paramFactory)
    throws ExoPlaybackException
  {
    Object localObject1 = null;
    paramInt = 0;
    Object localObject2 = null;
    int i = -1;
    int j = i;
    while (paramInt < length)
    {
      TrackGroup localTrackGroup = paramTrackGroupArray.get(paramInt);
      int[] arrayOfInt = paramArrayOfInt[paramInt];
      int k = 0;
      localObject3 = localObject2;
      while (k < length)
      {
        int m = i;
        localObject2 = localObject3;
        int n = j;
        if (isSupported(arrayOfInt[k], exceedRendererCapabilitiesIfNecessary))
        {
          AudioTrackScore localAudioTrackScore = new AudioTrackScore(localTrackGroup.getFormat(k), paramParameters, arrayOfInt[k]);
          if (localObject3 != null)
          {
            m = i;
            localObject2 = localObject3;
            n = j;
            if (localAudioTrackScore.compareTo((AudioTrackScore)localObject3) <= 0) {}
          }
          else
          {
            m = paramInt;
            n = k;
            localObject2 = localAudioTrackScore;
          }
        }
        k++;
        i = m;
        localObject3 = localObject2;
        j = n;
      }
      paramInt++;
      localObject2 = localObject3;
    }
    if (i == -1) {
      return null;
    }
    Object localObject3 = paramTrackGroupArray.get(i);
    paramTrackGroupArray = (TrackGroupArray)localObject1;
    if (!forceHighestSupportedBitrate)
    {
      paramTrackGroupArray = (TrackGroupArray)localObject1;
      if (!forceLowestBitrate)
      {
        paramTrackGroupArray = (TrackGroupArray)localObject1;
        if (paramFactory != null)
        {
          paramArrayOfInt = getAdaptiveAudioTracks((TrackGroup)localObject3, paramArrayOfInt[i], allowMixedMimeAdaptiveness);
          paramTrackGroupArray = (TrackGroupArray)localObject1;
          if (paramArrayOfInt.length > 0) {
            paramTrackGroupArray = paramFactory.createTrackSelection((TrackGroup)localObject3, getBandwidthMeter(), paramArrayOfInt);
          }
        }
      }
    }
    paramArrayOfInt = paramTrackGroupArray;
    if (paramTrackGroupArray == null) {
      paramArrayOfInt = new FixedTrackSelection((TrackGroup)localObject3, j);
    }
    return Pair.create(paramArrayOfInt, Assertions.checkNotNull(localObject2));
  }
  
  @Nullable
  public TrackSelection selectOtherTrack(int paramInt, TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, Parameters paramParameters)
    throws ExoPlaybackException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    paramInt = i;
    int j = paramInt;
    int k = paramInt;
    while (i < length)
    {
      TrackGroup localTrackGroup = paramTrackGroupArray.get(i);
      int[] arrayOfInt = paramArrayOfInt[i];
      paramInt = 0;
      while (paramInt < length)
      {
        Object localObject3 = localObject2;
        int m = k;
        int n = j;
        if (isSupported(arrayOfInt[paramInt], exceedRendererCapabilitiesIfNecessary))
        {
          int i1 = getFormatselectionFlags;
          n = 1;
          if ((i1 & 0x1) != 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (i1 != 0) {
            n = 2;
          }
          i1 = n;
          if (isSupported(arrayOfInt[paramInt], false)) {
            i1 = n + 1000;
          }
          localObject3 = localObject2;
          m = k;
          n = j;
          if (i1 > j)
          {
            localObject3 = localTrackGroup;
            m = paramInt;
            n = i1;
          }
        }
        paramInt++;
        localObject2 = localObject3;
        k = m;
        j = n;
      }
      i++;
    }
    if (localObject2 == null) {
      paramTrackGroupArray = (TrackGroupArray)localObject1;
    } else {
      paramTrackGroupArray = new FixedTrackSelection((TrackGroup)localObject2, k);
    }
    return paramTrackGroupArray;
  }
  
  @Nullable
  public Pair<TrackSelection, Integer> selectTextTrack(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, Parameters paramParameters)
    throws ExoPlaybackException
  {
    int i = 0;
    int j = i;
    int k = j;
    Object localObject1 = null;
    while (i < length)
    {
      TrackGroup localTrackGroup = paramTrackGroupArray.get(i);
      int[] arrayOfInt = paramArrayOfInt[i];
      int m = 0;
      int n = j;
      while (m < length)
      {
        Object localObject2 = localObject1;
        int i1 = n;
        j = k;
        int i2;
        if (isSupported(arrayOfInt[m], exceedRendererCapabilitiesIfNecessary))
        {
          Format localFormat = localTrackGroup.getFormat(m);
          int i3 = selectionFlags & disabledTextTrackSelectionFlags;
          int i4 = 1;
          if ((i3 & 0x1) != 0) {
            j = 1;
          } else {
            j = 0;
          }
          if ((i3 & 0x2) != 0) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          i2 = formatHasLanguage(localFormat, preferredTextLanguage);
          if ((i2 == 0) && ((!selectUndeterminedTextLanguage) || (!formatHasNoLanguage(localFormat))))
          {
            if (j != 0)
            {
              j = 3;
            }
            else
            {
              localObject2 = localObject1;
              i2 = n;
              j = k;
              if (i3 == 0) {
                break label310;
              }
              j = i4;
              if (formatHasLanguage(localFormat, preferredAudioLanguage)) {
                j = 2;
              }
            }
          }
          else
          {
            if (j != 0) {
              j = 8;
            } else if (i3 == 0) {
              j = 6;
            } else {
              j = 4;
            }
            j += i2;
          }
          i3 = j;
          if (isSupported(arrayOfInt[m], false)) {
            i3 = j + 1000;
          }
          localObject2 = localObject1;
          i2 = n;
          j = k;
          if (i3 > k)
          {
            localObject2 = localTrackGroup;
            i2 = m;
            j = i3;
          }
        }
        label310:
        m++;
        localObject1 = localObject2;
        n = i2;
        k = j;
      }
      i++;
      j = n;
    }
    if (localObject1 == null) {
      paramTrackGroupArray = null;
    } else {
      paramTrackGroupArray = Pair.create(new FixedTrackSelection((TrackGroup)localObject1, j), Integer.valueOf(k));
    }
    return paramTrackGroupArray;
  }
  
  public final Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo paramMappedTrackInfo, int[][][] paramArrayOfInt, int[] paramArrayOfInt1)
    throws ExoPlaybackException
  {
    Parameters localParameters = (Parameters)parametersReference.get();
    int i = paramMappedTrackInfo.getRendererCount();
    TrackSelection[] arrayOfTrackSelection = selectAllTracks(paramMappedTrackInfo, paramArrayOfInt, paramArrayOfInt1, localParameters);
    for (int j = 0; j < i; j++) {
      if (localParameters.getRendererDisabled(j))
      {
        arrayOfTrackSelection[j] = null;
      }
      else
      {
        localObject = paramMappedTrackInfo.getTrackGroups(j);
        if (localParameters.hasSelectionOverride(j, (TrackGroupArray)localObject))
        {
          paramArrayOfInt1 = localParameters.getSelectionOverride(j, (TrackGroupArray)localObject);
          if (paramArrayOfInt1 == null) {
            arrayOfTrackSelection[j] = null;
          } else if (length == 1) {
            arrayOfTrackSelection[j] = new FixedTrackSelection(((TrackGroupArray)localObject).get(groupIndex), tracks[0]);
          } else {
            arrayOfTrackSelection[j] = ((TrackSelection.Factory)Assertions.checkNotNull(adaptiveTrackSelectionFactory)).createTrackSelection(((TrackGroupArray)localObject).get(groupIndex), getBandwidthMeter(), tracks);
          }
        }
      }
    }
    Object localObject = new RendererConfiguration[i];
    for (j = 0; j < i; j++)
    {
      int k;
      if ((!localParameters.getRendererDisabled(j)) && ((paramMappedTrackInfo.getRendererType(j) == 6) || (arrayOfTrackSelection[j] != null))) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        paramArrayOfInt1 = RendererConfiguration.DEFAULT;
      } else {
        paramArrayOfInt1 = null;
      }
      localObject[j] = paramArrayOfInt1;
    }
    maybeConfigureRenderersForTunneling(paramMappedTrackInfo, paramArrayOfInt, (RendererConfiguration[])localObject, arrayOfTrackSelection, tunnelingAudioSessionId);
    return Pair.create(localObject, arrayOfTrackSelection);
  }
  
  @Nullable
  public TrackSelection selectVideoTrack(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfInt, int paramInt, Parameters paramParameters, @Nullable TrackSelection.Factory paramFactory)
    throws ExoPlaybackException
  {
    if ((!forceHighestSupportedBitrate) && (!forceLowestBitrate) && (paramFactory != null)) {
      paramFactory = selectAdaptiveVideoTrack(paramTrackGroupArray, paramArrayOfInt, paramInt, paramParameters, paramFactory, getBandwidthMeter());
    } else {
      paramFactory = null;
    }
    Object localObject = paramFactory;
    if (paramFactory == null) {
      localObject = selectFixedVideoTrack(paramTrackGroupArray, paramArrayOfInt, paramParameters);
    }
    return (TrackSelection)localObject;
  }
  
  public void setParameters(Parameters paramParameters)
  {
    Assertions.checkNotNull(paramParameters);
    if (!((Parameters)parametersReference.getAndSet(paramParameters)).equals(paramParameters)) {
      invalidate();
    }
  }
  
  public void setParameters(ParametersBuilder paramParametersBuilder)
  {
    setParameters(paramParametersBuilder.build());
  }
  
  @Deprecated
  public final void setRendererDisabled(int paramInt, boolean paramBoolean)
  {
    setParameters(buildUponParameters().setRendererDisabled(paramInt, paramBoolean));
  }
  
  @Deprecated
  public final void setSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray, SelectionOverride paramSelectionOverride)
  {
    setParameters(buildUponParameters().setSelectionOverride(paramInt, paramTrackGroupArray, paramSelectionOverride));
  }
  
  @Deprecated
  public void setTunnelingAudioSessionId(int paramInt)
  {
    setParameters(buildUponParameters().setTunnelingAudioSessionId(paramInt));
  }
  
  public static final class AudioConfigurationTuple
  {
    public final int channelCount;
    @Nullable
    public final String mimeType;
    public final int sampleRate;
    
    public AudioConfigurationTuple(int paramInt1, int paramInt2, @Nullable String paramString)
    {
      channelCount = paramInt1;
      sampleRate = paramInt2;
      mimeType = paramString;
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (AudioConfigurationTuple.class == paramObject.getClass()))
      {
        paramObject = (AudioConfigurationTuple)paramObject;
        if ((channelCount != channelCount) || (sampleRate != sampleRate) || (!TextUtils.equals(mimeType, mimeType))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = channelCount;
      int j = sampleRate;
      String str = mimeType;
      int k;
      if (str != null) {
        k = str.hashCode();
      } else {
        k = 0;
      }
      return (i * 31 + j) * 31 + k;
    }
  }
  
  public static final class AudioTrackScore
    implements Comparable<AudioTrackScore>
  {
    private final int bitrate;
    private final int channelCount;
    private final int defaultSelectionFlagScore;
    private final int matchLanguageScore;
    private final DefaultTrackSelector.Parameters parameters;
    private final int sampleRate;
    private final int withinRendererCapabilitiesScore;
    
    public AudioTrackScore(Format paramFormat, DefaultTrackSelector.Parameters paramParameters, int paramInt)
    {
      parameters = paramParameters;
      int i = 0;
      withinRendererCapabilitiesScore = DefaultTrackSelector.isSupported(paramInt, false);
      matchLanguageScore = DefaultTrackSelector.formatHasLanguage(paramFormat, preferredAudioLanguage);
      paramInt = i;
      if ((selectionFlags & 0x1) != 0) {
        paramInt = 1;
      }
      defaultSelectionFlagScore = paramInt;
      channelCount = channelCount;
      sampleRate = sampleRate;
      bitrate = bitrate;
    }
    
    public int compareTo(@NonNull AudioTrackScore paramAudioTrackScore)
    {
      int i = withinRendererCapabilitiesScore;
      int j = withinRendererCapabilitiesScore;
      if (i != j) {
        return DefaultTrackSelector.access$300(i, j);
      }
      j = matchLanguageScore;
      int k = matchLanguageScore;
      if (j != k) {
        return DefaultTrackSelector.access$300(j, k);
      }
      j = defaultSelectionFlagScore;
      k = defaultSelectionFlagScore;
      if (j != k) {
        return DefaultTrackSelector.access$300(j, k);
      }
      if (parameters.forceLowestBitrate) {
        return DefaultTrackSelector.access$300(bitrate, bitrate);
      }
      j = 1;
      if (i != 1) {
        j = -1;
      }
      k = channelCount;
      i = channelCount;
      if (k != i) {
        return DefaultTrackSelector.access$300(k, i) * j;
      }
      i = sampleRate;
      k = sampleRate;
      if (i != k) {
        return DefaultTrackSelector.access$300(i, k) * j;
      }
      return DefaultTrackSelector.access$300(bitrate, bitrate) * j;
    }
  }
  
  public static final class Parameters
    implements Parcelable
  {
    public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator()
    {
      public DefaultTrackSelector.Parameters createFromParcel(Parcel paramAnonymousParcel)
      {
        return new DefaultTrackSelector.Parameters(paramAnonymousParcel);
      }
      
      public DefaultTrackSelector.Parameters[] newArray(int paramAnonymousInt)
      {
        return new DefaultTrackSelector.Parameters[paramAnonymousInt];
      }
    };
    public static final Parameters DEFAULT = new Parameters();
    public final boolean allowMixedMimeAdaptiveness;
    public final boolean allowNonSeamlessAdaptiveness;
    public final int disabledTextTrackSelectionFlags;
    public final boolean exceedRendererCapabilitiesIfNecessary;
    public final boolean exceedVideoConstraintsIfNecessary;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    @Nullable
    public final String preferredAudioLanguage;
    @Nullable
    public final String preferredTextLanguage;
    private final SparseBooleanArray rendererDisabledFlags;
    public final boolean selectUndeterminedTextLanguage;
    private final SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> selectionOverrides;
    public final int tunnelingAudioSessionId;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;
    
    private Parameters()
    {
      this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }
    
    public Parameters(Parcel paramParcel)
    {
      selectionOverrides = readSelectionOverrides(paramParcel);
      rendererDisabledFlags = paramParcel.readSparseBooleanArray();
      preferredAudioLanguage = paramParcel.readString();
      preferredTextLanguage = paramParcel.readString();
      selectUndeterminedTextLanguage = Util.readBoolean(paramParcel);
      disabledTextTrackSelectionFlags = paramParcel.readInt();
      forceLowestBitrate = Util.readBoolean(paramParcel);
      forceHighestSupportedBitrate = Util.readBoolean(paramParcel);
      allowMixedMimeAdaptiveness = Util.readBoolean(paramParcel);
      allowNonSeamlessAdaptiveness = Util.readBoolean(paramParcel);
      maxVideoWidth = paramParcel.readInt();
      maxVideoHeight = paramParcel.readInt();
      maxVideoFrameRate = paramParcel.readInt();
      maxVideoBitrate = paramParcel.readInt();
      exceedVideoConstraintsIfNecessary = Util.readBoolean(paramParcel);
      exceedRendererCapabilitiesIfNecessary = Util.readBoolean(paramParcel);
      viewportWidth = paramParcel.readInt();
      viewportHeight = paramParcel.readInt();
      viewportOrientationMayChange = Util.readBoolean(paramParcel);
      tunnelingAudioSessionId = paramParcel.readInt();
    }
    
    public Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray, SparseBooleanArray paramSparseBooleanArray, @Nullable String paramString1, @Nullable String paramString2, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean6, boolean paramBoolean7, int paramInt6, int paramInt7, boolean paramBoolean8, int paramInt8)
    {
      selectionOverrides = paramSparseArray;
      rendererDisabledFlags = paramSparseBooleanArray;
      preferredAudioLanguage = Util.normalizeLanguageCode(paramString1);
      preferredTextLanguage = Util.normalizeLanguageCode(paramString2);
      selectUndeterminedTextLanguage = paramBoolean1;
      disabledTextTrackSelectionFlags = paramInt1;
      forceLowestBitrate = paramBoolean2;
      forceHighestSupportedBitrate = paramBoolean3;
      allowMixedMimeAdaptiveness = paramBoolean4;
      allowNonSeamlessAdaptiveness = paramBoolean5;
      maxVideoWidth = paramInt2;
      maxVideoHeight = paramInt3;
      maxVideoFrameRate = paramInt4;
      maxVideoBitrate = paramInt5;
      exceedVideoConstraintsIfNecessary = paramBoolean6;
      exceedRendererCapabilitiesIfNecessary = paramBoolean7;
      viewportWidth = paramInt6;
      viewportHeight = paramInt7;
      viewportOrientationMayChange = paramBoolean8;
      tunnelingAudioSessionId = paramInt8;
    }
    
    private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray paramSparseBooleanArray1, SparseBooleanArray paramSparseBooleanArray2)
    {
      int i = paramSparseBooleanArray1.size();
      if (paramSparseBooleanArray2.size() != i) {
        return false;
      }
      for (int j = 0; j < i; j++) {
        if (paramSparseBooleanArray2.indexOfKey(paramSparseBooleanArray1.keyAt(j)) < 0) {
          return false;
        }
      }
      return true;
    }
    
    private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray1, SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray2)
    {
      int i = paramSparseArray1.size();
      if (paramSparseArray2.size() != i) {
        return false;
      }
      int j = 0;
      while (j < i)
      {
        int k = paramSparseArray2.indexOfKey(paramSparseArray1.keyAt(j));
        if ((k >= 0) && (areSelectionOverridesEqual((Map)paramSparseArray1.valueAt(j), (Map)paramSparseArray2.valueAt(k)))) {
          j++;
        } else {
          return false;
        }
      }
      return true;
    }
    
    private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> paramMap1, Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> paramMap2)
    {
      int i = paramMap1.size();
      if (paramMap2.size() != i) {
        return false;
      }
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap1 = (Map.Entry)localIterator.next();
        TrackGroupArray localTrackGroupArray = (TrackGroupArray)paramMap1.getKey();
        if ((!paramMap2.containsKey(localTrackGroupArray)) || (!Util.areEqual(paramMap1.getValue(), paramMap2.get(localTrackGroupArray)))) {
          return false;
        }
      }
      return true;
    }
    
    private static SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> readSelectionOverrides(Parcel paramParcel)
    {
      int i = paramParcel.readInt();
      SparseArray localSparseArray = new SparseArray(i);
      for (int j = 0; j < i; j++)
      {
        int k = paramParcel.readInt();
        int m = paramParcel.readInt();
        HashMap localHashMap = new HashMap(m);
        for (int n = 0; n < m; n++) {
          localHashMap.put((TrackGroupArray)paramParcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector.SelectionOverride)paramParcel.readParcelable(DefaultTrackSelector.SelectionOverride.class.getClassLoader()));
        }
        localSparseArray.put(k, localHashMap);
      }
      return localSparseArray;
    }
    
    private static void writeSelectionOverridesToParcel(Parcel paramParcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray)
    {
      int i = paramSparseArray.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++)
      {
        int k = paramSparseArray.keyAt(j);
        Object localObject = (Map)paramSparseArray.valueAt(j);
        int m = ((Map)localObject).size();
        paramParcel.writeInt(k);
        paramParcel.writeInt(m);
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          paramParcel.writeParcelable((Parcelable)localEntry.getKey(), 0);
          paramParcel.writeParcelable((Parcelable)localEntry.getValue(), 0);
        }
      }
    }
    
    public DefaultTrackSelector.ParametersBuilder buildUpon()
    {
      return new DefaultTrackSelector.ParametersBuilder(this, null);
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (Parameters.class == paramObject.getClass()))
      {
        paramObject = (Parameters)paramObject;
        if ((selectUndeterminedTextLanguage != selectUndeterminedTextLanguage) || (disabledTextTrackSelectionFlags != disabledTextTrackSelectionFlags) || (forceLowestBitrate != forceLowestBitrate) || (forceHighestSupportedBitrate != forceHighestSupportedBitrate) || (allowMixedMimeAdaptiveness != allowMixedMimeAdaptiveness) || (allowNonSeamlessAdaptiveness != allowNonSeamlessAdaptiveness) || (maxVideoWidth != maxVideoWidth) || (maxVideoHeight != maxVideoHeight) || (maxVideoFrameRate != maxVideoFrameRate) || (exceedVideoConstraintsIfNecessary != exceedVideoConstraintsIfNecessary) || (exceedRendererCapabilitiesIfNecessary != exceedRendererCapabilitiesIfNecessary) || (viewportOrientationMayChange != viewportOrientationMayChange) || (viewportWidth != viewportWidth) || (viewportHeight != viewportHeight) || (maxVideoBitrate != maxVideoBitrate) || (tunnelingAudioSessionId != tunnelingAudioSessionId) || (!TextUtils.equals(preferredAudioLanguage, preferredAudioLanguage)) || (!TextUtils.equals(preferredTextLanguage, preferredTextLanguage)) || (!areRendererDisabledFlagsEqual(rendererDisabledFlags, rendererDisabledFlags)) || (!areSelectionOverridesEqual(selectionOverrides, selectionOverrides))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final boolean getRendererDisabled(int paramInt)
    {
      return rendererDisabledFlags.get(paramInt);
    }
    
    @Nullable
    public final DefaultTrackSelector.SelectionOverride getSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
    {
      Map localMap = (Map)selectionOverrides.get(paramInt);
      if (localMap != null) {
        paramTrackGroupArray = (DefaultTrackSelector.SelectionOverride)localMap.get(paramTrackGroupArray);
      } else {
        paramTrackGroupArray = null;
      }
      return paramTrackGroupArray;
    }
    
    public final boolean hasSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
    {
      Map localMap = (Map)selectionOverrides.get(paramInt);
      boolean bool;
      if ((localMap != null) && (localMap.containsKey(paramTrackGroupArray))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      boolean bool = selectUndeterminedTextLanguage;
      int i = disabledTextTrackSelectionFlags;
      int j = forceLowestBitrate;
      int k = forceHighestSupportedBitrate;
      int m = allowMixedMimeAdaptiveness;
      int n = allowNonSeamlessAdaptiveness;
      int i1 = maxVideoWidth;
      int i2 = maxVideoHeight;
      int i3 = maxVideoFrameRate;
      int i4 = exceedVideoConstraintsIfNecessary;
      int i5 = exceedRendererCapabilitiesIfNecessary;
      int i6 = viewportOrientationMayChange;
      int i7 = viewportWidth;
      int i8 = viewportHeight;
      int i9 = maxVideoBitrate;
      int i10 = tunnelingAudioSessionId;
      String str = preferredAudioLanguage;
      int i11 = 0;
      int i12;
      if (str == null) {
        i12 = 0;
      } else {
        i12 = str.hashCode();
      }
      str = preferredTextLanguage;
      if (str != null) {
        i11 = str.hashCode();
      }
      return ((((((((((((((((bool * true + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i12) * 31 + i11;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      writeSelectionOverridesToParcel(paramParcel, selectionOverrides);
      paramParcel.writeSparseBooleanArray(rendererDisabledFlags);
      paramParcel.writeString(preferredAudioLanguage);
      paramParcel.writeString(preferredTextLanguage);
      Util.writeBoolean(paramParcel, selectUndeterminedTextLanguage);
      paramParcel.writeInt(disabledTextTrackSelectionFlags);
      Util.writeBoolean(paramParcel, forceLowestBitrate);
      Util.writeBoolean(paramParcel, forceHighestSupportedBitrate);
      Util.writeBoolean(paramParcel, allowMixedMimeAdaptiveness);
      Util.writeBoolean(paramParcel, allowNonSeamlessAdaptiveness);
      paramParcel.writeInt(maxVideoWidth);
      paramParcel.writeInt(maxVideoHeight);
      paramParcel.writeInt(maxVideoFrameRate);
      paramParcel.writeInt(maxVideoBitrate);
      Util.writeBoolean(paramParcel, exceedVideoConstraintsIfNecessary);
      Util.writeBoolean(paramParcel, exceedRendererCapabilitiesIfNecessary);
      paramParcel.writeInt(viewportWidth);
      paramParcel.writeInt(viewportHeight);
      Util.writeBoolean(paramParcel, viewportOrientationMayChange);
      paramParcel.writeInt(tunnelingAudioSessionId);
    }
  }
  
  public static final class ParametersBuilder
  {
    private boolean allowMixedMimeAdaptiveness;
    private boolean allowNonSeamlessAdaptiveness;
    private int disabledTextTrackSelectionFlags;
    private boolean exceedRendererCapabilitiesIfNecessary;
    private boolean exceedVideoConstraintsIfNecessary;
    private boolean forceHighestSupportedBitrate;
    private boolean forceLowestBitrate;
    private int maxVideoBitrate;
    private int maxVideoFrameRate;
    private int maxVideoHeight;
    private int maxVideoWidth;
    @Nullable
    private String preferredAudioLanguage;
    @Nullable
    private String preferredTextLanguage;
    private final SparseBooleanArray rendererDisabledFlags;
    private boolean selectUndeterminedTextLanguage;
    private final SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> selectionOverrides;
    private int tunnelingAudioSessionId;
    private int viewportHeight;
    private boolean viewportOrientationMayChange;
    private int viewportWidth;
    
    public ParametersBuilder()
    {
      this(DefaultTrackSelector.Parameters.DEFAULT);
    }
    
    private ParametersBuilder(DefaultTrackSelector.Parameters paramParameters)
    {
      selectionOverrides = cloneSelectionOverrides(DefaultTrackSelector.Parameters.access$000(paramParameters));
      rendererDisabledFlags = DefaultTrackSelector.Parameters.access$100(paramParameters).clone();
      preferredAudioLanguage = preferredAudioLanguage;
      preferredTextLanguage = preferredTextLanguage;
      selectUndeterminedTextLanguage = selectUndeterminedTextLanguage;
      disabledTextTrackSelectionFlags = disabledTextTrackSelectionFlags;
      forceLowestBitrate = forceLowestBitrate;
      forceHighestSupportedBitrate = forceHighestSupportedBitrate;
      allowMixedMimeAdaptiveness = allowMixedMimeAdaptiveness;
      allowNonSeamlessAdaptiveness = allowNonSeamlessAdaptiveness;
      maxVideoWidth = maxVideoWidth;
      maxVideoHeight = maxVideoHeight;
      maxVideoFrameRate = maxVideoFrameRate;
      maxVideoBitrate = maxVideoBitrate;
      exceedVideoConstraintsIfNecessary = exceedVideoConstraintsIfNecessary;
      exceedRendererCapabilitiesIfNecessary = exceedRendererCapabilitiesIfNecessary;
      viewportWidth = viewportWidth;
      viewportHeight = viewportHeight;
      viewportOrientationMayChange = viewportOrientationMayChange;
      tunnelingAudioSessionId = tunnelingAudioSessionId;
    }
    
    private static SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray)
    {
      SparseArray localSparseArray = new SparseArray();
      for (int i = 0; i < paramSparseArray.size(); i++) {
        localSparseArray.put(paramSparseArray.keyAt(i), new HashMap((Map)paramSparseArray.valueAt(i)));
      }
      return localSparseArray;
    }
    
    public DefaultTrackSelector.Parameters build()
    {
      return new DefaultTrackSelector.Parameters(selectionOverrides, rendererDisabledFlags, preferredAudioLanguage, preferredTextLanguage, selectUndeterminedTextLanguage, disabledTextTrackSelectionFlags, forceLowestBitrate, forceHighestSupportedBitrate, allowMixedMimeAdaptiveness, allowNonSeamlessAdaptiveness, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, exceedVideoConstraintsIfNecessary, exceedRendererCapabilitiesIfNecessary, viewportWidth, viewportHeight, viewportOrientationMayChange, tunnelingAudioSessionId);
    }
    
    public final ParametersBuilder clearSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray)
    {
      Map localMap = (Map)selectionOverrides.get(paramInt);
      if ((localMap != null) && (localMap.containsKey(paramTrackGroupArray)))
      {
        localMap.remove(paramTrackGroupArray);
        if (localMap.isEmpty()) {
          selectionOverrides.remove(paramInt);
        }
      }
      return this;
    }
    
    public final ParametersBuilder clearSelectionOverrides()
    {
      if (selectionOverrides.size() == 0) {
        return this;
      }
      selectionOverrides.clear();
      return this;
    }
    
    public final ParametersBuilder clearSelectionOverrides(int paramInt)
    {
      Map localMap = (Map)selectionOverrides.get(paramInt);
      if ((localMap != null) && (!localMap.isEmpty())) {
        selectionOverrides.remove(paramInt);
      }
      return this;
    }
    
    public ParametersBuilder clearVideoSizeConstraints()
    {
      return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    public ParametersBuilder clearViewportSizeConstraints()
    {
      return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }
    
    public ParametersBuilder setAllowMixedMimeAdaptiveness(boolean paramBoolean)
    {
      allowMixedMimeAdaptiveness = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean paramBoolean)
    {
      allowNonSeamlessAdaptiveness = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setDisabledTextTrackSelectionFlags(int paramInt)
    {
      disabledTextTrackSelectionFlags = paramInt;
      return this;
    }
    
    public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean paramBoolean)
    {
      exceedRendererCapabilitiesIfNecessary = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean paramBoolean)
    {
      exceedVideoConstraintsIfNecessary = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setForceHighestSupportedBitrate(boolean paramBoolean)
    {
      forceHighestSupportedBitrate = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setForceLowestBitrate(boolean paramBoolean)
    {
      forceLowestBitrate = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setMaxVideoBitrate(int paramInt)
    {
      maxVideoBitrate = paramInt;
      return this;
    }
    
    public ParametersBuilder setMaxVideoFrameRate(int paramInt)
    {
      maxVideoFrameRate = paramInt;
      return this;
    }
    
    public ParametersBuilder setMaxVideoSize(int paramInt1, int paramInt2)
    {
      maxVideoWidth = paramInt1;
      maxVideoHeight = paramInt2;
      return this;
    }
    
    public ParametersBuilder setMaxVideoSizeSd()
    {
      return setMaxVideoSize(1279, 719);
    }
    
    public ParametersBuilder setPreferredAudioLanguage(String paramString)
    {
      preferredAudioLanguage = paramString;
      return this;
    }
    
    public ParametersBuilder setPreferredTextLanguage(String paramString)
    {
      preferredTextLanguage = paramString;
      return this;
    }
    
    public final ParametersBuilder setRendererDisabled(int paramInt, boolean paramBoolean)
    {
      if (rendererDisabledFlags.get(paramInt) == paramBoolean) {
        return this;
      }
      if (paramBoolean) {
        rendererDisabledFlags.put(paramInt, true);
      } else {
        rendererDisabledFlags.delete(paramInt);
      }
      return this;
    }
    
    public ParametersBuilder setSelectUndeterminedTextLanguage(boolean paramBoolean)
    {
      selectUndeterminedTextLanguage = paramBoolean;
      return this;
    }
    
    public final ParametersBuilder setSelectionOverride(int paramInt, TrackGroupArray paramTrackGroupArray, DefaultTrackSelector.SelectionOverride paramSelectionOverride)
    {
      Map localMap = (Map)selectionOverrides.get(paramInt);
      Object localObject = localMap;
      if (localMap == null)
      {
        localObject = new HashMap();
        selectionOverrides.put(paramInt, localObject);
      }
      if ((((Map)localObject).containsKey(paramTrackGroupArray)) && (Util.areEqual(((Map)localObject).get(paramTrackGroupArray), paramSelectionOverride))) {
        return this;
      }
      ((Map)localObject).put(paramTrackGroupArray, paramSelectionOverride);
      return this;
    }
    
    public ParametersBuilder setTunnelingAudioSessionId(int paramInt)
    {
      if (tunnelingAudioSessionId != paramInt) {
        tunnelingAudioSessionId = paramInt;
      }
      return this;
    }
    
    public ParametersBuilder setViewportSize(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      viewportWidth = paramInt1;
      viewportHeight = paramInt2;
      viewportOrientationMayChange = paramBoolean;
      return this;
    }
    
    public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context paramContext, boolean paramBoolean)
    {
      paramContext = Util.getPhysicalDisplaySize(paramContext);
      return setViewportSize(x, y, paramBoolean);
    }
  }
  
  public static final class SelectionOverride
    implements Parcelable
  {
    public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator()
    {
      public DefaultTrackSelector.SelectionOverride createFromParcel(Parcel paramAnonymousParcel)
      {
        return new DefaultTrackSelector.SelectionOverride(paramAnonymousParcel);
      }
      
      public DefaultTrackSelector.SelectionOverride[] newArray(int paramAnonymousInt)
      {
        return new DefaultTrackSelector.SelectionOverride[paramAnonymousInt];
      }
    };
    public final int groupIndex;
    public final int length;
    public final int[] tracks;
    
    public SelectionOverride(int paramInt, int... paramVarArgs)
    {
      groupIndex = paramInt;
      int[] arrayOfInt = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
      tracks = arrayOfInt;
      length = paramVarArgs.length;
      Arrays.sort(arrayOfInt);
    }
    
    public SelectionOverride(Parcel paramParcel)
    {
      groupIndex = paramParcel.readInt();
      int i = paramParcel.readByte();
      length = i;
      int[] arrayOfInt = new int[i];
      tracks = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
    
    public boolean containsTrack(int paramInt)
    {
      int[] arrayOfInt = tracks;
      int i = arrayOfInt.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] == paramInt) {
          return true;
        }
      }
      return false;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (SelectionOverride.class == paramObject.getClass()))
      {
        paramObject = (SelectionOverride)paramObject;
        if ((groupIndex != groupIndex) || (!Arrays.equals(tracks, tracks))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = groupIndex;
      return Arrays.hashCode(tracks) + i * 31;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(groupIndex);
      paramParcel.writeInt(tracks.length);
      paramParcel.writeIntArray(tracks);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */