.class public final La1/h;
.super La1/i;
.source "SourceFile"


# static fields
.field public static final o:[B

.field public static final p:[B


# instance fields
.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, La1/h;->o:[B

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, La1/h;->p:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La1/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static n(Lg0/z;[B)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    array-length v1, p1

    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    array-length v3, p1

    .line 18
    invoke-virtual {p0, v1, v2, v3}, Lg0/z;->l([BII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public static o(Lg0/z;)Z
    .locals 1

    .line 1
    sget-object v0, La1/h;->o:[B

    .line 2
    .line 3
    invoke-static {p0, v0}, La1/h;->n(Lg0/z;[B)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method


# virtual methods
.method public f(Lg0/z;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LF0/K;->e([B)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, La1/i;->c(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public i(Lg0/z;JLa1/i$b;)Z
    .locals 2

    .line 1
    sget-object p2, La1/h;->o:[B

    .line 2
    .line 3
    invoke-static {p1, p2}, La1/h;->n(Lg0/z;[B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, LF0/K;->c([B)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p1}, LF0/K;->a([B)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p4, La1/i$b;->a:Ld0/q;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return p3

    .line 35
    :cond_0
    new-instance v0, Ld0/q$b;

    .line 36
    .line 37
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "audio/opus"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p2}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const v0, 0xbb80

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, p1}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p4, La1/i$b;->a:Ld0/q;

    .line 66
    .line 67
    return p3

    .line 68
    :cond_1
    sget-object p2, La1/h;->p:[B

    .line 69
    .line 70
    invoke-static {p1, p2}, La1/h;->n(Lg0/z;[B)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p4, La1/i$b;->a:Ld0/q;

    .line 78
    .line 79
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget-boolean v0, p0, La1/h;->n:Z

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    return p3

    .line 87
    :cond_2
    iput-boolean p3, p0, La1/h;->n:Z

    .line 88
    .line 89
    array-length p2, p2

    .line 90
    invoke-virtual {p1, p2}, Lg0/z;->U(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v1, v1}, LF0/W;->k(Lg0/z;ZZ)LF0/W$a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, LF0/W$a;->b:[Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {p1}, LX2/v;->V([Ljava/lang/Object;)LX2/v;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, LF0/W;->d(Ljava/util/List;)Ld0/x;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    return p3

    .line 110
    :cond_3
    iget-object p2, p4, La1/i$b;->a:Ld0/q;

    .line 111
    .line 112
    invoke-virtual {p2}, Ld0/q;->a()Ld0/q$b;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iget-object v0, p4, La1/i$b;->a:Ld0/q;

    .line 117
    .line 118
    iget-object v0, v0, Ld0/q;->k:Ld0/x;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ld0/x;->b(Ld0/x;)Ld0/x;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p2, p1}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_0

    .line 129
    :cond_4
    iget-object p1, p4, La1/i$b;->a:Ld0/q;

    .line 130
    .line 131
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    return v1
.end method

.method public l(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La1/i;->l(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, La1/h;->n:Z

    .line 8
    .line 9
    :cond_0
    return-void
.end method
