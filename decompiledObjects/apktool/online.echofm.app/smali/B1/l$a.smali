.class public final LB1/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB1/l$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lx1/K;)V
    .locals 0

    .line 1
    invoke-static {p0}, LB1/l$a;->c(Lx1/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Lx1/K;)V
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v0, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LB1/l;->d()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "App index sent to FB!"

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, v2}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lx1/a;Ljava/lang/String;Ljava/lang/String;)Lx1/F;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "requestType"

    .line 3
    .line 4
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    sget-object v2, Lx1/F;->n:Lx1/F$c;

    .line 12
    .line 13
    sget-object v3, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    .line 14
    .line 15
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    new-array v4, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    aput-object p3, v4, v5

    .line 21
    .line 22
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    const-string v0, "%s/app_indexing"

    .line 27
    .line 28
    invoke-static {v3, v0, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const-string v0, "java.lang.String.format(locale, format, *args)"

    .line 33
    .line 34
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p2, p3, v1, v1}, Lx1/F$c;->A(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lx1/F;->u()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    if-nez p3, :cond_1

    .line 46
    .line 47
    new-instance p3, Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string v0, "tree"

    .line 53
    .line 54
    invoke-virtual {p3, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "app_version"

    .line 58
    .line 59
    invoke-static {}, LG1/g;->d()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p3, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p1, "platform"

    .line 67
    .line 68
    const-string v0, "android"

    .line 69
    .line 70
    invoke-virtual {p3, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string p1, "request_type"

    .line 74
    .line 75
    invoke-virtual {p3, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string p1, "app_indexing"

    .line 79
    .line 80
    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    const-string p1, "device_session_id"

    .line 87
    .line 88
    invoke-static {}, LB1/e;->g()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-virtual {p3, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-virtual {p2, p3}, Lx1/F;->G(Landroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, LB1/k;

    .line 99
    .line 100
    invoke-direct {p1}, LB1/k;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p1}, Lx1/F;->C(Lx1/F$b;)V

    .line 104
    .line 105
    .line 106
    return-object p2
.end method
