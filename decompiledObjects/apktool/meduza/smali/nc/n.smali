.class public final Lnc/n;
.super Lnc/l1;
.source "SourceFile"


# instance fields
.field public final e:Lnc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc/l<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lnc/l1;-><init>()V

    iput-object p1, p0, Lnc/n;->e:Lnc/l;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/n;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lnc/n;->e:Lnc/l;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnc/n1;->m()Lnc/o1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lnc/l;->r(Lnc/o1;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lnc/l;->x()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    iget-object v1, p1, Lnc/l;->d:Lub/e;

    .line 20
    .line 21
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 22
    .line 23
    invoke-static {v1, v3}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Lsc/g;

    .line 27
    .line 28
    sget-object v3, Lsc/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 29
    .line 30
    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sget-object v5, Lb/a0;->Z:Ld2/h0;

    .line 35
    .line 36
    invoke-static {v4, v5}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    sget-object v6, Lsc/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    :cond_2
    invoke-virtual {v6, v1, v5, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    move v4, v7

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eq v4, v5, :cond_2

    .line 58
    .line 59
    move v4, v2

    .line 60
    :goto_0
    if-eqz v4, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    instance-of v5, v4, Ljava/lang/Throwable;

    .line 64
    .line 65
    if-eqz v5, :cond_5

    .line 66
    .line 67
    :goto_1
    move v2, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    sget-object v5, Lsc/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    :cond_6
    invoke-virtual {v5, v1, v4, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_7

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_7
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    if-eq v8, v4, :cond_6

    .line 84
    .line 85
    move v7, v2

    .line 86
    :goto_2
    if-eqz v7, :cond_1

    .line 87
    .line 88
    :goto_3
    if-eqz v2, :cond_8

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_8
    invoke-virtual {p1, v0}, Lnc/l;->cancel(Ljava/lang/Throwable;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lnc/l;->x()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_9

    .line 99
    .line 100
    invoke-virtual {p1}, Lnc/l;->p()V

    .line 101
    .line 102
    .line 103
    :cond_9
    :goto_4
    return-void
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
