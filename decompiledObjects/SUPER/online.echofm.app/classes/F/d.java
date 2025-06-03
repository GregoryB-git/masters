package F;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class d
{
  public static final Comparator a = new c();
  
  public static List b(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfSignature.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(paramArrayOfSignature[j].toByteArray());
    }
    return localArrayList;
  }
  
  public static boolean c(List paramList1, List paramList2)
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
  
  public static List d(e parame, Resources paramResources)
  {
    if (parame.b() != null) {
      return parame.b();
    }
    return z.e.c(paramResources, parame.c());
  }
  
  public static g.a e(Context paramContext, e parame, CancellationSignal paramCancellationSignal)
  {
    ProviderInfo localProviderInfo = f(paramContext.getPackageManager(), parame, paramContext.getResources());
    if (localProviderInfo == null) {
      return g.a.a(1, null);
    }
    return g.a.a(0, h(paramContext, parame, authority, paramCancellationSignal));
  }
  
  public static ProviderInfo f(PackageManager paramPackageManager, e parame, Resources paramResources)
  {
    String str = parame.e();
    int i = 0;
    ProviderInfo localProviderInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (localProviderInfo != null)
    {
      if (packageName.equals(parame.f()))
      {
        paramPackageManager = b(getPackageInfopackageName, 64).signatures);
        Collections.sort(paramPackageManager, a);
        paramResources = d(parame, paramResources);
        while (i < paramResources.size())
        {
          parame = new ArrayList((Collection)paramResources.get(i));
          Collections.sort(parame, a);
          if (c(paramPackageManager, parame)) {
            return localProviderInfo;
          }
          i++;
        }
        return null;
      }
      paramPackageManager = new StringBuilder();
      paramPackageManager.append("Found content provider ");
      paramPackageManager.append(str);
      paramPackageManager.append(", but package was not ");
      paramPackageManager.append(parame.f());
      throw new PackageManager.NameNotFoundException(paramPackageManager.toString());
    }
    paramPackageManager = new StringBuilder();
    paramPackageManager.append("No package found for authority: ");
    paramPackageManager.append(str);
    throw new PackageManager.NameNotFoundException(paramPackageManager.toString());
  }
  
  public static g.b[] h(Context paramContext, e parame, String paramString, CancellationSignal paramCancellationSignal)
  {
    ArrayList localArrayList = new ArrayList();
    Uri localUri1 = new Uri.Builder().scheme("content").authority(paramString).build();
    Uri localUri2 = new Uri.Builder().scheme("content").authority(paramString).appendPath("file").build();
    paramString = null;
    try
    {
      paramContext = paramContext.getContentResolver();
      parame = parame.g();
      parame = a.a(paramContext, localUri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { parame }, null, paramCancellationSignal);
      paramContext = localArrayList;
      if (parame != null)
      {
        paramContext = localArrayList;
        for (;;)
        {
          int j;
          int k;
          int m;
          int n;
          int i1;
          try
          {
            if (parame.getCount() <= 0) {
              break;
            }
            int i = parame.getColumnIndex("result_code");
            paramString = new java/util/ArrayList;
            paramString.<init>();
            j = parame.getColumnIndex("_id");
            k = parame.getColumnIndex("file_id");
            m = parame.getColumnIndex("font_ttc_index");
            n = parame.getColumnIndex("font_weight");
            i1 = parame.getColumnIndex("font_italic");
            paramContext = paramString;
            if (!parame.moveToNext()) {
              break;
            }
            if (i != -1) {
              i2 = parame.getInt(i);
            }
          }
          finally
          {
            break label407;
          }
          int i2 = 0;
          int i3;
          if (m != -1) {
            i3 = parame.getInt(m);
          } else {
            i3 = 0;
          }
          if (k == -1) {
            paramContext = ContentUris.withAppendedId(localUri1, parame.getLong(j));
          } else {
            paramContext = ContentUris.withAppendedId(localUri2, parame.getLong(k));
          }
          int i4;
          if (n != -1) {
            i4 = parame.getInt(n);
          } else {
            i4 = 400;
          }
          boolean bool;
          if ((i1 != -1) && (parame.getInt(i1) == 1)) {
            bool = true;
          } else {
            bool = false;
          }
          paramString.add(g.b.a(paramContext, i3, i4, bool, i2));
        }
      }
      if (parame != null) {
        parame.close();
      }
      return (g.b[])paramContext.toArray(new g.b[0]);
    }
    finally
    {
      parame = paramString;
      label407:
      if (parame != null) {
        parame.close();
      }
    }
  }
  
  public static abstract class a
  {
    public static Cursor a(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, Object paramObject)
    {
      return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (CancellationSignal)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     F.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */