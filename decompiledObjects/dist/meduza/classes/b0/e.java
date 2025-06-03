package b0;

import android.content.ContentProviderClient;
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
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e
{
  public static final d a = new d(0);
  
  public static m a(Context paramContext, g paramg)
  {
    Object localObject1 = paramContext.getPackageManager();
    Object localObject2 = paramContext.getResources();
    Object localObject3 = a;
    Object localObject4 = ((PackageManager)localObject1).resolveContentProvider((String)localObject3, 0);
    if (localObject4 != null)
    {
      if (packageName.equals(b))
      {
        localObject3 = getPackageInfopackageName, 64).signatures;
        localObject1 = new ArrayList();
        int i = localObject3.length;
        for (int j = 0; j < i; j++) {
          ((ArrayList)localObject1).add(localObject3[j].toByteArray());
        }
        Collections.sort((List)localObject1, a);
        localObject3 = d;
        if (localObject3 == null) {
          localObject3 = w.d.b((Resources)localObject2, 0);
        }
        for (j = 0;; j++)
        {
          i = ((List)localObject3).size();
          localObject2 = null;
          if (j >= i) {
            break;
          }
          localObject5 = new ArrayList((Collection)((List)localObject3).get(j));
          Collections.sort((List)localObject5, a);
          if (((ArrayList)localObject1).size() == ((ArrayList)localObject5).size()) {}
          for (i = 0; i < ((ArrayList)localObject1).size(); i++) {
            if (!Arrays.equals((byte[])((ArrayList)localObject1).get(i), (byte[])((ArrayList)localObject5).get(i)))
            {
              i = 0;
              break label248;
            }
          }
          i = 1;
          label248:
          if (i != 0)
          {
            localObject3 = localObject4;
            break label269;
          }
        }
        localObject3 = null;
        label269:
        if (localObject3 == null) {
          return new m(1, null);
        }
        localObject3 = authority;
        localObject4 = new ArrayList();
        localObject1 = new Uri.Builder().scheme("content").authority((String)localObject3).build();
        Object localObject5 = new Uri.Builder().scheme("content").authority((String)localObject3).appendPath("file").build();
        if (Build.VERSION.SDK_INT < 24) {
          paramContext = new b(paramContext, (Uri)localObject1);
        } else {
          paramContext = new c(paramContext, (Uri)localObject1);
        }
        localObject3 = localObject2;
        try
        {
          paramg = c;
          localObject3 = localObject2;
          localObject2 = paramContext.a((Uri)localObject1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, new String[] { paramg });
          paramg = (g)localObject4;
          if (localObject2 != null)
          {
            paramg = (g)localObject4;
            localObject3 = localObject2;
            if (((Cursor)localObject2).getCount() > 0)
            {
              localObject3 = localObject2;
              int k = ((Cursor)localObject2).getColumnIndex("result_code");
              localObject3 = localObject2;
              localObject4 = new java/util/ArrayList;
              localObject3 = localObject2;
              ((ArrayList)localObject4).<init>();
              localObject3 = localObject2;
              int m = ((Cursor)localObject2).getColumnIndex("_id");
              localObject3 = localObject2;
              int n = ((Cursor)localObject2).getColumnIndex("file_id");
              localObject3 = localObject2;
              int i1 = ((Cursor)localObject2).getColumnIndex("font_ttc_index");
              localObject3 = localObject2;
              int i2 = ((Cursor)localObject2).getColumnIndex("font_weight");
              localObject3 = localObject2;
              int i3 = ((Cursor)localObject2).getColumnIndex("font_italic");
              for (;;)
              {
                paramg = (g)localObject4;
                localObject3 = localObject2;
                if (!((Cursor)localObject2).moveToNext()) {
                  break;
                }
                if (k != -1)
                {
                  localObject3 = localObject2;
                  j = ((Cursor)localObject2).getInt(k);
                }
                else
                {
                  j = 0;
                }
                if (i1 != -1)
                {
                  localObject3 = localObject2;
                  i = ((Cursor)localObject2).getInt(i1);
                }
                else
                {
                  i = 0;
                }
                if (n == -1)
                {
                  localObject3 = localObject2;
                  paramg = ContentUris.withAppendedId((Uri)localObject1, ((Cursor)localObject2).getLong(m));
                }
                else
                {
                  localObject3 = localObject2;
                  paramg = ContentUris.withAppendedId((Uri)localObject5, ((Cursor)localObject2).getLong(n));
                }
                int i4;
                if (i2 != -1)
                {
                  localObject3 = localObject2;
                  i4 = ((Cursor)localObject2).getInt(i2);
                }
                else
                {
                  i4 = 400;
                }
                if (i3 != -1)
                {
                  localObject3 = localObject2;
                  if (((Cursor)localObject2).getInt(i3) == 1)
                  {
                    bool = true;
                    break label727;
                  }
                }
                boolean bool = false;
                label727:
                localObject3 = localObject2;
                n localn = new b0/n;
                localObject3 = localObject2;
                localn.<init>(paramg, i, i4, bool, j);
                localObject3 = localObject2;
                ((ArrayList)localObject4).add(localn);
              }
            }
          }
          return new m(0, (n[])paramg.toArray(new n[0]));
        }
        finally
        {
          if (localObject3 != null) {
            ((Cursor)localObject3).close();
          }
          paramContext.close();
        }
      }
      paramContext = f.m("Found content provider ", (String)localObject3, ", but package was not ");
      paramContext.append(b);
      throw new PackageManager.NameNotFoundException(paramContext.toString());
    }
    throw new PackageManager.NameNotFoundException(g.d("No package found for authority: ", (String)localObject3));
  }
  
  public static abstract interface a
  {
    public abstract Cursor a(Uri paramUri, String[] paramArrayOfString1, String[] paramArrayOfString2);
    
    public abstract void close();
  }
  
  public static final class b
    implements e.a
  {
    public final ContentProviderClient a;
    
    public b(Context paramContext, Uri paramUri)
    {
      a = paramContext.getContentResolver().acquireUnstableContentProviderClient(paramUri);
    }
    
    public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String[] paramArrayOfString2)
    {
      ContentProviderClient localContentProviderClient = a;
      if (localContentProviderClient == null) {
        return null;
      }
      try
      {
        paramUri = localContentProviderClient.query(paramUri, paramArrayOfString1, "query = ?", paramArrayOfString2, null, null);
        return paramUri;
      }
      catch (RemoteException paramUri)
      {
        Log.w("FontsProvider", "Unable to query the content provider", paramUri);
      }
      return null;
    }
    
    public final void close()
    {
      ContentProviderClient localContentProviderClient = a;
      if (localContentProviderClient != null) {
        localContentProviderClient.release();
      }
    }
  }
  
  public static final class c
    implements e.a
  {
    public final ContentProviderClient a;
    
    public c(Context paramContext, Uri paramUri)
    {
      a = paramContext.getContentResolver().acquireUnstableContentProviderClient(paramUri);
    }
    
    public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String[] paramArrayOfString2)
    {
      ContentProviderClient localContentProviderClient = a;
      if (localContentProviderClient == null) {
        return null;
      }
      try
      {
        paramUri = localContentProviderClient.query(paramUri, paramArrayOfString1, "query = ?", paramArrayOfString2, null, null);
        return paramUri;
      }
      catch (RemoteException paramUri)
      {
        Log.w("FontsProvider", "Unable to query the content provider", paramUri);
      }
      return null;
    }
    
    public final void close()
    {
      ContentProviderClient localContentProviderClient = a;
      if (localContentProviderClient != null) {
        f.g(localContentProviderClient);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */