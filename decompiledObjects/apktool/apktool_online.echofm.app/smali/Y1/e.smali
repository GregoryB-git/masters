.class public final enum LY1/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LY1/e;

.field public static final enum q:LY1/e;

.field public static final enum r:LY1/e;

.field public static final enum s:LY1/e;

.field public static final synthetic t:[LY1/e;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LY1/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "NONE"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, LY1/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LY1/e;->p:LY1/e;

    .line 11
    .line 12
    new-instance v0, LY1/e;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const-string v2, "only_me"

    .line 16
    .line 17
    const-string v3, "ONLY_ME"

    .line 18
    .line 19
    invoke-direct {v0, v3, v1, v2}, LY1/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LY1/e;->q:LY1/e;

    .line 23
    .line 24
    new-instance v0, LY1/e;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const-string v2, "friends"

    .line 28
    .line 29
    const-string v3, "FRIENDS"

    .line 30
    .line 31
    invoke-direct {v0, v3, v1, v2}, LY1/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LY1/e;->r:LY1/e;

    .line 35
    .line 36
    new-instance v0, LY1/e;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    const-string v2, "everyone"

    .line 40
    .line 41
    const-string v3, "EVERYONE"

    .line 42
    .line 43
    invoke-direct {v0, v3, v1, v2}, LY1/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LY1/e;->s:LY1/e;

    .line 47
    .line 48
    invoke-static {}, LY1/e;->c()[LY1/e;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, LY1/e;->t:[LY1/e;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LY1/e;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LY1/e;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [LY1/e;

    .line 3
    .line 4
    sget-object v1, LY1/e;->p:LY1/e;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LY1/e;->q:LY1/e;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LY1/e;->r:LY1/e;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LY1/e;->s:LY1/e;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY1/e;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LY1/e;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LY1/e;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LY1/e;
    .locals 2

    .line 1
    sget-object v0, LY1/e;->t:[LY1/e;

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
    check-cast v0, [LY1/e;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/e;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
