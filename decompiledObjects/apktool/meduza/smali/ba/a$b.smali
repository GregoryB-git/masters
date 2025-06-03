.class public final enum Lba/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lba/a$b;",
        ">;",
        "Lb9/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lba/a$b;

.field public static final enum c:Lba/a$b;

.field public static final synthetic d:[Lba/a$b;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lba/a$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lba/a$b;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lba/a$b;

    const-string v3, "DATA_MESSAGE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lba/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lba/a$b;->b:Lba/a$b;

    new-instance v3, Lba/a$b;

    const-string v5, "TOPIC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lba/a$b;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lba/a$b;

    const-string v7, "DISPLAY_NOTIFICATION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lba/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lba/a$b;->c:Lba/a$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lba/a$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lba/a$b;->d:[Lba/a$b;

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

    iput p3, p0, Lba/a$b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lba/a$b;
    .locals 1

    const-class v0, Lba/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lba/a$b;

    return-object p0
.end method

.method public static values()[Lba/a$b;
    .locals 1

    sget-object v0, Lba/a$b;->d:[Lba/a$b;

    invoke-virtual {v0}, [Lba/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lba/a$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lba/a$b;->a:I

    return v0
.end method
