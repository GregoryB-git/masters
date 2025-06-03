.class public final Ll3/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Ll3/l$c;

.field public d:Ll3/l$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll3/l$b;->a:Ljava/lang/Integer;

    iput-object v0, p0, Ll3/l$b;->b:Ljava/lang/Integer;

    iput-object v0, p0, Ll3/l$b;->c:Ll3/l$c;

    sget-object v0, Ll3/l$d;->e:Ll3/l$d;

    iput-object v0, p0, Ll3/l$b;->d:Ll3/l$d;

    return-void
.end method

.method public synthetic constructor <init>(Ll3/l$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ll3/l$b;-><init>()V

    return-void
.end method

.method public static f(ILl3/l$c;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0xa

    .line 4
    .line 5
    if-lt p0, v2, :cond_a

    .line 6
    .line 7
    sget-object v2, Ll3/l$c;->b:Ll3/l$c;

    .line 8
    .line 9
    if-ne p1, v2, :cond_1

    .line 10
    .line 11
    const/16 p1, 0x14

    .line 12
    .line 13
    if-gt p0, p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    aput-object p0, v1, v0

    .line 25
    .line 26
    const-string p0, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 27
    .line 28
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    sget-object v2, Ll3/l$c;->c:Ll3/l$c;

    .line 37
    .line 38
    if-ne p1, v2, :cond_3

    .line 39
    .line 40
    const/16 p1, 0x1c

    .line 41
    .line 42
    if-gt p0, p1, :cond_2

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 46
    .line 47
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-array v1, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object p0, v1, v0

    .line 54
    .line 55
    const-string p0, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 56
    .line 57
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_3
    sget-object v2, Ll3/l$c;->d:Ll3/l$c;

    .line 66
    .line 67
    if-ne p1, v2, :cond_5

    .line 68
    .line 69
    const/16 p1, 0x20

    .line 70
    .line 71
    if-gt p0, p1, :cond_4

    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-array v1, v1, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object p0, v1, v0

    .line 83
    .line 84
    const-string p0, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 85
    .line 86
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_5
    sget-object v2, Ll3/l$c;->e:Ll3/l$c;

    .line 95
    .line 96
    if-ne p1, v2, :cond_7

    .line 97
    .line 98
    const/16 p1, 0x30

    .line 99
    .line 100
    if-gt p0, p1, :cond_6

    .line 101
    .line 102
    return-void

    .line 103
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 104
    .line 105
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-array v1, v1, [Ljava/lang/Object;

    .line 110
    .line 111
    aput-object p0, v1, v0

    .line 112
    .line 113
    const-string p0, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 114
    .line 115
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_7
    sget-object v2, Ll3/l$c;->f:Ll3/l$c;

    .line 124
    .line 125
    if-ne p1, v2, :cond_9

    .line 126
    .line 127
    const/16 p1, 0x40

    .line 128
    .line 129
    if-gt p0, p1, :cond_8

    .line 130
    .line 131
    return-void

    .line 132
    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 133
    .line 134
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-array v1, v1, [Ljava/lang/Object;

    .line 139
    .line 140
    aput-object p0, v1, v0

    .line 141
    .line 142
    const-string p0, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 143
    .line 144
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 153
    .line 154
    const-string p1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    .line 155
    .line 156
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 161
    .line 162
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    new-array v1, v1, [Ljava/lang/Object;

    .line 167
    .line 168
    aput-object p0, v1, v0

    .line 169
    .line 170
    const-string p0, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 171
    .line 172
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
.end method


# virtual methods
.method public a()Ll3/l;
    .locals 8

    .line 1
    iget-object v0, p0, Ll3/l$b;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v1, p0, Ll3/l$b;->b:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v1, p0, Ll3/l$b;->c:Ll3/l$c;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Ll3/l$b;->d:Ll3/l$d;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Ll3/l$b;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Ll3/l$b;->c:Ll3/l$c;

    .line 32
    .line 33
    invoke-static {v0, v1}, Ll3/l$b;->f(ILl3/l$c;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ll3/l;

    .line 37
    .line 38
    iget-object v1, p0, Ll3/l$b;->a:Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget-object v1, p0, Ll3/l$b;->b:Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Ll3/l$b;->d:Ll3/l$d;

    .line 51
    .line 52
    iget-object v6, p0, Ll3/l$b;->c:Ll3/l$c;

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    move-object v2, v0

    .line 56
    invoke-direct/range {v2 .. v7}, Ll3/l;-><init>(IILl3/l$d;Ll3/l$c;Ll3/l$a;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 61
    .line 62
    iget-object v1, p0, Ll3/l$b;->a:Ljava/lang/Integer;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    new-array v2, v2, [Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    aput-object v1, v2, v3

    .line 69
    .line 70
    const-string v1, "Invalid key size in bytes %d; must be at least 16 bytes"

    .line 71
    .line 72
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 81
    .line 82
    const-string v1, "variant is not set"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 89
    .line 90
    const-string v1, "hash type is not set"

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 97
    .line 98
    const-string v1, "tag size is not set"

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 105
    .line 106
    const-string v1, "key size is not set"

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0
.end method

.method public b(Ll3/l$c;)Ll3/l$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ll3/l$b;->c:Ll3/l$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(I)Ll3/l$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ll3/l$b;->a:Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public d(I)Ll3/l$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ll3/l$b;->b:Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public e(Ll3/l$d;)Ll3/l$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ll3/l$b;->d:Ll3/l$d;

    .line 2
    .line 3
    return-object p0
.end method
