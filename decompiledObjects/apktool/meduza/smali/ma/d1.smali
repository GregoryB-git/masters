.class public final Lma/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lma/d1;


# instance fields
.field public final a:Lma/k0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lma/d1;

    invoke-direct {v0}, Lma/d1;-><init>()V

    sput-object v0, Lma/d1;->c:Lma/d1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lma/d1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lma/k0;

    invoke-direct {v0}, Lma/k0;-><init>()V

    iput-object v0, p0, Lma/d1;->a:Lma/k0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lma/i1;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lma/i1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lma/a0;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-eqz p1, :cond_d

    .line 4
    .line 5
    iget-object v0, p0, Lma/d1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lma/i1;

    .line 12
    .line 13
    if-nez v0, :cond_c

    .line 14
    .line 15
    iget-object v0, p0, Lma/d1;->a:Lma/k0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-class v1, Lma/w;

    .line 21
    .line 22
    sget-object v2, Lma/j1;->a:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, Lma/j1;->a:Ljava/lang/Class;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    iget-object v0, v0, Lma/k0;->a:Lma/r0;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Lma/r0;->a(Ljava/lang/Class;)Lma/q0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Lma/q0;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const-string v3, "Protobuf runtime is not correctly loaded."

    .line 60
    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    sget-object v1, Lma/j1;->c:Lma/r1;

    .line 70
    .line 71
    sget-object v2, Lma/r;->a:Lma/q;

    .line 72
    .line 73
    invoke-interface {v0}, Lma/q0;->b()Lma/s0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v3, Lma/w0;

    .line 78
    .line 79
    invoke-direct {v3, v1, v2, v0}, Lma/w0;-><init>(Lma/p1;Lma/p;Lma/s0;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    sget-object v1, Lma/j1;->b:Lma/p1;

    .line 84
    .line 85
    sget-object v2, Lma/r;->b:Lma/p;

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    invoke-interface {v0}, Lma/q0;->b()Lma/s0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v3, Lma/w0;

    .line 94
    .line 95
    invoke-direct {v3, v1, v2, v0}, Lma/w0;-><init>(Lma/p1;Lma/p;Lma/s0;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    move-object v0, v3

    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_4
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v4, 0x1

    .line 113
    const/4 v5, 0x0

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    invoke-interface {v0}, Lma/q0;->c()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {v1}, Lq0/g;->c(I)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eq v1, v4, :cond_5

    .line 125
    .line 126
    move v2, v4

    .line 127
    :cond_5
    if-eqz v2, :cond_6

    .line 128
    .line 129
    sget-object v1, Lma/z0;->b:Lma/y0;

    .line 130
    .line 131
    sget-object v2, Lma/i0;->b:Lma/i0$b;

    .line 132
    .line 133
    sget-object v3, Lma/j1;->c:Lma/r1;

    .line 134
    .line 135
    sget-object v4, Lma/r;->a:Lma/q;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    sget-object v1, Lma/z0;->b:Lma/y0;

    .line 139
    .line 140
    sget-object v2, Lma/i0;->b:Lma/i0$b;

    .line 141
    .line 142
    sget-object v3, Lma/j1;->c:Lma/r1;

    .line 143
    .line 144
    move-object v4, v5

    .line 145
    :goto_2
    sget-object v6, Lma/p0;->b:Lma/o0;

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    invoke-interface {v0}, Lma/q0;->c()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v1}, Lq0/g;->c(I)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eq v1, v4, :cond_8

    .line 157
    .line 158
    move v2, v4

    .line 159
    :cond_8
    if-eqz v2, :cond_a

    .line 160
    .line 161
    sget-object v1, Lma/z0;->a:Lma/x0;

    .line 162
    .line 163
    sget-object v2, Lma/i0;->a:Lma/i0$a;

    .line 164
    .line 165
    sget-object v4, Lma/j1;->b:Lma/p1;

    .line 166
    .line 167
    sget-object v6, Lma/r;->b:Lma/p;

    .line 168
    .line 169
    if-eqz v6, :cond_9

    .line 170
    .line 171
    move-object v3, v4

    .line 172
    move-object v4, v6

    .line 173
    goto :goto_3

    .line 174
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_a
    sget-object v1, Lma/z0;->a:Lma/x0;

    .line 181
    .line 182
    sget-object v2, Lma/i0;->a:Lma/i0$a;

    .line 183
    .line 184
    sget-object v3, Lma/j1;->b:Lma/p1;

    .line 185
    .line 186
    move-object v4, v5

    .line 187
    :goto_3
    sget-object v6, Lma/p0;->a:Lma/n0;

    .line 188
    .line 189
    :goto_4
    move-object v8, v1

    .line 190
    move-object v9, v2

    .line 191
    move-object v10, v3

    .line 192
    move-object v11, v4

    .line 193
    move-object v12, v6

    .line 194
    sget-object v1, Lma/v0;->q:[I

    .line 195
    .line 196
    instance-of v1, v0, Lma/f1;

    .line 197
    .line 198
    if-eqz v1, :cond_b

    .line 199
    .line 200
    move-object v7, v0

    .line 201
    check-cast v7, Lma/f1;

    .line 202
    .line 203
    invoke-static/range {v7 .. v12}, Lma/v0;->B(Lma/f1;Lma/x0;Lma/i0;Lma/p1;Lma/p;Lma/n0;)Lma/v0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_5
    iget-object v1, p0, Lma/d1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 208
    .line 209
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Lma/i1;

    .line 214
    .line 215
    if-eqz p1, :cond_c

    .line 216
    .line 217
    move-object v0, p1

    .line 218
    goto :goto_6

    .line 219
    :cond_b
    check-cast v0, Lma/m1;

    .line 220
    .line 221
    throw v5

    .line 222
    :cond_c
    :goto_6
    return-object v0

    .line 223
    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    .line 224
    .line 225
    const-string v0, "messageType"

    .line 226
    .line 227
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p1
    .line 231
    .line 232
    .line 233
.end method
