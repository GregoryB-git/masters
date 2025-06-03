package com.google.android.gms.internal.firebase_auth_api;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public final class zzmt
{
  public static final ECParameterSpec zza = zza("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
  public static final ECParameterSpec zzb = zza("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
  public static final ECParameterSpec zzc = zza("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
  private static final BigInteger zzd = BigInteger.valueOf(2L);
  private static final BigInteger zze = BigInteger.valueOf(3L);
  private static final BigInteger zzf = BigInteger.valueOf(4L);
  private static final BigInteger zzg = BigInteger.valueOf(8L);
  
  private static com.google.android.gms.internal.firebase-auth-api.zzms zza(com.google.android.gms.internal.firebase-auth-api.zzms paramzzms1, com.google.android.gms.internal.firebase-auth-api.zzms paramzzms2, BigInteger paramBigInteger1, BigInteger paramBigInteger2)
  {
    if (paramzzms1.zza()) {
      return paramzzms2;
    }
    if (paramzzms2.zza()) {
      return paramzzms1;
    }
    BigInteger localBigInteger1 = zzd;
    localBigInteger1 = localBigInteger1.multiply(localBigInteger1).mod(paramBigInteger2);
    BigInteger localBigInteger2 = zzd;
    localBigInteger2 = localBigInteger2.multiply(localBigInteger2).mod(paramBigInteger2);
    BigInteger localBigInteger3 = zzb.multiply(localBigInteger2).mod(paramBigInteger2);
    BigInteger localBigInteger4 = zzb.multiply(localBigInteger1).mod(paramBigInteger2);
    BigInteger localBigInteger5 = zzc.multiply(zzd).mod(paramBigInteger2).multiply(localBigInteger2).mod(paramBigInteger2);
    BigInteger localBigInteger6 = zzc.multiply(zzd).mod(paramBigInteger2).multiply(localBigInteger1).mod(paramBigInteger2);
    if (localBigInteger3.equals(localBigInteger4))
    {
      if (!localBigInteger5.equals(localBigInteger6)) {
        return zzms.zza;
      }
      return zza(paramzzms1, paramBigInteger1, paramBigInteger2);
    }
    paramBigInteger1 = localBigInteger4.subtract(localBigInteger3).mod(paramBigInteger2);
    BigInteger localBigInteger7 = paramBigInteger1.multiply(zzf).multiply(paramBigInteger1).mod(paramBigInteger2);
    localBigInteger4 = paramBigInteger1.multiply(localBigInteger7).mod(paramBigInteger2);
    BigInteger localBigInteger8 = localBigInteger6.subtract(localBigInteger5);
    localBigInteger6 = zzd;
    localBigInteger8 = localBigInteger8.multiply(localBigInteger6).mod(paramBigInteger2);
    localBigInteger7 = localBigInteger3.multiply(localBigInteger7).mod(paramBigInteger2);
    localBigInteger3 = localBigInteger8.multiply(localBigInteger8).mod(paramBigInteger2).subtract(localBigInteger4).subtract(localBigInteger7.multiply(localBigInteger6)).mod(paramBigInteger2);
    localBigInteger5 = localBigInteger8.multiply(localBigInteger7.subtract(localBigInteger3)).subtract(localBigInteger5.multiply(localBigInteger6).multiply(localBigInteger4)).mod(paramBigInteger2);
    paramzzms1 = zzd.add(zzd);
    return new zzms(localBigInteger3, localBigInteger5, paramzzms1.multiply(paramzzms1).mod(paramBigInteger2).subtract(localBigInteger1).subtract(localBigInteger2).multiply(paramBigInteger1).mod(paramBigInteger2));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzms zza(com.google.android.gms.internal.firebase-auth-api.zzms paramzzms, BigInteger paramBigInteger1, BigInteger paramBigInteger2)
  {
    if (zzc.equals(BigInteger.ZERO)) {
      return zzms.zza;
    }
    BigInteger localBigInteger1 = zzb;
    BigInteger localBigInteger2 = localBigInteger1.multiply(localBigInteger1).mod(paramBigInteger2);
    localBigInteger1 = zzc;
    localBigInteger1 = localBigInteger1.multiply(localBigInteger1).mod(paramBigInteger2);
    BigInteger localBigInteger3 = localBigInteger1.multiply(localBigInteger1).mod(paramBigInteger2);
    BigInteger localBigInteger4 = zzd;
    localBigInteger4 = localBigInteger4.multiply(localBigInteger4).mod(paramBigInteger2);
    BigInteger localBigInteger5 = zzb.add(localBigInteger1);
    localBigInteger5 = localBigInteger5.multiply(localBigInteger5).mod(paramBigInteger2).subtract(localBigInteger2).subtract(localBigInteger3);
    BigInteger localBigInteger6 = zzd;
    localBigInteger5 = localBigInteger5.multiply(localBigInteger6);
    localBigInteger2 = localBigInteger2.multiply(zze).add(paramBigInteger1.multiply(localBigInteger4).multiply(localBigInteger4).mod(paramBigInteger2));
    paramBigInteger1 = localBigInteger2.multiply(localBigInteger2).mod(paramBigInteger2).subtract(localBigInteger5.multiply(localBigInteger6)).mod(paramBigInteger2);
    localBigInteger3 = localBigInteger2.multiply(localBigInteger5.subtract(paramBigInteger1)).mod(paramBigInteger2).subtract(localBigInteger3.multiply(zzg)).mod(paramBigInteger2);
    paramzzms = zzc.add(zzd);
    return new zzms(paramBigInteger1, localBigInteger3, paramzzms.multiply(paramzzms).mod(paramBigInteger2).subtract(localBigInteger1).subtract(localBigInteger4).mod(paramBigInteger2));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzms zza(ECPoint paramECPoint, BigInteger paramBigInteger)
  {
    if (paramECPoint.equals(ECPoint.POINT_INFINITY)) {
      return zzms.zza;
    }
    BigInteger localBigInteger1 = new BigInteger(1, zzpp.zza((paramBigInteger.bitLength() + 8) / 8)).mod(paramBigInteger);
    BigInteger localBigInteger2 = localBigInteger1.multiply(localBigInteger1).mod(paramBigInteger);
    BigInteger localBigInteger3 = localBigInteger2.multiply(localBigInteger1).mod(paramBigInteger);
    return new zzms(paramECPoint.getAffineX().multiply(localBigInteger2).mod(paramBigInteger), paramECPoint.getAffineY().multiply(localBigInteger3).mod(paramBigInteger), localBigInteger1);
  }
  
  public static BigInteger zza(EllipticCurve paramEllipticCurve)
  {
    paramEllipticCurve = paramEllipticCurve.getField();
    if ((paramEllipticCurve instanceof ECFieldFp)) {
      return ((ECFieldFp)paramEllipticCurve).getP();
    }
    throw new GeneralSecurityException("Only curves over prime order fields are supported");
  }
  
  private static ECParameterSpec zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    paramString1 = new BigInteger(paramString1);
    BigInteger localBigInteger = new BigInteger(paramString2);
    paramString2 = paramString1.subtract(new BigInteger("3"));
    paramString3 = new BigInteger(paramString3, 16);
    paramString4 = new BigInteger(paramString4, 16);
    paramString5 = new BigInteger(paramString5, 16);
    return new ECParameterSpec(new EllipticCurve(new ECFieldFp(paramString1), paramString2, paramString3), new ECPoint(paramString4, paramString5), localBigInteger, 1);
  }
  
  public static ECPoint zza(BigInteger paramBigInteger, ECParameterSpec paramECParameterSpec)
  {
    int i;
    if ((!zza(paramECParameterSpec, zza)) && (!zza(paramECParameterSpec, zzb)) && (!zza(paramECParameterSpec, zzc))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if (paramBigInteger.signum() == 1)
      {
        if (paramBigInteger.compareTo(paramECParameterSpec.getOrder()) < 0)
        {
          EllipticCurve localEllipticCurve = paramECParameterSpec.getCurve();
          Object localObject = paramECParameterSpec.getGenerator();
          zza((ECPoint)localObject, localEllipticCurve);
          BigInteger localBigInteger1 = paramECParameterSpec.getCurve().getA();
          BigInteger localBigInteger2 = zza(localEllipticCurve);
          paramECParameterSpec = zza(ECPoint.POINT_INFINITY, localBigInteger2);
          localObject = zza((ECPoint)localObject, localBigInteger2);
          for (i = paramBigInteger.bitLength(); i >= 0; i--) {
            if (paramBigInteger.testBit(i))
            {
              paramECParameterSpec = zza(paramECParameterSpec, (com.google.android.gms.internal.firebase-auth-api.zzms)localObject, localBigInteger1, localBigInteger2);
              localObject = zza((com.google.android.gms.internal.firebase-auth-api.zzms)localObject, localBigInteger1, localBigInteger2);
            }
            else
            {
              localObject = zza(paramECParameterSpec, (com.google.android.gms.internal.firebase-auth-api.zzms)localObject, localBigInteger1, localBigInteger2);
              paramECParameterSpec = zza(paramECParameterSpec, localBigInteger1, localBigInteger2);
            }
          }
          if (paramECParameterSpec.zza())
          {
            paramBigInteger = ECPoint.POINT_INFINITY;
          }
          else
          {
            paramBigInteger = zzd.modInverse(localBigInteger2);
            localObject = paramBigInteger.multiply(paramBigInteger).mod(localBigInteger2);
            paramBigInteger = new ECPoint(zzb.multiply((BigInteger)localObject).mod(localBigInteger2), zzc.multiply((BigInteger)localObject).mod(localBigInteger2).multiply(paramBigInteger).mod(localBigInteger2));
          }
          zza(paramBigInteger, localEllipticCurve);
          return paramBigInteger;
        }
        throw new GeneralSecurityException("k must be smaller than the order of the generator");
      }
      throw new GeneralSecurityException("k must be positive");
    }
    throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
  }
  
  public static void zza(ECPoint paramECPoint, EllipticCurve paramEllipticCurve)
  {
    BigInteger localBigInteger1 = zza(paramEllipticCurve);
    BigInteger localBigInteger2 = paramECPoint.getAffineX();
    paramECPoint = paramECPoint.getAffineY();
    if ((localBigInteger2 != null) && (paramECPoint != null))
    {
      if ((localBigInteger2.signum() != -1) && (localBigInteger2.compareTo(localBigInteger1) < 0))
      {
        if ((paramECPoint.signum() != -1) && (paramECPoint.compareTo(localBigInteger1) < 0))
        {
          if (paramECPoint.multiply(paramECPoint).mod(localBigInteger1).equals(localBigInteger2.multiply(localBigInteger2).add(paramEllipticCurve.getA()).multiply(localBigInteger2).add(paramEllipticCurve.getB()).mod(localBigInteger1))) {
            return;
          }
          throw new GeneralSecurityException("Point is not on curve");
        }
        throw new GeneralSecurityException("y is out of range");
      }
      throw new GeneralSecurityException("x is out of range");
    }
    throw new GeneralSecurityException("point is at infinity");
  }
  
  public static boolean zza(ECParameterSpec paramECParameterSpec1, ECParameterSpec paramECParameterSpec2)
  {
    return (paramECParameterSpec1.getCurve().equals(paramECParameterSpec2.getCurve())) && (paramECParameterSpec1.getGenerator().equals(paramECParameterSpec2.getGenerator())) && (paramECParameterSpec1.getOrder().equals(paramECParameterSpec2.getOrder())) && (paramECParameterSpec1.getCofactor() == paramECParameterSpec2.getCofactor());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */