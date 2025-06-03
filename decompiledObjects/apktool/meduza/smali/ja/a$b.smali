.class public final enum Lja/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lja/a$b;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lja/a$b;

.field public static final enum c:Lja/a$b;

.field public static final enum d:Lja/a$b;

.field public static final synthetic e:[Lja/a$b;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lja/a$b;

    const-string v1, "FIRST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lja/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lja/a$b;->b:Lja/a$b;

    new-instance v1, Lja/a$b;

    const-string v3, "LAST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lja/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lja/a$b;->c:Lja/a$b;

    new-instance v3, Lja/a$b;

    const-string v5, "UNRECOGNIZED"

    const/4 v6, 0x2

    const/4 v7, -0x1

    invoke-direct {v3, v5, v6, v7}, Lja/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lja/a$b;->d:Lja/a$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lja/a$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lja/a$b;->e:[Lja/a$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lja/a$b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lja/a$b;
    .locals 1

    const-class v0, Lja/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lja/a$b;

    return-object p0
.end method

.method public static values()[Lja/a$b;
    .locals 1

    sget-object v0, Lja/a$b;->e:[Lja/a$b;

    invoke-virtual {v0}, [Lja/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lja/a$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lja/a$b;->d:Lja/a$b;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lja/a$b;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
