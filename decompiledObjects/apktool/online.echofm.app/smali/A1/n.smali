.class public final enum LA1/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LA1/n;

.field public static final enum q:LA1/n;

.field public static final enum r:LA1/n;

.field public static final enum s:LA1/n;

.field public static final enum t:LA1/n;

.field public static final synthetic u:[LA1/n;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LA1/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "event"

    .line 5
    .line 6
    const-string v3, "EVENT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LA1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LA1/n;->p:LA1/n;

    .line 12
    .line 13
    new-instance v0, LA1/n;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "action_source"

    .line 17
    .line 18
    const-string v3, "ACTION_SOURCE"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LA1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LA1/n;->q:LA1/n;

    .line 24
    .line 25
    new-instance v0, LA1/n;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "app"

    .line 29
    .line 30
    const-string v3, "APP"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LA1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LA1/n;->r:LA1/n;

    .line 36
    .line 37
    new-instance v0, LA1/n;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "MobileAppInstall"

    .line 41
    .line 42
    const-string v3, "MOBILE_APP_INSTALL"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, LA1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LA1/n;->s:LA1/n;

    .line 48
    .line 49
    new-instance v0, LA1/n;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "install_timestamp"

    .line 53
    .line 54
    const-string v3, "INSTALL_EVENT_TIME"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, LA1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LA1/n;->t:LA1/n;

    .line 60
    .line 61
    invoke-static {}, LA1/n;->c()[LA1/n;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, LA1/n;->u:[LA1/n;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LA1/n;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LA1/n;
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [LA1/n;

    .line 3
    .line 4
    sget-object v1, LA1/n;->p:LA1/n;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LA1/n;->q:LA1/n;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LA1/n;->r:LA1/n;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LA1/n;->s:LA1/n;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, LA1/n;->t:LA1/n;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA1/n;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LA1/n;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LA1/n;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LA1/n;
    .locals 2

    .line 1
    sget-object v0, LA1/n;->u:[LA1/n;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [LA1/n;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LA1/n;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
