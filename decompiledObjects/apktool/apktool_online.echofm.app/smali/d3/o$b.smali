.class public Ld3/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ld3/q;

.field public b:Lr3/b;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o$b;->a:Ld3/q;

    iput-object v0, p0, Ld3/o$b;->b:Lr3/b;

    iput-object v0, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ld3/o$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ld3/o$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ld3/o;
    .locals 8

    .line 1
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, Ld3/o$b;->b:Lr3/b;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {v0}, Ld3/q;->c()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Ld3/o$b;->b:Lr3/b;

    .line 14
    .line 15
    invoke-virtual {v1}, Lr3/b;->b()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v0, v1, :cond_4

    .line 20
    .line 21
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 22
    .line 23
    invoke-virtual {v0}, Ld3/q;->f()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 35
    .line 36
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 43
    .line 44
    invoke-virtual {v0}, Ld3/q;->f()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 56
    .line 57
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ld3/o$b;->b()Lr3/a;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    new-instance v0, Ld3/o;

    .line 68
    .line 69
    iget-object v3, p0, Ld3/o$b;->a:Ld3/q;

    .line 70
    .line 71
    iget-object v4, p0, Ld3/o$b;->b:Lr3/b;

    .line 72
    .line 73
    iget-object v6, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    move-object v2, v0

    .line 77
    invoke-direct/range {v2 .. v7}, Ld3/o;-><init>(Ld3/q;Lr3/b;Lr3/a;Ljava/lang/Integer;Ld3/o$a;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 82
    .line 83
    const-string v1, "Key size mismatch"

    .line 84
    .line 85
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 90
    .line 91
    const-string v1, "Cannot build without parameters and/or key material"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public final b()Lr3/a;
    .locals 4

    .line 1
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld3/q;->e()Ld3/q$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ld3/q$c;->d:Ld3/q$c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-array v0, v2, [B

    .line 13
    .line 14
    invoke-static {v0}, Lr3/a;->a([B)Lr3/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld3/q;->e()Ld3/q$c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ld3/q$c;->c:Ld3/q$c;

    .line 26
    .line 27
    const/4 v3, 0x5

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lr3/a;->a([B)Lr3/a;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_1
    iget-object v0, p0, Ld3/o$b;->a:Ld3/q;

    .line 58
    .line 59
    invoke-virtual {v0}, Ld3/q;->e()Ld3/q$c;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Ld3/q$c;->b:Ld3/q$c;

    .line 64
    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lr3/a;->a([B)Lr3/a;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "Unknown AesGcmParameters.Variant: "

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Ld3/o$b;->a:Ld3/q;

    .line 108
    .line 109
    invoke-virtual {v2}, Ld3/q;->e()Ld3/q$c;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0
.end method

.method public c(Ljava/lang/Integer;)Ld3/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/o$b;->c:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Lr3/b;)Ld3/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/o$b;->b:Lr3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Ld3/q;)Ld3/o$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/o$b;->a:Ld3/q;

    .line 2
    .line 3
    return-object p0
.end method
