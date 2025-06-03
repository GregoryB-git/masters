.class public final Le3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lh3/b$b;

.field public static final d:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Ljavax/crypto/SecretKey;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lh3/b$b;->p:Lh3/b$b;

    .line 2
    .line 3
    sput-object v0, Le3/b;->c:Lh3/b$b;

    .line 4
    .line 5
    new-instance v0, Le3/b$a;

    .line 6
    .line 7
    invoke-direct {v0}, Le3/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Le3/b;->d:Ljava/lang/ThreadLocal;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le3/b;->c:Lh3/b$b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lh3/b$b;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    invoke-static {v0}, Lq3/r;->a(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 17
    .line 18
    const-string v1, "AES"

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Le3/b;->a:Ljavax/crypto/SecretKey;

    .line 24
    .line 25
    iput-boolean p2, p0, Le3/b;->b:Z

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 29
    .line 30
    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static c([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v1, v0}, Le3/b;->d([BII)Ljava/security/spec/AlgorithmParameterSpec;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static d([BII)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    .line 1
    invoke-static {}, Lq3/q;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lq3/q;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x13

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    .line 22
    .line 23
    const/16 v1, 0x80

    .line 24
    .line 25
    invoke-direct {v0, v1, p0, p1, p2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public a([B[B[B)[B
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0xc

    .line 3
    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    iget-boolean v0, p0, Le3/b;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x1c

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v2, 0x10

    .line 14
    .line 15
    :goto_0
    array-length v3, p2

    .line 16
    if-lt v3, v2, :cond_6

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p2, v2, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 37
    .line 38
    const-string p2, "iv does not match prepended iv"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_2
    :goto_1
    invoke-static {p1}, Le3/b;->c([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object v0, Le3/b;->d:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljavax/crypto/Cipher;

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    iget-object v5, p0, Le3/b;->a:Ljavax/crypto/SecretKey;

    .line 58
    .line 59
    invoke-virtual {v3, v4, v5, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 60
    .line 61
    .line 62
    if-eqz p3, :cond_3

    .line 63
    .line 64
    array-length p1, p3

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ljavax/crypto/Cipher;

    .line 72
    .line 73
    invoke-virtual {p1, p3}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-boolean p1, p0, Le3/b;->b:Z

    .line 77
    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    move v2, v1

    .line 81
    :cond_4
    if-eqz p1, :cond_5

    .line 82
    .line 83
    array-length p1, p2

    .line 84
    sub-int/2addr p1, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    array-length p1, p2

    .line 87
    :goto_2
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, Ljavax/crypto/Cipher;

    .line 92
    .line 93
    invoke-virtual {p3, p2, v2, p1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    const-string p2, "ciphertext too short"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 107
    .line 108
    const-string p2, "iv is wrong size"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public b([B[B[B)[B
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    array-length v2, p1

    .line 4
    const/16 v3, 0xc

    .line 5
    .line 6
    if-ne v2, v3, :cond_6

    .line 7
    .line 8
    array-length v2, p2

    .line 9
    const v4, 0x7fffffe3

    .line 10
    .line 11
    .line 12
    if-gt v2, v4, :cond_5

    .line 13
    .line 14
    iget-boolean v2, p0, Le3/b;->b:Z

    .line 15
    .line 16
    const/16 v4, 0x10

    .line 17
    .line 18
    array-length v5, p2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v5, v5, 0x1c

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    add-int/2addr v5, v4

    .line 25
    :goto_0
    new-array v5, v5, [B

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p1, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Le3/b;->c([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v2, Le3/b;->d:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljavax/crypto/Cipher;

    .line 43
    .line 44
    iget-object v7, p0, Le3/b;->a:Ljavax/crypto/SecretKey;

    .line 45
    .line 46
    invoke-virtual {v6, v0, v7, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 47
    .line 48
    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    array-length p1, p3

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljavax/crypto/Cipher;

    .line 59
    .line 60
    invoke-virtual {p1, p3}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-boolean p1, p0, Le3/b;->b:Z

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    move v11, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v11, v1

    .line 70
    :goto_1
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v6, p1

    .line 75
    check-cast v6, Ljavax/crypto/Cipher;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    array-length v9, p2

    .line 79
    move-object v7, p2

    .line 80
    move-object v10, v5

    .line 81
    invoke-virtual/range {v6 .. v11}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    array-length p3, p2

    .line 86
    add-int/2addr p3, v4

    .line 87
    if-ne p1, p3, :cond_4

    .line 88
    .line 89
    return-object v5

    .line 90
    :cond_4
    array-length p2, p2

    .line 91
    sub-int/2addr p1, p2

    .line 92
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 93
    .line 94
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 v2, 0x2

    .line 103
    new-array v2, v2, [Ljava/lang/Object;

    .line 104
    .line 105
    aput-object p3, v2, v1

    .line 106
    .line 107
    aput-object p1, v2, v0

    .line 108
    .line 109
    const-string p1, "encryption failed; GCM tag must be %s bytes, but got only %s bytes"

    .line 110
    .line 111
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2

    .line 119
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 120
    .line 121
    const-string p2, "plaintext too long"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 128
    .line 129
    const-string p2, "iv is wrong size"

    .line 130
    .line 131
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
.end method
