package d0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public abstract class o
{
  public static int a(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    paramString = z.t(paramString);
    paramString.hashCode();
    switch (paramString.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      do
                                                      {
                                                        do
                                                        {
                                                          do
                                                          {
                                                            do
                                                            {
                                                              do
                                                              {
                                                                do
                                                                {
                                                                  do
                                                                  {
                                                                    i = -1;
                                                                    break;
                                                                  } while (!paramString.equals("video/x-matroska"));
                                                                  i = 31;
                                                                  break;
                                                                } while (!paramString.equals("audio/webm"));
                                                                i = 30;
                                                                break;
                                                              } while (!paramString.equals("audio/mpeg"));
                                                              i = 29;
                                                              break;
                                                            } while (!paramString.equals("audio/midi"));
                                                            i = 28;
                                                            break;
                                                          } while (!paramString.equals("audio/flac"));
                                                          i = 27;
                                                          break;
                                                        } while (!paramString.equals("audio/eac3"));
                                                        i = 26;
                                                        break;
                                                      } while (!paramString.equals("audio/3gpp"));
                                                      i = 25;
                                                      break;
                                                    } while (!paramString.equals("video/mp4"));
                                                    i = 24;
                                                    break;
                                                  } while (!paramString.equals("audio/wav"));
                                                  i = 23;
                                                  break;
                                                } while (!paramString.equals("audio/ogg"));
                                                i = 22;
                                                break;
                                              } while (!paramString.equals("audio/mp4"));
                                              i = 21;
                                              break;
                                            } while (!paramString.equals("audio/amr"));
                                            i = 20;
                                            break;
                                          } while (!paramString.equals("audio/ac4"));
                                          i = 19;
                                          break;
                                        } while (!paramString.equals("audio/ac3"));
                                        i = 18;
                                        break;
                                      } while (!paramString.equals("video/x-flv"));
                                      i = 17;
                                      break;
                                    } while (!paramString.equals("application/webm"));
                                    i = 16;
                                    break;
                                  } while (!paramString.equals("audio/x-matroska"));
                                  i = 15;
                                  break;
                                } while (!paramString.equals("image/png"));
                                i = 14;
                                break;
                              } while (!paramString.equals("image/bmp"));
                              i = 13;
                              break;
                            } while (!paramString.equals("text/vtt"));
                            i = 12;
                            break;
                          } while (!paramString.equals("video/x-msvideo"));
                          i = 11;
                          break;
                        } while (!paramString.equals("application/mp4"));
                        i = 10;
                        break;
                      } while (!paramString.equals("image/webp"));
                      i = 9;
                      break;
                    } while (!paramString.equals("image/jpeg"));
                    i = 8;
                    break;
                  } while (!paramString.equals("image/heif"));
                  i = 7;
                  break;
                } while (!paramString.equals("image/heic"));
                i = 6;
                break;
              } while (!paramString.equals("image/avif"));
              i = 5;
              break;
            } while (!paramString.equals("audio/amr-wb"));
            i = 4;
            break;
          } while (!paramString.equals("video/webm"));
          i = 3;
          break;
        } while (!paramString.equals("video/mp2t"));
        i = 2;
        break;
      } while (!paramString.equals("video/mp2p"));
      i = 1;
      break;
    } while (!paramString.equals("audio/eac3-joc"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 29: 
      return 7;
    case 28: 
      return 15;
    case 27: 
      return 4;
    case 23: 
      return 12;
    case 22: 
      return 9;
    case 19: 
      return 1;
    case 17: 
      return 5;
    case 14: 
      return 17;
    case 13: 
      return 19;
    case 12: 
      return 13;
    case 11: 
      return 16;
    case 10: 
    case 21: 
    case 24: 
      return 8;
    case 9: 
      return 18;
    case 8: 
      return 14;
    case 6: 
    case 7: 
      return 20;
    case 5: 
      return 21;
    case 4: 
    case 20: 
    case 25: 
      return 3;
    case 3: 
    case 15: 
    case 16: 
    case 30: 
    case 31: 
      return 6;
    case 2: 
      return 11;
    case 1: 
      return 10;
    }
    return 0;
  }
  
  public static int b(Map paramMap)
  {
    paramMap = (List)paramMap.get("Content-Type");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      paramMap = (String)paramMap.get(0);
    } else {
      paramMap = null;
    }
    return a(paramMap);
  }
  
  public static int c(Uri paramUri)
  {
    paramUri = paramUri.getLastPathSegment();
    if (paramUri == null) {
      return -1;
    }
    if ((!paramUri.endsWith(".ac3")) && (!paramUri.endsWith(".ec3")))
    {
      if (paramUri.endsWith(".ac4")) {
        return 1;
      }
      if ((!paramUri.endsWith(".adts")) && (!paramUri.endsWith(".aac")))
      {
        if (paramUri.endsWith(".amr")) {
          return 3;
        }
        if (paramUri.endsWith(".flac")) {
          return 4;
        }
        if (paramUri.endsWith(".flv")) {
          return 5;
        }
        if ((!paramUri.endsWith(".mid")) && (!paramUri.endsWith(".midi")) && (!paramUri.endsWith(".smf")))
        {
          if ((!paramUri.startsWith(".mk", paramUri.length() - 4)) && (!paramUri.endsWith(".webm")))
          {
            if (paramUri.endsWith(".mp3")) {
              return 7;
            }
            if ((!paramUri.endsWith(".mp4")) && (!paramUri.startsWith(".m4", paramUri.length() - 4)) && (!paramUri.startsWith(".mp4", paramUri.length() - 5)) && (!paramUri.startsWith(".cmf", paramUri.length() - 5)))
            {
              if ((!paramUri.startsWith(".og", paramUri.length() - 4)) && (!paramUri.endsWith(".opus")))
              {
                if ((!paramUri.endsWith(".ps")) && (!paramUri.endsWith(".mpeg")) && (!paramUri.endsWith(".mpg")) && (!paramUri.endsWith(".m2p")))
                {
                  if ((!paramUri.endsWith(".ts")) && (!paramUri.startsWith(".ts", paramUri.length() - 4)))
                  {
                    if ((!paramUri.endsWith(".wav")) && (!paramUri.endsWith(".wave")))
                    {
                      if ((!paramUri.endsWith(".vtt")) && (!paramUri.endsWith(".webvtt")))
                      {
                        if ((!paramUri.endsWith(".jpg")) && (!paramUri.endsWith(".jpeg")))
                        {
                          if (paramUri.endsWith(".avi")) {
                            return 16;
                          }
                          if (paramUri.endsWith(".png")) {
                            return 17;
                          }
                          if (paramUri.endsWith(".webp")) {
                            return 18;
                          }
                          if ((!paramUri.endsWith(".bmp")) && (!paramUri.endsWith(".dib")))
                          {
                            if ((!paramUri.endsWith(".heic")) && (!paramUri.endsWith(".heif")))
                            {
                              if (paramUri.endsWith(".avif")) {
                                return 21;
                              }
                              return -1;
                            }
                            return 20;
                          }
                          return 19;
                        }
                        return 14;
                      }
                      return 13;
                    }
                    return 12;
                  }
                  return 11;
                }
                return 10;
              }
              return 9;
            }
            return 8;
          }
          return 6;
        }
        return 15;
      }
      return 2;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     d0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */