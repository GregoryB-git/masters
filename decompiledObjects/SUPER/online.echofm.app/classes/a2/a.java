package a2;

import O1.P;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import x1.F;
import x1.F.b;
import x1.F.f;
import x1.L;
import x1.o;

public final class a
{
  public static final a a = new a();
  
  public static final F a(x1.a parama, Uri paramUri, F.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramUri, "imageUri");
    Object localObject = paramUri.getPath();
    if ((P.a0(paramUri)) && (localObject != null)) {
      return b(parama, new File((String)localObject), paramb);
    }
    if (P.X(paramUri))
    {
      paramUri = new F.f(paramUri, "image/png");
      localObject = new Bundle(1);
      ((Bundle)localObject).putParcelable("file", paramUri);
      return new F(parama, "me/staging_resources", (Bundle)localObject, L.p, paramb, null, 32, null);
    }
    throw new o("The image Uri must be either a file:// or content:// Uri");
  }
  
  public static final F b(x1.a parama, File paramFile, F.b paramb)
  {
    paramFile = new F.f(ParcelFileDescriptor.open(paramFile, 268435456), "image/png");
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", paramFile);
    return new F(parama, "me/staging_resources", localBundle, L.p, paramb, null, 32, null);
  }
}

/* Location:
 * Qualified Name:     a2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */