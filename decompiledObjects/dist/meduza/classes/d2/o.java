package d2;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

public final class o
{
  public Context a;
  
  public o(Context paramContext)
  {
    a = paramContext;
  }
  
  public static String a(File paramFile)
  {
    String str = paramFile.getCanonicalPath();
    paramFile = str;
    if (!str.endsWith("/")) {
      paramFile = g.d(str, "/");
    }
    return paramFile;
  }
  
  public static String b(String paramString)
  {
    String str1 = null;
    if (paramString == null)
    {
      paramString = str1;
    }
    else
    {
      String str2 = URLConnection.guessContentTypeFromName(paramString);
      if (str2 != null)
      {
        paramString = str2;
      }
      else
      {
        int i = 46;
        int j = paramString.lastIndexOf('.');
        if (j == -1)
        {
          paramString = str1;
        }
        else
        {
          paramString = paramString.substring(j + 1).toLowerCase();
          paramString.getClass();
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
                                                                                                          } while (!paramString.equals("xhtml"));
                                                                                                          i = 49;
                                                                                                          break;
                                                                                                        } while (!paramString.equals("shtml"));
                                                                                                        i = 48;
                                                                                                        break;
                                                                                                      } while (!paramString.equals("pjpeg"));
                                                                                                      i = 47;
                                                                                                      break;
                                                                                                      if (paramString.equals("mhtml")) {
                                                                                                        break;
                                                                                                      }
                                                                                                    } while ((goto 480) || (!paramString.equals("ehtml")));
                                                                                                    i = 45;
                                                                                                    break;
                                                                                                  } while (!paramString.equals("xhtm"));
                                                                                                  i = 44;
                                                                                                  break;
                                                                                                } while (!paramString.equals("woff"));
                                                                                                i = 43;
                                                                                                break;
                                                                                              } while (!paramString.equals("webp"));
                                                                                              i = 42;
                                                                                              break;
                                                                                            } while (!paramString.equals("webm"));
                                                                                            i = 41;
                                                                                            break;
                                                                                          } while (!paramString.equals("wasm"));
                                                                                          i = 40;
                                                                                          break;
                                                                                        } while (!paramString.equals("tiff"));
                                                                                        i = 39;
                                                                                        break;
                                                                                      } while (!paramString.equals("svgz"));
                                                                                      i = 38;
                                                                                      break;
                                                                                    } while (!paramString.equals("shtm"));
                                                                                    i = 37;
                                                                                    break;
                                                                                  } while (!paramString.equals("opus"));
                                                                                  i = 36;
                                                                                  break;
                                                                                } while (!paramString.equals("mpeg"));
                                                                                i = 35;
                                                                                break;
                                                                              } while (!paramString.equals("json"));
                                                                              i = 34;
                                                                              break;
                                                                            } while (!paramString.equals("jpeg"));
                                                                            i = 33;
                                                                            break;
                                                                          } while (!paramString.equals("jfif"));
                                                                          i = 32;
                                                                          break;
                                                                        } while (!paramString.equals("html"));
                                                                        i = 31;
                                                                        break;
                                                                      } while (!paramString.equals("flac"));
                                                                      i = 30;
                                                                      break;
                                                                    } while (!paramString.equals("apng"));
                                                                    i = 29;
                                                                    break;
                                                                  } while (!paramString.equals("zip"));
                                                                  i = 28;
                                                                  break;
                                                                } while (!paramString.equals("xml"));
                                                                i = 27;
                                                                break;
                                                              } while (!paramString.equals("xht"));
                                                              i = 26;
                                                              break;
                                                            } while (!paramString.equals("wav"));
                                                            i = 25;
                                                            break;
                                                          } while (!paramString.equals("tif"));
                                                          i = 24;
                                                          break;
                                                        } while (!paramString.equals("tgz"));
                                                        i = 23;
                                                        break;
                                                      } while (!paramString.equals("svg"));
                                                      i = 22;
                                                      break;
                                                    } while (!paramString.equals("png"));
                                                    i = 21;
                                                    break;
                                                  } while (!paramString.equals("pjp"));
                                                  i = 20;
                                                  break;
                                                } while (!paramString.equals("pdf"));
                                                i = 19;
                                                break;
                                              } while (!paramString.equals("ogv"));
                                              i = 18;
                                              break;
                                            } while (!paramString.equals("ogm"));
                                            i = 17;
                                            break;
                                          } while (!paramString.equals("ogg"));
                                          i = 16;
                                          break;
                                        } while (!paramString.equals("oga"));
                                        i = 15;
                                        break;
                                      } while (!paramString.equals("mpg"));
                                      i = 14;
                                      break;
                                    } while (!paramString.equals("mp4"));
                                    i = 13;
                                    break;
                                  } while (!paramString.equals("mp3"));
                                  i = 12;
                                  break;
                                } while (!paramString.equals("mjs"));
                                i = 11;
                                break;
                              } while (!paramString.equals("mht"));
                              i = 10;
                              break;
                            } while (!paramString.equals("m4v"));
                            i = 9;
                            break;
                          } while (!paramString.equals("m4a"));
                          i = 8;
                          break;
                        } while (!paramString.equals("jpg"));
                        i = 7;
                        break;
                      } while (!paramString.equals("ico"));
                      i = 6;
                      break;
                    } while (!paramString.equals("htm"));
                    i = 5;
                    break;
                  } while (!paramString.equals("gif"));
                  i = 4;
                  break;
                } while (!paramString.equals("css"));
                i = 3;
                break;
              } while (!paramString.equals("bmp"));
              i = 2;
              break;
            } while (!paramString.equals("js"));
            i = 1;
            break;
          } while (!paramString.equals("gz"));
          i = 0;
          switch (i)
          {
          default: 
            paramString = str1;
            break;
          case 43: 
            paramString = "application/font-woff";
            break;
          case 42: 
            paramString = "image/webp";
            break;
          case 41: 
            paramString = "video/webm";
            break;
          case 40: 
            paramString = "application/wasm";
            break;
          case 34: 
            paramString = "application/json";
            break;
          case 30: 
            paramString = "audio/flac";
            break;
          case 29: 
            paramString = "image/apng";
            break;
          case 28: 
            paramString = "application/zip";
            break;
          case 27: 
            paramString = "text/xml";
            break;
          case 26: 
          case 44: 
          case 49: 
            paramString = "application/xhtml+xml";
            break;
          case 25: 
            paramString = "audio/wav";
            break;
          case 24: 
          case 39: 
            paramString = "image/tiff";
            break;
          case 22: 
          case 38: 
            paramString = "image/svg+xml";
            break;
          case 21: 
            paramString = "image/png";
            break;
          case 19: 
            paramString = "application/pdf";
            break;
          case 17: 
          case 18: 
            paramString = "video/ogg";
            break;
          case 15: 
          case 16: 
          case 36: 
            paramString = "audio/ogg";
            break;
          case 14: 
          case 35: 
            paramString = "video/mpeg";
            break;
          case 12: 
            paramString = "audio/mpeg";
            break;
          case 10: 
          case 46: 
            paramString = "multipart/related";
            break;
          case 9: 
          case 13: 
            paramString = "video/mp4";
            break;
          case 8: 
            paramString = "audio/x-m4a";
            break;
          case 7: 
          case 20: 
          case 32: 
          case 33: 
          case 47: 
            paramString = "image/jpeg";
            break;
          case 6: 
            paramString = "image/x-icon";
            break;
          case 5: 
          case 31: 
          case 37: 
          case 45: 
          case 48: 
            paramString = "text/html";
            break;
          case 4: 
            paramString = "image/gif";
            break;
          case 3: 
            paramString = "text/css";
            break;
          case 2: 
            paramString = "image/bmp";
            break;
          case 1: 
          case 11: 
            paramString = "text/javascript";
            break;
          case 0: 
          case 23: 
            paramString = "application/gzip";
          }
        }
      }
    }
    str1 = paramString;
    if (paramString == null) {
      str1 = "text/plain";
    }
    return str1;
  }
  
  public final InputStream c(String paramString)
  {
    String str1 = paramString;
    if (paramString.length() > 1)
    {
      str1 = paramString;
      if (paramString.charAt(0) == '/') {
        str1 = paramString.substring(1);
      }
    }
    paramString = str1.split("/", -1);
    if (paramString.length == 2)
    {
      String str2 = paramString[0];
      Object localObject = paramString[1];
      int i = ((String)localObject).lastIndexOf('.');
      paramString = (String)localObject;
      if (i != -1) {
        paramString = ((String)localObject).substring(0, i);
      }
      localObject = a.getPackageName();
      int j = a.getResources().getIdentifier(paramString, str2, (String)localObject);
      paramString = new TypedValue();
      a.getResources().getValue(j, paramString, true);
      i = type;
      if (i == 3)
      {
        localObject = a.getResources().openRawResource(j);
        paramString = (String)localObject;
        if (str1.endsWith(".svgz")) {
          paramString = new GZIPInputStream((InputStream)localObject);
        }
        return paramString;
      }
      throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", new Object[] { str1, Integer.valueOf(i) }));
    }
    throw new IllegalArgumentException(g.d("Incorrect resource path: ", str1));
  }
}

/* Location:
 * Qualified Name:     d2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */