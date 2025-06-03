.class public final Li9/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/a;


# instance fields
.field public final a:Li9/y0;

.field public final b:Li9/i;


# direct methods
.method public constructor <init>(Li9/y0;Li9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/i0;->a:Li9/y0;

    iput-object p2, p0, Li9/i0;->b:Li9/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lf9/e;
    .locals 3

    iget-object v0, p0, Li9/i0;->a:Li9/y0;

    const-string v1, "SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?"

    invoke-virtual {v0, v1}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Li9/y0$d;->a([Ljava/lang/Object;)V

    new-instance v1, Le;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Le;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Li9/y0$d;->c(Ln9/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/e;

    return-object p1
.end method

.method public final b(Lf9/e;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li9/i0;->a:Li9/y0;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p1, Lf9/e;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iget v3, p1, Lf9/e;->b:I

    .line 13
    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aput-object v3, v1, v2

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    iget-object v3, p1, Lf9/e;->c:Lj9/q;

    .line 22
    .line 23
    iget-object v3, v3, Lj9/q;->a:Lu7/m;

    .line 24
    .line 25
    iget-wide v3, v3, Lu7/m;->a:J

    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    aput-object v3, v1, v2

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    iget-object v3, p1, Lf9/e;->c:Lj9/q;

    .line 35
    .line 36
    iget-object v3, v3, Lj9/q;->a:Lu7/m;

    .line 37
    .line 38
    iget v3, v3, Lu7/m;->b:I

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aput-object v3, v1, v2

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    iget v3, p1, Lf9/e;->d:I

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    aput-object v3, v1, v2

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    iget-wide v3, p1, Lf9/e;->e:J

    .line 57
    .line 58
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    aput-object p1, v1, v2

    .line 63
    .line 64
    const-string p1, "INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)"

    .line 65
    .line 66
    invoke-virtual {v0, p1, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final c(Lf9/j;)V
    .locals 6

    .line 1
    iget-object v0, p0, Li9/i0;->b:Li9/i;

    .line 2
    .line 3
    iget-object v1, p1, Lf9/j;->b:Lf9/i;

    .line 4
    .line 5
    iget-object v0, v0, Li9/i;->a:Lm9/e0;

    .line 6
    .line 7
    iget-object v2, v1, Lf9/i;->a:Lg9/k0;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lm9/e0;->l(Lg9/k0;)Lka/a0$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lja/a;->M()Lja/a$a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget v1, v1, Lf9/i;->b:I

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {v1, v3}, Lq0/g;->b(II)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v1, Lja/a$b;->b:Lja/a$b;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v1, Lja/a$b;->c:Lja/a$b;

    .line 30
    .line 31
    :goto_0
    invoke-virtual {v2}, Lma/w$a;->m()V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, Lma/w$a;->b:Lma/w;

    .line 35
    .line 36
    check-cast v4, Lja/a;

    .line 37
    .line 38
    invoke-static {v4, v1}, Lja/a;->I(Lja/a;Lja/a$b;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lka/a0$c;->J()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v2}, Lma/w$a;->m()V

    .line 46
    .line 47
    .line 48
    iget-object v4, v2, Lma/w$a;->b:Lma/w;

    .line 49
    .line 50
    check-cast v4, Lja/a;

    .line 51
    .line 52
    invoke-static {v4, v1}, Lja/a;->G(Lja/a;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lka/a0$c;->K()Lka/z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2}, Lma/w$a;->m()V

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, Lma/w$a;->b:Lma/w;

    .line 63
    .line 64
    check-cast v1, Lja/a;

    .line 65
    .line 66
    invoke-static {v1, v0}, Lja/a;->H(Lja/a;Lka/z;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lma/w$a;->k()Lma/w;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lja/a;

    .line 74
    .line 75
    iget-object v1, p0, Li9/i0;->a:Li9/y0;

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    new-array v2, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    iget-object v5, p1, Lf9/j;->a:Ljava/lang/String;

    .line 82
    .line 83
    aput-object v5, v2, v4

    .line 84
    .line 85
    iget-object v4, p1, Lf9/j;->c:Lj9/q;

    .line 86
    .line 87
    iget-object v4, v4, Lj9/q;->a:Lu7/m;

    .line 88
    .line 89
    iget-wide v4, v4, Lu7/m;->a:J

    .line 90
    .line 91
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    aput-object v4, v2, v3

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    iget-object p1, p1, Lf9/j;->c:Lj9/q;

    .line 99
    .line 100
    iget-object p1, p1, Lj9/q;->a:Lu7/m;

    .line 101
    .line 102
    iget p1, p1, Lu7/m;->b:I

    .line 103
    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    aput-object p1, v2, v3

    .line 109
    .line 110
    const/4 p1, 0x3

    .line 111
    invoke-virtual {v0}, Lma/a;->j()[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    aput-object v0, v2, p1

    .line 116
    .line 117
    const-string p1, "INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)"

    .line 118
    .line 119
    invoke-virtual {v1, p1, v2}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void
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

.method public final d(Ljava/lang/String;)Lf9/j;
    .locals 3

    iget-object v0, p0, Li9/i0;->a:Li9/y0;

    const-string v1, "SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?"

    invoke-virtual {v0, v1}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Li9/y0$d;->a([Ljava/lang/Object;)V

    new-instance v1, Li9/h0;

    invoke-direct {v1, p0, p1}, Li9/h0;-><init>(Li9/i0;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Li9/y0$d;->c(Ln9/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/j;

    return-object p1
.end method
