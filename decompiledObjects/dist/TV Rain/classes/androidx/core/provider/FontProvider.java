package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z2;

class FontProvider
{
  private static final Comparator<byte[]> sByteArrayComparator = new a();
  
  private static List<byte[]> convertToByteArrayList(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfSignature.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(paramArrayOfSignature[j].toByteArray());
    }
    return localArrayList;
  }
  
  private static boolean equalsByteArrayList(List<byte[]> paramList1, List<byte[]> paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    for (int i = 0; i < paramList1.size(); i++) {
      if (!Arrays.equals((byte[])paramList1.get(i), (byte[])paramList2.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  private static List<List<byte[]>> getCertificates(FontRequest paramFontRequest, Resources paramResources)
  {
    if (paramFontRequest.getCertificates() != null) {
      return paramFontRequest.getCertificates();
    }
    return FontResourcesParserCompat.readCerts(paramResources, paramFontRequest.getCertificatesArrayResId());
  }
  
  @NonNull
  public static FontsContractCompat.FontFamilyResult getFontFamilyResult(@NonNull Context paramContext, @NonNull FontRequest paramFontRequest, @Nullable CancellationSignal paramCancellationSignal)
    throws PackageManager.NameNotFoundException
  {
    ProviderInfo localProviderInfo = getProvider(paramContext.getPackageManager(), paramFontRequest, paramContext.getResources());
    if (localProviderInfo == null) {
      return FontsContractCompat.FontFamilyResult.create(1, null);
    }
    return FontsContractCompat.FontFamilyResult.create(0, query(paramContext, paramFontRequest, authority, paramCancellationSignal));
  }
  
  @Nullable
  @VisibleForTesting
  public static ProviderInfo getProvider(@NonNull PackageManager paramPackageManager, @NonNull FontRequest paramFontRequest, @Nullable Resources paramResources)
    throws PackageManager.NameNotFoundException
  {
    String str = paramFontRequest.getProviderAuthority();
    int i = 0;
    ProviderInfo localProviderInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (localProviderInfo != null)
    {
      if (packageName.equals(paramFontRequest.getProviderPackage()))
      {
        paramPackageManager = convertToByteArrayList(getPackageInfopackageName, 64).signatures);
        Collections.sort(paramPackageManager, sByteArrayComparator);
        paramResources = getCertificates(paramFontRequest, paramResources);
        while (i < paramResources.size())
        {
          paramFontRequest = new ArrayList((Collection)paramResources.get(i));
          Collections.sort(paramFontRequest, sByteArrayComparator);
          if (equalsByteArrayList(paramPackageManager, paramFontRequest)) {
            return localProviderInfo;
          }
          i++;
        }
        return null;
      }
      paramPackageManager = a.s("Found content provider ", str, ", but package was not ");
      paramPackageManager.append(paramFontRequest.getProviderPackage());
      throw new PackageManager.NameNotFoundException(paramPackageManager.toString());
    }
    throw new PackageManager.NameNotFoundException(z2.o("No package found for authority: ", str));
  }
  
  @NonNull
  @VisibleForTesting
  public static FontsContractCompat.FontInfo[] query(Context paramContext, FontRequest paramFontRequest, String paramString, CancellationSignal paramCancellationSignal)
  {
    ArrayList localArrayList = new ArrayList();
    Uri localUri1 = new Uri.Builder().scheme("content").authority(paramString).build();
    Uri localUri2 = new Uri.Builder().scheme("content").authority(paramString).appendPath("file").build();
    Object localObject = null;
    paramString = (String)localObject;
    try
    {
      paramContext = paramContext.getContentResolver();
      paramString = (String)localObject;
      paramFontRequest = paramFontRequest.getQuery();
      paramString = (String)localObject;
      paramFontRequest = Api16Impl.query(paramContext, localUri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { paramFontRequest }, null, paramCancellationSignal);
      paramContext = localArrayList;
      if (paramFontRequest != null)
      {
        paramContext = localArrayList;
        paramString = paramFontRequest;
        if (paramFontRequest.getCount() > 0)
        {
          paramString = paramFontRequest;
          int i = paramFontRequest.getColumnIndex("result_code");
          paramString = paramFontRequest;
          paramCancellationSignal = new java/util/ArrayList;
          paramString = paramFontRequest;
          paramCancellationSignal.<init>();
          paramString = paramFontRequest;
          int j = paramFontRequest.getColumnIndex("_id");
          paramString = paramFontRequest;
          int k = paramFontRequest.getColumnIndex("file_id");
          paramString = paramFontRequest;
          int m = paramFontRequest.getColumnIndex("font_ttc_index");
          paramString = paramFontRequest;
          int n = paramFontRequest.getColumnIndex("font_weight");
          paramString = paramFontRequest;
          int i1 = paramFontRequest.getColumnIndex("font_italic");
          for (;;)
          {
            paramString = paramFontRequest;
            if (!paramFontRequest.moveToNext()) {
              break;
            }
            int i2;
            if (i != -1)
            {
              paramString = paramFontRequest;
              i2 = paramFontRequest.getInt(i);
            }
            else
            {
              i2 = 0;
            }
            int i3;
            if (m != -1)
            {
              paramString = paramFontRequest;
              i3 = paramFontRequest.getInt(m);
            }
            else
            {
              i3 = 0;
            }
            if (k == -1)
            {
              paramString = paramFontRequest;
              paramContext = ContentUris.withAppendedId(localUri1, paramFontRequest.getLong(j));
            }
            else
            {
              paramString = paramFontRequest;
              paramContext = ContentUris.withAppendedId(localUri2, paramFontRequest.getLong(k));
            }
            int i4 = i2;
            if (n != -1)
            {
              paramString = paramFontRequest;
              i2 = paramFontRequest.getInt(n);
            }
            else
            {
              i2 = 400;
            }
            if (i1 != -1)
            {
              paramString = paramFontRequest;
              if (paramFontRequest.getInt(i1) == 1)
              {
                bool = true;
                break label402;
              }
            }
            boolean bool = false;
            label402:
            paramString = paramFontRequest;
            paramCancellationSignal.add(FontsContractCompat.FontInfo.create(paramContext, i3, i2, bool, i4));
          }
          paramContext = paramCancellationSignal;
        }
      }
      return (FontsContractCompat.FontInfo[])paramContext.toArray(new FontsContractCompat.FontInfo[0]);
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static Cursor query(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, Object paramObject)
    {
      return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (CancellationSignal)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */