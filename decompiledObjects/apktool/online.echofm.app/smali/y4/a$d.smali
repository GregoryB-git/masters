.class public final enum Ly4/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lm4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum p:Ly4/a$d;

.field public static final enum q:Ly4/a$d;

.field public static final enum r:Ly4/a$d;

.field public static final enum s:Ly4/a$d;

.field public static final synthetic t:[Ly4/a$d;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ly4/a$d;

    .line 2
    .line 3
    const-string v1, "UNKNOWN_OS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Ly4/a$d;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ly4/a$d;->p:Ly4/a$d;

    .line 10
    .line 11
    new-instance v1, Ly4/a$d;

    .line 12
    .line 13
    const-string v3, "ANDROID"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, Ly4/a$d;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ly4/a$d;->q:Ly4/a$d;

    .line 20
    .line 21
    new-instance v3, Ly4/a$d;

    .line 22
    .line 23
    const-string v5, "IOS"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6, v6}, Ly4/a$d;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Ly4/a$d;->r:Ly4/a$d;

    .line 30
    .line 31
    new-instance v5, Ly4/a$d;

    .line 32
    .line 33
    const-string v7, "WEB"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8, v8}, Ly4/a$d;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Ly4/a$d;->s:Ly4/a$d;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Ly4/a$d;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Ly4/a$d;->t:[Ly4/a$d;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ly4/a$d;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly4/a$d;
    .locals 1

    .line 1
    const-class v0, Ly4/a$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ly4/a$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ly4/a$d;
    .locals 1

    .line 1
    sget-object v0, Ly4/a$d;->t:[Ly4/a$d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ly4/a$d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ly4/a$d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Ly4/a$d;->o:I

    .line 2
    .line 3
    return v0
.end method
