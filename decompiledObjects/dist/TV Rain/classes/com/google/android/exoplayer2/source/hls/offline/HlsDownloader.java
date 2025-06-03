package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.offline.SegmentDownloader.Segment;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class HlsDownloader
  extends SegmentDownloader<HlsPlaylist>
{
  public HlsDownloader(Uri paramUri, List<StreamKey> paramList, DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    super(paramUri, paramList, paramDownloaderConstructorHelper);
  }
  
  private static void addResolvedUris(String paramString, List<HlsMasterPlaylist.HlsUrl> paramList, List<Uri> paramList1)
  {
    for (int i = 0; i < paramList.size(); i++) {
      paramList1.add(UriUtil.resolveToUri(paramString, geturl));
    }
  }
  
  private static void addSegment(ArrayList<SegmentDownloader.Segment> paramArrayList, HlsMediaPlaylist paramHlsMediaPlaylist, HlsMediaPlaylist.Segment paramSegment, HashSet<Uri> paramHashSet)
  {
    long l = startTimeUs + relativeStartTimeUs;
    Object localObject = fullSegmentEncryptionKeyUri;
    if (localObject != null)
    {
      localObject = UriUtil.resolveToUri(baseUri, (String)localObject);
      if (paramHashSet.add(localObject)) {
        paramArrayList.add(new SegmentDownloader.Segment(l, new DataSpec((Uri)localObject)));
      }
    }
    paramArrayList.add(new SegmentDownloader.Segment(l, new DataSpec(UriUtil.resolveToUri(baseUri, url), byterangeOffset, byterangeLength, null)));
  }
  
  private static HlsPlaylist loadManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException
  {
    return (HlsPlaylist)ParsingLoadable.load(paramDataSource, new HlsPlaylistParser(), paramUri, 4);
  }
  
  public HlsPlaylist getManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException
  {
    return loadManifest(paramDataSource, paramUri);
  }
  
  public List<SegmentDownloader.Segment> getSegments(DataSource paramDataSource, HlsPlaylist paramHlsPlaylist, boolean paramBoolean)
    throws IOException
  {
    Object localObject1 = new ArrayList();
    if ((paramHlsPlaylist instanceof HlsMasterPlaylist))
    {
      paramHlsPlaylist = (HlsMasterPlaylist)paramHlsPlaylist;
      addResolvedUris(baseUri, variants, (List)localObject1);
      addResolvedUris(baseUri, audios, (List)localObject1);
      addResolvedUris(baseUri, subtitles, (List)localObject1);
    }
    else
    {
      ((ArrayList)localObject1).add(Uri.parse(baseUri));
    }
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    while (localIterator.hasNext())
    {
      paramHlsPlaylist = (Uri)localIterator.next();
      try
      {
        HlsMediaPlaylist localHlsMediaPlaylist = (HlsMediaPlaylist)loadManifest(paramDataSource, paramHlsPlaylist);
        Object localObject2 = new com/google/android/exoplayer2/offline/SegmentDownloader$Segment;
        long l = startTimeUs;
        localObject1 = new com/google/android/exoplayer2/upstream/DataSpec;
        ((DataSpec)localObject1).<init>(paramHlsPlaylist);
        ((SegmentDownloader.Segment)localObject2).<init>(l, (DataSpec)localObject1);
        localArrayList.add(localObject2);
        localObject1 = null;
        List localList = segments;
        int i = 0;
        while (i < localList.size())
        {
          HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)localList.get(i);
          localObject2 = initializationSegment;
          paramHlsPlaylist = (HlsPlaylist)localObject1;
          if (localObject2 != null)
          {
            paramHlsPlaylist = (HlsPlaylist)localObject1;
            if (localObject2 != localObject1)
            {
              addSegment(localArrayList, localHlsMediaPlaylist, (HlsMediaPlaylist.Segment)localObject2, localHashSet);
              paramHlsPlaylist = (HlsPlaylist)localObject2;
            }
          }
          addSegment(localArrayList, localHlsMediaPlaylist, localSegment, localHashSet);
          i++;
          localObject1 = paramHlsPlaylist;
        }
      }
      catch (IOException localIOException)
      {
        if (paramBoolean) {
          localArrayList.add(new SegmentDownloader.Segment(0L, new DataSpec(paramHlsPlaylist)));
        } else {
          throw localIOException;
        }
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.offline.HlsDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */