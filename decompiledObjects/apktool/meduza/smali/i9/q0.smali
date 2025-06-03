.class public final synthetic Li9/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Li9/q0;->a:I

    iput-object p2, p0, Li9/q0;->b:Ljava/lang/Object;

    iput-object p3, p0, Li9/q0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Li9/q0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :pswitch_0
    iget-object v0, p0, Li9/q0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Li9/t0;

    .line 14
    .line 15
    iget-object v4, p0, Li9/q0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/Map;

    .line 18
    .line 19
    check-cast p1, Landroid/database/Cursor;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v6, v0, Li9/t0;->b:Li9/i;

    .line 33
    .line 34
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lia/a;->K([B)Lia/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Li9/i;->a(Lia/a;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lj9/k$b;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    sget-object v1, Lj9/k;->a:Lj9/c;

    .line 71
    .line 72
    :goto_0
    sget-object v4, Lj9/k;->a:Lj9/c;

    .line 73
    .line 74
    new-instance v4, Lj9/a;

    .line 75
    .line 76
    invoke-direct {v4, v5, v2, p1, v1}, Lj9/a;-><init>(ILjava/lang/String;Ljava/util/List;Lj9/k$b;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v4}, Li9/t0;->t(Lj9/a;)V
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catch_0
    move-exception p1

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "Failed to decode index: "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-array v0, v3, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    throw p1

    .line 108
    :pswitch_1
    iget-object v0, p0, Li9/q0;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Li9/t0;

    .line 111
    .line 112
    iget-object v4, p0, Li9/q0;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Lj9/g;

    .line 115
    .line 116
    check-cast p1, Lh9/d;

    .line 117
    .line 118
    iget-object v5, v0, Li9/t0;->a:Li9/y0;

    .line 119
    .line 120
    const/4 v6, 0x5

    .line 121
    new-array v6, v6, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-virtual {p1}, Lh9/d;->i()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    aput-object v7, v6, v3

    .line 132
    .line 133
    iget-object v0, v0, Li9/t0;->c:Ljava/lang/String;

    .line 134
    .line 135
    aput-object v0, v6, v2

    .line 136
    .line 137
    invoke-virtual {p1}, Lh9/d;->f()[B

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    aput-object v0, v6, v1

    .line 142
    .line 143
    invoke-virtual {p1}, Lh9/d;->g()[B

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const/4 v0, 0x3

    .line 148
    aput-object p1, v6, v0

    .line 149
    .line 150
    invoke-interface {v4}, Lj9/g;->getKey()Lj9/i;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Lj9/i;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const/4 v0, 0x4

    .line 159
    aput-object p1, v6, v0

    .line 160
    .line 161
    const-string p1, "INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)"

    .line 162
    .line 163
    invoke-virtual {v5, p1, v6}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_1
    iget-object v0, p0, Li9/q0;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Li9/w0;

    .line 170
    .line 171
    iget-object v1, p0, Li9/q0;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Ljava/util/List;

    .line 174
    .line 175
    check-cast p1, Landroid/database/Cursor;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v0, p1, v3}, Li9/w0;->l([BI)Lk9/g;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
