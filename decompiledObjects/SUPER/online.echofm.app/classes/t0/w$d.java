package t0;

import android.media.MediaCodec.CodecException;
import d0.q;

public class w$d
  extends Exception
{
  public final String o;
  public final boolean p;
  public final p q;
  public final String r;
  public final d s;
  
  public w$d(q paramq, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    this(localStringBuilder.toString(), paramThrowable, n, paramBoolean, null, b(paramInt), null);
  }
  
  public w$d(q paramq, Throwable paramThrowable, boolean paramBoolean, p paramp)
  {
    this((String)localObject, paramThrowable, str, paramBoolean, paramp, paramq, null);
  }
  
  public w$d(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, p paramp, String paramString3, d paramd)
  {
    super(paramString1, paramThrowable);
    o = paramString2;
    p = paramBoolean;
    q = paramp;
    r = paramString3;
    s = paramd;
  }
  
  public static String b(int paramInt)
  {
    String str;
    if (paramInt < 0) {
      str = "neg_";
    } else {
      str = "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("androidx.media3.exoplayer.mediacodec");
    localStringBuilder.append(".MediaCodecRenderer_");
    localStringBuilder.append(str);
    localStringBuilder.append(Math.abs(paramInt));
    return localStringBuilder.toString();
  }
  
  public static String d(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof MediaCodec.CodecException)) {
      return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
    }
    return null;
  }
  
  public final d c(d paramd)
  {
    return new d(getMessage(), getCause(), o, p, q, r, paramd);
  }
}

/* Location:
 * Qualified Name:     t0.w.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */