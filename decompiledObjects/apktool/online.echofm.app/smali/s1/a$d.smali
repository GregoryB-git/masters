.class public final enum Ls1/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum p:Ls1/a$d;

.field public static final synthetic q:[Ls1/a$d;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls1/a$d;

    .line 2
    .line 3
    const-string v1, "AES256_SIV"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, Ls1/a$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls1/a$d;->p:Ls1/a$d;

    .line 10
    .line 11
    invoke-static {}, Ls1/a$d;->c()[Ls1/a$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ls1/a$d;->q:[Ls1/a$d;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ls1/a$d;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c()[Ls1/a$d;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ls1/a$d;

    .line 3
    .line 4
    sget-object v1, Ls1/a$d;->p:Ls1/a$d;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls1/a$d;
    .locals 1

    .line 1
    const-class v0, Ls1/a$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls1/a$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ls1/a$d;
    .locals 1

    .line 1
    sget-object v0, Ls1/a$d;->q:[Ls1/a$d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ls1/a$d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ls1/a$d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public e()Lc3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/a$d;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lc3/m;->a(Ljava/lang/String;)Lc3/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
