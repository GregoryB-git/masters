.class public final enum LD5/q$d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/q$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum o:LD5/q$d$a;

.field public static final enum p:LD5/q$d$a;

.field public static final enum q:LD5/q$d$a;

.field public static final synthetic r:[LD5/q$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD5/q$d$a;

    .line 2
    .line 3
    const-string v1, "TEXTURE_WITH_VIRTUAL_FALLBACK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LD5/q$d$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LD5/q$d$a;->o:LD5/q$d$a;

    .line 10
    .line 11
    new-instance v0, LD5/q$d$a;

    .line 12
    .line 13
    const-string v1, "TEXTURE_WITH_HYBRID_FALLBACK"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LD5/q$d$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LD5/q$d$a;->p:LD5/q$d$a;

    .line 20
    .line 21
    new-instance v0, LD5/q$d$a;

    .line 22
    .line 23
    const-string v1, "HYBRID_ONLY"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LD5/q$d$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LD5/q$d$a;->q:LD5/q$d$a;

    .line 30
    .line 31
    invoke-static {}, LD5/q$d$a;->c()[LD5/q$d$a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LD5/q$d$a;->r:[LD5/q$d$a;

    .line 36
    .line 37
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

.method public static synthetic c()[LD5/q$d$a;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [LD5/q$d$a;

    .line 3
    .line 4
    sget-object v1, LD5/q$d$a;->o:LD5/q$d$a;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LD5/q$d$a;->p:LD5/q$d$a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LD5/q$d$a;->q:LD5/q$d$a;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LD5/q$d$a;
    .locals 1

    .line 1
    const-class v0, LD5/q$d$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LD5/q$d$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LD5/q$d$a;
    .locals 1

    .line 1
    sget-object v0, LD5/q$d$a;->r:[LD5/q$d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [LD5/q$d$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LD5/q$d$a;

    .line 8
    .line 9
    return-object v0
.end method
