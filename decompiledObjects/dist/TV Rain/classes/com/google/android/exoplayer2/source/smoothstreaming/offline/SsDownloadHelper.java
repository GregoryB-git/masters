package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsDownloadHelper
  extends DownloadHelper
{
  private SsManifest manifest;
  private final DataSource.Factory manifestDataSourceFactory;
  private final Uri uri;
  
  public SsDownloadHelper(Uri paramUri, DataSource.Factory paramFactory)
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
      localArrayList.add(new StreamKey(groupIndex, trackIndex));
    }
    return localArrayList;
  }
  
  public SsDownloadAction getDownloadAction(@Nullable byte[] paramArrayOfByte, List<TrackKey> paramList)
  {
    return SsDownloadAction.createDownloadAction(uri, paramArrayOfByte, toStreamKeys(paramList));
  }
  
  public SsManifest getManifest()
  {
    Assertions.checkNotNull(manifest);
    return manifest;
  }
  
  public int getPeriodCount()
  {
    Assertions.checkNotNull(manifest);
    return 1;
  }
  
  public SsDownloadAction getRemoveAction(@Nullable byte[] paramArrayOfByte)
  {
    return SsDownloadAction.createRemoveAction(uri, paramArrayOfByte);
  }
  
  public TrackGroupArray getTrackGroups(int paramInt)
  {
    Assertions.checkNotNull(manifest);
    SsManifest.StreamElement[] arrayOfStreamElement = manifest.streamElements;
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[arrayOfStreamElement.length];
    for (paramInt = 0; paramInt < arrayOfStreamElement.length; paramInt++) {
      arrayOfTrackGroup[paramInt] = new TrackGroup(formats);
    }
    return new TrackGroupArray(arrayOfTrackGroup);
  }
  
  public void prepareInternal()
    throws IOException
  {
    manifest = ((SsManifest)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), new SsManifestParser(), uri, 4));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */