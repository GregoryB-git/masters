.class public final Lu9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:J

.field public static final c:Ljava/util/regex/Pattern;

.field public static d:Lu9/k;


# instance fields
.field public final a:Lnc/g0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lu9/k;->b:J

    const-string v0, "\\AA[\\w-]{38}\\z"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lu9/k;->c:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lnc/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/k;->a:Lnc/g0;

    return-void
.end method

.method public static a()Lu9/k;
    .locals 2

    .line 1
    sget-object v0, Lnc/g0;->b:Lnc/g0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnc/g0;

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lnc/g0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lnc/g0;->b:Lnc/g0;

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lnc/g0;->b:Lnc/g0;

    .line 15
    .line 16
    sget-object v1, Lu9/k;->d:Lu9/k;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Lu9/k;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lu9/k;-><init>(Lnc/g0;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lu9/k;->d:Lu9/k;

    .line 26
    .line 27
    :cond_1
    sget-object v0, Lu9/k;->d:Lu9/k;

    .line 28
    .line 29
    return-object v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final b(Lw9/a;)Z
    .locals 8

    .line 1
    iget-object v0, p1, Lw9/a;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-wide v2, p1, Lw9/a;->g:J

    .line 12
    .line 13
    iget-wide v4, p1, Lw9/a;->f:J

    .line 14
    .line 15
    add-long/2addr v4, v2

    .line 16
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    iget-object v0, p0, Lu9/k;->a:Lnc/g0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    sget-wide v6, Lu9/k;->b:J

    .line 32
    .line 33
    add-long/2addr v2, v6

    .line 34
    cmp-long p1, v4, v2

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
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
