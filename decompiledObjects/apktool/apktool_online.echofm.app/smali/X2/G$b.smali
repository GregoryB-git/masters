.class public abstract enum LX2/G$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LW2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "b"
.end annotation


# static fields
.field public static final enum o:LX2/G$b;

.field public static final enum p:LX2/G$b;

.field public static final synthetic q:[LX2/G$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LX2/G$b$a;

    .line 2
    .line 3
    const-string v1, "KEY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LX2/G$b$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LX2/G$b;->o:LX2/G$b;

    .line 10
    .line 11
    new-instance v0, LX2/G$b$b;

    .line 12
    .line 13
    const-string v1, "VALUE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LX2/G$b$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LX2/G$b;->p:LX2/G$b;

    .line 20
    .line 21
    invoke-static {}, LX2/G$b;->c()[LX2/G$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LX2/G$b;->q:[LX2/G$b;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILX2/F;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LX2/G$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[LX2/G$b;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LX2/G$b;

    .line 3
    .line 4
    sget-object v1, LX2/G$b;->o:LX2/G$b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LX2/G$b;->p:LX2/G$b;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX2/G$b;
    .locals 1

    .line 1
    const-class v0, LX2/G$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LX2/G$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LX2/G$b;
    .locals 1

    .line 1
    sget-object v0, LX2/G$b;->q:[LX2/G$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [LX2/G$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LX2/G$b;

    .line 8
    .line 9
    return-object v0
.end method
