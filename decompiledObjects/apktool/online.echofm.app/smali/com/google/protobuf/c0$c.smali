.class public Lcom/google/protobuf/c0$c;
.super Lcom/google/protobuf/c0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic p:Lcom/google/protobuf/c0;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/c0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/c0$c;->p:Lcom/google/protobuf/c0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/c0$g;-><init>(Lcom/google/protobuf/c0;Lcom/google/protobuf/c0$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/c0;Lcom/google/protobuf/c0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/c0$c;-><init>(Lcom/google/protobuf/c0;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/protobuf/c0$b;

    iget-object v1, p0, Lcom/google/protobuf/c0$c;->p:Lcom/google/protobuf/c0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/c0$b;-><init>(Lcom/google/protobuf/c0;Lcom/google/protobuf/c0$a;)V

    return-object v0
.end method
