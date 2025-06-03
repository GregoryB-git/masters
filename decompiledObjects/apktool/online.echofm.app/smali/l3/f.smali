.class public abstract Ll3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr3/a;

.field public static final b:Lk3/k;

.field public static final c:Lk3/j;

.field public static final d:Lk3/c;

.field public static final e:Lk3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 2
    .line 3
    invoke-static {v0}, Lk3/t;->e(Ljava/lang/String;)Lr3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ll3/f;->a:Lr3/a;

    .line 8
    .line 9
    new-instance v1, Ld3/j;

    .line 10
    .line 11
    invoke-direct {v1}, Ld3/j;-><init>()V

    .line 12
    .line 13
    .line 14
    const-class v2, Ll3/d;

    .line 15
    .line 16
    const-class v3, Lk3/p;

    .line 17
    .line 18
    invoke-static {v1, v2, v3}, Lk3/k;->a(Lk3/k$b;Ljava/lang/Class;Ljava/lang/Class;)Lk3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sput-object v1, Ll3/f;->b:Lk3/k;

    .line 23
    .line 24
    new-instance v1, Ld3/k;

    .line 25
    .line 26
    invoke-direct {v1}, Ld3/k;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0, v3}, Lk3/j;->a(Lk3/j$b;Lr3/a;Ljava/lang/Class;)Lk3/j;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Ll3/f;->c:Lk3/j;

    .line 34
    .line 35
    new-instance v1, Ld3/l;

    .line 36
    .line 37
    invoke-direct {v1}, Ld3/l;-><init>()V

    .line 38
    .line 39
    .line 40
    const-class v2, Ll3/a;

    .line 41
    .line 42
    const-class v3, Lk3/o;

    .line 43
    .line 44
    invoke-static {v1, v2, v3}, Lk3/c;->a(Lk3/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lk3/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sput-object v1, Ll3/f;->d:Lk3/c;

    .line 49
    .line 50
    new-instance v1, Ll3/e;

    .line 51
    .line 52
    invoke-direct {v1}, Ll3/e;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0, v3}, Lk3/b;->a(Lk3/b$b;Lr3/a;Ljava/lang/Class;)Lk3/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Ll3/f;->e:Lk3/b;

    .line 60
    .line 61
    return-void
.end method

.method public static synthetic a(Lk3/o;Lc3/y;)Ll3/a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ll3/f;->b(Lk3/o;Lc3/y;)Ll3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static b(Lk3/o;Lc3/y;)Ll3/a;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk3/o;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Lk3/o;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lp3/a;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lp3/a;->a0()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-static {}, Ll3/d;->a()Ll3/d$b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0}, Lp3/a;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Ll3/d$b;->b(I)Ll3/d$b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0}, Lp3/a;->Z()Lp3/c;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Lp3/c;->X()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v1, v2}, Ll3/d$b;->c(I)Ll3/d$b;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p0}, Lk3/o;->e()Lp3/I;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Ll3/f;->e(Lp3/I;)Ll3/d$c;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ll3/d$b;->d(Ll3/d$c;)Ll3/d$b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ll3/d$b;->a()Ll3/d;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {}, Ll3/a;->c()Ll3/a$b;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, v1}, Ll3/a$b;->e(Ll3/d;)Ll3/a$b;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0}, Lp3/a;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->Y()[B

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p1}, Lc3/y;->b(Lc3/y;)Lc3/y;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {v0, p1}, Lr3/b;->a([BLc3/y;)Lr3/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Ll3/a$b;->c(Lr3/b;)Ll3/a$b;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0}, Lk3/o;->c()Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p1, p0}, Ll3/a$b;->d(Ljava/lang/Integer;)Ll3/a$b;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ll3/a$b;->a()Ll3/a;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 117
    .line 118
    const-string p1, "Only version 0 keys are accepted"

    .line 119
    .line 120
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/A; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 125
    .line 126
    const-string p1, "Parsing AesCmacKey failed"

    .line 127
    .line 128
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 133
    .line 134
    const-string p1, "Wrong type URL in call to AesCmacParameters.parseParameters"

    .line 135
    .line 136
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0
.end method

.method public static c()V
    .locals 1

    .line 1
    invoke-static {}, Lk3/i;->a()Lk3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ll3/f;->d(Lk3/i;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static d(Lk3/i;)V
    .locals 1

    .line 1
    sget-object v0, Ll3/f;->b:Lk3/k;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk3/i;->h(Lk3/k;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll3/f;->c:Lk3/j;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lk3/i;->g(Lk3/j;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ll3/f;->d:Lk3/c;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lk3/i;->f(Lk3/c;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ll3/f;->e:Lk3/b;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lk3/i;->e(Lk3/b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static e(Lp3/I;)Ll3/d$c;
    .locals 3

    .line 1
    sget-object v0, Ll3/f$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget-object p0, Ll3/d$c;->e:Ll3/d$c;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Unable to parse OutputPrefixType: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lp3/I;->g()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    sget-object p0, Ll3/d$c;->d:Ll3/d$c;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    sget-object p0, Ll3/d$c;->c:Ll3/d$c;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    sget-object p0, Ll3/d$c;->b:Ll3/d$c;

    .line 58
    .line 59
    return-object p0
.end method
