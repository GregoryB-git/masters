package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.util.Util;

public final class TrackSelectorResult
{
  public final Object info;
  public final int length;
  public final RendererConfiguration[] rendererConfigurations;
  public final TrackSelectionArray selections;
  
  public TrackSelectorResult(RendererConfiguration[] paramArrayOfRendererConfiguration, TrackSelection[] paramArrayOfTrackSelection, Object paramObject)
  {
    rendererConfigurations = paramArrayOfRendererConfiguration;
    selections = new TrackSelectionArray(paramArrayOfTrackSelection);
    info = paramObject;
    length = paramArrayOfRendererConfiguration.length;
  }
  
  public boolean isEquivalent(TrackSelectorResult paramTrackSelectorResult)
  {
    if ((paramTrackSelectorResult != null) && (selections.length == selections.length))
    {
      for (int i = 0; i < selections.length; i++) {
        if (!isEquivalent(paramTrackSelectorResult, i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean isEquivalent(TrackSelectorResult paramTrackSelectorResult, int paramInt)
  {
    boolean bool1 = false;
    if (paramTrackSelectorResult == null) {
      return false;
    }
    boolean bool2 = bool1;
    if (Util.areEqual(rendererConfigurations[paramInt], rendererConfigurations[paramInt]))
    {
      bool2 = bool1;
      if (Util.areEqual(selections.get(paramInt), selections.get(paramInt))) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean isRendererEnabled(int paramInt)
  {
    boolean bool;
    if (rendererConfigurations[paramInt] != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.TrackSelectorResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */