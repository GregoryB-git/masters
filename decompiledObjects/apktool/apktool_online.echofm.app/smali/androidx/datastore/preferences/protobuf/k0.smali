.class public Landroidx/datastore/preferences/protobuf/k0;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x679fdd3b29a24eb3L


# instance fields
.field public final o:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/O;)V
    .locals 0

    const-string p1, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/k0;->o:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Landroidx/datastore/preferences/protobuf/z;
    .locals 2

    .line 1
    new-instance v0, Landroidx/datastore/preferences/protobuf/z;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/z;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
