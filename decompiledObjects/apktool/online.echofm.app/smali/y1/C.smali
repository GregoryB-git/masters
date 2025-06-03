.class public final enum Ly1/C;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum o:Ly1/C;

.field public static final enum p:Ly1/C;

.field public static final enum q:Ly1/C;

.field public static final enum r:Ly1/C;

.field public static final enum s:Ly1/C;

.field public static final enum t:Ly1/C;

.field public static final synthetic u:[Ly1/C;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly1/C;

    .line 2
    .line 3
    const-string v1, "EXPLICIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ly1/C;->o:Ly1/C;

    .line 10
    .line 11
    new-instance v0, Ly1/C;

    .line 12
    .line 13
    const-string v1, "TIMER"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ly1/C;->p:Ly1/C;

    .line 20
    .line 21
    new-instance v0, Ly1/C;

    .line 22
    .line 23
    const-string v1, "SESSION_CHANGE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ly1/C;->q:Ly1/C;

    .line 30
    .line 31
    new-instance v0, Ly1/C;

    .line 32
    .line 33
    const-string v1, "PERSISTED_EVENTS"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ly1/C;->r:Ly1/C;

    .line 40
    .line 41
    new-instance v0, Ly1/C;

    .line 42
    .line 43
    const-string v1, "EVENT_THRESHOLD"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ly1/C;->s:Ly1/C;

    .line 50
    .line 51
    new-instance v0, Ly1/C;

    .line 52
    .line 53
    const-string v1, "EAGER_FLUSHING_EVENT"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Ly1/C;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ly1/C;->t:Ly1/C;

    .line 60
    .line 61
    invoke-static {}, Ly1/C;->c()[Ly1/C;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Ly1/C;->u:[Ly1/C;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c()[Ly1/C;
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Ly1/C;

    .line 3
    .line 4
    sget-object v1, Ly1/C;->o:Ly1/C;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Ly1/C;->p:Ly1/C;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Ly1/C;->q:Ly1/C;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Ly1/C;->r:Ly1/C;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Ly1/C;->s:Ly1/C;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    sget-object v1, Ly1/C;->t:Ly1/C;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly1/C;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Ly1/C;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ly1/C;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[Ly1/C;
    .locals 2

    .line 1
    sget-object v0, Ly1/C;->u:[Ly1/C;

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
    check-cast v0, [Ly1/C;

    .line 9
    .line 10
    return-object v0
.end method
