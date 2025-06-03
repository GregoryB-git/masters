package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloadHelper
  extends DownloadHelper
{
  private DashManifest manifest;
  private final DataSource.Factory manifestDataSourceFactory;
  private final Uri uri;
  
  public DashDownloadHelper(Uri paramUri, DataSource.Factory paramFactory)
  {
    uri = paramUri;
    manifestDataSourceFactory = paramFactory;
  }
  
  private static List<StreamKey> toStreamKeys(List<TrackKey> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (int i = 0; i < paramList.size(); i++)
    {
      TrackKey localTrackKey = (TrackKey)paramList.get(i);
      localArrayList.add(new StreamKey(periodIndex, groupIndex, trackIndex));
    }
    return localArrayList;
  }
  
  public DashDownloadAction getDownloadAction(@Nullable byte[] paramArrayOfByte, List<TrackKey> paramList)
  {
    return DashDownloadAction.createDownloadAction(uri, paramArrayOfByte, toStreamKeys(paramList));
  }
  
  public DashManifest getManifest()
  {
    Assertions.checkNotNull(manifest);
    return manifest;
  }
  
  public int getPeriodCount()
  {
    Assertions.checkNotNull(manifest);
    return manifest.getPeriodCount();
  }
  
  public DashDownloadAction getRemoveAction(@Nullable byte[] paramArrayOfByte)
  {
    return DashDownloadAction.createRemoveAction(uri, paramArrayOfByte);
  }
  
  public TrackGroupArray getTrackGroups(int paramInt)
  {
    Assertions.checkNotNull(manifest);
    List localList1 = manifest.getPeriod(paramInt).adaptationSets;
    int i = localList1.size();
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[i];
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      List localList2 = getrepresentations;
      Format[] arrayOfFormat = new Format[localList2.size()];
      int j = localList2.size();
      for (int k = 0; k < j; k++) {
        arrayOfFormat[k] = getformat;
      }
      arrayOfTrackGroup[paramInt] = new TrackGroup(arrayOfFormat);
    }
    return new TrackGroupArray(arrayOfTrackGroup);
  }
  
  public void prepareInternal()
    throws IOException
  {
    manifest = ((DashManifest)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), new DashManifestParser(), uri, 4));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.offline.DashDownloadHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */