.class public Lg9/l;
.super Lg9/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/l$a;
    }
.end annotation


# instance fields
.field public final a:Lg9/l$a;

.field public final b:Lka/d0;

.field public final c:Lj9/l;


# direct methods
.method public constructor <init>(Lj9/l;Lg9/l$a;Lka/d0;)V
    .locals 0

    invoke-direct {p0}, Lg9/m;-><init>()V

    iput-object p1, p0, Lg9/l;->c:Lj9/l;

    iput-object p2, p0, Lg9/l;->a:Lg9/l$a;

    iput-object p3, p0, Lg9/l;->b:Lka/d0;

    return-void
.end method

.method public static e(Lj9/l;Lg9/l$a;Lka/d0;)Lg9/l;
    .locals 5

    .line 1
    sget-object v0, Lg9/l$a;->q:Lg9/l$a;

    .line 2
    .line 3
    sget-object v1, Lg9/l$a;->s:Lg9/l$a;

    .line 4
    .line 5
    sget-object v2, Lg9/l$a;->r:Lg9/l$a;

    .line 6
    .line 7
    sget-object v3, Lg9/l$a;->p:Lg9/l$a;

    .line 8
    .line 9
    invoke-virtual {p0}, Lj9/l;->u()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_3

    .line 14
    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    new-instance p1, Lg9/x;

    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, Lg9/x;-><init>(Lj9/l;Lka/d0;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    new-instance p1, Lg9/y;

    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, Lg9/y;-><init>(Lj9/l;Lka/d0;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    if-eq p1, v3, :cond_2

    .line 33
    .line 34
    if-eq p1, v0, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v0, v1

    .line 39
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v3, p1, Lg9/l$a;->a:Ljava/lang/String;

    .line 45
    .line 46
    const-string v4, "queries don\'t make sense on document keys"

    .line 47
    .line 48
    invoke-static {v2, v3, v4}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-array v1, v1, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lg9/w;

    .line 58
    .line 59
    invoke-direct {v0, p0, p1, p2}, Lg9/w;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    if-ne p1, v3, :cond_4

    .line 64
    .line 65
    new-instance p1, Lg9/c;

    .line 66
    .line 67
    invoke-direct {p1, p0, p2}, Lg9/c;-><init>(Lj9/l;Lka/d0;)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    if-ne p1, v2, :cond_5

    .line 72
    .line 73
    new-instance p1, Lg9/v;

    .line 74
    .line 75
    invoke-direct {p1, p0, p2}, Lg9/v;-><init>(Lj9/l;Lka/d0;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_5
    if-ne p1, v0, :cond_6

    .line 80
    .line 81
    new-instance p1, Lg9/b;

    .line 82
    .line 83
    invoke-direct {p1, p0, p2}, Lg9/b;-><init>(Lj9/l;Lka/d0;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_6
    if-ne p1, v1, :cond_7

    .line 88
    .line 89
    new-instance p1, Lg9/c0;

    .line 90
    .line 91
    invoke-direct {p1, p0, p2}, Lg9/c0;-><init>(Lj9/l;Lka/d0;)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_7
    new-instance v0, Lg9/l;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    .line 98
    .line 99
    .line 100
    return-object v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg9/l;->c:Lj9/l;

    .line 7
    .line 8
    invoke-virtual {v1}, Lj9/l;->h()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lg9/l;->a:Lg9/l$a;

    .line 16
    .line 17
    iget-object v1, v1, Lg9/l$a;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lg9/l;->b:Lka/d0;

    .line 23
    .line 24
    invoke-static {v1}, Lj9/s;->a(Lka/d0;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg9/m;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg9/l;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lj9/g;)Z
    .locals 4

    iget-object v0, p0, Lg9/l;->c:Lj9/l;

    invoke-interface {p1, v0}, Lj9/g;->g(Lj9/l;)Lka/d0;

    move-result-object p1

    iget-object v0, p0, Lg9/l;->a:Lg9/l$a;

    sget-object v1, Lg9/l$a;->e:Lg9/l$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    invoke-static {p1, v0}, Lj9/s;->c(Lka/d0;Lka/d0;)I

    move-result p1

    invoke-virtual {p0, p1}, Lg9/l;->g(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {p1}, Lj9/s;->n(Lka/d0;)I

    move-result v0

    iget-object v1, p0, Lg9/l;->b:Lka/d0;

    invoke-static {v1}, Lj9/s;->n(Lka/d0;)I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    invoke-static {p1, v0}, Lj9/s;->c(Lka/d0;Lka/d0;)I

    move-result p1

    invoke-virtual {p0, p1}, Lg9/l;->g(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    return v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Lg9/l;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lg9/l;

    iget-object v1, p0, Lg9/l;->a:Lg9/l$a;

    iget-object v2, p1, Lg9/l;->a:Lg9/l$a;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lg9/l;->c:Lj9/l;

    iget-object v2, p1, Lg9/l;->c:Lj9/l;

    invoke-virtual {v1, v2}, Lj9/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg9/l;->b:Lka/d0;

    iget-object p1, p1, Lg9/l;->b:Lka/d0;

    invoke-virtual {v1, p1}, Lma/w;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public final f()Z
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lg9/l$a;

    sget-object v1, Lg9/l$a;->b:Lg9/l$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lg9/l$a;->c:Lg9/l$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lg9/l$a;->f:Lg9/l$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lg9/l$a;->o:Lg9/l$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lg9/l$a;->e:Lg9/l$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lg9/l$a;->s:Lg9/l$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lg9/l;->a:Lg9/l$a;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g(I)Z
    .locals 4

    iget-object v0, p0, Lg9/l;->a:Lg9/l$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_a

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_4

    const/4 v3, 0x4

    if-eq v0, v3, :cond_2

    const/4 v3, 0x5

    if-ne v0, v3, :cond_1

    if-ltz p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    new-array p1, v2, [Ljava/lang/Object;

    iget-object v0, p0, Lg9/l;->a:Lg9/l$a;

    aput-object v0, p1, v1

    const-string v0, "Unknown FieldFilter operator: %s"

    invoke-static {v0, p1}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    if-lez p1, :cond_3

    move v1, v2

    :cond_3
    return v1

    :cond_4
    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1

    :cond_6
    if-nez p1, :cond_7

    move v1, v2

    :cond_7
    return v1

    :cond_8
    if-gtz p1, :cond_9

    move v1, v2

    :cond_9
    return v1

    :cond_a
    if-gez p1, :cond_b

    move v1, v2

    :cond_b
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg9/l;->a:Lg9/l$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x47b

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg9/l;->c:Lj9/l;

    invoke-virtual {v1}, Lj9/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    invoke-virtual {v0}, Lma/w;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg9/l;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
