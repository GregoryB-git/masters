.class public final enum Lka/b0$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lka/b0$b;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lka/b0$b;

.field public static final enum c:Lka/b0$b;

.field public static final enum d:Lka/b0$b;

.field public static final enum e:Lka/b0$b;

.field public static final enum f:Lka/b0$b;

.field public static final enum o:Lka/b0$b;

.field public static final synthetic p:[Lka/b0$b;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lka/b0$b;

    const-string v1, "NO_CHANGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lka/b0$b;->b:Lka/b0$b;

    new-instance v1, Lka/b0$b;

    const-string v3, "ADD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lka/b0$b;->c:Lka/b0$b;

    new-instance v3, Lka/b0$b;

    const-string v5, "REMOVE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lka/b0$b;->d:Lka/b0$b;

    new-instance v5, Lka/b0$b;

    const-string v7, "CURRENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lka/b0$b;->e:Lka/b0$b;

    new-instance v7, Lka/b0$b;

    const-string v9, "RESET"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lka/b0$b;->f:Lka/b0$b;

    new-instance v9, Lka/b0$b;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lka/b0$b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lka/b0$b;->o:Lka/b0$b;

    const/4 v11, 0x6

    new-array v11, v11, [Lka/b0$b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lka/b0$b;->p:[Lka/b0$b;

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

    iput p3, p0, Lka/b0$b;->a:I

    return-void
.end method

.method public static f(I)Lka/b0$b;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lka/b0$b;->f:Lka/b0$b;

    return-object p0

    :cond_1
    sget-object p0, Lka/b0$b;->e:Lka/b0$b;

    return-object p0

    :cond_2
    sget-object p0, Lka/b0$b;->d:Lka/b0$b;

    return-object p0

    :cond_3
    sget-object p0, Lka/b0$b;->c:Lka/b0$b;

    return-object p0

    :cond_4
    sget-object p0, Lka/b0$b;->b:Lka/b0$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lka/b0$b;
    .locals 1

    const-class v0, Lka/b0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/b0$b;

    return-object p0
.end method

.method public static values()[Lka/b0$b;
    .locals 1

    sget-object v0, Lka/b0$b;->p:[Lka/b0$b;

    invoke-virtual {v0}, [Lka/b0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/b0$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lka/b0$b;->o:Lka/b0$b;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lka/b0$b;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
