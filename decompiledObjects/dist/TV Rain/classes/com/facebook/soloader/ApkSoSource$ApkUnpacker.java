package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import z2;

public class ApkSoSource$ApkUnpacker
  extends ExtractFromZipSoSource.ZipUnpacker
{
  private final int mFlags;
  private File mLibDir;
  
  public ApkSoSource$ApkUnpacker(ApkSoSource paramApkSoSource, ExtractFromZipSoSource paramExtractFromZipSoSource)
    throws IOException
  {
    super(paramApkSoSource, paramExtractFromZipSoSource);
    mLibDir = new File(mContext.getApplicationInfo().nativeLibraryDir);
    mFlags = ApkSoSource.access$000(paramApkSoSource);
  }
  
  public boolean shouldExtract(ZipEntry paramZipEntry, String paramString)
  {
    String str = paramZipEntry.getName();
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0)
    {
      paramZipEntry = z2.p("allowing consideration of ", str, ": self-extraction preferred");
    }
    else
    {
      File localFile = new File(mLibDir, paramString);
      if (!localFile.isFile())
      {
        paramZipEntry = String.format("allowing considering of %s: %s not in system lib dir", new Object[] { str, paramString });
      }
      else
      {
        long l1 = localFile.length();
        long l2 = paramZipEntry.getSize();
        if (l1 != l2)
        {
          paramZipEntry = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[] { localFile, Long.valueOf(l1), Long.valueOf(l2) });
        }
        else
        {
          paramZipEntry = z2.p("not allowing consideration of ", str, ": deferring to libdir");
          bool = false;
        }
      }
    }
    ApkSoSource.access$100(this$0).put(paramString, paramZipEntry);
    Log.d("ApkSoSource", paramZipEntry);
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ApkSoSource.ApkUnpacker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */