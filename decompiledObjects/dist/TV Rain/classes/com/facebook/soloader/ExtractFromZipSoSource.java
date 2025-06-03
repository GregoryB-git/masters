package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;

public class ExtractFromZipSoSource
  extends UnpackingSoSource
{
  public final File mZipFileName;
  public final String mZipSearchPattern;
  
  public ExtractFromZipSoSource(Context paramContext, String paramString1, File paramFile, String paramString2)
  {
    super(paramContext, paramString1);
    mZipFileName = paramFile;
    mZipSearchPattern = paramString2;
  }
  
  @Nullable
  public String getExtractLogs(String paramString)
  {
    return "";
  }
  
  public UnpackingSoSource.Unpacker makeUnpacker()
    throws IOException
  {
    return new ZipUnpacker(this);
  }
  
  public static final class ZipDso
    extends UnpackingSoSource.Dso
    implements Comparable
  {
    public final int abiScore;
    public final ZipEntry backingEntry;
    
    public ZipDso(String paramString, ZipEntry paramZipEntry, int paramInt)
    {
      super(makePseudoHash(paramZipEntry));
      backingEntry = paramZipEntry;
      abiScore = paramInt;
    }
    
    private static String makePseudoHash(ZipEntry paramZipEntry)
    {
      return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[] { paramZipEntry.getName(), Long.valueOf(paramZipEntry.getSize()), Long.valueOf(paramZipEntry.getCompressedSize()), Long.valueOf(paramZipEntry.getCrc()) });
    }
    
    public int compareTo(Object paramObject)
    {
      return name.compareTo(name);
    }
  }
  
  public class ZipUnpacker
    extends UnpackingSoSource.Unpacker
  {
    @Nullable
    private ExtractFromZipSoSource.ZipDso[] mDsos;
    private final UnpackingSoSource mSoSource;
    private final ZipFile mZipFile = new ZipFile(mZipFileName);
    
    public ZipUnpacker(UnpackingSoSource paramUnpackingSoSource)
      throws IOException
    {
      mSoSource = paramUnpackingSoSource;
    }
    
    public void close()
      throws IOException
    {
      mZipFile.close();
    }
    
    public final ExtractFromZipSoSource.ZipDso[] ensureDsos()
    {
      if (mDsos == null)
      {
        LinkedHashSet localLinkedHashSet = new LinkedHashSet();
        HashMap localHashMap = new HashMap();
        Pattern localPattern = Pattern.compile(mZipSearchPattern);
        Object localObject1 = SysUtil.getSupportedAbis();
        Enumeration localEnumeration = mZipFile.entries();
        while (localEnumeration.hasMoreElements())
        {
          localObject2 = (ZipEntry)localEnumeration.nextElement();
          Object localObject3 = localPattern.matcher(((ZipEntry)localObject2).getName());
          if (((Matcher)localObject3).matches())
          {
            Object localObject4 = ((Matcher)localObject3).group(1);
            localObject3 = ((Matcher)localObject3).group(2);
            i = SysUtil.findAbiScore((String[])localObject1, (String)localObject4);
            if (i >= 0)
            {
              localLinkedHashSet.add(localObject4);
              localObject4 = (ExtractFromZipSoSource.ZipDso)localHashMap.get(localObject3);
              if ((localObject4 == null) || (i < abiScore)) {
                localHashMap.put(localObject3, new ExtractFromZipSoSource.ZipDso((String)localObject3, (ZipEntry)localObject2, i));
              }
            }
          }
        }
        mSoSource.setSoSourceAbis((String[])localLinkedHashSet.toArray(new String[localLinkedHashSet.size()]));
        localObject1 = (ExtractFromZipSoSource.ZipDso[])localHashMap.values().toArray(new ExtractFromZipSoSource.ZipDso[localHashMap.size()]);
        Arrays.sort((Object[])localObject1);
        int j = 0;
        int i = 0;
        int k = i;
        while (i < localObject1.length)
        {
          localLinkedHashSet = localObject1[i];
          if (shouldExtract(backingEntry, name)) {
            k++;
          } else {
            localObject1[i] = null;
          }
          i++;
        }
        Object localObject2 = new ExtractFromZipSoSource.ZipDso[k];
        i = 0;
        k = j;
        while (k < localObject1.length)
        {
          localLinkedHashSet = localObject1[k];
          j = i;
          if (localLinkedHashSet != null)
          {
            localObject2[i] = localLinkedHashSet;
            j = i + 1;
          }
          k++;
          i = j;
        }
        mDsos = ((ExtractFromZipSoSource.ZipDso[])localObject2);
      }
      return mDsos;
    }
    
    public final UnpackingSoSource.DsoManifest getDsoManifest()
      throws IOException
    {
      return new UnpackingSoSource.DsoManifest(ensureDsos());
    }
    
    public final UnpackingSoSource.InputDsoIterator openDsoIterator()
      throws IOException
    {
      return new ZipBackedInputDsoIterator(null);
    }
    
    public boolean shouldExtract(ZipEntry paramZipEntry, String paramString)
    {
      return true;
    }
    
    public final class ZipBackedInputDsoIterator
      extends UnpackingSoSource.InputDsoIterator
    {
      private int mCurrentDso;
      
      private ZipBackedInputDsoIterator() {}
      
      public boolean hasNext()
      {
        ensureDsos();
        boolean bool;
        if (mCurrentDso < ExtractFromZipSoSource.ZipUnpacker.access$100(ExtractFromZipSoSource.ZipUnpacker.this).length) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public UnpackingSoSource.InputDso next()
        throws IOException
      {
        ensureDsos();
        Object localObject1 = ExtractFromZipSoSource.ZipUnpacker.access$100(ExtractFromZipSoSource.ZipUnpacker.this);
        int i = mCurrentDso;
        mCurrentDso = (i + 1);
        Object localObject2 = localObject1[i];
        localObject1 = ExtractFromZipSoSource.ZipUnpacker.access$200(ExtractFromZipSoSource.ZipUnpacker.this).getInputStream(backingEntry);
        try
        {
          localObject2 = new UnpackingSoSource.InputDso((UnpackingSoSource.Dso)localObject2, (InputStream)localObject1);
          return (UnpackingSoSource.InputDso)localObject2;
        }
        finally
        {
          if (localObject1 != null) {
            ((InputStream)localObject1).close();
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExtractFromZipSoSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */