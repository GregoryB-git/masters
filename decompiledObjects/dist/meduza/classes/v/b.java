package v;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import g;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class b
  extends ContentProvider
{
  private static final String ATTR_NAME = "name";
  private static final String ATTR_PATH = "path";
  private static final String[] COLUMNS = { "_display_name", "_size" };
  private static final File DEVICE_ROOT = new File("/");
  private static final String DISPLAYNAME_FIELD = "displayName";
  private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
  private static final String TAG_CACHE_PATH = "cache-path";
  private static final String TAG_EXTERNAL = "external-path";
  private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
  private static final String TAG_EXTERNAL_FILES = "external-files-path";
  private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
  private static final String TAG_FILES_PATH = "files-path";
  private static final String TAG_ROOT_PATH = "root-path";
  private static final HashMap<String, b> sCache = new HashMap();
  private String mAuthority;
  private b mLocalPathStrategy;
  private final Object mLock = new Object();
  private final int mResourceId;
  
  public b()
  {
    this(0);
  }
  
  public b(int paramInt)
  {
    mResourceId = paramInt;
  }
  
  private static File buildPath(File paramFile, String... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    for (File localFile = paramFile; j < i; localFile = paramFile)
    {
      String str = paramVarArgs[j];
      paramFile = localFile;
      if (str != null) {
        paramFile = new File(localFile, str);
      }
      j++;
    }
    return localFile;
  }
  
  private static Object[] copyOf(Object[] paramArrayOfObject, int paramInt)
  {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }
  
  private static String[] copyOf(String[] paramArrayOfString, int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }
  
  public static XmlResourceParser getFileProviderPathsMetaData(Context paramContext, String paramString, ProviderInfo paramProviderInfo, int paramInt)
  {
    if (paramProviderInfo != null)
    {
      if ((metaData == null) && (paramInt != 0))
      {
        paramString = new Bundle(1);
        metaData = paramString;
        paramString.putInt("android.support.FILE_PROVIDER_PATHS", paramInt);
      }
      paramContext = paramProviderInfo.loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
      if (paramContext != null) {
        return paramContext;
      }
      throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }
    throw new IllegalArgumentException(g.d("Couldn't find meta-data for provider with authority ", paramString));
  }
  
  private b getLocalPathStrategy()
  {
    synchronized (mLock)
    {
      if (mAuthority != null)
      {
        if (mLocalPathStrategy == null) {
          mLocalPathStrategy = getPathStrategy(getContext(), mAuthority, mResourceId);
        }
        localObject2 = mLocalPathStrategy;
        return (b)localObject2;
      }
      Object localObject2 = new java/lang/NullPointerException;
      ((NullPointerException)localObject2).<init>("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
      throw ((Throwable)localObject2);
    }
  }
  
  private static b getPathStrategy(Context paramContext, String paramString, int paramInt)
  {
    synchronized (sCache)
    {
      b localb1 = (b)???.get(paramString);
      b localb2 = localb1;
      if (localb1 == null) {
        try
        {
          localb2 = parsePathStrategy(paramContext, paramString, paramInt);
          ???.put(paramString, localb2);
        }
        catch (XmlPullParserException paramString)
        {
          paramContext = new java/lang/IllegalArgumentException;
          paramContext.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramString);
          throw paramContext;
        }
        catch (IOException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
          throw paramString;
        }
      }
      return localb2;
    }
  }
  
  public static Uri getUriForFile(Context paramContext, String paramString, File paramFile)
  {
    return getPathStrategy(paramContext, paramString, 0).b(paramFile);
  }
  
  public static Uri getUriForFile(Context paramContext, String paramString1, File paramFile, String paramString2)
  {
    return getUriForFile(paramContext, paramString1, paramFile).buildUpon().appendQueryParameter("displayName", paramString2).build();
  }
  
  private static int modeToMode(String paramString)
  {
    int i;
    if ("r".equals(paramString)) {
      i = 268435456;
    } else if ((!"w".equals(paramString)) && (!"wt".equals(paramString)))
    {
      if ("wa".equals(paramString)) {
        i = 704643072;
      } else if ("rw".equals(paramString)) {
        i = 939524096;
      } else if ("rwt".equals(paramString)) {
        i = 1006632960;
      } else {
        throw new IllegalArgumentException(g.d("Invalid mode: ", paramString));
      }
    }
    else {
      i = 738197504;
    }
    return i;
  }
  
  private static b parsePathStrategy(Context paramContext, String paramString, int paramInt)
  {
    c localc = new c(paramString);
    XmlResourceParser localXmlResourceParser = getFileProviderPathsMetaData(paramContext, paramString, paramContext.getPackageManager().resolveContentProvider(paramString, 128), paramInt);
    for (;;)
    {
      paramInt = localXmlResourceParser.next();
      if (paramInt == 1) {
        return localc;
      }
      if (paramInt == 2)
      {
        Object localObject = localXmlResourceParser.getName();
        File localFile = null;
        String str1 = localXmlResourceParser.getAttributeValue(null, "name");
        String str2 = localXmlResourceParser.getAttributeValue(null, "path");
        if ("root-path".equals(localObject))
        {
          paramString = DEVICE_ROOT;
        }
        else if ("files-path".equals(localObject))
        {
          paramString = paramContext.getFilesDir();
        }
        else if ("cache-path".equals(localObject))
        {
          paramString = paramContext.getCacheDir();
        }
        else if ("external-path".equals(localObject))
        {
          paramString = Environment.getExternalStorageDirectory();
        }
        else if ("external-files-path".equals(localObject))
        {
          localObject = a.getExternalFilesDirs(paramContext, null);
          paramString = localFile;
          if (localObject.length > 0) {
            paramString = localObject[0];
          }
        }
        else if ("external-cache-path".equals(localObject))
        {
          localObject = a.getExternalCacheDirs(paramContext);
          paramString = localFile;
          if (localObject.length > 0) {
            paramString = localObject[0];
          }
        }
        else
        {
          paramString = localFile;
          if ("external-media-path".equals(localObject))
          {
            localObject = a.a(paramContext);
            paramString = localFile;
            if (localObject.length > 0) {
              paramString = localObject[0];
            }
          }
        }
        if (paramString != null)
        {
          paramString = buildPath(paramString, new String[] { str2 });
          if (!TextUtils.isEmpty(str1)) {
            try
            {
              localFile = paramString.getCanonicalFile();
              b.put(str1, localFile);
            }
            catch (IOException localIOException)
            {
              paramContext = new StringBuilder();
              paramContext.append("Failed to resolve canonical path for ");
              paramContext.append(paramString);
              throw new IllegalArgumentException(paramContext.toString(), localIOException);
            }
          }
        }
      }
    }
    throw new IllegalArgumentException("Name must not be empty");
    return localc;
  }
  
  private static String removeTrailingSlash(String paramString)
  {
    String str = paramString;
    if (paramString.length() > 0)
    {
      str = paramString;
      if (paramString.charAt(paramString.length() - 1) == '/') {
        str = paramString.substring(0, paramString.length() - 1);
      }
    }
    return str;
  }
  
  public void attachInfo(Context arg1, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(???, paramProviderInfo);
    if (!exported)
    {
      if (grantUriPermissions)
      {
        paramProviderInfo = authority.split(";")[0];
        synchronized (mLock)
        {
          mAuthority = paramProviderInfo;
          synchronized (sCache)
          {
            ???.remove(paramProviderInfo);
            return;
          }
        }
      }
      throw new SecurityException("Provider must grant uri permissions");
    }
    throw new SecurityException("Provider must not be exported");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return getLocalPathStrategy().a(paramUri).delete();
  }
  
  public String getType(Uri paramUri)
  {
    paramUri = getLocalPathStrategy().a(paramUri);
    int i = paramUri.getName().lastIndexOf('.');
    if (i >= 0)
    {
      paramUri = paramUri.getName().substring(i + 1);
      paramUri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramUri);
      if (paramUri != null) {
        return paramUri;
      }
    }
    return "application/octet-stream";
  }
  
  public String getTypeAnonymous(Uri paramUri)
  {
    return "application/octet-stream";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    return ParcelFileDescriptor.open(getLocalPathStrategy().a(paramUri), modeToMode(paramString));
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString2 = getLocalPathStrategy().a(paramUri);
    paramString1 = paramUri.getQueryParameter("displayName");
    paramUri = paramArrayOfString1;
    if (paramArrayOfString1 == null) {
      paramUri = COLUMNS;
    }
    String[] arrayOfString = new String[paramUri.length];
    paramString2 = new Object[paramUri.length];
    int i = paramUri.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      paramArrayOfString1 = paramUri[j];
      if ("_display_name".equals(paramArrayOfString1))
      {
        arrayOfString[k] = "_display_name";
        m = k + 1;
        if (paramString1 == null) {
          paramArrayOfString1 = paramArrayOfString2.getName();
        } else {
          paramArrayOfString1 = paramString1;
        }
        paramString2[k] = paramArrayOfString1;
        k = m;
      }
      else
      {
        m = k;
        if (!"_size".equals(paramArrayOfString1)) {
          break label162;
        }
        arrayOfString[k] = "_size";
        m = k + 1;
        paramString2[k] = Long.valueOf(paramArrayOfString2.length());
        k = m;
      }
      m = k;
      label162:
      j++;
    }
    paramUri = copyOf(arrayOfString, k);
    paramArrayOfString1 = copyOf(paramString2, k);
    paramUri = new MatrixCursor(paramUri, 1);
    paramUri.addRow(paramArrayOfString1);
    return paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("No external updates");
  }
  
  public static final class a
  {
    public static File[] a(Context paramContext)
    {
      return paramContext.getExternalMediaDirs();
    }
  }
  
  public static abstract interface b
  {
    public abstract File a(Uri paramUri);
    
    public abstract Uri b(File paramFile);
  }
  
  public static final class c
    implements b.b
  {
    public final String a;
    public final HashMap<String, File> b = new HashMap();
    
    public c(String paramString)
    {
      a = paramString;
    }
    
    public static boolean c(String paramString1, String paramString2)
    {
      paramString1 = b.access$000(paramString1);
      String str = b.access$000(paramString2);
      if (!paramString1.equals(str))
      {
        paramString2 = new StringBuilder();
        paramString2.append(str);
        paramString2.append('/');
        if (!paramString1.startsWith(paramString2.toString())) {
          return false;
        }
      }
      boolean bool = true;
      return bool;
    }
    
    public final File a(Uri paramUri)
    {
      Object localObject1 = paramUri.getEncodedPath();
      int i = ((String)localObject1).indexOf('/', 1);
      Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
      localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
      localObject2 = (File)b.get(localObject2);
      if (localObject2 != null)
      {
        paramUri = new File((File)localObject2, (String)localObject1);
        try
        {
          localObject1 = paramUri.getCanonicalFile();
          if (c(((File)localObject1).getPath(), ((File)localObject2).getPath())) {
            return (File)localObject1;
          }
          throw new SecurityException("Resolved path jumped beyond configured root");
        }
        catch (IOException localIOException)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to resolve canonical path for ");
          localStringBuilder.append(paramUri);
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unable to find configured root for ");
      localStringBuilder.append(paramUri);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public final Uri b(File paramFile)
    {
      try
      {
        String str1 = paramFile.getCanonicalPath();
        paramFile = null;
        Iterator localIterator = b.entrySet().iterator();
        Object localObject;
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          String str2 = ((File)((Map.Entry)localObject).getValue()).getPath();
          if ((c(str1, str2)) && ((paramFile == null) || (str2.length() > ((File)paramFile.getValue()).getPath().length()))) {
            paramFile = (File)localObject;
          }
        }
        if (paramFile != null)
        {
          localObject = ((File)paramFile.getValue()).getPath();
          boolean bool = ((String)localObject).endsWith("/");
          int i = ((String)localObject).length();
          if (!bool) {
            i++;
          }
          str1 = str1.substring(i);
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(Uri.encode((String)paramFile.getKey()));
          ((StringBuilder)localObject).append('/');
          ((StringBuilder)localObject).append(Uri.encode(str1, "/"));
          paramFile = ((StringBuilder)localObject).toString();
          return new Uri.Builder().scheme("content").authority(a).encodedPath(paramFile).build();
        }
        throw new IllegalArgumentException(g.d("Failed to find configured root that contains ", str1));
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to resolve canonical path for ");
        localStringBuilder.append(paramFile);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */