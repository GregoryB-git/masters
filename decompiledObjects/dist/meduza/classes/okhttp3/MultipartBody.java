package okhttp3;

import java.util.ArrayList;
import xc.f;
import xc.i;
import xc.i.a;
import xc.r;

public final class MultipartBody
  extends RequestBody
{
  static
  {
    MediaType.a("multipart/mixed");
    MediaType.a("multipart/alternative");
    MediaType.a("multipart/digest");
    MediaType.a("multipart/parallel");
    MediaType.a("multipart/form-data");
  }
  
  public final long a()
  {
    return 0L;
  }
  
  public final MediaType b()
  {
    return null;
  }
  
  public final void d(r paramr)
  {
    e(paramr, false);
    throw null;
  }
  
  public final void e(r paramr, boolean paramBoolean)
  {
    if (paramBoolean) {
      new f();
    }
    throw null;
  }
  
  public static final class Builder
  {
    public Builder()
    {
      int i = MultipartBody.a;
      new ArrayList();
      i locali = i.d;
      i.a.a(str);
    }
  }
  
  public static final class Part {}
}

/* Location:
 * Qualified Name:     okhttp3.MultipartBody
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */