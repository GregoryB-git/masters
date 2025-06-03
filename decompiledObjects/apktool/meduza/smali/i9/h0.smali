.class public final synthetic Li9/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/i;


# instance fields
.field public final synthetic a:Li9/i0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Li9/i0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/h0;->a:Li9/i0;

    iput-object p2, p0, Li9/h0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Li9/h0;->a:Li9/i0;

    .line 2
    .line 3
    iget-object v1, p0, Li9/h0;->b:Ljava/lang/String;

    .line 4
    .line 5
    check-cast p1, Landroid/database/Cursor;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    :try_start_0
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-static {v6}, Lja/a;->N([B)Lja/a;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    new-instance v7, Lf9/j;

    .line 25
    .line 26
    iget-object v0, v0, Li9/i0;->b:Li9/i;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Lja/a;->J()Lja/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    sget-object v9, Lja/a$b;->b:Lja/a$b;

    .line 36
    .line 37
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    move v5, v4

    .line 44
    :cond_0
    iget-object v0, v0, Li9/i;->a:Lm9/e0;

    .line 45
    .line 46
    invoke-virtual {v6}, Lja/a;->K()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v6}, Lja/a;->L()Lka/z;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v8, v6}, Lm9/e0;->e(Ljava/lang/String;Lka/z;)Lg9/k0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v6, Lf9/i;

    .line 62
    .line 63
    invoke-direct {v6, v0, v5}, Lf9/i;-><init>(Lg9/k0;I)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lj9/q;

    .line 67
    .line 68
    new-instance v5, Lu7/m;

    .line 69
    .line 70
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-direct {v5, p1, v8, v9}, Lu7/m;-><init>(IJ)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v5}, Lj9/q;-><init>(Lu7/m;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, v1, v6, v0}, Lf9/j;-><init>(Ljava/lang/String;Lf9/i;Lj9/q;)V
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    move-object v2, v7

    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    new-array v0, v4, [Ljava/lang/Object;

    .line 91
    .line 92
    aput-object p1, v0, v3

    .line 93
    .line 94
    const-string p1, "NamedQuery failed to parse: %s"

    .line 95
    .line 96
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_1
    :goto_0
    return-object v2
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
.end method
