.class public final synthetic Lz4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/t$c;


# instance fields
.field public final synthetic a:Lz4/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lz4/f;Lz4/h$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/e;->a:Lz4/f;

    iput-object p2, p0, Lz4/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lz4/t;Lv3/r1;)V
    .locals 1

    iget-object p1, p0, Lz4/e;->a:Lz4/f;

    iget-object v0, p0, Lz4/e;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0, p2}, Lz4/f;->A(Ljava/lang/Object;Lv3/r1;)V

    return-void
.end method
