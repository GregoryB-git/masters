package com.google.android.exoplayer2.source.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Queue;

class HlsPlaylistParser$LineIterator
{
  private final Queue<String> extraLines;
  private String next;
  private final BufferedReader reader;
  
  public HlsPlaylistParser$LineIterator(Queue<String> paramQueue, BufferedReader paramBufferedReader)
  {
    extraLines = paramQueue;
    reader = paramBufferedReader;
  }
  
  public boolean hasNext()
    throws IOException
  {
    if (next != null) {
      return true;
    }
    if (!extraLines.isEmpty())
    {
      next = ((String)extraLines.poll());
      return true;
    }
    String str;
    do
    {
      str = reader.readLine();
      next = str;
      if (str == null) {
        break;
      }
      str = str.trim();
      next = str;
    } while (str.isEmpty());
    return true;
    return false;
  }
  
  public String next()
    throws IOException
  {
    boolean bool = hasNext();
    String str = null;
    if (bool)
    {
      str = next;
      next = null;
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */