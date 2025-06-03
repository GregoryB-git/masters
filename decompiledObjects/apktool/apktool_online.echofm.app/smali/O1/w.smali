.class public final enum LO1/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LO1/w;

.field public static final enum q:LO1/w;

.field public static final synthetic r:[LO1/w;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LO1/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "context_choose"

    .line 5
    .line 6
    const-string v3, "ContextChoose"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LO1/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LO1/w;->p:LO1/w;

    .line 12
    .line 13
    new-instance v0, LO1/w;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "join_tournament"

    .line 17
    .line 18
    const-string v3, "JoinTournament"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LO1/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LO1/w;->q:LO1/w;

    .line 24
    .line 25
    invoke-static {}, LO1/w;->c()[LO1/w;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LO1/w;->r:[LO1/w;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LO1/w;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LO1/w;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LO1/w;

    .line 3
    .line 4
    sget-object v1, LO1/w;->p:LO1/w;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LO1/w;->q:LO1/w;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO1/w;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LO1/w;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LO1/w;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LO1/w;
    .locals 2

    .line 1
    sget-object v0, LO1/w;->r:[LO1/w;

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
    check-cast v0, [LO1/w;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/w;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
