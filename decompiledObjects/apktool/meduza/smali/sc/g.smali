.class public final Lsc/g;
.super Lnc/p0;
.source "SourceFile"

# interfaces
.implements Lwb/d;
.implements Lub/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/p0<",
        "TT;>;",
        "Lwb/d;",
        "Lub/e<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _reusableCancellableContinuation:Ljava/lang/Object;

.field public final d:Lnc/a0;

.field public final e:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lsc/g;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_reusableCancellableContinuation"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lsc/g;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lnc/a0;Lub/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc/a0;",
            "Lub/e<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lnc/p0;-><init>(I)V

    iput-object p1, p0, Lsc/g;->d:Lnc/a0;

    iput-object p2, p0, Lsc/g;->e:Lub/e;

    sget-object p1, Lb/a0;->Y:Ld2/h0;

    iput-object p1, p0, Lsc/g;->f:Ljava/lang/Object;

    invoke-virtual {p0}, Lsc/g;->getContext()Lub/h;

    move-result-object p1

    invoke-static {p1}, Lsc/w;->b(Lub/h;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lsc/g;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    instance-of v0, p1, Lnc/v;

    if-eqz v0, :cond_0

    check-cast p1, Lnc/v;

    iget-object p1, p1, Lnc/v;->b:Ldc/l;

    invoke-interface {p1, p2}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final d()Lub/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/e<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final getCallerFrame()Lwb/d;
    .locals 2

    iget-object v0, p0, Lsc/g;->e:Lub/e;

    instance-of v1, v0, Lwb/d;

    if-eqz v1, :cond_0

    check-cast v0, Lwb/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lub/h;
    .locals 1

    iget-object v0, p0, Lsc/g;->e:Lub/e;

    invoke-interface {v0}, Lub/e;->getContext()Lub/h;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lsc/g;->f:Ljava/lang/Object;

    sget-object v1, Lb/a0;->Y:Ld2/h0;

    iput-object v1, p0, Lsc/g;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsc/g;->e:Lub/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/e;->getContext()Lub/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lrb/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v3, Lnc/u;

    .line 17
    .line 18
    invoke-direct {v3, v1, v2}, Lnc/u;-><init>(Ljava/lang/Throwable;Z)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v1, p0, Lsc/g;->d:Lnc/a0;

    .line 22
    .line 23
    invoke-virtual {v1}, Lnc/a0;->B0()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iput-object v3, p0, Lsc/g;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iput v2, p0, Lnc/p0;->c:I

    .line 32
    .line 33
    iget-object p1, p0, Lsc/g;->d:Lnc/a0;

    .line 34
    .line 35
    invoke-virtual {p1, v0, p0}, Lnc/a0;->z0(Lub/h;Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-static {}, Lnc/c2;->a()Lnc/x0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lnc/x0;->F0()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iput-object v3, p0, Lsc/g;->f:Ljava/lang/Object;

    .line 50
    .line 51
    iput v2, p0, Lnc/p0;->c:I

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lnc/x0;->D0(Lnc/p0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Lnc/x0;->E0(Z)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    invoke-virtual {p0}, Lsc/g;->getContext()Lub/h;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, p0, Lsc/g;->o:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v2, v3}, Lsc/w;->c(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 71
    :try_start_1
    iget-object v4, p0, Lsc/g;->e:Lub/e;

    .line 72
    .line 73
    invoke-interface {v4, p1}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    :try_start_2
    invoke-static {v2, v3}, Lsc/w;->a(Lub/h;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {v0}, Lnc/x0;->H0()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    invoke-static {v2, v3}, Lsc/w;->a(Lub/h;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    const/4 v2, 0x0

    .line 95
    :try_start_3
    invoke-virtual {p0, p1, v2}, Lnc/p0;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-virtual {v0, v1}, Lnc/x0;->C0(Z)V

    .line 99
    .line 100
    .line 101
    :goto_2
    return-void

    .line 102
    :catchall_2
    move-exception p1

    .line 103
    invoke-virtual {v0, v1}, Lnc/x0;->C0(Z)V

    .line 104
    .line 105
    .line 106
    throw p1
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "DispatchedContinuation["

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lsc/g;->d:Lnc/a0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lsc/g;->e:Lub/e;

    .line 18
    .line 19
    invoke-static {v1}, Lnc/g0;->c(Lub/e;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x5d

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
