package m7;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class g
{
  public static final v a = new v("PhoneskyVerificationUtils");
  
  public static boolean a(Signature[] paramArrayOfSignature)
  {
    if (paramArrayOfSignature != null)
    {
      int i = paramArrayOfSignature.length;
      if (i != 0)
      {
        int j = 0;
        while (j < i)
        {
          Object localObject = paramArrayOfSignature[j].toByteArray();
          String str;
          try
          {
            MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
            localMessageDigest.update((byte[])localObject);
            localObject = Base64.encodeToString(localMessageDigest.digest(), 11);
          }
          catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
          {
            str = "";
          }
          if ((!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) && (((!Build.TAGS.contains("dev-keys")) && (!Build.TAGS.contains("test-keys"))) || (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)))) {
            j++;
          } else {
            return true;
          }
        }
        return false;
      }
    }
    paramArrayOfSignature = a;
    paramArrayOfSignature.getClass();
    if (Log.isLoggable("PlayCore", 5)) {
      Log.w("PlayCore", v.c(a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]));
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     m7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */