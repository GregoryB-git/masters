.class public final enum Landroidx/datastore/preferences/protobuf/s0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum o:Landroidx/datastore/preferences/protobuf/s0$a;

.field public static final enum p:Landroidx/datastore/preferences/protobuf/s0$a;

.field public static final synthetic q:[Landroidx/datastore/preferences/protobuf/s0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/datastore/preferences/protobuf/s0$a;

    const-string v1, "ASCENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/s0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/s0$a;->o:Landroidx/datastore/preferences/protobuf/s0$a;

    new-instance v1, Landroidx/datastore/preferences/protobuf/s0$a;

    const-string v3, "DESCENDING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/datastore/preferences/protobuf/s0$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/datastore/preferences/protobuf/s0$a;->p:Landroidx/datastore/preferences/protobuf/s0$a;

    const/4 v3, 0x2

    new-array v3, v3, [Landroidx/datastore/preferences/protobuf/s0$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Landroidx/datastore/preferences/protobuf/s0$a;->q:[Landroidx/datastore/preferences/protobuf/s0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/s0$a;
    .locals 1

    const-class v0, Landroidx/datastore/preferences/protobuf/s0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/s0$a;

    return-object p0
.end method

.method public static values()[Landroidx/datastore/preferences/protobuf/s0$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/s0$a;->q:[Landroidx/datastore/preferences/protobuf/s0$a;

    invoke-virtual {v0}, [Landroidx/datastore/preferences/protobuf/s0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/datastore/preferences/protobuf/s0$a;

    return-object v0
.end method
