.class public final synthetic Li9/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Li9/k0;->a:I

    iput-object p1, p0, Li9/k0;->b:Ljava/lang/Object;

    iput-object p2, p0, Li9/k0;->c:Ljava/lang/Object;

    iput-object p3, p0, Li9/k0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Li9/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Li9/k0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Li9/w0;

    .line 10
    .line 11
    iget-object v1, p0, Li9/k0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/Set;

    .line 14
    .line 15
    iget-object v2, p0, Li9/k0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/List;

    .line 18
    .line 19
    check-cast p1, Landroid/database/Cursor;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1, v3}, Li9/w0;->l([BI)Lk9/g;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :pswitch_1
    iget-object v0, p0, Li9/k0;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Li9/m0;

    .line 62
    .line 63
    iget-object v1, p0, Li9/k0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ln9/c;

    .line 66
    .line 67
    iget-object v2, p0, Li9/k0;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/util/Map;

    .line 70
    .line 71
    check-cast p1, Landroid/database/Cursor;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2, p1}, Li9/m0;->h(Ln9/c;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :goto_0
    iget-object v0, p0, Li9/k0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Li9/b1;

    .line 80
    .line 81
    iget-object v1, p0, Li9/k0;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ln9/c;

    .line 84
    .line 85
    iget-object v2, p0, Li9/k0;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/util/Map;

    .line 88
    .line 89
    check-cast p1, Landroid/database/Cursor;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-virtual {v0, v1, v2, p1, v3}, Li9/b1;->i(Ln9/c;Ljava/util/Map;Landroid/database/Cursor;Ln9/i;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
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
