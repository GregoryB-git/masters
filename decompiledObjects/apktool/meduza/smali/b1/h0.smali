.class public final Lb1/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb1/h0$b;

.field public static final b:Lb1/h0$c;

.field public static final c:Lb1/h0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/h0$b;

    invoke-direct {v0}, Lb1/h0$b;-><init>()V

    sput-object v0, Lb1/h0;->a:Lb1/h0$b;

    new-instance v0, Lb1/h0$c;

    invoke-direct {v0}, Lb1/h0$c;-><init>()V

    sput-object v0, Lb1/h0;->b:Lb1/h0$c;

    new-instance v0, Lb1/h0$a;

    invoke-direct {v0}, Lb1/h0$a;-><init>()V

    sput-object v0, Lb1/h0;->c:Lb1/h0$a;

    return-void
.end method

.method public static final a(Lc1/b;)Lb1/e0;
    .locals 8

    .line 1
    sget-object v0, Lb1/h0;->a:Lb1/h0$b;

    .line 2
    .line 3
    iget-object v1, p0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ls1/e;

    .line 10
    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    sget-object v1, Lb1/h0;->b:Lb1/h0$c;

    .line 14
    .line 15
    iget-object v2, p0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lb1/t0;

    .line 22
    .line 23
    if-eqz v1, :cond_8

    .line 24
    .line 25
    sget-object v2, Lb1/h0;->c:Lb1/h0$a;

    .line 26
    .line 27
    iget-object v3, p0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/os/Bundle;

    .line 34
    .line 35
    sget-object v3, Lb1/r0;->a:Lb1/r0;

    .line 36
    .line 37
    iget-object p0, p0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz p0, :cond_7

    .line 46
    .line 47
    invoke-interface {v0}, Ls1/e;->getSavedStateRegistry()Ls1/c;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ls1/c;->b()Ls1/c$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    instance-of v3, v0, Lb1/i0;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    check-cast v0, Lb1/i0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v0, v4

    .line 64
    :goto_0
    if-eqz v0, :cond_6

    .line 65
    .line 66
    invoke-static {v1}, Lb1/h0;->c(Lb1/t0;)Lb1/j0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v3, v1, Lb1/j0;->d:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lb1/e0;

    .line 77
    .line 78
    if-nez v3, :cond_5

    .line 79
    .line 80
    sget-object v3, Lb1/e0;->f:[Ljava/lang/Class;

    .line 81
    .line 82
    invoke-virtual {v0}, Lb1/i0;->b()V

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lb1/i0;->c:Landroid/os/Bundle;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move-object v3, v4

    .line 95
    :goto_1
    iget-object v5, v0, Lb1/i0;->c:Landroid/os/Bundle;

    .line 96
    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v5, v0, Lb1/i0;->c:Landroid/os/Bundle;

    .line 103
    .line 104
    const/4 v6, 0x1

    .line 105
    const/4 v7, 0x0

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-ne v5, v6, :cond_3

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move v6, v7

    .line 116
    :goto_2
    if-eqz v6, :cond_4

    .line 117
    .line 118
    iput-object v4, v0, Lb1/i0;->c:Landroid/os/Bundle;

    .line 119
    .line 120
    :cond_4
    invoke-static {v3, v2}, Lb1/e0$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Lb1/e0;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    iget-object v0, v1, Lb1/j0;->d:Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    invoke-interface {v0, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_5
    return-object v3

    .line 130
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 133
    .line 134
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p0

    .line 138
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 141
    .line 142
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 149
    .line 150
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 155
    .line 156
    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 157
    .line 158
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0
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

.method public static final b(Ls1/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ls1/e;",
            ":",
            "Lb1/t0;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object v0

    invoke-virtual {v0}, Lb1/k;->b()Lb1/k$b;

    move-result-object v0

    sget-object v1, Lb1/k$b;->b:Lb1/k$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lb1/k$b;->c:Lb1/k$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, Ls1/e;->getSavedStateRegistry()Ls1/c;

    move-result-object v0

    invoke-virtual {v0}, Ls1/c;->b()Ls1/c$b;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lb1/i0;

    invoke-interface {p0}, Ls1/e;->getSavedStateRegistry()Ls1/c;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Lb1/t0;

    invoke-direct {v0, v1, v2}, Lb1/i0;-><init>(Ls1/c;Lb1/t0;)V

    invoke-interface {p0}, Ls1/e;->getSavedStateRegistry()Ls1/c;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Ls1/c;->c(Ljava/lang/String;Ls1/c$b;)V

    invoke-interface {p0}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p0

    new-instance v1, Lb1/f0;

    invoke-direct {v1, v0}, Lb1/f0;-><init>(Lb1/i0;)V

    invoke-virtual {p0, v1}, Lb1/k;->a(Lb1/n;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lb1/t0;)Lb1/j0;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb1/q0;

    .line 7
    .line 8
    new-instance v1, Lb1/h0$d;

    .line 9
    .line 10
    invoke-direct {v1}, Lb1/h0$d;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lb1/t0;->getViewModelStore()Lb1/s0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, p0, Lb1/h;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast p0, Lb1/h;

    .line 22
    .line 23
    invoke-interface {p0}, Lb1/h;->getDefaultViewModelCreationExtras()Lc1/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p0, Lc1/a$a;->b:Lc1/a$a;

    .line 29
    .line 30
    :goto_0
    invoke-direct {v0, v2, v1, p0}, Lb1/q0;-><init>(Lb1/s0;Lb1/q0$b;Lc1/a;)V

    .line 31
    .line 32
    .line 33
    const-class p0, Lb1/j0;

    .line 34
    .line 35
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 36
    .line 37
    invoke-virtual {v0, p0, v1}, Lb1/q0;->b(Ljava/lang/Class;Ljava/lang/String;)Lb1/o0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lb1/j0;

    .line 42
    .line 43
    return-object p0
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
