.class public final Le5/n$c;
.super Lz4/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La4/d;",
            ">;"
        }
    .end annotation
.end field

.field public I:La4/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lt5/b;La4/h;La4/g$a;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lz4/b0;-><init>(Lt5/b;La4/h;La4/g$a;)V

    iput-object p4, p0, Le5/n$c;->H:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final c(JIIILc4/v$a;)V
    .locals 0

    invoke-super/range {p0 .. p6}, Lz4/b0;->c(JIIILc4/v$a;)V

    return-void
.end method

.method public final l(Lv3/i0;)Lv3/i0;
    .locals 9

    .line 1
    iget-object v0, p0, Le5/n$c;->I:La4/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lv3/i0;->w:La4/d;

    .line 7
    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Le5/n$c;->H:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v2, v0, La4/d;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La4/d;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :cond_1
    iget-object v1, p1, Lv3/i0;->r:Lp4/a;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    :goto_1
    move-object v1, v2

    .line 29
    goto :goto_6

    .line 30
    :cond_2
    iget-object v3, v1, Lp4/a;->a:[Lp4/a$b;

    .line 31
    .line 32
    array-length v3, v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    :goto_2
    const/4 v6, -0x1

    .line 36
    if-ge v5, v3, :cond_4

    .line 37
    .line 38
    iget-object v7, v1, Lp4/a;->a:[Lp4/a$b;

    .line 39
    .line 40
    aget-object v7, v7, v5

    .line 41
    .line 42
    instance-of v8, v7, Lu4/k;

    .line 43
    .line 44
    if-eqz v8, :cond_3

    .line 45
    .line 46
    check-cast v7, Lu4/k;

    .line 47
    .line 48
    iget-object v7, v7, Lu4/k;->b:Ljava/lang/String;

    .line 49
    .line 50
    const-string v8, "com.apple.streaming.transportStreamTimestamp"

    .line 51
    .line 52
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_3

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move v5, v6

    .line 63
    :goto_3
    if-ne v5, v6, :cond_5

    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_5
    const/4 v6, 0x1

    .line 67
    if-ne v3, v6, :cond_6

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_6
    add-int/lit8 v2, v3, -0x1

    .line 71
    .line 72
    new-array v2, v2, [Lp4/a$b;

    .line 73
    .line 74
    :goto_4
    if-ge v4, v3, :cond_9

    .line 75
    .line 76
    if-eq v4, v5, :cond_8

    .line 77
    .line 78
    if-ge v4, v5, :cond_7

    .line 79
    .line 80
    move v6, v4

    .line 81
    goto :goto_5

    .line 82
    :cond_7
    add-int/lit8 v6, v4, -0x1

    .line 83
    .line 84
    :goto_5
    iget-object v7, v1, Lp4/a;->a:[Lp4/a$b;

    .line 85
    .line 86
    aget-object v7, v7, v4

    .line 87
    .line 88
    aput-object v7, v2, v6

    .line 89
    .line 90
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_9
    new-instance v1, Lp4/a;

    .line 94
    .line 95
    invoke-direct {v1, v2}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 96
    .line 97
    .line 98
    :goto_6
    iget-object v2, p1, Lv3/i0;->w:La4/d;

    .line 99
    .line 100
    if-ne v0, v2, :cond_a

    .line 101
    .line 102
    iget-object v2, p1, Lv3/i0;->r:Lp4/a;

    .line 103
    .line 104
    if-eq v1, v2, :cond_b

    .line 105
    .line 106
    :cond_a
    invoke-virtual {p1}, Lv3/i0;->a()Lv3/i0$a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object v0, p1, Lv3/i0$a;->n:La4/d;

    .line 111
    .line 112
    iput-object v1, p1, Lv3/i0$a;->i:Lp4/a;

    .line 113
    .line 114
    invoke-virtual {p1}, Lv3/i0$a;->a()Lv3/i0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_b
    invoke-super {p0, p1}, Lz4/b0;->l(Lv3/i0;)Lv3/i0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1
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
.end method
