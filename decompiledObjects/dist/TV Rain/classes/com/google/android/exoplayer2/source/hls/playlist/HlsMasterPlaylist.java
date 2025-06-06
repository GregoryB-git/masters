package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class HlsMasterPlaylist
  extends HlsPlaylist
{
  public static final HlsMasterPlaylist EMPTY = new HlsMasterPlaylist("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap());
  public static final int GROUP_INDEX_AUDIO = 1;
  public static final int GROUP_INDEX_SUBTITLE = 2;
  public static final int GROUP_INDEX_VARIANT = 0;
  public final List<HlsUrl> audios;
  public final Format muxedAudioFormat;
  public final List<Format> muxedCaptionFormats;
  public final List<HlsUrl> subtitles;
  public final Map<String, String> variableDefinitions;
  public final List<HlsUrl> variants;
  
  public HlsMasterPlaylist(String paramString, List<String> paramList, List<HlsUrl> paramList1, List<HlsUrl> paramList2, List<HlsUrl> paramList3, Format paramFormat, List<Format> paramList4, boolean paramBoolean, Map<String, String> paramMap)
  {
    super(paramString, paramList, paramBoolean);
    variants = Collections.unmodifiableList(paramList1);
    audios = Collections.unmodifiableList(paramList2);
    subtitles = Collections.unmodifiableList(paramList3);
    muxedAudioFormat = paramFormat;
    if (paramList4 != null) {
      paramString = Collections.unmodifiableList(paramList4);
    } else {
      paramString = null;
    }
    muxedCaptionFormats = paramString;
    variableDefinitions = Collections.unmodifiableMap(paramMap);
  }
  
  private static List<HlsUrl> copyRenditionsList(List<HlsUrl> paramList, int paramInt, List<StreamKey> paramList1)
  {
    ArrayList localArrayList = new ArrayList(paramList1.size());
    for (int i = 0; i < paramList.size(); i++)
    {
      HlsUrl localHlsUrl = (HlsUrl)paramList.get(i);
      for (int j = 0; j < paramList1.size(); j++)
      {
        StreamKey localStreamKey = (StreamKey)paramList1.get(j);
        if ((groupIndex == paramInt) && (trackIndex == i))
        {
          localArrayList.add(localHlsUrl);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String paramString)
  {
    paramString = Collections.singletonList(HlsUrl.createMediaPlaylistHlsUrl(paramString));
    List localList = Collections.emptyList();
    return new HlsMasterPlaylist(null, Collections.emptyList(), paramString, localList, localList, null, null, false, Collections.emptyMap());
  }
  
  public HlsMasterPlaylist copy(List<StreamKey> paramList)
  {
    return new HlsMasterPlaylist(baseUri, tags, copyRenditionsList(variants, 0, paramList), copyRenditionsList(audios, 1, paramList), copyRenditionsList(subtitles, 2, paramList), muxedAudioFormat, muxedCaptionFormats, hasIndependentSegments, variableDefinitions);
  }
  
  public static final class HlsUrl
  {
    public final Format format;
    public final String url;
    
    public HlsUrl(String paramString, Format paramFormat)
    {
      url = paramString;
      format = paramFormat;
    }
    
    public static HlsUrl createMediaPlaylistHlsUrl(String paramString)
    {
      return new HlsUrl(paramString, Format.createContainerFormat("0", null, "application/x-mpegURL", null, null, -1, 0, null));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */