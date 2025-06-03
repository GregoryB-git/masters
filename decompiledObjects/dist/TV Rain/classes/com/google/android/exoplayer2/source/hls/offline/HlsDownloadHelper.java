package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class HlsDownloadHelper
  extends DownloadHelper
{
  private final DataSource.Factory manifestDataSourceFactory;
  private HlsPlaylist playlist;
  private int[] renditionGroups;
  private final Uri uri;
  
  public HlsDownloadHelper(Uri paramUri, DataSource.Factory paramFactory)
  {
    uri = paramUri;
    manifestDataSourceFactory = paramFactory;
  }
  
  private static Format[] toFormats(List<HlsMasterPlaylist.HlsUrl> paramList)
  {
    Format[] arrayOfFormat = new Format[paramList.size()];
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfFormat[i] = getformat;
    }
    return arrayOfFormat;
  }
  
  private static List<StreamKey> toStreamKeys(List<TrackKey> paramList, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (int i = 0; i < paramList.size(); i++)
    {
      TrackKey localTrackKey = (TrackKey)paramList.get(i);
      localArrayList.add(new StreamKey(paramArrayOfInt[groupIndex], trackIndex));
    }
    return localArrayList;
  }
  
  public HlsDownloadAction getDownloadAction(@Nullable byte[] paramArrayOfByte, List<TrackKey> paramList)
  {
    Assertions.checkNotNull(renditionGroups);
    return HlsDownloadAction.createDownloadAction(uri, paramArrayOfByte, toStreamKeys(paramList, renditionGroups));
  }
  
  public int getPeriodCount()
  {
    Assertions.checkNotNull(playlist);
    return 1;
  }
  
  public HlsPlaylist getPlaylist()
  {
    Assertions.checkNotNull(playlist);
    return playlist;
  }
  
  public HlsDownloadAction getRemoveAction(@Nullable byte[] paramArrayOfByte)
  {
    return HlsDownloadAction.createRemoveAction(uri, paramArrayOfByte);
  }
  
  public TrackGroupArray getTrackGroups(int paramInt)
  {
    Assertions.checkNotNull(playlist);
    Object localObject = playlist;
    boolean bool = localObject instanceof HlsMediaPlaylist;
    int i = 0;
    if (bool)
    {
      renditionGroups = new int[0];
      return TrackGroupArray.EMPTY;
    }
    localObject = (HlsMasterPlaylist)localObject;
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[3];
    renditionGroups = new int[3];
    if (!variants.isEmpty())
    {
      renditionGroups[0] = 0;
      arrayOfTrackGroup[0] = new TrackGroup(toFormats(variants));
      i = 1;
    }
    paramInt = i;
    if (!audios.isEmpty())
    {
      renditionGroups[i] = 1;
      arrayOfTrackGroup[i] = new TrackGroup(toFormats(audios));
      paramInt = i + 1;
    }
    i = paramInt;
    if (!subtitles.isEmpty())
    {
      renditionGroups[paramInt] = 2;
      arrayOfTrackGroup[paramInt] = new TrackGroup(toFormats(subtitles));
      i = paramInt + 1;
    }
    return new TrackGroupArray((TrackGroup[])Arrays.copyOf(arrayOfTrackGroup, i));
  }
  
  public void prepareInternal()
    throws IOException
  {
    playlist = ((HlsPlaylist)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), new HlsPlaylistParser(), uri, 4));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.offline.HlsDownloadHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */