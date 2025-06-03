.class public Ld3/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lc3/v;

.field public final b:Ln3/b$a;

.field public final c:Ln3/b$a;


# direct methods
.method public constructor <init>(Lc3/v;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/d$b;->a:Lc3/v;

    invoke-virtual {p1}, Lc3/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lk3/g;->b()Lk3/g;

    move-result-object v0

    invoke-virtual {v0}, Lk3/g;->a()Ln3/b;

    move-result-object v0

    invoke-static {p1}, Lk3/f;->a(Lc3/v;)Ln3/c;

    move-result-object p1

    const-string v1, "encrypt"

    const-string v2, "aead"

    invoke-interface {v0, p1, v2, v1}, Ln3/b;->a(Ln3/c;Ljava/lang/String;Ljava/lang/String;)Ln3/b$a;

    move-result-object v1

    iput-object v1, p0, Ld3/d$b;->b:Ln3/b$a;

    const-string v1, "decrypt"

    invoke-interface {v0, p1, v2, v1}, Ln3/b;->a(Ln3/c;Ljava/lang/String;Ljava/lang/String;)Ln3/b$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld3/d$b;->c:Ln3/b$a;

    goto :goto_1

    :cond_0
    sget-object p1, Lk3/f;->a:Ln3/b$a;

    iput-object p1, p0, Ld3/d$b;->b:Ln3/b$a;

    goto :goto_0

    :goto_1
    return-void
.end method

.method public synthetic constructor <init>(Lc3/v;Ld3/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld3/d$b;-><init>(Lc3/v;)V

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    new-array v0, v0, [[B

    .line 3
    .line 4
    iget-object v1, p0, Ld3/d$b;->a:Lc3/v;

    .line 5
    .line 6
    invoke-virtual {v1}, Lc3/v;->e()Lc3/v$c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lc3/v$c;->b()[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    iget-object v1, p0, Ld3/d$b;->a:Lc3/v;

    .line 18
    .line 19
    invoke-virtual {v1}, Lc3/v;->e()Lc3/v$c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lc3/v$c;->g()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lc3/a;

    .line 28
    .line 29
    invoke-interface {v1, p1, p2}, Lc3/a;->a([B[B)[B

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const/4 v1, 0x1

    .line 34
    aput-object p2, v0, v1

    .line 35
    .line 36
    invoke-static {v0}, Lq3/f;->a([[B)[B

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object v0, p0, Ld3/d$b;->b:Ln3/b$a;

    .line 41
    .line 42
    iget-object v1, p0, Ld3/d$b;->a:Lc3/v;

    .line 43
    .line 44
    invoke-virtual {v1}, Lc3/v;->e()Lc3/v$c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lc3/v$c;->d()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    array-length p1, p1

    .line 53
    int-to-long v2, p1

    .line 54
    invoke-interface {v0, v1, v2, v3}, Ln3/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :catch_0
    move-exception p1

    .line 59
    iget-object p2, p0, Ld3/d$b;->b:Ln3/b$a;

    .line 60
    .line 61
    invoke-interface {p2}, Ln3/b$a;->a()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public b([B[B)[B
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x5

    .line 3
    if-le v0, v1, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v2, p1

    .line 10
    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Ld3/d$b;->a:Lc3/v;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lc3/v;->f([B)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lc3/v$c;

    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v2}, Lc3/v$c;->g()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lc3/a;

    .line 41
    .line 42
    invoke-interface {v3, v1, p2}, Lc3/a;->b([B[B)[B

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v4, p0, Ld3/d$b;->c:Ln3/b$a;

    .line 47
    .line 48
    invoke-virtual {v2}, Lc3/v$c;->d()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    array-length v5, v1

    .line 53
    int-to-long v5, v5

    .line 54
    invoke-interface {v4, v2, v5, v6}, Ln3/b$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :catch_0
    move-exception v2

    .line 59
    invoke-static {}, Ld3/d;->d()Ljava/util/logging/Logger;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v5, "ciphertext prefix matches a key, but cannot decrypt: "

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Ld3/d$b;->a:Lc3/v;

    .line 85
    .line 86
    invoke-virtual {v0}, Lc3/v;->h()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lc3/v$c;

    .line 105
    .line 106
    :try_start_1
    invoke-virtual {v1}, Lc3/v$c;->g()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lc3/a;

    .line 111
    .line 112
    invoke-interface {v2, p1, p2}, Lc3/a;->b([B[B)[B

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v3, p0, Ld3/d$b;->c:Ln3/b$a;

    .line 117
    .line 118
    invoke-virtual {v1}, Lc3/v$c;->d()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    array-length v4, p1

    .line 123
    int-to-long v4, v4

    .line 124
    invoke-interface {v3, v1, v4, v5}, Ln3/b$a;->b(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_1
    iget-object p1, p0, Ld3/d$b;->c:Ln3/b$a;

    .line 129
    .line 130
    invoke-interface {p1}, Ln3/b$a;->a()V

    .line 131
    .line 132
    .line 133
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 134
    .line 135
    const-string p2, "decryption failed"

    .line 136
    .line 137
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1
.end method
