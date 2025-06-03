.class public abstract Landroidx/datastore/preferences/protobuf/E;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/E$c;,
        Landroidx/datastore/preferences/protobuf/E$b;
    }
.end annotation


# static fields
.field public static final a:Landroidx/datastore/preferences/protobuf/E;

.field public static final b:Landroidx/datastore/preferences/protobuf/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/E$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/E$b;-><init>(Landroidx/datastore/preferences/protobuf/E$a;)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/E;->a:Landroidx/datastore/preferences/protobuf/E;

    new-instance v0, Landroidx/datastore/preferences/protobuf/E$c;

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/E$c;-><init>(Landroidx/datastore/preferences/protobuf/E$a;)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/E;->b:Landroidx/datastore/preferences/protobuf/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/E$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/E;-><init>()V

    return-void
.end method

.method public static a()Landroidx/datastore/preferences/protobuf/E;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/E;->a:Landroidx/datastore/preferences/protobuf/E;

    return-object v0
.end method

.method public static b()Landroidx/datastore/preferences/protobuf/E;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/E;->b:Landroidx/datastore/preferences/protobuf/E;

    return-object v0
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;J)V
.end method

.method public abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method public abstract e(Ljava/lang/Object;J)Ljava/util/List;
.end method
