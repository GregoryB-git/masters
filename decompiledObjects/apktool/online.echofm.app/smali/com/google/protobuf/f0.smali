.class public Lcom/google/protobuf/f0;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x679fdd3b29a24eb3L


# instance fields
.field public final o:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/K;)V
    .locals 0

    const-string p1, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/protobuf/f0;->o:Ljava/util/List;

    return-void
.end method
