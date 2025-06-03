package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import n1.a;
import n1.e;

public final class b
{
  public final AssetManager a;
  public final Executor b;
  public final c.c c;
  public final byte[] d;
  public final File e;
  public final String f;
  public boolean g = false;
  public n1.b[] h;
  public byte[] i;
  
  public b(AssetManager paramAssetManager, m1.b paramb, c.c paramc, String paramString, File paramFile)
  {
    a = paramAssetManager;
    b = paramb;
    c = paramc;
    f = paramString;
    e = paramFile;
    int j = Build.VERSION.SDK_INT;
    if ((j >= 24) && (j <= 34)) {
      switch (j)
      {
      default: 
        break;
      case 31: 
      case 32: 
      case 33: 
      case 34: 
        paramAssetManager = e.a;
        break;
      case 28: 
      case 29: 
      case 30: 
        paramAssetManager = e.b;
        break;
      case 27: 
        paramAssetManager = e.c;
        break;
      case 26: 
        paramAssetManager = e.d;
        break;
      case 24: 
      case 25: 
        paramAssetManager = e.e;
        break;
      }
    }
    paramAssetManager = null;
    d = paramAssetManager;
  }
  
  public final FileInputStream a(AssetManager paramAssetManager, String paramString)
  {
    try
    {
      paramAssetManager = paramAssetManager.openFd(paramString).createInputStream();
    }
    catch (FileNotFoundException paramAssetManager)
    {
      paramAssetManager = paramAssetManager.getMessage();
      if ((paramAssetManager != null) && (paramAssetManager.contains("compressed"))) {
        c.a();
      }
      paramAssetManager = null;
    }
    return paramAssetManager;
  }
  
  public final void b(int paramInt, Serializable paramSerializable)
  {
    b.execute(new a(this, paramInt, paramSerializable, 0));
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */