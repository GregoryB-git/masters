package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class DefaultTrackSelector$Parameters
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
  
  private DefaultTrackSelector$Parameters()
  {
    this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
  }
  
  public DefaultTrackSelector$Parameters(Parcel paramParcel)
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
  
  public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> paramSparseArray, SparseBooleanArray paramSparseBooleanArray, @Nullable String paramString1, @Nullable String paramString2, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean6, boolean paramBoolean7, int paramInt6, int paramInt7, boolean paramBoolean8, int paramInt8)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */