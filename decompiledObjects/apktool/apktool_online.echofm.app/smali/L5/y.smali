.class public LL5/y;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL5/y;->o:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LL5/y;->p:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    :goto_0
    iput-object p3, p0, LL5/y;->q:Ljava/util/Map;

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance p3, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iget-object p3, p0, LL5/y;->q:Ljava/util/Map;

    .line 20
    .line 21
    const-string v0, "code"

    .line 22
    .line 23
    invoke-interface {p3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LL5/y;->q:Ljava/util/Map;

    .line 27
    .line 28
    const-string p3, "message"

    .line 29
    .line 30
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static a(LQ3/c;)LL5/y;
    .locals 4

    .line 1
    invoke-virtual {p0}, LQ3/c;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x19

    .line 6
    .line 7
    const-string v2, "unknown"

    .line 8
    .line 9
    if-eq v0, v1, :cond_5

    .line 10
    .line 11
    const/16 v1, -0x18

    .line 12
    .line 13
    if-eq v0, v1, :cond_4

    .line 14
    .line 15
    const/4 v1, -0x4

    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    const/4 v1, -0x3

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v1, -0x2

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    const-string v0, "An unknown error occurred"

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    move-object v0, v2

    .line 34
    goto :goto_0

    .line 35
    :pswitch_0
    const-string v0, "expired-token"

    .line 36
    .line 37
    const-string v1, "The supplied auth token has expired."

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    const-string v0, "invalid-token"

    .line 41
    .line 42
    const-string v1, "The supplied auth token was invalid."

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    const-string v0, "max-retries"

    .line 46
    .line 47
    const-string v1, "The transaction had too many retries."

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_3
    const-string v0, "overridden-by-set"

    .line 51
    .line 52
    const-string v1, "The transaction was overridden by a subsequent set."

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_4
    const-string v0, "unavailable"

    .line 56
    .line 57
    const-string v1, "The service is unavailable."

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string v0, "data-stale"

    .line 61
    .line 62
    const-string v1, "The transaction needs to be run again with current data."

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v0, "failure"

    .line 66
    .line 67
    const-string v1, "The server indicated that this operation failed."

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const-string v0, "permission-denied"

    .line 71
    .line 72
    const-string v1, "Client doesn\'t have permission to access the desired data."

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const-string v0, "disconnected"

    .line 76
    .line 77
    const-string v1, "The operation had to be aborted due to a network disconnect."

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const-string v0, "network-error"

    .line 81
    .line 82
    const-string v1, "The operation could not be performed due to a network error."

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const-string v0, "write-cancelled"

    .line 86
    .line 87
    const-string v1, "The write was canceled by the user."

    .line 88
    .line 89
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, LQ3/c;->h()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, LL5/y;->g(Ljava/lang/String;)LL5/y;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_6
    new-instance v2, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, LQ3/c;->g()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    const-string v3, "details"

    .line 114
    .line 115
    invoke-interface {v2, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    new-instance p0, LL5/y;

    .line 119
    .line 120
    invoke-direct {p0, v0, v1, v2}, LL5/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch -0xa
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(LQ3/d;)LL5/y;
    .locals 0

    .line 1
    invoke-static {p0}, LQ3/c;->b(Ljava/lang/Throwable;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LL5/y;->a(LQ3/c;)LL5/y;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Ljava/lang/Exception;)LL5/y;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LL5/y;->f()LL5/y;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, LL5/y;->g(Ljava/lang/String;)LL5/y;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static f()LL5/y;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, LL5/y;->g(Ljava/lang/String;)LL5/y;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static g(Ljava/lang/String;)LL5/y;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "An unknown error occurred"

    .line 9
    .line 10
    :cond_0
    const-string v1, "Index not defined, add \".indexOn\""

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v1, "java.lang.Exception: "

    .line 19
    .line 20
    const-string v2, ""

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "index-not-defined"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string v1, "Permission denied"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const-string v1, "permission-denied"

    .line 38
    .line 39
    const-string p0, "Client doesn\'t have permission to access the desired data."

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v1, "unknown"

    .line 43
    .line 44
    :goto_0
    new-instance v2, LL5/y;

    .line 45
    .line 46
    invoke-direct {v2, v1, p0, v0}, LL5/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    return-object v2
.end method


# virtual methods
.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LL5/y;->q:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LL5/y;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LL5/y;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
