.class public LH4/a;
.super LH4/e;
.source "SourceFile"


# static fields
.field public static final b:LF4/a;


# instance fields
.field public final a:LN4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LH4/a;->b:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(LN4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH4/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH4/a;->a:LN4/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LH4/a;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, LH4/a;->b:LF4/a;

    .line 8
    .line 9
    const-string v1, "ApplicationInfo is invalid"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LF4/a;->j(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public final g()Z
    .locals 3

    .line 1
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, LH4/a;->b:LF4/a;

    .line 7
    .line 8
    const-string v2, "ApplicationInfo is null"

    .line 9
    .line 10
    :goto_0
    invoke-virtual {v0, v2}, LF4/a;->j(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-virtual {v0}, LN4/c;->f0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v0, LH4/a;->b:LF4/a;

    .line 21
    .line 22
    const-string v2, "GoogleAppId is null"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 26
    .line 27
    invoke-virtual {v0}, LN4/c;->d0()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    sget-object v0, LH4/a;->b:LF4/a;

    .line 34
    .line 35
    const-string v2, "AppInstanceId is null"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 39
    .line 40
    invoke-virtual {v0}, LN4/c;->e0()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    sget-object v0, LH4/a;->b:LF4/a;

    .line 47
    .line 48
    const-string v2, "ApplicationProcessState is null"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 52
    .line 53
    invoke-virtual {v0}, LN4/c;->c0()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 60
    .line 61
    invoke-virtual {v0}, LN4/c;->Z()LN4/a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, LN4/a;->Y()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    sget-object v0, LH4/a;->b:LF4/a;

    .line 72
    .line 73
    const-string v2, "AndroidAppInfo.packageName is null"

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget-object v0, p0, LH4/a;->a:LN4/c;

    .line 77
    .line 78
    invoke-virtual {v0}, LN4/c;->Z()LN4/a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, LN4/a;->Z()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    sget-object v0, LH4/a;->b:LF4/a;

    .line 89
    .line 90
    const-string v2, "AndroidAppInfo.sdkVersion is null"

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    const/4 v0, 0x1

    .line 94
    return v0
.end method
