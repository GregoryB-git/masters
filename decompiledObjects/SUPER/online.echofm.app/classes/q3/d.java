package q3;

import c3.e;
import h3.b.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m3.a;

public final class d
  implements e
{
  public static final b.b c = b.b.o;
  public static final Collection d = Arrays.asList(new Integer[] { Integer.valueOf(64) });
  public static final byte[] e = new byte[16];
  public static final byte[] f = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
  public final m a;
  public final byte[] b;
  
  public d(byte[] paramArrayOfByte)
  {
    if (c.c())
    {
      if (d.contains(Integer.valueOf(paramArrayOfByte.length)))
      {
        localObject = Arrays.copyOfRange(paramArrayOfByte, 0, paramArrayOfByte.length / 2);
        b = Arrays.copyOfRange(paramArrayOfByte, paramArrayOfByte.length / 2, paramArrayOfByte.length);
        a = new m((byte[])localObject);
        return;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("invalid key size: ");
      ((StringBuilder)localObject).append(paramArrayOfByte.length);
      ((StringBuilder)localObject).append(" bytes; key must have 64 bytes");
      throw new InvalidKeyException(((StringBuilder)localObject).toString());
    }
    throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length <= 2147483631)
    {
      Cipher localCipher = (Cipher)i.b.a("AES/CTR/NoPadding");
      byte[] arrayOfByte = c(new byte[][] { paramArrayOfByte2, paramArrayOfByte1 });
      paramArrayOfByte2 = (byte[])arrayOfByte.clone();
      paramArrayOfByte2[8] = ((byte)(byte)(paramArrayOfByte2[8] & 0x7F));
      paramArrayOfByte2[12] = ((byte)(byte)(paramArrayOfByte2[12] & 0x7F));
      localCipher.init(1, new SecretKeySpec(b, "AES"), new IvParameterSpec(paramArrayOfByte2));
      return f.a(new byte[][] { arrayOfByte, localCipher.doFinal(paramArrayOfByte1) });
    }
    throw new GeneralSecurityException("plaintext too long");
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 16)
    {
      Object localObject = (Cipher)i.b.a("AES/CTR/NoPadding");
      byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, 0, 16);
      byte[] arrayOfByte2 = (byte[])arrayOfByte1.clone();
      arrayOfByte2[8] = ((byte)(byte)(arrayOfByte2[8] & 0x7F));
      arrayOfByte2[12] = ((byte)(byte)(arrayOfByte2[12] & 0x7F));
      ((Cipher)localObject).init(2, new SecretKeySpec(b, "AES"), new IvParameterSpec(arrayOfByte2));
      arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, 16, paramArrayOfByte1.length);
      localObject = ((Cipher)localObject).doFinal(arrayOfByte2);
      paramArrayOfByte1 = (byte[])localObject;
      if (arrayOfByte2.length == 0)
      {
        paramArrayOfByte1 = (byte[])localObject;
        if (localObject == null)
        {
          paramArrayOfByte1 = (byte[])localObject;
          if (q.b()) {
            paramArrayOfByte1 = new byte[0];
          }
        }
      }
      if (f.b(arrayOfByte1, c(new byte[][] { paramArrayOfByte2, paramArrayOfByte1 }))) {
        return paramArrayOfByte1;
      }
      throw new AEADBadTagException("Integrity check failed.");
    }
    throw new GeneralSecurityException("Ciphertext too short.");
  }
  
  public final byte[] c(byte[]... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      return a.a(f, 16);
    }
    byte[] arrayOfByte1 = a.a(e, 16);
    for (int i = 0; i < paramVarArgs.length - 1; i++)
    {
      byte[] arrayOfByte2 = paramVarArgs[i];
      byte[] arrayOfByte3 = arrayOfByte2;
      if (arrayOfByte2 == null) {
        arrayOfByte3 = new byte[0];
      }
      arrayOfByte1 = f.e(a.b(arrayOfByte1), a.a(arrayOfByte3, 16));
    }
    paramVarArgs = paramVarArgs[(paramVarArgs.length - 1)];
    if (paramVarArgs.length >= 16) {
      paramVarArgs = f.f(paramVarArgs, arrayOfByte1);
    } else {
      paramVarArgs = f.e(a.a(paramVarArgs), a.b(arrayOfByte1));
    }
    return a.a(paramVarArgs, 16);
  }
}

/* Location:
 * Qualified Name:     q3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */