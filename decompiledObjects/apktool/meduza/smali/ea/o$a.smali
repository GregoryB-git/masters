.class public final Lea/o$a;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/o;-><init>(Lu7/f;Lga/h;Lub/h;Lea/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.FirebaseSessions$1"
    f = "FirebaseSessions.kt"
    l = {
        0x2d,
        0x31
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lea/o;

.field public final synthetic c:Lub/h;

.field public final synthetic d:Lea/j0;


# direct methods
.method public constructor <init>(Lea/o;Lub/h;Lea/j0;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/o;",
            "Lub/h;",
            "Lea/j0;",
            "Lub/e<",
            "-",
            "Lea/o$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lea/o$a;->b:Lea/o;

    iput-object p2, p0, Lea/o$a;->c:Lub/h;

    iput-object p3, p0, Lea/o$a;->d:Lea/j0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance p1, Lea/o$a;

    iget-object v0, p0, Lea/o$a;->b:Lea/o;

    iget-object v1, p0, Lea/o$a;->c:Lub/h;

    iget-object v2, p0, Lea/o$a;->d:Lea/j0;

    invoke-direct {p1, v0, v1, v2, p2}, Lea/o$a;-><init>(Lea/o;Lub/h;Lea/j0;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lea/o$a;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lea/o$a;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lea/o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lea/o$a;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lfa/a;->a:Lfa/a;

    .line 34
    .line 35
    iput v3, p0, Lea/o$a;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lfa/a;->b(Lub/e;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_3

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    instance-of v1, p1, Ljava/util/Collection;

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lfa/b;

    .line 76
    .line 77
    invoke-interface {v1}, Lfa/b;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    move p1, v2

    .line 84
    goto :goto_2

    .line 85
    :cond_6
    :goto_1
    move p1, v3

    .line 86
    :goto_2
    if-eqz p1, :cond_7

    .line 87
    .line 88
    const-string p1, "No Sessions subscribers. Not listening to lifecycle events."

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_7
    iget-object p1, p0, Lea/o$a;->b:Lea/o;

    .line 92
    .line 93
    iget-object p1, p1, Lea/o;->b:Lga/h;

    .line 94
    .line 95
    iput v4, p0, Lea/o$a;->a:I

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lga/h;->b(Lub/e;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v0, :cond_8

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_8
    :goto_3
    iget-object p1, p0, Lea/o$a;->b:Lea/o;

    .line 105
    .line 106
    iget-object p1, p1, Lea/o;->b:Lga/h;

    .line 107
    .line 108
    iget-object v0, p1, Lga/h;->a:Lga/j;

    .line 109
    .line 110
    invoke-interface {v0}, Lga/j;->a()Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    goto :goto_4

    .line 121
    :cond_9
    iget-object p1, p1, Lga/h;->b:Lga/j;

    .line 122
    .line 123
    invoke-interface {p1}, Lga/j;->a()Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    goto :goto_4

    .line 134
    :cond_a
    move p1, v3

    .line 135
    :goto_4
    if-nez p1, :cond_b

    .line 136
    .line 137
    const-string p1, "Sessions SDK disabled. Not listening to lifecycle events."

    .line 138
    .line 139
    :goto_5
    const-string v0, "FirebaseSessions"

    .line 140
    .line 141
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_b
    new-instance p1, Lea/h0;

    .line 146
    .line 147
    iget-object v0, p0, Lea/o$a;->c:Lub/h;

    .line 148
    .line 149
    invoke-direct {p1, v0}, Lea/h0;-><init>(Lub/h;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lea/o$a;->d:Lea/j0;

    .line 153
    .line 154
    const-string v1, "sessionLifecycleServiceBinder"

    .line 155
    .line 156
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v1, Landroid/os/Messenger;

    .line 160
    .line 161
    new-instance v4, Lea/h0$a;

    .line 162
    .line 163
    iget-object v5, p1, Lea/h0;->a:Lub/h;

    .line 164
    .line 165
    invoke-direct {v4, v5}, Lea/h0$a;-><init>(Lub/h;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v1, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 169
    .line 170
    .line 171
    iget-object v4, p1, Lea/h0;->d:Lea/h0$b;

    .line 172
    .line 173
    invoke-interface {v0, v1, v4}, Lea/j0;->a(Landroid/os/Messenger;Lea/h0$b;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lea/l0;->a:Lea/l0;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    sput-object p1, Lea/l0;->c:Lea/h0;

    .line 182
    .line 183
    sget-boolean v0, Lea/l0;->b:Z

    .line 184
    .line 185
    if-eqz v0, :cond_c

    .line 186
    .line 187
    sput-boolean v2, Lea/l0;->b:Z

    .line 188
    .line 189
    invoke-virtual {p1, v3}, Lea/h0;->b(I)V

    .line 190
    .line 191
    .line 192
    :cond_c
    iget-object p1, p0, Lea/o$a;->b:Lea/o;

    .line 193
    .line 194
    iget-object p1, p1, Lea/o;->a:Lu7/f;

    .line 195
    .line 196
    new-instance v0, Lea/n;

    .line 197
    .line 198
    invoke-direct {v0}, Lea/n;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, Lu7/f;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :goto_6
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 210
    .line 211
    return-object p1
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
