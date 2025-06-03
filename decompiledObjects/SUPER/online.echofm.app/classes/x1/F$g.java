package x1;

import O1.C;
import O1.P;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class F$g
  implements F.e
{
  public final OutputStream a;
  public final C b;
  public boolean c;
  public final boolean d;
  
  public F$g(OutputStream paramOutputStream, C paramC, boolean paramBoolean)
  {
    a = paramOutputStream;
    b = paramC;
    c = true;
    d = paramBoolean;
  }
  
  public void a(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "key");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    f(paramString1, null, null);
    i("%s", new Object[] { paramString2 });
    k();
    C localC = b;
    if (localC != null) {
      localC.d(Intrinsics.i("    ", paramString1), paramString2);
    }
  }
  
  public final RuntimeException b()
  {
    return new IllegalArgumentException("value is not a supported type.");
  }
  
  public final void c(String paramString, Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramString, "format");
    Intrinsics.checkNotNullParameter(paramVarArgs, "args");
    Object localObject2;
    Object localObject3;
    if (!d)
    {
      if (c)
      {
        Object localObject1 = a;
        localObject2 = b.b;
        localObject3 = "--".getBytes((Charset)localObject2);
        Intrinsics.checkNotNullExpressionValue(localObject3, "(this as java.lang.String).getBytes(charset)");
        ((OutputStream)localObject1).write((byte[])localObject3);
        localObject3 = a;
        localObject1 = F.d();
        if (localObject1 != null)
        {
          localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
          Intrinsics.checkNotNullExpressionValue(localObject1, "(this as java.lang.String).getBytes(charset)");
          ((OutputStream)localObject3).write((byte[])localObject1);
          localObject3 = a;
          localObject2 = "\r\n".getBytes((Charset)localObject2);
          Intrinsics.checkNotNullExpressionValue(localObject2, "(this as java.lang.String).getBytes(charset)");
          ((OutputStream)localObject3).write((byte[])localObject2);
          c = false;
        }
        else
        {
          throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
      }
      localObject2 = a;
      localObject3 = x.a;
      paramVarArgs = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
      paramString = String.format(paramString, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(format, *args)");
      paramString = paramString.getBytes(b.b);
      Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).getBytes(charset)");
      ((OutputStream)localObject2).write(paramString);
    }
    else
    {
      localObject2 = a;
      localObject3 = x.a;
      localObject3 = Locale.US;
      paramVarArgs = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
      paramString = String.format((Locale)localObject3, paramString, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
      paramString = URLEncoder.encode(paramString, "UTF-8");
      Intrinsics.checkNotNullExpressionValue(paramString, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
      paramString = paramString.getBytes(b.b);
      Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).getBytes(charset)");
      ((OutputStream)localObject2).write(paramString);
    }
  }
  
  public final void d(String paramString, Bitmap paramBitmap)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramBitmap, "bitmap");
    f(paramString, paramString, "image/png");
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, a);
    i("", new Object[0]);
    k();
    paramBitmap = b;
    if (paramBitmap != null) {
      paramBitmap.d(Intrinsics.i("    ", paramString), "<Image>");
    }
  }
  
  public final void e(String paramString, byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "bytes");
    f(paramString, paramString, "content/unknown");
    a.write(paramArrayOfByte);
    i("", new Object[0]);
    k();
    C localC = b;
    if (localC != null)
    {
      paramString = Intrinsics.i("    ", paramString);
      x localx = x.a;
      paramArrayOfByte = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { Integer.valueOf(paramArrayOfByte.length) }, 1));
      Intrinsics.checkNotNullExpressionValue(paramArrayOfByte, "java.lang.String.format(locale, format, *args)");
      localC.d(paramString, paramArrayOfByte);
    }
  }
  
  public final void f(String paramString1, String paramString2, String paramString3)
  {
    if (!d)
    {
      c("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
      if (paramString2 != null) {
        c("; filename=\"%s\"", new Object[] { paramString2 });
      }
      i("", new Object[0]);
      if (paramString3 != null) {
        i("%s: %s", new Object[] { "Content-Type", paramString3 });
      }
      i("", new Object[0]);
    }
    else
    {
      paramString2 = a;
      paramString3 = x.a;
      paramString1 = String.format("%s=", Arrays.copyOf(new Object[] { paramString1 }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString1, "java.lang.String.format(format, *args)");
      paramString1 = paramString1.getBytes(b.b);
      Intrinsics.checkNotNullExpressionValue(paramString1, "(this as java.lang.String).getBytes(charset)");
      paramString2.write(paramString1);
    }
  }
  
  public final void g(String paramString1, Uri paramUri, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "key");
    Intrinsics.checkNotNullParameter(paramUri, "contentUri");
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    f(paramString1, paramString1, str);
    int i;
    if ((a instanceof S))
    {
      long l = P.z(paramUri);
      ((S)a).b(l);
      i = 0;
    }
    else
    {
      paramString2 = B.l().getContentResolver().openInputStream(paramUri);
      paramUri = P.a;
      i = P.p(paramString2, a);
    }
    i("", new Object[0]);
    k();
    paramUri = b;
    if (paramUri != null)
    {
      paramString1 = Intrinsics.i("    ", paramString1);
      paramString2 = x.a;
      paramString2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { Integer.valueOf(i) }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(locale, format, *args)");
      paramUri.d(paramString1, paramString2);
    }
  }
  
  public final void h(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "key");
    Intrinsics.checkNotNullParameter(paramParcelFileDescriptor, "descriptor");
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    f(paramString1, paramString1, str);
    paramString2 = a;
    int i;
    if ((paramString2 instanceof S))
    {
      ((S)paramString2).b(paramParcelFileDescriptor.getStatSize());
      i = 0;
    }
    else
    {
      paramParcelFileDescriptor = new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor);
      paramString2 = P.a;
      i = P.p(paramParcelFileDescriptor, a);
    }
    i("", new Object[0]);
    k();
    paramParcelFileDescriptor = b;
    if (paramParcelFileDescriptor != null)
    {
      paramString1 = Intrinsics.i("    ", paramString1);
      paramString2 = x.a;
      paramString2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { Integer.valueOf(i) }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(locale, format, *args)");
      paramParcelFileDescriptor.d(paramString1, paramString2);
    }
  }
  
  public final void i(String paramString, Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramString, "format");
    Intrinsics.checkNotNullParameter(paramVarArgs, "args");
    c(paramString, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    if (!d) {
      c("\r\n", new Object[0]);
    }
  }
  
  public final void j(String paramString, Object paramObject, F paramF)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    OutputStream localOutputStream = a;
    if ((localOutputStream instanceof U)) {
      ((U)localOutputStream).a(paramF);
    }
    paramF = F.n;
    if (F.c.d(paramF, paramObject))
    {
      a(paramString, F.c.e(paramF, paramObject));
    }
    else if ((paramObject instanceof Bitmap))
    {
      d(paramString, (Bitmap)paramObject);
    }
    else if ((paramObject instanceof byte[]))
    {
      e(paramString, (byte[])paramObject);
    }
    else if ((paramObject instanceof Uri))
    {
      g(paramString, (Uri)paramObject, null);
    }
    else if ((paramObject instanceof ParcelFileDescriptor))
    {
      h(paramString, (ParcelFileDescriptor)paramObject, null);
    }
    else
    {
      if (!(paramObject instanceof F.f)) {
        break label199;
      }
      paramF = (F.f)paramObject;
      paramObject = paramF.b();
      paramF = paramF.a();
      if ((paramObject instanceof ParcelFileDescriptor))
      {
        h(paramString, (ParcelFileDescriptor)paramObject, paramF);
      }
      else
      {
        if (!(paramObject instanceof Uri)) {
          break label194;
        }
        g(paramString, (Uri)paramObject, paramF);
      }
    }
    return;
    label194:
    throw b();
    label199:
    throw b();
  }
  
  public final void k()
  {
    if (!d)
    {
      i("--%s", new Object[] { F.d() });
    }
    else
    {
      OutputStream localOutputStream = a;
      byte[] arrayOfByte = "&".getBytes(b.b);
      Intrinsics.checkNotNullExpressionValue(arrayOfByte, "(this as java.lang.String).getBytes(charset)");
      localOutputStream.write(arrayOfByte);
    }
  }
  
  public final void l(String paramString, JSONArray paramJSONArray, Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramJSONArray, "requestJsonArray");
    Intrinsics.checkNotNullParameter(paramCollection, "requests");
    Object localObject = a;
    if (!(localObject instanceof U))
    {
      paramJSONArray = paramJSONArray.toString();
      Intrinsics.checkNotNullExpressionValue(paramJSONArray, "requestJsonArray.toString()");
      a(paramString, paramJSONArray);
      return;
    }
    localObject = (U)localObject;
    f(paramString, null, null);
    c("[", new Object[0]);
    paramCollection = paramCollection.iterator();
    for (int i = 0; paramCollection.hasNext(); i++)
    {
      F localF = (F)paramCollection.next();
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      ((U)localObject).a(localF);
      if (i > 0) {
        c(",%s", new Object[] { localJSONObject.toString() });
      } else {
        c("%s", new Object[] { localJSONObject.toString() });
      }
    }
    c("]", new Object[0]);
    paramCollection = b;
    if (paramCollection != null)
    {
      paramString = Intrinsics.i("    ", paramString);
      paramJSONArray = paramJSONArray.toString();
      Intrinsics.checkNotNullExpressionValue(paramJSONArray, "requestJsonArray.toString()");
      paramCollection.d(paramString, paramJSONArray);
    }
  }
}

/* Location:
 * Qualified Name:     x1.F.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */