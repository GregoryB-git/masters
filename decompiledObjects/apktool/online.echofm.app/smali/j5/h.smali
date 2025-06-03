.class public Lj5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# instance fields
.field public final a:Ljavax/crypto/Cipher;

.field public final b:Ljava/security/SecureRandom;

.field public c:Ljava/security/Key;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj5/a;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/security/SecureRandom;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj5/h;->b:Ljava/security/SecureRandom;

    .line 10
    .line 11
    invoke-virtual {p0}, Lj5/h;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "FlutterSecureKeyStorage"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Lj5/h;->d()Ljavax/crypto/Cipher;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iput-object v3, p0, Lj5/h;->a:Ljavax/crypto/Cipher;

    .line 36
    .line 37
    const-string v3, "AES"

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p2, p1, v3}, Lj5/a;->b([BLjava/lang/String;)Ljava/security/Key;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lj5/h;->c:Ljava/security/Key;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p1

    .line 53
    const-string v4, "StorageCipher18Impl"

    .line 54
    .line 55
    const-string v5, "unwrap key failed"

    .line 56
    .line 57
    invoke-static {v4, v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :cond_0
    const/16 p1, 0x10

    .line 61
    .line 62
    new-array p1, p1, [B

    .line 63
    .line 64
    iget-object v4, p0, Lj5/h;->b:Ljava/security/SecureRandom;

    .line 65
    .line 66
    invoke-virtual {v4, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    .line 70
    .line 71
    invoke-direct {v4, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v4, p0, Lj5/h;->c:Ljava/security/Key;

    .line 75
    .line 76
    invoke-interface {p2, v4}, Lj5/a;->a(Ljava/security/Key;)[B

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 88
    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj5/h;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [B

    .line 6
    .line 7
    iget-object v2, p0, Lj5/h;->b:Ljava/security/SecureRandom;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lj5/h;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, p0, Lj5/h;->a:Ljavax/crypto/Cipher;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    iget-object v5, p0, Lj5/h;->c:Ljava/security/Key;

    .line 20
    .line 21
    invoke-virtual {v3, v4, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lj5/h;->a:Ljavax/crypto/Cipher;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    array-length v2, p1

    .line 31
    add-int/2addr v2, v0

    .line 32
    new-array v2, v2, [B

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    array-length v1, p1

    .line 39
    invoke-static {p1, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    return-object v2
.end method

.method public b([B)[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj5/h;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lj5/h;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    array-length v3, p1

    .line 16
    invoke-virtual {p0}, Lj5/h;->e()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    sub-int/2addr v3, v4

    .line 21
    new-array v4, v3, [B

    .line 22
    .line 23
    invoke-static {p1, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lj5/h;->a:Ljavax/crypto/Cipher;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iget-object v2, p0, Lj5/h;->c:Ljava/security/Key;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lj5/h;->a:Ljavax/crypto/Cipher;

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK"

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljavax/crypto/Cipher;
    .locals 1

    .line 1
    const-string v0, "AES/CBC/PKCS7Padding"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    return v0
.end method

.method public f([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    .line 1
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
