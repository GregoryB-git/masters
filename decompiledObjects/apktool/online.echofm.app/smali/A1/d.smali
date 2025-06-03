.class public final LA1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA1/d;

.field public static final b:Ljava/lang/String;

.field public static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LA1/d;

    .line 2
    .line 3
    invoke-direct {v0}, LA1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA1/d;->a:LA1/d;

    .line 7
    .line 8
    const-class v0, LA1/d;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LA1/d;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lx1/K;)V
    .locals 0

    .line 1
    invoke-static {p0}, LA1/d;->c(Lx1/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 4
    .line 5
    :try_start_0
    new-instance v8, LA1/c;

    .line 6
    .line 7
    invoke-direct {v8}, LA1/c;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v12, Lx1/F;

    .line 11
    .line 12
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "/cloudbridge_settings"

    .line 17
    .line 18
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    sget-object v7, Lx1/L;->o:Lx1/L;

    .line 23
    .line 24
    const/16 v10, 0x20

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    move-object v3, v12

    .line 31
    invoke-direct/range {v3 .. v11}, Lx1/F;-><init>(Lx1/a;Ljava/lang/String;Landroid/os/Bundle;Lx1/L;Lx1/F$b;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    .line 32
    .line 33
    .line 34
    sget-object v3, LO1/C;->e:LO1/C$a;

    .line 35
    .line 36
    sget-object v4, Lx1/N;->s:Lx1/N;

    .line 37
    .line 38
    sget-object v5, LA1/d;->b:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    const-string v6, " \n\nCreating Graph Request: \n=============\n%s\n\n "

    .line 43
    .line 44
    new-array v7, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object v12, v7, v0

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5, v6, v7}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v12}, Lx1/F;->l()Lx1/I;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v3

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v3, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    invoke-direct {v3, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    sget-object v4, LO1/C;->e:LO1/C$a;

    .line 64
    .line 65
    sget-object v5, Lx1/N;->s:Lx1/N;

    .line 66
    .line 67
    sget-object v6, LA1/d;->b:Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    invoke-static {v3}, LV5/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-array v1, v1, [Ljava/lang/Object;

    .line 76
    .line 77
    aput-object v2, v1, v0

    .line 78
    .line 79
    const-string v0, " \n\nGraph Request Exception: \n=============\n%s\n\n "

    .line 80
    .line 81
    invoke-virtual {v4, v5, v6, v0, v1}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void

    .line 85
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 86
    .line 87
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
.end method

.method public static final c(Lx1/K;)V
    .locals 1

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LA1/d;->a:LA1/d;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, LA1/d;->d(Lx1/K;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final e()Ljava/util/Map;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, LA1/d;

    .line 3
    .line 4
    invoke-static {v1}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return-object v3

    .line 12
    :cond_0
    :try_start_0
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v4, "com.facebook.sdk.CloudBridgeSavedCredentials"

    .line 17
    .line 18
    invoke-virtual {v2, v4, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    sget-object v4, LA1/o;->r:LA1/o;

    .line 26
    .line 27
    invoke-virtual {v4}, LA1/o;->e()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, LA1/o;->p:LA1/o;

    .line 36
    .line 37
    invoke-virtual {v6}, LA1/o;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-interface {v2, v7, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    sget-object v8, LA1/o;->s:LA1/o;

    .line 46
    .line 47
    invoke-virtual {v8}, LA1/o;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-interface {v2, v9, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v5, :cond_5

    .line 56
    .line 57
    invoke-static {v5}, Lkotlin/text/i;->F(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-eqz v7, :cond_5

    .line 65
    .line 66
    invoke-static {v7}, Lkotlin/text/i;->F(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-static {v2}, Lkotlin/text/i;->F(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, LA1/o;->e()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-interface {v9, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, LA1/o;->e()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v9, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, LA1/o;->e()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-interface {v9, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object v4, LO1/C;->e:LO1/C$a;

    .line 109
    .line 110
    sget-object v6, Lx1/N;->s:Lx1/N;

    .line 111
    .line 112
    sget-object v8, LA1/d;->b:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const-string v10, " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "

    .line 119
    .line 120
    const/4 v11, 0x3

    .line 121
    new-array v11, v11, [Ljava/lang/Object;

    .line 122
    .line 123
    aput-object v5, v11, v0

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    aput-object v7, v11, v0

    .line 127
    .line 128
    const/4 v0, 0x2

    .line 129
    aput-object v2, v11, v0

    .line 130
    .line 131
    invoke-virtual {v4, v6, v8, v10, v11}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    return-object v9

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto :goto_1

    .line 137
    :cond_5
    :goto_0
    return-object v3

    .line 138
    :goto_1
    invoke-static {v0, v1}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v3
.end method


# virtual methods
.method public final d(Lx1/K;)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "CloudBridge Settings API response is not a valid json: \n%s "

    const-string v3, "TAG"

    const-string v4, "response"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx1/K;->b()Lx1/r;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlin.String"

    if-eqz v4, :cond_2

    sget-object v2, LO1/C;->e:LO1/C$a;

    sget-object v3, Lx1/N;->s:Lx1/N;

    sget-object v4, LA1/d;->b:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Lx1/K;->b()Lx1/r;

    move-result-object v5

    invoke-virtual {v5}, Lx1/r;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lx1/K;->b()Lx1/r;

    move-result-object p1

    invoke-virtual {p1}, Lx1/r;->e()Lx1/o;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v1

    aput-object p1, v6, v0

    const-string p1, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n "

    invoke-virtual {v2, v3, v4, p1, v6}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, LA1/d;->e()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Ljava/net/URL;

    sget-object v2, LA1/o;->p:LA1/o;

    invoke-virtual {v2}, LA1/o;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    sget-object v2, LA1/g;->a:LA1/g;

    sget-object v2, LA1/o;->r:LA1/o;

    invoke-virtual {v2}, LA1/o;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "://"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, LA1/o;->s:LA1/o;

    invoke-virtual {v3}, LA1/o;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v1, p1}, LA1/g;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-boolean v0, LA1/d;->c:Z

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v4, LO1/C;->e:LO1/C$a;

    sget-object v6, Lx1/N;->s:Lx1/N;

    sget-object v7, LA1/d;->b:Ljava/lang/String;

    if-eqz v7, :cond_9

    const-string v5, " \n\nGraph Response Received: \n================\n%s\n\n "

    new-array v8, v0, [Ljava/lang/Object;

    aput-object p1, v8, v1

    invoke-virtual {v4, v6, v7, v5, v8}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx1/K;->c()Lorg/json/JSONObject;

    move-result-object p1

    :try_start_0
    sget-object v5, LO1/P;->a:LO1/P;

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    const-string v5, "data"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_8

    check-cast p1, Lorg/json/JSONArray;

    invoke-static {p1}, LO1/P;->m(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    new-instance v5, Lorg/json/JSONObject;

    invoke-static {p1}, LW5/m;->s(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, LO1/P;->n(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    sget-object v5, LA1/o;->p:LA1/o;

    invoke-virtual {v5}, LA1/o;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v8, LA1/o;->r:LA1/o;

    invoke-virtual {v8}, LA1/o;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v9, LA1/o;->s:LA1/o;

    invoke-virtual {v9}, LA1/o;->e()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v5, :cond_7

    if-eqz v8, :cond_7

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    :try_start_1
    invoke-static {v8, v5, v9}, LA1/g;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LA1/d;->g(Ljava/util/Map;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    sget-object v0, LA1/o;->q:LA1/o;

    invoke-virtual {v0}, LA1/o;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, LA1/o;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    sput-boolean v1, LA1/d;->c:Z

    return-void

    :catch_0
    move-exception p1

    sget-object v2, LO1/C;->e:LO1/C$a;

    sget-object v4, Lx1/N;->s:Lx1/N;

    sget-object v5, LA1/d;->b:Ljava/lang/String;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV5/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "CloudBridge Settings API response doesn\'t have valid url\n %s "

    invoke-virtual {v2, v4, v5, p1, v0}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_2
    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "CloudBridge Settings API response doesn\'t have valid data"

    invoke-virtual {v4, v6, v7, p1}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_4

    :cond_8
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v4, "null cannot be cast to non-null type org.json.JSONArray"

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    sget-object v4, LO1/C;->e:LO1/C$a;

    sget-object v5, Lx1/N;->s:Lx1/N;

    sget-object v6, LA1/d;->b:Ljava/lang/String;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV5/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-virtual {v4, v5, v6, v2, v0}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :goto_4
    sget-object v4, LO1/C;->e:LO1/C$a;

    sget-object v5, Lx1/N;->s:Lx1/N;

    sget-object v6, LA1/d;->b:Ljava/lang/String;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV5/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-virtual {v4, v5, v6, v2, v0}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    sget-boolean v0, LA1/d;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g(Ljava/util/Map;)V
    .locals 8

    .line 1
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.facebook.sdk.CloudBridgeSavedCredentials"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    sget-object v1, LA1/o;->r:LA1/o;

    .line 29
    .line 30
    invoke-virtual {v1}, LA1/o;->e()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    sget-object v4, LA1/o;->p:LA1/o;

    .line 39
    .line 40
    invoke-virtual {v4}, LA1/o;->e()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v6, LA1/o;->s:LA1/o;

    .line 49
    .line 50
    invoke-virtual {v6}, LA1/o;->e()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1}, LA1/o;->e()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, LA1/o;->e()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, LA1/o;->e()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 103
    .line 104
    .line 105
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 106
    .line 107
    sget-object v1, Lx1/N;->s:Lx1/N;

    .line 108
    .line 109
    sget-object v4, LA1/d;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-string v6, " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "

    .line 116
    .line 117
    const/4 v7, 0x3

    .line 118
    new-array v7, v7, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object v3, v7, v2

    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    aput-object v5, v7, v2

    .line 124
    .line 125
    const/4 v2, 0x2

    .line 126
    aput-object p1, v7, v2

    .line 127
    .line 128
    invoke-virtual {v0, v1, v4, v6, v7}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_0
    return-void
.end method
