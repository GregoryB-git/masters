package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzyk;
import com.google.android.gms.internal.firebase-auth-api.zzyl;
import f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

public final class zzyi
{
  public static int zza(EllipticCurve paramEllipticCurve)
  {
    return (zzmt.zza(paramEllipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
  }
  
  private static BigInteger zza(BigInteger paramBigInteger, boolean paramBoolean, EllipticCurve paramEllipticCurve)
  {
    BigInteger localBigInteger1 = zzmt.zza(paramEllipticCurve);
    BigInteger localBigInteger2 = paramEllipticCurve.getA();
    paramEllipticCurve = paramEllipticCurve.getB();
    paramBigInteger = paramBigInteger.multiply(paramBigInteger).add(localBigInteger2).multiply(paramBigInteger).add(paramEllipticCurve).mod(localBigInteger1);
    if (localBigInteger1.signum() == 1)
    {
      BigInteger localBigInteger3 = paramBigInteger.mod(localBigInteger1);
      paramEllipticCurve = null;
      paramBigInteger = BigInteger.ZERO;
      if (!localBigInteger3.equals(paramBigInteger))
      {
        if ((localBigInteger1.testBit(0)) && (localBigInteger1.testBit(1)))
        {
          paramBigInteger = localBigInteger3.modPow(localBigInteger1.add(BigInteger.ONE).shiftRight(2), localBigInteger1);
        }
        else
        {
          paramBigInteger = paramEllipticCurve;
          if (localBigInteger1.testBit(0))
          {
            paramBigInteger = paramEllipticCurve;
            if (!localBigInteger1.testBit(1))
            {
              paramBigInteger = BigInteger.ONE;
              BigInteger localBigInteger4 = localBigInteger1.subtract(paramBigInteger).shiftRight(1);
              int i = 0;
              BigInteger localBigInteger5;
              for (;;)
              {
                localBigInteger5 = paramBigInteger.multiply(paramBigInteger).subtract(localBigInteger3).mod(localBigInteger1);
                if (localBigInteger5.equals(BigInteger.ZERO))
                {
                  paramEllipticCurve = paramBigInteger;
                  break label457;
                }
                paramEllipticCurve = localBigInteger5.modPow(localBigInteger4, localBigInteger1);
                localBigInteger2 = BigInteger.ONE;
                if (paramEllipticCurve.add(localBigInteger2).equals(localBigInteger1)) {
                  break label280;
                }
                if (!paramEllipticCurve.equals(localBigInteger2)) {
                  break label270;
                }
                paramEllipticCurve = paramBigInteger.add(localBigInteger2);
                int j = i + 1;
                i = j;
                paramBigInteger = paramEllipticCurve;
                if (j == 128)
                {
                  if (!localBigInteger1.isProbablePrime(80)) {
                    break;
                  }
                  i = j;
                  paramBigInteger = paramEllipticCurve;
                }
              }
              throw new InvalidAlgorithmParameterException("p is not prime");
              label270:
              throw new InvalidAlgorithmParameterException("p is not prime");
              label280:
              BigInteger localBigInteger6 = localBigInteger1.add(localBigInteger2).shiftRight(1);
              i = localBigInteger6.bitLength() - 2;
              paramEllipticCurve = paramBigInteger;
              while (i >= 0)
              {
                localBigInteger4 = paramEllipticCurve.multiply(localBigInteger2);
                paramEllipticCurve = paramEllipticCurve.multiply(paramEllipticCurve).add(localBigInteger2.multiply(localBigInteger2).mod(localBigInteger1).multiply(localBigInteger5)).mod(localBigInteger1);
                localBigInteger2 = localBigInteger4.add(localBigInteger4).mod(localBigInteger1);
                if (localBigInteger6.testBit(i))
                {
                  localBigInteger4 = paramEllipticCurve.multiply(paramBigInteger).add(localBigInteger2.multiply(localBigInteger5)).mod(localBigInteger1);
                  localBigInteger2 = paramBigInteger.multiply(localBigInteger2).add(paramEllipticCurve).mod(localBigInteger1);
                  paramEllipticCurve = localBigInteger4;
                }
                i--;
              }
              paramBigInteger = paramEllipticCurve;
            }
          }
        }
        paramEllipticCurve = paramBigInteger;
        if (paramBigInteger != null) {
          if (paramBigInteger.multiply(paramBigInteger).mod(localBigInteger1).compareTo(localBigInteger3) == 0) {
            paramEllipticCurve = paramBigInteger;
          } else {
            throw new GeneralSecurityException("Could not find a modular square root");
          }
        }
        label457:
        paramBigInteger = paramEllipticCurve;
      }
      paramEllipticCurve = paramBigInteger;
      if (paramBoolean != paramBigInteger.testBit(0)) {
        paramEllipticCurve = localBigInteger1.subtract(paramBigInteger).mod(localBigInteger1);
      }
      return paramEllipticCurve;
    }
    throw new InvalidAlgorithmParameterException("p must be positive");
  }
  
  public static KeyPair zza(ECParameterSpec paramECParameterSpec)
  {
    KeyPairGenerator localKeyPairGenerator = (KeyPairGenerator)zzym.zzd.zza("EC");
    localKeyPairGenerator.initialize(paramECParameterSpec);
    return localKeyPairGenerator.generateKeyPair();
  }
  
  public static ECPrivateKey zza(zzyl paramzzyl, byte[] paramArrayOfByte)
  {
    paramzzyl = zza(paramzzyl);
    paramzzyl = new ECPrivateKeySpec(zzmo.zza(paramArrayOfByte), paramzzyl);
    return (ECPrivateKey)((KeyFactory)zzym.zze.zza("EC")).generatePrivate(paramzzyl);
  }
  
  public static ECPublicKey zza(ECParameterSpec paramECParameterSpec, zzyk paramzzyk, byte[] paramArrayOfByte)
  {
    paramECParameterSpec = new ECPublicKeySpec(zza(paramECParameterSpec.getCurve(), paramzzyk, paramArrayOfByte), paramECParameterSpec);
    return (ECPublicKey)((KeyFactory)zzym.zze.zza("EC")).generatePublic(paramECParameterSpec);
  }
  
  public static ECParameterSpec zza(zzyl paramzzyl)
  {
    int i = paramzzyl.ordinal();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          return zzmt.zzc;
        }
        throw new NoSuchAlgorithmException(f.j("curve not implemented:", String.valueOf(paramzzyl)));
      }
      return zzmt.zzb;
    }
    return zzmt.zza;
  }
  
  public static ECPoint zza(EllipticCurve paramEllipticCurve, zzyk paramzzyk, byte[] paramArrayOfByte)
  {
    int i = zza(paramEllipticCurve);
    int j = paramzzyk.ordinal();
    boolean bool = false;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j == 2)
        {
          if (paramArrayOfByte.length == i * 2) {
            paramzzyk = new ECPoint(new BigInteger(1, Arrays.copyOf(paramArrayOfByte, i)), new BigInteger(1, Arrays.copyOfRange(paramArrayOfByte, i, paramArrayOfByte.length)));
          } else {
            throw new GeneralSecurityException("invalid point size");
          }
        }
        else {
          throw new GeneralSecurityException(f.j("invalid format:", String.valueOf(paramzzyk)));
        }
      }
      else
      {
        paramzzyk = zzmt.zza(paramEllipticCurve);
        if (paramArrayOfByte.length == i + 1)
        {
          i = paramArrayOfByte[0];
          if (i != 2)
          {
            if (i == 3) {
              bool = true;
            }
          }
          else
          {
            paramArrayOfByte = new BigInteger(1, Arrays.copyOfRange(paramArrayOfByte, 1, paramArrayOfByte.length));
            if ((paramArrayOfByte.signum() != -1) && (paramArrayOfByte.compareTo(paramzzyk) < 0)) {
              return new ECPoint(paramArrayOfByte, zza(paramArrayOfByte, bool, paramEllipticCurve));
            }
            throw new GeneralSecurityException("x is out of range");
          }
          throw new GeneralSecurityException("invalid format");
        }
        throw new GeneralSecurityException("compressed point has wrong length");
      }
    }
    else
    {
      if (paramArrayOfByte.length != i * 2 + 1) {
        break label290;
      }
      if (paramArrayOfByte[0] != 4) {
        break label280;
      }
      i++;
      paramzzyk = new ECPoint(new BigInteger(1, Arrays.copyOfRange(paramArrayOfByte, 1, i)), new BigInteger(1, Arrays.copyOfRange(paramArrayOfByte, i, paramArrayOfByte.length)));
    }
    zzmt.zza(paramzzyk, paramEllipticCurve);
    return paramzzyk;
    label280:
    throw new GeneralSecurityException("invalid point format");
    label290:
    throw new GeneralSecurityException("invalid point size");
  }
  
  public static byte[] zza(ECPrivateKey paramECPrivateKey, ECPublicKey paramECPublicKey)
  {
    try
    {
      boolean bool = zzmt.zza(paramECPublicKey.getParams(), paramECPrivateKey.getParams());
      if (bool) {
        return zza(paramECPrivateKey, paramECPublicKey.getW());
      }
      paramECPrivateKey = new java/security/GeneralSecurityException;
      paramECPrivateKey.<init>("invalid public key spec");
      throw paramECPrivateKey;
    }
    catch (NullPointerException paramECPrivateKey) {}catch (IllegalArgumentException paramECPrivateKey) {}
    throw new GeneralSecurityException(paramECPrivateKey);
  }
  
  private static byte[] zza(ECPrivateKey paramECPrivateKey, ECPoint paramECPoint)
  {
    zzmt.zza(paramECPoint, paramECPrivateKey.getParams().getCurve());
    paramECPoint = new ECPublicKeySpec(paramECPoint, paramECPrivateKey.getParams());
    paramECPoint = ((KeyFactory)zzym.zze.zza("EC")).generatePublic(paramECPoint);
    Object localObject = (KeyAgreement)zzym.zzc.zza("ECDH");
    ((KeyAgreement)localObject).init(paramECPrivateKey);
    try
    {
      ((KeyAgreement)localObject).doPhase(paramECPoint, true);
      paramECPoint = ((KeyAgreement)localObject).generateSecret();
      localObject = paramECPrivateKey.getParams().getCurve();
      paramECPrivateKey = new java/math/BigInteger;
      paramECPrivateKey.<init>(1, paramECPoint);
      if ((paramECPrivateKey.signum() != -1) && (paramECPrivateKey.compareTo(zzmt.zza((EllipticCurve)localObject)) < 0))
      {
        zza(paramECPrivateKey, true, (EllipticCurve)localObject);
        return paramECPoint;
      }
      paramECPrivateKey = new java/security/GeneralSecurityException;
      paramECPrivateKey.<init>("shared secret is out of range");
      throw paramECPrivateKey;
    }
    catch (IllegalStateException paramECPrivateKey)
    {
      throw new GeneralSecurityException(paramECPrivateKey);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */