.class public LI5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements LE5/k$c;
.implements LA5/a;


# instance fields
.field public a:Lcom/google/firebase/analytics/FirebaseAnalytics;

.field public b:LE5/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic H(LE5/k$d;LV2/j;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p1, "An unknown error occurred"

    .line 27
    .line 28
    :goto_0
    const-string v0, "firebase_analytics"

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {p0, v0, p1, v1}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_1
    return-void
.end method

.method public static synthetic a(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->I(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->D(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, LI5/n;->x(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE5/k$d;LV2/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LI5/n;->H(LE5/k$d;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->F(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->G(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LI5/n;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LI5/n;->y(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->J(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(LI5/n;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LI5/n;->C(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(LI5/n;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LI5/n;->z(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->B(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(LI5/n;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LI5/n;->E(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(LI5/n;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LI5/n;->A(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static n(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_b

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    instance-of v4, v3, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    instance-of v4, v3, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    check-cast v3, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    int-to-long v3, v3

    .line 61
    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    check-cast v3, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    instance-of v4, v3, Ljava/lang/Double;

    .line 77
    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    check-cast v3, Ljava/lang/Double;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 83
    .line 84
    .line 85
    move-result-wide v3

    .line 86
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    check-cast v3, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    if-nez v3, :cond_6

    .line 105
    .line 106
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    instance-of v4, v3, Ljava/lang/Iterable;

    .line 111
    .line 112
    const-string v5, "Unsupported value type: "

    .line 113
    .line 114
    if-eqz v4, :cond_9

    .line 115
    .line 116
    new-instance v4, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    check-cast v3, Ljava/lang/Iterable;

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_8

    .line 132
    .line 133
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    instance-of v7, v6, Ljava/util/Map;

    .line 138
    .line 139
    if-eqz v7, :cond_7

    .line 140
    .line 141
    check-cast v6, Ljava/util/Map;

    .line 142
    .line 143
    invoke-static {v6}, LI5/n;->n(Ljava/util/Map;)Landroid/os/Bundle;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, " in list at key "

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :cond_8
    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_9
    instance-of v4, v3, Ljava/util/Map;

    .line 194
    .line 195
    if-eqz v4, :cond_a

    .line 196
    .line 197
    check-cast v3, Ljava/util/Map;

    .line 198
    .line 199
    invoke-static {v3}, LI5/n;->n(Ljava/util/Map;)Landroid/os/Bundle;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p0

    .line 237
    :cond_b
    return-object v1
.end method

.method private w(LE5/c;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iput-object p2, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    new-instance p2, LE5/k;

    .line 8
    .line 9
    const-string v0, "plugins.flutter.io/firebase_analytics"

    .line 10
    .line 11
    invoke-direct {p2, p1, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LI5/n;->b:LE5/k;

    .line 15
    .line 16
    invoke-virtual {p2, p0}, LE5/k;->e(LE5/k$c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic x(LV2/k;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    .line 5
    goto :goto_0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p0, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    return-void
.end method


# virtual methods
.method public final synthetic A(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->b()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public final synthetic B(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "parameters"

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/Map;

    .line 19
    .line 20
    invoke-static {p1}, LI5/n;->n(Ljava/util/Map;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 25
    .line 26
    invoke-virtual {v1, v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->c(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
.end method

.method public final synthetic C(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->d()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    return-void
.end method

.method public final synthetic D(Ljava/util/Map;LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "enabled"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->e(Z)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public final synthetic E(Ljava/util/Map;LV2/k;)V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "milliseconds"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    int-to-long v1, p1

    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->h(J)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final synthetic F(Ljava/util/Map;LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "userId"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->i(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
.end method

.method public final synthetic G(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "name"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "value"

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 21
    .line 22
    invoke-virtual {v1, v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
.end method

.method public final synthetic I(Ljava/util/Map;LV2/k;)V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "adStorageConsentGranted"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    const-string v1, "analyticsStorageConsentGranted"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    new-instance v1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v2, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->o:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->o:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->p:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    if-eqz p1, :cond_3

    .line 43
    .line 44
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->p:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->o:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->p:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 56
    .line 57
    :goto_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->f(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    return-void
.end method

.method public final synthetic J(Ljava/util/Map;LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 2
    .line 3
    invoke-static {p1}, LI5/n;->n(Ljava/util/Map;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->g(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public final K(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/b;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/b;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final L(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/d;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/d;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public didReinitializeFirebaseCore()LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/e;

    .line 9
    .line 10
    invoke-direct {v2, v0}, LI5/e;-><init>(LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;
    .locals 2

    .line 1
    new-instance p1, LV2/k;

    .line 2
    .line 3
    invoke-direct {p1}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, LI5/a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, LI5/a;-><init>(LI5/n;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final o()LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/j;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LI5/j;-><init>(LI5/n;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, v0, p1}, LI5/n;->w(LE5/c;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, LI5/n;->b:LE5/k;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LI5/n;->b:LE5/k;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v1, "Analytics#setUserId"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x9

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v1, "Analytics#setSessionTimeoutDuration"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v2, 0x8

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v1, "Analytics#setUserProperty"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x7

    .line 54
    goto :goto_0

    .line 55
    :sswitch_3
    const-string v1, "Analytics#getSessionId"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 v2, 0x6

    .line 65
    goto :goto_0

    .line 66
    :sswitch_4
    const-string v1, "Analytics#logEvent"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const/4 v2, 0x5

    .line 76
    goto :goto_0

    .line 77
    :sswitch_5
    const-string v1, "Analytics#setDefaultEventParameters"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    const/4 v2, 0x4

    .line 87
    goto :goto_0

    .line 88
    :sswitch_6
    const-string v1, "Analytics#setAnalyticsCollectionEnabled"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    const/4 v2, 0x3

    .line 98
    goto :goto_0

    .line 99
    :sswitch_7
    const-string v1, "Analytics#setConsent"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    const/4 v2, 0x2

    .line 109
    goto :goto_0

    .line 110
    :sswitch_8
    const-string v1, "Analytics#resetAnalyticsData"

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    const/4 v2, 0x1

    .line 120
    goto :goto_0

    .line 121
    :sswitch_9
    const-string v1, "Analytics#getAppInstanceId"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_9

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_9
    const/4 v2, 0x0

    .line 131
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 132
    .line 133
    .line 134
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_0
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/util/Map;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, LI5/n;->u(Ljava/util/Map;)LV2/j;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_1

    .line 149
    :pswitch_1
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/util/Map;

    .line 154
    .line 155
    invoke-virtual {p0, p1}, LI5/n;->t(Ljava/util/Map;)LV2/j;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    goto :goto_1

    .line 160
    :pswitch_2
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Ljava/util/Map;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, LI5/n;->v(Ljava/util/Map;)LV2/j;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    goto :goto_1

    .line 171
    :pswitch_3
    invoke-virtual {p0}, LI5/n;->p()LV2/j;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    goto :goto_1

    .line 176
    :pswitch_4
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Ljava/util/Map;

    .line 181
    .line 182
    invoke-virtual {p0, p1}, LI5/n;->q(Ljava/util/Map;)LV2/j;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_1

    .line 187
    :pswitch_5
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/util/Map;

    .line 192
    .line 193
    invoke-virtual {p0, p1}, LI5/n;->L(Ljava/util/Map;)LV2/j;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    goto :goto_1

    .line 198
    :pswitch_6
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Ljava/util/Map;

    .line 203
    .line 204
    invoke-virtual {p0, p1}, LI5/n;->s(Ljava/util/Map;)LV2/j;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    goto :goto_1

    .line 209
    :pswitch_7
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Ljava/util/Map;

    .line 214
    .line 215
    invoke-virtual {p0, p1}, LI5/n;->K(Ljava/util/Map;)LV2/j;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    goto :goto_1

    .line 220
    :pswitch_8
    invoke-virtual {p0}, LI5/n;->r()LV2/j;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    goto :goto_1

    .line 225
    :pswitch_9
    invoke-virtual {p0}, LI5/n;->o()LV2/j;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    :goto_1
    new-instance v0, LI5/f;

    .line 230
    .line 231
    invoke-direct {v0, p2}, LI5/f;-><init>(LE5/k$d;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0}, LV2/j;->b(LV2/e;)LV2/j;

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    nop

    .line 239
    :sswitch_data_0
    .sparse-switch
        -0x7ca07ea8 -> :sswitch_9
        -0x73269c82 -> :sswitch_8
        -0x5db9fd6b -> :sswitch_7
        -0x1048ba7e -> :sswitch_6
        -0x5e75838 -> :sswitch_5
        -0x2aed1cd -> :sswitch_4
        0xaaf0d98 -> :sswitch_3
        0x40964525 -> :sswitch_2
        0x685f1cc4 -> :sswitch_1
        0x76bc306b -> :sswitch_0
    .end sparse-switch

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p()LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/g;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LI5/g;-><init>(LI5/n;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final q(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/i;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/i;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final r()LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/m;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LI5/m;-><init>(LI5/n;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final s(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/l;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/l;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final t(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/k;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/k;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final u(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/c;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/c;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final v(Ljava/util/Map;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LI5/h;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LI5/h;-><init>(LI5/n;Ljava/util/Map;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final synthetic y(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, LI5/n$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LI5/n$a;-><init>(LI5/n;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
.end method

.method public final synthetic z(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LI5/n;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->a()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method
