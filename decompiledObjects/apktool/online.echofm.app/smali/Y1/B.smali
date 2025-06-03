.class public final enum LY1/B;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/B$a;
    }
.end annotation


# static fields
.field public static final p:LY1/B$a;

.field public static final enum q:LY1/B;

.field public static final enum r:LY1/B;

.field public static final synthetic s:[LY1/B;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LY1/B;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "facebook"

    .line 5
    .line 6
    const-string v3, "FACEBOOK"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LY1/B;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LY1/B;->q:LY1/B;

    .line 12
    .line 13
    new-instance v0, LY1/B;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "instagram"

    .line 17
    .line 18
    const-string v3, "INSTAGRAM"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LY1/B;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LY1/B;->r:LY1/B;

    .line 24
    .line 25
    invoke-static {}, LY1/B;->c()[LY1/B;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LY1/B;->s:[LY1/B;

    .line 30
    .line 31
    new-instance v0, LY1/B$a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, LY1/B$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, LY1/B;->p:LY1/B$a;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LY1/B;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LY1/B;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LY1/B;

    .line 3
    .line 4
    sget-object v1, LY1/B;->q:LY1/B;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LY1/B;->r:LY1/B;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY1/B;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LY1/B;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LY1/B;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LY1/B;
    .locals 2

    .line 1
    sget-object v0, LY1/B;->s:[LY1/B;

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
    check-cast v0, [LY1/B;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/B;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
