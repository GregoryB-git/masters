.class public final enum LI1/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum p:LI1/e$a;

.field public static final enum q:LI1/e$a;

.field public static final synthetic r:[LI1/e$a;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LI1/e$a;

    .line 2
    .line 3
    const-string v1, "MOBILE_APP_INSTALL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, LI1/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LI1/e$a;->p:LI1/e$a;

    .line 10
    .line 11
    new-instance v0, LI1/e$a;

    .line 12
    .line 13
    const-string v1, "CUSTOM_APP_EVENTS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, LI1/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LI1/e$a;->q:LI1/e$a;

    .line 20
    .line 21
    invoke-static {}, LI1/e$a;->c()[LI1/e$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LI1/e$a;->r:[LI1/e$a;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LI1/e$a;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LI1/e$a;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LI1/e$a;

    .line 3
    .line 4
    sget-object v1, LI1/e$a;->p:LI1/e$a;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LI1/e$a;->q:LI1/e$a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LI1/e$a;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LI1/e$a;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LI1/e$a;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LI1/e$a;
    .locals 2

    .line 1
    sget-object v0, LI1/e$a;->r:[LI1/e$a;

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
    check-cast v0, [LI1/e$a;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI1/e$a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
