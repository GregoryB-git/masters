package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.offline.SegmentDownloader.Segment;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsUtil;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsDownloader
  extends SegmentDownloader<SsManifest>
{
  public SsDownloader(Uri paramUri, List<StreamKey> paramList, DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    super(SsUtil.fixManifestUri(paramUri), paramList, paramDownloaderConstructorHelper);
  }
  
  public SsManifest getManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException
  {
    return (SsManifest)ParsingLoadable.load(paramDataSource, new SsManifestParser(), paramUri, 4);
  }
  
  public List<SegmentDownloader.Segment> getSegments(DataSource paramDataSource, SsManifest paramSsManifest, boolean paramBoolean)
  {
    paramDataSource = new ArrayList();
    for (Object localObject : streamElements) {
      for (int k = 0; k < formats.length; k++) {
        for (int m = 0; m < chunkCount; m++) {
          paramDataSource.add(new SegmentDownloader.Segment(((SsManifest.StreamElement)localObject).getStartTimeUs(m), new DataSpec(((SsManifest.StreamElement)localObject).buildRequestUri(k, m))));
        }
      }
    }
    return paramDataSource;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */