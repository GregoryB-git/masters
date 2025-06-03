.class public final synthetic Li9/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Li9/p0;->a:I

    iput-object p1, p0, Li9/p0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Li9/p0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object v0, p0, Li9/p0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Li9/w0;

    .line 12
    .line 13
    check-cast p1, Landroid/database/Cursor;

    .line 14
    .line 15
    iget v1, v0, Li9/w0;->e:I

    .line 16
    .line 17
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, v0, Li9/w0;->e:I

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, p0, Li9/p0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/Map;

    .line 31
    .line 32
    check-cast p1, Landroid/database/Cursor;

    .line 33
    .line 34
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance v1, Lj9/q;

    .line 43
    .line 44
    new-instance v5, Lu7/m;

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v8, 0x3

    .line 52
    invoke-interface {p1, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-direct {v5, v8, v6, v7}, Lu7/m;-><init>(IJ)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v5}, Lj9/q;-><init>(Lu7/m;)V

    .line 60
    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v5}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v6, Lj9/i;

    .line 72
    .line 73
    invoke-direct {v6, v5}, Lj9/i;-><init>(Lj9/o;)V

    .line 74
    .line 75
    .line 76
    const/4 v5, 0x5

    .line 77
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sget-object v5, Lj9/k$a;->a:Lj9/b;

    .line 86
    .line 87
    new-instance v5, Lj9/b;

    .line 88
    .line 89
    invoke-direct {v5, v1, v6, p1}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lj9/c;

    .line 93
    .line 94
    invoke-direct {p1, v3, v4, v5}, Lj9/c;-><init>(JLj9/b;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_2
    iget-object v0, p0, Li9/p0;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    check-cast p1, Landroid/database/Cursor;

    .line 106
    .line 107
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :goto_0
    iget-object v0, p0, Li9/p0;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, [Ljava/lang/Boolean;

    .line 122
    .line 123
    check-cast p1, Landroid/database/Cursor;

    .line 124
    .line 125
    :try_start_0
    sget v3, Le9/a;->a:I

    .line 126
    .line 127
    const-string v3, "BUILD_OVERLAYS"

    .line 128
    .line 129
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_0

    .line 138
    .line 139
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 140
    .line 141
    aput-object p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    :cond_0
    return-void

    .line 144
    :catch_0
    move-exception p1

    .line 145
    new-array v0, v1, [Ljava/lang/Object;

    .line 146
    .line 147
    aput-object p1, v0, v2

    .line 148
    .line 149
    const-string p1, "SQLitePersistence.DataMigration failed to parse: %s"

    .line 150
    .line 151
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const/4 p1, 0x0

    .line 155
    throw p1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
