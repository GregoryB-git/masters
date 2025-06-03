package androidx.core.content;

import android.annotation.SuppressLint;
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
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

public class FileProvider
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
  @GuardedBy("sCache")
  private static final HashMap<String, PathStrategy> sCache = new HashMap();
  private int mResourceId;
  private PathStrategy mStrategy;
  
  public FileProvider()
  {
    mResourceId = 0;
  }
  
  public FileProvider(@XmlRes int paramInt)
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
  
  @VisibleForTesting
  public static XmlResourceParser getFileProviderPathsMetaData(Context paramContext, String paramString, @Nullable ProviderInfo paramProviderInfo, int paramInt)
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
    throw new IllegalArgumentException(z2.o("Couldn't find meta-data for provider with authority ", paramString));
  }
  
  private static PathStrategy getPathStrategy(Context paramContext, String paramString, int paramInt)
  {
    synchronized (sCache)
    {
      PathStrategy localPathStrategy1 = (PathStrategy)???.get(paramString);
      PathStrategy localPathStrategy2 = localPathStrategy1;
      if (localPathStrategy1 == null) {
        try
        {
          localPathStrategy2 = parsePathStrategy(paramContext, paramString, paramInt);
          ???.put(paramString, localPathStrategy2);
        }
        catch (XmlPullParserException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
          throw paramString;
        }
        catch (IOException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
          throw paramString;
        }
      }
      return localPathStrategy2;
    }
  }
  
  public static Uri getUriForFile(@NonNull Context paramContext, @NonNull String paramString, @NonNull File paramFile)
  {
    return getPathStrategy(paramContext, paramString, 0).getUriForFile(paramFile);
  }
  
  @SuppressLint({"StreamFiles"})
  @NonNull
  public static Uri getUriForFile(@NonNull Context paramContext, @NonNull String paramString1, @NonNull File paramFile, @NonNull String paramString2)
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
        throw new IllegalArgumentException(z2.o("Invalid mode: ", paramString));
      }
    }
    else {
      i = 738197504;
    }
    return i;
  }
  
  private static PathStrategy parsePathStrategy(Context paramContext, String paramString, int paramInt)
    throws IOException, XmlPullParserException
  {
    SimplePathStrategy localSimplePathStrategy = new SimplePathStrategy(paramString);
    XmlResourceParser localXmlResourceParser = getFileProviderPathsMetaData(paramContext, paramString, paramContext.getPackageManager().resolveContentProvider(paramString, 128), paramInt);
    for (;;)
    {
      paramInt = localXmlResourceParser.next();
      if (paramInt == 1) {
        break;
      }
      if (paramInt == 2)
      {
        Object localObject1 = localXmlResourceParser.getName();
        Object localObject2 = null;
        String str1 = localXmlResourceParser.getAttributeValue(null, "name");
        String str2 = localXmlResourceParser.getAttributeValue(null, "path");
        if ("root-path".equals(localObject1))
        {
          paramString = DEVICE_ROOT;
        }
        else if ("files-path".equals(localObject1))
        {
          paramString = paramContext.getFilesDir();
        }
        else if ("cache-path".equals(localObject1))
        {
          paramString = paramContext.getCacheDir();
        }
        else if ("external-path".equals(localObject1))
        {
          paramString = Environment.getExternalStorageDirectory();
        }
        else if ("external-files-path".equals(localObject1))
        {
          localObject1 = ContextCompat.getExternalFilesDirs(paramContext, null);
          paramString = (String)localObject2;
          if (localObject1.length > 0) {
            paramString = localObject1[0];
          }
        }
        else if ("external-cache-path".equals(localObject1))
        {
          localObject1 = ContextCompat.getExternalCacheDirs(paramContext);
          paramString = (String)localObject2;
          if (localObject1.length > 0) {
            paramString = localObject1[0];
          }
        }
        else
        {
          paramString = (String)localObject2;
          if ("external-media-path".equals(localObject1))
          {
            localObject1 = Api21Impl.getExternalMediaDirs(paramContext);
            paramString = (String)localObject2;
            if (localObject1.length > 0) {
              paramString = localObject1[0];
            }
          }
        }
        if (paramString != null) {
          localSimplePathStrategy.addRoot(str1, buildPath(paramString, new String[] { str2 }));
        }
      }
    }
    return localSimplePathStrategy;
  }
  
  public void attachInfo(@NonNull Context paramContext, @NonNull ProviderInfo arg2)
  {
    super.attachInfo(paramContext, ???);
    if (!exported)
    {
      if (grantUriPermissions)
      {
        String str = authority.split(";")[0];
        synchronized (sCache)
        {
          ???.remove(str);
          mStrategy = getPathStrategy(paramContext, str, mResourceId);
          return;
        }
      }
      throw new SecurityException("Provider must grant uri permissions");
    }
    throw new SecurityException("Provider must not be exported");
  }
  
  public int delete(@NonNull Uri paramUri, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    return mStrategy.getFileForUri(paramUri).delete();
  }
  
  @Nullable
  public String getType(@NonNull Uri paramUri)
  {
    paramUri = mStrategy.getFileForUri(paramUri);
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
  
  public Uri insert(@NonNull Uri paramUri, @NonNull ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  @SuppressLint({"UnknownNullness"})
  public ParcelFileDescriptor openFile(@NonNull Uri paramUri, @NonNull String paramString)
    throws FileNotFoundException
  {
    return ParcelFileDescriptor.open(mStrategy.getFileForUri(paramUri), modeToMode(paramString));
  }
  
  @NonNull
  public Cursor query(@NonNull Uri paramUri, @Nullable String[] paramArrayOfString1, @Nullable String paramString1, @Nullable String[] paramArrayOfString2, @Nullable String paramString2)
  {
    paramArrayOfString2 = mStrategy.getFileForUri(paramUri);
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
  
  public int update(@NonNull Uri paramUri, @NonNull ContentValues paramContentValues, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("No external updates");
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static File[] getExternalMediaDirs(Context paramContext)
    {
      return paramContext.getExternalMediaDirs();
    }
  }
  
  public static abstract interface PathStrategy
  {
    public abstract File getFileForUri(Uri paramUri);
    
    public abstract Uri getUriForFile(File paramFile);
  }
  
  public static class SimplePathStrategy
    implements FileProvider.PathStrategy
  {
    private final String mAuthority;
    private final HashMap<String, File> mRoots = new HashMap();
    
    public SimplePathStrategy(String paramString)
    {
      mAuthority = paramString;
    }
    
    public void addRoot(String paramString, File paramFile)
    {
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          File localFile = paramFile.getCanonicalFile();
          mRoots.put(paramString, localFile);
          return;
        }
        catch (IOException localIOException)
        {
          paramString = new StringBuilder();
          paramString.append("Failed to resolve canonical path for ");
          paramString.append(paramFile);
          throw new IllegalArgumentException(paramString.toString(), localIOException);
        }
      }
      throw new IllegalArgumentException("Name must not be empty");
    }
    
    public File getFileForUri(Uri paramUri)
    {
      Object localObject1 = paramUri.getEncodedPath();
      int i = ((String)localObject1).indexOf('/', 1);
      Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
      localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
      localObject2 = (File)mRoots.get(localObject2);
      if (localObject2 != null)
      {
        paramUri = new File((File)localObject2, (String)localObject1);
        try
        {
          localObject1 = paramUri.getCanonicalFile();
          if (((File)localObject1).getPath().startsWith(((File)localObject2).getPath())) {
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
    
    public Uri getUriForFile(File paramFile)
    {
      try
      {
        Object localObject1 = paramFile.getCanonicalPath();
        paramFile = null;
        Iterator localIterator = mRoots.entrySet().iterator();
        Object localObject2;
        while (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          String str = ((File)((Map.Entry)localObject2).getValue()).getPath();
          if ((((String)localObject1).startsWith(str)) && ((paramFile == null) || (str.length() > ((File)paramFile.getValue()).getPath().length()))) {
            paramFile = (File)localObject2;
          }
        }
        if (paramFile != null)
        {
          localObject2 = ((File)paramFile.getValue()).getPath();
          if (((String)localObject2).endsWith("/")) {
            localObject2 = ((String)localObject1).substring(((String)localObject2).length());
          } else {
            localObject2 = ((String)localObject1).substring(((String)localObject2).length() + 1);
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(Uri.encode((String)paramFile.getKey()));
          ((StringBuilder)localObject1).append('/');
          ((StringBuilder)localObject1).append(Uri.encode((String)localObject2, "/"));
          paramFile = ((StringBuilder)localObject1).toString();
          return new Uri.Builder().scheme("content").authority(mAuthority).encodedPath(paramFile).build();
        }
        throw new IllegalArgumentException(z2.o("Failed to find configured root that contains ", (String)localObject1));
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
 * Qualified Name:     androidx.core.content.FileProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */