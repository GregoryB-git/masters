package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class zzyi {
    public static int zza(EllipticCurve ellipticCurve) {
        return (zzmt.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) {
        BigInteger zza = zzmt.zza(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zza);
        if (zza.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(zza);
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (!mod2.equals(bigInteger3)) {
            if (zza.testBit(0) && zza.testBit(1)) {
                bigInteger2 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
            } else if (zza.testBit(0) && !zza.testBit(1)) {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = zza.subtract(bigInteger2).shiftRight(1);
                int i10 = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zza);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, zza);
                    BigInteger bigInteger4 = BigInteger.ONE;
                    if (modPow.add(bigInteger4).equals(zza)) {
                        BigInteger shiftRight2 = zza.add(bigInteger4).shiftRight(1);
                        BigInteger bigInteger5 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                            bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(zza).multiply(mod3)).mod(zza);
                            BigInteger mod4 = multiply.add(multiply).mod(zza);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod5 = bigInteger5.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(zza);
                                bigInteger4 = bigInteger2.multiply(mod4).add(bigInteger5).mod(zza);
                                bigInteger5 = mod5;
                            } else {
                                bigInteger4 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger5;
                    } else {
                        if (!modPow.equals(bigInteger4)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigInteger2 = bigInteger2.add(bigInteger4);
                        i10++;
                        if (i10 == 128 && !zza.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
                bigInteger3 = bigInteger2;
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger3 = bigInteger2;
        }
        return z10 != bigInteger3.testBit(0) ? zza.subtract(bigInteger3).mod(zza) : bigInteger3;
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator zza = zzym.zzd.zza("EC");
        zza.initialize(eCParameterSpec);
        return zza.generateKeyPair();
    }

    public static ECPrivateKey zza(zzyl zzylVar, byte[] bArr) {
        return (ECPrivateKey) zzym.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzmo.zza(bArr), zza(zzylVar)));
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzyk zzykVar, byte[] bArr) {
        return (ECPublicKey) zzym.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzykVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzyl zzylVar) {
        int ordinal = zzylVar.ordinal();
        if (ordinal == 0) {
            return zzmt.zza;
        }
        if (ordinal == 1) {
            return zzmt.zzb;
        }
        if (ordinal == 2) {
            return zzmt.zzc;
        }
        throw new NoSuchAlgorithmException(f.j("curve not implemented:", String.valueOf(zzylVar)));
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (zzmt.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                return zza(eCPrivateKey, eCPublicKey.getW());
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) {
        zzmt.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = zzym.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement zza = zzym.zzc.zza("ECDH");
        zza.init(eCPrivateKey);
        try {
            zza.doPhase(generatePublic, true);
            byte[] generateSecret = zza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmt.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzyk zzykVar, byte[] bArr) {
        ECPoint eCPoint;
        int zza = zza(ellipticCurve);
        int ordinal = zzykVar.ordinal();
        boolean z10 = false;
        if (ordinal != 0) {
            if (ordinal == 1) {
                BigInteger zza2 = zzmt.zza(ellipticCurve);
                if (bArr.length != zza + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                byte b10 = bArr[0];
                if (b10 != 2) {
                    if (b10 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z10 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(zza2) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                return new ECPoint(bigInteger, zza(bigInteger, z10, ellipticCurve));
            }
            if (ordinal != 2) {
                throw new GeneralSecurityException(f.j("invalid format:", String.valueOf(zzykVar)));
            }
            if (bArr.length != zza * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, bArr.length)));
        } else {
            if (bArr.length != (zza * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i10 = zza + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i10)), new BigInteger(1, Arrays.copyOfRange(bArr, i10, bArr.length)));
        }
        zzmt.zza(eCPoint, ellipticCurve);
        return eCPoint;
    }
}
