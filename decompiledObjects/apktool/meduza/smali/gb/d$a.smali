.class public abstract Lgb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/g$d;
.implements Lgb/i2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public a:Lgb/a0;

.field public final b:Ljava/lang/Object;

.field public final c:Lgb/r3;

.field public final d:Lgb/i2;

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(ILgb/l3;Lgb/r3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgb/d$a;->b:Ljava/lang/Object;

    const-string v0, "transportTracer"

    invoke-static {p3, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lgb/d$a;->c:Lgb/r3;

    new-instance v0, Lgb/i2;

    invoke-direct {v0, p0, p1, p2, p3}, Lgb/i2;-><init>(Lgb/i2$a;ILgb/l3;Lgb/r3;)V

    iput-object v0, p0, Lgb/d$a;->d:Lgb/i2;

    iput-object v0, p0, Lgb/d$a;->a:Lgb/a0;

    return-void
.end method


# virtual methods
.method public final a(Lgb/n3$a;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lgb/a$b;

    .line 3
    .line 4
    iget-object v0, v0, Lgb/a$b;->j:Lgb/t;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lgb/n3;->a(Lgb/n3$a;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
.end method

.method public final b(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgb/d$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lgb/d$a;->f:Z

    .line 5
    .line 6
    const-string v2, "onStreamAllocated was not called, but it seems the stream is active"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lgb/d$a;->e:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const v4, 0x8000

    .line 16
    .line 17
    .line 18
    if-ge v1, v4, :cond_0

    .line 19
    .line 20
    move v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v5, v2

    .line 23
    :goto_0
    sub-int/2addr v1, p1

    .line 24
    iput v1, p0, Lgb/d$a;->e:I

    .line 25
    .line 26
    if-ge v1, v4, :cond_1

    .line 27
    .line 28
    move p1, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move p1, v2

    .line 31
    :goto_1
    if-nez v5, :cond_2

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    move p1, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move p1, v2

    .line 38
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, Lgb/d$a;->b:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter p1

    .line 44
    :try_start_1
    iget-object v0, p0, Lgb/d$a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    :try_start_2
    iget-boolean v1, p0, Lgb/d$a;->f:Z

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget v1, p0, Lgb/d$a;->e:I

    .line 52
    .line 53
    if-ge v1, v4, :cond_3

    .line 54
    .line 55
    iget-boolean v1, p0, Lgb/d$a;->g:Z

    .line 56
    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    move v2, v3

    .line 60
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    move-object p1, p0

    .line 65
    check-cast p1, Lgb/a$b;

    .line 66
    .line 67
    iget-object p1, p1, Lgb/a$b;->j:Lgb/t;

    .line 68
    .line 69
    invoke-interface {p1}, Lgb/n3;->c()V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 75
    :try_start_5
    throw v1

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 78
    throw v0

    .line 79
    :cond_4
    :goto_3
    return-void

    .line 80
    :catchall_2
    move-exception p1

    .line 81
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 82
    throw p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
