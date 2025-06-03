package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Map;

public final class DefaultTrackSelector$ParametersBuilder
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
  
  public DefaultTrackSelector$ParametersBuilder()
  {
    this(DefaultTrackSelector.Parameters.DEFAULT);
  }
  
  private DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector.Parameters paramParameters)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */