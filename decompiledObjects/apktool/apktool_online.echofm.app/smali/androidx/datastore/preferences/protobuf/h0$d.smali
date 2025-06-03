.class public abstract Landroidx/datastore/preferences/protobuf/h0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Ljava/util/Iterator;

.field public static final b:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/h0$d$a;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/h0$d$a;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/h0$d;->a:Ljava/util/Iterator;

    new-instance v0, Landroidx/datastore/preferences/protobuf/h0$d$b;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/h0$d$b;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/h0$d;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static synthetic a()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/h0$d;->a:Ljava/util/Iterator;

    return-object v0
.end method

.method public static b()Ljava/lang/Iterable;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/h0$d;->b:Ljava/lang/Iterable;

    return-object v0
.end method
