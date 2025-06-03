package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import javax.annotation.Nullable;
import z2;

public class ApkSoSource
  extends ExtractFromZipSoSource
{
  private static final byte APK_SO_SOURCE_SIGNATURE_VERSION = 2;
  private static final byte LIBS_DIR_DOESNT_EXIST = 1;
  private static final byte LIBS_DIR_DONT_CARE = 0;
  private static final byte LIBS_DIR_SNAPSHOT = 2;
  public static final int PREFER_ANDROID_LIBS_DIRECTORY = 1;
  private static final String TAG = "ApkSoSource";
  private final Map<String, String> mExtractLogs = new HashMap();
  private final int mFlags;
  
  public ApkSoSource(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, new File(getApplicationInfosourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
    mFlags = paramInt;
  }
  
  public byte[] getDepsBlock()
    throws IOException
  {
    Object localObject1 = mZipFileName.getCanonicalFile();
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeByte((byte)2);
      localParcel.writeString(((File)localObject1).getPath());
      localParcel.writeLong(((File)localObject1).lastModified());
      localParcel.writeInt(SysUtil.getAppVersionCode(mContext));
      if ((mFlags & 0x1) == 0)
      {
        localParcel.writeByte((byte)0);
        localObject1 = localParcel.marshall();
        return (byte[])localObject1;
      }
      String str = mContext.getApplicationInfo().nativeLibraryDir;
      if (str == null)
      {
        localParcel.writeByte((byte)1);
        localObject1 = localParcel.marshall();
        return (byte[])localObject1;
      }
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(str);
      localObject1 = ((File)localObject1).getCanonicalFile();
      if (!((File)localObject1).exists())
      {
        localParcel.writeByte((byte)1);
        localObject1 = localParcel.marshall();
        return (byte[])localObject1;
      }
      localParcel.writeByte((byte)2);
      localParcel.writeString(((File)localObject1).getPath());
      localParcel.writeLong(((File)localObject1).lastModified());
      localObject1 = localParcel.marshall();
      return (byte[])localObject1;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  @Nullable
  public String getExtractLogs(String paramString)
  {
    return (String)mExtractLogs.get(paramString);
  }
  
  public UnpackingSoSource.Unpacker makeUnpacker()
    throws IOException
  {
    return new ApkUnpacker(this);
  }
  
  public class ApkUnpacker
    extends ExtractFromZipSoSource.ZipUnpacker
  {
    private final int mFlags = ApkSoSource.access$000(ApkSoSource.this);
    private File mLibDir = new File(mContext.getApplicationInfo().nativeLibraryDir);
    
    public ApkUnpacker(ExtractFromZipSoSource paramExtractFromZipSoSource)
      throws IOException
    {
      super(paramExtractFromZipSoSource);
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
      ApkSoSource.access$100(ApkSoSource.this).put(paramString, paramZipEntry);
      Log.d("ApkSoSource", paramZipEntry);
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ApkSoSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */