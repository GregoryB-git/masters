.class public final enum Lb1/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb1/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lb1/k$b;

.field public static final enum b:Lb1/k$b;

.field public static final enum c:Lb1/k$b;

.field public static final enum d:Lb1/k$b;

.field public static final enum e:Lb1/k$b;

.field public static final synthetic f:[Lb1/k$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lb1/k$b;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb1/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/k$b;->a:Lb1/k$b;

    new-instance v1, Lb1/k$b;

    const-string v3, "INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb1/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb1/k$b;->b:Lb1/k$b;

    new-instance v3, Lb1/k$b;

    const-string v5, "CREATED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lb1/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb1/k$b;->c:Lb1/k$b;

    new-instance v5, Lb1/k$b;

    const-string v7, "STARTED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lb1/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lb1/k$b;->d:Lb1/k$b;

    new-instance v7, Lb1/k$b;

    const-string v9, "RESUMED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lb1/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lb1/k$b;->e:Lb1/k$b;

    const/4 v9, 0x5

    new-array v9, v9, [Lb1/k$b;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lb1/k$b;->f:[Lb1/k$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb1/k$b;
    .locals 1

    const-class v0, Lb1/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb1/k$b;

    return-object p0
.end method

.method public static values()[Lb1/k$b;
    .locals 1

    sget-object v0, Lb1/k$b;->f:[Lb1/k$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb1/k$b;

    return-object v0
.end method


# virtual methods
.method public final f(Lb1/k$b;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
